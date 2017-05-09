package com.theironyard;

/**
 * Created by Keith on 4/24/17
 *
 */
public class ToDoItem {
    int id;
    String text;
    boolean isDone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public ToDoItem(int id, String text, boolean isDone) {

        this.id = id;
        this.text = text;
        this.isDone = isDone;
    }
}
