package com.truecaller.bizmon.newBusiness.awareness.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/bizmon/newBusiness/awareness/ui/BusinessAwarenessDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BusinessAwarenessDetailsActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final /* synthetic */ int b0 = 0;
    public final kotlin.Lazy a0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 28));

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.Object obj;
        int i;
        android.os.Bundle extras;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        kotlin.Lazy lazy = this.a0;
        setContentView(((fi0.bar) lazy.getValue()).a);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = ((fi0.bar) lazy.getValue()).a;
        nb.r rVar = new nb.r(this, 22);
        java.util.WeakHashMap weakHashMap = u6.t0.a;
        u6.k0.m(constraintLayout, rVar);
        android.content.Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            obj = extras.get(com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        } else {
            obj = null;
        }
        if (kotlin.jvm.internal.Intrinsics.b(obj, "verified_business")) {
            i = 2131231498;
        } else if (kotlin.jvm.internal.Intrinsics.b(obj, "priority_call")) {
            i = 2131231495;
        } else {
            throw new java.lang.Exception("Type need to pass");
        }
        com.bumptech.glide.baz.b(this).e(this).p(java.lang.Integer.valueOf(i)).P(((fi0.bar) lazy.getValue()).c);
        ((fi0.bar) lazy.getValue()).b.setOnClickListener(new op0.baz(this, 29));
    }
}
