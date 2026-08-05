package com.uidemo.truecaller;

import android.os.Bundle;
import android.view.*;
import androidx.annotation.*;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.*;
import java.util.*;
import com.uidemo.truecaller.adapter.MsgAdapter;
import com.uidemo.truecaller.model.MsgRow;

public class MessagesFragment extends Fragment {
    @Nullable @Override public View onCreateView(@NonNull LayoutInflater inf, @Nullable ViewGroup c, @Nullable Bundle b){
        View v=inf.inflate(R.layout.fragment_messages,c,false);
        RecyclerView rv=v.findViewById(R.id.list);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        List<MsgRow> d=new ArrayList<>();
        // --- from screenshot ---
        d.add(MsgRow.txn(MsgRow.AV_WHITE,"N","National Bank of Kenya","+ KES 1,150",true,"Received","00:27",1));
        d.add(MsgRow.txn(MsgRow.AV_WHITE,"M","LIPANAMPESA","- KSH 1,150",false,"ATM Withdrawal","00:27",1));
        d.add(MsgRow.ad());
        d.add(MsgRow.txn(MsgRow.AV_WHITE,"M","MPESA","+ KSH 50",true,"Received","00:08",0));
        d.add(MsgRow.plain(MsgRow.AV_WHITE,"G","Google","\u2022\u2022\u2022 333 198","Yesterday",0,false));
        d.add(MsgRow.plain(MsgRow.AV_NAVY,"P","Purity Gaicugi National Bank","Calling you","Mon",0,true));
        d.add(MsgRow.plain(MsgRow.AV_PURPLE,"G","Global Pay (Netflix Money)","\u2022\u2022\u2022 778 084","Mon",0,false));
        // --- more, scrollable ---
        d.add(MsgRow.txn(MsgRow.AV_NAVY,"E","Equity Bank","+ KES 4,500",true,"Salary","Mon",0));
        d.add(MsgRow.plain(MsgRow.AV_WHITE,"S","Safaricom","Your data bundle is running low. Buy now.","Mon",0,false));
        d.add(MsgRow.txn(MsgRow.AV_NAVY,"J","John Kamau","- KSH 300",false,"Sent","Sun",0));
        d.add(MsgRow.plain(MsgRow.AV_WHITE,"K","KCB Bank","\u2022\u2022\u2022 902 447 is your OTP","Sun",0,false));
        d.add(MsgRow.txn(MsgRow.AV_PURPLE,"W","Wanjiru Njoroge","+ KSH 2,000",true,"Received","Sun",0));
        d.add(MsgRow.plain(MsgRow.AV_NAVY,"A","Absa Bank Kenya","Statement ready for July","Sat",0,false));
        d.add(MsgRow.txn(MsgRow.AV_WHITE,"A","Airtel Money","- KSH 120",false,"Airtime","Sat",0));
        d.add(MsgRow.plain(MsgRow.AV_PURPLE,"O","Otieno Odhiambo","See you at 5","Sat",0,true));
        d.add(MsgRow.txn(MsgRow.AV_NAVY,"C","Co-op Bank","+ KES 8,750",true,"Deposit","Fri",0));
        d.add(MsgRow.plain(MsgRow.AV_WHITE,"J","Jumia","Your order has been shipped","Fri",0,false));
        d.add(MsgRow.txn(MsgRow.AV_PURPLE,"M","Mercy Achieng","- KSH 950",false,"ATM Withdrawal","Fri",0));
        d.add(MsgRow.plain(MsgRow.AV_NAVY,"D","DTB Bank","Payment due: KSH 3,200","Thu",0,false));
        d.add(MsgRow.plain(MsgRow.AV_PURPLE,"K","Kevin Mwangi","Asante sana","Thu",0,true));
        rv.setAdapter(new MsgAdapter(d));
        return v;
    }
}
