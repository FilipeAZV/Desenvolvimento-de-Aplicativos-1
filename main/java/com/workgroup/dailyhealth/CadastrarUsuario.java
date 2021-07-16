package com.workgroup.dailyhealth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class CadastrarUsuario extends AppCompatActivity {

    //Atributos
    TextView txtTitulo, txtInfo;
    EditText edtNomeUsuario, edtEmailUsuario, edtSenhaUsuario, edtRepetirSenhaUsuario;
    Button btnCadastrarUsuario;

    // Banco de Dados Firebase
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastrar_usuario);
        getSupportActionBar().hide();

        //Vincula os componentes
        referenciarcomponentes();

        //Coloca o foco no campo nome
        edtNomeUsuario.requestFocus(); //Foco no primeiro input -> Nome do Usuário

        //Guarda a instancia e a referencia do BD
        database = FirebaseDatabase.getInstance();
        reference = database.getReference();

        //Listener do botão
        btnCadastrarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = edtNomeUsuario.getText().toString().toLowerCase();
                String email = edtEmailUsuario.getText().toString().toLowerCase();
                String senha = edtSenhaUsuario.getText().toString();
                String confirmarSenha = edtRepetirSenhaUsuario.getText().toString();

                cadastrarUsuario(usuario, email, senha, confirmarSenha);
            }
        });
    } // Fecha OnCreate

    private void cadastrarUsuario(String usuario, String email, String senha,String confirmarSenha){
        //Listener  de acesso ao BD
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // Cria os nodes dentro da tabela usuário

                    reference.child("usuario").child(usuario).child("email").setValue(email);
                    reference.child("usuario").child(usuario).child("senha").setValue(confirmarSenha);

                    //Mostrar mensagem de sucesso
                    Toast.makeText(CadastrarUsuario.this, "Usuário cadastrado!" + usuario, Toast.LENGTH_LONG).show();
                    abrirTelaPrincipal();
                }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                //
            }
        });
    }

    private void abrirTelaPrincipal(){
        startActivity(new Intent(this, TelaPrincipal.class));
    }
    private void referenciarcomponentes() {
        edtNomeUsuario = findViewById(R.id.edtNomeUsuario);
        edtEmailUsuario = findViewById(R.id.edtEmailUsuario);
        edtSenhaUsuario = findViewById(R.id.edtSenhaUsuario);
        edtRepetirSenhaUsuario = findViewById(R.id.edtRepetirSenhaUsuario);
        btnCadastrarUsuario = findViewById(R.id.btnCadastrarUsuario);
    }
}