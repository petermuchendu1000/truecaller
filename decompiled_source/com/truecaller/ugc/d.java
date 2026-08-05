package com.truecaller.ugc;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class d extends cl2.m implements com.truecaller.ugc.c {
    public final int c;
    public final java.lang.String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.SharedPreferences sharedPreferences) {
        super(sharedPreferences);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "prefs");
        this.c = 1;
        this.d = "es";
    }

    @Override // cl2.m
    public final int A() {
        return this.c;
    }

    @Override // cl2.m
    public final java.lang.String E() {
        return this.d;
    }

    @Override // cl2.m
    public final void W(int i, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.util.List j = kotlin.collections.y.j(new android.content.SharedPreferences[]{context.getSharedPreferences("core_settings", 0), context.getSharedPreferences("tc.settings", 0)});
        if (i < 1) {
            X(j, kotlin.collections.y0.b("backup"));
        }
    }
}
