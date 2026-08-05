package com.uidemo.truecaller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import com.uidemo.truecaller.adapter.CallAdapter;
import com.uidemo.truecaller.model.Row;

public class CallsFragment extends Fragment {
    @Nullable @Override public View onCreateView(@NonNull LayoutInflater inf, @Nullable ViewGroup c, @Nullable Bundle s) {
        View v = inf.inflate(R.layout.fragment_calls, c, false);
        RecyclerView list = v.findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Row> rows = new ArrayList<>();

        rows.add(Row.banner());   // top display ad

        Row r1 = new Row("H", "Highpoint John", "WhatsApp \u00b7 02:42", null);
        r1.avatarBg = R.color.avatarTeal; r1.avatarTextColor = R.color.avatarTealText;
        r1.dirIcon = R.drawable.ic_tcx_event_outgoing_call_16dp;
        r1.actionIcon = R.drawable.ic_tcx_action_whatsapp_outline_24dp;
        rows.add(r1);

        Row r2 = new Row("M", "Mohan John", "Yesterday", null);
        r2.avatarBg = R.color.avatarTeal; r2.avatarTextColor = R.color.avatarTealText; r2.tBadge = true;
        r2.dirIcon = R.drawable.ic_tcx_event_outgoing_call_16dp; r2.count = "1";
        r2.actionIcon = R.drawable.ic_tcx_action_call_24dp;
        rows.add(r2);

        rows.add(Row.ad());       // Logbook Loans native ad

        Row r3 = new Row("M", "Martine Otieno", "Yesterday", null);
        r3.avatarBg = R.color.avatarPurple; r3.avatarTextColor = R.color.avatarPurpleText;
        r3.dirIcon = R.drawable.ic_tcx_event_incoming_call_16dp; r3.count = "1";
        r3.actionIcon = R.drawable.ic_tcx_action_call_24dp;
        rows.add(r3);

        Row r4 = new Row("H", "Haron Mwaura", "Yesterday", null);
        r4.avatarBg = R.color.avatarPurple; r4.avatarTextColor = R.color.avatarPurpleText;
        r4.tBadge = true; r4.trueBadge = true;
        r4.dirIcon = R.drawable.ic_tcx_event_outgoing_call_16dp; r4.count = "1";
        r4.actionIcon = R.drawable.ic_tcx_action_call_24dp;
        rows.add(r4);

        list.setAdapter(new CallAdapter(rows));
        return v;
    }
}
