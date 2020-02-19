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

    /*
     * No es necesario declararlo
     * ni instanciarlo*/
    private Button btnAceptar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
        onClickLegacy();
        onClickLambda();

    }

    private void onClickLambda() {
        btnAceptar2.setOnClickListener(v -> {
            showToast();
        });
    }

    private void onClickLegacy() {
        btnAceptar1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showToast();
            }
        });
    }

    public void onclickFromLayout(View view) {
        showToast();
    }

    private void showToast() {
        String nombre = txtNombre.getText().toString();
        Toast.makeText(getApplicationContext(), nombre, Toast.LENGTH_SHORT).show();
        txtNombre.setText("");
    }

    private void initComponent() {

        txtNombre = findViewById(R.id.txtNombre);
        btnAceptar1 = findViewById(R.id.btnAceptar1);
        btnAceptar2 = findViewById(R.id.btnAceptar2);
    }
}