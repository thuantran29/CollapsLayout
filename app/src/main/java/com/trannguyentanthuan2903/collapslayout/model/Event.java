package com.trannguyentanthuan2903.collapslayout.model;

/**
 * Created by Administrator on 1/7/2018.
 */

public class Event {
    private String id;
    private String name;
    private String url_image;

    public Event() {
    }

    public Event(String id, String name, String url_image) {
        this.id = id;
        this.name = name;
        this.url_image = url_image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }
}
