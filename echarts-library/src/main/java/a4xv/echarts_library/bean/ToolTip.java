package a4xv.echarts_library.bean;

/**
 * Created by 4XV on 2017/7/18.
 */

public class ToolTip {
    private String trigger="axis";

    public ToolTip() {
    }

    public ToolTip(String trigger) {
        this.trigger = trigger;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }
}
