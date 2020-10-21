package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    final private int REQUEST_CODE_ASK_PERMISSION = 111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        solicitarPermisos();

    }

    private void solicitarPermisos() {
        int permisoStorage = ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE);
        int permisoCamera = ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA);

        if(permisoStorage != PackageManager.PERMISSION_GRANTED) {
            if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.M) {
                requestPermissions(new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, REQUEST_CODE_ASK_PERMISSION);
            }
        }
    }

    public void addNum(View numero) {
        Button button = (Button) numero;
        String valor = button.getText().toString();
    }
}