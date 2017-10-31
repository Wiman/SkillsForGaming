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
        //textView11.setText(textEtt);
        //imageView.setImageResource(R.drawable.warcraftlogo);
    }

    public void Bildbild (String textEtt){
        switch (textEtt){
            case "WoW":
                //död kod
                 imageView.setImageResource(R.drawable.warcraftlogo);
                // textView11.setText ("Du vill ha en riktig WoW Gamer!");
                break;
            case "CS":
                //död kod
                 imageView.setImageResource(R.drawable.counterstrikelogo);
                // textView11.setText ("Du vill ha en riktig CS Gamer!");
                break;
            case "LoL":
                //död kod
                 imageView.setImageResource(R.drawable.leagueicon);
                // textView11.setText ("Du vill ha en riktig LoL Gamer!");
                break;
            case "Eh":
                //död kod
                // imageView.setImageResource(R.drawable.);
                 textView11.setText ("Du vill ha en riktig Eh ..? Gamer!");
                break;
            default:
                textView11.setText("Du har inte valt något bra spel!!");
                break;
        }
    }
}
