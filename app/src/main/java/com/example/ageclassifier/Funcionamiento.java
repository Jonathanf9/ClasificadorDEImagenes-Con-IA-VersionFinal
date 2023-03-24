package com.example.ageclassifier;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Funcionamiento extends AppCompatActivity implements View.OnClickListener{
    // creación de variables
    Button info, inicio;

    //método de incoporación de la pantalla de funcionamiento

    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funcionamiento);


    }
// redireccionamiento del botón funcionamiento
    @Override
    public void onClick(View view) {
        if (view == info) {
            Intent intent = new Intent(this, MainActivity.class);

            startActivity(intent);


        }
    }
}
