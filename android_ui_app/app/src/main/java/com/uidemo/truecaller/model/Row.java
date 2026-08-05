package com.uidemo.truecaller.model;

public class Row {
    // view types for the Calls list
    public static final int CALL = 0, AD = 1, BANNER = 2;
    public int type = CALL;

    public String initial, title, subtitle, time, badge, count;
    public boolean available, tBadge, trueBadge;
    public int subtitleIcon;    // used by Messages (compound drawable)
    public int avatarBg;        // color res
    public int avatarTextColor; // color res
    public int subtitleColor;   // color res
    public int dirIcon;         // call-direction icon res
    public int actionIcon;      // right action icon res

    public Row() {}
    public Row(String initial, String title, String subtitle, String time) {
        this.initial = initial; this.title = title; this.subtitle = subtitle; this.time = time;
    }
    public static Row ad() { Row r = new Row(); r.type = AD; return r; }
    public static Row banner() { Row r = new Row(); r.type = BANNER; return r; }
}
