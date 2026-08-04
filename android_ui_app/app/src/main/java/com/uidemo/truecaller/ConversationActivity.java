package com.uidemo.truecaller;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import com.uidemo.truecaller.adapter.MessageAdapter;
import com.uidemo.truecaller.model.Msg;

public class ConversationActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.activity_conversation);

        String name = getIntent().getStringExtra("name");
        String initial = getIntent().getStringExtra("initial");
        ((TextView) findViewById(R.id.thName)).setText(name != null ? name : "Conversation");
        ((TextView) findViewById(R.id.thAvatar)).setText(initial != null ? initial : "?");

        RecyclerView thread = findViewById(R.id.thread);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setStackFromEnd(true);
        thread.setLayoutManager(lm);

        List<Msg> msgs = new ArrayList<>();
        msgs.add(new Msg("Hey! Are we still on for dinner tonight?", "2:30 PM", false));
        msgs.add(new Msg("Yes! Booked a table at 7.", "2:31 PM", true));
        msgs.add(new Msg("Perfect \uD83D\uDE42", "2:32 PM", false));
        msgs.add(new Msg("I'll be there a bit early", "2:33 PM", true));
        msgs.add(new Msg("See you at 7! \uD83D\uDE42", "2:38 PM", false));
        MessageAdapter adapter = new MessageAdapter(msgs);
        thread.setAdapter(adapter);

        findViewById(R.id.back).setOnClickListener(v -> finish());

        EditText input = findViewById(R.id.msgInput);
        findViewById(R.id.send).setOnClickListener(v -> {
            String t = input.getText().toString().trim();
            if (t.isEmpty()) return;
            msgs.add(new Msg(t, "now", true));
            adapter.notifyItemInserted(msgs.size() - 1);
            thread.scrollToPosition(msgs.size() - 1);
            input.setText("");
        });
    }
}
