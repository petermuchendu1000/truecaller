package com.truecaller.settings.impl.ui.messaging;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class i implements yq2.baz {
    public static final com.truecaller.settings.impl.ui.messaging.i a = new java.lang.Object();

    @Override // yq2.baz
    public final com.truecaller.settings.impl.framework.ui.model.CategoryType a(com.truecaller.settings.api.SettingDeepLink settingDeepLink) {
        int i;
        if (settingDeepLink == null) {
            i = -1;
        } else {
            i = ks2.baz.a[settingDeepLink.ordinal()];
        }
        if (i == 1) {
            return com.truecaller.settings.impl.ui.messaging.MessagingSettings.FraudWarnings.FraudWarningsToggle.a;
        }
        return null;
    }
}
