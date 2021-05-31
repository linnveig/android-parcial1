package com.example.parcial1tatianaialtanskaia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class Pote extends AppCompatActivity {

    private Button continuar, atras;
    private CheckBox gustoVainilla, gustoChocolate, gustoMascarpone, gustoTramontana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pote);

        gustoVainilla = findViewById(R.id.boxGustoVainillaVaso);
        gustoChocolate= findViewById(R.id.boxGustoChocolateVaso);
        gustoMascarpone= findViewById(R.id.boxGustoMascarponeVaso);
        gustoTramontana= findViewById(R.id.boxGustoTramontanaPote);

        continuar=findViewById(R.id.btnContinuarVaso);
        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(Pote.this, Cajas.class);
                ArrayList<String> gustosDeHelado=new ArrayList<String>();

                if (gustoVainilla.isChecked()){
                    gustosDeHelado.add("Pote: Vainilla");
                }
                if (gustoChocolate.isChecked()){
                    gustosDeHelado.add("Pote: Chocolate");
                }
                if (gustoMascarpone.isChecked()){
                    gustosDeHelado.add("Pote: Mascarpone");
                }
                if (gustoTramontana.isChecked()){
                    gustosDeHelado.add("Pote: Tramontana");
                }
                if (gustoVainilla.isChecked() && gustoChocolate.isChecked()){
                    gustosDeHelado.add("Pote: Vainilla, Chocolate");
                }
                if (gustoVainilla.isChecked() && gustoMascarpone.isChecked()){
                    gustosDeHelado.add("Pote: Vainilla, Mascarpone");
                }
                if (gustoChocolate.isChecked() && gustoTramontana.isChecked()){
                    gustosDeHelado.add("Pote: Chocolate, Mascarpone");
                }
                if (gustoVainilla.isChecked() && gustoTramontana.isChecked()){
                    gustosDeHelado.add("Pote: Vainilla, Chocolate");
                }
                if (gustoChocolate.isChecked() && gustoTramontana.isChecked()){
                    gustosDeHelado.add("Pote: Vainilla, Chocolate");
                }
                if (gustoMascarpone.isChecked() && gustoTramontana.isChecked()){
                    gustosDeHelado.add("Pote: Vainilla, Chocolate");
                }
                if (gustoVainilla.isChecked() && gustoChocolate.isChecked() && gustoMascarpone.isChecked() && gustoTramontana.isChecked()){
                    gustosDeHelado.add("Pote: Vainilla, Chocolate, Mascarpone, Tramontana");
                }
                intento.putExtra("gustosDeHelado", gustosDeHelado);
                startActivity(intento);
            }
        });

        atras=findViewById(R.id.btnAtrasVaso);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(Pote.this, MainActivity.class);
                startActivity(intento);
            }
        });
    }
}