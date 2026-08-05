package com.truecaller.searchwarnings.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JU\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/truecaller/searchwarnings/data/SearchWarningDTO;", "", "id", "", "header", "message", "backgroundColor", "foregroundColor", "iconUrl", "messageDisplayState", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getHeader", "getMessage", "getBackgroundColor", "getForegroundColor", "getIconUrl", "getMessageDisplayState", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "search-warnings_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class SearchWarningDTO {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String backgroundColor;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String foregroundColor;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String header;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String iconUrl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;
    private final int messageDisplayState;

    public SearchWarningDTO(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.String str5, @org.jetbrains.annotations.Nullable java.lang.String str6, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "header");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "message");
        this.id = str;
        this.header = str2;
        this.message = str3;
        this.backgroundColor = str4;
        this.foregroundColor = str5;
        this.iconUrl = str6;
        this.messageDisplayState = i;
    }

    public static /* synthetic */ com.truecaller.searchwarnings.data.SearchWarningDTO copy$default(com.truecaller.searchwarnings.data.SearchWarningDTO searchWarningDTO, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = searchWarningDTO.id;
        }
        if ((i2 & 2) != 0) {
            str2 = searchWarningDTO.header;
        }
        if ((i2 & 4) != 0) {
            str3 = searchWarningDTO.message;
        }
        if ((i2 & 8) != 0) {
            str4 = searchWarningDTO.backgroundColor;
        }
        if ((i2 & 16) != 0) {
            str5 = searchWarningDTO.foregroundColor;
        }
        if ((i2 & 32) != 0) {
            str6 = searchWarningDTO.iconUrl;
        }
        if ((i2 & 64) != 0) {
            i = searchWarningDTO.messageDisplayState;
        }
        java.lang.String str7 = str6;
        int i3 = i;
        java.lang.String str8 = str5;
        java.lang.String str9 = str3;
        return searchWarningDTO.copy(str, str2, str9, str4, str8, str7, i3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getHeader() {
        return this.header;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getBackgroundColor() {
        return this.backgroundColor;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getForegroundColor() {
        return this.foregroundColor;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMessageDisplayState() {
        return this.messageDisplayState;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.searchwarnings.data.SearchWarningDTO copy(@org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String header, @org.jetbrains.annotations.NotNull java.lang.String message, @org.jetbrains.annotations.Nullable java.lang.String backgroundColor, @org.jetbrains.annotations.Nullable java.lang.String foregroundColor, @org.jetbrains.annotations.Nullable java.lang.String iconUrl, int messageDisplayState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "header");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        return new com.truecaller.searchwarnings.data.SearchWarningDTO(id, header, message, backgroundColor, foregroundColor, iconUrl, messageDisplayState);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.searchwarnings.data.SearchWarningDTO)) {
            return false;
        }
        com.truecaller.searchwarnings.data.SearchWarningDTO searchWarningDTO = (com.truecaller.searchwarnings.data.SearchWarningDTO) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, searchWarningDTO.id) && kotlin.jvm.internal.Intrinsics.b(this.header, searchWarningDTO.header) && kotlin.jvm.internal.Intrinsics.b(this.message, searchWarningDTO.message) && kotlin.jvm.internal.Intrinsics.b(this.backgroundColor, searchWarningDTO.backgroundColor) && kotlin.jvm.internal.Intrinsics.b(this.foregroundColor, searchWarningDTO.foregroundColor) && kotlin.jvm.internal.Intrinsics.b(this.iconUrl, searchWarningDTO.iconUrl) && this.messageDisplayState == searchWarningDTO.messageDisplayState;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBackgroundColor() {
        return this.backgroundColor;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getForegroundColor() {
        return this.foregroundColor;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHeader() {
        return this.header;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIconUrl() {
        return this.iconUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }

    public final int getMessageDisplayState() {
        return this.messageDisplayState;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int e = ax1.bar.e(ax1.bar.e(this.id.hashCode() * 31, 31, this.header), 31, this.message);
        java.lang.String str = this.backgroundColor;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        java.lang.String str2 = this.foregroundColor;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        java.lang.String str3 = this.iconUrl;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((i3 + i) * 31) + this.messageDisplayState;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.header;
        java.lang.String str3 = this.message;
        java.lang.String str4 = this.backgroundColor;
        java.lang.String str5 = this.foregroundColor;
        java.lang.String str6 = this.iconUrl;
        int i = this.messageDisplayState;
        java.lang.StringBuilder E = ro0.f.E("SearchWarningDTO(id=", str, ", header=", str2, ", message=");
        bar.E(E, str3, ", backgroundColor=", str4, ", foregroundColor=");
        bar.E(E, str5, ", iconUrl=", str6, ", messageDisplayState=");
        return bar.m(i, ")", E);
    }
}
