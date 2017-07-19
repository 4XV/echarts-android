package a4xv.echarts_library.bean;

/**
 * Created by 4XV on 2017/7/18.
 */

public class Title {
    private String text;
    private String subtext;

    public Title(String subtext, String text) {
        this.subtext = subtext;
        this.text = text;
    }

    public String getSubtext() {
        return subtext;
    }

    public void setSubtext(String subtext) {
        this.subtext = subtext;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
