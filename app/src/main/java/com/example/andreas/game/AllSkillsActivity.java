package com.example.andreas.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AllSkillsActivity extends AppCompatActivity {

    TextView textview12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_skills);

        textview12 = (TextView) findViewById(R.id.textView12);

        textview12.setText("Placeholder, is gon depend on what button");
    }
}
