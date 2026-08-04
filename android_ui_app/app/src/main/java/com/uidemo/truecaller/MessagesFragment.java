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

public class MessagesFragment extends Fragment {
    @Nullable @Override public View onCreateView(@NonNull LayoutInflater inf, @Nullable ViewGroup c, @Nullable Bundle s) {
        View v = inf.inflate(R.layout.fragment_messages, c, false);
        RecyclerView list = v.findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Row> rows = new ArrayList<>();
        Row r1 = new Row("P", "Priya Sharma", "See you at 7! \uD83D\uDE42", "2:38 PM"); r1.available = true; r1.badge = "2"; rows.add(r1);
        Row r2 = new Row("H", "HDFC Bank", "Rs.2,499 debited from a/c XX2345", "1:12 PM"); r2.avatarBg = R.color.verifiedGreen; rows.add(r2);
        Row r3 = new Row("A", "Amazon", "123456 is your OTP. Do not share.", "12:04 PM"); r3.badge = "1"; rows.add(r3);
        Row r4 = new Row("!", "+1 (415) 555-0134", "You won a prize! Click http://...", "11:20 AM"); r4.avatarBg = R.color.alertRed; r4.subtitleColor = R.color.alertRed; rows.add(r4);
        Row r5 = new Row("M", "Mom", "You: Reached home safely", "Yesterday"); rows.add(r5);
        Row r6 = new Row("S", "Swiggy", "Your order is on the way \uD83D\uDEF5", "Mon"); rows.add(r6);

        list.setAdapter(new RowAdapter(rows, row -> {
            Intent i = new Intent(getContext(), ConversationActivity.class);
            i.putExtra("name", row.title); i.putExtra("initial", row.initial);
            startActivity(i);
        }));

        v.findViewById(R.id.fab).setOnClickListener(x ->
            startActivity(new Intent(getContext(), ConversationActivity.class)
                .putExtra("name", "New conversation").putExtra("initial", "+")));
        return v;
    }
}
