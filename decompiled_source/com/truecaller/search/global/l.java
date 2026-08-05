package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class l implements n00.g {
    public final /* synthetic */ com.truecaller.search.global.m a;

    public l(com.truecaller.search.global.m mVar) {
        this.a = mVar;
    }

    public final boolean d(n00.d dVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "event");
        tx.baz bazVar = this.a.i;
        if (bazVar != null) {
            tx.baz bazVar2 = (com.truecaller.search.global.h0) bazVar;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "event");
            if (kotlin.jvm.internal.Intrinsics.b(dVar.a, "Call")) {
                com.truecaller.data.entity.Contact contact = (com.truecaller.data.entity.Contact) dVar.e;
                if (contact == null) {
                    return false;
                }
                com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) bazVar2.a;
                if (i0Var != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
                    androidx.fragment.app.FragmentActivity requireActivity = ((com.truecaller.search.global.m) i0Var).requireActivity();
                    java.util.List C = contact.C();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "getNumbers(...)");
                    aq2.qux.a(requireActivity, contact, C, true, false, false, false, com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource.GLOBAL_SEARCH, "globalSearch", 5408);
                    return true;
                }
                return true;
            }
            return true;
        }
        kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
        throw null;
    }
}
