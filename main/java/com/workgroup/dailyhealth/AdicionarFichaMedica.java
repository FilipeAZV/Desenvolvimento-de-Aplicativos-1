package com.workgroup.dailyhealth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AdicionarFichaMedica extends AppCompatActivity {

    TextView txtTitulo, txtInfo;
    ImageButton btnAdicionarFichaMedica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_add_ficha_medica);

        //tira a barra de suporte do app
        getSupportActionBar().hide();

        //vincula o elemento
        btnAdicionarFichaMedica = findViewById(R.id.btnAdicionarFichaMedica);

        //cria um listner do botão
        btnAdicionarFichaMedica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdicionarFichaMedica.this, CadastrarFichaMedica.class));
            }
        });
    }
}
