package com.oneninedevelopers.glynkinterview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

import layout.defaultFragment;

public class TabsView extends AppCompatActivity {
    MaterialViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tabs_view);
        mViewPager = (MaterialViewPager)findViewById(R.id.materialViewPager);
        Toolbar toolbar = mViewPager.getToolbar();
        TextView header = (TextView)findViewById(R.id.logo_white);
        header.setText("Glynk");
        mViewPager.getViewPager().setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {

            @Override
            public Fragment getItem(int position) {

                switch (position % 3) {

                    case 0:
                        return defaultFragment.newInstance();
                    default:
                        return defaultFragment.newInstance();
                }
            }

            @Override
            public int getCount() {
                return 6;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position % 6) {
                    case 0:
                        return "A LA UNE";
                    case 1:
                        return "SPORT";
                    case 2:
                        return "TECHNOLOGY";
                    case 3:
                        return "DESIGN";
                    case 4:
                        return "LOREM";
                    case 5:
                        return "EL CLASICO";

                }
                return "";
            }
        });

        mViewPager.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {
                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorResAndDrawable(
                                R.color.material_grey_500,
                                getResources().getDrawable(R.drawable.november));

                    case 1:
                        return HeaderDesign.fromColorResAndDrawable(
                                R.color.material_grey_500,
                                getResources().getDrawable(R.drawable.november));

                    case 2:
                        return HeaderDesign.fromColorResAndDrawable(
                                R.color.material_grey_500,
                                getResources().getDrawable(R.drawable.november));
                    case 3:
                        return HeaderDesign.fromColorResAndDrawable(
                                R.color.material_grey_500,
                                getResources().getDrawable(R.drawable.november));
                    case 4:
                        return HeaderDesign.fromColorResAndDrawable(
                                R.color.material_grey_500,
                                getResources().getDrawable(R.drawable.november));
                    case 5:
                        return HeaderDesign.fromColorResAndDrawable(
                                R.color.material_grey_500,
                                getResources().getDrawable(R.drawable.november));



                }



                return null;
            }
        });

        mViewPager.getViewPager().setOffscreenPageLimit(mViewPager.getViewPager().getAdapter().getCount());
        mViewPager.getPagerTitleStrip().setViewPager(mViewPager.getViewPager());
    }
}
