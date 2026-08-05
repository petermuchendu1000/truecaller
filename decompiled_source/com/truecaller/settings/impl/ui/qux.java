package com.truecaller.settings.impl.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class qux extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ com.truecaller.settings.impl.ui.SettingsActivity j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qux(com.truecaller.settings.impl.ui.SettingsActivity settingsActivity, int i) {
        super(0);
        this.i = i;
        this.j = settingsActivity;
    }

    public final java.lang.Object invoke() {
        switch (this.i) {
            case 0:
                return this.j.getDefaultViewModelProviderFactory();
            case 1:
                return this.j.getViewModelStore();
            default:
                return this.j.getDefaultViewModelCreationExtras();
        }
    }
}
