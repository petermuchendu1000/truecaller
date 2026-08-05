package com.truecaller.ads.acsrules.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/ads/acsrules/model/AcsRulesConfigCondition;", "", "data", "", "characteristics", "", "Lcom/truecaller/ads/acsrules/model/AcsRulesConfigCharacteristics;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getData", "()Ljava/lang/String;", "getCharacteristics", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AcsRulesConfigCondition {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.acsrules.model.AcsRulesConfigCharacteristics> characteristics;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String data;

    public AcsRulesConfigCondition(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.acsrules.model.AcsRulesConfigCharacteristics> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "characteristics");
        this.data = str;
        this.characteristics = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.acsrules.model.AcsRulesConfigCondition copy$default(com.truecaller.ads.acsrules.model.AcsRulesConfigCondition acsRulesConfigCondition, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = acsRulesConfigCondition.data;
        }
        if ((i & 2) != 0) {
            list = acsRulesConfigCondition.characteristics;
        }
        return acsRulesConfigCondition.copy(str, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.acsrules.model.AcsRulesConfigCharacteristics> component2() {
        return this.characteristics;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.acsrules.model.AcsRulesConfigCondition copy(@org.jetbrains.annotations.NotNull java.lang.String data, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.acsrules.model.AcsRulesConfigCharacteristics> characteristics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        return new com.truecaller.ads.acsrules.model.AcsRulesConfigCondition(data, characteristics);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.acsrules.model.AcsRulesConfigCondition)) {
            return false;
        }
        com.truecaller.ads.acsrules.model.AcsRulesConfigCondition acsRulesConfigCondition = (com.truecaller.ads.acsrules.model.AcsRulesConfigCondition) other;
        return kotlin.jvm.internal.Intrinsics.b(this.data, acsRulesConfigCondition.data) && kotlin.jvm.internal.Intrinsics.b(this.characteristics, acsRulesConfigCondition.characteristics);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.acsrules.model.AcsRulesConfigCharacteristics> getCharacteristics() {
        return this.characteristics;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getData() {
        return this.data;
    }

    public int hashCode() {
        return this.characteristics.hashCode() + (this.data.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.C("AcsRulesConfigCondition(data=", this.data, ", characteristics=", this.characteristics, ")");
    }
}
