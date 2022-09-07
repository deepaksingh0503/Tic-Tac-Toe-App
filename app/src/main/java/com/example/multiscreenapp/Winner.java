package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Winner extends AppCompatActivity {
TextView winnerName;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        Intent intent = getIntent();
        textView= findViewById(R.id.textView);
        String  winner= intent.getStringExtra(MainActivity2.EXTRA_WINNER);
        winnerName= findViewById(R.id.winnerName);
        if(winner.equals("")){
            String k="The Match is Drawn !!!";
            textView.setText("Restart the Game!");
            winnerName.setText(k);
        }else{
            String p="The Winner is  "+ winner + " !!🥳";
            winnerName.setText(p);
        }

    }

    public  void restart(View view){
        Intent intent3= new Intent(this , MainActivity.class);
        intent3.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent3.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent3);
    }


    public void playagain(View view){
        finish();
    }

}