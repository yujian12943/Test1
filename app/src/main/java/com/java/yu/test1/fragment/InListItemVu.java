package com.java.yu.test1.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.java.yu.test1.R;
import com.java.yu.test1.view.Vu;

/**
 * Created by Administrator on 2016/3/30.
 */
public class InListItemVu implements Vu {

    public  View view;
    public TextView text_item;

    public void setTitle(String title) {
        text_item.setText(title);
    }

    @Override
    public void init(LayoutInflater inflter, ViewGroup container) {
        view=inflter.inflate(R.layout.item_list,container,false);
        text_item= (TextView) view.findViewById(R.id.text_item);
    }

    @Override
    public View getView() {
        return view;
    }

}
