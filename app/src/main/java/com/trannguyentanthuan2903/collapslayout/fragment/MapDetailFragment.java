package com.trannguyentanthuan2903.collapslayout.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trannguyentanthuan2903.collapslayout.R;

/**
 * Created by Administrator on 1/6/2018.
 */

public class MapDetailFragment extends Fragment {

    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map_detail,container,false);
        return view;
    }
}
