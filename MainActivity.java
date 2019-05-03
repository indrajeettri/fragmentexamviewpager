package com.example.hp.fragmentexam;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    android.support.v7.widget.Toolbar toolbar1;
    ViewPager viewPager;
    Adapterclass adapterclass;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tablayout);
        toolbar1=findViewById(R.id.tool1);
        setSupportActionBar(toolbar1);
        viewPager=findViewById(R.id.viewpage);
        adapterclass=new Adapterclass(getSupportFragmentManager());
        viewPager.setAdapter(adapterclass);
        tabLayout.setupWithViewPager(viewPager);
    }
}
