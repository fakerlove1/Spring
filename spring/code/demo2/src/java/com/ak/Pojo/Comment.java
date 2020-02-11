package com.ak.Pojo;

/**
 * 商品的评论类
 */
public class Comment {
    private String information;
    private int id;

    @Override
    public String toString() {
        return "Comment{" +
                "information='" + information + '\'' +
                ", id=" + id +
                '}';
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
