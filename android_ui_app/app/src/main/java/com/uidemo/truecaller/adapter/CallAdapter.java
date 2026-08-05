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

public class CallAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final List<Row> data;
    public CallAdapter(List<Row> data) { this.data = data; }

    @Override public int getItemViewType(int position) { return data.get(position).type; }

    @NonNull @Override public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup p, int type) {
        LayoutInflater inf = LayoutInflater.from(p.getContext());
        if (type == Row.BANNER) return new Simple(inf.inflate(R.layout.item_ad_banner, p, false));
        if (type == Row.AD)     return new Simple(inf.inflate(R.layout.item_call_ad, p, false));
        return new CallVH(inf.inflate(R.layout.item_call, p, false));
    }

    @Override public void onBindViewHolder(@NonNull RecyclerView.ViewHolder h, int i) {
        Row r = data.get(i);
        if (!(h instanceof CallVH)) return;   // banner + ad rows are static
        CallVH v = (CallVH) h;
        v.avatar.setText(r.initial);
        if (r.avatarBg != 0) v.avatar.getBackground().setColorFilter(
                v.itemView.getResources().getColor(r.avatarBg), PorterDuff.Mode.SRC_IN);
        if (r.avatarTextColor != 0) v.avatar.setTextColor(v.itemView.getResources().getColor(r.avatarTextColor));
        v.name.setText(r.title);
        v.tbadge.setVisibility(r.tBadge ? View.VISIBLE : View.GONE);
        v.trueBadge.setVisibility(r.trueBadge ? View.VISIBLE : View.GONE);
        if (r.dirIcon != 0) { v.dir.setVisibility(View.VISIBLE); v.dir.setImageResource(r.dirIcon); }
        else v.dir.setVisibility(View.GONE);
        if (r.count != null) { v.count.setVisibility(View.VISIBLE); v.count.setText(r.count); }
        else v.count.setVisibility(View.GONE);
        v.subtitle.setText(r.subtitle);
        if (r.actionIcon != 0) { v.action.setVisibility(View.VISIBLE); v.action.setImageResource(r.actionIcon); }
        else v.action.setVisibility(View.GONE);
    }
    @Override public int getItemCount() { return data.size(); }

    static class Simple extends RecyclerView.ViewHolder { Simple(View v){ super(v); } }
    static class CallVH extends RecyclerView.ViewHolder {
        TextView avatar, name, count, subtitle, tbadge, trueBadge; ImageView dir, action;
        CallVH(View v) {
            super(v);
            avatar = v.findViewById(R.id.avatar);
            name = v.findViewById(R.id.name);
            count = v.findViewById(R.id.count);
            subtitle = v.findViewById(R.id.subtitle);
            tbadge = v.findViewById(R.id.tbadge);
            trueBadge = v.findViewById(R.id.trueBadge);
            dir = v.findViewById(R.id.dir);
            action = v.findViewById(R.id.action);
        }
    }
}
