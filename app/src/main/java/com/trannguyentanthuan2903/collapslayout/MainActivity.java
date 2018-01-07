package com.trannguyentanthuan2903.collapslayout;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.trannguyentanthuan2903.collapslayout.fragment.EventFragment;
import com.trannguyentanthuan2903.collapslayout.fragment.HeadFragment;
import com.trannguyentanthuan2903.collapslayout.fragment.InformationFragment;
import com.trannguyentanthuan2903.collapslayout.fragment.MapDetailFragment;
import com.trannguyentanthuan2903.collapslayout.fragment.OverViewFragment;
import com.trannguyentanthuan2903.collapslayout.fragment.RelatedFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HeadFragment fragment = new HeadFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.head_fragment, fragment);
        transaction.addToBackStack(null);
        transaction.commit();

        MapDetailFragment mapFragment = new MapDetailFragment();
        FragmentTransaction transactionMap = getSupportFragmentManager().beginTransaction();
        transactionMap.add(R.id.map_detail_fragment, mapFragment);
        transactionMap.addToBackStack(null);
        transactionMap.commit();

        OverViewFragment overViewFragment = new OverViewFragment();
        FragmentTransaction transactionOverView = getSupportFragmentManager().beginTransaction();
        transactionOverView.add(R.id.over_view_detail_fragment, overViewFragment);
        transactionOverView.addToBackStack(null);
        transactionOverView.commit();

        EventFragment eventFragment = new EventFragment();
        FragmentTransaction transactionEvent = getSupportFragmentManager().beginTransaction();
        transactionEvent.add(R.id.event_detail_fragment, eventFragment);
        transactionEvent.addToBackStack(null);
        transactionEvent.commit();

        InformationFragment infoFragment = new InformationFragment();
        FragmentTransaction transactionInfo = getSupportFragmentManager().beginTransaction();
        transactionInfo.add(R.id.info_frament, infoFragment);
        transactionInfo.addToBackStack(null);
        transactionInfo.commit();

        RelatedFragment relatedFragment = new RelatedFragment();
        FragmentTransaction transactionRelated = getSupportFragmentManager().beginTransaction();
        transactionRelated.add(R.id.related_frament, relatedFragment);
        transactionRelated.addToBackStack(null);
        transactionRelated.commit();
    }
}
