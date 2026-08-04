package com.uidemo.truecaller.adapter;

import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import com.uidemo.truecaller.R;
import com.uidemo.truecaller.model.Row;

public class RowAdapter extends RecyclerView.Adapter<RowAdapter.VH> {
    public interface OnRowClick { void onClick(Row row); }
    private final List<Row> data;
    private final OnRowClick click;
    public RowAdapter(List<Row> data, OnRowClick click) { this.data = data; this.click = click; }

    @NonNull @Override public VH onCreateViewHolder(@NonNull ViewGroup p, int t) {
        View v = LayoutInflater.from(p.getContext()).inflate(R.layout.item_conversation, p, false);
        return new VH(v);
    }
    @Override public void onBindViewHolder(@NonNull VH h, int i) {
        Row r = data.get(i);
        h.avatar.setText(r.initial);
        if (r.avatarBg != 0) h.avatar.getBackground().setColorFilter(
                h.itemView.getResources().getColor(r.avatarBg), PorterDuff.Mode.SRC_IN);
        h.title.setText(r.title);
        h.subtitle.setText(r.subtitle);
        h.time.setText(r.time);
        h.avail.setVisibility(r.available ? View.VISIBLE : View.GONE);
        if (r.badge != null) { h.badge.setVisibility(View.VISIBLE); h.badge.setText(r.badge); }
        else h.badge.setVisibility(View.GONE);
        if (r.subtitleColor != 0) h.subtitle.setTextColor(h.itemView.getResources().getColor(r.subtitleColor));
        if (r.subtitleIcon != 0) {
            h.subtitle.setCompoundDrawablesWithIntrinsicBounds(r.subtitleIcon, 0, 0, 0);
            h.subtitle.setCompoundDrawablePadding(8);
        } else {
            h.subtitle.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        h.itemView.setOnClickListener(v -> { if (click != null) click.onClick(r); });
    }
    @Override public int getItemCount() { return data.size(); }

    static class VH extends RecyclerView.ViewHolder {
        TextView avatar, title, subtitle, time, badge; View avail;
        VH(View v) {
            super(v);
            avatar = v.findViewById(R.id.avatar);
            title = v.findViewById(R.id.title);
            subtitle = v.findViewById(R.id.subtitle);
            time = v.findViewById(R.id.timestamp);
            badge = v.findViewById(R.id.badge);
            avail = v.findViewById(R.id.avail);
        }
    }
}
