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
import com.trannguyentanthuan2903.collapslayout.adapter.EventAdapter;
import com.trannguyentanthuan2903.collapslayout.model.Event;

import java.util.ArrayList;

/**
 * Created by Administrator on 1/7/2018.
 */

public class EventFragment extends Fragment {
    private EventAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Event> mArrayList;
    private String image_url = "https://www.w3schools.com/w3css/img_fjords.jpg";
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event,container,false);

       mArrayList = new ArrayList<>();
        getData();
        adapter = new EventAdapter(getContext(), R.layout.layout_event, mArrayList);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewEvent);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return view;
    }

    private void getData() {
        mArrayList.add(new Event("02", "AAAAA", image_url));
        mArrayList.add(new Event("02", "AAAAA", image_url));
        mArrayList.add(new Event("02", "AAAAA", image_url));
        mArrayList.add(new Event("02", "AAAAA", image_url));
        mArrayList.add(new Event("02", "AAAAA", image_url));
        mArrayList.add(new Event("02", "AAAAA", image_url));
    }
}
