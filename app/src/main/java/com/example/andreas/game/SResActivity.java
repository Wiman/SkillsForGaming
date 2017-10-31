package com.example.andreas.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import static com.example.andreas.game.SkillsActivity.textEtt;


public class SResActivity extends AppCompatActivity {

    TextView textView11;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sres);

        textView11 = (TextView) findViewById(R.id.textView11);
        imageView = (ImageView) findViewById(R.id.imageView);
        Bildbild(textEtt);

    }

    public void Bildbild (String textEtt){
        switch (textEtt){
            case "WoW":

                 imageView.setImageResource(R.drawable.warcraftlogo);
                 textView11.setText ("Du vill ha en World of Warcraft spelare!");
                break;
            case "CS":

                 imageView.setImageResource(R.drawable.counterstrikelogo);
                 textView11.setText ("Du vill ha en Counterstrike spelare!");
                break;
            case "LoL":

                 imageView.setImageResource(R.drawable.leagueicon);
                 textView11.setText ("Du vill ha en League of Legends spelare!");
                break;
            case "Eh":

                // imageView.setImageResource(R.drawable.);
                 textView11.setText ("Du vill ha en Eh ..? Gamer!");
                break;
            default:
                textView11.setText("Du har inte valt något bra spel!!");
                break;
        }
    }
}
