package com.uidemo.truecaller;

import android.os.Bundle;
import android.view.*;
import androidx.annotation.*;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.*;
import java.util.*;
import com.uidemo.truecaller.adapter.CallAdapter;
import com.uidemo.truecaller.model.Row;

public class CallsFragment extends Fragment {
    private Row call(String initial,String name,String sub,int avBg,int avFg,int dir,int action,String count,boolean t,boolean tr){
        Row r=new Row(initial,name,sub,null);
        r.avatarBg=avBg; r.avatarTextColor=avFg; r.dirIcon=dir; r.actionIcon=action;
        r.count=count; r.tBadge=t; r.trueBadge=tr; return r;
    }
    @Nullable @Override public View onCreateView(@NonNull LayoutInflater inf, @Nullable ViewGroup c, @Nullable Bundle s){
        View v=inf.inflate(R.layout.fragment_calls,c,false);
        RecyclerView list=v.findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(getContext()));
        int TEAL=R.color.avatarTeal, TEALT=R.color.avatarTealText, PUR=R.color.avatarPurple, PURT=R.color.avatarPurpleText;
        int OUT=R.drawable.ic_tcx_event_outgoing_call_16dp, IN=R.drawable.ic_tcx_event_incoming_call_16dp, MISS=R.drawable.ic_tcx_event_missed_call_16dp;
        int WA=R.drawable.ic_tcx_action_whatsapp_outline_24dp, CALL=R.drawable.ic_tcx_action_call_24dp;

        List<Row> rows=new ArrayList<>();
        rows.add(Row.banner());
        // --- from screenshot ---
        rows.add(call("H","Highpoint John","WhatsApp \u00b7 02:42",TEAL,TEALT,OUT,WA,null,false,false));
        rows.add(call("M","Mohan John","Yesterday",TEAL,TEALT,OUT,CALL,"1",true,false));
        rows.add(Row.ad());
        rows.add(call("M","Martine Otieno","Yesterday",PUR,PURT,IN,CALL,"1",false,false));
        rows.add(call("H","Haron Mwaura","Yesterday",PUR,PURT,OUT,CALL,"1",true,true));
        // --- more history (random Kenyan names) ---
        rows.add(call("W","Wanjiku Kamau","Yesterday",TEAL,TEALT,IN,CALL,null,false,false));
        rows.add(call("B","Brian Otieno","Yesterday",PUR,PURT,MISS,CALL,"2",false,false));
        rows.add(call("F","Faith Mwangi","WhatsApp \u00b7 Yesterday",TEAL,TEALT,OUT,WA,null,true,false));
        rows.add(call("N","Njeri Kariuki","Mon",PUR,PURT,IN,CALL,null,false,false));
        rows.add(call("D","Dennis Kiprono","Mon",TEAL,TEALT,MISS,CALL,"1",false,false));
        rows.add(call("G","Grace Achieng","Mon",PUR,PURT,OUT,CALL,null,false,true));
        rows.add(call("S","Samuel Wafula","Mon",TEAL,TEALT,IN,CALL,"3",false,false));
        rows.add(call("C","Caroline Chebet","WhatsApp \u00b7 Sun",PUR,PURT,OUT,WA,null,true,false));
        rows.add(call("J","Joseph Mutua","Sun",TEAL,TEALT,MISS,CALL,null,false,false));
        rows.add(call("E","Esther Wambui","Sun",PUR,PURT,IN,CALL,"1",false,false));
        rows.add(call("P","Paul Onyango","Sun",TEAL,TEALT,OUT,CALL,null,true,true));
        rows.add(call("L","Lucy Nyambura","Sat",PUR,PURT,IN,CALL,null,false,false));
        rows.add(call("K","Kevin Barasa","Sat",TEAL,TEALT,MISS,CALL,"2",false,false));
        rows.add(call("A","Alice Wangari","WhatsApp \u00b7 Sat",PUR,PURT,OUT,WA,null,false,false));
        rows.add(call("V","Victor Kiptoo","Fri",TEAL,TEALT,IN,CALL,null,true,false));
        rows.add(call("M","Mercy Njoki","Fri",PUR,PURT,OUT,CALL,"1",false,false));
        rows.add(call("T","Timothy Gitau","Fri",TEAL,TEALT,MISS,CALL,null,false,false));

        list.setAdapter(new CallAdapter(rows));
        return v;
    }
}
