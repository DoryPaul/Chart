package com.example.yyz.chart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.charts.ValueLineChart;
import org.eazegraph.lib.models.PieModel;
import org.eazegraph.lib.models.ValueLinePoint;
import org.eazegraph.lib.models.ValueLineSeries;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       lineChart();

      pieChart();
    }

    private void lineChart() {
        ValueLineChart mCubicValueLineChart = (ValueLineChart) findViewById(R.id.cubiclinechart);

        ValueLineSeries series = new ValueLineSeries();
        series.setColor(0xFF56B7F1);

        series.addPoint(new ValueLinePoint("1", 1.4f));
        series.addPoint(new ValueLinePoint("2", 3.4f));
        series.addPoint(new ValueLinePoint("2", .4f));
        series.addPoint(new ValueLinePoint("3", 1.2f));
        series.addPoint(new ValueLinePoint("Mai", 2.6f));
        series.addPoint(new ValueLinePoint("Jun", 1.0f));
        series.addPoint(new ValueLinePoint("Jul", 1.5f));
        series.addPoint(new ValueLinePoint("Aug",1.4f));
        series.addPoint(new ValueLinePoint("Sep", 1.4f));
        series.addPoint(new ValueLinePoint("Oct", 5.4f));
        series.addPoint(new ValueLinePoint("Nov", .4f));
        series.addPoint(new ValueLinePoint("Dec", 1.3f));
        series.addPoint(new ValueLinePoint("Dec", 1.3f));
        series.addPoint(new ValueLinePoint("Dec", 1.3f));
        mCubicValueLineChart.addSeries(series);
        mCubicValueLineChart.startAnimation();
    }

    private void pieChart() {
        PieChart mPieChart = (PieChart) findViewById(R.id.piechart);

        mPieChart.addPieSlice(new PieModel("Freetime", 15, Color.parseColor("#FE6DA8")));
        mPieChart.addPieSlice(new PieModel("Sleep", 25, Color.parseColor("#56B7F1")));
        mPieChart.addPieSlice(new PieModel("Work", 35, Color.parseColor("#CDA67F")));
        mPieChart.addPieSlice(new PieModel("Eating", 9, Color.parseColor("#FED70E")));

        mPieChart.startAnimation();
    }
}
