package it.cctv.mvpdemo.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.jingewenku.abrahamcaijin.commonutil.AppLogMessageMgr;

import java.util.List;

import butterknife.OnClick;
import it.cctv.mvpdemo.R;
import it.cctv.mvpdemo.dao.net.PlanParItemBean;

/**
 * 创建者 by ${HanSir} on 2017/9/6.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener{
    private LayoutInflater inflater;
    private Context context;
    private List<PlanParItemBean> lists;

    //2
    private OnRecyclerViewItemClickListener onRecyclerViewItemClickListener = null;


    public RecyclerViewAdapter(Context context, List<PlanParItemBean> lists) {
        inflater = LayoutInflater.from(context);
        this.context = context;
        this.lists = lists;
    }

    @Override
    public void onClick(View v) {
//        4
        if (onRecyclerViewItemClickListener != null) {
            onRecyclerViewItemClickListener.onItemClick(v,(int)v.getTag());
        }
    }
    //1
    public static interface OnRecyclerViewItemClickListener {
        void onItemClick(View view,int postion);
    }
    public void setOnRecyclerViewItemClickListener(OnRecyclerViewItemClickListener listener) {
        this.onRecyclerViewItemClickListener = listener;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_planpar,parent,false);
        PlanParHolder holder = new PlanParHolder(view);
        //3
        view.setOnClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((PlanParHolder)holder).planName.setText(lists.get(position).name);
        //5
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class PlanParHolder extends RecyclerView.ViewHolder {
        public   TextView planName;
        private final TextView planType;
        private final TextView planStatus;
        private final TextView planCreateTime;
        private final TextView exeTeam;
        private final TextView roadP;
        private final TextView circle;
        private final TextView showDetail;
        private final TextView exePlan;
        public PlanParHolder(View itemView) {
            super(itemView);
            planName = (TextView) itemView.findViewById(R.id.tv_form_plan_name);
            planType = (TextView) itemView.findViewById(R.id.tv_form_plan);
            planStatus = (TextView) itemView.findViewById(R.id.tv_form_plan_time);
            planCreateTime = (TextView) itemView.findViewById(R.id.tv_form_plan_time2);
            exeTeam = (TextView) itemView.findViewById(R.id.tv_form_plan_person);
            roadP = (TextView) itemView.findViewById(R.id.tv_form_plan_position);
            circle = (TextView) itemView.findViewById(R.id.tv_form_plan_circle);
            showDetail = (TextView) itemView.findViewById(R.id.tv_form_plan_historyRecord);
            exePlan = (TextView) itemView.findViewById(R.id.btn_plan_goto_do);
        }
    }
 }
