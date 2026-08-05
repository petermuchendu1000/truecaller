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
        ((TextView)findViewById(R.id.detailNumber)).setText(numberFor(name));
        findViewById(R.id.detailTBadge).setVisibility(tBadge?View.VISIBLE:View.GONE);
        findViewById(R.id.back).setOnClickListener(v->finish());
    }

    /**
     * Deterministic, unique Kenyan mobile number per contact — derived from the name so the same
     * person always shows the same number (and different people get different numbers). Format:
     * "07XX XXXXXX" using real Safaricom/Airtel prefixes.
     */
    static String numberFor(String name){
        String[] prefixes = {
            "0722","0723","0724","0725","0726","0727","0728","0729","0700","0701","0702","0703",
            "0704","0705","0706","0707","0708","0710","0711","0712","0713","0714","0715","0716",
            "0717","0718","0719","0720","0721","0790","0791","0792","0793","0794","0795","0796",
            "0797","0798","0799","0740","0741","0742","0743","0745","0746","0748","0757","0758",
            "0759","0768","0769","0110","0111","0112","0113","0114","0115"
        };
        long h = 1125899906842597L; // FNV-ish seed
        String s = name==null ? "unknown" : name;
        for(int i=0;i<s.length();i++) h = 31*h + s.charAt(i);
        long v = Math.abs(h);
        String prefix = prefixes[(int)(v % prefixes.length)];
        int last6 = (int)((v / prefixes.length) % 1_000_000L);
        return prefix + " " + String.format(java.util.Locale.US, "%06d", last6);
    }
}
