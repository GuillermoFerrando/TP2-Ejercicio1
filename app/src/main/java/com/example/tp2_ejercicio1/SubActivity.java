package com.example.tp2_ejercicio1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactividad);

        Button okBoton = (Button) findViewById(R.id.ok);
        Button cancelarBoton = (Button) findViewById(R.id.cancelar);
        final TextView texto = (TextView) findViewById(R.id.textoeditable);

        okBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, MainActivity.class);
                intent.putExtra("texto", texto.getText());
                startActivity(intent);
            }
        });

        cancelarBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

