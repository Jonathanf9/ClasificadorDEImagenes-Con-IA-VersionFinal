package com.example.ageclassifier;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Inicio extends AppCompatActivity implements View.OnClickListener {
// creación de variables
    Button camara, info;
// redireccionamiento de botones

    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        camara = (Button) findViewById(R.id.Camara);
        info = (Button) findViewById(R.id.info);

    }
// metodo de incorporación de camara
    @Override
    public void onClick(View view) {
        if (view == camara) {
            Intent intent = new Intent(Inicio.this, MainActivity.class);

            startActivity(intent);

// metodo de incorporación de info
        }

        if (view == info) {
            Intent intent = new Intent(Inicio.this, Funcionamiento.class);

            startActivity(intent);


        }
}
}
