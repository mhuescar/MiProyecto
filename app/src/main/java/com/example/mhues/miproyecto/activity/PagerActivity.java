package com.example.mhues.miproyecto.activity;

import android.support.v4.app.Fragment;

import com.example.mhues.miproyecto.fragment.FragmentPager;

public class PagerActivity extends FragmentContainerActivity  {

    @Override
    protected Fragment createFragment() {
        FragmentPager fragment = new FragmentPager();
        return fragment;
    }

}
