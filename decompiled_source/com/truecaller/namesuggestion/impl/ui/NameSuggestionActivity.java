package com.truecaller.namesuggestion.impl.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class NameSuggestionActivity extends com.truecaller.namesuggestion.impl.ui.Hilt_NameSuggestionActivity {
    public static final /* synthetic */ int h0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.namesuggestion.impl.ui.Hilt_NameSuggestionActivity, com.truecaller.namesuggestion.api.ui.PopupDialogActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        ex2.qux quxVar = ex2.a.a;
        yy.qux.B(this, true, ex2.a.a);
        h6.e.U(getWindow(), 0.5f);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.namesuggestion.api.ui.PopupDialogActivity
    public final com.truecaller.namesuggestion.impl.ui.c t0() {
        boolean z;
        android.content.Intent intent = getIntent();
        com.truecaller.data.entity.Contact contact = (com.truecaller.data.entity.Contact) intent.getParcelableExtra("contact");
        if (contact != null) {
            z = true;
        } else {
            z = false;
        }
        com.truecaller.log.AssertionUtil.OnlyInDebug.isTrue(z, new java.lang.String[0]);
        if (contact == null) {
            finish();
            return null;
        }
        java.lang.String stringExtra = intent.getStringExtra("source");
        java.util.Objects.requireNonNull(stringExtra);
        com.truecaller.namesuggestion.impl.ui.c.r.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "source");
        com.truecaller.namesuggestion.impl.ui.c cVar = new com.truecaller.namesuggestion.impl.ui.c();
        cVar.setArguments(ue0.i.t(new kotlin.Pair[]{new kotlin.Pair("contact", contact), new kotlin.Pair("source", stringExtra)}));
        return cVar;
    }
}
