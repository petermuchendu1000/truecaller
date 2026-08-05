package com.truecaller.insights.database.entities.senderfilter;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/truecaller/insights/database/entities/senderfilter/SenderFilterEntity;", "", "senderId", "", "rawSenderId", "senderName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSenderId", "()Ljava/lang/String;", "getRawSenderId", "getSenderName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SenderFilterEntity {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String rawSenderId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String senderId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String senderName;

    public SenderFilterEntity(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "senderId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "rawSenderId");
        this.senderId = str;
        this.rawSenderId = str2;
        this.senderName = str3;
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.senderfilter.SenderFilterEntity copy$default(com.truecaller.insights.database.entities.senderfilter.SenderFilterEntity senderFilterEntity, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = senderFilterEntity.senderId;
        }
        if ((i & 2) != 0) {
            str2 = senderFilterEntity.rawSenderId;
        }
        if ((i & 4) != 0) {
            str3 = senderFilterEntity.senderName;
        }
        return senderFilterEntity.copy(str, str2, str3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSenderId() {
        return this.senderId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRawSenderId() {
        return this.rawSenderId;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSenderName() {
        return this.senderName;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.senderfilter.SenderFilterEntity copy(@org.jetbrains.annotations.NotNull java.lang.String senderId, @org.jetbrains.annotations.NotNull java.lang.String rawSenderId, @org.jetbrains.annotations.Nullable java.lang.String senderName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderId, "senderId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawSenderId, "rawSenderId");
        return new com.truecaller.insights.database.entities.senderfilter.SenderFilterEntity(senderId, rawSenderId, senderName);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.senderfilter.SenderFilterEntity)) {
            return false;
        }
        com.truecaller.insights.database.entities.senderfilter.SenderFilterEntity senderFilterEntity = (com.truecaller.insights.database.entities.senderfilter.SenderFilterEntity) other;
        return kotlin.jvm.internal.Intrinsics.b(this.senderId, senderFilterEntity.senderId) && kotlin.jvm.internal.Intrinsics.b(this.rawSenderId, senderFilterEntity.rawSenderId) && kotlin.jvm.internal.Intrinsics.b(this.senderName, senderFilterEntity.senderName);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRawSenderId() {
        return this.rawSenderId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSenderId() {
        return this.senderId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSenderName() {
        return this.senderName;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(this.senderId.hashCode() * 31, 31, this.rawSenderId);
        java.lang.String str = this.senderName;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return e + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.senderName, ")", ro0.f.E("SenderFilterEntity(senderId=", this.senderId, ", rawSenderId=", this.rawSenderId, ", senderName="));
    }
}
