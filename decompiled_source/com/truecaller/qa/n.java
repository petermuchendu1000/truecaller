package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class n extends kf.b {
    public final /* synthetic */ com.truecaller.qa.QMActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.truecaller.qa.QMActivity qMActivity, java.lang.String... strArr) {
        super(qMActivity, strArr);
        this.f = qMActivity;
    }

    public final void s(java.util.LinkedHashMap linkedHashMap) {
        if (!linkedHashMap.isEmpty()) {
            com.truecaller.notifications.enhancing.SourcedContact sourcedContact = (com.truecaller.notifications.enhancing.SourcedContact) linkedHashMap.keySet().iterator().next();
            com.truecaller.data.entity.Contact contact = (com.truecaller.data.entity.Contact) linkedHashMap.get(sourcedContact);
            java.lang.String str = sourcedContact.f;
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f;
            appCompatActivity.startActivity(com.truecaller.ui.CallMeBackActivity.u0(appCompatActivity, contact, str, 1, "callMeBackPopupOutApp", "callMeBackPopupOutApp", com.truecaller.calling.initiate_call.InitiateCallHelper.CallContextOption.Skip.a, null, null));
        }
    }
}
