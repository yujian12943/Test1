package com.java.yu.test1;

import com.java.yu.test1.base.BasePresentFragmentActivity;
import com.java.yu.test1.fragment.InpuListFragment;
import com.java.yu.test1.view.MainVu;

/**
 *mVP控制----m为数据，view为view，present为业务
 */
public class MainActivity extends BasePresentFragmentActivity<MainVu> {



    /**
     * 绑定数据
     */

    @Override
    protected void onBindVu() {
        super.onBindVu();
            fm.beginTransaction().replace(vu.getContentId(), InpuListFragment.newInstance() ).commit();
//        vu.textview.setText("Mvp测试 ");
    }

    @Override
    public Class<MainVu> getVuClass() {
        return MainVu.class;
    }

    /**
     * 处理业务逻辑
     */
    @Override
    protected void afteronResume() {
    }

    /**
     * 处理业务逻辑
     */
    @Override
    protected void beforeonPause() {

    }
}
