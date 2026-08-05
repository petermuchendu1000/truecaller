package com.truecaller.settings.impl.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class n extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ com.truecaller.settings.api.SettingsCategory A;
    public final /* synthetic */ com.truecaller.settings.api.SettingDeepLink B;
    public int x;
    public final /* synthetic */ com.truecaller.settings.impl.ui.o y;
    public final /* synthetic */ com.truecaller.settings.api.SettingsLaunchConfig z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.truecaller.settings.impl.ui.o oVar, com.truecaller.settings.api.SettingsLaunchConfig settingsLaunchConfig, com.truecaller.settings.api.SettingsCategory settingsCategory, com.truecaller.settings.api.SettingDeepLink settingDeepLink, df3.bar barVar) {
        super(2, barVar);
        this.y = oVar;
        this.z = settingsLaunchConfig;
        this.A = settingsCategory;
        this.B = settingDeepLink;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.settings.impl.ui.n(this.y, this.z, this.A, this.B, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0264, code lost:
    
        if (r14.emit(r11, r13) == r0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0266, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015c, code lost:
    
        if (r14 == r0) goto L133;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0052. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x008f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.truecaller.settings.impl.ui.p pVar;
        com.truecaller.settings.impl.ui.p pVar2;
        boolean z;
        java.lang.Object obj2;
        ef3.bar barVar = ef3.bar.a;
        int i = this.x;
        com.truecaller.settings.impl.ui.o oVar = this.y;
        boolean z2 = true;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    od.p.E(obj);
                    return kotlin.Unit.a;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.p.E(obj);
        } else {
            od.p.E(obj);
            com.truecaller.settings.impl.ui.c cVar = oVar.e;
            cVar.getClass();
            com.truecaller.settings.api.SettingsLaunchConfig settingsLaunchConfig = this.z;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsLaunchConfig, "<set-?>");
            cVar.a = settingsLaunchConfig;
            java.lang.String analyticsContext = settingsLaunchConfig.getAnalyticsContext();
            oVar.c.getClass();
            com.truecaller.settings.api.SettingsCategory settingsCategory = this.A;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsCategory, "settingCategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsCategory, "category");
            int i2 = yq2.qux.a[settingsCategory.ordinal()];
            yq2.baz bazVar = sr2.n.a;
            gs2.y yVar = gs2.y.a;
            switch (i2) {
                case 1:
                    bazVar = yq2.bar.a;
                    com.truecaller.settings.api.SettingDeepLink settingDeepLink = this.B;
                    com.truecaller.settings.impl.framework.ui.model.CategoryType a = bazVar.a(settingDeepLink);
                    pVar = null;
                    com.truecaller.settings.impl.ui.block.BlockSettings blockSettings = null;
                    com.truecaller.settings.impl.ui.watch.WatchSettings watchSettings = null;
                    com.truecaller.settings.impl.ui.premium.PremiumSettings premiumSettings = null;
                    com.truecaller.settings.impl.ui.privacy.PrivacySettings privacySettings = null;
                    com.truecaller.settings.impl.ui.messaging.MessagingSettings messagingSettings = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings2 = null;
                    com.truecaller.settings.impl.ui.about.AboutSettings aboutSettings = null;
                    com.truecaller.settings.impl.ui.help.HelpSettings helpSettings = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings2 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings3 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings4 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings5 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings6 = null;
                    switch (com.truecaller.settings.impl.ui.m.a[settingsCategory.ordinal()]) {
                        case 1:
                            com.truecaller.settings.impl.ui.b bVar = oVar.b;
                            bVar.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "context");
                            bd.bar.u(bVar.a, "settings_screen", analyticsContext);
                            if (pVar != null) {
                                ig3.v1 v1Var = oVar.f;
                                this.x = 2;
                                break;
                            }
                            return kotlin.Unit.a;
                        case 2:
                            if (a instanceof com.truecaller.settings.impl.ui.general.GeneralSettings) {
                                generalSettings6 = (com.truecaller.settings.impl.ui.general.GeneralSettings) a;
                            }
                            pVar2 = new com.truecaller.settings.impl.ui.p(analyticsContext, generalSettings6);
                            pVar = pVar2;
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 3:
                            if (a instanceof com.truecaller.settings.impl.ui.general.GeneralSettings) {
                                generalSettings5 = (com.truecaller.settings.impl.ui.general.GeneralSettings) a;
                            }
                            if (generalSettings5 == null) {
                                generalSettings5 = com.truecaller.settings.impl.ui.general.GeneralSettings$Languages$Companion.a;
                            }
                            pVar2 = new com.truecaller.settings.impl.ui.p(analyticsContext, generalSettings5);
                            pVar = pVar2;
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 4:
                            if (a instanceof com.truecaller.settings.impl.ui.general.GeneralSettings) {
                                generalSettings4 = (com.truecaller.settings.impl.ui.general.GeneralSettings) a;
                            }
                            if (generalSettings4 == null) {
                                generalSettings4 = com.truecaller.settings.impl.ui.general.GeneralSettings$Ringtone$Companion.a;
                            }
                            pVar2 = new com.truecaller.settings.impl.ui.p(analyticsContext, generalSettings4);
                            pVar = pVar2;
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 5:
                            if (a instanceof com.truecaller.settings.impl.ui.general.GeneralSettings) {
                                generalSettings3 = (com.truecaller.settings.impl.ui.general.GeneralSettings) a;
                            }
                            if (generalSettings3 == null) {
                                generalSettings3 = com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.Companion.a;
                            }
                            pVar2 = new com.truecaller.settings.impl.ui.p(analyticsContext, generalSettings3);
                            pVar = pVar2;
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 6:
                            if (a instanceof com.truecaller.settings.impl.ui.general.GeneralSettings) {
                                generalSettings2 = (com.truecaller.settings.impl.ui.general.GeneralSettings) a;
                            }
                            if (generalSettings2 == null) {
                                generalSettings2 = com.truecaller.settings.impl.ui.general.GeneralSettings$DataAndStorage$Companion.a;
                            }
                            pVar2 = new com.truecaller.settings.impl.ui.p(analyticsContext, generalSettings2);
                            pVar = pVar2;
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 7:
                            if (a instanceof com.truecaller.settings.impl.ui.general.GeneralSettings) {
                                generalSettings = (com.truecaller.settings.impl.ui.general.GeneralSettings) a;
                            }
                            if (generalSettings == null) {
                                generalSettings = com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance.Companion.a;
                            }
                            pVar2 = new com.truecaller.settings.impl.ui.p(analyticsContext, generalSettings);
                            pVar = pVar2;
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 8:
                            if (a instanceof com.truecaller.settings.impl.ui.help.HelpSettings) {
                                helpSettings = (com.truecaller.settings.impl.ui.help.HelpSettings) a;
                            }
                            if (helpSettings == null) {
                                helpSettings = com.truecaller.settings.impl.ui.help.HelpSettings$Support$Companion.a;
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            pVar2 = new com.truecaller.settings.impl.ui.p(new xr2.r(analyticsContext, helpSettings));
                            pVar = pVar2;
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 9:
                            if (a instanceof com.truecaller.settings.impl.ui.about.AboutSettings) {
                                aboutSettings = (com.truecaller.settings.impl.ui.about.AboutSettings) a;
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            pVar2 = new com.truecaller.settings.impl.ui.p(new xr2.k(analyticsContext, aboutSettings));
                            pVar = pVar2;
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 10:
                            if (a instanceof com.truecaller.settings.impl.ui.calls.CallsSettings) {
                                callsSettings2 = (com.truecaller.settings.impl.ui.calls.CallsSettings) a;
                            }
                            if (callsSettings2 == null) {
                                callsSettings2 = com.truecaller.settings.impl.ui.calls.CallsSettings$CallerIdOptions$Companion.a;
                            }
                            pVar2 = new com.truecaller.settings.impl.ui.p(analyticsContext, callsSettings2, false, false);
                            pVar = pVar2;
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 11:
                            if (a instanceof com.truecaller.settings.impl.ui.calls.CallsSettings) {
                                callsSettings = (com.truecaller.settings.impl.ui.calls.CallsSettings) a;
                            }
                            if (settingDeepLink == com.truecaller.settings.api.SettingDeepLink.HIDE_ACS_FOR_NON_PB_CONTACTS_AUTO_ENABLE) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (settingDeepLink != com.truecaller.settings.api.SettingDeepLink.RETRY_MISSED_CALL_SWITCH_CHANGE_REQUEST_AUTO_ENABLE) {
                                z2 = false;
                            }
                            pVar = new com.truecaller.settings.impl.ui.p(analyticsContext, callsSettings, z, z2);
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 12:
                            if (a instanceof com.truecaller.settings.impl.ui.messaging.MessagingSettings) {
                                messagingSettings = (com.truecaller.settings.impl.ui.messaging.MessagingSettings) a;
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            pVar2 = new com.truecaller.settings.impl.ui.p(new xr2.s(analyticsContext, messagingSettings));
                            pVar = pVar2;
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                            this.x = 1;
                            obj = com.truecaller.settings.impl.ui.o.o(oVar, settingsCategory, settingsLaunchConfig, a, this);
                            break;
                        case 22:
                            if (a instanceof com.truecaller.settings.impl.ui.privacy.PrivacySettings) {
                                privacySettings = (com.truecaller.settings.impl.ui.privacy.PrivacySettings) a;
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            pVar2 = new com.truecaller.settings.impl.ui.p(new xr2.u(analyticsContext, privacySettings));
                            pVar = pVar2;
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 23:
                            if (a instanceof com.truecaller.settings.impl.ui.premium.PremiumSettings) {
                                premiumSettings = (com.truecaller.settings.impl.ui.premium.PremiumSettings) a;
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            pVar2 = new com.truecaller.settings.impl.ui.p(new xr2.t(analyticsContext, premiumSettings));
                            pVar = pVar2;
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 24:
                            if (a instanceof com.truecaller.settings.impl.ui.watch.WatchSettings) {
                                watchSettings = (com.truecaller.settings.impl.ui.watch.WatchSettings) a;
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            pVar2 = new com.truecaller.settings.impl.ui.p(new xr2.w(analyticsContext, watchSettings));
                            pVar = pVar2;
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 25:
                            java.lang.String source = settingsLaunchConfig.getSource();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
                            java.util.Iterator it = com.truecaller.settings.api.SettingsSource.getEntries().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (kotlin.text.y.p(((com.truecaller.settings.api.SettingsSource) obj2).name(), source, true)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            com.truecaller.settings.api.SettingsSource settingsSource = (com.truecaller.settings.api.SettingsSource) obj2;
                            if (settingsSource == null) {
                                settingsSource = com.truecaller.settings.api.SettingsSource.UNKNOWN;
                            }
                            if (a instanceof com.truecaller.settings.impl.ui.block.BlockSettings) {
                                blockSettings = (com.truecaller.settings.impl.ui.block.BlockSettings) a;
                            }
                            boolean updateSpamList = settingsLaunchConfig.getUpdateSpamList();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsSource, "source");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsSource, "source");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            pVar2 = new com.truecaller.settings.impl.ui.p(new xr2.l(settingsSource, analyticsContext, blockSettings, updateSpamList));
                            pVar = pVar2;
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 26:
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            pVar = new com.truecaller.settings.impl.ui.p(le0.bar.w(analyticsContext));
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        case 27:
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
                            pVar = new com.truecaller.settings.impl.ui.p(new xr2.v(analyticsContext));
                            if (pVar != null) {
                            }
                            return kotlin.Unit.a;
                        default:
                            throw new java.lang.RuntimeException();
                    }
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    bazVar = yVar;
                    com.truecaller.settings.api.SettingDeepLink settingDeepLink2 = this.B;
                    com.truecaller.settings.impl.framework.ui.model.CategoryType a2 = bazVar.a(settingDeepLink2);
                    pVar = null;
                    com.truecaller.settings.impl.ui.block.BlockSettings blockSettings2 = null;
                    com.truecaller.settings.impl.ui.watch.WatchSettings watchSettings2 = null;
                    com.truecaller.settings.impl.ui.premium.PremiumSettings premiumSettings2 = null;
                    com.truecaller.settings.impl.ui.privacy.PrivacySettings privacySettings2 = null;
                    com.truecaller.settings.impl.ui.messaging.MessagingSettings messagingSettings2 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings3 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings22 = null;
                    com.truecaller.settings.impl.ui.about.AboutSettings aboutSettings2 = null;
                    com.truecaller.settings.impl.ui.help.HelpSettings helpSettings2 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings7 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings22 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings32 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings42 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings52 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings62 = null;
                    switch (com.truecaller.settings.impl.ui.m.a[settingsCategory.ordinal()]) {
                    }
                case 8:
                    bazVar = com.truecaller.settings.impl.ui.messaging.i.a;
                    com.truecaller.settings.api.SettingDeepLink settingDeepLink22 = this.B;
                    com.truecaller.settings.impl.framework.ui.model.CategoryType a22 = bazVar.a(settingDeepLink22);
                    pVar = null;
                    com.truecaller.settings.impl.ui.block.BlockSettings blockSettings22 = null;
                    com.truecaller.settings.impl.ui.watch.WatchSettings watchSettings22 = null;
                    com.truecaller.settings.impl.ui.premium.PremiumSettings premiumSettings22 = null;
                    com.truecaller.settings.impl.ui.privacy.PrivacySettings privacySettings22 = null;
                    com.truecaller.settings.impl.ui.messaging.MessagingSettings messagingSettings22 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings32 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings222 = null;
                    com.truecaller.settings.impl.ui.about.AboutSettings aboutSettings22 = null;
                    com.truecaller.settings.impl.ui.help.HelpSettings helpSettings22 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings72 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings322 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings422 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings522 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings622 = null;
                    switch (com.truecaller.settings.impl.ui.m.a[settingsCategory.ordinal()]) {
                    }
                case 9:
                case 10:
                    com.truecaller.settings.api.SettingDeepLink settingDeepLink222 = this.B;
                    com.truecaller.settings.impl.framework.ui.model.CategoryType a222 = bazVar.a(settingDeepLink222);
                    pVar = null;
                    com.truecaller.settings.impl.ui.block.BlockSettings blockSettings222 = null;
                    com.truecaller.settings.impl.ui.watch.WatchSettings watchSettings222 = null;
                    com.truecaller.settings.impl.ui.premium.PremiumSettings premiumSettings222 = null;
                    com.truecaller.settings.impl.ui.privacy.PrivacySettings privacySettings222 = null;
                    com.truecaller.settings.impl.ui.messaging.MessagingSettings messagingSettings222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings322 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings2222 = null;
                    com.truecaller.settings.impl.ui.about.AboutSettings aboutSettings222 = null;
                    com.truecaller.settings.impl.ui.help.HelpSettings helpSettings222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings722 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings2222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings3222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings4222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings5222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings6222 = null;
                    switch (com.truecaller.settings.impl.ui.m.a[settingsCategory.ordinal()]) {
                    }
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    bazVar = or2.d.a;
                    com.truecaller.settings.api.SettingDeepLink settingDeepLink2222 = this.B;
                    com.truecaller.settings.impl.framework.ui.model.CategoryType a2222 = bazVar.a(settingDeepLink2222);
                    pVar = null;
                    com.truecaller.settings.impl.ui.block.BlockSettings blockSettings2222 = null;
                    com.truecaller.settings.impl.ui.watch.WatchSettings watchSettings2222 = null;
                    com.truecaller.settings.impl.ui.premium.PremiumSettings premiumSettings2222 = null;
                    com.truecaller.settings.impl.ui.privacy.PrivacySettings privacySettings2222 = null;
                    com.truecaller.settings.impl.ui.messaging.MessagingSettings messagingSettings2222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings3222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings22222 = null;
                    com.truecaller.settings.impl.ui.about.AboutSettings aboutSettings2222 = null;
                    com.truecaller.settings.impl.ui.help.HelpSettings helpSettings2222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings7222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings22222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings32222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings42222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings52222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings62222 = null;
                    switch (com.truecaller.settings.impl.ui.m.a[settingsCategory.ordinal()]) {
                    }
                case 20:
                    bazVar = dr2.qux.a;
                    com.truecaller.settings.api.SettingDeepLink settingDeepLink22222 = this.B;
                    com.truecaller.settings.impl.framework.ui.model.CategoryType a22222 = bazVar.a(settingDeepLink22222);
                    pVar = null;
                    com.truecaller.settings.impl.ui.block.BlockSettings blockSettings22222 = null;
                    com.truecaller.settings.impl.ui.watch.WatchSettings watchSettings22222 = null;
                    com.truecaller.settings.impl.ui.premium.PremiumSettings premiumSettings22222 = null;
                    com.truecaller.settings.impl.ui.privacy.PrivacySettings privacySettings22222 = null;
                    com.truecaller.settings.impl.ui.messaging.MessagingSettings messagingSettings22222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings32222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings222222 = null;
                    com.truecaller.settings.impl.ui.about.AboutSettings aboutSettings22222 = null;
                    com.truecaller.settings.impl.ui.help.HelpSettings helpSettings22222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings72222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings322222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings422222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings522222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings622222 = null;
                    switch (com.truecaller.settings.impl.ui.m.a[settingsCategory.ordinal()]) {
                    }
                case 21:
                    bazVar = js2.baz.a;
                    com.truecaller.settings.api.SettingDeepLink settingDeepLink222222 = this.B;
                    com.truecaller.settings.impl.framework.ui.model.CategoryType a222222 = bazVar.a(settingDeepLink222222);
                    pVar = null;
                    com.truecaller.settings.impl.ui.block.BlockSettings blockSettings222222 = null;
                    com.truecaller.settings.impl.ui.watch.WatchSettings watchSettings222222 = null;
                    com.truecaller.settings.impl.ui.premium.PremiumSettings premiumSettings222222 = null;
                    com.truecaller.settings.impl.ui.privacy.PrivacySettings privacySettings222222 = null;
                    com.truecaller.settings.impl.ui.messaging.MessagingSettings messagingSettings222222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings322222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings2222222 = null;
                    com.truecaller.settings.impl.ui.about.AboutSettings aboutSettings222222 = null;
                    com.truecaller.settings.impl.ui.help.HelpSettings helpSettings222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings722222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings2222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings3222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings4222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings5222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings6222222 = null;
                    switch (com.truecaller.settings.impl.ui.m.a[settingsCategory.ordinal()]) {
                    }
                case 22:
                    bazVar = com.truecaller.settings.impl.ui.block.c.a;
                    com.truecaller.settings.api.SettingDeepLink settingDeepLink2222222 = this.B;
                    com.truecaller.settings.impl.framework.ui.model.CategoryType a2222222 = bazVar.a(settingDeepLink2222222);
                    pVar = null;
                    com.truecaller.settings.impl.ui.block.BlockSettings blockSettings2222222 = null;
                    com.truecaller.settings.impl.ui.watch.WatchSettings watchSettings2222222 = null;
                    com.truecaller.settings.impl.ui.premium.PremiumSettings premiumSettings2222222 = null;
                    com.truecaller.settings.impl.ui.privacy.PrivacySettings privacySettings2222222 = null;
                    com.truecaller.settings.impl.ui.messaging.MessagingSettings messagingSettings2222222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings3222222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings22222222 = null;
                    com.truecaller.settings.impl.ui.about.AboutSettings aboutSettings2222222 = null;
                    com.truecaller.settings.impl.ui.help.HelpSettings helpSettings2222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings7222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings22222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings32222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings42222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings52222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings62222222 = null;
                    switch (com.truecaller.settings.impl.ui.m.a[settingsCategory.ordinal()]) {
                    }
                case 23:
                    bazVar = bs2.b.a;
                    com.truecaller.settings.api.SettingDeepLink settingDeepLink22222222 = this.B;
                    com.truecaller.settings.impl.framework.ui.model.CategoryType a22222222 = bazVar.a(settingDeepLink22222222);
                    pVar = null;
                    com.truecaller.settings.impl.ui.block.BlockSettings blockSettings22222222 = null;
                    com.truecaller.settings.impl.ui.watch.WatchSettings watchSettings22222222 = null;
                    com.truecaller.settings.impl.ui.premium.PremiumSettings premiumSettings22222222 = null;
                    com.truecaller.settings.impl.ui.privacy.PrivacySettings privacySettings22222222 = null;
                    com.truecaller.settings.impl.ui.messaging.MessagingSettings messagingSettings22222222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings32222222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings222222222 = null;
                    com.truecaller.settings.impl.ui.about.AboutSettings aboutSettings22222222 = null;
                    com.truecaller.settings.impl.ui.help.HelpSettings helpSettings22222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings72222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings322222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings422222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings522222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings622222222 = null;
                    switch (com.truecaller.settings.impl.ui.m.a[settingsCategory.ordinal()]) {
                    }
                case 24:
                    bazVar = ms2.b.a;
                    com.truecaller.settings.api.SettingDeepLink settingDeepLink222222222 = this.B;
                    com.truecaller.settings.impl.framework.ui.model.CategoryType a222222222 = bazVar.a(settingDeepLink222222222);
                    pVar = null;
                    com.truecaller.settings.impl.ui.block.BlockSettings blockSettings222222222 = null;
                    com.truecaller.settings.impl.ui.watch.WatchSettings watchSettings222222222 = null;
                    com.truecaller.settings.impl.ui.premium.PremiumSettings premiumSettings222222222 = null;
                    com.truecaller.settings.impl.ui.privacy.PrivacySettings privacySettings222222222 = null;
                    com.truecaller.settings.impl.ui.messaging.MessagingSettings messagingSettings222222222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings322222222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings2222222222 = null;
                    com.truecaller.settings.impl.ui.about.AboutSettings aboutSettings222222222 = null;
                    com.truecaller.settings.impl.ui.help.HelpSettings helpSettings222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings722222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings2222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings3222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings4222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings5222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings6222222222 = null;
                    switch (com.truecaller.settings.impl.ui.m.a[settingsCategory.ordinal()]) {
                    }
                case 25:
                    bazVar = os2.a.a;
                    com.truecaller.settings.api.SettingDeepLink settingDeepLink2222222222 = this.B;
                    com.truecaller.settings.impl.framework.ui.model.CategoryType a2222222222 = bazVar.a(settingDeepLink2222222222);
                    pVar = null;
                    com.truecaller.settings.impl.ui.block.BlockSettings blockSettings2222222222 = null;
                    com.truecaller.settings.impl.ui.watch.WatchSettings watchSettings2222222222 = null;
                    com.truecaller.settings.impl.ui.premium.PremiumSettings premiumSettings2222222222 = null;
                    com.truecaller.settings.impl.ui.privacy.PrivacySettings privacySettings2222222222 = null;
                    com.truecaller.settings.impl.ui.messaging.MessagingSettings messagingSettings2222222222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings3222222222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings22222222222 = null;
                    com.truecaller.settings.impl.ui.about.AboutSettings aboutSettings2222222222 = null;
                    com.truecaller.settings.impl.ui.help.HelpSettings helpSettings2222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings7222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings22222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings32222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings42222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings52222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings62222222222 = null;
                    switch (com.truecaller.settings.impl.ui.m.a[settingsCategory.ordinal()]) {
                    }
                case 26:
                    bazVar = xs2.i.a;
                    com.truecaller.settings.api.SettingDeepLink settingDeepLink22222222222 = this.B;
                    com.truecaller.settings.impl.framework.ui.model.CategoryType a22222222222 = bazVar.a(settingDeepLink22222222222);
                    pVar = null;
                    com.truecaller.settings.impl.ui.block.BlockSettings blockSettings22222222222 = null;
                    com.truecaller.settings.impl.ui.watch.WatchSettings watchSettings22222222222 = null;
                    com.truecaller.settings.impl.ui.premium.PremiumSettings premiumSettings22222222222 = null;
                    com.truecaller.settings.impl.ui.privacy.PrivacySettings privacySettings22222222222 = null;
                    com.truecaller.settings.impl.ui.messaging.MessagingSettings messagingSettings22222222222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings32222222222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings222222222222 = null;
                    com.truecaller.settings.impl.ui.about.AboutSettings aboutSettings22222222222 = null;
                    com.truecaller.settings.impl.ui.help.HelpSettings helpSettings22222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings72222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings222222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings322222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings422222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings522222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings622222222222 = null;
                    switch (com.truecaller.settings.impl.ui.m.a[settingsCategory.ordinal()]) {
                    }
                case 27:
                    bazVar = ss2.baz.a;
                    com.truecaller.settings.api.SettingDeepLink settingDeepLink222222222222 = this.B;
                    com.truecaller.settings.impl.framework.ui.model.CategoryType a222222222222 = bazVar.a(settingDeepLink222222222222);
                    pVar = null;
                    com.truecaller.settings.impl.ui.block.BlockSettings blockSettings222222222222 = null;
                    com.truecaller.settings.impl.ui.watch.WatchSettings watchSettings222222222222 = null;
                    com.truecaller.settings.impl.ui.premium.PremiumSettings premiumSettings222222222222 = null;
                    com.truecaller.settings.impl.ui.privacy.PrivacySettings privacySettings222222222222 = null;
                    com.truecaller.settings.impl.ui.messaging.MessagingSettings messagingSettings222222222222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings322222222222 = null;
                    com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings2222222222222 = null;
                    com.truecaller.settings.impl.ui.about.AboutSettings aboutSettings222222222222 = null;
                    com.truecaller.settings.impl.ui.help.HelpSettings helpSettings222222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings722222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings2222222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings3222222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings4222222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings5222222222222 = null;
                    com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings6222222222222 = null;
                    switch (com.truecaller.settings.impl.ui.m.a[settingsCategory.ordinal()]) {
                    }
                default:
                    throw new java.lang.RuntimeException();
            }
        }
        pVar = (com.truecaller.settings.impl.ui.p) obj;
        if (pVar != null) {
        }
        return kotlin.Unit.a;
    }
}
