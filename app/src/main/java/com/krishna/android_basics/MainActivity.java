package com.krishna.android_basics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uName = username.getText().toString().trim();
                String pass = password.getText().toString().trim();

                if (uName.isEmpty()){
                    username.setError("required");
                    username.requestFocus();
                    return;
                }

                if (pass.isEmpty())
                {
                    password.setError("Please Enter Password");
                    password.requestFocus();
                    return;
                }

                if (!(pass.length() >6)){
                    password.setError("Length should be more tham 6 letters");
                    password.requestFocus();
                    return;
                }

                Toast.makeText(MainActivity.this, "Username is :"+uName+"Password is :"+pass, Toast.LENGTH_SHORT).show();
            }
        });





    }
}