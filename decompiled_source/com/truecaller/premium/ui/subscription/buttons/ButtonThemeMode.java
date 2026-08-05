package com.truecaller.premium.ui.subscription.buttons;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006 "}, d2 = {"Lcom/truecaller/premium/ui/subscription/buttons/ButtonThemeMode;", "", "backgroundColor", "", "textTheme", "disclaimerTextTheme", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "getTextTheme", "setTextTheme", "getDisclaimerTextTheme", "setDisclaimerTextTheme", "textThemeResolved", "Lcom/truecaller/premium/ui/subscription/buttons/TextTheme;", "getTextThemeResolved", "()Lcom/truecaller/premium/ui/subscription/buttons/TextTheme;", "disclaimerThemeResolved", "getDisclaimerThemeResolved", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ButtonThemeMode {
    public static final int $stable = 8;

    @bw.qux("background_color")
    @org.jetbrains.annotations.Nullable
    private java.lang.String backgroundColor;

    @bw.qux("disclaimer_text_theme")
    @org.jetbrains.annotations.Nullable
    private java.lang.String disclaimerTextTheme;

    @bw.qux("text_theme")
    @org.jetbrains.annotations.Nullable
    private java.lang.String textTheme;

    public ButtonThemeMode(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3) {
        this.backgroundColor = str;
        this.textTheme = str2;
        this.disclaimerTextTheme = str3;
    }

    public static /* synthetic */ com.truecaller.premium.ui.subscription.buttons.ButtonThemeMode copy$default(com.truecaller.premium.ui.subscription.buttons.ButtonThemeMode buttonThemeMode, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = buttonThemeMode.backgroundColor;
        }
        if ((i & 2) != 0) {
            str2 = buttonThemeMode.textTheme;
        }
        if ((i & 4) != 0) {
            str3 = buttonThemeMode.disclaimerTextTheme;
        }
        return buttonThemeMode.copy(str, str2, str3);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getBackgroundColor() {
        return this.backgroundColor;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTextTheme() {
        return this.textTheme;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDisclaimerTextTheme() {
        return this.disclaimerTextTheme;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.ui.subscription.buttons.ButtonThemeMode copy(@org.jetbrains.annotations.Nullable java.lang.String backgroundColor, @org.jetbrains.annotations.Nullable java.lang.String textTheme, @org.jetbrains.annotations.Nullable java.lang.String disclaimerTextTheme) {
        return new com.truecaller.premium.ui.subscription.buttons.ButtonThemeMode(backgroundColor, textTheme, disclaimerTextTheme);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.ui.subscription.buttons.ButtonThemeMode)) {
            return false;
        }
        com.truecaller.premium.ui.subscription.buttons.ButtonThemeMode buttonThemeMode = (com.truecaller.premium.ui.subscription.buttons.ButtonThemeMode) other;
        return kotlin.jvm.internal.Intrinsics.b(this.backgroundColor, buttonThemeMode.backgroundColor) && kotlin.jvm.internal.Intrinsics.b(this.textTheme, buttonThemeMode.textTheme) && kotlin.jvm.internal.Intrinsics.b(this.disclaimerTextTheme, buttonThemeMode.disclaimerTextTheme);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBackgroundColor() {
        return this.backgroundColor;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDisclaimerTextTheme() {
        return this.disclaimerTextTheme;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.premium.ui.subscription.buttons.TextTheme getDisclaimerThemeResolved() {
        xe2.h0 h0Var = com.truecaller.premium.ui.subscription.buttons.TextTheme.Companion;
        java.lang.String str = this.disclaimerTextTheme;
        h0Var.getClass();
        return xe2.h0.a(str);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTextTheme() {
        return this.textTheme;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.premium.ui.subscription.buttons.TextTheme getTextThemeResolved() {
        xe2.h0 h0Var = com.truecaller.premium.ui.subscription.buttons.TextTheme.Companion;
        java.lang.String str = this.textTheme;
        h0Var.getClass();
        return xe2.h0.a(str);
    }

    public int hashCode() {
        java.lang.String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.textTheme;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.disclaimerTextTheme;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setBackgroundColor(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.backgroundColor = str;
    }

    public final void setDisclaimerTextTheme(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.disclaimerTextTheme = str;
    }

    public final void setTextTheme(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.textTheme = str;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.disclaimerTextTheme, ")", ro0.f.E("ButtonThemeMode(backgroundColor=", this.backgroundColor, ", textTheme=", this.textTheme, ", disclaimerTextTheme="));
    }
}
