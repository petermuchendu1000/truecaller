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
        d.add(MsgRow.txn(MsgRow.AV_WHITE,"N","National Bank of Kenya","+ KES 1,150",true,"Received","00:27",1));
        d.add(MsgRow.txn(MsgRow.AV_WHITE,"M","LIPANAMPESA","- KSH 1,150",false,"ATM Withdrawal","00:27",1));
        d.add(MsgRow.ad());
        d.add(MsgRow.txn(MsgRow.AV_WHITE,"M","MPESA","+ KSH 50",true,"Received","00:08",0));
        d.add(MsgRow.plain(MsgRow.AV_WHITE,"G","Google","\u2022\u2022\u2022 333 198","Yesterday",0,false));
        d.add(MsgRow.plain(MsgRow.AV_NAVY,"P","Purity Gaicugi National Bank","Calling you","Mon",0,true));
        d.add(MsgRow.plain(MsgRow.AV_PURPLE,"G","Global Pay (Netflix Money)","\u2022\u2022\u2022 778 084","Mon",0,false));
        rv.setAdapter(new MsgAdapter(d));
        return v;
    }
}
