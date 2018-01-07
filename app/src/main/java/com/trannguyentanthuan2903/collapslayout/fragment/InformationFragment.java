package com.trannguyentanthuan2903.collapslayout.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trannguyentanthuan2903.collapslayout.R;
import com.trannguyentanthuan2903.collapslayout.adapter.InforAdapter;
import com.trannguyentanthuan2903.collapslayout.model.Information;

import java.util.ArrayList;

/**
 * Created by Administrator on 1/7/2018.
 */

public class InformationFragment extends Fragment {
    private InforAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Information> mArrayList;

    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_information,container,false);

        mArrayList = new ArrayList<>();
        getData();
        adapter = new InforAdapter(getContext(), R.layout.layout_item_infor, mArrayList);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerviewInfor);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return view;
    }

    private void getData() {
        mArrayList.add(new Information( R.drawable.date,"02", "AAAAA"));
        mArrayList.add(new Information( R.drawable.date,"02", "AAAAA"));
        mArrayList.add(new Information( R.drawable.date,"02", "AAAAA"));
    }
}
