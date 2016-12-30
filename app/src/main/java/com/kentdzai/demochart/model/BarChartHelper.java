package com.kentdzai.demochart.model;

import android.graphics.Color;
import android.util.Log;

import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

/**
 * Created by kentd on 29/12/2016.
 */

public class BarChartHelper {
    ArrayList<String> arrXA;
    ArrayList<BarDataSet> arrBDS;
    OnBarChartResult onBarChartResult;

    public BarChartHelper(ArrayList<String> arrXA, ArrayList<BarDataSet> arrBDS) {
        this.arrXA = arrXA;
        this.arrBDS = arrBDS;
    }

    public void setOnBarChartResult(OnBarChartResult onBarChartResult) {
        this.onBarChartResult = onBarChartResult;
    }

    public void getBarChartResult() {
        if (onBarChartResult != null) {
            getBarXAxisValues();
            getBarDataSet();
            onBarChartResult.onLoadBarChartSuccess(arrXA, arrBDS);
        }
    }

    private void getBarXAxisValues() {
        arrXA = new ArrayList<>();
        arrXA.add("JAN");
        arrXA.add("FEB");
        arrXA.add("MAR");
        arrXA.add("APR");
        arrXA.add("MAY");
        arrXA.add("JUN");
    }

    private void getBarDataSet() {
        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        valueSet1.add(new BarEntry(110.000f, 0));   // Jan
        valueSet1.add(new BarEntry(40.000f, 1));    // Feb
        valueSet1.add(new BarEntry(60.000f, 2));    // Mar
        valueSet1.add(new BarEntry(30.000f, 3));    // Apr
        valueSet1.add(new BarEntry(90.000f, 4));    // May
        valueSet1.add(new BarEntry(100.000f, 5));   // Jun

        ArrayList<BarEntry> valueSet2 = new ArrayList<>();
        BarEntry v2e1 = new BarEntry(150.000f, 0); // Jan
        valueSet2.add(v2e1);
        BarEntry v2e2 = new BarEntry(90.000f, 1); // Feb
        valueSet2.add(v2e2);
        BarEntry v2e3 = new BarEntry(120.000f, 2); // Mar
        valueSet2.add(v2e3);
        BarEntry v2e4 = new BarEntry(60.000f, 3); // Apr
        valueSet2.add(v2e4);
        BarEntry v2e5 = new BarEntry(20.000f, 4); // May
        valueSet2.add(v2e5);
        BarEntry v2e6 = new BarEntry(80.000f, 5); // Jun
        valueSet2.add(v2e6);

        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Brand 1");
        barDataSet1.setColor(Color.rgb(0, 155, 0));
        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Brand 2");
        barDataSet2.setColors(new int[]{Color.rgb(45, 103, 196)});

        arrBDS = new ArrayList<>();
        arrBDS.add(barDataSet1);
        arrBDS.add(barDataSet2);
    }
}
