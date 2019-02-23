package com.example.shiode.epoxytutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    MainController controller = new MainController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Item> list = new ArrayList<>();
        list.add(new Item("aaa"));
        list.add(new Item("bbb"));
        list.add(new Item("ccc"));

        // TODO: should use data binding here.
        ((RecyclerView)findViewById(R.id.recyclerView)).setAdapter(controller.getAdapter());
        controller.setData(list);
    }
}
