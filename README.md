# Chart
饼图+折线图
# 使用方法转自https://github.com/blackfizz/EazeGraph

# Add in your android app project folder in the 'build.gradle' under dependencies:


dependencies {
    compile 'com.github.blackfizz:eazegraph:1.2.2@aar'
    compile 'com.nineoldandroids:library:2.4.0'
}


# Usage

XML

<org.eazegraph.lib.charts.BarChart
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/barchart"
    android:layout_width="match_parent"
    android:layout_height="256dp"
    android:padding="10dp"
    app:egFixedBarWidth="true"
    app:egBarWidth="20dp"
    app:egLegendHeight="40dp"/>

Java

BarChart mBarChart = (BarChart) findViewById(R.id.barchart);

mBarChart.addBar(new BarModel(2.3f, 0xFF123456));
mBarChart.addBar(new BarModel(2.f,  0xFF343456));
mBarChart.addBar(new BarModel(3.3f, 0xFF563456));
mBarChart.addBar(new BarModel(1.1f, 0xFF873F56));
mBarChart.addBar(new BarModel(2.7f, 0xFF56B7F1));
mBarChart.addBar(new BarModel(2.f,  0xFF343456));
mBarChart.addBar(new BarModel(0.4f, 0xFF1FF4AC));
mBarChart.addBar(new BarModel(4.f,  0xFF1BA4E6));

mBarChart.startAnimation();
# Stacked Bar Chart

XML

<org.eazegraph.lib.charts.StackedBarChart
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/stackedbarchart"
    android:layout_width="match_parent"
    android:layout_height="256dp"
    android:padding="10dp"
    app:egFixedBarWidth="true"
    app:egBarWidth="20dp"
    app:egLegendHeight="40dp"/>
Java

StackedBarChart mStackedBarChart = (StackedBarChart) findViewById(R.id.stackedbarchart);

StackedBarModel s1 = new StackedBarModel("12.4");

s1.addBar(new BarModel(2.3f, 0xFF63CBB0));
s1.addBar(new BarModel(2.3f, 0xFF56B7F1));
s1.addBar(new BarModel(2.3f, 0xFFCDA67F));

StackedBarModel s2 = new StackedBarModel("13.4");
s2.addBar(new BarModel(1.1f, 0xFF63CBB0));
s2.addBar(new BarModel(2.7f, 0xFF56B7F1));
s2.addBar(new BarModel(0.7f, 0xFFCDA67F));

StackedBarModel s3 = new StackedBarModel("14.4");

s3.addBar(new BarModel(2.3f, 0xFF63CBB0));
s3.addBar(new BarModel(2.f, 0xFF56B7F1));
s3.addBar(new BarModel(3.3f, 0xFFCDA67F));

StackedBarModel s4 = new StackedBarModel("15.4");
s4.addBar(new BarModel(1.f, 0xFF63CBB0));
s4.addBar(new BarModel(4.2f, 0xFF56B7F1));
s4.addBar(new BarModel(2.1f, 0xFFCDA67F));

mStackedBarChart.addBar(s1);
mStackedBarChart.addBar(s2);
mStackedBarChart.addBar(s3);
mStackedBarChart.addBar(s4);

mStackedBarChart.startAnimation();

# PieChart

XML

 <org.eazegraph.lib.charts.PieChart
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/piechart"
    android:layout_width="match_parent"
    android:layout_height="300dp"
    android:padding="8dp"
    app:egLegendTextSize="18sp"
    app:egUsePieRotation="true"
    app:egValueTextSize="36sp"/>
Java

PieChart mPieChart = (PieChart) findViewById(R.id.piechart);

mPieChart.addPieSlice(new PieModel("Freetime", 15, Color.parseColor("#FE6DA8")));
mPieChart.addPieSlice(new PieModel("Sleep", 25, Color.parseColor("#56B7F1")));
mPieChart.addPieSlice(new PieModel("Work", 35, Color.parseColor("#CDA67F")));
mPieChart.addPieSlice(new PieModel("Eating", 9, Color.parseColor("#FED70E")));

mPieChart.startAnimation();
# Line Chart

XML

<org.eazegraph.lib.charts.ValueLineChart
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/cubiclinechart"
    android:layout_width="match_parent"
    android:layout_height="200dp"
    app:egUseCubic="true"
    app:egUseOverlapFill="true"
    app:egCurveSmoothness="0.4"
    app:egIndicatorLineColor="#FE6DA8"
    app:egLegendHeight="40dp"
    app:egShowStandardValue="true"/>
Java

ValueLineChart mCubicValueLineChart = (ValueLineChart) findViewById(R.id.cubiclinechart);

ValueLineSeries series = new ValueLineSeries();
series.setColor(0xFF56B7F1);

series.addPoint(new ValueLinePoint("Jan", 2.4f));
series.addPoint(new ValueLinePoint("Feb", 3.4f));
series.addPoint(new ValueLinePoint("Mar", .4f));
series.addPoint(new ValueLinePoint("Apr", 1.2f));
series.addPoint(new ValueLinePoint("Mai", 2.6f));
series.addPoint(new ValueLinePoint("Jun", 1.0f));
series.addPoint(new ValueLinePoint("Jul", 3.5f));
series.addPoint(new ValueLinePoint("Aug", 2.4f));
series.addPoint(new ValueLinePoint("Sep", 2.4f));
series.addPoint(new ValueLinePoint("Oct", 3.4f));
series.addPoint(new ValueLinePoint("Nov", .4f));
series.addPoint(new ValueLinePoint("Dec", 1.3f));

mCubicValueLineChart.addSeries(series);
mCubicValueLineChart.startAnimation();
