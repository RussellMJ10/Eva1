package com.example.evaluacion1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class IMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imc);

        EditText editTextPeso = findViewById(R.id.editTextPeso);
        EditText editTextAltura = findViewById(R.id.editTextAltura);
        Button buttonCalcularIMC = findViewById(R.id.buttonCalcularIMC);
        TextView textViewResultado = findViewById(R.id.textViewResultado);

        buttonCalcularIMC.setOnClickListener(v -> {
            try {
                float peso = Float.parseFloat(editTextPeso.getText().toString());
                float altura = Float.parseFloat(editTextAltura.getText().toString());
                float imc = peso / (altura * altura);

                String clasificacion;
                if (imc < 18.5) {
                    clasificacion = "Bajo peso";
                } else if (imc < 24.9) {
                    clasificacion = "Normal";
                } else {
                    clasificacion = "Sobrepeso";
                }

                textViewResultado.setText(String.format("IMC: %.2f\nClasificación: %s", imc, clasificacion));
            } catch (NumberFormatException e) {
                textViewResultado.setText("Error en los datos ingresados");
            }
        });
    }
}
