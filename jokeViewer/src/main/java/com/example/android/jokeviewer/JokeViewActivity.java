package com.example.android.jokeviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeViewActivity extends AppCompatActivity {

    TextView jokeTextView;
    public final String INTENT_KEY_JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_view);
        jokeTextView = findViewById(R.id.tv_joke);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(INTENT_KEY_JOKE)) {
            String joke = intent.getStringExtra(INTENT_KEY_JOKE);
            jokeTextView.setText(joke);
        }

    }
}
