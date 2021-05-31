package com.example.parcial1tatianaialtanskaia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.util.ArrayList;

public class Cono extends AppCompatActivity {

    private Button continuar, atras;
    private CheckBox gustoVainilla, gustoChocolate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);

        gustoVainilla = findViewById(R.id.boxGustoVainilla);
        gustoChocolate= findViewById(R.id.boxGustoChocolate);

        continuar=findViewById(R.id.btnContinuarGustos);
        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(Cono.this, Cajas.class);
                ArrayList<String> gustosDeHelado=new ArrayList<String>();

                if (gustoVainilla.isChecked()){
                    gustosDeHelado.add("Cono: Vainilla");
                }
                if (gustoChocolate.isChecked()){
                    gustosDeHelado.add("Cono: Chocolate");
                }
                if (gustoVainilla.isChecked() && gustoChocolate.isChecked()){
                    gustosDeHelado.add("Cono: Vainilla, Chocolate");
                }
                intento.putExtra("gustosDeHelado", gustosDeHelado);
                startActivity(intento);
            }
        });

        atras=findViewById(R.id.btnAtrasGustos);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(Cono.this, MainActivity.class);
                startActivity(intento);
            }
        });

    };

}