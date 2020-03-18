package com.example.listview411;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

SimpleAdapter simpleAdapter;

    private List<Map<String, String>> prepareContent() {
        String[] strings = getString(R.string.large_text).split("\n");
        List<Map<String, String>> list = new ArrayList<>();
        for (String string : strings) {
            Map<String, String> map = new HashMap<>();
            map.put("Заголовок", string);
            map.put("Подзаголовок", String.valueOf(string.length()));
            list.add(map);
        }
        return list;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);

        List<Map<String, String>> values = prepareContent();
        String[] from = {Source.KEY1, Source.KEY3};
        int[] to = {R.id.nameTv, R.id.infoTv};

        BaseAdapter listContentAdapter = new SimpleAdapter(this, values, R.layout.item_simple,from,to);
        listView.setAdapter(listContentAdapter);

    }
}
