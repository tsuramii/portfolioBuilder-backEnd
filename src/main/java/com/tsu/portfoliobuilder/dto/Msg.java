package com.tsu.portfoliobuilder.dto;

public class Msg {
    private String newMsg;

    public Msg(String newMsg) {
        this.newMsg = newMsg;
    }

    public String getMsg() {
        return newMsg;
    }

    public void setMsg(String newMsg) {
        this.newMsg = newMsg;
    }
}
