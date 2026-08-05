package com.truecaller.wizard;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\f¨\u0006\u001f"}, d2 = {"com/truecaller/wizard/WizardListenerImpl$AdsCoolOffData", "", "", "coolOffEnabled", "", "newUserCoolOff", "returningUserCoolOff", "<init>", "(ZJJ)V", "component1", "()Z", "component2", "()J", "component3", "Lcom/truecaller/wizard/WizardListenerImpl$AdsCoolOffData;", "copy", "(ZJJ)Lcom/truecaller/wizard/WizardListenerImpl$AdsCoolOffData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getCoolOffEnabled", "J", "getNewUserCoolOff", "getReturningUserCoolOff", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class WizardListenerImpl$AdsCoolOffData {
    public static final int $stable = 0;
    private final boolean coolOffEnabled;
    private final long newUserCoolOff;
    private final long returningUserCoolOff;

    public WizardListenerImpl$AdsCoolOffData(boolean z, long j, long j2) {
        this.coolOffEnabled = z;
        this.newUserCoolOff = j;
        this.returningUserCoolOff = j2;
    }

    public static /* synthetic */ com.truecaller.wizard.WizardListenerImpl$AdsCoolOffData copy$default(com.truecaller.wizard.WizardListenerImpl$AdsCoolOffData wizardListenerImpl$AdsCoolOffData, boolean z, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = wizardListenerImpl$AdsCoolOffData.coolOffEnabled;
        }
        if ((i & 2) != 0) {
            j = wizardListenerImpl$AdsCoolOffData.newUserCoolOff;
        }
        if ((i & 4) != 0) {
            j2 = wizardListenerImpl$AdsCoolOffData.returningUserCoolOff;
        }
        return wizardListenerImpl$AdsCoolOffData.copy(z, j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCoolOffEnabled() {
        return this.coolOffEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final long getNewUserCoolOff() {
        return this.newUserCoolOff;
    }

    /* renamed from: component3, reason: from getter */
    public final long getReturningUserCoolOff() {
        return this.returningUserCoolOff;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.wizard.WizardListenerImpl$AdsCoolOffData copy(boolean coolOffEnabled, long newUserCoolOff, long returningUserCoolOff) {
        return new com.truecaller.wizard.WizardListenerImpl$AdsCoolOffData(coolOffEnabled, newUserCoolOff, returningUserCoolOff);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.wizard.WizardListenerImpl$AdsCoolOffData)) {
            return false;
        }
        com.truecaller.wizard.WizardListenerImpl$AdsCoolOffData wizardListenerImpl$AdsCoolOffData = (com.truecaller.wizard.WizardListenerImpl$AdsCoolOffData) other;
        return this.coolOffEnabled == wizardListenerImpl$AdsCoolOffData.coolOffEnabled && this.newUserCoolOff == wizardListenerImpl$AdsCoolOffData.newUserCoolOff && this.returningUserCoolOff == wizardListenerImpl$AdsCoolOffData.returningUserCoolOff;
    }

    public final boolean getCoolOffEnabled() {
        return this.coolOffEnabled;
    }

    public final long getNewUserCoolOff() {
        return this.newUserCoolOff;
    }

    public final long getReturningUserCoolOff() {
        return this.returningUserCoolOff;
    }

    public int hashCode() {
        int i;
        if (this.coolOffEnabled) {
            i = 1231;
        } else {
            i = 1237;
        }
        long j = this.newUserCoolOff;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.returningUserCoolOff;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.coolOffEnabled;
        long j = this.newUserCoolOff;
        long j2 = this.returningUserCoolOff;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdsCoolOffData(coolOffEnabled=");
        sb.append(z);
        sb.append(", newUserCoolOff=");
        sb.append(j);
        return d4.t.o(sb, j2, ", returningUserCoolOff=", ")");
    }
}
