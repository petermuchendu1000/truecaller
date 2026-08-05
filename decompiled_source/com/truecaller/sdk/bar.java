package com.truecaller.sdk;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class bar implements of0.b {
    public java.lang.Object a;

    public bar(java.lang.Object obj) {
        this.a = obj;
    }

    public java.lang.Object b2(java.lang.Object obj) {
        if (this instanceof og2.a) {
            return ((og2.a) this).a;
        }
        java.lang.Object obj2 = this.a;
        if (obj2 == null) {
            return obj;
        }
        return obj2;
    }

    public void m1() {
        this.a = null;
    }

    public void u0(java.lang.Object obj) {
        this.a = obj;
    }
}
