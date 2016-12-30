package com.kentdzai.demochart.view;

import com.github.mikephil.charting.data.BarDataSet;

import java.util.ArrayList;

/**
 * Created by kentd on 30/12/2016.
 */

public interface BarChartView {
    void displayBarChart(ArrayList<String> arrXA, ArrayList<BarDataSet> arrBDS);
}
