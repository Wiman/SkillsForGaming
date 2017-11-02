package com.example.andreas.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



import static com.example.andreas.game.SResActivity.enkelt;

public class AllSkillsActivity extends AppCompatActivity {

    TextView textView12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_skills);

        textView12 = (TextView) findViewById(R.id.textView12);

        switch (enkelt) {

            case "WoW":

                textView12.setText
                        (
                        "Dom här skillsen får personen av att spela WoW\n" +
                        "\n" +
                        "RelationsKompetens</b>\n" +
                        "Sammarbetsförmåga\n" +
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

                textView12.setText (
                        "Dom här skillsen får personen av att spela CS\n" +
                        "\n" +
                        "Sammarbetsförmåga\n" +
                        "Ansvarstagande\n" +
                        "Fokus\n" +

                        "Ledarskapsförmågor?\n" +
                        "Kommunikativa förmågor\n" +
                        "Beslutstagningsförmåga\n" +
                        "Initiativtagande\n" +
                        "Flexibel\n" +

                        "Problemlösning\n" +
                        "Teknik/It -intresse\n" +

                        "Engelska");
                break;

            case "LoL":

                textView12.setText(
                        "Dom här skillsen får personen av att spela LoL\n" +
                        "\n" +
                        "Sammarbetsförmåga\n" +
                        "Ansvarstagande\n" +
                        "Konfliktlösningsförmåga\n" +
                        "Fokus\n" +
                        "Ledarskapsförmågor?\n" +
                        "Beslutstagningsförmåga\n" +
                        "Initiativtagande\n" +
                        "Flexibel\n" +
                        "Problemlösning\n" +
                        "Prioriteringsfötmåga\n" +
                        "Teknik/It -intresse\n" +
                        "Engelska");
                break;
        }
    }
}
