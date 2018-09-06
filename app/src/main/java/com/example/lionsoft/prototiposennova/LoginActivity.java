package com.example.lionsoft.prototiposennova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText etNombreUser, etPassUser;
    Button btnIngresar;
    TextView tvRegistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etNombreUser = (EditText)findViewById(R.id.etNombreUsuario);
        etPassUser = (EditText)findViewById(R.id.etPassUsuario);
        btnIngresar = (Button)findViewById(R.id.btnIngresar);
        tvRegistrar = (TextView)findViewById(R.id.tvRegistrar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    public void text_click(View view){
        Intent registro = new Intent(LoginActivity.this,RegistroActivity.class);
        startActivity(registro);
        finish();
    }
}
