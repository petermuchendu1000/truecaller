package com.uidemo.truecaller;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.*;
import android.widget.*;
import androidx.annotation.*;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.*;
import java.util.*;
import java.text.SimpleDateFormat;
import com.uidemo.truecaller.adapter.MsgAdapter;
import com.uidemo.truecaller.api.ApiClient;
import com.uidemo.truecaller.api.MpesaCache;
import com.uidemo.truecaller.api.TxSync;
import com.uidemo.truecaller.model.MpesaMsg;
import com.uidemo.truecaller.model.MsgRow;

public class MessagesFragment extends Fragment {
    private final List<MsgRow> master = new ArrayList<>();
    private final List<MpesaMsg> liveMsgs = new ArrayList<>(); // MPESA messages (real+sim), newest first
    private RecyclerView rv;
    private LinearLayout chipContainer;
    private int selected = 0; // 0=Inbox
    private final String[] chipLabels = {"Inbox","Unread","Transactions","OTP","Bill","Travel","Spam"};
    private int[] chipIcons;
    private TxSync sync;

    @Nullable @Override public View onCreateView(@NonNull LayoutInflater inf, @Nullable ViewGroup c, @Nullable Bundle b){
        View v=inf.inflate(R.layout.fragment_messages,c,false);
        rv=v.findViewById(R.id.list);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        chipContainer=v.findViewById(R.id.chipContainer);
        chipIcons=new int[]{R.drawable.ic_filter_inbox, R.drawable.ic_flag_tcx, R.drawable.ic_filter_transaction,
            R.drawable.ic_filter_otp, R.drawable.ic_filter_bill, R.drawable.ic_filter_travel, R.drawable.ic_filter_spam};
        // Seed the M-PESA conversation row from the last-known cache so it appears INSTANTLY on the
        // inbox (no wait for the first 10s poll). startSync() refreshes it shortly after.
        liveMsgs.addAll(MpesaCache.load(getContext()));
        buildData();
        buildChips();
        applyFilter();
        startSync();
        return v;
    }

    // ─── live invest254 transaction sync ────────────────────────────────────
    private void startSync(){
        sync=new TxSync(requireContext());
        sync.setListener(new TxSync.Listener(){
            @Override public void onMessages(List<MpesaMsg> msgs){
                if(!isAdded()) return;
                liveMsgs.clear(); liveMsgs.addAll(msgs);   // unified, newest-first
                applyFilter();
            }
            @Override public void onError(String message){ /* demo data stays visible */ }
            @Override public void onLoggedOut(){
                if(!isAdded()) return;
                startActivity(new android.content.Intent(requireContext(), LoginActivity.class));
                requireActivity().finish();
            }
        });
        sync.start();
    }

    /**
     * Collapse every MPESA message (real invest254 + simulated) into ONE conversation row, exactly
     * like Truecaller groups all SMS from one sender into a single thread. The row shows the LATEST
     * message's amount + "Received"/"Sent", its time, and an unread badge = messages newer than the
     * read cursor.
     */
    private MsgRow mpesaConversationRow(){
        if(liveMsgs.isEmpty()) return null;
        MpesaMsg latest = liveMsgs.get(0);             // newest first
        long lastRead = ApiClient.get(requireContext()).getLastReadMs();
        int unread = 0;
        for(MpesaMsg m: liveMsgs) if(m.ts > lastRead) unread++;
        MsgRow r = MsgRow.txn(MsgRow.TRANSACTION, MsgRow.AV_WHITE, "M", "MPESA",
                latest.amountRow(), latest.credit, latest.subtitle(), formatTime(latest.ts), unread)
                .logo(R.drawable.av_mpesa);
        r.body = latest.fullBody;
        r.createdAtMs = latest.ts;
        r.mpesaThread = true;                          // tapping opens the full thread
        return r;
    }

    private static String formatTime(long ms){
        Date d=new Date(ms), now=new Date();
        SimpleDateFormat day=new SimpleDateFormat("yyyyMMdd", Locale.US);
        if(day.format(d).equals(day.format(now))) return new SimpleDateFormat("HH:mm", Locale.US).format(d);
        if((now.getTime()-ms) < 7L*86_400_000L) return new SimpleDateFormat("EEE", Locale.US).format(d);
        return new SimpleDateFormat("d/M/yy", Locale.US).format(d);
    }

    @Override public void onResume(){ super.onResume(); if(sync!=null) sync.refreshNow(); }
    @Override public void onDestroyView(){ if(sync!=null) sync.stop(); super.onDestroyView(); }

    private int dp(float d){ return (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,d,getResources().getDisplayMetrics()); }

    private void buildData(){
        final int INBOX=MsgRow.INBOX, TXN=MsgRow.TRANSACTION, OTP=MsgRow.OTP, BILL=MsgRow.BILL, TRAVEL=MsgRow.TRAVEL, SPAM=MsgRow.SPAM;
        // --- brands (logos) ---
        master.add(MsgRow.plain(OTP,MsgRow.AV_WHITE,"G","Google","\u2022\u2022\u2022 772 443","04:30",1).logo(R.drawable.av_google));
        master.add(MsgRow.txn(TXN,MsgRow.AV_WHITE,"N","National Bank of Kenya","+ KES 1,150",true,"Received","00:27",1).logo(R.drawable.av_national));
        master.add(MsgRow.txn(TXN,MsgRow.AV_WHITE,"M","LIPANAMPESA","- KSH 1,150",false,"ATM Withdrawal","00:27",1).logo(R.drawable.av_mpesa));
        master.add(MsgRow.txn(TXN,MsgRow.AV_WHITE,"M","MPESA","+ KSH 50",true,"Received","00:08",0).logo(R.drawable.av_mpesa));
        master.add(MsgRow.txn(TXN,MsgRow.AV_WHITE,"E","Equity","+ KES 4,500",true,"Salary","Mon",0).logo(R.drawable.av_equity));
        master.add(MsgRow.plain(OTP,MsgRow.AV_WHITE,"S","Safaricom","\u2022\u2022\u2022 145 023 is your Safaricom PIN","Mon",0).logo(R.drawable.av_safaricom));
        master.add(MsgRow.plain(OTP,MsgRow.AV_WHITE,"K","KCB","\u2022\u2022\u2022 902 447 is your OTP","Sun",0).logo(R.drawable.av_kcb));
        master.add(MsgRow.plain(BILL,MsgRow.AV_WHITE,"A","Absa","Payment due: KES 3,200","Sat",0).logo(R.drawable.av_absa));
        master.add(MsgRow.plain(BILL,MsgRow.AV_WHITE,"D","DTB","Loan repayment due on 3rd Sept","Thu",0).logo(R.drawable.av_dtb));
        master.add(MsgRow.plain(INBOX,MsgRow.AV_WHITE,"J","Jumia","Your order is out for delivery","Fri",0).logo(R.drawable.av_jumia));
        // --- travel (letter avatars) ---
        master.add(MsgRow.plain(TRAVEL,MsgRow.AV_TEAL,"M","Modern Coast","Booking confirmed: Nairobi\u2013Mombasa, Seat 12B","Thu",0));
        master.add(MsgRow.plain(TRAVEL,MsgRow.AV_NAVY,"S","SGR Tickets","Madaraka Express departs 08:00, Coach C","Wed",0));
        // --- spam ---
        master.add(MsgRow.plain(SPAM,MsgRow.AV_RED,"!","0705 992118","CONGRATS! You WON Ksh 500,000. Send Ksh 250 to claim","Wed",0));
        master.add(MsgRow.plain(SPAM,MsgRow.AV_RED,"B","BONANZA WINNER","Claim your prize now! Reply YES to 40404","Tue",0));
        // --- personal (realistic Kenyan save-names) ---
        master.add(MsgRow.plain(INBOX,MsgRow.AV_PURPLE,"M","Mum","Uko wapi? Nimekupigia mara tatu","08:12",0));
        master.add(MsgRow.plain(INBOX,MsgRow.AV_TEAL,"L","Landlord","Rent iko pending, tuma leo tafadhali","Mon",0));
        master.add(MsgRow.plain(INBOX,MsgRow.AV_NAVY,"C","Cuzo Mwangi","Niko town, tuonane lunch","Mon",0));
        master.add(MsgRow.plain(INBOX,MsgRow.AV_PURPLE,"C","Caro Sales","Stock imefika, karibu ushuke","Sun",0));
        master.add(MsgRow.plain(INBOX,MsgRow.AV_TEAL,"B","Boda Guy","Niko stage, uko ready?","Sun",0));
        master.add(MsgRow.plain(INBOX,MsgRow.AV_PURPLE,"M","Mama Mboga","Sukuma na nyanya ziko fresh leo","Sat",0));
        master.add(MsgRow.plain(INBOX,MsgRow.AV_NAVY,"D","Dad","Call me when you're free","Fri",0));
    }

    private int countUnread(int filter){
        int n=0; for(MsgRow r: filtered(filter,false)) if(r.unread>0) n++; return n;
    }
    // filter=selected index; withExtras=insert promo/header
    private List<MsgRow> filtered(int filter, boolean withExtras){
        List<MsgRow> out=new ArrayList<>();
        // The invest254 transactions collapse into ONE "MPESA" conversation row at the top of the
        // views it belongs to: Inbox, Unread (only when it has unread messages), Transactions.
        MsgRow mpesa = mpesaConversationRow();
        if(mpesa != null){
            boolean keep;
            switch(filter){
                case 0: keep = true; break;             // Inbox
                case 1: keep = mpesa.unread>0; break;   // Unread
                case 2: keep = true; break;             // Transactions
                default: keep = false; break;           // OTP/Bill/Travel/Spam
            }
            if(keep) out.add(mpesa);
        }
        for(MsgRow r: master){
            boolean keep;
            switch(filter){
                case 0: keep = r.category!=MsgRow.SPAM; break;          // Inbox
                case 1: keep = r.unread>0; break;                       // Unread
                case 2: keep = r.category==MsgRow.TRANSACTION; break;
                case 3: keep = r.category==MsgRow.OTP; break;
                case 4: keep = r.category==MsgRow.BILL; break;
                case 5: keep = r.category==MsgRow.TRAVEL; break;
                default: keep = r.category==MsgRow.SPAM; break;
            }
            if(keep) out.add(r);
        }
        if(withExtras){
            if(filter==1){ // Unread: promo after 2 rows, header on top
                if(out.size()>=2) out.add(2, MsgRow.ad());
                out.add(0, MsgRow.header(out.size()+" unread messages"));
                // fix count (exclude header/ad)
            } else if(filter==0){ // Inbox: promo after 2 rows
                if(out.size()>=2) out.add(2, MsgRow.ad());
            }
        }
        return out;
    }

    private void applyFilter(){
        List<MsgRow> list=filtered(selected,true);
        // correct unread header count
        if(selected==1){
            int u=countUnread(1);
            if(!list.isEmpty() && list.get(0).isHeader) list.get(0).headerText=u+" unread messages";
        }
        rv.setAdapter(new MsgAdapter(list));
        refreshChips();
    }

    private LinearLayout[] chipViews;
    private void buildChips(){
        chipContainer.removeAllViews();
        chipViews=new LinearLayout[chipLabels.length];
        for(int i=0;i<chipLabels.length;i++){
            final int idx=i;
            LinearLayout chip=new LinearLayout(getContext());
            chip.setOrientation(LinearLayout.HORIZONTAL); chip.setGravity(Gravity.CENTER_VERTICAL);
            LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, dp(36));
            lp.setMarginEnd(dp(8)); chip.setLayoutParams(lp);
            chip.setPadding(dp(16),0,dp(16),0);
            ImageView ic=new ImageView(getContext());
            LinearLayout.LayoutParams ilp=new LinearLayout.LayoutParams(dp(18),dp(18)); ilp.setMarginEnd(dp(6)); ic.setLayoutParams(ilp);
            ic.setImageResource(chipIcons[i]);
            TextView tv=new TextView(getContext()); tv.setText(chipLabels[i]); tv.setTextSize(14);
            TextView badge=new TextView(getContext()); badge.setGravity(Gravity.CENTER); badge.setTextSize(11);
            LinearLayout.LayoutParams blp=new LinearLayout.LayoutParams(dp(20),dp(20)); blp.setMarginStart(dp(8)); badge.setLayoutParams(blp);
            chip.addView(ic); chip.addView(tv); chip.addView(badge);
            chip.setTag(new View[]{ic,tv,badge});
            chip.setOnClickListener(v->{ selected=idx; applyFilter(); });
            chipContainer.addView(chip);
            chipViews[i]=chip;
        }
    }
    private void refreshChips(){
        for(int i=0;i<chipViews.length;i++){
            View[] parts=(View[])chipViews[i].getTag();
            ImageView ic=(ImageView)parts[0]; TextView tv=(TextView)parts[1]; TextView badge=(TextView)parts[2];
            boolean sel = i==selected;
            chipViews[i].setBackgroundResource(sel?R.drawable.bg_chip_selected:R.drawable.bg_chip_unselected);
            tv.setTextColor(sel?Color.WHITE:0xFFEFF1F1);
            int iconTint = i==6 ? 0xFFFA301E : (sel?Color.WHITE:0xFF146FF5); // spam red
            ic.setColorFilter(iconTint);
            int cnt=countUnread(i);
            if(cnt>0){
                badge.setVisibility(View.VISIBLE); badge.setText(String.valueOf(cnt));
                if(sel){ badge.setBackgroundResource(R.drawable.bg_white_badge); badge.setTextColor(0xFF146FF5); }
                else { badge.setBackgroundResource(R.drawable.bg_red_badge); badge.setTextColor(Color.WHITE); }
            } else badge.setVisibility(View.GONE);
        }
    }
}