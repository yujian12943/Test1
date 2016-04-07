package com.java.yu.test1.base;

import android.app.Activity;
import android.os.Bundle;

import com.java.yu.test1.view.Vu;

/**
 * present业务控制类
 */
public abstract class BasePresentActivity<V extends Vu> extends Activity  {

    public V vu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            vu= getVuClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        vu.init(getLayoutInflater(), null);
        setContentView(vu.getView());

        //绑定数据
        onBindVu();
    }

    /**
     * 绑定数据
     */
    protected  void onBindVu(){

    }

    public abstract Class<V> getVuClass() ;


}
