package com.truecaller.filters;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class BlockBaseActivity extends androidx.appcompat.app.AppCompatActivity {
    public zo1.a a0;

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        com.truecaller.log.AssertionUtil.isTrue(getApplication().d(), "Users that have not signed-in are not supposed to have access to this activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
        yy.qux.C(this, 2);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
    }
}
