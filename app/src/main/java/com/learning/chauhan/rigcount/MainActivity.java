package com.learning.chauhan.rigcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    private static final String TAG = "MainActivity";
    private LineChart mChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mChart = (LineChart) findViewById(R.id.linechart);

//        mChart.setOnChartGestureListener(MainActivity.this);
//        mChart.setOnChartValueSelectedListener(MainActivity.this);

        mChart.setDragEnabled(true);
        mChart.setScaleEnabled(false);

        List<Entry> yValues = new ArrayList<>();
        yValues.add(new Entry(0, 20));
        yValues.add(new Entry(1, 40));
        yValues.add(new Entry(3, 50));
        yValues.add(new Entry(4, 20));
        yValues.add(new Entry(5, 60));
        yValues.add(new Entry(6, 30));
        yValues.add(new Entry(9, 120));
        LineDataSet dataSet = new LineDataSet(yValues, "Data Set 1");

        dataSet.setFillAlpha(110);

        List<ILineDataSet> dataSets = new ArrayList<>();

        dataSets.add(dataSet);

        LineData data = new LineData(dataSets);

        mChart.setData(data);

    }
}
