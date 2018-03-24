package com.lopez00024614.tennisscore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Match extends AppCompatActivity {

    int points = 0;
    String name1, name2;
    TextView player1Name, player2Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        player1Name = (TextView) findViewById(R.id.playe1_name);
        player2Name = (TextView) findViewById(R.id.player2_name);


    }

    public void NewGame(View view){
        Intent newGame = new Intent(this,Nombres.class);
        startActivity(newGame);
    }



}
