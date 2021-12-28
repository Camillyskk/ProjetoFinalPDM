package com.example.projetopdm;

import static com.example.projetopdm.R.id.body_container_gerente;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class GerenteActivity extends AppCompatActivity {
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerente);

        //iniciar na fragment profile
        getSupportFragmentManager().beginTransaction().replace(body_container_gerente, new ListaClientes_Fragment()).commit();

        navigationView = findViewById(R.id.bottomNavigation);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.clientes:
                        fragment = new ListaClientes_Fragment();
                        break;

                    case R.id.funcionarios:
                        fragment = new ListaFuncionarios_Fragment();
                        break;

                    case R.id.procedimentos:
                        fragment = new ListaProcedimentos_Fragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.body_container_gerente, new ListaClientes_Fragment()).commit();
//                navigationView.setSelectedItemId(profile_item); //tava comentado, se der tilt, comenta de novo

                return true;
            }
        });
    }
}