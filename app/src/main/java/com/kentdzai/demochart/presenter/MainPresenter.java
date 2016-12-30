package com.kentdzai.demochart.presenter;

import com.kentdzai.demochart.model.MainHelper;
import com.kentdzai.demochart.model.OnMainResult;
import com.kentdzai.demochart.view.MainView;

import java.util.ArrayList;

/**
 * Created by kentd on 29/12/2016.
 */

public class MainPresenter implements OnMainResult {
    MainHelper model;
    MainView view;

    public MainPresenter(MainHelper model, MainView view) {
        this.model = model;
        this.view = view;
        this.model.setOnMainResult(this);
    }

    public void getData() {
        model.chartList();
    }

    @Override
    public void onMainResultSucces(ArrayList<String> arrC) {
        view.displayChart(arrC);
    }
}
