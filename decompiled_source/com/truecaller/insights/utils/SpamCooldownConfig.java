package com.truecaller.insights.utils;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0018¨\u0006("}, d2 = {"Lcom/truecaller/insights/utils/SpamCooldownConfig;", "", "", "date", "", "spamShownCount", "<init>", "(Ljava/lang/String;I)V", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILjava/lang/String;ILyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$core_googlePlayRelease", "(Lcom/truecaller/insights/utils/SpamCooldownConfig;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/truecaller/insights/utils/SpamCooldownConfig;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "I", "getSpamShownCount", "Companion", "hz1/l", "hz1/m", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ug3.d
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SpamCooldownConfig {

    @org.jetbrains.annotations.NotNull
    public static final hz1.m Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private final java.lang.String date;
    private final int spamShownCount;

    public /* synthetic */ SpamCooldownConfig(int i, java.lang.String str, int i2, yg3.g1 g1Var) {
        if (3 != (i & 3)) {
            yg3.w0.l(i, 3, hz1.l.a.getDescriptor());
            throw null;
        }
        this.date = str;
        this.spamShownCount = i2;
    }

    public static /* synthetic */ com.truecaller.insights.utils.SpamCooldownConfig copy$default(com.truecaller.insights.utils.SpamCooldownConfig spamCooldownConfig, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = spamCooldownConfig.date;
        }
        if ((i2 & 2) != 0) {
            i = spamCooldownConfig.spamShownCount;
        }
        return spamCooldownConfig.copy(str, i);
    }

    public static final /* synthetic */ void write$Self$core_googlePlayRelease(com.truecaller.insights.utils.SpamCooldownConfig self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.o(serialDesc, 0, self.date);
        output.C(1, self.spamShownCount, serialDesc);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDate() {
        return this.date;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSpamShownCount() {
        return this.spamShownCount;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.utils.SpamCooldownConfig copy(@org.jetbrains.annotations.NotNull java.lang.String date, int spamShownCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        return new com.truecaller.insights.utils.SpamCooldownConfig(date, spamShownCount);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.utils.SpamCooldownConfig)) {
            return false;
        }
        com.truecaller.insights.utils.SpamCooldownConfig spamCooldownConfig = (com.truecaller.insights.utils.SpamCooldownConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.date, spamCooldownConfig.date) && this.spamShownCount == spamCooldownConfig.spamShownCount;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDate() {
        return this.date;
    }

    public final int getSpamShownCount() {
        return this.spamShownCount;
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.spamShownCount;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.i("SpamCooldownConfig(date=", this.spamShownCount, this.date, ", spamShownCount=", ")");
    }

    public SpamCooldownConfig(@org.jetbrains.annotations.NotNull java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "date");
        this.date = str;
        this.spamShownCount = i;
    }
}
