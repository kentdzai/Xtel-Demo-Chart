package com.kentdzai.demochart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartDemo extends AppCompatActivity {
    com.github.mikephil.charting.charts.PieChart pieChart;
    PieData pieData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);
        init();
    }

    private void init() {

        pieChart = (com.github.mikephil.charting.charts.PieChart) findViewById(R.id.pieChart);
        pieData = new PieData(getPieXAxisValues(), getPieDataSet());
        pieChart.setData(pieData);
        pieChart.setDescription("Doanh số");
        pieChart.invalidate();
    }

    private ArrayList<String> getPieXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("JAN");
        xAxis.add("FEB");
        xAxis.add("MAR");
        xAxis.add("APR");
        xAxis.add("MAY");
        xAxis.add("JUN");
        return xAxis;
    }

    private PieDataSet getPieDataSet() {

        ArrayList<Entry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(110.000f, 0); // Jan
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(40.000f, 1); // Feb
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(60.000f, 2); // Mar
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(30.000f, 3); // Apr
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(90.000f, 4); // May
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(100.000f, 5); // Jun
        valueSet1.add(v1e6);

        PieDataSet pieDataSet1 = new PieDataSet(valueSet1, "Brand 1");
        pieDataSet1.setColors(ColorTemplate.COLORFUL_COLORS);

        return pieDataSet1;
    }


}
