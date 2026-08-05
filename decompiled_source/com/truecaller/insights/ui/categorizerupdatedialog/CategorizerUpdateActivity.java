package com.truecaller.insights.ui.categorizerupdatedialog;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/insights/ui/categorizerupdatedialog/CategorizerUpdateActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CategorizerUpdateActivity extends com.truecaller.insights.ui.categorizerupdatedialog.Hilt_CategorizerUpdateActivity {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.insights.ui.categorizerupdatedialog.Hilt_CategorizerUpdateActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        ox1.baz.l.getClass();
        new ox1.baz().show(getSupportFragmentManager(), ox1.baz.n);
    }
}
