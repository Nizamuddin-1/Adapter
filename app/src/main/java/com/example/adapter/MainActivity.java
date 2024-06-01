package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
ArrayList<String> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        arrayList.add("Nizamuddin");
        arrayList.add("Shamsuddin");
        arrayList.add("Shaziya");
        arrayList.add("Parveen");
        arrayList.add("Shahzade Ali");
        arrayList.add("Nizamuddin");
        arrayList.add("Shamsuddin");
        arrayList.add("Shaziya");
        arrayList.add("Parveen");
        arrayList.add("Shahzade Ali");
        arrayList.add("Nizamuddin");
        arrayList.add("Shamsuddin");
        arrayList.add("Shaziya");
        arrayList.add("Parveen");
        arrayList.add("Shahzade Ali");
        arrayList.add("Nizamuddin");
        arrayList.add("Shamsuddin");
        arrayList.add("Shaziya");
        arrayList.add("Parveen");
        arrayList.add("Shahzade Ali");
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
    }
}