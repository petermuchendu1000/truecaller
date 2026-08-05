package com.truecaller.commentfeedback.presentation.addcomment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/commentfeedback/presentation/addcomment/AddCommentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "z42/bar", "comment-feedback_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AddCommentActivity extends com.truecaller.commentfeedback.presentation.addcomment.Hilt_AddCommentActivity {
    public static final /* synthetic */ int e0 = 0;
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(new cu0.h(this, 3));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.commentfeedback.presentation.addcomment.Hilt_AddCommentActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        android.content.res.Resources.Theme theme = getTheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        yy.qux.n(theme, false);
        getWindow().setBackgroundDrawable((android.graphics.drawable.ColorDrawable) this.d0.getValue());
        com.truecaller.data.entity.Contact parcelableExtra = getIntent().getParcelableExtra("spammer");
        if (parcelableExtra != null) {
            java.util.List C = parcelableExtra.C();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "getNumbers(...)");
            java.util.ArrayList N = i71.g.N(C);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(N, 10));
            java.util.Iterator it = N.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                kotlin.jvm.internal.Intrinsics.d(str);
                arrayList.add(new com.truecaller.commentfeedback.db.NumberAndType(str));
            }
            com.truecaller.commentfeedback.presentation.addcomment.model.AddCommentRequest addCommentRequest = new com.truecaller.commentfeedback.presentation.addcomment.model.AddCommentRequest(arrayList);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCommentRequest, "request");
            d11.a aVar = new d11.a();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("request", addCommentRequest);
            aVar.setArguments(bundle2);
            aVar.show(getSupportFragmentManager(), (java.lang.String) null);
            return;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
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
