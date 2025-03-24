package com.ifsc.contaclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Integer i=0;
EditText edpeso, edaltura;
TextView tvresultadoimc;
Button buttonCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edpeso = findViewById(R.id.edpeso);
        edaltura = findViewById(R.id.edaltura);
        tvresultadoimc=findViewById(R.id.tvresultadoimc);
        buttonCalcular = findViewById(R.id.button);
        buttonCalcular.setOnClickListener(V->{
            double peso, altura, imc;

            peso=Double.parseDouble(edpeso.getText().toString());
            altura= Double.parseDouble(edaltura.getText().toString());
            imc=peso/(altura);



            tvresultadoimc.setText(Double.toString(imc));
        });

    }
}