package com.example.amanpsingh.bareminimum;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button sendButton;
    private EditText editText;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        sendButton = (Button) findViewById(R.id.btn_send);
        editText = (EditText) findViewById(R.id.edit_text);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                editText.setText("Got it");
                Intent sendIntent = new Intent(mContext, FinalActivity.class);
                sendIntent.putExtra("Text", editText.getText());
                startActivity(sendIntent);
            }
        });
    }
}
