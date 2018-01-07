package com.trannguyentanthuan2903.collapslayout.model;

/**
 * Created by Administrator on 1/7/2018.
 */

public class Information {
    private int image;
    private String title;
    private String subTitle;

    public Information() {
    }

    public Information(int image, String title, String subTitle) {
        this.image = image;
        this.title = title;
        this.subTitle = subTitle;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
}
