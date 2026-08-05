package com.truecaller.insights.database.entities.pdo;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/truecaller/insights/database/entities/pdo/SmsBackupMessage;", "", "messageId", "", "address", "", "message", "date", "Ljava/util/Date;", "conversationId", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/Date;J)V", "getMessageId", "()J", "getAddress", "()Ljava/lang/String;", "getMessage", "getDate", "()Ljava/util/Date;", "getConversationId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SmsBackupMessage {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String address;
    private final long conversationId;

    @org.jetbrains.annotations.NotNull
    private final java.util.Date date;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;
    private final long messageId;

    public SmsBackupMessage(long j, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.util.Date date, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "address");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        this.messageId = j;
        this.address = str;
        this.message = str2;
        this.date = date;
        this.conversationId = j2;
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.pdo.SmsBackupMessage copy$default(com.truecaller.insights.database.entities.pdo.SmsBackupMessage smsBackupMessage, long j, java.lang.String str, java.lang.String str2, java.util.Date date, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = smsBackupMessage.messageId;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = smsBackupMessage.address;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            str2 = smsBackupMessage.message;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            date = smsBackupMessage.date;
        }
        java.util.Date date2 = date;
        if ((i & 16) != 0) {
            j2 = smsBackupMessage.conversationId;
        }
        return smsBackupMessage.copy(j3, str3, str4, date2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAddress() {
        return this.address;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.util.Date getDate() {
        return this.date;
    }

    /* renamed from: component5, reason: from getter */
    public final long getConversationId() {
        return this.conversationId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.pdo.SmsBackupMessage copy(long messageId, @org.jetbrains.annotations.NotNull java.lang.String address, @org.jetbrains.annotations.NotNull java.lang.String message, @org.jetbrains.annotations.NotNull java.util.Date date, long conversationId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "address");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        return new com.truecaller.insights.database.entities.pdo.SmsBackupMessage(messageId, address, message, date, conversationId);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.pdo.SmsBackupMessage)) {
            return false;
        }
        com.truecaller.insights.database.entities.pdo.SmsBackupMessage smsBackupMessage = (com.truecaller.insights.database.entities.pdo.SmsBackupMessage) other;
        return this.messageId == smsBackupMessage.messageId && kotlin.jvm.internal.Intrinsics.b(this.address, smsBackupMessage.address) && kotlin.jvm.internal.Intrinsics.b(this.message, smsBackupMessage.message) && kotlin.jvm.internal.Intrinsics.b(this.date, smsBackupMessage.date) && this.conversationId == smsBackupMessage.conversationId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAddress() {
        return this.address;
    }

    public final long getConversationId() {
        return this.conversationId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDate() {
        return this.date;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        long j = this.messageId;
        int h = uf.qux.h(this.date, ax1.bar.e(ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.address), 31, this.message), 31);
        long j2 = this.conversationId;
        return h + ((int) ((j2 >>> 32) ^ j2));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.messageId;
        java.lang.String str = this.address;
        java.lang.String str2 = this.message;
        java.util.Date date = this.date;
        long j2 = this.conversationId;
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("SmsBackupMessage(messageId=", j, ", address=", str);
        p.append(", message=");
        p.append(str2);
        p.append(", date=");
        p.append(date);
        return d4.t.o(p, j2, ", conversationId=", ")");
    }
}
