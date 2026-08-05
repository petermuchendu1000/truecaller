package com.truecaller.premium.data.component;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/premium/data/component/InterstitialComponent;", "", "Lcom/truecaller/premium/data/component/interstitial/InterstitialSpec;", "", "componentType", "", "specs", "", "isPremium", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "Ljava/lang/String;", "getComponentType", "()Ljava/lang/String;", "Ljava/util/List;", "getSpecs", "()Ljava/util/List;", "Z", "()Z", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InterstitialComponent {
    public static final int $stable = 8;

    @bw.qux("component_type")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String componentType;

    @bw.qux("is_premium")
    private final boolean isPremium;

    @bw.qux("value")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.premium.data.component.interstitial.InterstitialSpec> specs;

    public InterstitialComponent(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.premium.data.component.interstitial.InterstitialSpec> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "componentType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "specs");
        this.componentType = str;
        this.specs = list;
        this.isPremium = z;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getComponentType() {
        return this.componentType;
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<com.truecaller.premium.data.component.interstitial.InterstitialSpec> getSpecs() {
        return this.specs;
    }

    /* renamed from: isPremium, reason: from getter */
    public final boolean getIsPremium() {
        return this.isPremium;
    }
}
