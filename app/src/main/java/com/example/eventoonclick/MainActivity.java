package com.example.eventoonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*Declaracion de los componentes que se hacen
    * en la vista*/
    private EditText txtNombre;
    private Button btnAceptar1;
    private Button btnAceptar2;
    private Button btnAceptar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
        onClickLegacy();

    }

    private void onClickLegacy() {
        btnAceptar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txtNombre.getText().toString();
                Toast.makeText(getApplicationContext(),nombre,Toast.LENGTH_SHORT).show();
                txtNombre.setText("");
            }
        });
    }

    private void initComponent() {
        txtNombre = findViewById(R.id.txtNombre);
        btnAceptar1 = findViewById(R.id.btnAceptar1);
        btnAceptar2 = findViewById(R.id.btnAceptar2);
        btnAceptar3 = findViewById(R.id.btnAceptar3);
    }
}
