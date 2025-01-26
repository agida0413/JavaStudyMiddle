package com.yj.tree;

public class Message implements Comparable<Message>{
    private String msg;
    private int id;

    @Override
    public int compareTo(Message o) {
        return (this.id<o.getId()?-1:1);
    }

    public Message(String msg, int id) {
        this.msg = msg;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }


    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                ", id=" + id +
                '}';
    }


}
