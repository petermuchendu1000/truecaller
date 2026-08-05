package com.truecaller.ugc;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/truecaller/ugc/bar;", "", "Lcom/truecaller/ugc/baz;", "a", "Lcom/truecaller/ugc/baz;", "()Lcom/truecaller/ugc/baz;", "backupService", "ugc_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class bar {

    /* renamed from: a, reason: from kotlin metadata */
    @bw.qux("BACKUP_SERVICE")
    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ugc.baz backupService;

    /* renamed from: a, reason: from getter */
    public final com.truecaller.ugc.baz getBackupService() {
        return this.backupService;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.ugc.bar) && kotlin.jvm.internal.Intrinsics.b(this.backupService, ((com.truecaller.ugc.bar) obj).backupService);
    }

    public final int hashCode() {
        com.truecaller.ugc.baz bazVar = this.backupService;
        if (bazVar == null) {
            return 0;
        }
        return bazVar.hashCode();
    }

    public final java.lang.String toString() {
        return "EnhancedSearchBackupDto(backupService=" + this.backupService + ")";
    }
}
