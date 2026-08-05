package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class c implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.qa.QMActivity b;

    public /* synthetic */ c(int i, com.truecaller.qa.QMActivity qMActivity) {
        this.a = i;
        this.b = qMActivity;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.a;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.b;
        java.lang.Throwable th = (java.lang.Throwable) obj;
        switch (i) {
            case 0:
                int i2 = com.truecaller.qa.QMActivity.B1;
                if (th != null) {
                    android.widget.Toast.makeText((android.content.Context) appCompatActivity, (java.lang.CharSequence) ("DB schema export failed. " + th.getClass().getSimpleName() + ": " + th.getMessage()), 1).show();
                }
                return kotlin.Unit.a;
            default:
                int i3 = com.truecaller.qa.QMActivity.B1;
                if (th != null) {
                    android.widget.Toast.makeText((android.content.Context) appCompatActivity, (java.lang.CharSequence) ("Logs export failed. " + th.getClass().getSimpleName() + ": " + th.getMessage()), 1).show();
                } else {
                    android.widget.Toast.makeText((android.content.Context) appCompatActivity, (java.lang.CharSequence) "Logs exported to Downloads directory", 1).show();
                }
                return kotlin.Unit.a;
        }
    }
}
