package com.truecaller.insights.models.categorizerseed;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/truecaller/insights/models/categorizerseed/Data;", "", "appVersion", "", "minSupportedVersion", "modelVersion", "", "vectors", "Lcom/truecaller/insights/models/categorizerseed/Vectors;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/truecaller/insights/models/categorizerseed/Vectors;)V", "getAppVersion", "()Ljava/lang/String;", "getMinSupportedVersion", "getModelVersion", "()I", "getVectors", "()Lcom/truecaller/insights/models/categorizerseed/Vectors;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class Data {

    @bw.qux("appVersion")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String appVersion;

    @bw.qux("minSupportedVersion")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String minSupportedVersion;

    @bw.qux("modelVersion")
    private final int modelVersion;

    @bw.qux("vectors")
    @org.jetbrains.annotations.Nullable
    private final com.truecaller.insights.models.categorizerseed.Vectors vectors;

    public Data(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, int i, @org.jetbrains.annotations.Nullable com.truecaller.insights.models.categorizerseed.Vectors vectors) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "appVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "minSupportedVersion");
        this.appVersion = str;
        this.minSupportedVersion = str2;
        this.modelVersion = i;
        this.vectors = vectors;
    }

    public static /* synthetic */ com.truecaller.insights.models.categorizerseed.Data copy$default(com.truecaller.insights.models.categorizerseed.Data data, java.lang.String str, java.lang.String str2, int i, com.truecaller.insights.models.categorizerseed.Vectors vectors, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = data.appVersion;
        }
        if ((i2 & 2) != 0) {
            str2 = data.minSupportedVersion;
        }
        if ((i2 & 4) != 0) {
            i = data.modelVersion;
        }
        if ((i2 & 8) != 0) {
            vectors = data.vectors;
        }
        return data.copy(str, str2, i, vectors);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMinSupportedVersion() {
        return this.minSupportedVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final int getModelVersion() {
        return this.modelVersion;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final com.truecaller.insights.models.categorizerseed.Vectors getVectors() {
        return this.vectors;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.categorizerseed.Data copy(@org.jetbrains.annotations.NotNull java.lang.String appVersion, @org.jetbrains.annotations.NotNull java.lang.String minSupportedVersion, int modelVersion, @org.jetbrains.annotations.Nullable com.truecaller.insights.models.categorizerseed.Vectors vectors) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minSupportedVersion, "minSupportedVersion");
        return new com.truecaller.insights.models.categorizerseed.Data(appVersion, minSupportedVersion, modelVersion, vectors);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.models.categorizerseed.Data)) {
            return false;
        }
        com.truecaller.insights.models.categorizerseed.Data data = (com.truecaller.insights.models.categorizerseed.Data) other;
        return kotlin.jvm.internal.Intrinsics.b(this.appVersion, data.appVersion) && kotlin.jvm.internal.Intrinsics.b(this.minSupportedVersion, data.minSupportedVersion) && this.modelVersion == data.modelVersion && kotlin.jvm.internal.Intrinsics.b(this.vectors, data.vectors);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMinSupportedVersion() {
        return this.minSupportedVersion;
    }

    public final int getModelVersion() {
        return this.modelVersion;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.insights.models.categorizerseed.Vectors getVectors() {
        return this.vectors;
    }

    public int hashCode() {
        int hashCode;
        int e = (ax1.bar.e(this.appVersion.hashCode() * 31, 31, this.minSupportedVersion) + this.modelVersion) * 31;
        com.truecaller.insights.models.categorizerseed.Vectors vectors = this.vectors;
        if (vectors == null) {
            hashCode = 0;
        } else {
            hashCode = vectors.hashCode();
        }
        return e + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.appVersion;
        java.lang.String str2 = this.minSupportedVersion;
        int i = this.modelVersion;
        com.truecaller.insights.models.categorizerseed.Vectors vectors = this.vectors;
        java.lang.StringBuilder E = ro0.f.E("Data(appVersion=", str, ", minSupportedVersion=", str2, ", modelVersion=");
        E.append(i);
        E.append(", vectors=");
        E.append(vectors);
        E.append(")");
        return E.toString();
    }
}
