package com.uidemo.truecaller.model;

public class MsgRow {
    public static final int AV_WHITE=0, AV_NAVY=1, AV_PURPLE=2;
    public int avatarType; public String letter; public String title;
    public boolean hasAmount; public String amount; public boolean credit;
    public String subtitle;      // category (with amount) OR plain snippet
    public String time; public int unread; public boolean tBadge; public boolean isAd;

    public static MsgRow txn(int av,String letter,String title,String amount,boolean credit,String cat,String time,int unread){
        MsgRow r=new MsgRow(); r.avatarType=av; r.letter=letter; r.title=title;
        r.hasAmount=true; r.amount=amount; r.credit=credit; r.subtitle="\u00b7 "+cat; r.time=time; r.unread=unread; return r;
    }
    public static MsgRow plain(int av,String letter,String title,String snippet,String time,int unread,boolean tBadge){
        MsgRow r=new MsgRow(); r.avatarType=av; r.letter=letter; r.title=title;
        r.subtitle=snippet; r.time=time; r.unread=unread; r.tBadge=tBadge; return r;
    }
    public static MsgRow ad(){ MsgRow r=new MsgRow(); r.isAd=true; return r; }
}
