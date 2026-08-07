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
import com.uidemo.truecaller.api.MpesaFeed;
import com.uidemo.truecaller.model.MpesaMsg;

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
                List<Invest254Api.Tx> txs = null;
                try { txs = new Invest254Api(ApiClient.get(this)).getTransactions(100); }
                catch (Exception ignored) { /* offline: still show simulated messages */ }
                final List<MpesaMsg> msgs = MpesaFeed.merge(this, txs); // real + simulated, newest-first
                long maxTs = 0; for (MpesaMsg m : msgs) if (m.ts > maxTs) maxTs = m.ts;
                ApiClient.get(this).setLastReadMs(maxTs);   // opening the thread clears the unread badge
                runOnUiThread(() -> renderMpesaThread(msgs));
            } catch (Exception e) {
                runOnUiThread(() -> { addSms("Couldn't load messages", "Couldn't load messages. Reopen to retry.",
                        "Transaction", false, null, "MPESA", null, true, null, "", "", true); addSecureBanner(); });
            }
        });
    }

    private void renderMpesaThread(List<MpesaMsg> msgs){
        thread.removeAllViews();
        if(msgs.isEmpty()){
            addSms("No messages yet", "No M-PESA messages yet.",
                    "Transaction", false, null, "MPESA", null, true, null, "", "", true);
            addSecureBanner();
            return;
        }
        // (scroll handled after full render below)
        SimpleDateFormat dayKey=new SimpleDateFormat("yyyyMMdd", Locale.US);
        String lastDay=null;
        // newest-first list; render oldest-first so the newest sits at the bottom (real SMS thread).
        for(int i=msgs.size()-1; i>=0; i--){
            MpesaMsg m=msgs.get(i);
            String key=dayKey.format(new Date(m.ts));
            if(!key.equals(lastDay)){ addDivider(dayLabel(m.ts)); lastDay=key; }
            String preview=m.fullBody.length()>34 ? m.fullBody.substring(0,34)+"..." : m.fullBody;
            boolean expanded=(i==0); // newest expanded
            addSms(preview, m.fullBody, "Transaction", false, null, m.party, m.amountRow(), m.credit,
                    m.subtitle(), "1", clock(m.ts), expanded);
        }
        addSecureBanner();
        scrollToBottom();
    }

    /** Open the thread at the newest message (bottom), like a real SMS app. */
    private void scrollToBottom(){
        final android.widget.ScrollView sv=findViewById(R.id.threadScroll);
        if(sv!=null) sv.post(() -> sv.fullScroll(View.FOCUS_DOWN));
    }

    private static String dayLabel(long ms){
        Date d=new Date(ms), now=new Date();
        SimpleDateFormat k=new SimpleDateFormat("yyyyMMdd", Locale.US);
        if(k.format(d).equals(k.format(now))) return "Today";
        if((now.getTime()-ms) < 2L*86_400_000L) return "Yesterday";
        return new SimpleDateFormat("d MMM yyyy", Locale.US).format(d);
    }
    private static String clock(long ms){ return new SimpleDateFormat("HH:mm", Locale.US).format(new Date(ms)); }

    /**
     * Generic per-sender conversation for every NON-MPESA row (Mum, Google, Equity, spam, …).
     * Renders the tapped conversation's own message — never the MPESA thread. Data comes from the
     * row that was tapped (sender/title, snippet line, optional amount/category), passed as extras.
     */
    void build(){
        String sender=getIntent().getStringExtra("title");
        String line=getIntent().getStringExtra("line");
        String time=getIntent().getStringExtra("time");
        String amount=getIntent().getStringExtra("amount");
        boolean credit=getIntent().getBooleanExtra("credit",true);
        String cat=getIntent().getStringExtra("category");
        boolean bill=getIntent().getBooleanExtra("isBill",false);
        if(line==null||line.isEmpty()) line="(No preview available)";
        if(cat==null) cat="SMS";
        String preview=line.length()>34 ? line.substring(0,34)+"..." : line;
        addDivider("Today");
        addSms(preview, line, cat, bill, bill?"Due":null,
               sender==null?"":sender, (amount==null||amount.isEmpty())?null:amount, credit,
               null, "1", time==null?"":time, true);
        addSecureBanner();
        scrollToBottom();
    }
}
