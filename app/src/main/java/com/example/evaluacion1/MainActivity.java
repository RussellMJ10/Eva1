package com.example.evaluacion1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonIrIMC = findViewById(R.id.buttonIrIMC);
        Button buttonIrGenerador = findViewById(R.id.buttonIrGenerador);

        buttonIrIMC.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, IMC.class);
            startActivity(intent);
        });

        buttonIrGenerador.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, GeneradorNumeros.class);
            startActivity(intent);
        });
    }
}


