package com.jana.check;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler extends RecyclerView.Adapter<Recycler.MyHolder> {

    ArrayList<String> contacts = new ArrayList<>();
    Context context;

    public Recycler(ArrayList<String> contacts, Context context) {
        this.contacts = contacts;
        this.context = context;
    }

    @NonNull
    @Override
    public Recycler.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contect_card, parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Recycler.MyHolder holder, int position) {
        holder.name.setText(contacts.get(position));

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView name, number;
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            number = itemView.findViewById(R.id.contact);
        }
    }
}
