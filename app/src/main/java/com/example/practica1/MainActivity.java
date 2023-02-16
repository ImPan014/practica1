package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText etNombre;
    Button btnEnviar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar  =  findViewById(R.id.btnEnviar);
        etNombre = findViewById(R.id.idTextNombre);
        Bundle caja = new Bundle();

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this, intentLlegada.class);
                caja.putString("nombre", etNombre.getText().toString());
                next.putExtras(caja);
                startActivity(next);
            }
        });
    }
}