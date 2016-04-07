package com.java.yu.test1.fragment;

import com.java.yu.test1.VuCallBack;
import com.java.yu.test1.adapter.InpuListAdapter;

/**
 */
public class InpuListFragment  extends BasePresentFragment<InListVu>{

    InpuListAdapter adapter= new InpuListAdapter();
    VuCallBack<Integer> callBack= new VuCallBack<Integer>() {
        @Override
        public void exectue(Integer result) {

        }
    };

    @Override
    public void onBindVu() {
         super.onBindVu();
        vu.setListAdapter(adapter);
        vu.selectCallBack(callBack);
    }

    @Override
    protected Class<InListVu> getVuClass() {
        return InListVu.class;
    }

    /**
     * 实例化当前对象
     * @return
     */
    public  static InpuListFragment newInstance(){
        return new InpuListFragment();
    }
}
