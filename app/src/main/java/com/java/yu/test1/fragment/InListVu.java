package com.java.yu.test1.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.java.yu.test1.R;
import com.java.yu.test1.VuCallBack;
import com.java.yu.test1.view.Vu;

/**
 * Created by Administrator on 2016/3/30.
 */
public class InListVu implements Vu {

    public View view;
    public ListView listview;
    public VuCallBack<Integer> selectCallBack;
    @Override
    public void init(LayoutInflater inflter, ViewGroup container) {
        view =inflter.inflate(R.layout.fragment_list, container, false);
        listview= (ListView) view.findViewById(R.id.listview);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(selectCallBack!=null){
                    selectCallBack.exectue(position);
                }
            }
        });

    }

    @Override
    public View getView() {
        return view;
    }
    public void setListAdapter(ListAdapter adapter){
        listview.setAdapter(adapter);
    }


    public void selectCallBack(VuCallBack<Integer> callBack) {
    }
}
