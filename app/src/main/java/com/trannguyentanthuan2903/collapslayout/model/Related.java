package com.trannguyentanthuan2903.collapslayout.model;

/**
 * Created by Administrator on 1/7/2018.
 */

public class Related {
    private int img;
    private String title;
    private String subTitle;
    private String image_url;

    public Related() {
    }

    public Related(int img, String title, String subTitle, String image_url) {
        this.img = img;
        this.title = title;
        this.subTitle = subTitle;
        this.image_url = image_url;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
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

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
