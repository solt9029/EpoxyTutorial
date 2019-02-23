package com.example.shiode.epoxytutorial;

import com.airbnb.epoxy.Typed2EpoxyController;

import java.util.List;

public class MainController extends Typed2EpoxyController<List<Item>, Boolean> {
    @Override
    public void buildModels(List<Item> list, Boolean isLoading) {
        int index = 0;
        for (Item item : list) {
            new ItemBindingModel_().item(item).id(index).addTo(this);
            index++;
        }

        if (isLoading) {
            new ProgressBarBindingModel_().id(1).addTo(this);
        }
    }
}
