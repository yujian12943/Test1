package com.java.yu.test1.base;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

import com.java.yu.test1.view.Vu;

import de.greenrobot.event.EventBus;


/**
 * present业务控制类
 */
public abstract class BasePresentFragmentActivity<V extends Vu> extends Activity  {

    public V vu;
    public FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {

            fm=getFragmentManager();
            EventBus bs= EventBus.getDefault();

            vu= getVuClass().newInstance();

            vu.init(getLayoutInflater(), null);
            setContentView(vu.getView());

            //绑定数据
            onBindVu();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 可编辑
     */
    @Override
    protected final void onResume() {
        afteronResume();
        super.onResume();
    }

    protected abstract void afteronResume();

    /**
     * 不可编辑
     */
    @Override
    protected final void onPause() {
        beforeonPause();
        super.onPause();
    }

    protected abstract void beforeonPause();

    /**
     * 绑定数据
     */
    protected  void onBindVu(){

    }

    public abstract Class<V> getVuClass() ;


}
