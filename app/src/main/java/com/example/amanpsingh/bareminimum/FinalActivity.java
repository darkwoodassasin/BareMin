package com.example.amanpsingh.bareminimum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Intent intent = getIntent();
        CharSequence text = intent.getCharSequenceExtra("NewText2");

        textView = (TextView) findViewById(R.id.text_view);
        textView.setText(text);
    }
}
