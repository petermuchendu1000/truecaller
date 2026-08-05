package com.truecaller.rewardprogram.api.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/truecaller/rewardprogram/api/model/ProgressConfig;", "Landroid/os/Parcelable;", "ClaimableRewardConfig", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class ProgressConfig implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.rewardprogram.api.model.ProgressConfig> CREATOR = new java.lang.Object();
    public static final com.truecaller.rewardprogram.api.model.ProgressConfig j = new com.truecaller.rewardprogram.api.model.ProgressConfig(1, null, 0, 0, 0, 0, 0, 0, 0);
    public final long a;
    public final com.truecaller.rewardprogram.api.model.ProgressConfig.ClaimableRewardConfig b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/rewardprogram/api/model/ProgressConfig$ClaimableRewardConfig;", "Landroid/os/Parcelable;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class ClaimableRewardConfig implements android.os.Parcelable {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.rewardprogram.api.model.ProgressConfig.ClaimableRewardConfig> CREATOR = new java.lang.Object();
        public final int a;

        public ClaimableRewardConfig(int i) {
            this.a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.truecaller.rewardprogram.api.model.ProgressConfig.ClaimableRewardConfig) && this.a == ((com.truecaller.rewardprogram.api.model.ProgressConfig.ClaimableRewardConfig) obj).a;
        }

        /* renamed from: hashCode, reason: from getter */
        public final int getA() {
            return this.a;
        }

        public final java.lang.String toString() {
            return y.o.d(this.a, "ClaimableRewardConfig(icon=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeInt(this.a);
        }
    }

    public ProgressConfig(long j2, com.truecaller.rewardprogram.api.model.ProgressConfig.ClaimableRewardConfig claimableRewardConfig, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = j2;
        this.b = claimableRewardConfig;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.rewardprogram.api.model.ProgressConfig)) {
            return false;
        }
        com.truecaller.rewardprogram.api.model.ProgressConfig progressConfig = (com.truecaller.rewardprogram.api.model.ProgressConfig) obj;
        return this.a == progressConfig.a && kotlin.jvm.internal.Intrinsics.b(this.b, progressConfig.b) && this.c == progressConfig.c && this.d == progressConfig.d && this.e == progressConfig.e && this.f == progressConfig.f && this.g == progressConfig.g && this.h == progressConfig.h && this.i == progressConfig.i;
    }

    public final int hashCode() {
        int i;
        long j2 = this.a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        com.truecaller.rewardprogram.api.model.ProgressConfig.ClaimableRewardConfig claimableRewardConfig = this.b;
        if (claimableRewardConfig == null) {
            i = 0;
        } else {
            i = claimableRewardConfig.a;
        }
        return ((((((((((((((i2 + i) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProgressConfig(level=");
        sb.append(this.a);
        sb.append(", claimableRewardConfig=");
        sb.append(this.b);
        h8.s0.x(this.c, this.d, ", startProgress=", ", endProgress=", sb);
        h8.s0.x(this.e, this.f, ", maxProgress=", ", startPoints=", sb);
        h8.s0.x(this.g, this.h, ", endPoints=", ", maxPoints=", sb);
        return t.c.q(sb, ", earnedPoints=", this.i, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeLong(this.a);
        com.truecaller.rewardprogram.api.model.ProgressConfig.ClaimableRewardConfig claimableRewardConfig = this.b;
        if (claimableRewardConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            claimableRewardConfig.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
    }
}
