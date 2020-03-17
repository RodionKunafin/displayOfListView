package com.example.listview411;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends AppCompatActivity {

SimpleAdapter simpleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);


        simpleAdapter = new SimpleAdapter(this,Source.data,R.layout.item_simple,
                new String[]{Source.KEY1,Source.KEY2,Source.KEY3},new int[]{R.id.nameTv,R.id.placeTv,R.id.infoTv});



        listView.setAdapter(simpleAdapter);
    }
}
