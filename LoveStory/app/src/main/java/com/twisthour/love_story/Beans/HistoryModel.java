package com.twisthour.love_story.Beans;

public class HistoryModel {

    int id;
    String title;
    String content;
    String category;
    long time;
    int type;
    private Object color;

    public HistoryModel(int id, String title, String content, String category, long time, int type) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.category = category;
        this.time = time;
        this.type = type;
    }

    public int getType() {
        return type;
    }




    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }



}
