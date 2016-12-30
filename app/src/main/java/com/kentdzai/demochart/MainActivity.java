package com.kentdzai.demochart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.kentdzai.demochart.model.MainHelper;
import com.kentdzai.demochart.presenter.MainPresenter;
import com.kentdzai.demochart.view.MainView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainView, AdapterView.OnItemClickListener {

    ListView lvChart;
    ArrayAdapter<String> adapter;
    MainHelper model;
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        lvChart = (ListView) findViewById(R.id.lvChart);
        model = new MainHelper();
        presenter = new MainPresenter(model, this);
        presenter.getData();
        lvChart.setOnItemClickListener(this);
    }


    @Override
    public void displayChart(ArrayList<String> arrC) {
        Log.e("MY_TAG", arrC.size() + "ahihi");
        adapter = new ArrayAdapter<String>(getBaseContext(),
                android.R.layout.simple_list_item_1,
                arrC);
        lvChart.setAdapter(adapter);
    }

    public void showDemoChart(Class<?> cls) {
        Intent it = new Intent(MainActivity.this, cls);
        startActivity(it);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i) {
            case 0:
                showDemoChart(PieChartDemo.class);
                break;
            case 1:
                showDemoChart(LineChartDemo.class);
                break;
            case 2:
                showDemoChart(BarChartDemo.class);
                break;
            case 3:
                showDemoChart(CombinedChartDemo.class);
                break;
            default:
                break;
        }

    }
}