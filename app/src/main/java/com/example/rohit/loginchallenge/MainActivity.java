package com.example.rohit.loginchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickLogin(View view){
        EditText usernameEditText= (EditText) findViewById(R.id.usernameEditText);
        EditText passwordEditText= (EditText) findViewById(R.id.passwordEditText);
        Log.i("username and password",usernameEditText.getText().toString()+passwordEditText.getText().toString());
        Toast.makeText(this,"Hello"+ usernameEditText.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
