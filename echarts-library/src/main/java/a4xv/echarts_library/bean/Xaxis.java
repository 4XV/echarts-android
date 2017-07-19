package a4xv.echarts_library.bean;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by 4XV on 2017/7/18.
 */

public class Xaxis
{
    private ArrayList<String> data=new ArrayList<>();

    public Xaxis add(String...legend)
    {
        Collections.addAll(data,legend);
        return this;
    }

    public Xaxis add(ArrayList<String>data)
    {
        this.data.addAll(data);
        return this;
    }

    public ArrayList<String> getData() {
        return data;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }
}
