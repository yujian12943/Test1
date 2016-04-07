package com.java.yu.test1.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/3/30.
 */
public class Inpu {

    public String title;
    public String body;

    public Inpu(String title,String body){
        this.title= title;
        this.body=body;
    }

    public static Map<String,Inpu> vulue= new HashMap<String,Inpu>();
    static {
        vulue.put("mvp",new Inpu("张玉建","mvp测试"));
    }
}
