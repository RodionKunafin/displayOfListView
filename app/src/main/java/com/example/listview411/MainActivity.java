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

SimpleAdapter listContentAdapter;

    private List<Map<String, String>> prepareContent() {
        String[] strings = getString(R.string.large_text).split("\n");
        List<Map<String, String>> list = new ArrayList<>();
        for (String string : strings) {
            Map<String, String> firstMap = new HashMap<>();
            firstMap.put("left", "Император Человечества");
            firstMap.put("right", "Вот уже более ста веков Император неподвижно восседает на" +
                    " Золотом Троне Земли. По воле богов он является Повелителем Человечества" +
                            " и правит миллионом миров благодаря мощи своих неисчислимых армий. " +
                            "Он — гниющий полутруп, чьи незримые муки продлеваются загадочными " +
                            "устройствами Тёмной Эры Технологий. Он — Разлагающийся Властелин " +
                            "Империума, которому каждый день приносят в жертву тысячу душ, " +
                            "чью кровь он пьёт и поедает плоть. На людской крови и плоти зиждется сам Империум");
            list.add(firstMap);

            Map<String, String> secondMap = new HashMap<>();
            secondMap.put("left", "Товарищ Абаддон");
            secondMap.put("right", "Абаддо́н Разоритель — Воитель Хаоса, командующий Чёрного Легиона, " +
                    "неформальный лидер, объединяющий всех космодесантников Хаоса и последователей " +
                    "Губительных Сил против Империума Человечества, в целостности свержение Императора" +
                    " Человечества и власти Терры, и по обстоятельству, месть за павшего примарха " +
                    "Хоруса Луперкаля. Организует Чёрные крестовые походы, последний из которых —" +
                    " 13-й. Ключевой целью постепенных и продвигающихся атак является захват Терры.");
            list.add(secondMap);
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

        BaseAdapter listContentAdapter = new SimpleAdapter(this, values, R.layout.item_simple,from,to);
        listView.setAdapter(listContentAdapter);

    }
}
