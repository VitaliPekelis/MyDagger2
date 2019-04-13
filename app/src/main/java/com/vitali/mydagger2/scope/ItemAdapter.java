package com.vitali.mydagger2.scope;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private List<? extends MailItem> data;

    private IOnItemClickListener iOnItemClickListener;

    public ItemAdapter(ArrayList<MailItem> data) {
        this.data = data;
    }

    public void setOnItemClickListener(IOnItemClickListener iOnItemClickListener) {
        this.iOnItemClickListener = iOnItemClickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1,
                parent,
                false);

        return new ItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemViewHolder h = (ItemViewHolder) holder;
        final MailItem item = data.get(holder.getAdapterPosition());
        h.bind(item, iOnItemClickListener);
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public void setData(List<? extends MailItem> data) {
        this.data = data;
    }

    public void clean() {
        if(data != null && !data.isEmpty())
            data.clear();
    }

    private static class ItemViewHolder extends RecyclerView.ViewHolder
    {
        TextView one;

        ItemViewHolder(@NonNull View v) {
            super(v);
            one = v.findViewById(android.R.id.text1);
        }

        void bind(final MailItem data, final IOnItemClickListener iOnItemClickListener) {
            one.setText(data.toString());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(iOnItemClickListener!=null){
                        iOnItemClickListener.onItemClick(data);
                    }
                }
            });
        }
    }

    public interface IOnItemClickListener
    {
        void onItemClick(MailItem item);
    }

}
