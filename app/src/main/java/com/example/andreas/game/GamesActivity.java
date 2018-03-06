package com.example.andreas.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class GamesActivity extends AppCompatActivity {

    Button button7;
    EditText gameTxt, rankTxt, playTimeTxt;
    TextView gameTextOne;
    ToggleButton fragaEttBtn, toggleButton2, toggleButton3, toggleButton4, toggleButton5, toggleButton6;

    public static String toggleEtt, toggleTva, toggleTre, toggleFyra, toggleFem, toggleSex, buttButt, game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

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
                String [] gamesArray= new String[8];
                for (API h: games){
                    Log.d("_id" , String.valueOf(h.get_id()));
                    gamesArray [Integer.valueOf(h.get_id())]=String.valueOf(h.get_id());
                    //Toast.makeText(getApplicationContext(), String.valueOf(h.get_id()), Toast.LENGTH_SHORT).show();
                }
                for (API y: games){
                    Log.d("name" , String.valueOf(y.getName()));
                    gamesArray [Integer.valueOf(y.get_id())]=String.valueOf(y.getName());
                    //Toast.makeText(getApplicationContext(), gamesArray[Integer.valueOf(y.get_id())], Toast.LENGTH_SHORT).show();

                }
                ForToast(gamesArray);

            }

            @Override
            public void onFailure(Call<List<API>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });


        gameTxt       = (EditText) findViewById(R.id.gameTxt);
        rankTxt       = (EditText) findViewById(R.id.rankTxt);
        playTimeTxt   = (EditText) findViewById(R.id.playTimeTxt);
        button7       = (Button) findViewById(R.id.button7);
        gameTextOne   = (TextView) findViewById(R.id.gameTextOne);
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
                         game = gameTxt.getText().toString();

                        Log.d("EditText", rankTxt.getText().toString());
                        String rank = rankTxt.getText().toString();

                        Log.e("EditText", playTimeTxt.getText().toString());
                        String playTime = playTimeTxt.getText().toString();

                        Log.i("EditText", fragaEttBtn.getText().toString());
                         toggleEtt  = fragaEttBtn.getText().toString();
                         toggleTva  = toggleButton2.getText().toString();
                         toggleTre  = toggleButton3.getText().toString();
                         toggleFyra = toggleButton4.getText().toString();
                         toggleFem  = toggleButton5.getText().toString();
                         toggleSex  = toggleButton6.getText().toString();


                         buttButt = SpelInfo(game, rank, playTime);



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
        gameTxt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (gameTxt.getText().toString().equals("World of Warcraft") || gameTxt.getText().toString().equals("world of warcraft")){
                    rankTxt.setVisibility(View.INVISIBLE);
                }
                else {
                    rankTxt.setVisibility(View.VISIBLE);

                }
                if(gameTxt.getText().toString().equals("")){
                    button7.setVisibility(View.INVISIBLE);
                }else{
                    button7.setVisibility(View.VISIBLE);
                }

            }
        });

    }

    public String SpelInfo(String game, String rank, String playTime) {

        String stringHolder = "\n";
        //int points = 0;
        int time;

        if (playTime.equals("")){
            playTime = "1";
            time = Integer.parseInt(playTime);
        }
        else {
            time = Integer.parseInt(playTime);
        }


        rank = rank.toLowerCase();
        rank = rank.trim();
        game = game.toLowerCase();
        game = game.trim();


            switch (game) {
                case "world of warcraft":
                    //stringHolder = "Du valde WoW";
                    break;
                case "league of legends":
                    //stringHolder = "Du valde LoL";
                    break;
                case "counter-strike":
                    //stringHolder = "Du valde CS:GO";
                    break;
                default:
                    stringHolder = "Appen hittar inte Spelnamn/Rank";
                    break;
            }
            switch (rank) {
                case "bronze":
                    stringHolder = stringHolder + "\nDin rank är inte tillräckligt hög för att styrka dina kompetenser";
                    break;
                case "silver":
                    stringHolder = stringHolder + "\nDin rank är inte tillräckligt hög för att styrka dina kompetenser";
                    break;
                case "gold":
                    stringHolder = stringHolder + "\nDin rank är inte tillräckligt hög för att styrka dina kompetenser";
                    break;
                case "platinum":
                    stringHolder = stringHolder + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    //points = points + 1;
                    break;
                case "diamond":
                    stringHolder = stringHolder + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    //points = points + 2;
                    break;
                case "master":
                    stringHolder = stringHolder + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    //points = points + 3;
                    break;
                case "challenger":
                    stringHolder = stringHolder + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    //points = points + 4;
                    break;
                case "gold nova":
                    stringHolder = stringHolder + "\nDin rank är inte tillräckligt hög för att styrka dina kompetenser";
                    //points = points + 1;
                    break;
                case "master guardian":
                    stringHolder = stringHolder + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    //points = points + 1;
                    break;
                case "legendary eagle":
                    stringHolder = stringHolder + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    //points = points + 1;
                    break;
                case "supreme":
                    stringHolder = stringHolder + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    //points = points + 1;
                    break;
                case "global elite":
                    stringHolder = stringHolder + "\nDin rank är tillräckligt hög för att styrka dina kompetenser";
                    //points = points + 1;
                    break;
                default:
                    stringHolder = "Appen hittar inte Spelnamn/Rank";
                    break;
            }



            if (time <= 199) {
                stringHolder = "\nDin inGameTime är för låg";
            }



            return stringHolder;

    }
    public void ForToast (String[]gamesArray){

        String [] InformationHolder = gamesArray;
        InformationHolder[0] = "Game";

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, InformationHolder);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.gameTxt);
        textView.setAdapter(adapter);

    }
}
