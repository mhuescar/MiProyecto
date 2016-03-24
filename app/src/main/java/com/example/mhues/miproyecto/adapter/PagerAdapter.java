package com.example.mhues.miproyecto.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.mhues.miproyecto.fragment.FragmentContaint;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by mhues on 23/03/2016.
 */
public class PagerAdapter extends FragmentPagerAdapter {



    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new FragmentContaint();
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "Section 1".toUpperCase(l);
            case 1:
                return "Section 2".toUpperCase(l);
            case 2:
                return "Section 3".toUpperCase(l);
        }
        return null;
    }


}
