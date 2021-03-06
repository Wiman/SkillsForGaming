package com.example.andreas.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
               // button.setText("Win");
                startActivity(new Intent(getApplicationContext(),GamesActivity.class));
            }
        });

        final Button skillbutton = (Button) findViewById(R.id.button4);
        skillbutton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),SkillsActivity.class));
            }

        });

        final Button buttonBout = (Button) findViewById(R.id.button);
        buttonBout.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),AboutActivity.class));
            }

        });




    }

    }

