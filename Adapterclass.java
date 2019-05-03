package com.example.hp.fragmentexam;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Adapterclass extends FragmentPagerAdapter {

    public Adapterclass(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        BlankFragment1 blankFragment1=new BlankFragment1();
        position =position+1;
        Bundle bundle=new Bundle();
        bundle.putString("sent massage","fragment "+position);
        blankFragment1.setArguments(bundle);
        return blankFragment1;

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        position=position+1;
        return "fragment"+position;
    }
}

