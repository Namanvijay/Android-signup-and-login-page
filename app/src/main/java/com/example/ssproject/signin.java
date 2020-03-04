package com.example.ssproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signin extends AppCompatActivity {

    Button button1;
    EditText etname,etpass,etemail;
    String name,pass,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        button1=(Button)findViewById(R.id.button1);
        etname=(EditText)findViewById(R.id.name);
        etpass=(EditText)findViewById(R.id.password);
        etemail=(EditText) findViewById(R.id.email);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=etname.getText().toString().trim();
                pass=etpass.getText().toString().trim();
                email=etemail.getText().toString().trim();
                if(name.equals("")|| pass.equals("")|| email.equals(""))
                Toast.makeText(getApplicationContext(),"Enter your complete credetials to login",Toast.LENGTH_LONG).show();
                else
                    startActivity(new Intent(signin.this,home.class));
            }
        });



    }
}
