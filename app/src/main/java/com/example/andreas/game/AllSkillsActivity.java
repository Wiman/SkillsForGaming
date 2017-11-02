package com.example.andreas.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import static com.example.andreas.game.SkillsActivity.textEtt;

public class AllSkillsActivity extends AppCompatActivity {

    TextView textView12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_skills);

        textView12 = (TextView) findViewById(R.id.textView12);

        switch (textEtt) {

            case "WoW":

                textView12.setText
                        ("Sammarbetsförmåga\n" +
                        "Konfliktlösningsförmåga\n" +
                        "Fokus\n" +

                        "Ledarskapsförmågor\n" +
                        "Kommunikativa förmågor\n" +
                        "Beslutstagningsförmåga\n" +
                        "Tålamod\n" +
                        "Flexibel\n" +

                        "Problemlösning\n" +
                        "Teknik/It -intresse\n" +
                        "Prioriteringsförmåga\n" +
                        "Engelska");
                break;

            case "Cs":

                textView12.setText("Du vill ha en Counter-Strike spelare!");
                break;

            case "LoL":

                textView12.setText("Du vill ha en League of Legends spelare!");
                break;
        }
    }
}
