package com.example.lionsoft.prototiposennova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class RegistroActivity extends AppCompatActivity {

    Spinner spOcupacion;
    List<String> ocupaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        spOcupacion = (Spinner)findViewById(R.id.spOcupacion);
        ocupaciones.get(R.array.ocupacion);
        ArrayAdapter<String> ocupacion = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ocupaciones);
        spOcupacion.setAdapter(ocupacion);

    }
}
