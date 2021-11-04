package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class LoginAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button = (Button) findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do something in response to button click
                login();
            }
        });
    }

    public void login(){
        TextView usernameET = findViewById(R.id.username);
        TextView passwordET = findViewById(R.id.password);

        String username = usernameET.getText().toString();
        String password = passwordET.getText().toString();

        if(username.equals("test") && password.equals("123456")){
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            this.finish();
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), "Akun tidak ditemukan", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}