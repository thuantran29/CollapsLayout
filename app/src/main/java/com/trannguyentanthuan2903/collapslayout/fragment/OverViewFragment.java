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
import com.trannguyentanthuan2903.collapslayout.adapter.GalleryAdapter;
import com.trannguyentanthuan2903.collapslayout.model.Gallery;

import java.util.ArrayList;

/**
 * Created by Administrator on 1/6/2018.
 */

public class OverViewFragment extends Fragment {
    private GalleryAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Gallery> mArrayList;
    private String image_url = "https://www.w3schools.com/w3css/img_fjords.jpg";

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_over_view, container, false);

        mArrayList = new ArrayList<>();
        getData();
        adapter = new GalleryAdapter(getContext(), R.layout.layout_item_gallery, mArrayList);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerviewGallery);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return view;
    }

    private void getData() {
        mArrayList.add(new Gallery("02", "AAAAA", image_url));
        mArrayList.add(new Gallery("02", "AAAAA", image_url));
        mArrayList.add(new Gallery("02", "AAAAA", image_url));
        mArrayList.add(new Gallery("02", "AAAAA", image_url));
        mArrayList.add(new Gallery("02", "AAAAA", image_url));
        mArrayList.add(new Gallery("02", "AAAAA", image_url));
    }
}
