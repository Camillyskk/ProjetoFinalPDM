package com.example.projetopdm;

import static com.example.projetopdm.R.id.body_container_adm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AdmActivity extends AppCompatActivity {
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adm);

        getSupportFragmentManager().beginTransaction().replace(body_container_adm, new AdmProfile_Fragment()).commit();

        navigationView = findViewById(R.id.bottomNavigation);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.adm_profile:
                        fragment = new AdmProfile_Fragment();
                        break;

                    case R.id.adm_clientes:
                        fragment = new ListaClientes_Fragment();
                        break;

                    case R.id.agendamentos:
                        fragment = new AgendamentosFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.body_container_adm, new AdmProfile_Fragment()).commit();
//                navigationView.setSelectedItemId(profile_item); //tava comentado, se der tilt, comenta de novo

                return true;
            }
        });
    }
}