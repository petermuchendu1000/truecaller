package com.truecaller.settings.impl.ui.block;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class c implements yq2.baz {
    public static final com.truecaller.settings.impl.ui.block.c a = new java.lang.Object();

    @Override // yq2.baz
    public final com.truecaller.settings.impl.framework.ui.model.CategoryType a(com.truecaller.settings.api.SettingDeepLink settingDeepLink) {
        int i;
        if (settingDeepLink == null) {
            i = -1;
        } else {
            i = er2.i.a[settingDeepLink.ordinal()];
        }
        if (i == 1) {
            return com.truecaller.settings.impl.ui.block.BlockSettings.HowToHandleSpamCalls.Companion.a;
        }
        return null;
    }
}
