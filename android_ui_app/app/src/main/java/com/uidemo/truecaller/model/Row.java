package com.uidemo.truecaller.model;

public class Row {
    public String initial, title, subtitle, time, badge;
    public boolean available;
    public int subtitleIcon;        // 0 = none, else drawable res
    public int avatarBg;            // 0 = default, else color
    public int subtitleColor;       // 0 = default
    public Row(String initial, String title, String subtitle, String time) {
        this.initial = initial; this.title = title; this.subtitle = subtitle; this.time = time;
    }
}
