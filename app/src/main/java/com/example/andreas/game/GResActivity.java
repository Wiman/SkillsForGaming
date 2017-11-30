package com.example.andreas.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import static com.example.andreas.game.GamesActivity.game;
import static com.example.andreas.game.GamesActivity.buttButt;
import static com.example.andreas.game.GamesActivity.toggleFem;
import static com.example.andreas.game.GamesActivity.toggleFyra;
import static com.example.andreas.game.GamesActivity.toggleSex;
import static com.example.andreas.game.GamesActivity.toggleTre;
import static com.example.andreas.game.GamesActivity.toggleTva;
import static com.example.andreas.game.GamesActivity.toggleEtt;


public class GResActivity extends AppCompatActivity {
    TextView textView9;
    TextView textView15;
    TextView textView17;
    SeekBar seekbar1, seekbar2, seekbar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gres);
        String spelSkills;
        game = game.toLowerCase();

        switch (game){
            case "world of warcraft":
                spelSkills = "\nDu utvecklar dessa kompetenser: \nTålamod \nKommunikationsfärdigheter \nLedarskapsförmågor";
                break;
            case "league of legends":
                spelSkills = "\nDu utvecklar dessa kompetenser: \nInitiativtagare \nAnsvarstagande \nPrioriteringsförmåga";
                break;
            case "counter strike":
                spelSkills = "\nDu utvecklar dessa kompetenser: \nProblemlösning\nKommunikativa förmågor\nAnsvarstagande ";
                break;
            default:
                spelSkills = "Du har nog stavat fel!";
        }

        spelSkills = spelSkills + "\nFlexibilitet \nFokus \nBeslutsförmåga";

        seekbar1 = (SeekBar) findViewById(R.id.seekbar1);
        seekbar2 = (SeekBar) findViewById(R.id.seekbar2);
        seekbar3 = (SeekBar) findViewById(R.id.seekbar3);

        seekbar1.getProgress();
        seekbar2.getProgress();
        seekbar3.getProgress();

        textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setText(Resultat(toggleEtt, toggleTva, toggleTre, toggleFyra, toggleFem, toggleSex)+"\n" + spelSkills);
        //textView15 = (TextView) findViewById(R.id.textView15) ;
        //textView15.setText(buttButt +"\n" + spelSkills);
        textView17 = (TextView) findViewById(R.id.textView17);


    }

    public static String Resultat(String toggleEtt, String toggleTva, String toggleTre, String toggleFyra, String toggleFem, String toggleSex) {
        String result="";

        if (toggleEtt.equals("Ja")){
            result = result + "Du borde öva din stresstålighet";
        }
        else {
            result = result + "Du bör vara stresstålig";
        }
        if (toggleTva.equals("Ja")){
            result = result + "\n\n\nDu bör ha ledaregenskaper";
        }
        else {
            result = result + "\n\n\nHur bra leder du ett team?";
        }
        /*if (toggleTre.equals("Ja")){
            result = result + "\n\nSpelaren har skapat ett lag";
        }
        else {
            result = result + "\nSpelaren har inte skapat ett lag";
        }*/
        if (toggleFyra.equals("Spelar i lag")){
            result = result + "\n\n\nDu kan ha enklare för lagarbete";
        }
        else {
            result = result + "\n\n\nDu kanske helst jobbar ensam";
        }
        /*if (toggleFem.equals("Ja")){
            result = result + "\nHar deltagit i en turnering";
        }
        else {
            result = result + "\nHar inte spelat i en turnering";
        }*/
        /*if (toggleSex.equals("Ja")){
            result = result + "\nSpelaren spelar flera roller";
        }
        else {
            result = result + "\nSpelaren spelar en roll";
        }*/


        return result;
    }
}
