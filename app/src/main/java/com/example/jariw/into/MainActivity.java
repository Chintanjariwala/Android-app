package com.example.jariw.into;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageButton webBtn,webBtn2,webBtn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View backgroundimage = findViewById(R.id.content_main);
        Drawable background = backgroundimage.getBackground();
        background.setAlpha(130);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        webBtn = (ImageButton) findViewById(R.id.imageButton8);
        webBtn2 = (ImageButton) findViewById(R.id.imageButton9);
        webBtn3 = (ImageButton) findViewById(R.id.imageButton10);

        webBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendTofacebook();
            }
        });
        webBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToinsta();
            }
        });
        webBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToyoutube();
            }
        });
    }
    public void MuOnline(View v) {


        startActivity(new Intent(getApplicationContext(),MuOnline.class));

    }
    public void Feedback(View v) {


        startActivity(new Intent(getApplicationContext(),Feedback.class));

    }
    public void Emergency(View v) {


        startActivity(new Intent(getApplicationContext(),Emergency.class));

    }
    public void Lrc(View v) {


        startActivity(new Intent(getApplicationContext(),Lrc.class));

    }
    public void Handbook(View v) {


        startActivity(new Intent(getApplicationContext(),Handbook.class));

    }
    public void Maps(View v) {


        startActivity(new Intent(getApplicationContext(),Maps.class));

    }
    public void Video(View v) {


        startActivity(new Intent(getApplicationContext(),Video.class));

    }
    public void Image(View v) {


        startActivity(new Intent(getApplicationContext(),Image.class));

    }
    public void Event(View v) {


        startActivity(new Intent(getApplicationContext(),Event.class));

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

    protected void sendToyoutube() {
        String url = "https://www.youtube.com/user/HerdVideo";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    protected void sendTofacebook() {
        String url = "https://www.facebook.com/INTOMarshallUniversity/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    protected void sendToinsta() {
        String url = "https://www.instagram.com/intomarshall/?hl=en";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
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
