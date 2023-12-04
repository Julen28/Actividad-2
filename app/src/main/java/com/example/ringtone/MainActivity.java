package com.example.ringtone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
        Button btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20;

        btn1 = findViewById(R.id.button1);

        // Mostrar el diálogo de alerta utilizando la función de extensión
        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
        dialogo1.setTitle("¡FELICIDADES!");
        dialogo1.setMessage("¡Has ganado un punto!");
        dialogo1.setCancelable(false);
        dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                aceptar();
            }
        });
        dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                cancelar();
            }
        });
        dialogo1.show();
    }
    public void aceptar() {
        Toast t=Toast.makeText(this,"¡Vuelve pronto!", Toast.LENGTH_SHORT);
        t.show();
    }
    public void cancelar() {
        finish();


        /*
        // Reproduce audio 1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp1.isPlaying()){
                    mp1.pause();
                    Toast.makeText(MainActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp1.start();
                    Toast.makeText(MainActivity.this,"Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn11 = findViewById(R.id.descargar1);

        //Ejecuta la descarga del botón 1
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url1);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        //Comparte audio 1
        share1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });
         */
    }
}