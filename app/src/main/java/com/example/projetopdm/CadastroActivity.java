package com.example.projetopdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {
    EditText et_nome, et_sobrenome, et_email, et_telefone, et_cidade, et_dataNasc, et_RG, et_CPF, et_senha;
    Button cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        et_nome = findViewById(R.id.nome);
        et_sobrenome = findViewById(R.id.sobrenome);
        et_email = findViewById(R.id.email);
        et_telefone = findViewById(R.id.telefone);
        et_cidade = findViewById(R.id.cidade);
        et_dataNasc = findViewById(R.id.dataNasc);
        et_RG = findViewById(R.id.rg);
        et_CPF = findViewById(R.id.cpf);
        et_senha = findViewById(R.id.senha);

        cadastrar = findViewById(R.id.cadastrar);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validarEmail(et_email) && validarTelefone(et_telefone) && validarCidade(et_cidade) && validarSenha(et_senha)){
                    Intent i = new Intent(getBaseContext(), ProfileActivity.class);
                    startActivity(i);
                }
            }
        });
    }

    public static boolean validarEmail(EditText editText){
        String email = editText.getText().toString();
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editText.setError("Insira um E-mail válido.");
            return false;
        }
        return true;
    }

    public static boolean validarSenha(EditText editText){
        String senha = editText.getText().toString();
        if(senha.length()<8){
            editText.setError("A senha precisa ter pelo menos 8 caracteres");
            return false;
        }
        return true;
    }

    public static boolean validarTelefone(EditText editText){
        String telefone = editText.getText().toString();
        if(telefone.length()<11){
            editText.setError("O telefone precisa ter 11 digitos, incluindo o DDD.");
            return false;
        }
        return true;
    }

    public static boolean validarCidade(EditText editText) {
        if(TextUtils.isEmpty(editText.getText().toString())){
            editText.setError("Este campo não pode ficar vazio!");
            return false;
        }
        return true;
    }
}