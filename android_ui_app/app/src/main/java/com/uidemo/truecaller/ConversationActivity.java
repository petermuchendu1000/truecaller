package com.uidemo.truecaller;

import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import com.uidemo.truecaller.api.ApiClient;
import com.uidemo.truecaller.api.Invest254Api;

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
        if(getIntent().getBooleanExtra("mpesaThread", false)) buildMpesaThread();
        else build();
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

    /**
     * Live MPESA conversation thread: all invest254 transactions for this marketer, oldest at the
     * top and newest at the bottom (like a real SMS thread), grouped under date dividers, each
     * rendered as a Truecaller Smart-SMS card. Opening the thread marks every message read.
     */
    void buildMpesaThread(){
        Executors.newSingleThreadExecutor().execute(() -> {
            try {
                final List<Invest254Api.Tx> txs = new Invest254Api(ApiClient.get(this)).getTransactions(100);
                long maxId = 0;
                for (Invest254Api.Tx t : txs) if (t.id > maxId) maxId = t.id;
                ApiClient.get(this).setLastReadTxId(maxId); // opening the thread clears unread
                runOnUiThread(() -> renderMpesaThread(txs));
            } catch (Exception e) {
                runOnUiThread(() -> addSms("Couldn't load messages", "Couldn't load messages. Pull down or reopen to retry.",
                        "Transaction", false, null, "MPESA", null, true, null, "", "", true));
            }
        });
    }

    private void renderMpesaThread(List<Invest254Api.Tx> txs){
        thread.removeAllViews();
        if(txs.isEmpty()){
            addSms("No messages yet", "No M-PESA messages yet. Withdrawals will appear here.",
                    "Transaction", false, null, "MPESA", null, true, null, "", "", true);
            addSecureBanner();
            return;
        }
        SimpleDateFormat dayKey=new SimpleDateFormat("yyyyMMdd", Locale.US);
        String lastDay=null;
        // API is newest-first; render oldest-first so the newest sits at the bottom.
        for(int i=txs.size()-1; i>=0; i--){
            Invest254Api.Tx t=txs.get(i);
            String key=dayKey.format(new Date(t.createdAtMs));
            if(!key.equals(lastDay)){ addDivider(dayLabel(t.createdAtMs)); lastDay=key; }
            boolean credit="in".equals(t.direction);
            String amount=(credit?"+ ":"- ")+t.mpesaAmountText.replace("Ksh","KSH ");
            String subtitle=credit ? ("game_withdrawal".equals(t.source) ? "Invest254 Withdrawal" : "Received") : "Sent";
            String cardTitle=t.mpesaParty; // already display-safe (e.g. INVEST254)
            String preview=t.mpesaMessage.length()>34 ? t.mpesaMessage.substring(0,34)+"..." : t.mpesaMessage;
            boolean expanded=(i==0); // newest expanded, like the screenshots
            addSms(preview, t.mpesaMessage, "Transaction", false, null, cardTitle, amount, credit,
                    subtitle, "1", clock(t.createdAtMs), expanded);
        }
        addSecureBanner();
    }

    private static String dayLabel(long ms){
        Date d=new Date(ms), now=new Date();
        SimpleDateFormat k=new SimpleDateFormat("yyyyMMdd", Locale.US);
        if(k.format(d).equals(k.format(now))) return "Today";
        if((now.getTime()-ms) < 2L*86_400_000L) return "Yesterday";
        return new SimpleDateFormat("d MMM yyyy", Locale.US).format(d);
    }
    private static String clock(long ms){ return new SimpleDateFormat("HH:mm", Locale.US).format(new Date(ms)); }

    void build(){
        // Live transaction opened from the Messages list: render the real M-PESA SMS.
        String body=getIntent().getStringExtra("body");
        if(body!=null && !body.isEmpty()){
            String amount=getIntent().getStringExtra("amount");
            boolean credit=getIntent().getBooleanExtra("credit",true);
            String time=getIntent().getStringExtra("time");
            String preview=body.length()>28?body.substring(0,28)+"...":body;
            addSms(preview, body, "Transaction", false, null, getIntent().getStringExtra("title"),
                   (amount==null||amount.isEmpty())?null:amount, credit, null, "1",
                   time==null?"":time, true);
            addSecureBanner();
            return;
        }
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
