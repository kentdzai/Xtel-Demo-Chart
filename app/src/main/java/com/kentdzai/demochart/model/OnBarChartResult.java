package com.kentdzai.demochart.model;

import com.github.mikephil.charting.data.BarDataSet;

import java.util.ArrayList;

/**
 * Created by kentd on 30/12/2016.
 */

public interface OnBarChartResult {
    void onLoadBarChartSuccess(ArrayList<String> arrXA, ArrayList<BarDataSet> arrBDS);
}
