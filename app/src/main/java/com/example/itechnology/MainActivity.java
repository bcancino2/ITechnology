package com.example.itechnology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText editCorreo, editContra;
    public Button btn_login;
    public String correo = "correo@correo.cl";
    public String contrasena = "contra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EnviarDatos();
    }

    void EnviarDatos(){
        editCorreo = (EditText)findViewById(R.id.txtCorreo);
        editContra = (EditText)findViewById(R.id.txtContrasena);
        btn_login = (Button)findViewById(R.id.btnEnviar);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editCorreo.getText().toString().equals(correo) && editContra.getText().toString().equals(contrasena)){
                    Toast.makeText(MainActivity.this, "Usuario Correcto", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                    intent.putExtra("correo", editCorreo.getText().toString()+"");
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
