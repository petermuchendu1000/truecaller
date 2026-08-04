package com.uidemo.truecaller;

import android.content.Intent;
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
import com.uidemo.truecaller.adapter.RowAdapter;
import com.uidemo.truecaller.model.Row;

public class CallsFragment extends Fragment {
    @Nullable @Override public View onCreateView(@NonNull LayoutInflater inf, @Nullable ViewGroup c, @Nullable Bundle s) {
        View v = inf.inflate(R.layout.fragment_calls, c, false);
        RecyclerView list = v.findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Row> rows = new ArrayList<>();
        Row r1 = new Row("P", "Priya Sharma", "Incoming", "2:38 PM"); r1.available = true; r1.subtitleIcon = R.drawable.ic_call_log_menu_incoming_24; rows.add(r1);
        Row r2 = new Row("R", "Rahul Verma", "Outgoing · 2", "1:12 PM"); r2.subtitleIcon = R.drawable.ic_call_log_menu_outgoing_24; rows.add(r2);
        Row r3 = new Row("!", "+1 (415) 555-0134", "Missed", "12:40 PM"); r3.avatarBg = R.color.alertRed; r3.subtitleIcon = R.drawable.ic_call_log_menu_missed_24; r3.subtitleColor = R.color.alertRed; rows.add(r3);
        Row r4 = new Row("H", "HDFC Bank", "Incoming", "Yesterday"); r4.avatarBg = R.color.verifiedGreen; r4.subtitleIcon = R.drawable.ic_call_log_menu_incoming_24; rows.add(r4);
        Row r5 = new Row("M", "Mom", "Outgoing", "Yesterday"); r5.subtitleIcon = R.drawable.ic_call_log_menu_outgoing_24; rows.add(r5);

        // tapping a call row previews the incoming-call screen
        list.setAdapter(new RowAdapter(rows, row -> {
            Intent i = new Intent(getContext(), IncomingCallActivity.class);
            i.putExtra("name", row.title); i.putExtra("initial", row.initial);
            startActivity(i);
        }));

        v.findViewById(R.id.fab).setOnClickListener(x ->
            startActivity(new Intent(getContext(), IncomingCallActivity.class)
                .putExtra("name", "Priya Sharma").putExtra("initial", "P")));
        return v;
    }
}
