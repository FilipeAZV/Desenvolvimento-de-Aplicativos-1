package com.workgroup.dailyhealth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class CadastrarFichaMedica extends AppCompatActivity {

    TextView txtTitulo, txtCadastro, txtDoadorSangue, txtDoadorOrgaos;
    EditText edtNascimento, edtPeso, edtAltura, edtDoencas, edtAlergias, edtSangue, edtMedicamentos, edtMedicamentosTomados,
            edtContatos;
    RadioButton rdbDoadorSangueS, rdbDoadorSangueN, rdbDoadorOrgaosS, rdbDoadorOrgaosN;
    Button btnCadastrar;

    // Banco de Dados Firebase
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastrar_ficha_medica);
        getSupportActionBar().hide();

        //vincular
        vinculaElementos();

        //coloca o foco no campo nome alimento
        edtNascimento.requestFocus();

        //cria o listner do botão cadastrar
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nascimento = edtNascimento.getText().toString();
                String peso = edtPeso.getText().toString();
                String  altura = edtAltura.getText().toString();
                String doenca = edtDoencas.getText().toString();
                String alergias = edtAlergias.getText().toString();
                String sangue = edtSangue.getText().toString();
                String medicamentosAlergico = edtMedicamentos.getText().toString();
                String medicamentosTomados = edtMedicamentosTomados.getText().toString();
                String contato = edtContatos.getText().toString();

                String doadorSangue = "Sim";

                if(rdbDoadorSangueS.isChecked()){
                    doadorSangue = "Sim";
                }else {
                    doadorSangue = "Não";
                }

                String doadorOrgaos = "Sim";

                if(rdbDoadorOrgaosS.isChecked()){
                    doadorOrgaos = "Sim";
                }else {
                    doadorOrgaos = "Não";
                }

                //chama o metodo cadastrar a ficha médica
                cadastrarFichaMedica(nascimento, peso, altura, doenca, alergias, sangue,
                        medicamentosAlergico, medicamentosTomados, contato, doadorSangue, doadorOrgaos);
            }
        });



    }//fecha mo metodo Oncreate
    private void abrirTelaVisualizarFichaMedica(){
        startActivity(new Intent(CadastrarFichaMedica.this, VisualizarFichaMedica.class));
    }

    private void cadastrarFichaMedica(String nascimento, String peso, String altura, String doenca,
                                      String alergias, String sangue, String medicamentosAlergico, String medicamentosTomados,
                                      String contato, String doadorSangue, String doadorOrgaos){
        //Listener  de acesso ao BD
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String nome = TelaLogin.usuarioInformado;


                // Cria os nodes dentro da tabela usuário
                if (nascimento.isEmpty()){
                    Toast.makeText(CadastrarFichaMedica.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                    edtNascimento.requestFocus();
                }
                reference.child("Ficha_Médica").child(nome).child("Nascimento").setValue(nascimento);


                if (peso.isEmpty()){
                    Toast.makeText(CadastrarFichaMedica.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                    edtPeso.requestFocus();
                }
                reference.child("Ficha_Médica").child(nome).child("Peso").setValue(peso);


                if (altura.isEmpty()){
                    Toast.makeText(CadastrarFichaMedica.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                    edtAltura.requestFocus();
                }
                reference.child("Ficha_Médica").child(nome).child("Altura").setValue(altura);


                if (doenca.isEmpty()){
                    Toast.makeText(CadastrarFichaMedica.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                    edtDoencas.requestFocus();
                }
                reference.child("Ficha_Médica").child(nome).child("Doenças").setValue(doenca);


                if (alergias.isEmpty()){
                    Toast.makeText(CadastrarFichaMedica.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                    edtAlergias.requestFocus();
                }
                reference.child("Ficha_Médica").child(nome).child("Alergias").setValue(alergias);


                if (sangue.isEmpty()){
                    Toast.makeText(CadastrarFichaMedica.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                    edtSangue.requestFocus();
                }
                reference.child("Ficha_Médica").child(nome).child("Sangue").setValue(sangue);


                if (medicamentosAlergico.isEmpty()){
                    Toast.makeText(CadastrarFichaMedica.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                    edtMedicamentos.requestFocus();
                }
                reference.child("Ficha_Médica").child(nome).child("Medicamentos_Alergico").setValue(medicamentosAlergico);


                if (medicamentosTomados.isEmpty()){
                    Toast.makeText(CadastrarFichaMedica.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                    edtMedicamentosTomados.requestFocus();
                }
                reference.child("Ficha_Médica").child(nome).child("Medicamentos_Tomados").setValue(medicamentosTomados);


                if (contato.isEmpty()){
                    Toast.makeText(CadastrarFichaMedica.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                    edtContatos.requestFocus();
                }
                reference.child("Ficha_Médica").child(nome).child("Contato").setValue(contato);

                if (doadorSangue.isEmpty()){
                    Toast.makeText(CadastrarFichaMedica.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                }
                reference.child("Ficha_Médica").child(nome).child("Doador_Sangue").setValue(doadorSangue);


                if (doadorOrgaos.isEmpty()){
                    Toast.makeText(CadastrarFichaMedica.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                }
                reference.child("Ficha_Médica").child(nome).child("Doador_Orgaõs").setValue(doadorOrgaos);


                //Mostrar mensagem de sucesso
                Toast.makeText(CadastrarFichaMedica.this, "Ficha cadastrada!" , Toast.LENGTH_LONG).show();
                abrirTelaVisualizarFichaMedica();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                //
            }
        });
    }

    private void vinculaElementos(){
        edtNascimento = findViewById(R.id.edtNascimento);
        edtPeso = findViewById(R.id.edtPeso);
        edtAltura = findViewById(R.id.edtAltura);
        edtDoencas = findViewById(R.id.edtDoencas);
        edtAlergias = findViewById(R.id.edtAlergias);
        edtSangue = findViewById(R.id.edtSangue);
        edtMedicamentos = findViewById(R.id.edtMedicamentos);
        edtMedicamentosTomados = findViewById(R.id.edtMedicamentosTomados);
        edtContatos = findViewById(R.id.edtContatos);
        rdbDoadorOrgaosS = findViewById(R.id.rdbDoadorOrgaosS);
        rdbDoadorSangueS = findViewById(R.id.rdbDoadorSangueS);
        btnCadastrar = findViewById(R.id.btnCadastrar);
    }
}