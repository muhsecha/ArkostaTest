package com.example.arkostatest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterKost adapter;
    private ArrayList<ModelKost> kostArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvkost);
        adapter = new AdapterKost(kostArrayList);
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        kostArrayList = new ArrayList<>();
        kostArrayList.add(new ModelKost("Campur", "4.7", "Kost Perumahan Indah","Tersisa 3 Kamar","Jl. Malboro Utara","Rp. 1.400.000/","Bulan"));
        kostArrayList.add(new ModelKost("Putri", "5.0", "Kost Ratu Cantika Permata","Tersisa 4 Kamar","Jl. Ring Road","Rp. 1.200.000/","Bulan"));
        kostArrayList.add(new ModelKost("Putra", "4.5", "Kost Superman","Tersisa 2 Kamar","Jl. Pemuda Pemudi","Rp. 1.000.000/","Bulan"));
    }
}