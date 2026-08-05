package com.truecaller.remoteconfig.firebase;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/truecaller/remoteconfig/firebase/e;", "", "", "a", "Ljava/lang/Long;", "getFetchTimeKey", "()Ljava/lang/Long;", "fetchTimeKey", com.vungle.ads.internal.executor.b.b, "templateVersionNumberKey", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
final /* data */ class e {

    /* renamed from: a, reason: from kotlin metadata */
    @bw.qux("fetch_time_key")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long fetchTimeKey;

    /* renamed from: b, reason: from kotlin metadata */
    @bw.qux("template_version_number_key")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long templateVersionNumberKey;

    /* renamed from: a, reason: from getter */
    public final java.lang.Long getTemplateVersionNumberKey() {
        return this.templateVersionNumberKey;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.remoteconfig.firebase.e)) {
            return false;
        }
        com.truecaller.remoteconfig.firebase.e eVar = (com.truecaller.remoteconfig.firebase.e) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.fetchTimeKey, eVar.fetchTimeKey) && kotlin.jvm.internal.Intrinsics.b(this.templateVersionNumberKey, eVar.templateVersionNumberKey);
    }

    public final int hashCode() {
        java.lang.Long l = this.fetchTimeKey;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        java.lang.Long l2 = this.templateVersionNumberKey;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "FirebaseRemoteConfigTemplate(fetchTimeKey=" + this.fetchTimeKey + ", templateVersionNumberKey=" + this.templateVersionNumberKey + ")";
    }
}
