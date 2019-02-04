package com.example.spinnerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

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

        spinnerXML.setOnItemSelectedListener(evento);
    }

    /**
     * @description: Evento para generar interacción cuando se selecciona una opción
     */
    AdapterView.OnItemSelectedListener evento = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(getApplicationContext(), "Objeto seleccionado: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            //Podemos generar una interacción cuando no hay elementos seleccionados
        }
    };
}
