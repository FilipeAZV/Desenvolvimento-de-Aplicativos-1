package com.workgroup.dailyhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TelaPrincipal extends AppCompatActivity {

    ImageButton btnAlimentos, btnFichaMedica, btnAgua, btnAtividadesFisicas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal);
        getSupportActionBar().hide();


        //ALIMENTOS
        this.btnAlimentos = findViewById(R.id.btnAlimentos);

        btnAlimentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTelaVisualizarAlimentos();
            }
        });

        //FICHA MÉDICA
        this.btnFichaMedica = findViewById(R.id.btnFichaMedica);


        btnFichaMedica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTelaAdicionarFichaMedica();
            }
        });

        //ÁGUA
        this.btnAgua = findViewById(R.id.btnAgua);

        btnAgua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTelaAgua();
            }
        });

        //ATIVIDADES FÍSICAS
        this.btnAtividadesFisicas = findViewById(R.id.btnAtividadesFisicas);

        btnAtividadesFisicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTelaAtividadesFisicas();
            }
        });
    }

    private void abrirTelaVisualizarAlimentos() {
        Intent telaVisualizarAlimentos = new Intent(this, VisualizarAlimentos.class);
        startActivity(telaVisualizarAlimentos);
    }

    private void abrirTelaAdicionarFichaMedica() {
        Intent telaAdicionarFichaMedica = new Intent(this, AdicionarFichaMedica.class);
        startActivity(telaAdicionarFichaMedica);
    }

    private void abrirTelaAgua() {
        Intent telaAgua = new Intent(this, Agua.class);
        startActivity(telaAgua);
    }

    private void abrirTelaAtividadesFisicas() {
        Intent telaAtividadesFisicas = new Intent(this, AtividadesFisicas.class);
        startActivity(telaAtividadesFisicas);
    }
}