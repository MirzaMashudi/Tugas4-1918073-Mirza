package com.example.tugasrumah4_recycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ApplAdapter adapter;
    private ArrayList<Appl> itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        adapter = new ApplAdapter(itemArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new Appl("Sosial Media","Facebook; Penggunaan : 399 Mb",R.drawable.facebook));
        itemArrayList.add(new Appl("Komunikasi","Whatsapp; Penggunaan : 450 Mb",R.drawable.whatsapp));
        itemArrayList.add(new Appl("Sosial Media","Instagram; Penggunaan : 467 Mb",R.drawable.instagram));
    }
}