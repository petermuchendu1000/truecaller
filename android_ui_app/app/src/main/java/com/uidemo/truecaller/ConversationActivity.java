package com.uidemo.truecaller;

import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class ConversationActivity extends AppCompatActivity {
    LinearLayout thread; LayoutInflater li;

    @Override protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_conversation);
        li=getLayoutInflater();
        thread=findViewById(R.id.thread);
        String title=getIntent().getStringExtra("title");
        if(title!=null) ((TextView)findViewById(R.id.toolbarTitle)).setText(title);
        findViewById(R.id.back).setOnClickListener(v->finish());
        build();
    }

    // header preview, expanded body(null=collapsed), category, isBill, status(null/"Due"),
    // card title, amount(null=none), credit, subtitle(null=none), smsCount, time
    void addSms(String header,String body,String cat,boolean bill,String status,
                String cardTitle,String amount,boolean credit,String subtitle,String smsCount,String time){
        View v=li.inflate(R.layout.item_sms,thread,false);
        ((TextView)v.findViewById(R.id.headerText)).setText(header);
        ImageView chevron=v.findViewById(R.id.chevron);
        chevron.setImageResource(R.drawable.ic_chevron_down);
        TextView full=v.findViewById(R.id.fullBody);
        if(body!=null){ full.setVisibility(View.VISIBLE); full.setText(body); chevron.setRotation(180); }
        ((ImageView)v.findViewById(R.id.catIcon)).setImageResource(bill?R.drawable.ic_bill:R.drawable.ic_tcx_card_insights);
        ((TextView)v.findViewById(R.id.catText)).setText(cat);
        TextView badge=v.findViewById(R.id.statusBadge);
        if(status!=null){ badge.setVisibility(View.VISIBLE); badge.setText(status); }
        ((TextView)v.findViewById(R.id.cardTitle)).setText(cardTitle);
        TextView amt=v.findViewById(R.id.cardAmount);
        if(amount!=null){ amt.setText(amount); amt.setTextColor(credit?0xFF33B73E:0xFFF28241); }
        else amt.setVisibility(View.GONE);
        TextView sub=v.findViewById(R.id.cardSubtitle);
        if(subtitle!=null) sub.setText(subtitle); else sub.setVisibility(View.GONE);
        ((TextView)v.findViewById(R.id.smsCount)).setText(smsCount);
        ((TextView)v.findViewById(R.id.smsTime)).setText("\u00b7 "+time);
        thread.addView(v);
    }
    void addDivider(String t){
        View v=li.inflate(R.layout.item_date_divider,thread,false);
        ((TextView)v.findViewById(R.id.dividerText)).setText(t); thread.addView(v);
    }
    void addSecureBanner(){ thread.addView(li.inflate(R.layout.item_secure_banner,thread,false)); }

    void build(){
        addSms("UH4MX1GGNE Confirmed. ...", null, "Transaction", false, null,
               "Faith M...", "- KSH 700", false, null, "2", "18:26");
        addSms("UH4MX1GGNE Confirmed. ...", null, "Bill", true, "Due",
               "Payment due: KSH ...", null, false, "Due on 3rd Sept", "2", "18:26");
        addDivider("Today");
        addSms("UH5MX1HV0Q Confirmed. ...", null, "Transaction", false, null,
               "Peter M...", "- KSH 50", false, null, "2", "00:06");
        addSms("UH5MX1HV0Q Confirmed. Fu...", null, "Bill", true, "Due",
               "Payment due: KSH ...", null, false, "Due on 3rd Sept", "2", "00:06");
        addSms("UH5MX1HV0Q Confirmed.You have received Ksh50.00 from PETER MUCHENDU",
               "UH5MX1HV0Q Confirmed.You have received Ksh50.00 from PETER MUCHENDU 0798***061 on 5/8/26 at 12:06 AM  New M-PESA balance is Ksh126.92. Download My OneApp on https://saf.cx/lPKcC",
               "Transaction", false, null, "Peter M...", "+ KSH 50", true, "Account x...", "1", "00:08");
        addSecureBanner();
    }
}
