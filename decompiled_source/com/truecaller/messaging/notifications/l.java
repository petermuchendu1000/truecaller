package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class l {
    public final android.content.Context a;
    public final java.util.LinkedHashSet b;
    public boolean c;

    public l(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = new java.util.LinkedHashSet();
    }

    public final boolean a(long j) {
        boolean z = this.c;
        java.util.LinkedHashSet linkedHashSet = this.b;
        if (!z) {
            try {
                this.c = true;
                java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
                try {
                    while (true) {
                        try {
                            linkedHashSet2.add(java.lang.Long.valueOf(new java.io.DataInputStream(this.a.openFileInput("notifications.state")).readLong()));
                        } finally {
                        }
                    }
                } catch (java.io.EOFException unused) {
                    linkedHashSet.clear();
                    linkedHashSet.addAll(linkedHashSet2);
                }
            } catch (java.io.IOException unused2) {
                kotlin.Unit unit = kotlin.Unit.a;
            }
        }
        return linkedHashSet.contains(java.lang.Long.valueOf(j));
    }
}
