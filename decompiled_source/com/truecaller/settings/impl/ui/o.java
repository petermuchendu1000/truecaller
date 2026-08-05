package com.truecaller.settings.impl.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/o;", "Landroidx/lifecycle/n1;", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class o extends androidx.lifecycle.n1 {
    public final com.truecaller.settings.impl.ui.b b;
    public final yq2.bar c;
    public final ms.qux d;
    public final com.truecaller.settings.impl.ui.c e;
    public final ig3.v1 f;
    public final ig3.p1 g;

    public o(com.truecaller.settings.impl.ui.b bVar, yq2.bar barVar, ms.qux quxVar, com.truecaller.settings.impl.ui.c cVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "settingsDeepLinkProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "callAssistantSettingAvailabilityEvaluator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "settingsLaunchConfigRepository");
        this.b = bVar;
        this.c = barVar;
        this.d = quxVar;
        this.e = cVar;
        ig3.v1 b = ig3.w1.b(1, 0, (hg3.bar) null, 6);
        this.f = b;
        this.g = new ig3.p1(b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x006c, code lost:
    
        if (r7 == r11) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object o(com.truecaller.settings.impl.ui.o oVar, com.truecaller.settings.api.SettingsCategory settingsCategory, com.truecaller.settings.api.SettingsLaunchConfig settingsLaunchConfig, com.truecaller.settings.impl.framework.ui.model.CategoryType categoryType, ff3.qux quxVar) {
        com.truecaller.settings.impl.ui.l lVar;
        java.lang.Object obj;
        int i;
        com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings callAssistantSettings;
        com.truecaller.settings.impl.framework.ui.model.CategoryType categoryType2;
        java.lang.String str;
        com.truecaller.settings.api.SettingsCategory settingsCategory2;
        boolean z;
        com.truecaller.settings.impl.ui.p pVar;
        ms.qux quxVar2 = oVar.d;
        if (quxVar instanceof com.truecaller.settings.impl.ui.l) {
            lVar = (com.truecaller.settings.impl.ui.l) quxVar;
            int i2 = lVar.F;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.F = i2 - Integer.MIN_VALUE;
                obj = lVar.D;
                ef3.bar barVar = ef3.bar.a;
                i = lVar.F;
                com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings callAssistantSettings2 = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            z = lVar.C;
                            pVar = lVar.B;
                            str = lVar.A;
                            categoryType2 = lVar.z;
                            settingsCategory2 = lVar.x;
                            od.p.E(obj);
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                switch (com.truecaller.settings.impl.ui.k.a[settingsCategory2.ordinal()]) {
                                    case 1:
                                        break;
                                    case 2:
                                        if (categoryType2 instanceof com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) {
                                            callAssistantSettings2 = (com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) categoryType2;
                                        }
                                        return new com.truecaller.settings.impl.ui.p(str, callAssistantSettings2, com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings$AssistantPreferences$CustomizeQuickResponses.a, z);
                                    case 3:
                                        if (categoryType2 instanceof com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) {
                                            callAssistantSettings2 = (com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) categoryType2;
                                        }
                                        return new com.truecaller.settings.impl.ui.p(str, callAssistantSettings2, com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings$AssistantPreferences$CustomGreeting.a, z);
                                    case 4:
                                        if (categoryType2 instanceof com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) {
                                            callAssistantSettings2 = (com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) categoryType2;
                                        }
                                        return new com.truecaller.settings.impl.ui.p(str, callAssistantSettings2, com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings$AssistantPreferences$ChangeAssistantVoice.a, z);
                                    case 5:
                                        if (categoryType2 instanceof com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) {
                                            callAssistantSettings2 = (com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) categoryType2;
                                        }
                                        return new com.truecaller.settings.impl.ui.p(str, callAssistantSettings2, com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings$AssistantPreferences$AssistantVoicemail.a, z);
                                    case 6:
                                        if (categoryType2 instanceof com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) {
                                            callAssistantSettings2 = (com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) categoryType2;
                                        }
                                        return new com.truecaller.settings.impl.ui.p(str, callAssistantSettings2, com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.Greetings.a, z);
                                    case 7:
                                        if (categoryType2 instanceof com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) {
                                            callAssistantSettings2 = (com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) categoryType2;
                                        }
                                        return new com.truecaller.settings.impl.ui.p(str, callAssistantSettings2, com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.CallRules.a, z);
                                    case 8:
                                        if (categoryType2 instanceof com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) {
                                            callAssistantSettings2 = (com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) categoryType2;
                                        }
                                        return new com.truecaller.settings.impl.ui.p(str, callAssistantSettings2, com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.LanguageAndVoices.a, z);
                                    case 9:
                                        if (categoryType2 instanceof com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) {
                                            callAssistantSettings2 = (com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) categoryType2;
                                        }
                                        return new com.truecaller.settings.impl.ui.p(str, callAssistantSettings2, com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings.NewAssistantSettings.Privacy.a, z);
                                    default:
                                        return null;
                                }
                            }
                            return pVar;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    categoryType = lVar.z;
                    settingsLaunchConfig = lVar.y;
                    settingsCategory = lVar.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    lVar.x = settingsCategory;
                    lVar.y = settingsLaunchConfig;
                    lVar.z = categoryType;
                    lVar.F = 1;
                    if (((qo1.b) quxVar2.b).c()) {
                        obj = wi0.bar.p((y21.b) quxVar2.d, lVar);
                    } else {
                        obj = java.lang.Boolean.FALSE;
                    }
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.String analyticsContext = settingsLaunchConfig.getAnalyticsContext();
                    boolean finishOnBackPress = settingsLaunchConfig.getFinishOnBackPress();
                    if (categoryType instanceof com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) {
                        callAssistantSettings = (com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) categoryType;
                    } else {
                        callAssistantSettings = null;
                    }
                    com.truecaller.settings.impl.ui.p pVar2 = new com.truecaller.settings.impl.ui.p(analyticsContext, callAssistantSettings, (com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings) null, false);
                    lVar.x = settingsCategory;
                    lVar.y = null;
                    lVar.z = categoryType;
                    lVar.A = analyticsContext;
                    lVar.B = pVar2;
                    lVar.C = finishOnBackPress;
                    lVar.F = 2;
                    java.lang.Object u = quxVar2.u(settingsCategory, lVar);
                    if (u != barVar) {
                        categoryType2 = categoryType;
                        str = analyticsContext;
                        obj = u;
                        settingsCategory2 = settingsCategory;
                        z = finishOnBackPress;
                        pVar = pVar2;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                        return pVar;
                    }
                    return barVar;
                }
                return null;
            }
        }
        lVar = new com.truecaller.settings.impl.ui.l(oVar, quxVar);
        obj = lVar.D;
        ef3.bar barVar2 = ef3.bar.a;
        i = lVar.F;
        com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings callAssistantSettings22 = null;
        if (i == 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
        return null;
    }
}
