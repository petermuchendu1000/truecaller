package com.truecaller.voicemail.domain.callstabpromo;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0083\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lcom/truecaller/voicemail/domain/callstabpromo/CallsTabVoicemailPromoRemoteConfigDTO;", "", "", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_googlePlayRelease", "(Lcom/truecaller/voicemail/domain/callstabpromo/CallsTabVoicemailPromoRemoteConfigDTO;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/truecaller/voicemail/domain/callstabpromo/CallsTabVoicemailPromoRemoteConfigDTO;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "Companion", "com/truecaller/voicemail/domain/callstabpromo/bar", "com/truecaller/voicemail/domain/callstabpromo/baz", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@ug3.d
/* loaded from: /home/user/tc_decoded/classes7.dex */
final /* data */ class CallsTabVoicemailPromoRemoteConfigDTO {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.voicemail.domain.callstabpromo.baz Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private final java.lang.String subtitle;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String title;

    public /* synthetic */ CallsTabVoicemailPromoRemoteConfigDTO(int i, java.lang.String str, java.lang.String str2, yg3.g1 g1Var) {
        if (3 != (i & 3)) {
            yg3.w0.l(i, 3, com.truecaller.voicemail.domain.callstabpromo.bar.a.getDescriptor());
            throw null;
        }
        this.title = str;
        this.subtitle = str2;
    }

    public static /* synthetic */ com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO copy$default(com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO callsTabVoicemailPromoRemoteConfigDTO, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = callsTabVoicemailPromoRemoteConfigDTO.title;
        }
        if ((i & 2) != 0) {
            str2 = callsTabVoicemailPromoRemoteConfigDTO.subtitle;
        }
        return callsTabVoicemailPromoRemoteConfigDTO.copy(str, str2);
    }

    public static /* synthetic */ void getSubtitle$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$domain_googlePlayRelease(com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.o(serialDesc, 0, self.title);
        output.o(serialDesc, 1, self.subtitle);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO copy(@org.jetbrains.annotations.NotNull java.lang.String title, @org.jetbrains.annotations.NotNull java.lang.String subtitle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO(title, subtitle);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO)) {
            return false;
        }
        com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO callsTabVoicemailPromoRemoteConfigDTO = (com.truecaller.voicemail.domain.callstabpromo.CallsTabVoicemailPromoRemoteConfigDTO) other;
        return kotlin.jvm.internal.Intrinsics.b(this.title, callsTabVoicemailPromoRemoteConfigDTO.title) && kotlin.jvm.internal.Intrinsics.b(this.subtitle, callsTabVoicemailPromoRemoteConfigDTO.subtitle);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.subtitle.hashCode() + (this.title.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("CallsTabVoicemailPromoRemoteConfigDTO(title=", this.title, ", subtitle=", this.subtitle, ")");
    }

    public CallsTabVoicemailPromoRemoteConfigDTO(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "subtitle");
        this.title = str;
        this.subtitle = str2;
    }
}
