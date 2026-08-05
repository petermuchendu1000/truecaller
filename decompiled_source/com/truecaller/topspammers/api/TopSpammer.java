package com.truecaller.topspammers.api;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0000H\u0096\u0002J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011JP\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010\u0017\u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011¨\u0006$"}, d2 = {"Lcom/truecaller/topspammers/api/TopSpammer;", "", "value", "", "label", "reports", "", "categories", "", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V", "getValue", "()Ljava/lang/String;", "getLabel", "getReports", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCategories", "()Ljava/util/List;", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.versionMethodName, "compareTo", "other", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)Lcom/truecaller/topspammers/api/TopSpammer;", "equals", "", "", "hashCode", "toString", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class TopSpammer implements java.lang.Comparable<com.truecaller.topspammers.api.TopSpammer> {

    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.Long> categories;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String label;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer reports;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String value;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer version;

    public TopSpammer() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ com.truecaller.topspammers.api.TopSpammer copy$default(com.truecaller.topspammers.api.TopSpammer topSpammer, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.util.List list, java.lang.Integer num2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = topSpammer.value;
        }
        if ((i & 2) != 0) {
            str2 = topSpammer.label;
        }
        if ((i & 4) != 0) {
            num = topSpammer.reports;
        }
        if ((i & 8) != 0) {
            list = topSpammer.categories;
        }
        if ((i & 16) != 0) {
            num2 = topSpammer.version;
        }
        java.lang.Integer num3 = num2;
        java.lang.Integer num4 = num;
        return topSpammer.copy(str, str2, num4, list, num3);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getReports() {
        return this.reports;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.Long> component4() {
        return this.categories;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final java.lang.Integer getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.topspammers.api.TopSpammer copy(@org.jetbrains.annotations.Nullable java.lang.String value, @org.jetbrains.annotations.Nullable java.lang.String label, @org.jetbrains.annotations.Nullable java.lang.Integer reports, @org.jetbrains.annotations.Nullable java.util.List<java.lang.Long> categories, @org.jetbrains.annotations.Nullable java.lang.Integer version) {
        return new com.truecaller.topspammers.api.TopSpammer(value, label, reports, categories, version);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.topspammers.api.TopSpammer)) {
            return false;
        }
        com.truecaller.topspammers.api.TopSpammer topSpammer = (com.truecaller.topspammers.api.TopSpammer) other;
        return kotlin.jvm.internal.Intrinsics.b(this.value, topSpammer.value) && kotlin.jvm.internal.Intrinsics.b(this.label, topSpammer.label) && kotlin.jvm.internal.Intrinsics.b(this.reports, topSpammer.reports) && kotlin.jvm.internal.Intrinsics.b(this.categories, topSpammer.categories) && kotlin.jvm.internal.Intrinsics.b(this.version, topSpammer.version);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.Long> getCategories() {
        return this.categories;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLabel() {
        return this.label;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getReports() {
        return this.reports;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getValue() {
        return this.value;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        java.lang.String str = this.value;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.label;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.reports;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        java.util.List<java.lang.Long> list = this.categories;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        java.lang.Integer num2 = this.version;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.value;
        java.lang.String str2 = this.label;
        java.lang.Integer num = this.reports;
        java.util.List<java.lang.Long> list = this.categories;
        java.lang.Integer num2 = this.version;
        java.lang.StringBuilder E = ro0.f.E("TopSpammer(value=", str, ", label=", str2, ", reports=");
        E.append(num);
        E.append(", categories=");
        E.append(list);
        E.append(", version=");
        return com.appsflyer.internal.e.m(E, num2, ")");
    }

    public TopSpammer(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.Nullable java.util.List<java.lang.Long> list, @org.jetbrains.annotations.Nullable java.lang.Integer num2) {
        this.value = str;
        this.label = str2;
        this.reports = num;
        this.categories = list;
        this.version = num2;
    }

    @Override // java.lang.Comparable
    public int compareTo(@org.jetbrains.annotations.NotNull com.truecaller.topspammers.api.TopSpammer other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return u03.e0.F(this.value, other.value, false);
    }

    public /* synthetic */ TopSpammer(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.util.List list, java.lang.Integer num2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num2);
    }
}
