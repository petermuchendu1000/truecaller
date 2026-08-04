package com.uidemo.truecaller.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import com.uidemo.truecaller.R;
import com.uidemo.truecaller.model.Msg;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.VH> {
    private final List<Msg> data;
    public MessageAdapter(List<Msg> data) { this.data = data; }

    @Override public int getItemViewType(int position) { return data.get(position).outgoing ? 1 : 0; }

    @NonNull @Override public VH onCreateViewHolder(@NonNull ViewGroup p, int type) {
        int layout = type == 1 ? R.layout.item_message_out : R.layout.item_message_in;
        View v = LayoutInflater.from(p.getContext()).inflate(layout, p, false);
        return new VH(v);
    }
    @Override public void onBindViewHolder(@NonNull VH h, int i) {
        Msg m = data.get(i);
        h.text.setText(m.text);
        h.meta.setText(m.outgoing ? m.time + "  ✓✓" : m.time);
    }
    @Override public int getItemCount() { return data.size(); }

    static class VH extends RecyclerView.ViewHolder {
        TextView text, meta;
        VH(View v) { super(v); text = v.findViewById(R.id.text); meta = v.findViewById(R.id.meta); }
    }
}
