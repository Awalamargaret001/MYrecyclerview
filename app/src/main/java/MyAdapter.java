package com.example.recyclerviewlab; // Your package name

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private String[] mDataset;

    // Constructor to pass the dataset to the adapter
    public MyAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    // Called when RecyclerView needs a new ViewHolder of the given type.
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_layout, parent, false); // IMPORTANT: Use your item layout file here

        return new MyViewHolder(view);
    }

    // Called by RecyclerView to display the data at the specified position.
    // This method updates the contents of the ViewHolder to reflect the item at the given position.
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // Get element from your dataset at this position and set it to the TextView
        holder.itemTextView.setText(mDataset[position]);
    }

    // Returns the total number of items in the data set held by the adapter.
    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    /**
     * Provides a reference to the views for each data item.
     * This allows us to cache the views for improved performance.
     */
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView itemTextView; // Reference to the TextView in your item layout

        public MyViewHolder(View itemView) {
            super(itemView);
            itemTextView = itemView.findViewById(R.id.itemTextView); // IMPORTANT: Use the ID of your TextView in list_item_layout.xml
        }
    }
}