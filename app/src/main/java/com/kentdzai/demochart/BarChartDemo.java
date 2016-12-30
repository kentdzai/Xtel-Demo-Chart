package com.kentdzai.demochart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.kentdzai.demochart.model.BarChartHelper;
import com.kentdzai.demochart.presenter.BarChartPresenter;
import com.kentdzai.demochart.view.BarChartView;

import java.util.ArrayList;

public class BarChartDemo extends AppCompatActivity implements BarChartView {
    BarData barData;
    BarChart barChart;
    BarChartHelper model;
    BarChartPresenter presenter;
    ArrayList<String> arrXA;
    ArrayList<BarDataSet> arrBDS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);
        init();
    }

    private void init() {
        barChart = (com.github.mikephil.charting.charts.BarChart) findViewById(R.id.barChart);
        if (model == null) {
            model = new BarChartHelper(arrXA, arrBDS);
            if (presenter == null) {
                presenter = new BarChartPresenter(model, this);
                presenter.getData();
            }
        }
    }


    @Override
    public void displayBarChart(ArrayList<String> arrXA, ArrayList<BarDataSet> arrBDS) {
        this.arrXA = arrXA;
        this.arrBDS = arrBDS;
        Log.e("MY_TAG", arrXA.size() + "asd");
        barData = new BarData(arrXA, arrBDS);
        barChart.setData(barData);
        barChart.setDescription("Demo Barchart");
        barChart.invalidate();
//        barChart.
    }
}
