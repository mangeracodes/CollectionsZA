package com.example.collectionsza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText username,password;
Button btnlogin;
String correct_username ="admin";
String correct_password ="Password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnlogin = findViewById(R.id.login);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //validate inputs
                if(TextUtils.isEmpty(username.getText().toString())|| TextUtils.isEmpty(password.getText().toString())){
                    Toast.makeText(MainActivity.this, "Empty data provided", Toast.LENGTH_SHORT).show();

                }else if(username.getText().toString().equals(correct_username)){
                    //check password
                    if(password.getText().toString().equals(correct_password)){
                        Toast.makeText(MainActivity.this, "Successfully logged in", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(MainActivity.this, "Invalid username/Password", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Invalid username/password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}