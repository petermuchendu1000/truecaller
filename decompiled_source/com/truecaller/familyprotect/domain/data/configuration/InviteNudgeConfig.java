package com.truecaller.familyprotect.domain.data.configuration;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/truecaller/familyprotect/domain/data/configuration/InviteNudgeConfig;", "", "", "cooldownPeriod", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/truecaller/familyprotect/domain/data/configuration/InviteNudgeConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCooldownPeriod", "Companion", "mk1/a", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class InviteNudgeConfig {

    @org.jetbrains.annotations.NotNull
    public static final mk1.a Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private static final com.truecaller.familyprotect.domain.data.configuration.InviteNudgeConfig Default = new com.truecaller.familyprotect.domain.data.configuration.InviteNudgeConfig(24);
    private final int cooldownPeriod;

    public InviteNudgeConfig(int i) {
        this.cooldownPeriod = i;
    }

    public static /* synthetic */ com.truecaller.familyprotect.domain.data.configuration.InviteNudgeConfig copy$default(com.truecaller.familyprotect.domain.data.configuration.InviteNudgeConfig inviteNudgeConfig, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = inviteNudgeConfig.cooldownPeriod;
        }
        return inviteNudgeConfig.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCooldownPeriod() {
        return this.cooldownPeriod;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.familyprotect.domain.data.configuration.InviteNudgeConfig copy(int cooldownPeriod) {
        return new com.truecaller.familyprotect.domain.data.configuration.InviteNudgeConfig(cooldownPeriod);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.familyprotect.domain.data.configuration.InviteNudgeConfig) && this.cooldownPeriod == ((com.truecaller.familyprotect.domain.data.configuration.InviteNudgeConfig) other).cooldownPeriod;
    }

    public final int getCooldownPeriod() {
        return this.cooldownPeriod;
    }

    public int hashCode() {
        return this.cooldownPeriod;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.d(this.cooldownPeriod, "InviteNudgeConfig(cooldownPeriod=", ")");
    }
}
