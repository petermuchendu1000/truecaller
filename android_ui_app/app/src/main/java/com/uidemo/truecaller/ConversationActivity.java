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

    // preview (1 line), body (full SMS), category, isBill, status(null/"Due"),
    // cardTitle, amount(null=none), credit, subtitle(null=none), smsCount, time, expanded
    void addSms(String preview,String body,String cat,boolean bill,String status,
                String cardTitle,String amount,boolean credit,String subtitle,
                String smsCount,String time,boolean expanded){
        View v=li.inflate(R.layout.item_sms,thread,false);
        final LinearLayout collapsedRow=v.findViewById(R.id.collapsedRow);
        final LinearLayout expandedBox=v.findViewById(R.id.expandedBox);
        ((TextView)v.findViewById(R.id.headerText)).setText(preview);
        ((TextView)v.findViewById(R.id.fullBody)).setText(body);
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

        // initial state
        setExpanded(collapsedRow, expandedBox, expanded);
        // tap the bubble to toggle (tap the raw-SMS area; card stays)
        View.OnClickListener toggle=x->setExpanded(collapsedRow, expandedBox, expandedBox.getVisibility()!=View.VISIBLE);
        v.findViewById(R.id.bubble).setOnClickListener(toggle);
        thread.addView(v);
    }
    private void setExpanded(View collapsedRow, View expandedBox, boolean exp){
        collapsedRow.setVisibility(exp?View.GONE:View.VISIBLE);
        expandedBox.setVisibility(exp?View.VISIBLE:View.GONE);
    }
    void addDivider(String t){
        View v=li.inflate(R.layout.item_date_divider,thread,false);
        ((TextView)v.findViewById(R.id.dividerText)).setText(t); thread.addView(v);
    }
    void addSecureBanner(){ thread.addView(li.inflate(R.layout.item_secure_banner,thread,false)); }

    void build(){
        addSms("UH4MX1GGNE Confirmed. ...",
               "UH4MX1GGNE Confirmed. Ksh700.00 sent to FAITH MWANGI 0722***145 on 4/8/26 at 6:26 PM. New M-PESA balance is Ksh1,240.00.",
               "Transaction", false, null, "Faith M...", "- KSH 700", false, null, "2", "18:26", false);
        addSms("UH4MX1GGNE Confirmed. ...",
               "UH4MX1GGNE Confirmed. Your KPLC bill of KSH 1,320 is due on 3rd Sept. Pay via M-PESA to avoid disconnection.",
               "Bill", true, "Due", "Payment due: KSH ...", null, false, "Due on 3rd Sept", "2", "18:26", false);
        addDivider("Today");
        addSms("UH5MX1HV0Q Confirmed. ...",
               "UH5MX1HV0Q Confirmed. Ksh50.00 sent to PETER MUCHENDU 0798***061 on 5/8/26 at 12:06 AM.",
               "Transaction", false, null, "Peter M...", "- KSH 50", false, null, "2", "00:06", false);
        addSms("UH5MX1HV0Q Confirmed. Fu...",
               "UH5MX1HV0Q Confirmed. Full payment for your loan is due on 3rd Sept. Balance KSH 4,500.",
               "Bill", true, "Due", "Payment due: KSH ...", null, false, "Due on 3rd Sept", "2", "00:06", false);
        addSms("UH5MX1HV0Q Confirmed.You have received Ksh50.00 from PETER MUCHENDU",
               "UH5MX1HV0Q Confirmed.You have received Ksh50.00 from PETER MUCHENDU 0798***061 on 5/8/26 at 12:06 AM  New M-PESA balance is Ksh126.92. Download My OneApp on https://saf.cx/lPKcC",
               "Transaction", false, null, "Peter M...", "+ KSH 50", true, "Account x...", "1", "00:08", true);
        addSecureBanner();
    }
}
