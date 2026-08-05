package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/deeplink/handlers/ExternalUrlDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "Lcom/truecaller/deeplink/handlers/ExternalUrlDeepLinkHandler$bar;", "bar", "baz", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ExternalUrlDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<com.truecaller.deeplink.handlers.ExternalUrlDeepLinkHandler.bar> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.ExternalUrlDeepLinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/deeplink/handlers/ExternalUrlDeepLinkHandler$bar;", "", "", "url", "<init>", "(Ljava/lang/String;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class bar {
        public final java.lang.String a;

        public bar(@com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "url", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.NotNull java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "url");
            this.a = str;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.truecaller.deeplink.handlers.ExternalUrlDeepLinkHandler.bar) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.deeplink.handlers.ExternalUrlDeepLinkHandler.bar) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final java.lang.String toString() {
            return bar.t("Args(url=", this.a, ")");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/ExternalUrlDeepLinkHandler$baz;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface baz {
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        java.lang.String str;
        com.truecaller.deeplink.handlers.ExternalUrlDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.ExternalUrlDeepLinkHandler.bar) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "deepLinkArgs");
        java.lang.String str2 = barVar.a;
        try {
            android.net.Uri parse = android.net.Uri.parse(str2);
            java.lang.String scheme = parse.getScheme();
            if (scheme != null) {
                java.util.Locale locale = java.util.Locale.ROOT;
                java.lang.String lowerCase = scheme.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase != null) {
                    java.lang.String host = parse.getHost();
                    if (host != null) {
                        java.lang.String lowerCase2 = host.toLowerCase(locale);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        if (lowerCase2 != null) {
                            if (lowerCase.equals("https") && (lowerCase2.equals("truecaller.com") || kotlin.text.y.o(lowerCase2, ".truecaller.com", false))) {
                                android.app.Activity O = ye0.k.O(context);
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(O, "activity");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.deeplink.handlers.ExternalUrlDeepLinkHandler.baz.class, "entryPoint");
                                tx.e eVar = (com.truecaller.deeplink.handlers.ExternalUrlDeepLinkHandler.baz) j71.g.E(com.truecaller.deeplink.handlers.ExternalUrlDeepLinkHandler.baz.class, O);
                                context.startActivity(((com.truecaller.ui.b0) eVar.f.t9.get()).d(context));
                                android.content.Context context2 = (android.content.Context) eVar.i.a;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
                                java.lang.String str3 = barVar.a;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "url");
                                kr0.o oVar = new kr0.o(29, java.lang.Integer.valueOf(context2.getColor(android.R.color.white) | (-16777216)), (java.lang.Object) null);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(oVar, "build(...)");
                                v.f fVar = new v.f();
                                fVar.e();
                                android.os.Bundle bundle = new android.os.Bundle();
                                java.lang.Integer num = (java.lang.Integer) oVar.b;
                                if (num != null) {
                                    bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
                                }
                                java.lang.Integer num2 = (java.lang.Integer) oVar.c;
                                if (num2 != null) {
                                    bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
                                }
                                fVar.d = bundle;
                                v.g a = fVar.a();
                                a.a.putExtra("android.intent.extra.REFERRER", android.net.Uri.parse("2" + context2.getPackageName()));
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "apply(...)");
                                try {
                                    a.a(context2, android.net.Uri.parse(str3));
                                    return;
                                } catch (android.content.ActivityNotFoundException | java.lang.SecurityException unused) {
                                    return;
                                }
                            }
                            java.lang.StringBuilder E = ro0.f.E("SECURITY ALERT: Blocked non-HTTP scheme '", lowerCase, "' or invalid host '", lowerCase2, "'. Payload: ");
                            E.append(str2);
                            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash(E.toString());
                            return;
                        }
                    }
                    str = "Missing host in URL. Payload: ";
                    qb.qux.v(str, str2);
                }
            }
            str = "Missing scheme in URL. Payload: ";
            qb.qux.v(str, str2);
        } catch (java.lang.Exception e) {
            qb.qux.v("Invalid URL format in DeepLink: ", e.getMessage());
        }
    }
}
