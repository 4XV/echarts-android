package a4xv.echarts_library.bean;

import java.util.ArrayList;

/**
 * Created by 4XV on 2017/7/18.
 */

public class Option
{
    private Title title;
    private ToolTip tooltip;
    private Legend legend;
    private Xaxis xAxis;
    private Yaxis yAxis;
    private ArrayList<Serie>series;
    private ArrayList<Zoom>dataZoom;

    public Option(Legend legend, ArrayList<Serie> series, Title title, ToolTip tooltip, Xaxis xAxis, Yaxis yAxis) {
        this.legend = legend;
        this.series = series;
        this.title = title;
        this.tooltip = tooltip;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public ArrayList<Serie> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Serie> series) {
        this.series = series;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public ToolTip getTooltip() {
        return tooltip;
    }

    public void setTooltip(ToolTip tooltip) {
        this.tooltip = tooltip;
    }

    public Xaxis getxAxis() {
        return xAxis;
    }

    public void setxAxis(Xaxis xAxis) {
        this.xAxis = xAxis;
    }

    public Yaxis getyAxis() {
        return yAxis;
    }

    public void setyAxis(Yaxis yAxis) {
        this.yAxis = yAxis;
    }

    public ArrayList<Zoom> getDataZoom() {
        return dataZoom;
    }

    public void setDataZoom(ArrayList<Zoom> dataZoom) {
        this.dataZoom = dataZoom;
    }
}
