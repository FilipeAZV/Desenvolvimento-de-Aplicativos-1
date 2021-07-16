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

public class CadastrarAlimentos extends AppCompatActivity {
    //Atributos
    //Atributo senha == descricao
    TextView txtTitulo, txtInfoCadastroAlimento;
    EditText edtNomeAlimento, edtMarcaAlimento, edtCaloriasAlimento, edtTurnoAlimento, edtDescricaoAlimento;
    Button btnCadastrarAlimento;

    //Banco de Dados Firebase
    FirebaseDatabase database;
    DatabaseReference reference;

    //Atributo (variável) estática (para ser acessada por outras Classes)
    public static String alimentoInformado;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.tela_cadastrar_alimentos);
            //tira a barra de suporte do app
            getSupportActionBar().hide();

            referenciarElementos();

            //coloca o foco no campo nome alimento
            edtNomeAlimento.requestFocus();

            //Guarda a instancia e a referencia do BD
            database = FirebaseDatabase.getInstance();
            reference = database.getReference();

        btnCadastrarAlimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Guardar as variaveis
                //Transformar em String
                //Colocar todas as letras em minusculo
                String nomeAlimento = edtNomeAlimento.getText().toString().toLowerCase();
                String marcaAlimento = edtMarcaAlimento.getText().toString().toLowerCase();
                String turnoAlimento = edtCaloriasAlimento.getText().toString().toLowerCase();
                String caloriasAlimento = edtTurnoAlimento.getText().toString().toLowerCase();
                String descricaoAlimento = edtDescricaoAlimento.getText().toString().toLowerCase();

                //chama o metodo cadastrar alimento
                cadastrarAlimento(nomeAlimento, marcaAlimento, turnoAlimento, caloriasAlimento, descricaoAlimento);
            }
        });
    }//Fecha o método Oncreate

    private void cadastrarAlimento(String nomeAlimento, String marcaAlimento, String turnoAlimento, String caloriasAlimento, String descricaoAlimento){
        //Listener  de acesso ao BD
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // Cria os nodes dentro da tabela usuário
                if (nomeAlimento.isEmpty()){
                    Toast.makeText(CadastrarAlimentos.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                    edtNomeAlimento.requestFocus();
                }
                alimentoInformado = nomeAlimento;
                reference.child("alimento").child(nomeAlimento).child("Nome_Alimento").setValue(nomeAlimento);
                if (marcaAlimento.isEmpty()){
                    Toast.makeText(CadastrarAlimentos.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                    edtMarcaAlimento.requestFocus();
                }
                reference.child("alimento").child(nomeAlimento).child("Marca_Alimento").setValue(marcaAlimento);
                if(turnoAlimento.isEmpty()){
                    Toast.makeText(CadastrarAlimentos.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                    edtTurnoAlimento.requestFocus();
                }
                reference.child("alimento").child(nomeAlimento).child("Turno").setValue(turnoAlimento);
                if(caloriasAlimento.isEmpty()){
                    Toast.makeText(CadastrarAlimentos.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                    edtCaloriasAlimento.requestFocus();
                }
                reference.child("alimento").child(nomeAlimento).child("Calorias").setValue(caloriasAlimento);
                if(descricaoAlimento.isEmpty()){
                    Toast.makeText(CadastrarAlimentos.this, "Campo deve ser preenchido!", Toast.LENGTH_LONG).show();
                    edtDescricaoAlimento.requestFocus();
                }
                reference.child("alimento").child(nomeAlimento).child("Descricao").setValue(descricaoAlimento);

                //Mostrar mensagem de sucesso
                Toast.makeText(CadastrarAlimentos.this, "Alimento cadastrado!" , Toast.LENGTH_LONG).show();
                abrirTelaVisualizarAlimentos();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                //
            }
        });
    }

    private void abrirTelaVisualizarAlimentos(){
        startActivity(new Intent(this, VisualizarAlimentos.class));
    }

    private void referenciarElementos(){
        edtNomeAlimento = findViewById(R.id.edtNomeAlimento);
        edtMarcaAlimento = findViewById(R.id.edtMarcaAlimento);
        edtCaloriasAlimento = findViewById(R.id.edtCaloriasAlimento);
        edtTurnoAlimento = findViewById(R.id.edtTurnoAlimento);
        edtDescricaoAlimento = findViewById(R.id.edtDescricaoAlimento);
    }
}














