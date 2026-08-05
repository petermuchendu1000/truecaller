package com.truecaller.insights.database.entities.pdo;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006&"}, d2 = {"Lcom/truecaller/insights/database/entities/pdo/TokenMetaDataObject;", "", "messageId", "", "conversationId", "sender", "", "category", "tokenMetadata", "createdAt", "Ljava/util/Date;", "updatedAt", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "getMessageId", "()J", "getConversationId", "getSender", "()Ljava/lang/String;", "getCategory", "getTokenMetadata", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class TokenMetaDataObject {

    @bw.qux("category")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String category;

    @bw.qux("conversation_id")
    private final long conversationId;

    @bw.qux("created_at")
    @org.jetbrains.annotations.NotNull
    private final java.util.Date createdAt;

    @bw.qux("message_id")
    private final long messageId;

    @bw.qux("sender")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String sender;

    @bw.qux("token_metadata")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String tokenMetadata;

    @bw.qux("last_updated_at")
    @org.jetbrains.annotations.NotNull
    private final java.util.Date updatedAt;

    public TokenMetaDataObject() {
        this(0L, 0L, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.pdo.TokenMetaDataObject copy$default(com.truecaller.insights.database.entities.pdo.TokenMetaDataObject tokenMetaDataObject, long j, long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Date date, java.util.Date date2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = tokenMetaDataObject.messageId;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = tokenMetaDataObject.conversationId;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = tokenMetaDataObject.sender;
        }
        return tokenMetaDataObject.copy(j3, j4, str, (i & 8) != 0 ? tokenMetaDataObject.category : str2, (i & 16) != 0 ? tokenMetaDataObject.tokenMetadata : str3, (i & 32) != 0 ? tokenMetaDataObject.createdAt : date, (i & 64) != 0 ? tokenMetaDataObject.updatedAt : date2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getConversationId() {
        return this.conversationId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSender() {
        return this.sender;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCategory() {
        return this.category;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getTokenMetadata() {
        return this.tokenMetadata;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component7, reason: from getter */
    public final java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.pdo.TokenMetaDataObject copy(long messageId, long conversationId, @org.jetbrains.annotations.NotNull java.lang.String sender, @org.jetbrains.annotations.NotNull java.lang.String category, @org.jetbrains.annotations.Nullable java.lang.String tokenMetadata, @org.jetbrains.annotations.NotNull java.util.Date createdAt, @org.jetbrains.annotations.NotNull java.util.Date updatedAt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sender, "sender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "category");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new com.truecaller.insights.database.entities.pdo.TokenMetaDataObject(messageId, conversationId, sender, category, tokenMetadata, createdAt, updatedAt);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.pdo.TokenMetaDataObject)) {
            return false;
        }
        com.truecaller.insights.database.entities.pdo.TokenMetaDataObject tokenMetaDataObject = (com.truecaller.insights.database.entities.pdo.TokenMetaDataObject) other;
        return this.messageId == tokenMetaDataObject.messageId && this.conversationId == tokenMetaDataObject.conversationId && kotlin.jvm.internal.Intrinsics.b(this.sender, tokenMetaDataObject.sender) && kotlin.jvm.internal.Intrinsics.b(this.category, tokenMetaDataObject.category) && kotlin.jvm.internal.Intrinsics.b(this.tokenMetadata, tokenMetaDataObject.tokenMetadata) && kotlin.jvm.internal.Intrinsics.b(this.createdAt, tokenMetaDataObject.createdAt) && kotlin.jvm.internal.Intrinsics.b(this.updatedAt, tokenMetaDataObject.updatedAt);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategory() {
        return this.category;
    }

    public final long getConversationId() {
        return this.conversationId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSender() {
        return this.sender;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTokenMetadata() {
        return this.tokenMetadata;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode;
        long j = this.messageId;
        long j2 = this.conversationId;
        int e = ax1.bar.e(ax1.bar.e(((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.sender), 31, this.category);
        java.lang.String str = this.tokenMetadata;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.updatedAt.hashCode() + uf.qux.h(this.createdAt, (e + hashCode) * 31, 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.messageId;
        long j2 = this.conversationId;
        java.lang.String str = this.sender;
        java.lang.String str2 = this.category;
        java.lang.String str3 = this.tokenMetadata;
        java.util.Date date = this.createdAt;
        java.util.Date date2 = this.updatedAt;
        java.lang.StringBuilder T = h0.b.T(j, "TokenMetaDataObject(messageId=", ", conversationId=");
        ro0.f.K(T, j2, ", sender=", str);
        bar.E(T, ", category=", str2, ", tokenMetadata=", str3);
        T.append(", createdAt=");
        T.append(date);
        T.append(", updatedAt=");
        T.append(date2);
        T.append(")");
        return T.toString();
    }

    public TokenMetaDataObject(long j, long j2, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.NotNull java.util.Date date, @org.jetbrains.annotations.NotNull java.util.Date date2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "sender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "category");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "createdAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date2, "updatedAt");
        this.messageId = j;
        this.conversationId = j2;
        this.sender = str;
        this.category = str2;
        this.tokenMetadata = str3;
        this.createdAt = date;
        this.updatedAt = date2;
    }

    public /* synthetic */ TokenMetaDataObject(long j, long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Date date, java.util.Date date2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? -1L : j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "Skip" : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? new java.util.Date() : date, (i & 64) != 0 ? new java.util.Date() : date2);
    }
}
