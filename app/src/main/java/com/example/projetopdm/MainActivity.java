package com.example.projetopdm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projetopdm.database.DadosOpenHelper;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    SQLiteDatabase conexao;
    DadosOpenHelper dadosOpenHelper;
    ConstraintLayout activity_main;

    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_main = (ConstraintLayout) findViewById(R.id.activity_main);
        criarConexao();

        botao = findViewById(R.id.button2);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CadastroActivity.class);
                startActivity(i);
            }
        });

    }

    private void criarConexao() {
        try {
            dadosOpenHelper = new DadosOpenHelper(this);

            conexao = dadosOpenHelper.getWritableDatabase();

            Snackbar.make(activity_main, R.string.message_conexao_ok, Snackbar.LENGTH_LONG).setAction(R.string.message_ok, null).show();

        } catch (SQLException ex) {
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle(R.string.message_erro);
            dlg.setMessage(ex.getMessage());
            dlg.setNeutralButton(R.string.message_ok, null);
            dlg.show();
        }

    }
}