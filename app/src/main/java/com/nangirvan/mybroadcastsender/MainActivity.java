package com.nangirvan.mybroadcastsender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView bcStatus;
    private EditText inBcAction, inBcName, inBcValue;
    private Button btnSend;

    private String TAG_MAIN = "MBS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bcStatus = findViewById(R.id.bcStatus);
        inBcAction = findViewById(R.id.inBcAction);
        inBcName = findViewById(R.id.inBcName);
        inBcValue = findViewById(R.id.inBcValue);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(this::onClicks);
    }

    public void onClicks(View v) {
        switch (v.getId()) {
            case R.id.btnSend:
                String strBcStatus = bcStatus.getText().toString();
                String strBcAction = inBcAction.getText().toString();
                String strBcName = inBcName.getText().toString();
                String strBcValue = inBcValue.getText().toString();

                Log.i(TAG_MAIN, strBcStatus);
                Log.i(TAG_MAIN, strBcAction);
                Log.i(TAG_MAIN, strBcName);
                Log.i(TAG_MAIN, strBcValue);
        }
    }
}