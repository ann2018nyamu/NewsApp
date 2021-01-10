package com.example.bitcoinapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity {
    NavController navController;
    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        DashboardFragment dashboardFragment = new DashboardFragment();
        //getSupportFragmentManager().beginTransaction().replace(R.id.fragment, dashboardFragment, "dashboard_fragment").commit();
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        navController = navHostFragment.getNavController();
        navController.navigate(R.id.dashboardFragment);
        bottomNav = findViewById(R.id.bottom_nav_view);
        bottomNav.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

    }



        //openFragment(new HomeFragment());

    private void openFragment(AccountFragment homeFragment) {

      // bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.onNa())
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);

    }
    BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId())
        {
            case R.id.home:
                Toast.makeText(DashboardActivity.this,"home", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.trend:
                Toast.makeText(DashboardActivity.this,"trend", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.account:
                Toast.makeText(DashboardActivity.this,"account", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(DashboardActivity.this,"setting", Toast.LENGTH_SHORT).show();

                break;
        }
        return true;
    }
};
}
