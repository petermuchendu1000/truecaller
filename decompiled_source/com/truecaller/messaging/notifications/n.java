package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class n extends xd0.m {
    public final /* synthetic */ int b;
    public final java.util.Collection c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(xd0.baz bazVar, java.util.Collection collection, int i) {
        super(bazVar);
        this.b = i;
        this.c = collection;
    }

    public final bi3.a invoke(java.lang.Object obj) {
        switch (this.b) {
            case 0:
                ((com.truecaller.messaging.notifications.t) obj).c(this.c);
                return null;
            default:
                return ((f42.o1) obj).f(this.c);
        }
    }

    public final java.lang.String toString() {
        switch (this.b) {
            case 0:
                return ".dismissRegularNotifications(" + xd0.m.a(2, this.c) + ")";
            default:
                return ".forceUpdateImUsers(" + xd0.m.a(1, this.c) + "," + xd0.m.a(2, java.lang.Boolean.FALSE) + ")";
        }
    }
}
