package com.example.jariw.into;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Emergency extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }
    public void call(View view) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);

        switch (view.getId()) {
            case R.id.button5:
                callIntent.setData(Uri.parse("tel:911"));
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(this,
                            new String[]{Manifest.permission.CALL_PHONE},   //request specific permission from user
                            10);
                    return;
                } else {
                    try {
                        startActivity(callIntent);  //call activity and make phone call
                    } catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(getApplicationContext(), "yourActivity is not founded", Toast.LENGTH_SHORT).show();
                    }


                }
                break;

            case R.id.button6:
                callIntent.setData(Uri.parse("tel:+13046964686"));
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            10);
                    return;
                } else {
                    try {
                        startActivity(callIntent);  //call activity and make phone call
                    } catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(getApplicationContext(), "yourActivity is not founded", Toast.LENGTH_SHORT).show();
                    }


                }
                break;
            case R.id.button2:
                callIntent.setData(Uri.parse("tel:+13046964357"));
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            10);
                    return;
                } else {
                    try {
                        startActivity(callIntent);
                    } catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(getApplicationContext(), "yourActivity is not founded", Toast.LENGTH_SHORT).show();
                    }


                }
                break;
            case R.id.button3:
                sendToPublic();
                break;
            case R.id.button7:
                sendToEM();
                break;
            case R.id.button8:
                sendToAlert();
                break;

            default:
                break;
        }
    }
    protected void sendToPublic() {
        String url = "https://www.marshall.edu/mupd/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    protected void sendToEM() {
        String url = "https://www.marshall.edu/emergency/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    protected void sendToAlert() {
        String url = "http://www.marshall.edu/emergency/mualert/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
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

        } else if (id == R.id.nav_videos) {
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
