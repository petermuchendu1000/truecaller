package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class v {
    public final android.content.Context a;

    public v(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "appContext");
        this.a = context;
    }

    public final android.content.pm.ShortcutManager a() {
        java.lang.Object systemService = this.a.getSystemService("shortcut");
        kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.content.pm.ShortcutManager");
        return h6.a.e(systemService);
    }
}
