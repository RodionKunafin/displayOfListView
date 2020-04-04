package com.example.listview411;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    private List<Map<String, String>> prepareContent() {
        String[] strings = getString(R.string.large_text).split("\n");
        List<Map<String, String>> list = new ArrayList<>();
        for (String string : strings) {
            Map<String, String> firstMap = new HashMap<>();
            firstMap.put("left", String.valueOf(string.length()));
            firstMap.put("right", string);
            list.add(firstMap);
        }
        return list;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);


        List<Map<String, String>> values = prepareContent();
        String[] from = {"left", "right"};
        int[] to = {R.id.left_text, R.id.right_text};

        BaseAdapter listContentAdapter = new SimpleAdapter(this, values, R.layout.item_simple, from, to);
        listView.setAdapter(listContentAdapter);

    }
}
