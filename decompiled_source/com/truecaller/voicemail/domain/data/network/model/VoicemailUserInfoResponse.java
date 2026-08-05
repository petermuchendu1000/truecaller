package com.truecaller.voicemail.domain.data.network.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/truecaller/voicemail/domain/data/network/model/VoicemailUserInfoResponse;", "", "voicemailAnonymizedDataConsent", "", "allowVoicemailForContacts", "voicemailNotificationsTopSpammersEnabled", "<init>", "(ZZZ)V", "getVoicemailAnonymizedDataConsent", "()Z", "getAllowVoicemailForContacts", "getVoicemailNotificationsTopSpammersEnabled", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VoicemailUserInfoResponse {

    @bw.qux("voicemailAnswerCallsFromContacts")
    private final boolean allowVoicemailForContacts;

    @bw.qux("voicemailAnonymizedDataConsent")
    private final boolean voicemailAnonymizedDataConsent;

    @bw.qux("voicemailNotificationsTopSpammersEnabled")
    private final boolean voicemailNotificationsTopSpammersEnabled;

    public VoicemailUserInfoResponse(boolean z, boolean z2, boolean z3) {
        this.voicemailAnonymizedDataConsent = z;
        this.allowVoicemailForContacts = z2;
        this.voicemailNotificationsTopSpammersEnabled = z3;
    }

    public static /* synthetic */ com.truecaller.voicemail.domain.data.network.model.VoicemailUserInfoResponse copy$default(com.truecaller.voicemail.domain.data.network.model.VoicemailUserInfoResponse voicemailUserInfoResponse, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = voicemailUserInfoResponse.voicemailAnonymizedDataConsent;
        }
        if ((i & 2) != 0) {
            z2 = voicemailUserInfoResponse.allowVoicemailForContacts;
        }
        if ((i & 4) != 0) {
            z3 = voicemailUserInfoResponse.voicemailNotificationsTopSpammersEnabled;
        }
        return voicemailUserInfoResponse.copy(z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getVoicemailAnonymizedDataConsent() {
        return this.voicemailAnonymizedDataConsent;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAllowVoicemailForContacts() {
        return this.allowVoicemailForContacts;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getVoicemailNotificationsTopSpammersEnabled() {
        return this.voicemailNotificationsTopSpammersEnabled;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.voicemail.domain.data.network.model.VoicemailUserInfoResponse copy(boolean voicemailAnonymizedDataConsent, boolean allowVoicemailForContacts, boolean voicemailNotificationsTopSpammersEnabled) {
        return new com.truecaller.voicemail.domain.data.network.model.VoicemailUserInfoResponse(voicemailAnonymizedDataConsent, allowVoicemailForContacts, voicemailNotificationsTopSpammersEnabled);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.voicemail.domain.data.network.model.VoicemailUserInfoResponse)) {
            return false;
        }
        com.truecaller.voicemail.domain.data.network.model.VoicemailUserInfoResponse voicemailUserInfoResponse = (com.truecaller.voicemail.domain.data.network.model.VoicemailUserInfoResponse) other;
        return this.voicemailAnonymizedDataConsent == voicemailUserInfoResponse.voicemailAnonymizedDataConsent && this.allowVoicemailForContacts == voicemailUserInfoResponse.allowVoicemailForContacts && this.voicemailNotificationsTopSpammersEnabled == voicemailUserInfoResponse.voicemailNotificationsTopSpammersEnabled;
    }

    public final boolean getAllowVoicemailForContacts() {
        return this.allowVoicemailForContacts;
    }

    public final boolean getVoicemailAnonymizedDataConsent() {
        return this.voicemailAnonymizedDataConsent;
    }

    public final boolean getVoicemailNotificationsTopSpammersEnabled() {
        return this.voicemailNotificationsTopSpammersEnabled;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 1237;
        if (this.voicemailAnonymizedDataConsent) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i4 = i * 31;
        if (this.allowVoicemailForContacts) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i5 = (i4 + i2) * 31;
        if (this.voicemailNotificationsTopSpammersEnabled) {
            i3 = 1231;
        }
        return i5 + i3;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.voicemailAnonymizedDataConsent;
        boolean z2 = this.allowVoicemailForContacts;
        return h8.s0.s(bx.e1.v("VoicemailUserInfoResponse(voicemailAnonymizedDataConsent=", ", allowVoicemailForContacts=", ", voicemailNotificationsTopSpammersEnabled=", z, z2), this.voicemailNotificationsTopSpammersEnabled, ")");
    }
}
