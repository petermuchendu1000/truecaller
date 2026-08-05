package com.truecaller.wizard.phonenumber.utils;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class bar implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ kotlin.jvm.functions.Function1 a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        boolean z;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        this.a.invoke(java.lang.Boolean.valueOf(z));
    }
}
