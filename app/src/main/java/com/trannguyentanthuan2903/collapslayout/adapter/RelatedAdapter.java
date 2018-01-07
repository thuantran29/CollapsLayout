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
import com.trannguyentanthuan2903.collapslayout.model.Related;

import java.util.List;

/**
 * Created by Administrator on 1/7/2018.
 */

public class RelatedAdapter extends RecyclerView.Adapter<RelatedAdapter.ViewHolder> {
    private Context mContext;
    private int layoutInflater;
    private List<Related> mList;


    public RelatedAdapter(Context mContext, int layoutInflater, List<Related> mList) {
        this.mContext = mContext;
        this.layoutInflater = layoutInflater;
        this.mList = mList;
    }

    @Override
    public RelatedAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(mContext).inflate(R.layout.layout_item_related,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RelatedAdapter.ViewHolder holder, int position) {
        if (mList.get(position)!= null){
            Picasso.with(mContext).load(mList.get(position).getImage_url()).into(holder.imgBG);
            Picasso.with(mContext).load(mList.get(position).getImg()).into(holder.imgIcon);
            holder.title.setText(mList.get(position).getTitle());
            holder.subTitle.setText(mList.get(position).getSubTitle());
        }else {
            Toast.makeText(mContext, "Null", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBG,imgIcon;
        TextView title,subTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            imgBG = (ImageView) itemView.findViewById(R.id.imgBG);
            imgIcon =(ImageView) itemView.findViewById(R.id.imgIcon);
            title = (TextView) itemView.findViewById(R.id.title);
            subTitle=(TextView) itemView.findViewById(R.id.subTitle);
        }
    }
}
