package com.uidemo.truecaller;

import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import androidx.annotation.*;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.*;
import java.util.*;
import com.uidemo.truecaller.adapter.CallAdapter;
import com.uidemo.truecaller.model.Row;

public class CallsFragment extends Fragment {
    static final int TEAL=0, PURPLE=1, NAVY=2, GOLD=3;
    private Row call(int av,String initial,String name,String sub,int dir,int action,String count,boolean t,boolean tr){
        Row r=new Row(initial,name,sub,null);
        switch(av){
            case NAVY:   r.avatarBg=R.color.avatarNavy;   r.avatarTextColor=R.color.avatarNavyText;   break;
            case GOLD:   r.avatarBg=R.color.avatarGold;   r.avatarTextColor=R.color.avatarGoldText;   break;
            case PURPLE: r.avatarBg=R.color.avatarPurple; r.avatarTextColor=R.color.avatarPurpleText; break;
            default:     r.avatarBg=R.color.avatarTeal;   r.avatarTextColor=R.color.avatarTealText;   break;
        }
        r.dirIcon=dir; r.actionIcon=action; r.count=count; r.tBadge=t; r.trueBadge=tr; return r;
    }
    @Nullable @Override public View onCreateView(@NonNull LayoutInflater inf, @Nullable ViewGroup c, @Nullable Bundle s){
        View v=inf.inflate(R.layout.fragment_calls,c,false);
        RecyclerView list=v.findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(getContext()));
        int OUT=R.drawable.ic_tcx_event_outgoing_call_16dp, IN=R.drawable.ic_tcx_event_incoming_call_16dp, MISS=R.drawable.ic_tcx_event_missed_call_16dp;
        int WA=R.drawable.ic_tcx_action_whatsapp_outline_24dp, CALL=R.drawable.ic_tcx_action_call_24dp;

        List<Row> rows=new ArrayList<>();
        // realistic Kenyan save-names (how people actually store contacts)
        rows.add(call(TEAL,  "M","Mum",             "WhatsApp \u00b7 02:42", OUT, WA,   null,false,false));
        rows.add(call(TEAL,  "L","Landlord",        "Yesterday",            OUT, CALL, "1", true, false));
        rows.add(Row.ad());   // Get Truecaller Premium promo
        rows.add(call(PURPLE,"C","Cuzo Mwangi",     "Yesterday",            IN,  CALL, "1", false,false));
        rows.add(call(PURPLE,"H","Haron Mwaura",    "Yesterday",            OUT, CALL, "1", true, true));
        rows.add(call(NAVY,  "E","Erick Fundi Bike","Yesterday",            IN,  CALL, "2", false,true));
        rows.add(call(PURPLE,"D","Davy Bro",        "Yesterday",            IN,  CALL, "2", false,false));
        rows.add(call(GOLD,  "A","Airtel Madhe Makaa","Yesterday",          MISS,CALL, "1", false,false));
        // more realistic history
        rows.add(call(TEAL,  "B","Boda Guy",        "Yesterday",            IN,  CALL, null,false,false));
        rows.add(call(PURPLE,"M","Mama Mboga",      "Yesterday",            MISS,CALL, "2", false,false));
        rows.add(call(NAVY,  "C","Caro Sales",      "WhatsApp \u00b7 Yesterday", OUT, WA, null,true,false));
        rows.add(call(PURPLE,"S","Shiku Salon",     "Mon",                  IN,  CALL, null,false,false));
        rows.add(call(TEAL,  "K","Kdf Kevo",        "Mon",                  MISS,CALL, "1", false,false));
        rows.add(call(GOLD,  "D","Dr Otieno",       "Mon",                  OUT, CALL, null,false,true));
        rows.add(call(NAVY,  "P","Pastor Jim",      "Mon",                  IN,  CALL, "3", false,false));
        rows.add(call(PURPLE,"B","Bro Ali",         "WhatsApp \u00b7 Sun",  OUT, WA,   null,true,false));
        rows.add(call(TEAL,  "F","Fundi Wa Stima",  "Sun",                  MISS,CALL, null,false,false));
        rows.add(call(PURPLE,"S","Sista Njeri",     "Sun",                  IN,  CALL, "1", false,false));
        rows.add(call(NAVY,  "C","Chama Group",     "Sun",                  OUT, CALL, null,false,false));
        rows.add(call(GOLD,  "G","Gym Trainer",     "Sat",                  IN,  CALL, null,false,false));
        rows.add(call(TEAL,  "M","Mecho Wa Maziwa", "Sat",                  MISS,CALL, "2", false,false));

        CallAdapter adapter=new CallAdapter(rows);
        adapter.setOnRowClick(row->{
            Intent i=new Intent(getContext(), ContactDetailActivity.class);
            i.putExtra("name", row.title); i.putExtra("initial", row.initial); i.putExtra("tBadge", row.tBadge);
            startActivity(i);
        });
        list.setAdapter(adapter);
        return v;
    }
}