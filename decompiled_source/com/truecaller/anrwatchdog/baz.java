package com.truecaller.anrwatchdog;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\b\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/truecaller/anrwatchdog/baz;", "", "", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "enabled", "", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "thresholdMs", "reportMainThreadOnly", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
final /* data */ class baz {

    /* renamed from: a, reason: from kotlin metadata */
    @bw.qux("enabled")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean enabled;

    /* renamed from: b, reason: from kotlin metadata */
    @bw.qux("thresholdMs")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer thresholdMs;

    /* renamed from: c, reason: from kotlin metadata */
    @bw.qux("reportMainThreadOnly")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean reportMainThreadOnly;

    /* renamed from: a, reason: from getter */
    public final java.lang.Boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: b, reason: from getter */
    public final java.lang.Boolean getReportMainThreadOnly() {
        return this.reportMainThreadOnly;
    }

    /* renamed from: c, reason: from getter */
    public final java.lang.Integer getThresholdMs() {
        return this.thresholdMs;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.anrwatchdog.baz)) {
            return false;
        }
        com.truecaller.anrwatchdog.baz bazVar = (com.truecaller.anrwatchdog.baz) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.enabled, bazVar.enabled) && kotlin.jvm.internal.Intrinsics.b(this.thresholdMs, bazVar.thresholdMs) && kotlin.jvm.internal.Intrinsics.b(this.reportMainThreadOnly, bazVar.reportMainThreadOnly);
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.enabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        java.lang.Integer num = this.thresholdMs;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Boolean bool2 = this.reportMainThreadOnly;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ANRWatchDogABConfig(enabled=" + this.enabled + ", thresholdMs=" + this.thresholdMs + ", reportMainThreadOnly=" + this.reportMainThreadOnly + ")";
    }
}
