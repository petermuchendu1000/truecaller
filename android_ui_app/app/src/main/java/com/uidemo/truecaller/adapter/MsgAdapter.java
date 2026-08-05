package com.uidemo.truecaller.adapter;

import android.content.Intent;
import android.graphics.Color;
import android.view.*;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import com.uidemo.truecaller.R;
import com.uidemo.truecaller.ConversationActivity;
import com.uidemo.truecaller.model.MsgRow;

public class MsgAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    static final int ROW=0, AD=1;
    final List<MsgRow> data;
    public MsgAdapter(List<MsgRow> d){ data=d; }

    @Override public int getItemViewType(int p){ return data.get(p).isAd?AD:ROW; }
    @Override public int getItemCount(){ return data.size(); }

    @NonNull @Override public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup pg,int vt){
        LayoutInflater li=LayoutInflater.from(pg.getContext());
        if(vt==AD) return new AdVH(li.inflate(R.layout.item_msg_ad,pg,false));
        return new RowVH(li.inflate(R.layout.item_conversation,pg,false));
    }
    @Override public void onBindViewHolder(@NonNull RecyclerView.ViewHolder h,int p){
        if(h instanceof RowVH) ((RowVH)h).bind(data.get(p));
    }
    static class AdVH extends RecyclerView.ViewHolder{ AdVH(View v){super(v);} }

    static class RowVH extends RecyclerView.ViewHolder{
        FrameLayout avatar; TextView letter,title,amount,category,time,unread; ImageView snippetIcon,avatarImg; View snippetRow;
        RowVH(View v){ super(v);
            avatar=v.findViewById(R.id.avatar); letter=v.findViewById(R.id.avatarLetter); avatarImg=v.findViewById(R.id.avatarImg);
            title=v.findViewById(R.id.title); amount=v.findViewById(R.id.amount);
            category=v.findViewById(R.id.category); time=v.findViewById(R.id.timestamp);
            unread=v.findViewById(R.id.unreadCount); snippetIcon=v.findViewById(R.id.snippetIcon);
            snippetRow=v.findViewById(R.id.snippetRow);
        }
        void bind(MsgRow r){
            title.setText(r.title); time.setText(r.time); letter.setText(r.letter);
            if(r.avatarRes!=0){
                avatarImg.setVisibility(View.VISIBLE); avatarImg.setImageResource(r.avatarRes);
                letter.setVisibility(View.GONE); avatar.setBackground(null);
            } else {
                avatarImg.setVisibility(View.GONE); letter.setVisibility(View.VISIBLE);
                int bg, fg;
                switch(r.avatarType){
                    case MsgRow.AV_NAVY: bg=R.drawable.circle_navy; fg=0xFFDECCFF; break;
                    case MsgRow.AV_PURPLE: bg=R.drawable.circle_purple; fg=0xFFDECCFF; break;
                    default: bg=R.drawable.circle_white; fg=0xFF3A3D45; break;
                }
                avatar.setBackgroundResource(bg); letter.setTextColor(fg);
            }
            if(r.hasAmount){
                snippetIcon.setVisibility(View.VISIBLE); amount.setVisibility(View.VISIBLE);
                amount.setText(r.amount);
                amount.setTextColor(r.credit?0xFF33B73E:0xFFF28241);
                category.setText(r.subtitle); category.setTextColor(0xFFEFF1F1);
            } else {
                snippetIcon.setVisibility(View.GONE); amount.setVisibility(View.GONE);
                category.setText(r.subtitle); category.setTextColor(0xFF8D939B);
            }
            if(r.unread>0){ unread.setVisibility(View.VISIBLE); unread.setText(String.valueOf(r.unread)); }
            else unread.setVisibility(View.INVISIBLE);
            itemView.setOnClickListener(v->{
                Intent i=new Intent(v.getContext(), ConversationActivity.class);
                i.putExtra("title", r.title);
                v.getContext().startActivity(i);
            });
        }
    }
}
