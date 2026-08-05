package com.truecaller.voicemail.domain.data.network.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/truecaller/voicemail/domain/data/network/model/VoicemailUpdateUserInfoRequest;", "", "voicemailAnonymizedDataConsent", "", "allowVoicemailForContacts", "showNotificationsFromTopSpammers", "voiceId", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getVoicemailAnonymizedDataConsent", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllowVoicemailForContacts", "getShowNotificationsFromTopSpammers", "getVoiceId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/truecaller/voicemail/domain/data/network/model/VoicemailUpdateUserInfoRequest;", "equals", "other", "hashCode", "", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VoicemailUpdateUserInfoRequest {

    @bw.qux("voicemailAnswerCallsFromContacts")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean allowVoicemailForContacts;

    @bw.qux("voicemailNotificationsTopSpammersEnabled")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean showNotificationsFromTopSpammers;

    @bw.qux("voice")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String voiceId;

    @bw.qux("voicemailAnonymizedDataConsent")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean voicemailAnonymizedDataConsent;

    public VoicemailUpdateUserInfoRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ com.truecaller.voicemail.domain.data.network.model.VoicemailUpdateUserInfoRequest copy$default(com.truecaller.voicemail.domain.data.network.model.VoicemailUpdateUserInfoRequest voicemailUpdateUserInfoRequest, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = voicemailUpdateUserInfoRequest.voicemailAnonymizedDataConsent;
        }
        if ((i & 2) != 0) {
            bool2 = voicemailUpdateUserInfoRequest.allowVoicemailForContacts;
        }
        if ((i & 4) != 0) {
            bool3 = voicemailUpdateUserInfoRequest.showNotificationsFromTopSpammers;
        }
        if ((i & 8) != 0) {
            str = voicemailUpdateUserInfoRequest.voiceId;
        }
        return voicemailUpdateUserInfoRequest.copy(bool, bool2, bool3, str);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.Boolean getVoicemailAnonymizedDataConsent() {
        return this.voicemailAnonymizedDataConsent;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getAllowVoicemailForContacts() {
        return this.allowVoicemailForContacts;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.Boolean getShowNotificationsFromTopSpammers() {
        return this.showNotificationsFromTopSpammers;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getVoiceId() {
        return this.voiceId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.voicemail.domain.data.network.model.VoicemailUpdateUserInfoRequest copy(@org.jetbrains.annotations.Nullable java.lang.Boolean voicemailAnonymizedDataConsent, @org.jetbrains.annotations.Nullable java.lang.Boolean allowVoicemailForContacts, @org.jetbrains.annotations.Nullable java.lang.Boolean showNotificationsFromTopSpammers, @org.jetbrains.annotations.Nullable java.lang.String voiceId) {
        return new com.truecaller.voicemail.domain.data.network.model.VoicemailUpdateUserInfoRequest(voicemailAnonymizedDataConsent, allowVoicemailForContacts, showNotificationsFromTopSpammers, voiceId);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.voicemail.domain.data.network.model.VoicemailUpdateUserInfoRequest)) {
            return false;
        }
        com.truecaller.voicemail.domain.data.network.model.VoicemailUpdateUserInfoRequest voicemailUpdateUserInfoRequest = (com.truecaller.voicemail.domain.data.network.model.VoicemailUpdateUserInfoRequest) other;
        return kotlin.jvm.internal.Intrinsics.b(this.voicemailAnonymizedDataConsent, voicemailUpdateUserInfoRequest.voicemailAnonymizedDataConsent) && kotlin.jvm.internal.Intrinsics.b(this.allowVoicemailForContacts, voicemailUpdateUserInfoRequest.allowVoicemailForContacts) && kotlin.jvm.internal.Intrinsics.b(this.showNotificationsFromTopSpammers, voicemailUpdateUserInfoRequest.showNotificationsFromTopSpammers) && kotlin.jvm.internal.Intrinsics.b(this.voiceId, voicemailUpdateUserInfoRequest.voiceId);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getAllowVoicemailForContacts() {
        return this.allowVoicemailForContacts;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getShowNotificationsFromTopSpammers() {
        return this.showNotificationsFromTopSpammers;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVoiceId() {
        return this.voiceId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getVoicemailAnonymizedDataConsent() {
        return this.voicemailAnonymizedDataConsent;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.voicemailAnonymizedDataConsent;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        java.lang.Boolean bool2 = this.allowVoicemailForContacts;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        java.lang.Boolean bool3 = this.showNotificationsFromTopSpammers;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        java.lang.String str = this.voiceId;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "VoicemailUpdateUserInfoRequest(voicemailAnonymizedDataConsent=" + this.voicemailAnonymizedDataConsent + ", allowVoicemailForContacts=" + this.allowVoicemailForContacts + ", showNotificationsFromTopSpammers=" + this.showNotificationsFromTopSpammers + ", voiceId=" + this.voiceId + ")";
    }

    public VoicemailUpdateUserInfoRequest(@org.jetbrains.annotations.Nullable java.lang.Boolean bool, @org.jetbrains.annotations.Nullable java.lang.Boolean bool2, @org.jetbrains.annotations.Nullable java.lang.Boolean bool3, @org.jetbrains.annotations.Nullable java.lang.String str) {
        this.voicemailAnonymizedDataConsent = bool;
        this.allowVoicemailForContacts = bool2;
        this.showNotificationsFromTopSpammers = bool3;
        this.voiceId = str;
    }

    public /* synthetic */ VoicemailUpdateUserInfoRequest(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : str);
    }
}
