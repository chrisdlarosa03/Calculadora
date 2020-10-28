package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addNum(View numero) {
        Button button = (Button) numero;
        String tecla = button.getText().toString();
        TextView screen = (TextView) findViewById(R.id.pantalla);
        String texto = screen.getText().toString();
        switch (numero.getId()){
            case R.id.btn1:
                texto = texto + tecla;
                screen.setText(texto);
                break;
            case R.id.btn2:
                texto = texto + tecla;
                screen.setText(texto);
                break;
            case R.id.btn3:
                texto = texto + tecla;
                screen.setText(texto);
                break;
            case R.id.btn4:
                texto = texto + tecla;
                screen.setText(texto);
                break;
            case R.id.btn5:
                texto = texto + tecla;
                screen.setText(texto);
                break;
            case R.id.btn6:
                texto = texto + tecla;
                screen.setText(texto);
                break;
            case R.id.btn7:
                texto = texto + tecla;
                screen.setText(texto);
                break;
            case R.id.btn8:
                texto = texto + tecla;
                screen.setText(texto);
                break;
            case R.id.btn9:
                texto = texto + tecla;
                screen.setText(texto);
                break;
            case R.id.btn0:
                texto = texto + tecla;
                screen.setText(texto);
                break;
        }
    }
}