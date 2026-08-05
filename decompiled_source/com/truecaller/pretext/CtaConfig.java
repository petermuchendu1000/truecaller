package com.truecaller.pretext;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/truecaller/pretext/CtaConfig;", "", "urls", "", "emails", "phoneNumbers", "region", "", "<init>", "(ZZZLjava/lang/String;)V", "getUrls", "()Z", "getEmails", "getPhoneNumbers", "getRegion", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CtaConfig {
    private final boolean emails;
    private final boolean phoneNumbers;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String region;
    private final boolean urls;

    public CtaConfig() {
        this(false, false, false, null, 15, null);
    }

    public static /* synthetic */ com.truecaller.pretext.CtaConfig copy$default(com.truecaller.pretext.CtaConfig ctaConfig, boolean z, boolean z2, boolean z3, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = ctaConfig.urls;
        }
        if ((i & 2) != 0) {
            z2 = ctaConfig.emails;
        }
        if ((i & 4) != 0) {
            z3 = ctaConfig.phoneNumbers;
        }
        if ((i & 8) != 0) {
            str = ctaConfig.region;
        }
        return ctaConfig.copy(z, z2, z3, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getUrls() {
        return this.urls;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEmails() {
        return this.emails;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPhoneNumbers() {
        return this.phoneNumbers;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getRegion() {
        return this.region;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.pretext.CtaConfig copy(boolean urls, boolean emails, boolean phoneNumbers, @org.jetbrains.annotations.NotNull java.lang.String region) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "region");
        return new com.truecaller.pretext.CtaConfig(urls, emails, phoneNumbers, region);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.pretext.CtaConfig)) {
            return false;
        }
        com.truecaller.pretext.CtaConfig ctaConfig = (com.truecaller.pretext.CtaConfig) other;
        return this.urls == ctaConfig.urls && this.emails == ctaConfig.emails && this.phoneNumbers == ctaConfig.phoneNumbers && kotlin.jvm.internal.Intrinsics.b(this.region, ctaConfig.region);
    }

    public final boolean getEmails() {
        return this.emails;
    }

    public final boolean getPhoneNumbers() {
        return this.phoneNumbers;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRegion() {
        return this.region;
    }

    public final boolean getUrls() {
        return this.urls;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 1237;
        if (this.urls) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i4 = i * 31;
        if (this.emails) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i5 = (i4 + i2) * 31;
        if (this.phoneNumbers) {
            i3 = 1231;
        }
        return this.region.hashCode() + ((i5 + i3) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.urls;
        boolean z2 = this.emails;
        boolean z3 = this.phoneNumbers;
        java.lang.String str = this.region;
        java.lang.StringBuilder v = bx.e1.v("CtaConfig(urls=", ", emails=", ", phoneNumbers=", z, z2);
        v.append(z3);
        v.append(", region=");
        v.append(str);
        v.append(")");
        return v.toString();
    }

    public CtaConfig(boolean z, boolean z2, boolean z3, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "region");
        this.urls = z;
        this.emails = z2;
        this.phoneNumbers = z3;
        this.region = str;
    }

    public /* synthetic */ CtaConfig(boolean z, boolean z2, boolean z3, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? "IN" : str);
    }
}
