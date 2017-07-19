package a4xv.echarts_library.bean;

import android.content.Intent;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by 4XV on 2017/7/18.
 */

public class Serie
{
    private String name;
    private String type;
    private ArrayList<Integer>data=new ArrayList<>();

    public Serie( String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void add(Integer...data)
    {
        Collections.addAll(this.data,data);
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
