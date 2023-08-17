package com.myapplicationdev.databaserevision;

public class Note {
    private int id;
    private String content;
    private int priority;

    public Note(int id, String content, int priority) {
        this.id = id;
        this.content = content;
        this.priority = priority;
    }
//TODO: What should be here?

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "id:" + id +
                "content:" + content +
                "priority:" + priority;
    }
}
