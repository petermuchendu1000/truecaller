package com.truecaller.editprofile.impl.ui.qa;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class baz extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ com.truecaller.editprofile.impl.ui.qa.EditProfileConfigurationQaActivity j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ baz(com.truecaller.editprofile.impl.ui.qa.EditProfileConfigurationQaActivity editProfileConfigurationQaActivity, int i) {
        super(0);
        this.i = i;
        this.j = editProfileConfigurationQaActivity;
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
