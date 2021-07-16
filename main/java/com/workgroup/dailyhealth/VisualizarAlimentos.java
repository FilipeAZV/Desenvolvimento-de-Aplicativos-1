package com.workgroup.dailyhealth;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class VisualizarAlimentos extends AppCompatActivity {
    //Atributo
    TextView txtInfo, txtTitulo;
    EditText edtAlimentos;
    Button btnEditar, btnExcluir;

    //Banco de dados firebase
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_visualizar_alimentos);
        //deixa a barra de suporte escondida
        getSupportActionBar().hide();

        //vincula o elemento
        edtAlimentos = findViewById(R.id.edtAlimentos);

        // Guardar a instancia e a refentica do BD
        database = FirebaseDatabase.getInstance();
        reference = database.getReference();

        //metodo para mostrar os dados do alimento
        carregarDadosAlimento();

    }//fecha metodo onCreate

    private void carregarDadosAlimento(){
        // Listener de acesso ao BD
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String alimento = CadastrarAlimentos.alimentoInformado;
                String marca = snapshot.child("alimento").child(alimento).child("Marca_Alimento").getValue().toString();
                String turno = snapshot.child("alimento").child(alimento).child("Turno").getValue().toString();
                String calorias = snapshot.child("alimento").child(alimento).child("Calorias").getValue().toString();
                String descicao = snapshot.child("alimento").child(alimento).child("Descricao").getValue().toString();

                String dados = "Nome Alimento: " + alimento;
                dados += "\n\nMarca: " + marca;
                dados += "\n\nTurno: " + turno;
                dados += "\n\nCalorias: " + calorias;
                dados += "\nDescrição: " + descicao;
                dados += "\n";

                // Mostrar dados do usuario na tela
                edtAlimentos.setText(dados);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}