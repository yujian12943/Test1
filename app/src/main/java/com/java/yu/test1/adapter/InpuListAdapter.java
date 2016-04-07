package com.java.yu.test1.adapter;

import com.java.yu.test1.bean.Inpu;
import com.java.yu.test1.fragment.InListItemVu;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/3/30.
 */
public class InpuListAdapter extends BasePresentAdapter<InListItemVu>{

    ArrayList<String> lists= new ArrayList<String>(Inpu.vulue.keySet());
    @Override
    public void onBindListItemVu(int position) {
       String title= lists.get(position);
        vu.setTitle(title);
    }

    @Override
    public Class getVuClass() {
        return InListItemVu.class;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    public String getTitle(int position){
        return (String) getItem(position);

    }
    @Override
    public long getItemId(int position) {
        return position;
    }
}
