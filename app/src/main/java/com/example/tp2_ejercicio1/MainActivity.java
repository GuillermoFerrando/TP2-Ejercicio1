package com.example.tp2_ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonCambiar = (Button) findViewById(R.id.Cambiar);
        TextView textoInicial = (TextView) findViewById(R.id.textoprincipal);

        botonCambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });

        datos = getIntent().getExtras();
        String datosobtenidos = datos.getString("texto");
        textoInicial.setText(datosobtenidos);
    }

}
