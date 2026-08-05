package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppHomeDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/deeplink/handlers/BlockLevelDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "Lcom/truecaller/deeplink/handlers/BlockLevelDeepLinkHandler$bar;", "baz", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BlockLevelDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<com.truecaller.deeplink.handlers.BlockLevelDeepLinkHandler.bar> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.BlockLevelDeepLinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/deeplink/handlers/BlockLevelDeepLinkHandler$bar;", "", "", "level", "<init>", "(Ljava/lang/String;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class bar {
        public final java.lang.String a;

        public bar(@com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "p", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.String str) {
            this.a = str;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.truecaller.deeplink.handlers.BlockLevelDeepLinkHandler.bar) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.deeplink.handlers.BlockLevelDeepLinkHandler.bar) obj).a);
        }

        public final int hashCode() {
            java.lang.String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final java.lang.String toString() {
            return bar.t("Args(level=", this.a, ")");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/BlockLevelDeepLinkHandler$baz;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface baz {
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        com.truecaller.blockinglevel.api.BlockLevel blockLevel;
        com.truecaller.deeplink.handlers.BlockLevelDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.BlockLevelDeepLinkHandler.bar) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "deepLinkArgs");
        tx.w wVar = (com.truecaller.deeplink.handlers.BlockLevelDeepLinkHandler.baz) f40.d0.z(context, com.truecaller.deeplink.handlers.BlockLevelDeepLinkHandler.baz.class);
        if (!((m03.s) wVar.v1.get()).b()) {
            ((q83.qux) wVar.u7.get()).getClass();
            boolean z = com.truecaller.wizard.WizardActivity.t0;
            if (!com.truecaller.wizard.WizardActivity.t0) {
                ((q83.a) wVar.Sb.get()).f(context, com.truecaller.wizard.api.WizardStartContext.DEEPLINK, true);
                return;
            }
            return;
        }
        f6.k1 e = wVar.z0().e(context);
        com.truecaller.deeplink.handlers.BlockLevelDeepLinkHandler blockLevelDeepLinkHandler = INSTANCE;
        java.lang.String str = barVar.a;
        blockLevelDeepLinkHandler.getClass();
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 107876) {
                if (hashCode != 109935) {
                    if (hashCode == 93508654 && str.equals("basic")) {
                        blockLevel = com.truecaller.blockinglevel.api.BlockLevel.BASIC;
                    }
                } else if (str.equals("off")) {
                    blockLevel = com.truecaller.blockinglevel.api.BlockLevel.OFF;
                }
            } else if (str.equals("max")) {
                blockLevel = com.truecaller.blockinglevel.api.BlockLevel.MAX;
            }
            com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant = com.truecaller.blockinglevel.api.BlockLevelVariant.DEFAULT;
            com.truecaller.blockinglevel.api.BlockLevelLaunchContext blockLevelLaunchContext = com.truecaller.blockinglevel.api.BlockLevelLaunchContext.DEEPLINK;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel, "defaultLevel");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelVariant, "variant");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelLaunchContext, "launchContext");
            int i = com.truecaller.blockinglevel.presentation.BlockLevelActivity.f0;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel, "defaultLevel");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelVariant, "variant");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelLaunchContext, "launchContext");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.blockinglevel.presentation.BlockLevelActivity.class);
            intent.putExtra("extra_args", (android.os.Parcelable) new com.truecaller.blockinglevel.presentation.BlockLevelArgs(blockLevel, blockLevelVariant, blockLevelLaunchContext));
            e.a.add(intent);
            e.d();
        }
        blockLevel = com.truecaller.blockinglevel.api.BlockLevel.MAX;
        com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant2 = com.truecaller.blockinglevel.api.BlockLevelVariant.DEFAULT;
        com.truecaller.blockinglevel.api.BlockLevelLaunchContext blockLevelLaunchContext2 = com.truecaller.blockinglevel.api.BlockLevelLaunchContext.DEEPLINK;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel, "defaultLevel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelVariant2, "variant");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelLaunchContext2, "launchContext");
        int i2 = com.truecaller.blockinglevel.presentation.BlockLevelActivity.f0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel, "defaultLevel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelVariant2, "variant");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelLaunchContext2, "launchContext");
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.blockinglevel.presentation.BlockLevelActivity.class);
        intent2.putExtra("extra_args", (android.os.Parcelable) new com.truecaller.blockinglevel.presentation.BlockLevelArgs(blockLevel, blockLevelVariant2, blockLevelLaunchContext2));
        e.a.add(intent2);
        e.d();
    }
}
