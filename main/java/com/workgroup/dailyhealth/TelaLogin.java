package com.workgroup.dailyhealth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class TelaLogin extends AppCompatActivity {

    //Atributos
    EditText edtInsiraEmail, edtInsiraSenha;
    Button btnEntrar, btnCadastrar;

    //Banco de Dados Firebase
    FirebaseDatabase database;
    DatabaseReference reference;

    //Atributo (variável) estática (para ser acessada por outras Classes)
    public static  String usuarioInformado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);
        getSupportActionBar().hide();

        //Vincula os componentes
        referenciarcomponentes();

        //Guarda a instancia e a referencia do BD
        database = FirebaseDatabase.getInstance();
        reference = database.getReference();

        //Coloca o foco no campo usuário
        edtInsiraEmail.requestFocus();

        //Listener dos botões
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                efetuarLogin();

            }
        });

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTelaCadastro();
            }
        });

    }//Fecha met Oncreate


    private void efetuarLogin() {
        carregarDadosUsuario();

        /*// Guarda o Usuário e a Senha informados
        usuarioInformado = edtInsiraEmail.getText().toString().toLowerCase();
        final String senhaInformada = edtInsiraSenha.getText().toString();

        // Listener de acesso ao BD
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // Verifica se o Usuário NÃO existe
                if (snapshot.child("usuario").child(usuarioInformado).getValue() == null) {
                    Toast.makeText(TelaLogin.this, "Usuário inválido", Toast.LENGTH_SHORT).show();

                } else {
                    // Verifica se a Senha está correta
                    if (snapshot.child("usuario").child(usuarioInformado).child("senha").getValue().equals(senhaInformada)) {
                        carregarDadosUsuario();

                    } else {
                        Toast.makeText(TelaLogin.this, "Senha inválida", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                //
            }
        });*/
    } // fecha o método efetuarLogin

    private void carregarDadosUsuario(){
        //Cria Intent
        Intent telaPrincipal = new Intent(TelaLogin.this, TelaPrincipal.class);

        //Passa o usuário informado pela Intent
        telaPrincipal.putExtra("usuarioInformado", usuarioInformado);

        // Envia para a tela principal
        startActivity(telaPrincipal);

    }

    private void referenciarcomponentes(){
        edtInsiraEmail = findViewById(R.id.edtInsiraEmail);
        edtInsiraSenha = findViewById(R.id.edtInsiraSenha);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        btnEntrar = findViewById(R.id.btnEntrar);
    }

    private void abrirTelaCadastro(){
        startActivity(new Intent(this,CadastrarUsuario.class));
    }
}
