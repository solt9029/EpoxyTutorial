package com.example.shiode.epoxytutorial;

import com.airbnb.epoxy.TypedEpoxyController;

import java.util.List;

public class MainController extends TypedEpoxyController<List<Item>> {
    @Override
    public void buildModels(List<Item> list) {
        int index = 0;
        for (Item item : list) {
            new ItemBindingModel_().item(item).id(index).addTo(this);
            index++;
        }
    }
}
