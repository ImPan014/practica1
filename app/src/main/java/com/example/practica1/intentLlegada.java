package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class intentLlegada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView idBienvenida;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_llegada);

        idBienvenida = findViewById(R.id.idBienvenida);
        Bundle caja = getIntent().getExtras();
        idBienvenida.setText("Bienvenido wey! "+caja.getString("nombre", "No definido")+"!");
    }
}