package com.uidemo.truecaller;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class IncomingCallActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.activity_incoming_call);

        String name = getIntent().getStringExtra("name");
        String initial = getIntent().getStringExtra("initial");
        ((TextView) findViewById(R.id.name)).setText(name != null ? name : "Priya Sharma");
        ((TextView) findViewById(R.id.avatar)).setText(initial != null ? initial : "P");
        ((TextView) findViewById(R.id.number)).setText("+91 98450 12345");

        findViewById(R.id.decline).setOnClickListener(v -> finish());
        findViewById(R.id.answer).setOnClickListener(v -> {
            ((TextView) findViewById(R.id.status)).setText("Connected");
        });
    }
}
