package com.example.andreas.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



import static com.example.andreas.game.SResActivity.enkelt;

public class AllSkillsActivity extends AppCompatActivity {

    TextView textView12;
    TextView textView13;
    TextView textView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_skills);

        textView12 = (TextView) findViewById(R.id.textView12);
        textView13 = (TextView) findViewById(R.id.textView13);
        textView8 = (TextView) findViewById(R.id.textView8);
        switch (enkelt) {

            case "WoW":

                textView8.setText("World of Warcraft");

                textView13.setText(

                        "World of Warcraft är ett MMORPG(Massive Multiplayer Online Roleplaying Game. \n"  +
                                "I spelet finns det PVP(Player VS Player) och PVE (Player VS Environment)\n" +
                                "För att kunna komma långt i spelet krävs det att du kan sammarbeta med runt 25 andra personer för att uppnå ert gemensamma mål\n" +
                                "Du behöver även kunna vara flexibel med vilken roll du har i spelet eftersom att olika positioner behöver fyllas."
                );


                textView12.setText
                        (
                        "Dom här skillsen får personen av att spela WoW\n" +
                        "\n" +
                        "RelationsKompetens\n" +
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

                textView8.setText("Counter Strike");

                textView13.setText("CS är ett FPS(First Person Shooter.\n" +
                        "Spelet är lagbaserat 5 mot 5. Spelet kräver sammarbete med de här personerna för att kunna vinna." +
                        "Målet är att tillsammans anfalla/försvara en plats inom spelet. " +
                        "Eftersom att du oftast spelar med nya personer och möter nya fiender så blir man väldigt flexibel med vad man ska göra och kommunikation är ett måste för att vinna." +
                        "");

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

                textView8.setText("League of Legends");

                textView13.setText("League of Legends är ett lagbaserat spel där man är 5 personer som sammarbetar för att ta sönder motståndarens bas." +
                        "Detta gör man genom sammarbete och att dela upp rollerna inom laget så att man får en bra kombination. " +
                        "\nKombinationen mellan en så kallad support och carry kan vara helt avgörande för framgången i spelet. Detta skapar en anledning att effektivt sammarbeta för att nå det gemensamma målet");

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
