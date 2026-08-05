package com.truecaller.messaging.fraud.useronboard;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class bar {
    public final android.content.Context a;
    public final uq2.baz b;

    public bar(android.content.Context context, uq2.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "settingsRouter");
        this.a = context;
        this.b = bazVar;
    }

    public final android.content.Intent a() {
        android.content.Intent addFlags = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("truecaller://external_url?url=" + android.net.Uri.encode("https://truecaller.com/fraud-detection-messages-faq"))).addFlags(268435456);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
        return addFlags;
    }

    public final android.content.Intent b() {
        com.truecaller.settings.api.SettingsCategory settingsCategory = com.truecaller.settings.api.SettingsCategory.SETTINGS_MESSAGING;
        return this.b.a(this.a, new com.truecaller.settings.api.SettingsLaunchConfig("inbox-overflowMenuSettingsMessagingChangeDma"), settingsCategory, com.truecaller.settings.api.SettingDeepLink.FRAUD_WARNINGS);
    }
}
