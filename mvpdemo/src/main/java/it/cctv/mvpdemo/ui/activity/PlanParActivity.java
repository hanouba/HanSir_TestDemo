package it.cctv.mvpdemo.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.gson.Gson;
import com.jingewenku.abrahamcaijin.commonutil.AppLogMessageMgr;
import com.jingewenku.abrahamcaijin.commonutil.AppToastMgr;

import java.util.ArrayList;
import java.util.List;

import it.cctv.mvpdemo.R;
import it.cctv.mvpdemo.dao.PlanBean;
import it.cctv.mvpdemo.dao.PlanListBean;
import it.cctv.mvpdemo.dao.net.PlanParItemBean;
import it.cctv.mvpdemo.gloable.MyApp;
import it.cctv.mvpdemo.module.activity.PlanParView;
import it.cctv.mvpdemo.presenter.activity.PlanParPresenter;
import it.cctv.mvpdemo.ui.MvpActivity;
import it.cctv.mvpdemo.ui.adapter.RecyclerViewAdapter;

import static android.R.id.list;

/**
 * 创建者 by ${HanSir} on 2017/9/5.
 * 版权所有  WELLTRANS.
 * 说明       计划清单
 */

public class PlanParActivity extends MvpActivity<PlanParPresenter> implements PlanParView {
    private RecyclerView recyclerView;
    private ArrayList<PlanParItemBean> itemList = new ArrayList<>();
    private RecyclerViewAdapter recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_par);
        recyclerView = (RecyclerView) findViewById(R.id.recy_view);
        initRecyView();
        initData();
    }

    private void initRecyView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void initData() {
        AppLogMessageMgr.d("流程","initData");
        mvpPresenter.getPlanParData("1","30");
    }

    @Override
    public void getDataSuccess(PlanBean model) {
        int pageSize = model.getPageSize();

        List<PlanBean.ListBean> list = model.getList();
        for (int i = 0; i < list.size(); i++) {
            String id = list.get(i).getId();
            String createDate = list.get(i).getCreateDate();
            String name = list.get(i).getName();
            itemList.add(new PlanParItemBean(id,createDate,"","",name,"","","",""));
        }
        runOnUI();
        AppLogMessageMgr.d("流程","PlanBean"+model);
        AppLogMessageMgr.d("流程","PlanParActivitygetDataSuccess"+pageSize+"list");

    }

    private void runOnUI() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                recyclerViewAdapter = new RecyclerViewAdapter(MyApp.context,itemList);
                recyclerView.setAdapter(recyclerViewAdapter);

               recyclerViewAdapter.setOnRecyclerViewItemClickListener(new RecyclerViewAdapter.OnRecyclerViewItemClickListener() {
                   @Override
                   public void onItemClick(View view, int postion) {
                       AppToastMgr.shortToast(MyApp.context,"点击事件");
                       //跳转到
                   }
               });
            }
        });


    }

    @Override
    public void getDataFail(String msg) {

    }

    @Override
    protected PlanParPresenter createPresenter() {
        return new PlanParPresenter(this);
    }
}
