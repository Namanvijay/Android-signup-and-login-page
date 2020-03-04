package com.example.ssproject;

import android.content.Intent;
import android.media.MediaExtractor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    Button button2;
    EditText pass1;
    EditText name1;
    EditText conpass;
    EditText email1;
    String spass1,sname1,sconpass1,semail1;
    RadioGroup radioGroup;
    RadioButton radiobutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        button2=(Button)findViewById(R.id.confirm1);
        conpass=(EditText) findViewById(R.id.conpass);
        email1=(EditText)findViewById(R.id.email1);
        pass1=(EditText)findViewById(R.id.pass1);
        name1=(EditText)findViewById(R.id.name1);
        radioGroup=(RadioGroup)findViewById(R.id.radiogender);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spass1=pass1.getText().toString().trim();
                sname1=name1.getText().toString().trim();
                sconpass1=name1.getText().toString().trim();
                semail1=email1.getText().toString().trim();
                int selectedid=radioGroup.getCheckedRadioButtonId();
                radiobutton=(RadioButton)findViewById(selectedid);
                if(selectedid==-1)
                    Toast.makeText(getApplicationContext(),"SELECT YOUR GENDER ",Toast.LENGTH_SHORT).show();



                    if(spass1.equals("")|| semail1.equals("")|| sconpass1.equals("")|| sname1.equals(""))
                        Toast.makeText(getApplicationContext(),"Enter the proper credetials ",Toast.LENGTH_LONG).show();
                    else
                        startActivity(new Intent(signup.this,home.class));








            }
        });




    }
}
