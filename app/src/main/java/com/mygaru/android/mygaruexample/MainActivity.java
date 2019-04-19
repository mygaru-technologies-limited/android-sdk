package com.mygaru.android.mygaruexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mygaru.android.sdk.MyGaru;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvMain = (ListView) findViewById(R.id.menu_list);
        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        MyGaru.client().displayDashboard();
                        break;
                    case 1:
                        MyGaru.client().displayAuthorization();
                        break;
                    case 2:

                        Map<String, String> map = new HashMap<>();
                        map.put("main_screen", "send_data_on_click");
                        map.put("date", "" + System.currentTimeMillis() / 1000);
                        map.put("some_value", "hello from example app");
                        MyGaru.client().sendData("example_android_app_event", map);

                        break;
                }
            }
        });
        String[] items = {
                "Display Dashboard",
                "Display Authorization",
                "Send my DATA"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);

        lvMain.setAdapter(adapter);

    }
}
