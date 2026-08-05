package com.truecaller.ugc;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/truecaller/ugc/baz;", "", "", "a", "Ljava/lang/String;", "getBackupStatus", "()Ljava/lang/String;", "backupStatus", "ugc_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class baz {

    /* renamed from: a, reason: from kotlin metadata */
    @bw.qux("BACKUP_STATUS")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String backupStatus;

    public final boolean a() {
        return kotlin.text.y.p(this.backupStatus, "ENABLED", true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.ugc.baz) && kotlin.jvm.internal.Intrinsics.b(this.backupStatus, ((com.truecaller.ugc.baz) obj).backupStatus);
    }

    public final int hashCode() {
        java.lang.String str = this.backupStatus;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final java.lang.String toString() {
        return bar.t("EnhancedSearchBackupService(backupStatus=", this.backupStatus, ")");
    }
}
