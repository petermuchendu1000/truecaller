package com.uidemo.truecaller.model;

public class Msg {
    public String text, time;
    public boolean outgoing;
    public Msg(String text, String time, boolean outgoing) {
        this.text = text; this.time = time; this.outgoing = outgoing;
    }
}
