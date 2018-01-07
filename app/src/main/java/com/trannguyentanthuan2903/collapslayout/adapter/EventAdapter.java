package com.trannguyentanthuan2903.collapslayout.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.trannguyentanthuan2903.collapslayout.R;
import com.trannguyentanthuan2903.collapslayout.model.Event;

import java.util.List;

/**
 * Created by Administrator on 1/7/2018.
 */

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {
    private Context mContext;
    private int layoutInflater;
    private List<Event> mListEvent;

    public EventAdapter(Context mContext, int layoutInflater, List<Event> mListEvent) {
        this.mContext = mContext;
        this.layoutInflater = layoutInflater;
        this.mListEvent = mListEvent;
    }

    @Override
    public EventAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.layout_event, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(EventAdapter.ViewHolder holder, int position) {
        Picasso.with(mContext).load(mListEvent.get(position).getUrl_image()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mListEvent == null ? 0 : (mListEvent.size() > 4 ?
                4 : mListEvent.size());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageEvent);
        }
    }
}
