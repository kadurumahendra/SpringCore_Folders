package com.myApp;

public class Information {
    private int id;

    public Information() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Information [id=" + id + "]";
    }
}
