package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
TextView textView;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        textView=findViewById(R.id.textView1);
        imageView=findViewById(R.id.imageView);
        Intent i=getIntent();
        String s=i.getStringExtra("data");
        int i1=i.getIntExtra("img",1);
        textView.setText(s);
        imageView.setImageResource(i1);

    }
}