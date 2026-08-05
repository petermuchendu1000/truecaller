package com.truecaller.settings.impl.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class p {
    public final rb.z a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings callAssistantSettings, com.truecaller.settings.impl.ui.call_assistant.CallAssistantSettings callAssistantSettings2, boolean z) {
        this(new xr2.n(str, callAssistantSettings, callAssistantSettings2, z));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, com.truecaller.settings.impl.ui.calls.CallsSettings callsSettings, boolean z, boolean z2) {
        this(new xr2.o(str, callsSettings, z, z2));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, com.truecaller.settings.impl.ui.general.GeneralSettings generalSettings) {
        this(new xr2.q(str, generalSettings));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
    }

    public p(rb.z zVar) {
        this.a = zVar;
    }
}
