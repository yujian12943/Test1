package com.java.yu.test1.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.java.yu.test1.R;

/**
 *
 */
public class MainVu implements Vu{
    public View view;
    public TextView textview;
    public FrameLayout content;

    /**
     * 初始化View
     * @param inflter
     * @param container
     */
    @Override
    public void init(LayoutInflater inflter, ViewGroup container) {
        view=inflter.inflate(R.layout.activity_main1, container);
//        textview= (TextView) view.findViewById(R.id.textview);
        content= (FrameLayout) view.findViewById(R.id.content);

    }

    public int getContentId(){
        return content.getId();
    }
    /**
     * 返回vi ew
     * @return
     */
    @Override
    public View getView() {
        return view;
    }
}
