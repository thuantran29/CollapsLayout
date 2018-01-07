package com.trannguyentanthuan2903.collapslayout.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.trannguyentanthuan2903.collapslayout.R;
import com.trannguyentanthuan2903.collapslayout.model.Gallery;

import java.util.List;

/**
 * Created by Administrator on 1/7/2018.
 */

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder> {
    private Context mContext;
    private int layoutInflater;
    private List<Gallery> mList;


    public GalleryAdapter(Context mContext, int layoutInflater, List<Gallery> mList) {
        this.mContext = mContext;
        this.layoutInflater = layoutInflater;
        this.mList = mList;
    }

    @Override
    public GalleryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.layout_item_gallery, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(GalleryAdapter.ViewHolder holder, int position) {
        Picasso.with(mContext).load(mList.get(position).getImg_url()).into(holder.image);
        if (position == 3){
            holder.text.setVisibility(View.VISIBLE);
        }else {
            holder.text.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : (mList.size() > 4 ?
                4 : mList.size());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView text;
        public ViewHolder(View itemView) {
            super(itemView);
                image = (ImageView) itemView.findViewById(R.id.image);
                text = (TextView) itemView.findViewById(R.id.viewAll);
        }
    }
}
