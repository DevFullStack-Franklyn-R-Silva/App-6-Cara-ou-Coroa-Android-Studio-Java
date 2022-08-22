package com.hadesfranklyn.appcaraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton imageButtonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtonJogar = findViewById(R.id.imageButtonJogar);

        imageButtonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                //Passar dados para proxima tela
                int numero = new Random().nextInt(2); // 0 1
                intent.putExtra("numero", numero);

                startActivity(intent);
            }
        });
    }
}