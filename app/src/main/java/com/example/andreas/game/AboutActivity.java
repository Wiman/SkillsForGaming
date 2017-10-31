package com.example.andreas.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        final TextView aboutText = (TextView) findViewById(R.id.textView7);

        aboutText.setText("\n \nHello world! \n\nWe are doing this prototype to demonstrate what skills gamers aquire while playing videogames." +
                "\u000BVideogames today require the players to engage in strategical thinking, teamworking and individual growth. " +
                "\u000BAnd practice makes perfect. Gamers spend an incredible amout of time unknowingly developing these skills.");
    }
}
