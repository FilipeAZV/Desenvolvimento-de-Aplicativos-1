package com.workgroup.dailyhealth;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class VisualizarFichaMedica extends AppCompatActivity {

    //Atributos
    TextView txtTitulo, txtInfo;
    EditText edtListaFichaMedica;
    Button btnEditar;

    //Banco de dados firebase
    FirebaseDatabase database;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_visualizar_ficha_medica);
        //deixa a barra de suporte escondida
        getSupportActionBar().hide();

        //vincula o elemento
        edtListaFichaMedica = findViewById(R.id.edtListaFichaMedica);

        // Guardar a instancia e a refentica do BD
        database = FirebaseDatabase.getInstance();
        reference = database.getReference();

        //metodo para mostrar os dados do alimento
        //carregarDadosAlimento();


    }//fecha metodo Oncreate

    private void carregarDadosAlimento(){
        // Listener de acesso ao BD
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String nome = TelaLogin.usuarioInformado;
                String nascimento = snapshot.child("Ficha_Médica").child(nome).child("Nascimento").getValue().toString();
                String peso = snapshot.child("Ficha_Médica").child(nome).child("Peso").getValue().toString();
                String altura = snapshot.child("Ficha_Médica").child(nome).child("Altura").getValue().toString();
                String doenca = snapshot.child("Ficha_Médica").child(nome).child("Doenças").getValue().toString();
                String alergia = snapshot.child("Ficha_Médica").child(nome).child("Alergias").getValue().toString();
                String sangue = snapshot.child("Ficha_Médica").child(nome).child("Sangue").getValue().toString();
                String medicamentosAlergico = snapshot.child("Ficha_Médica").child(nome).child("Medicamentos_Alergico").getValue().toString();;
                String medicamentosTomados = snapshot.child("Ficha_Médica").child(nome).child("Medicamentos_Tomados").getValue().toString();;
                String contato = snapshot.child("Ficha_Médica").child(nome).child("Contato").getValue().toString();;
                String doadorSangue = snapshot.child("Ficha_Médica").child(nome).child("Doador_Sangue").getValue().toString();;
                String doadorOrgaos = snapshot.child("Ficha_Médica").child(nome).child("Doador_Orgaõs").getValue().toString();

                String dados = "Seu nome: " + nome;
                dados += "\n\nNasceu em: " + nascimento;
                dados += "\n\nPeso: " + peso;
                dados += "\n\nAltura: " + altura;
                dados += "\n\nDoenças que possuí: " + doenca;
                dados += "\n\nAlergias: " + alergia;
                dados += "\n\nTipo Sanguineo: " + sangue;
                dados += "\n\nMedicamentos que é alergico: " + medicamentosAlergico;
                dados += "\n\nMedicamentos Tomados: " + medicamentosTomados;
                dados += "\n\nContatos para emergências: " + contato;
                dados += "\n\nDoador de Sangue?: " + doadorSangue;
                dados += "\n\nDoador de Orgaõs?: " + doadorOrgaos;
                dados += "\n";


                // Mostrar dados do usuario na tela
                edtListaFichaMedica.setText(dados);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}