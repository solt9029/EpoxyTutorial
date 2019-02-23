package com.example.shiode.epoxytutorial;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.shiode.epoxytutorial.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MainController controller = new MainController();
    private ActivityMainBinding binding;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setAdapter(controller.getAdapter());
        binding.setViewModel(viewModel);

        viewModel.list.observe(this, new Observer<List<Item>>() {
            @Override
            public void onChanged(@Nullable List<Item> list) {
                controller.setData(list, true);
            }
        });
    }
}
