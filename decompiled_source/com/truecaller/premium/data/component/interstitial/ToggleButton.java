package com.truecaller.premium.data.component.interstitial;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/truecaller/premium/data/component/interstitial/ToggleButton;", "", "showToggle", "", "toggleActiveTitle", "", "toggleInactiveTitle", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getShowToggle", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getToggleActiveTitle", "()Ljava/lang/String;", "getToggleInactiveTitle", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/truecaller/premium/data/component/interstitial/ToggleButton;", "equals", "other", "hashCode", "", "toString", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ToggleButton {
    public static final int $stable = 0;

    @bw.qux("show_toggle")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean showToggle;

    @bw.qux("toggle_active_title")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String toggleActiveTitle;

    @bw.qux("toggle_inactive_title")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String toggleInactiveTitle;

    public ToggleButton(@org.jetbrains.annotations.Nullable java.lang.Boolean bool, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        this.showToggle = bool;
        this.toggleActiveTitle = str;
        this.toggleInactiveTitle = str2;
    }

    public static /* synthetic */ com.truecaller.premium.data.component.interstitial.ToggleButton copy$default(com.truecaller.premium.data.component.interstitial.ToggleButton toggleButton, java.lang.Boolean bool, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = toggleButton.showToggle;
        }
        if ((i & 2) != 0) {
            str = toggleButton.toggleActiveTitle;
        }
        if ((i & 4) != 0) {
            str2 = toggleButton.toggleInactiveTitle;
        }
        return toggleButton.copy(bool, str, str2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.Boolean getShowToggle() {
        return this.showToggle;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getToggleActiveTitle() {
        return this.toggleActiveTitle;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getToggleInactiveTitle() {
        return this.toggleInactiveTitle;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.data.component.interstitial.ToggleButton copy(@org.jetbrains.annotations.Nullable java.lang.Boolean showToggle, @org.jetbrains.annotations.Nullable java.lang.String toggleActiveTitle, @org.jetbrains.annotations.Nullable java.lang.String toggleInactiveTitle) {
        return new com.truecaller.premium.data.component.interstitial.ToggleButton(showToggle, toggleActiveTitle, toggleInactiveTitle);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.data.component.interstitial.ToggleButton)) {
            return false;
        }
        com.truecaller.premium.data.component.interstitial.ToggleButton toggleButton = (com.truecaller.premium.data.component.interstitial.ToggleButton) other;
        return kotlin.jvm.internal.Intrinsics.b(this.showToggle, toggleButton.showToggle) && kotlin.jvm.internal.Intrinsics.b(this.toggleActiveTitle, toggleButton.toggleActiveTitle) && kotlin.jvm.internal.Intrinsics.b(this.toggleInactiveTitle, toggleButton.toggleInactiveTitle);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getShowToggle() {
        return this.showToggle;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getToggleActiveTitle() {
        return this.toggleActiveTitle;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getToggleInactiveTitle() {
        return this.toggleInactiveTitle;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.showToggle;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        java.lang.String str = this.toggleActiveTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.toggleInactiveTitle;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.Boolean bool = this.showToggle;
        java.lang.String str = this.toggleActiveTitle;
        java.lang.String str2 = this.toggleInactiveTitle;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ToggleButton(showToggle=");
        sb.append(bool);
        sb.append(", toggleActiveTitle=");
        sb.append(str);
        sb.append(", toggleInactiveTitle=");
        return bar.v(str2, ")", sb);
    }
}
