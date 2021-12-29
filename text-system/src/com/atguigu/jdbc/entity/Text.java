package com.atguigu.jdbc.entity;

import java.io.Serializable;

public class Text implements Serializable {
    private Integer text_Id;
    private String text_event;
    private String text_method;

    public Integer getText_Id() {
        return text_Id;
    }

    public void setText_Id(Integer text_Id) {
        this.text_Id = text_Id;
    }

    public String getText_event() {
        return text_event;
    }

    public void setText_event(String text_event) {
        this.text_event = text_event;
    }

    public String getText_method() {
        return text_method;
    }

    public void setText_method(String text_method) {
        this.text_method = text_method;
    }

    public Text(Integer text_Id, String text_event, String text_method) {
        this.text_Id = text_Id;
        this.text_event = text_event;
        this.text_method = text_method;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text_Id=" + text_Id +
                ", text_event='" + text_event + '\'' +
                ", text_method='" + text_method + '\'' +
                '}';
    }
}