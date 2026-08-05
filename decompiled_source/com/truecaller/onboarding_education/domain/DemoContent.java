package com.truecaller.onboarding_education.domain;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/truecaller/onboarding_education/domain/DemoContent;", "", "scamName", "", "phoneNumber", "mobileProvider", "location", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getScamName", "()Ljava/lang/String;", "getPhoneNumber", "getMobileProvider", "getLocation", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "onboarding-education_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class DemoContent {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String location;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String mobileProvider;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String phoneNumber;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String scamName;
    private final long timestamp;

    public DemoContent(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "scamName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "mobileProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "location");
        this.scamName = str;
        this.phoneNumber = str2;
        this.mobileProvider = str3;
        this.location = str4;
        this.timestamp = j;
    }

    public static /* synthetic */ com.truecaller.onboarding_education.domain.DemoContent copy$default(com.truecaller.onboarding_education.domain.DemoContent demoContent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = demoContent.scamName;
        }
        if ((i & 2) != 0) {
            str2 = demoContent.phoneNumber;
        }
        if ((i & 4) != 0) {
            str3 = demoContent.mobileProvider;
        }
        if ((i & 8) != 0) {
            str4 = demoContent.location;
        }
        if ((i & 16) != 0) {
            j = demoContent.timestamp;
        }
        long j2 = j;
        return demoContent.copy(str, str2, str3, str4, j2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getScamName() {
        return this.scamName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMobileProvider() {
        return this.mobileProvider;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLocation() {
        return this.location;
    }

    /* renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.onboarding_education.domain.DemoContent copy(@org.jetbrains.annotations.NotNull java.lang.String scamName, @org.jetbrains.annotations.NotNull java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull java.lang.String mobileProvider, @org.jetbrains.annotations.NotNull java.lang.String location, long timestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamName, "scamName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mobileProvider, "mobileProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "location");
        return new com.truecaller.onboarding_education.domain.DemoContent(scamName, phoneNumber, mobileProvider, location, timestamp);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.onboarding_education.domain.DemoContent)) {
            return false;
        }
        com.truecaller.onboarding_education.domain.DemoContent demoContent = (com.truecaller.onboarding_education.domain.DemoContent) other;
        return kotlin.jvm.internal.Intrinsics.b(this.scamName, demoContent.scamName) && kotlin.jvm.internal.Intrinsics.b(this.phoneNumber, demoContent.phoneNumber) && kotlin.jvm.internal.Intrinsics.b(this.mobileProvider, demoContent.mobileProvider) && kotlin.jvm.internal.Intrinsics.b(this.location, demoContent.location) && this.timestamp == demoContent.timestamp;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLocation() {
        return this.location;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMobileProvider() {
        return this.mobileProvider;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getScamName() {
        return this.scamName;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(this.scamName.hashCode() * 31, 31, this.phoneNumber), 31, this.mobileProvider), 31, this.location);
        long j = this.timestamp;
        return e + ((int) (j ^ (j >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.scamName;
        java.lang.String str2 = this.phoneNumber;
        java.lang.String str3 = this.mobileProvider;
        java.lang.String str4 = this.location;
        long j = this.timestamp;
        java.lang.StringBuilder E = ro0.f.E("DemoContent(scamName=", str, ", phoneNumber=", str2, ", mobileProvider=");
        bar.E(E, str3, ", location=", str4, ", timestamp=");
        return bar.n(j, ")", E);
    }
}
