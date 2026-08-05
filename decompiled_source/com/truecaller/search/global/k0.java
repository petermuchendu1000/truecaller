package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class k0 implements android.text.TextWatcher {
    public final /* synthetic */ com.truecaller.search.global.GlobalSearchResultActivity a;

    public k0(com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity) {
        this.a = globalSearchResultActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = this.a;
        globalSearchResultActivity.n0.l2(globalSearchResultActivity.t0.getText().toString());
    }
}
