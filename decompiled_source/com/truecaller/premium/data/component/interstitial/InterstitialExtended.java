package com.truecaller.premium.data.component.interstitial;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/truecaller/premium/data/component/interstitial/InterstitialExtended;", "", "toggleButton", "Lcom/truecaller/premium/data/component/interstitial/ToggleButton;", "<init>", "(Lcom/truecaller/premium/data/component/interstitial/ToggleButton;)V", "getToggleButton", "()Lcom/truecaller/premium/data/component/interstitial/ToggleButton;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class InterstitialExtended {
    public static final int $stable = 0;

    @bw.qux("toggle_button")
    @org.jetbrains.annotations.Nullable
    private final com.truecaller.premium.data.component.interstitial.ToggleButton toggleButton;

    public InterstitialExtended(@org.jetbrains.annotations.Nullable com.truecaller.premium.data.component.interstitial.ToggleButton toggleButton) {
        this.toggleButton = toggleButton;
    }

    public static /* synthetic */ com.truecaller.premium.data.component.interstitial.InterstitialExtended copy$default(com.truecaller.premium.data.component.interstitial.InterstitialExtended interstitialExtended, com.truecaller.premium.data.component.interstitial.ToggleButton toggleButton, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            toggleButton = interstitialExtended.toggleButton;
        }
        return interstitialExtended.copy(toggleButton);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.premium.data.component.interstitial.ToggleButton getToggleButton() {
        return this.toggleButton;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.data.component.interstitial.InterstitialExtended copy(@org.jetbrains.annotations.Nullable com.truecaller.premium.data.component.interstitial.ToggleButton toggleButton) {
        return new com.truecaller.premium.data.component.interstitial.InterstitialExtended(toggleButton);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.premium.data.component.interstitial.InterstitialExtended) && kotlin.jvm.internal.Intrinsics.b(this.toggleButton, ((com.truecaller.premium.data.component.interstitial.InterstitialExtended) other).toggleButton);
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.premium.data.component.interstitial.ToggleButton getToggleButton() {
        return this.toggleButton;
    }

    public int hashCode() {
        com.truecaller.premium.data.component.interstitial.ToggleButton toggleButton = this.toggleButton;
        if (toggleButton == null) {
            return 0;
        }
        return toggleButton.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "InterstitialExtended(toggleButton=" + this.toggleButton + ")";
    }
}
