package com.truecaller.voicemail.presentation.deactivate;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class e extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ com.truecaller.voicemail.presentation.deactivate.VoicemailDeactivateActivity j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.truecaller.voicemail.presentation.deactivate.VoicemailDeactivateActivity voicemailDeactivateActivity, int i) {
        super(0);
        this.i = i;
        this.j = voicemailDeactivateActivity;
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
