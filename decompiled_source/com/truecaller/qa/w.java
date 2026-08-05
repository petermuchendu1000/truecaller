package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class w {
    public final android.content.Context a;
    public final boolean b;

    public w(android.content.Context context, m03.s sVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "deviceManager");
        this.a = context;
        this.b = m03.r.s(sVar.a);
    }

    public final boolean a() {
        boolean z = this.b;
        if (z) {
            android.content.Context context = this.a;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.qa.QMActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        return z;
    }
}
