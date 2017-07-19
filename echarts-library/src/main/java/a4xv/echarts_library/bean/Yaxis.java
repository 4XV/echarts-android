package a4xv.echarts_library.bean;

/**
 * Created by 4XV on 2017/7/18.
 */

public class Yaxis {
    private String type="value";

    public Yaxis() {
    }

    public Yaxis(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
