package com.example.andreas.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIInt.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIInt api = retrofit.create(APIInt.class);

        Call<List<API>> call = api.getGames();


        call.enqueue(new Callback<List<API>>() {
            @Override
            public void onResponse(Call<List<API>> call, Response<List<API>> response) {
                List<API> games = response.body();
                String [] gamesDescriptionArray= new String[8];
                gamesDescriptionArray[0] = "Game";
                String [] gamesSkillsArray= new String[8];
                gamesSkillsArray[0] = "Skills";

                for (API h: games){
                    Log.d("gameDescription" , String.valueOf(h.getGameDescription()));
                    gamesDescriptionArray [Integer.valueOf(h.get_id())]=String.valueOf(h.getGameDescription());
                    //Toast.makeText(getApplicationContext(), String.valueOf(h.get_id()), Toast.LENGTH_SHORT).show();
                }
                for (API y: games){
                    Log.d("gameSkillss" , String.valueOf(y.getGameSkills()));
                    gamesSkillsArray [Integer.valueOf(y.get_id())]=String.valueOf(y.getGameSkills());
                    //Toast.makeText(getApplicationContext(), gamesArray[Integer.valueOf(y.get_id())], Toast.LENGTH_SHORT).show();

                }
                  GameDesSkills(gamesDescriptionArray, gamesSkillsArray);

            }

            @Override
            public void onFailure(Call<List<API>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });}

       /* switch (enkelt) {

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
    }*/
    public void GameDesSkills (String[]gamesDescriptionArray, String[]gamesSkillsArray){
        switch (enkelt) {

            case "WoW":

                textView8.setText("World of Warcraft");

                textView13.setText(gamesDescriptionArray[1]);

                textView12.setText(gamesSkillsArray[1]);
                break;

            case "Cs":

                textView8.setText("Counter Strike");

                textView13.setText(gamesDescriptionArray[3]);

                textView12.setText (gamesSkillsArray[3]);
                break;

            case "LoL":

                textView8.setText("League of Legends");

                textView13.setText(gamesDescriptionArray[2]);

                textView12.setText(gamesSkillsArray[2]);
                break;
        }
    }
}
