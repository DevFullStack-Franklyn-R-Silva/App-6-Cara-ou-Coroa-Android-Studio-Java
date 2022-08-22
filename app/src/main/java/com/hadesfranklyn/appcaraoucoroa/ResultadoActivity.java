package com.hadesfranklyn.appcaraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageButton imageButtonVoltar;
    private ImageView imageViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageButtonVoltar = findViewById(R.id.imageButtonVoltar);
        imageViewResultado = findViewById(R.id.imageViewResultado);

        //recuperar dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0){//cara
            imageViewResultado.setImageResource(R.drawable.moeda_cara);
        }else{//coroa
            imageViewResultado.setImageResource(R.drawable.moeda_coroa);
        }

        imageButtonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}