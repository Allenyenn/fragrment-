package com.example.teachnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView nav_btn=findViewById(R.id.nav_btn);
        getSupportFragmentManager().beginTransaction().replace(R.id.nav_view,new Fragment_A()).commit();

        nav_btn.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case
                            R.id .nav_btn_A:
                        getSupportFragmentManager().beginTransaction().replace(R.id.nav_view,new Fragment_A()).commit();
                    return true;
                    case
                            R.id .nav_btn_B:
                        getSupportFragmentManager().beginTransaction().replace(R.id.nav_view,new Fragment_B()).commit();
                        return true;
                    case
                            R.id .nav_btn_C:
                        getSupportFragmentManager().beginTransaction().replace(R.id.nav_view,new Fragment_C()).commit();
                        return true;
                }
                return false;
            }
        });
    }
}