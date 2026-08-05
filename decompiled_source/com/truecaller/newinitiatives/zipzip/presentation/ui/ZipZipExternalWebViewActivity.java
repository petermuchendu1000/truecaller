package com.truecaller.newinitiatives.zipzip.presentation.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/newinitiatives/zipzip/presentation/ui/ZipZipExternalWebViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "newinitiatives_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ZipZipExternalWebViewActivity extends com.truecaller.newinitiatives.zipzip.presentation.ui.Hilt_ZipZipExternalWebViewActivity {
    public static final /* synthetic */ int e0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(m62.b.class), new i62.d(this, 1), new i62.d(this, 0), new i62.d(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.newinitiatives.zipzip.presentation.ui.Hilt_ZipZipExternalWebViewActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        m62.b bVar = (m62.b) this.d0.getValue();
        java.lang.String stringExtra = getIntent().getStringExtra("URL");
        if (stringExtra != null) {
            ig3.h2 h2Var = bVar.c;
            h62.d dVar = (h62.d) h2Var.getValue();
            boolean z = dVar.b;
            dVar.getClass();
            h2Var.p((java.lang.Object) null, new h62.d(stringExtra, z));
        } else {
            bVar.getClass();
        }
        e.d.a(this, new d3.qux(2142607077, new i62.c(this, 0), true));
    }
}
