package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name1;
    EditText name2;

    public static final String  EXTRA_NAME1="com.example.multiscreenapp.extra.NAME1";
    public static final String  EXTRA_NAME2="com.example.multiscreenapp.extra.NAME2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  void ChangeActivity(View v){
//        Toast.makeText(this, "Opening Second Activity ", Toast.LENGTH_SHORT).show();

        name1= findViewById(R.id.name1);
        name2= findViewById(R.id.name2);
        String textName1=name1.getText().toString();
        String textName2=name2.getText().toString();
        Intent intent=new Intent(this , MainActivity2.class);
        intent.putExtra(EXTRA_NAME1,textName1);
        intent.putExtra(EXTRA_NAME2,textName2);
        startActivity(intent);
    }
}