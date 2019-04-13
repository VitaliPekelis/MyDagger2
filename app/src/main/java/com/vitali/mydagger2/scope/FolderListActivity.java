package com.vitali.mydagger2.scope;

import android.content.Intent;
import android.os.Bundle;

import com.vitali.mydagger2.App;
import com.vitali.mydagger2.R;

import java.util.List;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class FolderListActivity extends AppCompatActivity implements FolderListActivityView, ItemAdapter.IOnItemClickListener {

    @Inject
    public FolderListActivityPresenter presenter;

    private ItemAdapter adapter;

    @Inject
    public void setView()
    {
        presenter.setView(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        App.getInstance().getMailComponent().createFolderListActivityComponent().injectFoldersListActivity(this);

        setContentView(R.layout.activity_folder_list);
        setTitle(FolderListActivity.class.getSimpleName());

        RecyclerView foldersListView = findViewById(R.id.foldersList);
        adapter = new ItemAdapter(null);
        adapter.setOnItemClickListener(this);
        foldersListView.setAdapter(adapter);

        presenter.loadFolders();
    }

    @Override
    protected void onDestroy() {
        App.getInstance().releaseMailComponent();
        super.onDestroy();
    }

    @Override
    public void onItemClick(MailItem item) {
        Intent intent = new Intent(this, LetterListActivity.class);
        intent.putExtra("folder", (Folder)item);
        startActivity(intent);
    }


    @Override
    public void showFolders(List<Folder> folders) {
        adapter.clean();
        adapter.setData(folders);
        adapter.notifyDataSetChanged();
    }
}
