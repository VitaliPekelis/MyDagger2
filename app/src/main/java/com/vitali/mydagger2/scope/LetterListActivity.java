package com.vitali.mydagger2.scope;

import android.os.Bundle;

import com.vitali.mydagger2.App;
import com.vitali.mydagger2.R;

import java.util.List;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class LetterListActivity extends AppCompatActivity implements LetterListActivityView,
        ItemAdapter.IOnItemClickListener {

    @Inject
    public LetterListActivityPresenter presenter;

    private ItemAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Folder folder = (Folder) getIntent().getSerializableExtra("folder");

        App.getInstance().getMailComponent()
                .createLatterListActivityComponent(new LetterListModule(folder))
                .injectLettersListActivity(this);

        setContentView(R.layout.activity_letter_list);
        setTitle(LetterListActivity.class.getSimpleName());
        presenter.setView(this);

        recyclerView = findViewById(R.id.letters_list_rv);
        adapter = new ItemAdapter(null);
        adapter.setOnItemClickListener(this);
        recyclerView.setAdapter(adapter);

        presenter.loadLetters();
    }

    @Override
    public void showLetters(List<Letter> letters) {
        adapter.clean();
        adapter.setData(letters);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(MailItem item) {
        //do nothing
    }
}
