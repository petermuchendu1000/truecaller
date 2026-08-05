package com.truecaller.insights.database.entities.pdo;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/insights/database/entities/pdo/MessageParserCategoryHolder;", "", "messageId", "", "parserCategory", "", "<init>", "(JLjava/lang/String;)V", "getMessageId", "()J", "getParserCategory", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class MessageParserCategoryHolder {

    @bw.qux("messageID")
    private final long messageId;

    @bw.qux("d")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String parserCategory;

    public MessageParserCategoryHolder(long j, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "parserCategory");
        this.messageId = j;
        this.parserCategory = str;
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.pdo.MessageParserCategoryHolder copy$default(com.truecaller.insights.database.entities.pdo.MessageParserCategoryHolder messageParserCategoryHolder, long j, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = messageParserCategoryHolder.messageId;
        }
        if ((i & 2) != 0) {
            str = messageParserCategoryHolder.parserCategory;
        }
        return messageParserCategoryHolder.copy(j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getParserCategory() {
        return this.parserCategory;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.pdo.MessageParserCategoryHolder copy(long messageId, @org.jetbrains.annotations.NotNull java.lang.String parserCategory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parserCategory, "parserCategory");
        return new com.truecaller.insights.database.entities.pdo.MessageParserCategoryHolder(messageId, parserCategory);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.pdo.MessageParserCategoryHolder)) {
            return false;
        }
        com.truecaller.insights.database.entities.pdo.MessageParserCategoryHolder messageParserCategoryHolder = (com.truecaller.insights.database.entities.pdo.MessageParserCategoryHolder) other;
        return this.messageId == messageParserCategoryHolder.messageId && kotlin.jvm.internal.Intrinsics.b(this.parserCategory, messageParserCategoryHolder.parserCategory);
    }

    public final long getMessageId() {
        return this.messageId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getParserCategory() {
        return this.parserCategory;
    }

    public int hashCode() {
        long j = this.messageId;
        return this.parserCategory.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("MessageParserCategoryHolder(messageId=", this.messageId, ", parserCategory=", this.parserCategory);
        p.append(")");
        return p.toString();
    }
}
