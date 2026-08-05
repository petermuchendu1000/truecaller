package com.truecaller.personalsafety.domain.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/truecaller/personalsafety/domain/data/PersonalSafetyHomePromoConfig;", "", "title", "", "text", "durationDays", "", "launchUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getText", "getDurationDays", "()J", "getLaunchUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "personal-safety_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class PersonalSafetyHomePromoConfig {
    private final long durationDays;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String launchUrl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String text;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String title;

    public PersonalSafetyHomePromoConfig() {
        this(null, null, 0L, null, 15, null);
    }

    public static /* synthetic */ com.truecaller.personalsafety.domain.data.PersonalSafetyHomePromoConfig copy$default(com.truecaller.personalsafety.domain.data.PersonalSafetyHomePromoConfig personalSafetyHomePromoConfig, java.lang.String str, java.lang.String str2, long j, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = personalSafetyHomePromoConfig.title;
        }
        if ((i & 2) != 0) {
            str2 = personalSafetyHomePromoConfig.text;
        }
        if ((i & 4) != 0) {
            j = personalSafetyHomePromoConfig.durationDays;
        }
        if ((i & 8) != 0) {
            str3 = personalSafetyHomePromoConfig.launchUrl;
        }
        java.lang.String str4 = str3;
        return personalSafetyHomePromoConfig.copy(str, str2, j, str4);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final long getDurationDays() {
        return this.durationDays;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLaunchUrl() {
        return this.launchUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.personalsafety.domain.data.PersonalSafetyHomePromoConfig copy(@org.jetbrains.annotations.NotNull java.lang.String title, @org.jetbrains.annotations.NotNull java.lang.String text, long durationDays, @org.jetbrains.annotations.NotNull java.lang.String launchUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launchUrl, "launchUrl");
        return new com.truecaller.personalsafety.domain.data.PersonalSafetyHomePromoConfig(title, text, durationDays, launchUrl);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.personalsafety.domain.data.PersonalSafetyHomePromoConfig)) {
            return false;
        }
        com.truecaller.personalsafety.domain.data.PersonalSafetyHomePromoConfig personalSafetyHomePromoConfig = (com.truecaller.personalsafety.domain.data.PersonalSafetyHomePromoConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.title, personalSafetyHomePromoConfig.title) && kotlin.jvm.internal.Intrinsics.b(this.text, personalSafetyHomePromoConfig.text) && this.durationDays == personalSafetyHomePromoConfig.durationDays && kotlin.jvm.internal.Intrinsics.b(this.launchUrl, personalSafetyHomePromoConfig.launchUrl);
    }

    public final long getDurationDays() {
        return this.durationDays;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLaunchUrl() {
        return this.launchUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int e = ax1.bar.e(this.title.hashCode() * 31, 31, this.text);
        long j = this.durationDays;
        return this.launchUrl.hashCode() + ((e + ((int) (j ^ (j >>> 32)))) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.text;
        long j = this.durationDays;
        java.lang.String str3 = this.launchUrl;
        java.lang.StringBuilder E = ro0.f.E("PersonalSafetyHomePromoConfig(title=", str, ", text=", str2, ", durationDays=");
        ro0.f.K(E, j, ", launchUrl=", str3);
        E.append(")");
        return E.toString();
    }

    public PersonalSafetyHomePromoConfig(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, long j, @org.jetbrains.annotations.NotNull java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "launchUrl");
        this.title = str;
        this.text = str2;
        this.durationDays = j;
        this.launchUrl = str3;
    }

    public /* synthetic */ PersonalSafetyHomePromoConfig(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 30L : j, (i & 8) != 0 ? "" : str3);
    }
}
