package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userNameBox, passwordBox;
    Button   buttonBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameBox=(EditText)findViewById(R.id.user_nameid);
        passwordBox=(EditText)findViewById(R.id.password_id);
        buttonBox=(Button)findViewById(R.id.login_button);

        View.OnClickListener btn_click=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =userNameBox.getText().toString();
                String password =passwordBox.getText().toString();
                String savedname ="gurpreet";
                String savedpassword="12345678";

                if (name.equals(savedname)&& password.equals(savedpassword))
                {
                    Intent i = new Intent(MainActivity.this, Home_Activity.class);
                    startActivity(i);
                    finish();
                }
                else{

                    Toast.makeText(MainActivity.this, "incorrect input", Toast.LENGTH_SHORT).show();
                }
            }
        };



        buttonBox.setOnClickListener(btn_click);
    }
}








