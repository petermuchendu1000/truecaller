package com.uidemo.truecaller.model;

public class MsgRow {
    public static final int AV_WHITE=0, AV_NAVY=1, AV_PURPLE=2, AV_TEAL=3, AV_RED=4;
    // categories
    public static final int INBOX=0, TRANSACTION=1, OTP=2, BILL=3, TRAVEL=4, SPAM=5;

    public int avatarType; public String letter; public String title;
    public boolean hasAmount; public String amount; public boolean credit;
    public String subtitle; public String time; public int unread; public boolean tBadge;
    public boolean isAd; public boolean isHeader; public String headerText;
    public int avatarRes; public int category;
    public String body;             // full SMS text (live transactions), shown in conversation view
    public long createdAtMs;        // epoch ms for live rows (0 for demo rows)
    public boolean mpesaThread;     // true => tapping opens the full MPESA conversation thread

    private MsgRow(){}
    public static MsgRow txn(int cat,int av,String letter,String title,String amount,boolean credit,String sub,String time,int unread){
        MsgRow r=new MsgRow(); r.category=cat; r.avatarType=av; r.letter=letter; r.title=title;
        r.hasAmount=true; r.amount=amount; r.credit=credit; r.subtitle="\u00b7 "+sub; r.time=time; r.unread=unread; return r;
    }
    public static MsgRow plain(int cat,int av,String letter,String title,String snippet,String time,int unread){
        MsgRow r=new MsgRow(); r.category=cat; r.avatarType=av; r.letter=letter; r.title=title;
        r.subtitle=snippet; r.time=time; r.unread=unread; return r;
    }
    public MsgRow logo(int res){ this.avatarRes=res; return this; }
    public static MsgRow ad(){ MsgRow r=new MsgRow(); r.isAd=true; return r; }
    public static MsgRow header(String text){ MsgRow r=new MsgRow(); r.isHeader=true; r.headerText=text; return r; }
}