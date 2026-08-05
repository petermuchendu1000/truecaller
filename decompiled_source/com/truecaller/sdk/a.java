package com.truecaller.sdk;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class a extends zc.o {
    public final /* synthetic */ int a;
    public boolean b;
    public final android.view.KeyEvent.Callback c;

    public /* synthetic */ a(androidx.appcompat.app.AppCompatActivity appCompatActivity, boolean z, int i) {
        this.a = i;
        this.c = appCompatActivity;
        this.b = z;
    }

    public void a() {
        switch (this.a) {
            case 2:
                mk.m.D((android.view.ViewGroup) this.c, false);
                return;
            default:
                return;
        }
    }

    public final void b(zc.n nVar) {
        int i;
        android.graphics.drawable.Drawable drawable;
        int i2 = this.a;
        java.lang.Object obj = this.c;
        switch (i2) {
            case 0:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar, "transition");
                int i3 = com.truecaller.sdk.BottomSheetConfirmProfileActivity.j0;
                android.widget.ImageView imageView = (android.widget.ImageView) ((com.truecaller.sdk.BottomSheetConfirmProfileActivity) obj).t0().b.t;
                if (this.b) {
                    i = 2131233200;
                } else {
                    i = 2131233199;
                }
                imageView.setImageResource(i);
                return;
            case 1:
                com.truecaller.sdk.ConfirmProfileActivity confirmProfileActivity = (com.truecaller.sdk.ConfirmProfileActivity) obj;
                androidx.appcompat.widget.AppCompatTextView appCompatTextView = confirmProfileActivity.e0;
                if (this.b) {
                    drawable = confirmProfileActivity.l0;
                } else {
                    drawable = confirmProfileActivity.k0;
                }
                appCompatTextView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
                return;
            default:
                if (!this.b) {
                    mk.m.D((android.view.ViewGroup) obj, false);
                }
                nVar.C(this);
                return;
        }
    }

    public void c() {
        switch (this.a) {
            case 2:
                mk.m.D((android.view.ViewGroup) this.c, true);
                return;
            default:
                return;
        }
    }

    public void h(zc.n nVar) {
        switch (this.a) {
            case 2:
                mk.m.D((android.view.ViewGroup) this.c, false);
                this.b = true;
                return;
            default:
                return;
        }
    }

    public a(android.view.ViewGroup viewGroup) {
        this.a = 2;
        this.b = false;
        this.c = viewGroup;
    }
}
