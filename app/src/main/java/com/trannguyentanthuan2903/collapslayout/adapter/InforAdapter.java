package com.trannguyentanthuan2903.collapslayout.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.trannguyentanthuan2903.collapslayout.R;
import com.trannguyentanthuan2903.collapslayout.model.Information;

import java.util.List;

/**
 * Created by Administrator on 1/7/2018.
 */

public class InforAdapter extends RecyclerView.Adapter<InforAdapter.ViewHolder> {
    private Context mContext;
    private int layoutInflater;
    private List<Information> mList;

    public InforAdapter(Context mContext, int layoutInflater, List<Information> mList) {
        this.mContext = mContext;
        this.layoutInflater = layoutInflater;
        this.mList = mList;
    }

    @Override
    public InforAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_item_infor,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InforAdapter.ViewHolder holder, int position) {
        if (mList.get(position) != null){
            Picasso.with(mContext).load(mList.get(position).getImage()).into(holder.img);
            holder.title.setText(mList.get(position).getTitle());
            holder.title.setText(mList.get(position).getSubTitle());
        }else {
            Toast.makeText(mContext, "Error null", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title,subTitle;
        ImageView img;
        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            subTitle= (TextView) itemView.findViewById(R.id.subtitle);
            img = (ImageView) itemView.findViewById(R.id.iconInfor);
        }
    }
}
