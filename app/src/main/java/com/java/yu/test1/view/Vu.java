package com.java.yu.test1.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 *主要初始化view返回当前view
 */
public interface Vu {

    public void init(LayoutInflater inflter,ViewGroup container);

    public View getView();
}
