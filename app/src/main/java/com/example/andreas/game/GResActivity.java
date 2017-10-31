package com.example.andreas.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import static com.example.andreas.game.GamesActivity.toggleFem;
import static com.example.andreas.game.GamesActivity.toggleFyra;
import static com.example.andreas.game.GamesActivity.toggleSex;
import static com.example.andreas.game.GamesActivity.toggleTre;
import static com.example.andreas.game.GamesActivity.toggleTva;
import static com.example.andreas.game.GamesActivity.toggleEtt;


public class GResActivity extends AppCompatActivity {
    TextView textView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gres);

        textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setText(GamesActivity.Resultat(toggleEtt, toggleTva, toggleTre, toggleFyra, toggleFem, toggleSex));
        textView9.setTextSize(25);


    }
}
