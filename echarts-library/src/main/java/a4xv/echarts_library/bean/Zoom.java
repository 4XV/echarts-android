package a4xv.echarts_library.bean;

/**
 * Created by 4XV on 2017/7/18.
 */

public class Zoom {
    private String type;
    private int start;
    private int end;

    public Zoom(String type,int start,int end) {
        this.end = end;
        this.start = start;
        this.type = type;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
