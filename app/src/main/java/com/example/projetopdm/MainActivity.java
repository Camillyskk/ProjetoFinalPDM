package com.example.projetopdm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projetopdm.database.Conexao;


public class MainActivity extends AppCompatActivity {

    ConstraintLayout activity_main;

    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_main = (ConstraintLayout) findViewById(R.id.activity_main);
        Conexao.criarConexao(activity_main, getBaseContext());

        botao = findViewById(R.id.button2);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CadastroActivity.class);
                startActivity(i);
            }
        });

    }


}