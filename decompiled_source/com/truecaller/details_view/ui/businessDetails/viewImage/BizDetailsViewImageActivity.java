package com.truecaller.details_view.ui.businessDetails.viewImage;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/details_view/ui/businessDetails/viewImage/BizDetailsViewImageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BizDetailsViewImageActivity extends com.truecaller.details_view.ui.businessDetails.viewImage.Hilt_BizDetailsViewImageActivity {
    public static final /* synthetic */ int e0 = 0;
    public d91.c d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.details_view.ui.businessDetails.viewImage.Hilt_BizDetailsViewImageActivity
    public final void onCreate(android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        android.view.Window window = getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        yy.qux.l(window);
        getWindow().setStatusBarColor(ze0.q.B(2130970615, this));
        super.onCreate(bundle);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        androidx.constraintlayout.widget.ConstraintLayout inflate = yy.qux.F(from, true).inflate(2131558449, (android.view.ViewGroup) null, false);
        int i = 2131362277;
        if (df0.qux.o(2131362277, inflate) != null) {
            i = 2131367107;
            androidx.appcompat.widget.Toolbar o = df0.qux.o(2131367107, inflate);
            if (o != null) {
                i = 2131367416;
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (com.truecaller.details_view.ui.businessDetails.viewImage.BizDetailViewImageView) df0.qux.o(2131367416, inflate);
                if (constraintLayout != null) {
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = inflate;
                    d91.c cVar = new d91.c(constraintLayout2, o, constraintLayout, 2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
                    this.d0 = cVar;
                    setContentView(constraintLayout2);
                    d91.c cVar2 = this.d0;
                    if (cVar2 != null) {
                        setSupportActionBar(cVar2.c);
                        i.baz supportActionBar = getSupportActionBar();
                        if (supportActionBar != null) {
                            supportActionBar.v(2131233387);
                            supportActionBar.p(true);
                            supportActionBar.t(false);
                        }
                        int intExtra = getIntent().getIntExtra("position", 0);
                        android.os.Bundle extras = getIntent().getExtras();
                        if (extras != null) {
                            arrayList = extras.getParcelableArrayList("imageList");
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            d91.c cVar3 = this.d0;
                            if (cVar3 != null) {
                                com.truecaller.details_view.ui.businessDetails.viewImage.BizDetailViewImageView bizDetailViewImageView = (com.truecaller.details_view.ui.businessDetails.viewImage.BizDetailViewImageView) cVar3.d;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "imageList");
                                va1.qux quxVar = (va1.qux) bizDetailViewImageView.getPresenter();
                                quxVar.getClass();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "imageList");
                                quxVar.e = intExtra;
                                quxVar.f = arrayList;
                                return;
                            }
                            kotlin.jvm.internal.Intrinsics.n("binding");
                            throw null;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
