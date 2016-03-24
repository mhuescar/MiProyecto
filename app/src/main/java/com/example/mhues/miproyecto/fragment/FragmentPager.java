package com.example.mhues.miproyecto.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mhues.miproyecto.R;
import com.example.mhues.miproyecto.adapter.PagerAdapter;


public class FragmentPager extends Fragment {

    private ViewPager mPager;
    private android.support.v4.view.PagerAdapter mPagerAdapter;

    public FragmentPager() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_pager, container, false);

        mPager = (ViewPager) rootView.findViewById(R.id.pager);
        mPagerAdapter = new PagerAdapter(getFragmentManager());
        mPager.setAdapter(mPagerAdapter);

        return rootView;
    }


}
