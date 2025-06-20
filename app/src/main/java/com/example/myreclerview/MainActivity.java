package com.example.recyclerviewlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager; // Import this
import androidx.recyclerview.widget.RecyclerView; // Import this

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String[] myDataset = {"Apple", "Banana", "Orange", "Grape", "Strawberry", "Mango", "Pineapple", "Kiwi", "Blueberry", "Raspberry", "Lemon", "Lime", "Cherry", "Peach", "Plum"};

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a reference to your RecyclerView
        recyclerView = findViewById(R.id.myRecyclerView);

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // Set a LayoutManager (e.g., LinearLayoutManager for a vertical list)
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Create an instance of your MyAdapter, passing your dataset
        myAdapter = new MyAdapter(myDataset);

        // Set the Adapter for the RecyclerView
        recyclerView.setAdapter(myAdapter);
    }
}