package com.nuedevlop.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private LinkedList<String> listItem;
    private LayoutInflater layout;

    public ListAdapter(Context context,LinkedList<String> linkedList){
        this.layout=LayoutInflater.from(context);
        this.listItem=linkedList;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layout.inflate(R.layout.list_item,parent,false);
        return new ListViewHolder(view,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        String item = listItem.get(position);
        holder.txtItem.setText(item);
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder{
        final ListAdapter listAdapter;
        TextView txtItem;

        ListViewHolder(View itemView,ListAdapter adapter){
            super(itemView);
            this.listAdapter = adapter;
            txtItem = itemView.findViewById(R.id.txtItem);

        }

    }

}
