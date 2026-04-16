package com.example.quiz;



import static android.content.Context.MODE_PRIVATE;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;


public class MainActivity extends AppCompatActivity {



    Spinner spinner = findViewById(R.id.categoria);

    String[] opciones = {"Deportes", "Música", "Cine"};


    ArrayAdapter<String> adapter = new ArrayAdapter<>(
            this,
            android.R.layout.simple_spinner_item,
            opciones
    );


    Button ingresar = findViewById(R.id.ingresar);

  {

        String categoria = spinner.getSelectedItem().toString();

            Intent intent;

            if (categoria.equals("Deportes")) {
                intent = new Intent(MainActivity.this, Deportes.class);
            } else if (categoria.equals("Música")) {
                intent = new Intent(MainActivity.this, Musica.class);
            } else {
                intent = new Intent(MainActivity.this, Cine.class);
            }

            startActivity(intent);
        }
    }




