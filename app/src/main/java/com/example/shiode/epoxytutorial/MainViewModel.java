package com.example.shiode.epoxytutorial;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {
    public MutableLiveData<List<Item>> list = new MutableLiveData<>();

    public MainViewModel() {
        List<Item> data = new ArrayList<>();
        data.add(new Item("aaa"));
        data.add(new Item("bbb"));
        data.add(new Item("ccc"));

        list.postValue(data);
    }
}
