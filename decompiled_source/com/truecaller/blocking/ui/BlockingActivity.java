package com.truecaller.blocking.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/blocking/ui/BlockingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "blocking-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BlockingActivity extends com.truecaller.blocking.ui.Hilt_BlockingActivity {
    public static final /* synthetic */ int e0 = 0;
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(new q10.bar(this, 20));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.blocking.ui.Hilt_BlockingActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        android.content.res.Resources.Theme theme = getTheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        yy.qux.n(theme, false);
        getWindow().setBackgroundDrawable((android.graphics.drawable.ColorDrawable) this.d0.getValue());
        if (bundle == null) {
            p22.b bVar = qj0.o.r;
            android.content.Intent intent = getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            android.os.Parcelable parcelable = (android.os.Parcelable) g6.b.g(intent, "request", com.truecaller.blocking.ui.BlockRequest.class);
            if (parcelable != null) {
                com.truecaller.blocking.ui.BlockRequest blockRequest = (com.truecaller.blocking.ui.BlockRequest) parcelable;
                bVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockRequest, "blockRequest");
                qj0.o oVar = new qj0.o();
                oVar.setArguments(ue0.i.t(new kotlin.Pair("request", blockRequest)));
                oVar.show(getSupportFragmentManager(), (java.lang.String) null);
                return;
            }
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPause() {
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super.onStart();
        overridePendingTransition(0, 0);
    }
}
