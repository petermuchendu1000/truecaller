package com.truecaller.premium.data.component.interstitial;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/premium/data/component/interstitial/InterstitialFeatureSpec;", "", "typeAsString", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "type", "Lcom/truecaller/premium/data/component/interstitial/InterstitialFeatureType;", "getType", "()Lcom/truecaller/premium/data/component/interstitial/InterstitialFeatureType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class InterstitialFeatureSpec {
    public static final int $stable = 0;

    @bw.qux("text")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String text;

    @bw.qux("type")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String typeAsString;

    public InterstitialFeatureSpec(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        this.typeAsString = str;
        this.text = str2;
    }

    /* renamed from: component1, reason: from getter */
    private final java.lang.String getTypeAsString() {
        return this.typeAsString;
    }

    public static /* synthetic */ com.truecaller.premium.data.component.interstitial.InterstitialFeatureSpec copy$default(com.truecaller.premium.data.component.interstitial.InterstitialFeatureSpec interstitialFeatureSpec, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = interstitialFeatureSpec.typeAsString;
        }
        if ((i & 2) != 0) {
            str2 = interstitialFeatureSpec.text;
        }
        return interstitialFeatureSpec.copy(str, str2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.data.component.interstitial.InterstitialFeatureSpec copy(@org.jetbrains.annotations.Nullable java.lang.String typeAsString, @org.jetbrains.annotations.Nullable java.lang.String text) {
        return new com.truecaller.premium.data.component.interstitial.InterstitialFeatureSpec(typeAsString, text);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.data.component.interstitial.InterstitialFeatureSpec)) {
            return false;
        }
        com.truecaller.premium.data.component.interstitial.InterstitialFeatureSpec interstitialFeatureSpec = (com.truecaller.premium.data.component.interstitial.InterstitialFeatureSpec) other;
        return kotlin.jvm.internal.Intrinsics.b(this.typeAsString, interstitialFeatureSpec.typeAsString) && kotlin.jvm.internal.Intrinsics.b(this.text, interstitialFeatureSpec.text);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.premium.data.component.interstitial.InterstitialFeatureType getType() {
        for (com.truecaller.premium.data.component.interstitial.InterstitialFeatureType interstitialFeatureType : com.truecaller.premium.data.component.interstitial.InterstitialFeatureType.values()) {
            if (kotlin.jvm.internal.Intrinsics.b(interstitialFeatureType.getStringValue(), this.typeAsString)) {
                return interstitialFeatureType;
            }
        }
        return null;
    }

    public int hashCode() {
        java.lang.String str = this.typeAsString;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.text;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("InterstitialFeatureSpec(typeAsString=", this.typeAsString, ", text=", this.text, ")");
    }
}
