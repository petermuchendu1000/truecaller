package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class g extends android.app.ProgressDialog {
    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMessage(getContext().getString(2132019042));
        com.truecaller.common.network.userarchive.baz.a().d(new com.truecaller.ui.e0(this));
    }
}
