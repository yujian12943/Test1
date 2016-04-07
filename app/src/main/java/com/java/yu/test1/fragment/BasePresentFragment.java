package com.java.yu.test1.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.java.yu.test1.view.Vu;

/**
 * Created by Administrator on 2016/3/30.
 */
public abstract class BasePresentFragment<V extends Vu> extends Fragment {

    public V vu;
    private  View view;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        try {
            vu=getVuClass().newInstance();

            vu.init(inflater,container);
            onBindVu();
            View view=vu.getView();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return view;
    }

    /**
     * 绑定VIEW
     */
    public void onBindVu() {
    }

    @Override
    public void onDestroy() {
        onDestroyVu();
        vu=null;
        super.onDestroy();
    }

    public void onDestroyVu() {
    }

    protected abstract Class<V> getVuClass() ;
}
