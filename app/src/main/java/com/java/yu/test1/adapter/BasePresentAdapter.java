package com.java.yu.test1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.java.yu.test1.view.Vu;

/**
 * Created by Administrator on 2016/3/30.
 */
public abstract class BasePresentAdapter <V extends Vu>  extends BaseAdapter{

    public V vu;
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater layoutInflater= (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            try {
                vu=getVuClass().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //初始化view
            vu.init(layoutInflater,parent);
            convertView= vu.getView();
            convertView.setTag(vu);
        }else {
            vu = (V)convertView.getTag();
        }
        if(convertView!=null){
            onBindListItemVu(position);
        }
        return convertView;
    }

    public abstract void onBindListItemVu(int position) ;


    public abstract Class<V> getVuClass() ;
}
