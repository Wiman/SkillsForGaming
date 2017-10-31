package com.example.andreas.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import static com.example.andreas.game.SkillsActivity.textEtt;


public class SResActivity extends AppCompatActivity {

    TextView textView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sres);

        textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setText(textEtt);
    }
}
