package com.example.guia5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnConversacion, btnLogin, btnCalculadora, btnDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        btnConversacion = findViewById(R.id.btnConversation);
        btnLogin = findViewById(R.id.btnLogin);
        btnCalculadora = findViewById(R.id.btnCalculadora);


        btnConversacion.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
        btnCalculadora.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnConversation:{
                Intent i = new Intent(this, Conversacion.class);
                startActivity(i);

            }break;
            case R.id.btnLogin:{
                Intent i = new Intent(this, Login.class);
                startActivity(i);

            }break;
            case R.id.btnCalculadora:{
                Intent i = new Intent(this, Calculadora.class);
                startActivity(i);

            }break;

        }
    }
}