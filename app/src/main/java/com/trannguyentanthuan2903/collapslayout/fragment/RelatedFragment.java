package com.trannguyentanthuan2903.collapslayout.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trannguyentanthuan2903.collapslayout.R;
import com.trannguyentanthuan2903.collapslayout.adapter.RelatedAdapter;
import com.trannguyentanthuan2903.collapslayout.model.Related;

import java.util.ArrayList;

/**
 * Created by Administrator on 1/7/2018.
 */

public class RelatedFragment extends Fragment {
    private RelatedAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Related> mArrayList;
    private String image_url = "https://www.w3schools.com/w3css/img_fjords.jpg";
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View  view  = inflater.inflate(R.layout.fragment_related,container,false);
        mArrayList = new ArrayList<>();
        getData();
        adapter = new RelatedAdapter(getContext(), R.layout.layout_item_related, mArrayList);
        recyclerView = (RecyclerView) view.findViewById(R.id.recylerviewRelated);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return view;
    }

    private void getData() {
        mArrayList.add(new Related(R.drawable.date,"02", "adaadd", image_url));
        mArrayList.add(new Related(R.drawable.date,"02", "dasda", image_url));
        mArrayList.add(new Related(R.drawable.date,"02", "dasda", image_url));
        mArrayList.add(new Related(R.drawable.date,"02", "dasdadas", image_url));
    }
}
