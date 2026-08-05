package com.truecaller.referrals.api.data.remote.entity;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/truecaller/referrals/api/data/remote/entity/RedeemCodeResponse;", "", "", "a", "Ljava/lang/String;", com.vungle.ads.internal.executor.b.b, "()Ljava/lang/String;", "message", "getReferrerName", "referrerName", "c", "status", "", "d", "I", "()I", "daysOfPro", "Status", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class RedeemCodeResponse {

    /* renamed from: a, reason: from kotlin metadata */
    @bw.qux("message")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;

    /* renamed from: b, reason: from kotlin metadata */
    @bw.qux("referrerName")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String referrerName;

    /* renamed from: c, reason: from kotlin metadata */
    @bw.qux("status")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String status;

    /* renamed from: d, reason: from kotlin metadata */
    @bw.qux("durationDays")
    private final int daysOfPro;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/referrals/api/data/remote/entity/RedeemCodeResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "ALREADY_REFERRED", "QUOTA_OVER", "SUCCESS", "OLD_PROFILE", "SELF_REFERRAL", "CANNOT_GRANT_PREMIUM", "INVALID_CODE", "WAS_REFERRER", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final class Status {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status[] $VALUES;
        public static final com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status ALREADY_REFERRED = new com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status("ALREADY_REFERRED", 0);
        public static final com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status QUOTA_OVER = new com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status("QUOTA_OVER", 1);
        public static final com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status SUCCESS = new com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status("SUCCESS", 2);
        public static final com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status OLD_PROFILE = new com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status("OLD_PROFILE", 3);
        public static final com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status SELF_REFERRAL = new com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status("SELF_REFERRAL", 4);
        public static final com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status CANNOT_GRANT_PREMIUM = new com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status("CANNOT_GRANT_PREMIUM", 5);
        public static final com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status INVALID_CODE = new com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status("INVALID_CODE", 6);
        public static final com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status WAS_REFERRER = new com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status("WAS_REFERRER", 7);

        private static final /* synthetic */ com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status[] $values() {
            return new com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status[]{ALREADY_REFERRED, QUOTA_OVER, SUCCESS, OLD_PROFILE, SELF_REFERRAL, CANNOT_GRANT_PREMIUM, INVALID_CODE, WAS_REFERRER};
        }

        static {
            com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private Status(java.lang.String str, int i) {
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status valueOf(java.lang.String str) {
            return (com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status) java.lang.Enum.valueOf(com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status.class, str);
        }

        public static com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status[] values() {
            return (com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse.Status[]) $VALUES.clone();
        }
    }

    /* renamed from: a, reason: from getter */
    public final int getDaysOfPro() {
        return this.daysOfPro;
    }

    /* renamed from: b, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: c, reason: from getter */
    public final java.lang.String getStatus() {
        return this.status;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse)) {
            return false;
        }
        com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse redeemCodeResponse = (com.truecaller.referrals.api.data.remote.entity.RedeemCodeResponse) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.message, redeemCodeResponse.message) && kotlin.jvm.internal.Intrinsics.b(this.referrerName, redeemCodeResponse.referrerName) && kotlin.jvm.internal.Intrinsics.b(this.status, redeemCodeResponse.status) && this.daysOfPro == redeemCodeResponse.daysOfPro;
    }

    public final int hashCode() {
        return ax1.bar.e(ax1.bar.e(this.message.hashCode() * 31, 31, this.referrerName), 31, this.status) + this.daysOfPro;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.message;
        java.lang.String str2 = this.referrerName;
        return h8.s0.n(this.daysOfPro, this.status, ", daysOfPro=", ")", ro0.f.E("RedeemCodeResponse(message=", str, ", referrerName=", str2, ", status="));
    }
}
