package com.truecaller.insights.models.classifierseed;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/truecaller/insights/models/classifierseed/Meta;", "", "message", "", "status", "traceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getStatus", "getTraceId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class Meta {

    @bw.qux("message")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;

    @bw.qux("status")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String status;

    @bw.qux("traceId")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String traceId;

    public Meta(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "status");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "traceId");
        this.message = str;
        this.status = str2;
        this.traceId = str3;
    }

    public static /* synthetic */ com.truecaller.insights.models.classifierseed.Meta copy$default(com.truecaller.insights.models.classifierseed.Meta meta, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = meta.message;
        }
        if ((i & 2) != 0) {
            str2 = meta.status;
        }
        if ((i & 4) != 0) {
            str3 = meta.traceId;
        }
        return meta.copy(str, str2, str3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getStatus() {
        return this.status;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTraceId() {
        return this.traceId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.classifierseed.Meta copy(@org.jetbrains.annotations.NotNull java.lang.String message, @org.jetbrains.annotations.NotNull java.lang.String status, @org.jetbrains.annotations.NotNull java.lang.String traceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceId, "traceId");
        return new com.truecaller.insights.models.classifierseed.Meta(message, status, traceId);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.models.classifierseed.Meta)) {
            return false;
        }
        com.truecaller.insights.models.classifierseed.Meta meta = (com.truecaller.insights.models.classifierseed.Meta) other;
        return kotlin.jvm.internal.Intrinsics.b(this.message, meta.message) && kotlin.jvm.internal.Intrinsics.b(this.status, meta.status) && kotlin.jvm.internal.Intrinsics.b(this.traceId, meta.traceId);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStatus() {
        return this.status;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        return this.traceId.hashCode() + ax1.bar.e(this.message.hashCode() * 31, 31, this.status);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.traceId, ")", ro0.f.E("Meta(message=", this.message, ", status=", this.status, ", traceId="));
    }
}
