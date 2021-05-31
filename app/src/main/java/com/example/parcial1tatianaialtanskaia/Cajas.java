package com.example.parcial1tatianaialtanskaia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Cajas extends AppCompatActivity {

    private Button atras, caja1, caja2, caja3;
    private int contadorCaja1, contadorCaja2, contadorCaja3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cajas);

        //ArrayList<String> gustosYcajas=getIntent().getStringArrayListExtra("gustosDeHelado");

        caja1=findViewById(R.id.btnCaja1);

        caja1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(Cajas.this, MainActivity.class);

                if (contadorCaja1<=5){
                    contadorCaja1++;
                }
                startActivity(intento);
            }
        });

        caja2=findViewById(R.id.btnCaja2);
        caja2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(Cajas.this, MainActivity.class);

                contadorCaja2++;

                startActivity(intento);
            }
        });

        caja3=findViewById(R.id.btnCaja3);
        caja3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(Cajas.this, MainActivity.class);

                contadorCaja3++;

                startActivity(intento);
            }
        });

        atras=findViewById(R.id.btnAtrasCajas);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(Cajas.this, Cono.class);
                startActivity(intento);
            }
        });

    }
}