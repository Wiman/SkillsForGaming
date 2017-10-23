package com.example.andreas.game;

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
    TextView gameTextOne;
    ToggleButton fragaEttBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);


        gameTxt = (EditText) findViewById(R.id.gameTxt);
        rankTxt = (EditText) findViewById(R.id.rankTxt);
        playTimeTxt = (EditText) findViewById(R.id.playTimeTxt);
        button7 = (Button) findViewById(R.id.button7);
        gameTextOne = (TextView) findViewById(R.id.gameTextOne);
        fragaEttBtn = (ToggleButton) findViewById(R.id.fragaEttBtn);


        button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.v("EditTest", gameTxt.getText().toString());
                        String game = gameTxt.getText().toString();

                        Log.d("EditTest", rankTxt.getText().toString());
                        String rank = rankTxt.getText().toString();

                        Log.e("EditTest", playTimeTxt.getText().toString());
                        String playTime = playTimeTxt.getText().toString();

                        gameTextOne.setText(SpelInfo(game, rank, playTime)); //test it
                        gameTextOne.setVisibility(View.VISIBLE);
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

    public String SpelInfo(String game, String rank, String playTime) {

        String butt = "";
        int points = 0;
        int time = Integer.parseInt(playTime);

        switch (game) {
            case "World of Warcraft":
                butt = "Du valde WoW";
                break;
            case "League of Legends":
                butt = "Du valde LoL";
                break;
            case "Counter Strike":
                butt = "Du valde CS:GO";
                break;
            default:
                butt = "Appen hittar inte Spelnamn/Rank";
                break;
        }
        switch (rank) {
            case "Bronze":
                butt = butt + "\nDin rank är inte tillräckligt hög för att styrka dina kompetenser";
                break;
            case "Silver":
                butt = butt + "\nDin rank är inte tillräckligt hög för att styrka dina kompetenser";
                break;
            case "Gold":
                butt = butt + "\nDin rank är inte tillräckligt hög för att styrka dina kompetenser";
                break;
            case "Platinum":
                butt = butt + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                points = points + 1;
                break;
            case "Diamond":
                butt = butt + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                points = points + 2;
                break;
            case "Master":
                butt = butt + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                points = points + 3;
                break;
            case "Challenger":
                butt = butt + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                points = points + 4;
                break;
            default:
                butt = "Appen hittar inte Spelnamn/Rank";
                break;
        }

        butt = butt + "\npoints: " + points;

        if (time <= 200) {
            butt = "Din inGameTime är för låg";
        }

        return butt;
    }

    public int Resultat(int res) {
        int result = 0;
        result = result + res;
        return result;
    }
}