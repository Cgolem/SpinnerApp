package com.example.spinnerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerOpciones, spinnerXML;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerOpciones = (Spinner) findViewById(R.id.spinnerOpciones);
        spinnerXML = (Spinner) findViewById(R.id.spinnerXML);

        //Arreglo para el primer spinner
        final String[] datos = new String[] {"Primaria", "Secundaria", "Preparatoria", "Universidad"};

        //Indicamos la actividad en la que nos encontramos (getApplicationContext), la vista que tendrá y por último, el arreglo a leer
        ArrayAdapter<String> adaptadorOpciones = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, datos);

        spinnerOpciones.setAdapter(adaptadorOpciones);

        //Arreglo para Spinner con XML
        ArrayAdapter<CharSequence> adaptadorXML = ArrayAdapter.createFromResource(getApplicationContext(), R.array.valores_spinner, android.R.layout.simple_spinner_item);

        spinnerXML.setAdapter(adaptadorXML);
    }
}
