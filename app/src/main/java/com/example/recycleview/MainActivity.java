package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    String noms[];
    int images[]={R.drawable.ensi, R.drawable.enis, R.drawable.enit, R.drawable.enetcom, R.drawable.eniso, R.drawable.supcom};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        noms=getResources().getStringArray(R.array.nomEcoles);
        rv=findViewById(R.id.monRecycler);
        MyAdapter adapter = new MyAdapter(this,noms,images);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}