package com.truecaller.premium.presentation.catalog.innerscreen;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/premium/presentation/catalog/innerscreen/CatalogInnerScreenActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "he0/u0", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CatalogInnerScreenActivity extends com.truecaller.premium.presentation.catalog.innerscreen.Hilt_CatalogInnerScreenActivity {
    public static final /* synthetic */ int f0 = 0;
    public bv.c d0;
    public final androidx.lifecycle.o1 e0;

    public CatalogInnerScreenActivity() {
        ad2.bar barVar = new ad2.bar(this, 0);
        this.e0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(ad2.j.class), new ad2.qux(this, 1), new ad2.qux(this, 0), new ad2.a(barVar, this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.premium.presentation.catalog.innerscreen.Hilt_CatalogInnerScreenActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("catalog_item_id");
        java.lang.String stringExtra2 = getIntent().getStringExtra("catalog_launch_context");
        java.lang.String stringExtra3 = getIntent().getStringExtra("catalog_title");
        if (stringExtra != null && stringExtra.length() != 0 && stringExtra2 != null && stringExtra2.length() != 0) {
            e.d.a(this, new d3.qux(-372557536, new ad2.baz(this, stringExtra2, stringExtra3, 0), true));
        } else {
            finish();
        }
    }
}
