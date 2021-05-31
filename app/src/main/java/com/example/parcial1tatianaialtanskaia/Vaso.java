package com.example.parcial1tatianaialtanskaia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class Vaso extends AppCompatActivity {

    private Button continuar, atras;
    private CheckBox gustoVainilla, gustoChocolate, gustoMascarpone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaso);

        gustoVainilla = findViewById(R.id.boxGustoVainillaVaso);
        gustoChocolate= findViewById(R.id.boxGustoChocolateVaso);
        gustoMascarpone= findViewById(R.id.boxGustoMascarponeVaso);

        continuar=findViewById(R.id.btnContinuarVaso);
        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(Vaso.this, Cajas.class);
                ArrayList<String> gustosDeHelado=new ArrayList<String>();

                if (gustoVainilla.isChecked()){
                    gustosDeHelado.add("Vaso: Vainilla");
                }
                if (gustoChocolate.isChecked()){
                    gustosDeHelado.add("Vaso: Chocolate");
                }
                if (gustoMascarpone.isChecked()){
                    gustosDeHelado.add("Vaso: Mascarpone");
                }
                if (gustoVainilla.isChecked() && gustoChocolate.isChecked()){
                    gustosDeHelado.add("Cono: Vainilla, Chocolate");
                }
                if (gustoVainilla.isChecked() && gustoMascarpone.isChecked()){
                    gustosDeHelado.add("Vaso: Vainilla, Mascarpone");
                }
                if (gustoChocolate.isChecked() && gustoMascarpone.isChecked()){
                    gustosDeHelado.add("Vaso: Chocolate, Mascarpone");
                }
                if (gustoVainilla.isChecked() && gustoChocolate.isChecked() && gustoMascarpone.isChecked()){
                    gustosDeHelado.add("Vaso: Vainilla, Chocolate, Mascarpone");
                }
                intento.putExtra("gustosDeHelado", gustosDeHelado);
                startActivity(intento);
            }
        });

        atras=findViewById(R.id.btnAtrasVaso);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(Vaso.this, MainActivity.class);
                startActivity(intento);
            }
        });
    }
}