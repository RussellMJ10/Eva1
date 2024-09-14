package com.example.evaluacion1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class GeneradorNumeros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generador_numeros);

        EditText editTextMinimo = findViewById(R.id.editTextMinimo);
        EditText editTextMaximo = findViewById(R.id.editTextMaximo);
        Button buttonGenerarNumero = findViewById(R.id.buttonGenerarNumero);
        TextView textViewResultadoNumero = findViewById(R.id.textViewResultadoNumero);

        buttonGenerarNumero.setOnClickListener(v -> {
            String minimoText = editTextMinimo.getText().toString().trim();
            String maximoText = editTextMaximo.getText().toString().trim();

            if (minimoText.isEmpty() || maximoText.isEmpty()) {
                textViewResultadoNumero.setText("Por favor, ingresa ambos valores.");
                return;
            }

            try {
                int minimo = Integer.parseInt(minimoText);
                int maximo = Integer.parseInt(maximoText);

                if (minimo >= maximo) {
                    textViewResultadoNumero.setText("El número máximo debe ser mayor que el mínimo.");
                    return;
                }

                Random random = new Random();
                int numeroAleatorio = random.nextInt((maximo - minimo) + 1) + minimo;

                textViewResultadoNumero.setText(String.valueOf(numeroAleatorio));
            } catch (NumberFormatException e) {
                textViewResultadoNumero.setText("Error en los datos ingresados");
            }
        });
    }
}

