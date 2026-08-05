package com.truecaller.tcpermissions;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/truecaller/tcpermissions/RequiredPermissionsScreenConfigDto;", "", "image", "", "title", "subtitleType", "subtitleCopy", "CTA", "variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getTitle", "getSubtitleType", "getSubtitleCopy", "getCTA", "getVariant", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class RequiredPermissionsScreenConfigDto {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String CTA;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String image;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String subtitleCopy;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String subtitleType;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String title;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String variant;

    public RequiredPermissionsScreenConfigDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.NotNull java.lang.String str5, @org.jetbrains.annotations.NotNull java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "image");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "subtitleType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "CTA");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "variant");
        this.image = str;
        this.title = str2;
        this.subtitleType = str3;
        this.subtitleCopy = str4;
        this.CTA = str5;
        this.variant = str6;
    }

    public static /* synthetic */ com.truecaller.tcpermissions.RequiredPermissionsScreenConfigDto copy$default(com.truecaller.tcpermissions.RequiredPermissionsScreenConfigDto requiredPermissionsScreenConfigDto, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = requiredPermissionsScreenConfigDto.image;
        }
        if ((i & 2) != 0) {
            str2 = requiredPermissionsScreenConfigDto.title;
        }
        if ((i & 4) != 0) {
            str3 = requiredPermissionsScreenConfigDto.subtitleType;
        }
        if ((i & 8) != 0) {
            str4 = requiredPermissionsScreenConfigDto.subtitleCopy;
        }
        if ((i & 16) != 0) {
            str5 = requiredPermissionsScreenConfigDto.CTA;
        }
        if ((i & 32) != 0) {
            str6 = requiredPermissionsScreenConfigDto.variant;
        }
        java.lang.String str7 = str5;
        java.lang.String str8 = str6;
        return requiredPermissionsScreenConfigDto.copy(str, str2, str3, str4, str7, str8);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getImage() {
        return this.image;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSubtitleType() {
        return this.subtitleType;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSubtitleCopy() {
        return this.subtitleCopy;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCTA() {
        return this.CTA;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getVariant() {
        return this.variant;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.tcpermissions.RequiredPermissionsScreenConfigDto copy(@org.jetbrains.annotations.NotNull java.lang.String image, @org.jetbrains.annotations.NotNull java.lang.String title, @org.jetbrains.annotations.NotNull java.lang.String subtitleType, @org.jetbrains.annotations.Nullable java.lang.String subtitleCopy, @org.jetbrains.annotations.NotNull java.lang.String CTA, @org.jetbrains.annotations.NotNull java.lang.String variant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "image");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitleType, "subtitleType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(CTA, "CTA");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "variant");
        return new com.truecaller.tcpermissions.RequiredPermissionsScreenConfigDto(image, title, subtitleType, subtitleCopy, CTA, variant);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.tcpermissions.RequiredPermissionsScreenConfigDto)) {
            return false;
        }
        com.truecaller.tcpermissions.RequiredPermissionsScreenConfigDto requiredPermissionsScreenConfigDto = (com.truecaller.tcpermissions.RequiredPermissionsScreenConfigDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.image, requiredPermissionsScreenConfigDto.image) && kotlin.jvm.internal.Intrinsics.b(this.title, requiredPermissionsScreenConfigDto.title) && kotlin.jvm.internal.Intrinsics.b(this.subtitleType, requiredPermissionsScreenConfigDto.subtitleType) && kotlin.jvm.internal.Intrinsics.b(this.subtitleCopy, requiredPermissionsScreenConfigDto.subtitleCopy) && kotlin.jvm.internal.Intrinsics.b(this.CTA, requiredPermissionsScreenConfigDto.CTA) && kotlin.jvm.internal.Intrinsics.b(this.variant, requiredPermissionsScreenConfigDto.variant);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCTA() {
        return this.CTA;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImage() {
        return this.image;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSubtitleCopy() {
        return this.subtitleCopy;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSubtitleType() {
        return this.subtitleType;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(ax1.bar.e(this.image.hashCode() * 31, 31, this.title), 31, this.subtitleType);
        java.lang.String str = this.subtitleCopy;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.variant.hashCode() + ax1.bar.e((e + hashCode) * 31, 31, this.CTA);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.image;
        java.lang.String str2 = this.title;
        java.lang.String str3 = this.subtitleType;
        java.lang.String str4 = this.subtitleCopy;
        java.lang.String str5 = this.CTA;
        java.lang.String str6 = this.variant;
        java.lang.StringBuilder E = ro0.f.E("RequiredPermissionsScreenConfigDto(image=", str, ", title=", str2, ", subtitleType=");
        bar.E(E, str3, ", subtitleCopy=", str4, ", CTA=");
        return bar.x(E, str5, ", variant=", str6, ")");
    }
}
