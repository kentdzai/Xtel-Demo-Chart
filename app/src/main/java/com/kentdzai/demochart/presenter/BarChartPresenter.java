package com.kentdzai.demochart.presenter;

import com.github.mikephil.charting.data.BarDataSet;
import com.kentdzai.demochart.model.BarChartHelper;
import com.kentdzai.demochart.model.OnBarChartResult;
import com.kentdzai.demochart.view.BarChartView;

import java.util.ArrayList;

/**
 * Created by kentd on 30/12/2016.
 */

public class BarChartPresenter implements OnBarChartResult {

    BarChartHelper model;
    BarChartView view;

    public BarChartPresenter(BarChartHelper model, BarChartView view) {
        this.model = model;
        this.view = view;
        this.model.setOnBarChartResult(this);
    }

    public void getData() {
        model.getBarChartResult();
    }

    @Override
    public void onLoadBarChartSuccess(ArrayList<String> arrXA, ArrayList<BarDataSet> arrBDS) {
        if (view != null) {
            view.displayBarChart(arrXA, arrBDS);
        }
    }
}
