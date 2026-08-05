package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/ads/vast/Extension;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "", "adVerifications", "Lcom/truecaller/ads/vast/AdVerifications;", "<init>", "(Ljava/lang/String;Lcom/truecaller/ads/vast/AdVerifications;)V", "getType", "()Ljava/lang/String;", "getAdVerifications", "()Lcom/truecaller/ads/vast/AdVerifications;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Extension {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.vast.AdVerifications adVerifications;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String type;

    /* JADX WARN: Multi-variable type inference failed */
    public Extension() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.truecaller.ads.vast.Extension copy$default(com.truecaller.ads.vast.Extension extension, java.lang.String str, com.truecaller.ads.vast.AdVerifications adVerifications, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = extension.type;
        }
        if ((i & 2) != 0) {
            adVerifications = extension.adVerifications;
        }
        return extension.copy(str, adVerifications);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.ads.vast.AdVerifications getAdVerifications() {
        return this.adVerifications;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.Extension copy(@hl.qux(isAttribute = true) @org.jetbrains.annotations.Nullable java.lang.String type, @ak.f0("AdVerifications") @org.jetbrains.annotations.Nullable com.truecaller.ads.vast.AdVerifications adVerifications) {
        return new com.truecaller.ads.vast.Extension(type, adVerifications);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.vast.Extension)) {
            return false;
        }
        com.truecaller.ads.vast.Extension extension = (com.truecaller.ads.vast.Extension) other;
        return kotlin.jvm.internal.Intrinsics.b(this.type, extension.type) && kotlin.jvm.internal.Intrinsics.b(this.adVerifications, extension.adVerifications);
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.vast.AdVerifications getAdVerifications() {
        return this.adVerifications;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getType() {
        return this.type;
    }

    public int hashCode() {
        java.lang.String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        com.truecaller.ads.vast.AdVerifications adVerifications = this.adVerifications;
        return hashCode + (adVerifications != null ? adVerifications.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "Extension(type=" + this.type + ", adVerifications=" + this.adVerifications + ")";
    }

    public Extension(@hl.qux(isAttribute = true) @org.jetbrains.annotations.Nullable java.lang.String str, @ak.f0("AdVerifications") @org.jetbrains.annotations.Nullable com.truecaller.ads.vast.AdVerifications adVerifications) {
        this.type = str;
        this.adVerifications = adVerifications;
    }

    public /* synthetic */ Extension(java.lang.String str, com.truecaller.ads.vast.AdVerifications adVerifications, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : adVerifications);
    }
}
