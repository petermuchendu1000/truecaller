package com.truecaller.insights.fraud.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/truecaller/insights/fraud/model/FraudSearchWarning;", "", "id", "", "ruleId", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getRuleId", "getLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class FraudSearchWarning {

    @bw.qux("id")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    @bw.qux("label")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String label;

    @bw.qux("rule_id")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ruleId;

    public FraudSearchWarning(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "ruleId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "label");
        this.id = str;
        this.ruleId = str2;
        this.label = str3;
    }

    public static /* synthetic */ com.truecaller.insights.fraud.model.FraudSearchWarning copy$default(com.truecaller.insights.fraud.model.FraudSearchWarning fraudSearchWarning, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fraudSearchWarning.id;
        }
        if ((i & 2) != 0) {
            str2 = fraudSearchWarning.ruleId;
        }
        if ((i & 4) != 0) {
            str3 = fraudSearchWarning.label;
        }
        return fraudSearchWarning.copy(str, str2, str3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRuleId() {
        return this.ruleId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.fraud.model.FraudSearchWarning copy(@org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String ruleId, @org.jetbrains.annotations.NotNull java.lang.String label) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ruleId, "ruleId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "label");
        return new com.truecaller.insights.fraud.model.FraudSearchWarning(id, ruleId, label);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.fraud.model.FraudSearchWarning)) {
            return false;
        }
        com.truecaller.insights.fraud.model.FraudSearchWarning fraudSearchWarning = (com.truecaller.insights.fraud.model.FraudSearchWarning) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, fraudSearchWarning.id) && kotlin.jvm.internal.Intrinsics.b(this.ruleId, fraudSearchWarning.ruleId) && kotlin.jvm.internal.Intrinsics.b(this.label, fraudSearchWarning.label);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLabel() {
        return this.label;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRuleId() {
        return this.ruleId;
    }

    public int hashCode() {
        return this.label.hashCode() + ax1.bar.e(this.id.hashCode() * 31, 31, this.ruleId);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.label, ")", ro0.f.E("FraudSearchWarning(id=", this.id, ", ruleId=", this.ruleId, ", label="));
    }
}
