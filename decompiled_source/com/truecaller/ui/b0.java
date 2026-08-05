package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class b0 {
    public final qc3.bar a;

    public b0(qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "generalSettings");
        this.a = barVar;
    }

    public final android.content.Intent a(android.content.Context context) {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.content.Intent putExtra = y90.m6.o(context, com.truecaller.bottombar.BottomBarButtonType.ASSISTANT, "assistant_interstitial", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 96).putExtra("KEY_ANALYTICS_CONTEXT", "premiumUserTab").putExtra("extra_should_show_onboarding", bool);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        return putExtra;
    }

    public final android.content.Intent b(android.content.Context context, java.lang.String str, com.truecaller.messaging.data.types.InboxTab inboxTab) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboxTab, "inboxTab");
        return y90.m6.o(context, com.truecaller.bottombar.BottomBarButtonType.MESSAGES, str, (java.lang.String) null, inboxTab, 96);
    }

    public final android.content.Intent c(android.content.Context context, com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType, java.lang.String str, com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs floatingToolbarTabs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomBarButtonType, "tab");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomBarButtonType, "tab");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        return y90.m6.s(context, bottomBarButtonType, str, (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, false, floatingToolbarTabs);
    }

    public final android.content.Intent d(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("deepLink", "analyticsContext");
        return y90.m6.o(context, ((jq2.a) ((jq2.qux) this.a.get())).o0().toBottomBarButtonType(), "deepLink", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 120);
    }

    public final f6.k1 e(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        f6.k1 k1Var = new f6.k1(context);
        k1Var.a.add(wi0.bar.f(this, context, ((jq2.a) ((jq2.qux) this.a.get())).o0().toBottomBarButtonType(), "deepLink", (com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs) null, 120));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k1Var, "addNextIntent(...)");
        return k1Var;
    }

    public final void f(android.content.Context context, com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomBarButtonType, "tab");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        y90.m6.P(context, bottomBarButtonType, str, false);
    }
}
