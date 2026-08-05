package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class e0 implements wj3.d {
    public final java.lang.ref.WeakReference a;

    public e0(com.truecaller.ui.g gVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "dialog");
        this.a = new java.lang.ref.WeakReference(gVar);
    }

    public final void a(java.lang.String str) {
        android.app.Dialog dialog = (android.app.Dialog) this.a.get();
        if (dialog != null && dialog.isShowing()) {
            if (str == null) {
                android.widget.Toast.makeText(dialog.getContext(), 2132017962, 0).show();
            } else {
                try {
                    dialog.getContext().startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)));
                } catch (android.content.ActivityNotFoundException unused) {
                    android.widget.Toast.makeText(dialog.getContext(), 2132017936, 0).show();
                }
            }
            dialog.dismiss();
        }
    }

    public final void g(wj3.a aVar, wj3.k0 k0Var) {
        java.lang.String str;
        com.truecaller.common.network.userarchive.DownloadDto downloadDto = (com.truecaller.common.network.userarchive.DownloadDto) k0Var.b;
        if (downloadDto != null) {
            str = downloadDto.url;
        } else {
            str = null;
        }
        a(str);
    }

    public final void h(wj3.a aVar, java.lang.Throwable th) {
        a(null);
    }
}
