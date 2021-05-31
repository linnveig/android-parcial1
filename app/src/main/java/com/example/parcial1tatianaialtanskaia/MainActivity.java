package com.example.parcial1tatianaialtanskaia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button seleccionarCono, seleccionarVaso, seleccionarPote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seleccionarCono=findViewById(R.id.btnCono);
        seleccionarCono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(MainActivity.this, Cono.class);
                startActivity(intento);
            }
        });

        seleccionarVaso=findViewById(R.id.btnVaso);
        seleccionarVaso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(MainActivity.this, Vaso.class);
                startActivity(intento);
            }
        });

        seleccionarPote=findViewById(R.id.btnPote);
        seleccionarPote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(MainActivity.this, Pote.class);
                startActivity(intento);
            }
        });
    }
}