package com.example.andreas.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        final TextView aboutText = (TextView) findViewById(R.id.textView7);

        aboutText.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam laoreet ante a auctor egestas. Ut tempus lacinia libero ut egestas. " +
                "Duis hendrerit ut nisi sed congue. Donec hendrerit mauris et euismod tristique. Morbi sed malesuada elit." + "\n" +
                "Curabitur posuere ante sed odio posuere tincidunt. Quisque consequat placerat cursus. Fusce rhoncus eros hendrerit, sollicitudin tellus vel, tempus ante." +
                "Nam felis diam, ornare eget odio eu, vehicula auctor leo. Nunc cursus tortor nec fringilla sodales." +
                "Phasellus auctor tincidunt tortor at blandit. Etiam convallis volutpat felis, auctor porttitor odio faucibus at. Praesent ut risus eu orci scelerisque dapibus.");
    }
}
