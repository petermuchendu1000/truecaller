package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppHomeDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/deeplink/handlers/SettingsDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "Lcom/truecaller/deeplink/handlers/SettingsDeepLinkHandler$bar;", "baz", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SettingsDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<com.truecaller.deeplink.handlers.SettingsDeepLinkHandler.bar> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.SettingsDeepLinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/deeplink/handlers/SettingsDeepLinkHandler$bar;", "", "", "setting", "category", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class bar {
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;

        public bar(@com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "setting", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.String str, @com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "category", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.String str2, @com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "action", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.deeplink.handlers.SettingsDeepLinkHandler.bar)) {
                return false;
            }
            com.truecaller.deeplink.handlers.SettingsDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.SettingsDeepLinkHandler.bar) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, barVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, barVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, barVar.c);
        }

        public final int hashCode() {
            java.lang.String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final java.lang.String toString() {
            return bar.v(this.c, ")", ro0.f.E("Args(setting=", this.a, ", category=", this.b, ", action="));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/SettingsDeepLinkHandler$baz;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface baz {
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        com.truecaller.deeplink.handlers.SettingsDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.SettingsDeepLinkHandler.bar) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "args");
        tx.w wVar = (com.truecaller.deeplink.handlers.SettingsDeepLinkHandler.baz) f40.d0.z(context, com.truecaller.deeplink.handlers.SettingsDeepLinkHandler.baz.class);
        f6.k1 e = wVar.z0().e(context);
        java.lang.String str = barVar.b;
        if (str == null) {
            str = "SETTINGS_MAIN";
        }
        java.lang.String str2 = barVar.c;
        java.lang.String str3 = barVar.a;
        kq2.baz bazVar = com.truecaller.settings.api.SettingsCategory.Companion;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        bazVar.getClass();
        com.truecaller.settings.api.SettingsCategory a = kq2.baz.a(upperCase);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "category");
        switch (yp0.bar.a[a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                com.truecaller.ui.b0 z0 = wVar.z0();
                java.lang.String lowerCase = str.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                wi0.bar.F(z0, context, lowerCase, (com.truecaller.call_assistant.campaigns.deeplinks.external.AssistantCampaignInfo) null, 4);
                return;
            default:
                uq2.baz bazVar2 = (uq2.baz) wVar.Xb.get();
                bazVar2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                java.util.Locale locale2 = java.util.Locale.ENGLISH;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "ENGLISH");
                java.lang.String upperCase2 = str.toUpperCase(locale2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                com.truecaller.settings.api.SettingsCategory a2 = kq2.baz.a(upperCase2);
                il2.bar barVar2 = bazVar2.a;
                com.truecaller.settings.api.SettingsLaunchConfig settingsLaunchConfig = new com.truecaller.settings.api.SettingsLaunchConfig("deepLink");
                switch (uq2.bar.a[a2.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        settingsLaunchConfig = com.truecaller.settings.api.SettingsLaunchConfig.copy$default(settingsLaunchConfig, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, true, false, 47, (java.lang.Object) null);
                        break;
                }
                com.truecaller.settings.api.SettingDeepLink.Companion.getClass();
                android.content.Intent a3 = barVar2.a(context, settingsLaunchConfig, a2, kq2.bar.a(str3), str2);
                if (a3 != null) {
                    e.a(a3);
                }
                e.d();
                return;
        }
    }
}
