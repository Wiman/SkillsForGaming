package com.example.andreas.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.widget.Button;


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
    }

    }

