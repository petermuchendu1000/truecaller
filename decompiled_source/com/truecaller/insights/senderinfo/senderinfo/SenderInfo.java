package com.truecaller.insights.senderinfo.senderinfo;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006!"}, d2 = {"Lcom/truecaller/insights/senderinfo/senderinfo/SenderInfo;", "", "name", "", "uiName", "icon", "symbol", "category", "creditCardPaymentUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUiName", "getIcon", "getSymbol", "setSymbol", "(Ljava/lang/String;)V", "getCategory", "getCreditCardPaymentUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "senderinfo_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SenderInfo {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String category;

    @bw.qux("creditcard_bank_url")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String creditCardPaymentUrl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String icon;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private java.lang.String symbol;

    @bw.qux("ui_name")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String uiName;

    public SenderInfo(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.NotNull java.lang.String str5, @org.jetbrains.annotations.Nullable java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "icon");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "symbol");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "category");
        this.name = str;
        this.uiName = str2;
        this.icon = str3;
        this.symbol = str4;
        this.category = str5;
        this.creditCardPaymentUrl = str6;
    }

    public static /* synthetic */ com.truecaller.insights.senderinfo.senderinfo.SenderInfo copy$default(com.truecaller.insights.senderinfo.senderinfo.SenderInfo senderInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = senderInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = senderInfo.uiName;
        }
        if ((i & 4) != 0) {
            str3 = senderInfo.icon;
        }
        if ((i & 8) != 0) {
            str4 = senderInfo.symbol;
        }
        if ((i & 16) != 0) {
            str5 = senderInfo.category;
        }
        if ((i & 32) != 0) {
            str6 = senderInfo.creditCardPaymentUrl;
        }
        java.lang.String str7 = str5;
        java.lang.String str8 = str6;
        return senderInfo.copy(str, str2, str3, str4, str7, str8);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUiName() {
        return this.uiName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getIcon() {
        return this.icon;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSymbol() {
        return this.symbol;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCategory() {
        return this.category;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getCreditCardPaymentUrl() {
        return this.creditCardPaymentUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.senderinfo.senderinfo.SenderInfo copy(@org.jetbrains.annotations.NotNull java.lang.String name, @org.jetbrains.annotations.Nullable java.lang.String uiName, @org.jetbrains.annotations.NotNull java.lang.String icon, @org.jetbrains.annotations.NotNull java.lang.String symbol, @org.jetbrains.annotations.NotNull java.lang.String category, @org.jetbrains.annotations.Nullable java.lang.String creditCardPaymentUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "icon");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(symbol, "symbol");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "category");
        return new com.truecaller.insights.senderinfo.senderinfo.SenderInfo(name, uiName, icon, symbol, category, creditCardPaymentUrl);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.senderinfo.senderinfo.SenderInfo)) {
            return false;
        }
        com.truecaller.insights.senderinfo.senderinfo.SenderInfo senderInfo = (com.truecaller.insights.senderinfo.senderinfo.SenderInfo) other;
        return kotlin.jvm.internal.Intrinsics.b(this.name, senderInfo.name) && kotlin.jvm.internal.Intrinsics.b(this.uiName, senderInfo.uiName) && kotlin.jvm.internal.Intrinsics.b(this.icon, senderInfo.icon) && kotlin.jvm.internal.Intrinsics.b(this.symbol, senderInfo.symbol) && kotlin.jvm.internal.Intrinsics.b(this.category, senderInfo.category) && kotlin.jvm.internal.Intrinsics.b(this.creditCardPaymentUrl, senderInfo.creditCardPaymentUrl);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategory() {
        return this.category;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCreditCardPaymentUrl() {
        return this.creditCardPaymentUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIcon() {
        return this.icon;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSymbol() {
        return this.symbol;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUiName() {
        return this.uiName;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.name.hashCode() * 31;
        java.lang.String str = this.uiName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int e = ax1.bar.e(ax1.bar.e(ax1.bar.e((hashCode2 + hashCode) * 31, 31, this.icon), 31, this.symbol), 31, this.category);
        java.lang.String str2 = this.creditCardPaymentUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return e + i;
    }

    public final void setSymbol(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.symbol = str;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.uiName;
        java.lang.String str3 = this.icon;
        java.lang.String str4 = this.symbol;
        java.lang.String str5 = this.category;
        java.lang.String str6 = this.creditCardPaymentUrl;
        java.lang.StringBuilder E = ro0.f.E("SenderInfo(name=", str, ", uiName=", str2, ", icon=");
        bar.E(E, str3, ", symbol=", str4, ", category=");
        return bar.x(E, str5, ", creditCardPaymentUrl=", str6, ")");
    }
}
