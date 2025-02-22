package com.example.appmovil1450478;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnCancelar =findViewById(R.id.btnCancelar);
        Button btnRegister =findViewById(R.id.btnRegister);
        Button btnLimpiar =findViewById(R.id.btnLimpiar);
        EditText txtNombres = findViewById(R.id.txtNombres);
        EditText txtCorreo = findViewById(R.id.txtCorreo);
        EditText txtTelefono = findViewById(R.id.txtTelefono);
        EditText txtContraseña = findViewById(R.id.txtContraseña);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conectar = new Intent(Register.this,MainActivity.class);
                startActivity(conectar);
            }
        });
    }
}