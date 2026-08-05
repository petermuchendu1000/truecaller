package com.truecaller.insights.core.senderinfo;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/truecaller/insights/core/senderinfo/SenderInfoData;", "", "name", "", "uiName", "icon", "symbol", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUiName", "getIcon", "getSymbol", "setSymbol", "(Ljava/lang/String;)V", "getCategory", "setCategory", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SenderInfoData {

    @org.jetbrains.annotations.NotNull
    private java.lang.String category;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String icon;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private java.lang.String symbol;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String uiName;

    public SenderInfoData(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.NotNull java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "icon");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "symbol");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "category");
        this.name = str;
        this.uiName = str2;
        this.icon = str3;
        this.symbol = str4;
        this.category = str5;
    }

    public static /* synthetic */ com.truecaller.insights.core.senderinfo.SenderInfoData copy$default(com.truecaller.insights.core.senderinfo.SenderInfoData senderInfoData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = senderInfoData.name;
        }
        if ((i & 2) != 0) {
            str2 = senderInfoData.uiName;
        }
        if ((i & 4) != 0) {
            str3 = senderInfoData.icon;
        }
        if ((i & 8) != 0) {
            str4 = senderInfoData.symbol;
        }
        if ((i & 16) != 0) {
            str5 = senderInfoData.category;
        }
        java.lang.String str6 = str5;
        java.lang.String str7 = str3;
        return senderInfoData.copy(str, str2, str7, str4, str6);
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

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.core.senderinfo.SenderInfoData copy(@org.jetbrains.annotations.NotNull java.lang.String name, @org.jetbrains.annotations.Nullable java.lang.String uiName, @org.jetbrains.annotations.NotNull java.lang.String icon, @org.jetbrains.annotations.NotNull java.lang.String symbol, @org.jetbrains.annotations.NotNull java.lang.String category) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "icon");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(symbol, "symbol");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "category");
        return new com.truecaller.insights.core.senderinfo.SenderInfoData(name, uiName, icon, symbol, category);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.core.senderinfo.SenderInfoData)) {
            return false;
        }
        com.truecaller.insights.core.senderinfo.SenderInfoData senderInfoData = (com.truecaller.insights.core.senderinfo.SenderInfoData) other;
        return kotlin.jvm.internal.Intrinsics.b(this.name, senderInfoData.name) && kotlin.jvm.internal.Intrinsics.b(this.uiName, senderInfoData.uiName) && kotlin.jvm.internal.Intrinsics.b(this.icon, senderInfoData.icon) && kotlin.jvm.internal.Intrinsics.b(this.symbol, senderInfoData.symbol) && kotlin.jvm.internal.Intrinsics.b(this.category, senderInfoData.category);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategory() {
        return this.category;
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
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.category.hashCode() + ax1.bar.e(ax1.bar.e((hashCode2 + hashCode) * 31, 31, this.icon), 31, this.symbol);
    }

    public final void setCategory(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.category = str;
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
        java.lang.StringBuilder E = ro0.f.E("SenderInfoData(name=", str, ", uiName=", str2, ", icon=");
        bar.E(E, str3, ", symbol=", str4, ", category=");
        return bar.v(str5, ")", E);
    }
}
