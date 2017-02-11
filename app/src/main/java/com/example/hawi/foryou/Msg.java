package com.example.hawi.foryou;

/**
 * Created by Hawi on 2017-2-8.
 */

public class Msg {
    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SEND = 1;
    private String content;
    private int type;

    public Msg(String content, int type){
        this.content = content;
        this.type = type;
    }

    public int getType(){
        return type;
    }

    public String getContent(){
        return content;
    }
}
