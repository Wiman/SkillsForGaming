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
                                "I spelet finns det PVP(Player VS Player) och PVE (Player VS Enemies)\n" +
                                "För att kunna komma långt i spelet krävs det sammarbete med andra personer\n" +
                                "Du måste kunna hålla fokus upp under längre tid i större PVE content."
                );


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

                textView8.setText("Counter Strike");

                textView13.setText("CS är ett FPS(First Person Shooter.\n" +
                        "I en match är det 10 personer som spelar . 2 lag av 5 personer försöker nå 16 rundor först.\n" +
                        "Ena laget spelar som terrorister och andra laget är Counter terrorister\n" +
                        "Terroristernas mål är att plantera en bomb som ska sprängas\n" +
                        "Counter terrorists har som mål att stoppa dom ifrån att göra detta.\n" +
                        "Det finns 2 specifika platser på varje karta där terroristerna kan plantera bomben\n" +
                        "Efter 15 rundor byter lagen sida och försten till 16 vunna rundor vinner matchen\n" +
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
                        "\nKombinationen mellan en så kallad support och carry kan vara helt avgörande för framgången i spelet. Detta skapar ett tvång att sammarbeta för att nå det gemensamma målet");

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
