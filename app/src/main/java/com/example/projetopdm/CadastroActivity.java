package com.example.projetopdm;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Date;

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
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                if(validarNome(et_nome) && validarNome(et_sobrenome) && validarRG(et_RG) && validarCPF(et_CPF) && validarDataNasc(et_dataNasc) && validarEmail(et_email) && validarTelefone(et_telefone) && validarCidade(et_cidade) && validarSenha(et_senha)){
                    Intent i = new Intent(getBaseContext(), ProfileActivity.class);
                    startActivity(i);
                }
            }
        });
    }

    public static boolean validarNome(EditText editText){
        String nome = editText.getText().toString();
        if(nome.length()<1){
            editText.setError("Este campo não pode ficar em branco.");
            return false;
        }
        return true;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static boolean validarDataNasc(EditText editText){
        String data = editText.getText().toString();

        String dateFormat = "dd/MM/uuuu";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat).withResolverStyle(ResolverStyle.STRICT);

        try{
            LocalDate date = LocalDate.parse(data, dateTimeFormatter);
            return true;
        }
        catch (DateTimeParseException e){
            return false;
        }
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

    public static boolean validarRG(EditText editText){
        String rg = editText.getText().toString();
        if(rg.length()<6){
            editText.setError("Digite um número de RG válido.");
            return false;
        }
        return true;
    }

    public static boolean validarCPF(EditText editText){
        String cpf = editText.getText().toString();
        if(cpf.length()<11){
            editText.setError("Digite um número de CPF válido e sem os pontos.");
            return false;
        }
        return true;
    }
}