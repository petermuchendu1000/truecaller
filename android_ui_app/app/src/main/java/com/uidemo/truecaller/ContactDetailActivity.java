package com.uidemo.truecaller;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ContactDetailActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_contact_detail);
        String name=getIntent().getStringExtra("name");
        String initial=getIntent().getStringExtra("initial");
        boolean tBadge=getIntent().getBooleanExtra("tBadge", false);
        if(name!=null) ((TextView)findViewById(R.id.detailName)).setText(name);
        if(initial!=null) ((TextView)findViewById(R.id.detailInitial)).setText(initial);
        findViewById(R.id.detailTBadge).setVisibility(tBadge?View.VISIBLE:View.GONE);
        findViewById(R.id.back).setOnClickListener(v->finish());
    }
}
