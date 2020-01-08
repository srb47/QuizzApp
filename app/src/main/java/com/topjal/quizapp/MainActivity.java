package com.topjal.quizapp;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.navigation.NavigationView;
import com.topjal.quizapp.Fragment.FragmentAbout;
import com.topjal.quizapp.Fragment.FragmentHome;
import com.topjal.quizapp.Fragment.FragmentHt;
import com.topjal.quizapp.Fragment.FragmentLb;
import com.topjal.quizapp.Fragment.FragmentMentors;
import com.topjal.quizapp.Fragment.FragmentMgq;
import com.topjal.quizapp.Fragment.FragmentPrivacy;
import com.topjal.quizapp.Fragment.FragmentQc;
import com.topjal.quizapp.Fragment.FragmentQp;
import com.topjal.quizapp.Fragment.FragmentSm;
import com.topjal.quizapp.Fragment.FragmentTermsCondition;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Dialog MyDialog;
    Button hello, close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        Menu menu = navigationView.getMenu();

        // find MenuItem you want to change
        /** MenuItem nav_home = menu.findItem(R.id.action_settings);
        nav_home.setVisible(false);**/
        navigationView.setNavigationItemSelectedListener(this);

        View headView = navigationView.getHeaderView(0);
        /**ImageView imgProfile = headView.findViewById(R.id.imgProfile);
        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity1.this,ProfileActivity.class);
                startActivity(i);
            }
        });**/

        //default fragment for home
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.flMain,new FragmentHome());
        ft.commit();

        navigationView.setCheckedItem(R.id.nav_home);
        //navigationView.getMenu().getItem(1).setActionView(R.layout.menu_image);
    }

    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void MyCustomAlertDialog(){
        MyDialog = new Dialog(MainActivity.this);
        MyDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        MyDialog.setContentView(R.layout.activity_rating);
        MyDialog.setTitle("My Custom Dialog");

        hello = (Button)MyDialog.findViewById(R.id.hello);
        close = (Button)MyDialog.findViewById(R.id.close);

        hello.setEnabled(true);
        close.setEnabled(true);

        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.topjal.denguestp"));
                startActivity(intent);
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog.cancel();
            }
        });

        MyDialog.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_profile) {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flMain,new FragmentHome());
            ft.commit();

        } else if (id == R.id.nav_qc) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flMain,new FragmentQc());
            ft.commit();

        } else if (id == R.id.nav_qp) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flMain,new FragmentQp());
            ft.commit();

        } else if (id == R.id.nav_sm) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flMain,new FragmentSm());
            ft.commit();

        } else if (id == R.id.nav_mgq) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flMain,new FragmentMgq());
            ft.commit();

        } else if (id == R.id.nav_mentors) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flMain,new FragmentMentors());
            ft.commit();

        } else if (id == R.id.nav_lb) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flMain,new FragmentLb());
            ft.commit();

        } else if (id == R.id.nav_ht) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flMain,new FragmentHt());
            ft.commit();

        } else if (id == R.id.nav_about) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flMain,new FragmentAbout());
            ft.commit();

        } else if (id == R.id.nav_privacy) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flMain,new FragmentPrivacy());
            ft.commit();

        } else if (id == R.id.nav_terms) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flMain,new FragmentTermsCondition());
            ft.commit();

        } else if (id == R.id.rating) {
            MyCustomAlertDialog();


        } else if (id == R.id.nav_share) {
            Intent shareintent = new Intent();
            shareintent.setAction(Intent.ACTION_SEND);
            shareintent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id="+ getApplicationContext().getPackageName());
            shareintent.setType("Text/Plain Text");
            shareintent.putExtra(Intent.EXTRA_SUBJECT, "Hi, Check out me!");
            shareintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
            startActivity(Intent.createChooser(shareintent, "Share via"));
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }

    public void showTost(String message){

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
