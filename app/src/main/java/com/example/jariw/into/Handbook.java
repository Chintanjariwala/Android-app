package com.example.jariw.into;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class Handbook extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    WebView web1;
    ProgressBar pbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handbook);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        web1 = (WebView)findViewById(R.id.webView3);

        pbar = (ProgressBar)findViewById(R.id.progressBar3);



      //  web1.getSettings().setJavaScriptEnabled(true);

       // String src="http://docs.google.com/gview?embedded=true&url=http://www.marshall.edu/help/files/Student-Handbook.pdf";
        String doc="<iframe src='http://docs.google.com/viewer?url=http://www.marshall.edu/student-affairs/files/2013/09/Student-Handbook-2012-2013-MU.pdf&embedded=true' width='100%' height='100%'  style='border: none;'></iframe>";

        web1.setVisibility(WebView.VISIBLE);
        web1.getSettings().setJavaScriptEnabled(true);
        web1.getSettings().setAllowFileAccess(true);
        web1.loadData(doc, "text/html", "UTF-8");
        pbar.setVisibility(View.GONE);
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_muonline) {
            startActivity(new Intent(getApplicationContext(),MuOnline.class));
            // Handle the camera action
        } else if (id == R.id.nav_eas) {

            startActivity(new Intent(getApplicationContext(),Emergency.class));
        } else if (id == R.id.nav_events) {
            startActivity(new Intent(getApplicationContext(),Event.class));

        } else if (id == R.id.nav_images) {
            startActivity(new Intent(getApplicationContext(),Image.class));

        }else if (id == R.id.nav_videos) {
            startActivity(new Intent(getApplicationContext(),Video.class));

        } else if (id == R.id.nav_inq) {
            startActivity(new Intent(getApplicationContext(),Feedback.class));

        } else if (id == R.id.nav_home) {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));

        } else if (id == R.id.nav_handbook) {
            startActivity(new Intent(getApplicationContext(),Handbook.class));

        } else if (id == R.id.nav_maps) {
            startActivity(new Intent(getApplicationContext(),Maps.class));

        } else if (id == R.id.nav_lrc) {
            startActivity(new Intent(getApplicationContext(),Lrc.class));

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
