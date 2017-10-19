package com.example.andreas.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SkillsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_skills);

        final Button button = (Button) findViewById(R.id.Skill1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                // button.setText("Win");
                startActivity(new Intent(getApplicationContext(),GamesActivity.class));
            }
        });
    }
}
