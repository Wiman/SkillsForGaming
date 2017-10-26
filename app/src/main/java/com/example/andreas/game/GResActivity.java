package com.example.andreas.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;


public class GResActivity extends AppCompatActivity {
    ToggleButton fragaEttBtn, toggleButton2, toggleButton3, toggleButton4;
    TextView textView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gres);


/*
        String toggleEtt = fragaEttBtn.getText().toString();
        String toggleTva = toggleButton2.getText().toString();
        String toggleTre = toggleButton3.getText().toString();
        String toggleFyra = toggleButton4.getText().toString();
*/
        textView9 = (TextView) findViewById(R.id.textView9);
       // textView9.setText(Resultat(toggleEtt, toggleTva, toggleTre, toggleFyra));


    }
    public String Resultat(String toggleEtt, String toggleTva, String toggleTre, String toggleFyra) {
        String result="";

        if (toggleEtt.equals("Ja")){
            result = result + "Spelaren blir lätt stressad";
        }
        else {
            result = result + "Spelaren blir inte stressad av spelet";
        }
        if (toggleTva.equals("Ja")){
            result = result + "\nSpelaren är en ledare";
        }
        else {
            result = result + "\nSpelaren är inte en ledare";
        }
        if (toggleTre.equals("Ja")){
            result = result + "\nSpelaren har skapat ett lag";
        }
        else {
            result = result + "\nSpelaren har inte skapat ett lag";
        }
        if (toggleFyra.equals("Spelar i lag")){
            result = result + "\nSpelaren är en teamplayer";
        }
        else {
            result = result + "\nSpelaren är solo spelare";
        }




        return result;
    }
}
