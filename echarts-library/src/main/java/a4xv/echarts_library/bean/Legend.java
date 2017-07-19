package a4xv.echarts_library.bean;

import java.util.ArrayList;

/**
 * Created by 4XV on 2017/7/18.
 */

public class Legend {
    private ArrayList<String>data=new ArrayList<>();

    public void add(String legend)
    {
        data.add(legend);
    }

    public void add(ArrayList<String>data)
    {
        this.data.addAll(data);
    }

    public ArrayList<String> getData() {
        return data;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }
}
