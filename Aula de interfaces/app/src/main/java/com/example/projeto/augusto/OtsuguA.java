package com.example.projeto.augusto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OtsuguA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otsugu);
    }

    public void abrirTela1(View v){

        //Abre a tela Tela1
        Intent it = new Intent(this, Tela1.class);
        startActivity(it);

    }

    public void abrirTela2(View v){

        //Abre a tela Tela2
        Intent it = new Intent(this, Tela2.class);
        startActivity(it);

    }
}
