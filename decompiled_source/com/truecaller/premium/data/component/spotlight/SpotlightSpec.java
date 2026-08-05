package com.truecaller.premium.data.component.spotlight;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/truecaller/premium/data/component/spotlight/SpotlightSpec;", "", "subComponentTypeAsString", "", "value", "Lcom/truecaller/premium/data/component/spotlight/SpotlightFeatureSpecValue;", "<init>", "(Ljava/lang/String;Lcom/truecaller/premium/data/component/spotlight/SpotlightFeatureSpecValue;)V", "getValue", "()Lcom/truecaller/premium/data/component/spotlight/SpotlightFeatureSpecValue;", "type", "Lcom/truecaller/premium/data/component/spotlight/SpotlightSubComponentType;", "getType", "()Lcom/truecaller/premium/data/component/spotlight/SpotlightSubComponentType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SpotlightSpec {
    public static final int $stable = 0;

    @bw.qux("sub_component_type")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String subComponentTypeAsString;

    @bw.qux("value")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.premium.data.component.spotlight.SpotlightFeatureSpecValue value;

    public SpotlightSpec(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull com.truecaller.premium.data.component.spotlight.SpotlightFeatureSpecValue spotlightFeatureSpecValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "subComponentTypeAsString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spotlightFeatureSpecValue, "value");
        this.subComponentTypeAsString = str;
        this.value = spotlightFeatureSpecValue;
    }

    /* renamed from: component1, reason: from getter */
    private final java.lang.String getSubComponentTypeAsString() {
        return this.subComponentTypeAsString;
    }

    public static /* synthetic */ com.truecaller.premium.data.component.spotlight.SpotlightSpec copy$default(com.truecaller.premium.data.component.spotlight.SpotlightSpec spotlightSpec, java.lang.String str, com.truecaller.premium.data.component.spotlight.SpotlightFeatureSpecValue spotlightFeatureSpecValue, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = spotlightSpec.subComponentTypeAsString;
        }
        if ((i & 2) != 0) {
            spotlightFeatureSpecValue = spotlightSpec.value;
        }
        return spotlightSpec.copy(str, spotlightFeatureSpecValue);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.premium.data.component.spotlight.SpotlightFeatureSpecValue getValue() {
        return this.value;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.data.component.spotlight.SpotlightSpec copy(@org.jetbrains.annotations.NotNull java.lang.String subComponentTypeAsString, @org.jetbrains.annotations.NotNull com.truecaller.premium.data.component.spotlight.SpotlightFeatureSpecValue value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subComponentTypeAsString, "subComponentTypeAsString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        return new com.truecaller.premium.data.component.spotlight.SpotlightSpec(subComponentTypeAsString, value);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.data.component.spotlight.SpotlightSpec)) {
            return false;
        }
        com.truecaller.premium.data.component.spotlight.SpotlightSpec spotlightSpec = (com.truecaller.premium.data.component.spotlight.SpotlightSpec) other;
        return kotlin.jvm.internal.Intrinsics.b(this.subComponentTypeAsString, spotlightSpec.subComponentTypeAsString) && kotlin.jvm.internal.Intrinsics.b(this.value, spotlightSpec.value);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType getType() {
        com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType spotlightSubComponentType;
        com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType[] values = com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                spotlightSubComponentType = values[i];
                if (kotlin.text.y.p(spotlightSubComponentType.getStringValue(), this.subComponentTypeAsString, true)) {
                    break;
                }
                i++;
            } else {
                spotlightSubComponentType = null;
                break;
            }
        }
        if (spotlightSubComponentType == null) {
            return com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType.UNKNOWN;
        }
        return spotlightSubComponentType;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.data.component.spotlight.SpotlightFeatureSpecValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.subComponentTypeAsString.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "SpotlightSpec(subComponentTypeAsString=" + this.subComponentTypeAsString + ", value=" + this.value + ")";
    }
}
