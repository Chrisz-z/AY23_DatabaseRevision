package com.myapplicationdev.databaserevision;

public class Note {
    private int id;
    private String content;
    private String priority;

    //TODO: What should be here?

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "id:" + id +
                "content:" + content +
                "priority:" + priority;
    }
}
