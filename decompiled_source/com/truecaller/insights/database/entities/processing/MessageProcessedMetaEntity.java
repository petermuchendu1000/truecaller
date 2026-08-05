package com.truecaller.insights.database.entities.processing;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jr\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010#¨\u0006@"}, d2 = {"Lcom/truecaller/insights/database/entities/processing/MessageProcessedMetaEntity;", "", "", "messageId", "messageDate", "processedDate", "Lcom/truecaller/insights/database/entities/processing/ProcessedDuring;", "processedDuring", "Lqu1/e;", "resultMeta", "Lqu1/baz;", "categorizerMeta", "Lqu1/qux;", "parserMeta", "Lqu1/bar;", "llmPatternMatchedMeta", "Lqu1/f;", "senderRetrievedMeta", "<init>", "(JJJLcom/truecaller/insights/database/entities/processing/ProcessedDuring;Lqu1/e;Lqu1/baz;Lqu1/qux;Lqu1/bar;Lqu1/f;)V", "component1", "()J", "component2", "component3", "component4", "()Lcom/truecaller/insights/database/entities/processing/ProcessedDuring;", "component5", "()Lqu1/e;", "component6", "()Lqu1/baz;", "component7", "()Lqu1/qux;", "component8", "()Lqu1/bar;", "component9", "()Lqu1/f;", "copy", "(JJJLcom/truecaller/insights/database/entities/processing/ProcessedDuring;Lqu1/e;Lqu1/baz;Lqu1/qux;Lqu1/bar;Lqu1/f;)Lcom/truecaller/insights/database/entities/processing/MessageProcessedMetaEntity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getMessageId", "getMessageDate", "getProcessedDate", "Lcom/truecaller/insights/database/entities/processing/ProcessedDuring;", "getProcessedDuring", "Lqu1/e;", "getResultMeta", "Lqu1/baz;", "getCategorizerMeta", "Lqu1/qux;", "getParserMeta", "Lqu1/bar;", "getLlmPatternMatchedMeta", "Lqu1/f;", "getSenderRetrievedMeta", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class MessageProcessedMetaEntity {

    @org.jetbrains.annotations.Nullable
    private final qu1.baz categorizerMeta;

    @org.jetbrains.annotations.Nullable
    private final qu1.bar llmPatternMatchedMeta;
    private final long messageDate;
    private final long messageId;

    @org.jetbrains.annotations.Nullable
    private final qu1.qux parserMeta;
    private final long processedDate;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.insights.database.entities.processing.ProcessedDuring processedDuring;

    @org.jetbrains.annotations.NotNull
    private final qu1.e resultMeta;

    @org.jetbrains.annotations.Nullable
    private final qu1.f senderRetrievedMeta;

    public MessageProcessedMetaEntity(long j, long j2, long j3, @org.jetbrains.annotations.NotNull com.truecaller.insights.database.entities.processing.ProcessedDuring processedDuring, @org.jetbrains.annotations.NotNull qu1.e eVar, @org.jetbrains.annotations.Nullable qu1.baz bazVar, @org.jetbrains.annotations.Nullable qu1.qux quxVar, @org.jetbrains.annotations.Nullable qu1.bar barVar, @org.jetbrains.annotations.Nullable qu1.f fVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processedDuring, "processedDuring");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "resultMeta");
        this.messageId = j;
        this.messageDate = j2;
        this.processedDate = j3;
        this.processedDuring = processedDuring;
        this.resultMeta = eVar;
        this.categorizerMeta = bazVar;
        this.parserMeta = quxVar;
        this.llmPatternMatchedMeta = barVar;
        this.senderRetrievedMeta = fVar;
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.processing.MessageProcessedMetaEntity copy$default(com.truecaller.insights.database.entities.processing.MessageProcessedMetaEntity messageProcessedMetaEntity, long j, long j2, long j3, com.truecaller.insights.database.entities.processing.ProcessedDuring processedDuring, qu1.e eVar, qu1.baz bazVar, qu1.qux quxVar, qu1.bar barVar, qu1.f fVar, int i, java.lang.Object obj) {
        long j4;
        long j5;
        com.truecaller.insights.database.entities.processing.ProcessedDuring processedDuring2;
        qu1.e eVar2;
        qu1.baz bazVar2;
        qu1.qux quxVar2;
        qu1.bar barVar2;
        qu1.f fVar2;
        if ((i & 1) != 0) {
            j = messageProcessedMetaEntity.messageId;
        }
        long j6 = j;
        if ((i & 2) != 0) {
            j4 = messageProcessedMetaEntity.messageDate;
        } else {
            j4 = j2;
        }
        if ((i & 4) != 0) {
            j5 = messageProcessedMetaEntity.processedDate;
        } else {
            j5 = j3;
        }
        if ((i & 8) != 0) {
            processedDuring2 = messageProcessedMetaEntity.processedDuring;
        } else {
            processedDuring2 = processedDuring;
        }
        if ((i & 16) != 0) {
            eVar2 = messageProcessedMetaEntity.resultMeta;
        } else {
            eVar2 = eVar;
        }
        if ((i & 32) != 0) {
            bazVar2 = messageProcessedMetaEntity.categorizerMeta;
        } else {
            bazVar2 = bazVar;
        }
        if ((i & 64) != 0) {
            quxVar2 = messageProcessedMetaEntity.parserMeta;
        } else {
            quxVar2 = quxVar;
        }
        if ((i & 128) != 0) {
            barVar2 = messageProcessedMetaEntity.llmPatternMatchedMeta;
        } else {
            barVar2 = barVar;
        }
        if ((i & 256) != 0) {
            fVar2 = messageProcessedMetaEntity.senderRetrievedMeta;
        } else {
            fVar2 = fVar;
        }
        return messageProcessedMetaEntity.copy(j6, j4, j5, processedDuring2, eVar2, bazVar2, quxVar2, barVar2, fVar2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMessageDate() {
        return this.messageDate;
    }

    /* renamed from: component3, reason: from getter */
    public final long getProcessedDate() {
        return this.processedDate;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final com.truecaller.insights.database.entities.processing.ProcessedDuring getProcessedDuring() {
        return this.processedDuring;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final qu1.e getResultMeta() {
        return this.resultMeta;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component6, reason: from getter */
    public final qu1.baz getCategorizerMeta() {
        return this.categorizerMeta;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component7, reason: from getter */
    public final qu1.qux getParserMeta() {
        return this.parserMeta;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component8, reason: from getter */
    public final qu1.bar getLlmPatternMatchedMeta() {
        return this.llmPatternMatchedMeta;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component9, reason: from getter */
    public final qu1.f getSenderRetrievedMeta() {
        return this.senderRetrievedMeta;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.processing.MessageProcessedMetaEntity copy(long messageId, long messageDate, long processedDate, @org.jetbrains.annotations.NotNull com.truecaller.insights.database.entities.processing.ProcessedDuring processedDuring, @org.jetbrains.annotations.NotNull qu1.e resultMeta, @org.jetbrains.annotations.Nullable qu1.baz categorizerMeta, @org.jetbrains.annotations.Nullable qu1.qux parserMeta, @org.jetbrains.annotations.Nullable qu1.bar llmPatternMatchedMeta, @org.jetbrains.annotations.Nullable qu1.f senderRetrievedMeta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processedDuring, "processedDuring");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultMeta, "resultMeta");
        return new com.truecaller.insights.database.entities.processing.MessageProcessedMetaEntity(messageId, messageDate, processedDate, processedDuring, resultMeta, categorizerMeta, parserMeta, llmPatternMatchedMeta, senderRetrievedMeta);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.processing.MessageProcessedMetaEntity)) {
            return false;
        }
        com.truecaller.insights.database.entities.processing.MessageProcessedMetaEntity messageProcessedMetaEntity = (com.truecaller.insights.database.entities.processing.MessageProcessedMetaEntity) other;
        return this.messageId == messageProcessedMetaEntity.messageId && this.messageDate == messageProcessedMetaEntity.messageDate && this.processedDate == messageProcessedMetaEntity.processedDate && this.processedDuring == messageProcessedMetaEntity.processedDuring && kotlin.jvm.internal.Intrinsics.b(this.resultMeta, messageProcessedMetaEntity.resultMeta) && kotlin.jvm.internal.Intrinsics.b(this.categorizerMeta, messageProcessedMetaEntity.categorizerMeta) && kotlin.jvm.internal.Intrinsics.b(this.parserMeta, messageProcessedMetaEntity.parserMeta) && kotlin.jvm.internal.Intrinsics.b(this.llmPatternMatchedMeta, messageProcessedMetaEntity.llmPatternMatchedMeta) && kotlin.jvm.internal.Intrinsics.b(this.senderRetrievedMeta, messageProcessedMetaEntity.senderRetrievedMeta);
    }

    @org.jetbrains.annotations.Nullable
    public final qu1.baz getCategorizerMeta() {
        return this.categorizerMeta;
    }

    @org.jetbrains.annotations.Nullable
    public final qu1.bar getLlmPatternMatchedMeta() {
        return this.llmPatternMatchedMeta;
    }

    public final long getMessageDate() {
        return this.messageDate;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    @org.jetbrains.annotations.Nullable
    public final qu1.qux getParserMeta() {
        return this.parserMeta;
    }

    public final long getProcessedDate() {
        return this.processedDate;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.processing.ProcessedDuring getProcessedDuring() {
        return this.processedDuring;
    }

    @org.jetbrains.annotations.NotNull
    public final qu1.e getResultMeta() {
        return this.resultMeta;
    }

    @org.jetbrains.annotations.Nullable
    public final qu1.f getSenderRetrievedMeta() {
        return this.senderRetrievedMeta;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        long j = this.messageId;
        long j2 = this.messageDate;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.processedDate;
        int hashCode4 = (this.resultMeta.hashCode() + ((this.processedDuring.hashCode() + ((i + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31)) * 31;
        qu1.baz bazVar = this.categorizerMeta;
        int i2 = 0;
        if (bazVar == null) {
            hashCode = 0;
        } else {
            hashCode = bazVar.hashCode();
        }
        int i3 = (hashCode4 + hashCode) * 31;
        qu1.qux quxVar = this.parserMeta;
        if (quxVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = quxVar.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        qu1.bar barVar = this.llmPatternMatchedMeta;
        if (barVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = barVar.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        qu1.f fVar = this.senderRetrievedMeta;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return i5 + i2;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.messageId;
        long j2 = this.messageDate;
        long j3 = this.processedDate;
        com.truecaller.insights.database.entities.processing.ProcessedDuring processedDuring = this.processedDuring;
        qu1.e eVar = this.resultMeta;
        qu1.baz bazVar = this.categorizerMeta;
        qu1.qux quxVar = this.parserMeta;
        qu1.bar barVar = this.llmPatternMatchedMeta;
        qu1.f fVar = this.senderRetrievedMeta;
        java.lang.StringBuilder T = h0.b.T(j, "MessageProcessedMetaEntity(messageId=", ", messageDate=");
        T.append(j2);
        ro0.f.L(T, ", processedDate=", j3, ", processedDuring=");
        T.append(processedDuring);
        T.append(", resultMeta=");
        T.append(eVar);
        T.append(", categorizerMeta=");
        T.append(bazVar);
        T.append(", parserMeta=");
        T.append(quxVar);
        T.append(", llmPatternMatchedMeta=");
        T.append(barVar);
        T.append(", senderRetrievedMeta=");
        T.append(fVar);
        T.append(")");
        return T.toString();
    }

    public /* synthetic */ MessageProcessedMetaEntity(long j, long j2, long j3, com.truecaller.insights.database.entities.processing.ProcessedDuring processedDuring, qu1.e eVar, qu1.baz bazVar, qu1.qux quxVar, qu1.bar barVar, qu1.f fVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, processedDuring, eVar, (i & 32) != 0 ? null : bazVar, (i & 64) != 0 ? null : quxVar, (i & 128) != 0 ? null : barVar, (i & 256) != 0 ? null : fVar);
    }
}
