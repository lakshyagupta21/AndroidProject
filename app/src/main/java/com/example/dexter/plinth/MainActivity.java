package com.example.dexter.plinth;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends FragmentActivity {

    ViewPager mViewPager;
    final String[] data ={"Home","About","Events","Sponsors","FAQ","Contact us"};
    PagerTitleStrip pts;
    DemoCollectionPagerAdapter mDemoCollectionPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        mViewPager = (ViewPager)findViewById(R.id.pager);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        mDemoCollectionPagerAdapter = new DemoCollectionPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mDemoCollectionPagerAdapter);
        pts = (PagerTitleStrip)findViewById(R.id.pager_title_strip);
        pts.setTextSize(TypedValue.COMPLEX_UNIT_PX, 60);
        pts.setGravity(17);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);

        final DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawer_layout);
        final RelativeLayout drawerlayout = (RelativeLayout)findViewById(R.id.left_drawer);
        final ListView navList = (ListView) findViewById(R.id.drawer);
        navList.setAdapter(adapter);
        navList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int pos, long id) {
                drawer.setDrawerListener(new DrawerLayout.SimpleDrawerListener() {
                    @Override
                    public void onDrawerClosed(View drawerView) {
                        super.onDrawerClosed(drawerView);

                    }
                });
                drawer.closeDrawer(drawerlayout);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
    public class DemoCollectionPagerAdapter extends FragmentPagerAdapter {

        public DemoCollectionPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {


            switch(i)
            {
                case 0 :
                    return new Synopsis();


                case 1 : return new ProblemStatement();

                case 2 : return new Rules();

                case 3 : return new Register_Transporter();



            }
            return new Fragment();
        }

        @Override
        public int getCount() {
            // For this contrived example, we have a 2-object collection.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.tab1).toUpperCase();
                case 1:
                    return getString(R.string.tab2).toUpperCase();
                case 2:
                    return getString(R.string.tab3).toUpperCase();
                case 3:
                    return getString(R.string.tab4).toUpperCase();

            }

            return null;
        }
    }
}
