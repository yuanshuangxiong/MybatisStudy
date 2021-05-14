package com.yuan.pojo;

import java.util.Date;

public class Blog {
    private String id;
    private String title;
    private String author;
    private Date date;
    private int views;

    public Blog() {
    }

    public Blog(String id, String title, String author, Date date, int views) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.date = date;
        this.views = views;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", date=" + date +
                ", views=" + views +
                '}';
    }
}
