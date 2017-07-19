package a4xv.echarts_library;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import com.google.gson.Gson;
import com.tencent.smtt.sdk.WebView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import a4xv.echarts_library.bean.Legend;
import a4xv.echarts_library.bean.Option;
import a4xv.echarts_library.bean.Serie;
import a4xv.echarts_library.bean.Title;
import a4xv.echarts_library.bean.ToolTip;
import a4xv.echarts_library.bean.Xaxis;
import a4xv.echarts_library.bean.Yaxis;
import a4xv.echarts_library.bean.Zoom;

/**
 * Created by 4XV on 2017/7/18.
 */

public class LineChart extends WebView {
    public LineChart(Context context, AttributeSet attrs) {
        super(context, attrs);
        initData();
        getSettings().setJavaScriptEnabled(true);
    }

    private void initData() {
        long start=System.currentTimeMillis();
        Title title = new Title("气温", "测试");
        ToolTip toolTip = new ToolTip();
        Legend legend = new Legend();
        legend.add("最高气温");
        Xaxis xaxis = new Xaxis();
        xaxis.add("周一", "周二", "周三", "周四", "周五", "周六", "周日","周一", "周二", "周三", "周四", "周五", "周六", "周日","周一", "周二", "周三", "周四", "周五", "周六", "周日","周一", "周二", "周三", "周四", "周五", "周六", "周日","周一", "周二", "周三", "周四", "周五", "周六", "周日","周一", "周二", "周三", "周四", "周五", "周六", "周日","周一", "周二", "周三", "周四", "周五", "周六", "周日","周一", "周二", "周三", "周四", "周五", "周六", "周日");
        Yaxis yaxis = new Yaxis();
        ArrayList<Serie> series = new ArrayList<>();
        Serie serie = new Serie("最高气温", "line");
        serie.add(10, 11, 10, 13, 12, 13, 10,10, 11, 10, 13, 12, 13, 10,10, 11, 10, 13, 12, 13, 10,10, 11, 10, 13, 12, 13, 10,10, 11, 10, 13, 12, 13, 10,10, 11, 10, 13, 12, 13, 10,10, 11, 10, 13, 12, 13, 10,10, 11, 10, 13, 12, 13, 10);
        series.add(serie);
        Zoom zoom=new Zoom("inside",0,10);
        ArrayList<Zoom>zooms=new ArrayList<>();
        zooms.add(zoom);
        Option option = new Option(legend, series, title, toolTip, xaxis, yaxis);
        option.setDataZoom(zooms);
        String optionString = new Gson().toJson(option);

        String html = getAssetData("chart.html");
        String echart = getAssetData("echarts.min.js");
        html = html.replace("{option}", optionString).replace("{js}", echart);

        Log.e("---",(System.currentTimeMillis()-start)+"");

        loadDataWithBaseURL(null, html, "text/html", "utf-8", null);

        Log.e("---",(System.currentTimeMillis()-start)+"");

    }

    private String getAssetData(String fileName) {
        try {
            InputStream fis = getResources().getAssets().open(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
            StringBuffer buffer = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }
            String data = buffer.toString();
            return data;
        } catch (Exception e) {
            return null;
        }

    }
}
