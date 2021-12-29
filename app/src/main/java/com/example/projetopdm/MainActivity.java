package com.example.projetopdm;

import static com.example.projetopdm.clinica.Agenda.autenticarUsuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.projetopdm.clinica.Agenda;
import com.example.projetopdm.usuarios.Adm;
import com.example.projetopdm.usuarios.Cliente;
import com.example.projetopdm.usuarios.Gerente;
import com.example.projetopdm.usuarios.Usuario;

public class MainActivity extends AppCompatActivity {
    EditText et_email, et_senha;
    Button bt_entrar, bt_cadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_entrar = findViewById(R.id.entrar);
        bt_cadastrar = findViewById(R.id.bt_cadastro);

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Gerente gerente = new Gerente();
                gerente.setNome("Gerente");
                gerente.setSobrenome("hdjkahdjkah");
                gerente.setEmail("gerente@gmail.com");
                gerente.setSenha("12345678");
                Agenda.usuarios.add(gerente);

                Usuario usuario = new Usuario();
                usuario.setEmail(et_email.getText().toString());
                usuario.setSenha(et_senha.getText().toString());

                Usuario usu = Agenda.autenticarUsuario(usuario);

                if (usu instanceof Gerente) {
                    Intent i = new Intent(getBaseContext(), GerenteActivity.class);
                    startActivity(i);

                } else if (usu instanceof Adm) {
                    Intent i = new Intent(getBaseContext(), AdmActivity.class);
                    startActivity(i);

                } else if (usu instanceof Cliente) {
                    Intent i = new Intent(getBaseContext(), ProfileActivity.class);
                    startActivity(i);

                } else if (usu == null) {
                    Toast.makeText(getApplicationContext(), "Usuário não cadastrado.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "erro.", Toast.LENGTH_SHORT).show();

                }
//                Intent i = new Intent(getBaseContext(), CadastroActivity.class);
//                startActivity(i);
            }
        });

        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent i = new Intent(getBaseContext(), CadastroActivity.class);
                        startActivity(i);

                    }
                });

    }
}