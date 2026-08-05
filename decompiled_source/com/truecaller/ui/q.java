package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class q implements android.text.TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.ui.FeedbackFormFragment b;

    public /* synthetic */ q(com.truecaller.ui.FeedbackFormFragment feedbackFormFragment, int i) {
        this.a = i;
        this.b = feedbackFormFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        int i = this.a;
        com.truecaller.ui.FeedbackFormFragment feedbackFormFragment = this.b;
        switch (i) {
            case 0:
                java.util.List list = com.truecaller.ui.FeedbackFormFragment.D;
                feedbackFormFragment.Z4(false);
                return;
            case 1:
                java.util.List list2 = com.truecaller.ui.FeedbackFormFragment.D;
                feedbackFormFragment.X4(false);
                return;
            default:
                int length = editable.length();
                java.util.List list3 = com.truecaller.ui.FeedbackFormFragment.D;
                feedbackFormFragment.Y4(length, false);
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    private final void a(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }
}
