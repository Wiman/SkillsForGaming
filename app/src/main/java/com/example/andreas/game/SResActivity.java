package com.example.andreas.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import static com.example.andreas.game.SkillsActivity.textEtt;

public class SResActivity extends AppCompatActivity {

    TextView textView11;
    ImageView imageView;
    public static String enkelt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sres);

        textView11 = (TextView) findViewById(R.id.textView11);
        imageView = (ImageView) findViewById(R.id.imageView);
        Button clickWoW = (Button) findViewById(R.id.WoW);
        Button clickLoL = (Button) findViewById(R.id.LoL);
        Button clickCS = (Button) findViewById(R.id.CS);
        Bildbild(textEtt);

    }

    public void Bildbild (String textEtt){

        Button clickWoW = (Button) findViewById(R.id.WoW);
        Button clickLoL = (Button) findViewById(R.id.LoL);
        Button clickCS = (Button) findViewById(R.id.CS);


        clickCS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                // button.setText("Win");
                enkelt = "Cs";
                startActivity(new Intent(getApplicationContext(),AllSkillsActivity.class));
            }
        });

        clickLoL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                // button.setText("Win");
                enkelt = "LoL";
                startActivity(new Intent(getApplicationContext(),AllSkillsActivity.class));
            }
        });

        clickWoW.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                // button.setText("Win");
                enkelt = "WoW";
                startActivity(new Intent(getApplicationContext(),AllSkillsActivity.class));
            }
        });

       if(textEtt == null){
           imageView.setImageResource(R.drawable.tecken);
           textView11.setText("Du har inte valt något bra spel!!");
       }
       else{

           switch (textEtt){

               case "WoW":
                   imageView.setImageResource(R.drawable.warcraftlogo);
                   textView11.setText ("Du vill ha en World of Warcraft spelare!");
                    clickWoW.setVisibility(View.VISIBLE);
                   break;

               case "Cs":
                   imageView.setImageResource(R.drawable.counterstrikelogo);
                   textView11.setText ("Du vill ha en Counter-Strike spelare!");
                   clickCS.setVisibility(View.VISIBLE);
                   break;

               case "LoL":
                   imageView.setImageResource(R.drawable.leagueicon);
                   textView11.setText ("Du vill ha en League of Legends spelare!");
                   clickLoL.setVisibility(View.VISIBLE);
                   break;

               case "LoL/WoW":
                   imageView.setImageResource(R.drawable.wowlolicon);
                   textView11.setText ("Du vill ha en League of Legends eller en World of Warcraft spelare!");
                   clickWoW.setVisibility(View.VISIBLE);
                   clickLoL.setVisibility(View.VISIBLE);

                   break;

               case "Cs/LoL":
                   imageView.setImageResource(R.drawable.cslolicon);
                   textView11.setText ("Du vill ha en Counter-Strike eller en League of Legends Spelare!");
                   clickLoL.setVisibility(View.VISIBLE);
                   clickCS.setVisibility(View.VISIBLE);

                   break;

               case "Cs/WoW":
                   imageView.setImageResource(R.drawable.wowcsicon);
                   textView11.setText ("Du vill ha en Counter-Strike eller en World of Warcraft spelare!");
                   clickWoW.setVisibility(View.VISIBLE);
                   clickCS.setVisibility(View.VISIBLE);
                   break;

               case "Eh":
                   imageView.setImageResource(R.drawable.tecken);
                   textView11.setText ("Du vill ha en Eh ..? Gamer!");
                   break;

               default:
                   imageView.setImageResource(R.drawable.tecken);
                   textView11.setText("Du har inte valt något bra spel!!");
                   break;
           }

       }


    }
}
