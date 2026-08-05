package com.truecaller.pretext;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/truecaller/pretext/RedactConfig;", "", "urls", "", "emails", "phoneNumbers", "numbers", "carrierSpamPrefix", "whitespace", "region", "", "<init>", "(ZZZZZZLjava/lang/String;)V", "getUrls", "()Z", "getEmails", "getPhoneNumbers", "getNumbers", "getCarrierSpamPrefix", "getWhitespace", "getRegion", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "lib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class RedactConfig {
    private final boolean carrierSpamPrefix;
    private final boolean emails;
    private final boolean numbers;
    private final boolean phoneNumbers;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String region;
    private final boolean urls;
    private final boolean whitespace;

    public RedactConfig() {
        this(false, false, false, false, false, false, null, 127, null);
    }

    public static /* synthetic */ com.truecaller.pretext.RedactConfig copy$default(com.truecaller.pretext.RedactConfig redactConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = redactConfig.urls;
        }
        if ((i & 2) != 0) {
            z2 = redactConfig.emails;
        }
        if ((i & 4) != 0) {
            z3 = redactConfig.phoneNumbers;
        }
        if ((i & 8) != 0) {
            z4 = redactConfig.numbers;
        }
        if ((i & 16) != 0) {
            z5 = redactConfig.carrierSpamPrefix;
        }
        if ((i & 32) != 0) {
            z6 = redactConfig.whitespace;
        }
        if ((i & 64) != 0) {
            str = redactConfig.region;
        }
        boolean z7 = z6;
        java.lang.String str2 = str;
        boolean z8 = z5;
        boolean z9 = z3;
        return redactConfig.copy(z, z2, z9, z4, z8, z7, str2);
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

    /* renamed from: component4, reason: from getter */
    public final boolean getNumbers() {
        return this.numbers;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCarrierSpamPrefix() {
        return this.carrierSpamPrefix;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getWhitespace() {
        return this.whitespace;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component7, reason: from getter */
    public final java.lang.String getRegion() {
        return this.region;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.pretext.RedactConfig copy(boolean urls, boolean emails, boolean phoneNumbers, boolean numbers, boolean carrierSpamPrefix, boolean whitespace, @org.jetbrains.annotations.NotNull java.lang.String region) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "region");
        return new com.truecaller.pretext.RedactConfig(urls, emails, phoneNumbers, numbers, carrierSpamPrefix, whitespace, region);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.pretext.RedactConfig)) {
            return false;
        }
        com.truecaller.pretext.RedactConfig redactConfig = (com.truecaller.pretext.RedactConfig) other;
        return this.urls == redactConfig.urls && this.emails == redactConfig.emails && this.phoneNumbers == redactConfig.phoneNumbers && this.numbers == redactConfig.numbers && this.carrierSpamPrefix == redactConfig.carrierSpamPrefix && this.whitespace == redactConfig.whitespace && kotlin.jvm.internal.Intrinsics.b(this.region, redactConfig.region);
    }

    public final boolean getCarrierSpamPrefix() {
        return this.carrierSpamPrefix;
    }

    public final boolean getEmails() {
        return this.emails;
    }

    public final boolean getNumbers() {
        return this.numbers;
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

    public final boolean getWhitespace() {
        return this.whitespace;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 1237;
        if (this.urls) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i7 = i * 31;
        if (this.emails) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i8 = (i7 + i2) * 31;
        if (this.phoneNumbers) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        int i9 = (i8 + i3) * 31;
        if (this.numbers) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i11 = (i9 + i4) * 31;
        if (this.carrierSpamPrefix) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i12 = (i11 + i5) * 31;
        if (this.whitespace) {
            i6 = 1231;
        }
        return this.region.hashCode() + ((i12 + i6) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.urls;
        boolean z2 = this.emails;
        boolean z3 = this.phoneNumbers;
        boolean z4 = this.numbers;
        boolean z5 = this.carrierSpamPrefix;
        boolean z6 = this.whitespace;
        java.lang.String str = this.region;
        java.lang.StringBuilder v = bx.e1.v("RedactConfig(urls=", ", emails=", ", phoneNumbers=", z, z2);
        nc0.k1.p(v, z3, ", numbers=", z4, ", carrierSpamPrefix=");
        nc0.k1.p(v, z5, ", whitespace=", z6, ", region=");
        return bar.v(str, ")", v);
    }

    public RedactConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "region");
        this.urls = z;
        this.emails = z2;
        this.phoneNumbers = z3;
        this.numbers = z4;
        this.carrierSpamPrefix = z5;
        this.whitespace = z6;
        this.region = str;
    }

    public /* synthetic */ RedactConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? "IN" : str);
    }
}
