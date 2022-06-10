package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.Inicio);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Eventos:
                        startActivity(new Intent(getApplicationContext()
                        ,ActivityEvento.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Inicio:
                        return true;
                    case R.id.Perfil:
                        startActivity(new Intent(getApplicationContext()
                                ,ActivityPerfil1.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }

}