package com.example.andreas.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import static android.R.attr.editable;

public class GamesActivity extends AppCompatActivity {
    Button button7;
    EditText gameTxt, rankTxt, playTimeTxt;
    TextView gameTextOne, textView8;
    ToggleButton fragaEttBtn, toggleButton2, toggleButton3, toggleButton4, toggleButton5, toggleButton6;

    public static String toggleEtt, toggleTva, toggleTre, toggleFyra, toggleFem, toggleSex, buttButt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);


        gameTxt       = (EditText) findViewById(R.id.gameTxt);
        rankTxt       = (EditText) findViewById(R.id.rankTxt);
        playTimeTxt   = (EditText) findViewById(R.id.playTimeTxt);
        button7       = (Button) findViewById(R.id.button7);
        gameTextOne   = (TextView) findViewById(R.id.gameTextOne);
        textView8     = (TextView) findViewById(R.id.gameView8);
        fragaEttBtn   = (ToggleButton) findViewById(R.id.fragaEttBtn);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
        toggleButton3 = (ToggleButton) findViewById(R.id.toggleButton3);
        toggleButton4 = (ToggleButton) findViewById(R.id.toggleButton4);
        toggleButton5 = (ToggleButton) findViewById(R.id.toggleButton5);
        toggleButton6 = (ToggleButton) findViewById(R.id.toggleButton6);



        button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v("EditText", gameTxt.getText().toString());
                        String game = gameTxt.getText().toString();

                        Log.d("EditText", rankTxt.getText().toString());
                        String rank = rankTxt.getText().toString();

                        Log.e("EditText", playTimeTxt.getText().toString());
                        String playTime = playTimeTxt.getText().toString();

                        Log.i("EditText", fragaEttBtn.getText().toString());
                         toggleEtt = fragaEttBtn.getText().toString();
                         toggleTva = toggleButton2.getText().toString();
                         toggleTre = toggleButton3.getText().toString();
                         toggleFyra = toggleButton4.getText().toString();
                         toggleFem = toggleButton5.getText().toString();
                         toggleSex = toggleButton6.getText().toString();

                         buttButt = SpelInfo(game, rank, playTime, toggleEtt);



                        startActivity(new Intent(getApplicationContext(),GResActivity.class));
                    }
                }
        );
        fragaEttBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            int res;

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    res = 1;
                } else {
                    res = 0;
                }
            }

        });

    }

    public String SpelInfo(String game, String rank, String playTime, String toggleEtt) {

        String butt = "";
        int points = 0;
        int time = Integer.parseInt(playTime);

        rank = rank.toLowerCase();
        game = game.toLowerCase();


            switch (game) {
                case "world of warcraft":
                    butt = "Du valde WoW";
                    break;
                case "league of legends":
                    butt = "Du valde LoL";
                    break;
                case "counter strike":
                    butt = "Du valde CS:GO";
                    break;
                default:
                    butt = "Appen hittar inte Spelnamn/Rank";
                    break;
            }
            switch (rank) {
                case "bronze":
                    butt = butt + "\nDin rank är inte tillräckligt hög för att styrka dina kompetenser";
                    break;
                case "silver":
                    butt = butt + "\nDin rank är inte tillräckligt hög för att styrka dina kompetenser";
                    break;
                case "gold":
                    butt = butt + "\nDin rank är inte tillräckligt hög för att styrka dina kompetenser";
                    break;
                case "platinum":
                    butt = butt + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    points = points + 1;
                    break;
                case "diamond":
                    butt = butt + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    points = points + 2;
                    break;
                case "master":
                    butt = butt + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    points = points + 3;
                    break;
                case "challenger":
                    butt = butt + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    points = points + 4;
                    break;
                case "gold nova":
                    butt = butt + "\nDin rank är inte tillräckligt hög för att styrka dina kompetenser";
                    points = points + 1;
                    break;
                case "master guardian":
                    butt = butt + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    points = points + 1;
                    break;
                case "legendary eagle":
                    butt = butt + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    points = points + 1;
                    break;
                case "supreme":
                    butt = butt + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    points = points + 1;
                    break;
                case "global Elite":
                    butt = butt + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    points = points + 1;
                    break;
                default:
                    butt = "Appen hittar inte Spelnamn/Rank";
                    break;
            }

            butt = butt + "\npoints: " + points;

            if (time <= 200) {
                butt = "Din inGameTime är för låg";
            }

            if (toggleEtt.equals("Ja")) {
                butt = butt + "\nWhoopWhoop";
            } else {
                butt = butt + "\nIngen WhoopWhoop";
            }


            return butt;

    }

    public static String Resultat(String toggleEtt, String toggleTva, String toggleTre, String toggleFyra, String toggleFem, String toggleSex) {
        String result="";

        if (toggleEtt.equals("Ja")){
            result = result + "Spelaren blir lätt stressad";
        }
        else {
            result = result + "Spelaren blir inte stressad av spelet";
        }
        if (toggleTva.equals("Ja")){
            result = result + "\nSpelaren är en ledare";
        }
        else {
            result = result + "\nSpelaren är inte en ledare";
        }
        if (toggleTre.equals("Ja")){
            result = result + "\nSpelaren har skapat ett lag";
        }
        else {
            result = result + "\nSpelaren har inte skapat ett lag";
        }
        if (toggleFyra.equals("Spelar i lag")){
            result = result + "\nSpelaren är en teamplayer";
        }
        else {
            result = result + "\nSpelaren är solo spelare";
        }
        if (toggleFem.equals("Ja")){
            result = result + "\nHar deltagit i en turnering";
        }
        else {
            result = result + "\nHar inte spelat i en turnering";
        }
        if (toggleSex.equals("Ja")){
            result = result + "\nSpelaren spelar flera roller";
        }
        else {
            result = result + "\nSpelaren spelar en roll";
        }


        return result;
    }
}
