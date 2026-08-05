package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class j0 implements u62.i {
    public final android.content.Context a;

    public j0(android.content.Context context) {
        this.a = context;
    }

    @Override // u62.i
    public final android.app.Notification a(f6.f0 f0Var, u62.h hVar) {
        f0Var.m(t41.i.c(this.a.getDrawable(2131232865)));
        android.app.Notification d = f0Var.d();
        try {
            java.lang.Object newInstance = java.lang.Class.forName("android.app.MiuiNotification").newInstance();
            java.lang.reflect.Field declaredField = newInstance.getClass().getDeclaredField("customizedIcon");
            declaredField.setAccessible(true);
            declaredField.set(newInstance, java.lang.Boolean.TRUE);
            java.lang.reflect.Field field = d.getClass().getField("extraNotification");
            field.setAccessible(true);
            field.set(d, newInstance);
        } catch (java.lang.Exception unused) {
        }
        return d;
    }
}
