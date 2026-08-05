package com.truecaller.insights.database.models;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b#$%&'()*+,-B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\bR\u0014\u0010!\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\bR\u0014\u0010\"\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013\u0082\u0001\u000b./012345678¨\u00069"}, d2 = {"Lcom/truecaller/insights/database/models/InsightsDomain;", "", "", "category", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "", "getMsgId", "()J", "msgId", "Lcom/truecaller/insights/database/models/DomainOrigin;", "getOrigin", "()Lcom/truecaller/insights/database/models/DomainOrigin;", "origin", "", "isSenderVerifiedForSmartFeatures", "()Z", "Luu1/bar;", "getActionState", "()Luu1/bar;", "actionState", "getConversationId", "conversationId", "Lorg/joda/time/DateTime;", "getMsgDateTime", "()Lorg/joda/time/DateTime;", "msgDateTime", "getSender", "sender", "getMessage", "message", "isIM", "Bill", "bar", "e", "d", "f", "a", "b", "c", "g", "qux", "baz", "Lcom/truecaller/insights/database/models/InsightsDomain$bar;", "Lcom/truecaller/insights/database/models/InsightsDomain$Bill;", "Lcom/truecaller/insights/database/models/InsightsDomain$baz;", "Lcom/truecaller/insights/database/models/InsightsDomain$qux;", "Lcom/truecaller/insights/database/models/InsightsDomain$a;", "Lcom/truecaller/insights/database/models/InsightsDomain$b;", "Lcom/truecaller/insights/database/models/InsightsDomain$c;", "Lcom/truecaller/insights/database/models/InsightsDomain$d;", "Lcom/truecaller/insights/database/models/InsightsDomain$e;", "Lcom/truecaller/insights/database/models/InsightsDomain$f;", "Lcom/truecaller/insights/database/models/InsightsDomain$g;", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class InsightsDomain {

    @bw.qux("d")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String category;

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0015\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010#\u001a\u00020\u0019\u0012\b\b\u0002\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010(J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010(J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010(J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010(J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010(J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010(J\u0012\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010(J\u0010\u00107\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b7\u00105J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u0010(J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010(J\u0010\u0010:\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b@\u0010(J\u0010\u0010A\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bA\u0010(J\u0010\u0010B\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bB\u0010(J\u0012\u0010C\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bE\u0010;J\u0010\u0010F\u001a\u00020!HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bH\u0010?J\u0010\u0010I\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bI\u0010(J¤\u0002\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u00152\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bL\u0010(J\u0010\u0010M\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\bM\u0010=J\u001a\u0010P\u001a\u00020\u00192\b\u0010O\u001a\u0004\u0018\u00010NHÖ\u0003¢\u0006\u0004\bP\u0010QR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010(R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010R\u001a\u0004\bT\u0010(R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010R\u001a\u0004\bU\u0010(R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010R\u001a\u0004\bV\u0010(R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010R\u001a\u0004\bW\u0010(R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010R\u001a\u0004\bX\u0010(R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010R\u001a\u0004\bY\u0010(R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010R\u001a\u0004\bZ\u0010(R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010R\u001a\u0004\b[\u0010(R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010R\u001a\u0004\b\\\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010]\u001a\u0004\b^\u00103R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010_\u001a\u0004\b`\u00105R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\ba\u0010(R\u001a\u0010\u0012\u001a\u00020\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010_\u001a\u0004\bb\u00105R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010R\u001a\u0004\bc\u0010(R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010R\u001a\u0004\bd\u0010(R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010e\u001a\u0004\bf\u0010;R\u001a\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010g\u001a\u0004\bh\u0010=R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010i\u001a\u0004\b\u001a\u0010?R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010R\u001a\u0004\bj\u0010(R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010R\u001a\u0004\bk\u0010(R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010R\u001a\u0004\bl\u0010(R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010m\u001a\u0004\bn\u0010DR\u001a\u0010 \u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010e\u001a\u0004\bo\u0010;R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010p\u001a\u0004\bq\u0010GR\u001a\u0010#\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010i\u001a\u0004\b#\u0010?R\u001a\u0010$\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010R\u001a\u0004\br\u0010(R\u0017\u0010s\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bs\u0010_\u001a\u0004\bt\u00105R\u0017\u0010u\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bu\u0010_\u001a\u0004\bv\u00105¨\u0006w"}, d2 = {"Lcom/truecaller/insights/database/models/InsightsDomain$Bill;", "Lcom/truecaller/insights/database/models/InsightsDomain;", "", "billCategory", "billSubcategory", "type", "dueInsType", "auxType", "billNum", "vendorName", "insNum", "dueAmt", "auxAmt", "Lorg/joda/time/LocalDate;", "dueDate", "Lorg/joda/time/DateTime;", "dueDateTime", "sender", "msgDateTime", "paymentStatus", "location", "", "conversationId", "", "spamCategory", "", "isIM", "url", "urlType", "dueCurrency", "Luu1/bar;", "actionState", "msgId", "Lcom/truecaller/insights/database/models/DomainOrigin;", "origin", "isSenderVerifiedForSmartFeatures", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDate;Lorg/joda/time/DateTime;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;JIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Luu1/bar;JLcom/truecaller/insights/database/models/DomainOrigin;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Lorg/joda/time/LocalDate;", "component12", "()Lorg/joda/time/DateTime;", "component13", "component14", "component15", "component16", "component17", "()J", "component18", "()I", "component19", "()Z", "component20", "component21", "component22", "component23", "()Luu1/bar;", "component24", "component25", "()Lcom/truecaller/insights/database/models/DomainOrigin;", "component26", "component27", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDate;Lorg/joda/time/DateTime;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;JIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Luu1/bar;JLcom/truecaller/insights/database/models/DomainOrigin;ZLjava/lang/String;)Lcom/truecaller/insights/database/models/InsightsDomain$Bill;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBillCategory", "getBillSubcategory", "getType", "getDueInsType", "getAuxType", "getBillNum", "getVendorName", "getInsNum", "getDueAmt", "getAuxAmt", "Lorg/joda/time/LocalDate;", "getDueDate", "Lorg/joda/time/DateTime;", "getDueDateTime", "getSender", "getMsgDateTime", "getPaymentStatus", "getLocation", "J", "getConversationId", "I", "getSpamCategory", "Z", "getUrl", "getUrlType", "getDueCurrency", "Luu1/bar;", "getActionState", "getMsgId", "Lcom/truecaller/insights/database/models/DomainOrigin;", "getOrigin", "getMessage", "billDateTime", "getBillDateTime", "billDueDateTime", "getBillDueDateTime", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class Bill extends com.truecaller.insights.database.models.InsightsDomain {

        @org.jetbrains.annotations.Nullable
        private final uu1.bar actionState;

        @bw.qux("val4")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String auxAmt;

        @bw.qux("f")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String auxType;

        @bw.qux("k")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String billCategory;

        @org.jetbrains.annotations.NotNull
        private final org.joda.time.DateTime billDateTime;

        @org.jetbrains.annotations.NotNull
        private final org.joda.time.DateTime billDueDateTime;

        @bw.qux("g")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String billNum;

        @bw.qux("p")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String billSubcategory;

        @bw.qux("conversation_id")
        private final long conversationId;

        @bw.qux("val3")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String dueAmt;

        @bw.qux("dffVal1")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String dueCurrency;

        @bw.qux("date")
        @org.jetbrains.annotations.Nullable
        private final org.joda.time.LocalDate dueDate;

        @bw.qux("datetime")
        @org.jetbrains.annotations.Nullable
        private final org.joda.time.DateTime dueDateTime;

        @bw.qux("o")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String dueInsType;

        @bw.qux("val1")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String insNum;

        @bw.qux("is_im")
        private final boolean isIM;
        private final boolean isSenderVerifiedForSmartFeatures;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String location;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String message;

        @bw.qux("msgdatetime")
        @org.jetbrains.annotations.NotNull
        private final org.joda.time.DateTime msgDateTime;
        private final long msgId;

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.insights.database.models.DomainOrigin origin;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String paymentStatus;

        @bw.qux("address")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String sender;

        @bw.qux("spam_category")
        private final int spamCategory;

        @bw.qux("c")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String type;

        @bw.qux("dffVal5")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String url;

        @bw.qux("dffVal3")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String urlType;

        @bw.qux("s")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String vendorName;

        public Bill() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0, false, null, null, null, null, 0L, null, false, null, 134217727, null);
        }

        public static /* synthetic */ com.truecaller.insights.database.models.InsightsDomain.Bill copy$default(com.truecaller.insights.database.models.InsightsDomain.Bill bill, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, org.joda.time.LocalDate localDate, org.joda.time.DateTime dateTime, java.lang.String str11, org.joda.time.DateTime dateTime2, java.lang.String str12, java.lang.String str13, long j, int i, boolean z, java.lang.String str14, java.lang.String str15, java.lang.String str16, uu1.bar barVar, long j2, com.truecaller.insights.database.models.DomainOrigin domainOrigin, boolean z2, java.lang.String str17, int i2, java.lang.Object obj) {
            java.lang.String str18;
            com.truecaller.insights.database.models.DomainOrigin domainOrigin2;
            java.lang.String str19 = (i2 & 1) != 0 ? bill.billCategory : str;
            java.lang.String str20 = (i2 & 2) != 0 ? bill.billSubcategory : str2;
            java.lang.String str21 = (i2 & 4) != 0 ? bill.type : str3;
            java.lang.String str22 = (i2 & 8) != 0 ? bill.dueInsType : str4;
            java.lang.String str23 = (i2 & 16) != 0 ? bill.auxType : str5;
            java.lang.String str24 = (i2 & 32) != 0 ? bill.billNum : str6;
            java.lang.String str25 = (i2 & 64) != 0 ? bill.vendorName : str7;
            java.lang.String str26 = (i2 & 128) != 0 ? bill.insNum : str8;
            java.lang.String str27 = (i2 & 256) != 0 ? bill.dueAmt : str9;
            java.lang.String str28 = (i2 & 512) != 0 ? bill.auxAmt : str10;
            org.joda.time.LocalDate localDate2 = (i2 & 1024) != 0 ? bill.dueDate : localDate;
            org.joda.time.DateTime dateTime3 = (i2 & 2048) != 0 ? bill.dueDateTime : dateTime;
            java.lang.String str29 = (i2 & 4096) != 0 ? bill.sender : str11;
            org.joda.time.DateTime dateTime4 = (i2 & 8192) != 0 ? bill.msgDateTime : dateTime2;
            java.lang.String str30 = str19;
            java.lang.String str31 = (i2 & 16384) != 0 ? bill.paymentStatus : str12;
            java.lang.String str32 = (i2 & 32768) != 0 ? bill.location : str13;
            java.lang.String str33 = str31;
            long j3 = (i2 & 65536) != 0 ? bill.conversationId : j;
            int i3 = (i2 & 131072) != 0 ? bill.spamCategory : i;
            boolean z3 = (i2 & 262144) != 0 ? bill.isIM : z;
            int i4 = i3;
            java.lang.String str34 = (i2 & 524288) != 0 ? bill.url : str14;
            java.lang.String str35 = (i2 & 1048576) != 0 ? bill.urlType : str15;
            java.lang.String str36 = (i2 & 2097152) != 0 ? bill.dueCurrency : str16;
            uu1.bar barVar2 = (i2 & 4194304) != 0 ? bill.actionState : barVar;
            boolean z4 = z3;
            long j4 = (i2 & 8388608) != 0 ? bill.msgId : j2;
            com.truecaller.insights.database.models.DomainOrigin domainOrigin3 = (i2 & 16777216) != 0 ? bill.origin : domainOrigin;
            boolean z5 = (i2 & 33554432) != 0 ? bill.isSenderVerifiedForSmartFeatures : z2;
            if ((i2 & 67108864) != 0) {
                domainOrigin2 = domainOrigin3;
                str18 = bill.message;
            } else {
                str18 = str17;
                domainOrigin2 = domainOrigin3;
            }
            return bill.copy(str30, str20, str21, str22, str23, str24, str25, str26, str27, str28, localDate2, dateTime3, str29, dateTime4, str33, str32, j3, i4, z4, str34, str35, str36, barVar2, j4, domainOrigin2, z5, str18);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBillCategory() {
            return this.billCategory;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component10, reason: from getter */
        public final java.lang.String getAuxAmt() {
            return this.auxAmt;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component11, reason: from getter */
        public final org.joda.time.LocalDate getDueDate() {
            return this.dueDate;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component12, reason: from getter */
        public final org.joda.time.DateTime getDueDateTime() {
            return this.dueDateTime;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component13, reason: from getter */
        public final java.lang.String getSender() {
            return this.sender;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component14, reason: from getter */
        public final org.joda.time.DateTime getMsgDateTime() {
            return this.msgDateTime;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component15, reason: from getter */
        public final java.lang.String getPaymentStatus() {
            return this.paymentStatus;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component16, reason: from getter */
        public final java.lang.String getLocation() {
            return this.location;
        }

        /* renamed from: component17, reason: from getter */
        public final long getConversationId() {
            return this.conversationId;
        }

        /* renamed from: component18, reason: from getter */
        public final int getSpamCategory() {
            return this.spamCategory;
        }

        /* renamed from: component19, reason: from getter */
        public final boolean getIsIM() {
            return this.isIM;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getBillSubcategory() {
            return this.billSubcategory;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component20, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component21, reason: from getter */
        public final java.lang.String getUrlType() {
            return this.urlType;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component22, reason: from getter */
        public final java.lang.String getDueCurrency() {
            return this.dueCurrency;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component23, reason: from getter */
        public final uu1.bar getActionState() {
            return this.actionState;
        }

        /* renamed from: component24, reason: from getter */
        public final long getMsgId() {
            return this.msgId;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component25, reason: from getter */
        public final com.truecaller.insights.database.models.DomainOrigin getOrigin() {
            return this.origin;
        }

        /* renamed from: component26, reason: from getter */
        public final boolean getIsSenderVerifiedForSmartFeatures() {
            return this.isSenderVerifiedForSmartFeatures;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component27, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component3, reason: from getter */
        public final java.lang.String getType() {
            return this.type;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component4, reason: from getter */
        public final java.lang.String getDueInsType() {
            return this.dueInsType;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component5, reason: from getter */
        public final java.lang.String getAuxType() {
            return this.auxType;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component6, reason: from getter */
        public final java.lang.String getBillNum() {
            return this.billNum;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component7, reason: from getter */
        public final java.lang.String getVendorName() {
            return this.vendorName;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component8, reason: from getter */
        public final java.lang.String getInsNum() {
            return this.insNum;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component9, reason: from getter */
        public final java.lang.String getDueAmt() {
            return this.dueAmt;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.insights.database.models.InsightsDomain.Bill copy(@org.jetbrains.annotations.NotNull java.lang.String billCategory, @org.jetbrains.annotations.NotNull java.lang.String billSubcategory, @org.jetbrains.annotations.NotNull java.lang.String type, @org.jetbrains.annotations.NotNull java.lang.String dueInsType, @org.jetbrains.annotations.NotNull java.lang.String auxType, @org.jetbrains.annotations.NotNull java.lang.String billNum, @org.jetbrains.annotations.NotNull java.lang.String vendorName, @org.jetbrains.annotations.NotNull java.lang.String insNum, @org.jetbrains.annotations.NotNull java.lang.String dueAmt, @org.jetbrains.annotations.NotNull java.lang.String auxAmt, @org.jetbrains.annotations.Nullable org.joda.time.LocalDate dueDate, @org.jetbrains.annotations.Nullable org.joda.time.DateTime dueDateTime, @org.jetbrains.annotations.NotNull java.lang.String sender, @org.jetbrains.annotations.NotNull org.joda.time.DateTime msgDateTime, @org.jetbrains.annotations.NotNull java.lang.String paymentStatus, @org.jetbrains.annotations.NotNull java.lang.String location, long conversationId, int spamCategory, boolean isIM, @org.jetbrains.annotations.NotNull java.lang.String url, @org.jetbrains.annotations.NotNull java.lang.String urlType, @org.jetbrains.annotations.NotNull java.lang.String dueCurrency, @org.jetbrains.annotations.Nullable uu1.bar actionState, long msgId, @org.jetbrains.annotations.NotNull com.truecaller.insights.database.models.DomainOrigin origin, boolean isSenderVerifiedForSmartFeatures, @org.jetbrains.annotations.NotNull java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billCategory, "billCategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billSubcategory, "billSubcategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueInsType, "dueInsType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auxType, "auxType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billNum, "billNum");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vendorName, "vendorName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(insNum, "insNum");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueAmt, "dueAmt");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auxAmt, "auxAmt");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sender, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msgDateTime, "msgDateTime");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentStatus, "paymentStatus");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "location");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlType, "urlType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueCurrency, "dueCurrency");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(origin, "origin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            return new com.truecaller.insights.database.models.InsightsDomain.Bill(billCategory, billSubcategory, type, dueInsType, auxType, billNum, vendorName, insNum, dueAmt, auxAmt, dueDate, dueDateTime, sender, msgDateTime, paymentStatus, location, conversationId, spamCategory, isIM, url, urlType, dueCurrency, actionState, msgId, origin, isSenderVerifiedForSmartFeatures, message);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.insights.database.models.InsightsDomain.Bill)) {
                return false;
            }
            com.truecaller.insights.database.models.InsightsDomain.Bill bill = (com.truecaller.insights.database.models.InsightsDomain.Bill) other;
            return kotlin.jvm.internal.Intrinsics.b(this.billCategory, bill.billCategory) && kotlin.jvm.internal.Intrinsics.b(this.billSubcategory, bill.billSubcategory) && kotlin.jvm.internal.Intrinsics.b(this.type, bill.type) && kotlin.jvm.internal.Intrinsics.b(this.dueInsType, bill.dueInsType) && kotlin.jvm.internal.Intrinsics.b(this.auxType, bill.auxType) && kotlin.jvm.internal.Intrinsics.b(this.billNum, bill.billNum) && kotlin.jvm.internal.Intrinsics.b(this.vendorName, bill.vendorName) && kotlin.jvm.internal.Intrinsics.b(this.insNum, bill.insNum) && kotlin.jvm.internal.Intrinsics.b(this.dueAmt, bill.dueAmt) && kotlin.jvm.internal.Intrinsics.b(this.auxAmt, bill.auxAmt) && kotlin.jvm.internal.Intrinsics.b(this.dueDate, bill.dueDate) && kotlin.jvm.internal.Intrinsics.b(this.dueDateTime, bill.dueDateTime) && kotlin.jvm.internal.Intrinsics.b(this.sender, bill.sender) && kotlin.jvm.internal.Intrinsics.b(this.msgDateTime, bill.msgDateTime) && kotlin.jvm.internal.Intrinsics.b(this.paymentStatus, bill.paymentStatus) && kotlin.jvm.internal.Intrinsics.b(this.location, bill.location) && this.conversationId == bill.conversationId && this.spamCategory == bill.spamCategory && this.isIM == bill.isIM && kotlin.jvm.internal.Intrinsics.b(this.url, bill.url) && kotlin.jvm.internal.Intrinsics.b(this.urlType, bill.urlType) && kotlin.jvm.internal.Intrinsics.b(this.dueCurrency, bill.dueCurrency) && kotlin.jvm.internal.Intrinsics.b(this.actionState, bill.actionState) && this.msgId == bill.msgId && this.origin == bill.origin && this.isSenderVerifiedForSmartFeatures == bill.isSenderVerifiedForSmartFeatures && kotlin.jvm.internal.Intrinsics.b(this.message, bill.message);
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        @org.jetbrains.annotations.Nullable
        /* renamed from: getActionState */
        public uu1.bar getY() {
            return this.actionState;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAuxAmt() {
            return this.auxAmt;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAuxType() {
            return this.auxType;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getBillCategory() {
            return this.billCategory;
        }

        @org.jetbrains.annotations.NotNull
        public final org.joda.time.DateTime getBillDateTime() {
            return this.billDateTime;
        }

        @org.jetbrains.annotations.NotNull
        public final org.joda.time.DateTime getBillDueDateTime() {
            return this.billDueDateTime;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getBillNum() {
            return this.billNum;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getBillSubcategory() {
            return this.billSubcategory;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public long getConversationId() {
            return this.conversationId;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDueAmt() {
            return this.dueAmt;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDueCurrency() {
            return this.dueCurrency;
        }

        @org.jetbrains.annotations.Nullable
        public final org.joda.time.LocalDate getDueDate() {
            return this.dueDate;
        }

        @org.jetbrains.annotations.Nullable
        public final org.joda.time.DateTime getDueDateTime() {
            return this.dueDateTime;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDueInsType() {
            return this.dueInsType;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getInsNum() {
            return this.insNum;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLocation() {
            return this.location;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        @org.jetbrains.annotations.NotNull
        /* renamed from: getMessage */
        public java.lang.String getH() {
            return this.message;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        @org.jetbrains.annotations.NotNull
        public org.joda.time.DateTime getMsgDateTime() {
            return this.msgDateTime;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public long getMsgId() {
            return this.msgId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        @org.jetbrains.annotations.NotNull
        /* renamed from: getOrigin */
        public com.truecaller.insights.database.models.DomainOrigin getF() {
            return this.origin;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPaymentStatus() {
            return this.paymentStatus;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        @org.jetbrains.annotations.NotNull
        public java.lang.String getSender() {
            return this.sender;
        }

        public final int getSpamCategory() {
            return this.spamCategory;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getType() {
            return this.type;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getUrl() {
            return this.url;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getUrlType() {
            return this.urlType;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getVendorName() {
            return this.vendorName;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int i;
            int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(this.billCategory.hashCode() * 31, 31, this.billSubcategory), 31, this.type), 31, this.dueInsType), 31, this.auxType), 31, this.billNum), 31, this.vendorName), 31, this.insNum), 31, this.dueAmt), 31, this.auxAmt);
            org.joda.time.LocalDate localDate = this.dueDate;
            int i2 = 0;
            if (localDate == null) {
                hashCode = 0;
            } else {
                hashCode = localDate.hashCode();
            }
            int i3 = (e + hashCode) * 31;
            org.joda.time.DateTime dateTime = this.dueDateTime;
            if (dateTime == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = dateTime.hashCode();
            }
            int e2 = ax1.bar.e(ax1.bar.e(ro0.f.w(this.msgDateTime, ax1.bar.e((i3 + hashCode2) * 31, 31, this.sender), 31), 31, this.paymentStatus), 31, this.location);
            long j = this.conversationId;
            int i4 = (((e2 + ((int) (j ^ (j >>> 32)))) * 31) + this.spamCategory) * 31;
            int i5 = 1237;
            if (this.isIM) {
                i = 1231;
            } else {
                i = 1237;
            }
            int e3 = ax1.bar.e(ax1.bar.e(ax1.bar.e((i4 + i) * 31, 31, this.url), 31, this.urlType), 31, this.dueCurrency);
            uu1.bar barVar = this.actionState;
            if (barVar != null) {
                i2 = barVar.hashCode();
            }
            int i6 = (e3 + i2) * 31;
            long j2 = this.msgId;
            int hashCode3 = (this.origin.hashCode() + ((i6 + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
            if (this.isSenderVerifiedForSmartFeatures) {
                i5 = 1231;
            }
            return this.message.hashCode() + ((hashCode3 + i5) * 31);
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isIM */
        public boolean getIsIM() {
            return this.isIM;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isSenderVerifiedForSmartFeatures */
        public boolean getG() {
            return this.isSenderVerifiedForSmartFeatures;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            java.lang.String str = this.billCategory;
            java.lang.String str2 = this.billSubcategory;
            java.lang.String str3 = this.type;
            java.lang.String str4 = this.dueInsType;
            java.lang.String str5 = this.auxType;
            java.lang.String str6 = this.billNum;
            java.lang.String str7 = this.vendorName;
            java.lang.String str8 = this.insNum;
            java.lang.String str9 = this.dueAmt;
            java.lang.String str10 = this.auxAmt;
            org.joda.time.LocalDate localDate = this.dueDate;
            org.joda.time.DateTime dateTime = this.dueDateTime;
            java.lang.String str11 = this.sender;
            org.joda.time.DateTime dateTime2 = this.msgDateTime;
            java.lang.String str12 = this.paymentStatus;
            java.lang.String str13 = this.location;
            long j = this.conversationId;
            int i = this.spamCategory;
            boolean z = this.isIM;
            java.lang.String str14 = this.url;
            java.lang.String str15 = this.urlType;
            java.lang.String str16 = this.dueCurrency;
            uu1.bar barVar = this.actionState;
            long j2 = this.msgId;
            com.truecaller.insights.database.models.DomainOrigin domainOrigin = this.origin;
            boolean z2 = this.isSenderVerifiedForSmartFeatures;
            java.lang.String str17 = this.message;
            java.lang.StringBuilder E = ro0.f.E("Bill(billCategory=", str, ", billSubcategory=", str2, ", type=");
            bar.E(E, str3, ", dueInsType=", str4, ", auxType=");
            bar.E(E, str5, ", billNum=", str6, ", vendorName=");
            bar.E(E, str7, ", insNum=", str8, ", dueAmt=");
            bar.E(E, str9, ", auxAmt=", str10, ", dueDate=");
            E.append(localDate);
            E.append(", dueDateTime=");
            E.append(dateTime);
            E.append(", sender=");
            E.append(str11);
            E.append(", msgDateTime=");
            E.append(dateTime2);
            E.append(", paymentStatus=");
            bar.E(E, str12, ", location=", str13, ", conversationId=");
            h8.s0.y(i, j, ", spamCategory=", E);
            E.append(", isIM=");
            E.append(z);
            E.append(", url=");
            E.append(str14);
            bar.E(E, ", urlType=", str15, ", dueCurrency=", str16);
            E.append(", actionState=");
            E.append(barVar);
            E.append(", msgId=");
            E.append(j2);
            E.append(", origin=");
            E.append(domainOrigin);
            E.append(", isSenderVerifiedForSmartFeatures=");
            E.append(z2);
            E.append(", message=");
            E.append(str17);
            E.append(")");
            return E.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bill(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.NotNull java.lang.String str5, @org.jetbrains.annotations.NotNull java.lang.String str6, @org.jetbrains.annotations.NotNull java.lang.String str7, @org.jetbrains.annotations.NotNull java.lang.String str8, @org.jetbrains.annotations.NotNull java.lang.String str9, @org.jetbrains.annotations.NotNull java.lang.String str10, @org.jetbrains.annotations.Nullable org.joda.time.LocalDate localDate, @org.jetbrains.annotations.Nullable org.joda.time.DateTime dateTime, @org.jetbrains.annotations.NotNull java.lang.String str11, @org.jetbrains.annotations.NotNull org.joda.time.DateTime dateTime2, @org.jetbrains.annotations.NotNull java.lang.String str12, @org.jetbrains.annotations.NotNull java.lang.String str13, long j, int i, boolean z, @org.jetbrains.annotations.NotNull java.lang.String str14, @org.jetbrains.annotations.NotNull java.lang.String str15, @org.jetbrains.annotations.NotNull java.lang.String str16, @org.jetbrains.annotations.Nullable uu1.bar barVar, long j2, @org.jetbrains.annotations.NotNull com.truecaller.insights.database.models.DomainOrigin domainOrigin, boolean z2, @org.jetbrains.annotations.NotNull java.lang.String str17) {
            super("Bill", null);
            org.joda.time.DateTime msgDateTime;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "billCategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "billSubcategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "type");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "dueInsType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "auxType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "billNum");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "vendorName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "insNum");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "dueAmt");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "auxAmt");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime2, "msgDateTime");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str12, "paymentStatus");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str13, "location");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str14, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str15, "urlType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str16, "dueCurrency");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainOrigin, "origin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str17, "message");
            this.billCategory = str;
            this.billSubcategory = str2;
            this.type = str3;
            this.dueInsType = str4;
            this.auxType = str5;
            this.billNum = str6;
            this.vendorName = str7;
            this.insNum = str8;
            this.dueAmt = str9;
            this.auxAmt = str10;
            this.dueDate = localDate;
            this.dueDateTime = dateTime;
            this.sender = str11;
            this.msgDateTime = dateTime2;
            this.paymentStatus = str12;
            this.location = str13;
            this.conversationId = j;
            this.spamCategory = i;
            this.isIM = z;
            this.url = str14;
            this.urlType = str15;
            this.dueCurrency = str16;
            this.actionState = barVar;
            this.msgId = j2;
            this.origin = domainOrigin;
            this.isSenderVerifiedForSmartFeatures = z2;
            this.message = str17;
            if (localDate != null) {
                msgDateTime = localDate.q((org.joda.time.DateTimeZone) null);
            } else {
                msgDateTime = getMsgDateTime();
            }
            this.billDateTime = msgDateTime;
            this.billDueDateTime = dateTime == null ? getMsgDateTime() : dateTime;
        }

        public Bill(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, org.joda.time.LocalDate localDate, org.joda.time.DateTime dateTime, java.lang.String str11, org.joda.time.DateTime dateTime2, java.lang.String str12, java.lang.String str13, long j, int i, boolean z, java.lang.String str14, java.lang.String str15, java.lang.String str16, uu1.bar barVar, long j2, com.truecaller.insights.database.models.DomainOrigin domainOrigin, boolean z2, java.lang.String str17, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? null : localDate, (i2 & 2048) != 0 ? null : dateTime, (i2 & 4096) != 0 ? "" : str11, (i2 & 8192) != 0 ? wi0.bar.v("now(...)") : dateTime2, (i2 & 16384) != 0 ? "pending" : str12, (i2 & 32768) != 0 ? "" : str13, (i2 & 65536) != 0 ? -1L : j, (i2 & 131072) != 0 ? 1 : i, (i2 & 262144) != 0 ? false : z, (i2 & 524288) != 0 ? "" : str14, (i2 & 1048576) != 0 ? "" : str15, (i2 & 2097152) != 0 ? "" : str16, (i2 & 4194304) != 0 ? null : barVar, (i2 & 8388608) == 0 ? j2 : -1L, (i2 & 16777216) != 0 ? com.truecaller.insights.database.models.DomainOrigin.SMS : domainOrigin, (i2 & 33554432) == 0 ? z2 : false, (i2 & 67108864) != 0 ? "" : str17);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u001a\u0010#\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010\u0012R\u001c\u0010(\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\t\u0010'R\u001a\u0010*\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0010\u001a\u0004\b\u0003\u0010\u0012R\u001a\u0010-\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0010\u001a\u0004\b,\u0010\u0012R\u001a\u00103\u001a\u00020.8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u00108\u001a\u00020\u000e8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0010\u001a\u0004\b5\u0010\u0012\"\u0004\b6\u00107R\u001a\u0010;\u001a\u00020$8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b9\u0010&\u001a\u0004\b:\u0010'R\u001a\u0010>\u001a\u00020.8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b=\u00102R\u001a\u0010B\u001a\u00020?8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/truecaller/insights/database/models/InsightsDomain$a;", "Lcom/truecaller/insights/database/models/InsightsDomain;", "Lcom/truecaller/insights/commons/utils/domain/OrderStatus;", "a", "Lcom/truecaller/insights/commons/utils/domain/OrderStatus;", "d", "()Lcom/truecaller/insights/commons/utils/domain/OrderStatus;", "orderStatus", "Lcom/truecaller/insights/commons/utils/domain/DeliveryDomainConstants$OrderSubStatus;", "b", "Lcom/truecaller/insights/commons/utils/domain/DeliveryDomainConstants$OrderSubStatus;", "e", "()Lcom/truecaller/insights/commons/utils/domain/DeliveryDomainConstants$OrderSubStatus;", "orderSubStatus", "", "c", "Ljava/lang/String;", "getOrderId", "()Ljava/lang/String;", "orderId", "getTrackingId", "trackingId", "orderItem", "f", "getOrderAmount", "orderAmount", "g", "teleNum", "Lcom/truecaller/insights/commons/utils/domain/DeliveryDomainConstants$UrlTypes;", "h", "Lcom/truecaller/insights/commons/utils/domain/DeliveryDomainConstants$UrlTypes;", "()Lcom/truecaller/insights/commons/utils/domain/DeliveryDomainConstants$UrlTypes;", "urlType", "i", "getUrl", "url", "Lorg/joda/time/DateTime;", "j", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "dateTime", "k", "agentPin", "l", "getLocation", "location", "", "m", "J", "getMsgId", "()J", "msgId", "n", "getSender", "setSender", "(Ljava/lang/String;)V", "sender", "o", "getMsgDateTime", "msgDateTime", "p", "getConversationId", "conversationId", "", "q", "Z", "isIM", "()Z", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class a extends com.truecaller.insights.database.models.InsightsDomain {

        /* renamed from: a, reason: from kotlin metadata */
        @bw.qux("k")
        @org.jetbrains.annotations.Nullable
        private final com.truecaller.insights.commons.utils.domain.OrderStatus orderStatus;

        /* renamed from: b, reason: from kotlin metadata */
        @bw.qux("p")
        @org.jetbrains.annotations.Nullable
        private final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus orderSubStatus;

        /* renamed from: c, reason: from kotlin metadata */
        @bw.qux("o")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String orderId;

        /* renamed from: d, reason: from kotlin metadata */
        @bw.qux("f")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String trackingId;

        /* renamed from: e, reason: from kotlin metadata */
        @bw.qux("s")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String orderItem;

        /* renamed from: f, reason: from kotlin metadata */
        @bw.qux("val3")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String orderAmount;

        /* renamed from: g, reason: from kotlin metadata */
        @bw.qux("dffVal4")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String teleNum;

        /* renamed from: h, reason: from kotlin metadata */
        @bw.qux("c")
        @org.jetbrains.annotations.Nullable
        private final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes urlType;

        /* renamed from: i, reason: from kotlin metadata */
        @bw.qux("dffVal5")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String url;

        /* renamed from: j, reason: from kotlin metadata */
        @bw.qux("datetime")
        @org.jetbrains.annotations.Nullable
        private final org.joda.time.DateTime dateTime;

        /* renamed from: k, reason: from kotlin metadata */
        @bw.qux("val1")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String agentPin;

        /* renamed from: l, reason: from kotlin metadata */
        @bw.qux("val2")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String location;

        /* renamed from: m, reason: from kotlin metadata */
        @bw.qux("messageID")
        private final long msgId;

        /* renamed from: n, reason: from kotlin metadata */
        @bw.qux("address")
        @org.jetbrains.annotations.NotNull
        private java.lang.String sender;

        /* renamed from: o, reason: from kotlin metadata */
        @bw.qux("msgdatetime")
        @org.jetbrains.annotations.NotNull
        private final org.joda.time.DateTime msgDateTime;

        /* renamed from: p, reason: from kotlin metadata */
        @bw.qux("conversation_id")
        private final long conversationId;

        /* renamed from: q, reason: from kotlin metadata */
        @bw.qux("is_im")
        private final boolean isIM;
        public final uu1.bar r;
        public final com.truecaller.insights.database.models.DomainOrigin s;
        public final boolean t;
        public final java.lang.String u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.truecaller.insights.commons.utils.domain.OrderStatus orderStatus, com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus deliveryDomainConstants$OrderSubStatus, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes deliveryDomainConstants$UrlTypes, java.lang.String str6, org.joda.time.DateTime dateTime, java.lang.String str7, java.lang.String str8, long j, java.lang.String str9, org.joda.time.DateTime dateTime2, long j2, boolean z, uu1.bar barVar, com.truecaller.insights.database.models.DomainOrigin domainOrigin, boolean z2, java.lang.String str10) {
            super("Delivery", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "orderId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "trackingId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "orderItem");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "orderAmount");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "teleNum");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "agentPin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "location");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime2, "msgDateTime");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainOrigin, "origin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "message");
            this.orderStatus = orderStatus;
            this.orderSubStatus = deliveryDomainConstants$OrderSubStatus;
            this.orderId = str;
            this.trackingId = str2;
            this.orderItem = str3;
            this.orderAmount = str4;
            this.teleNum = str5;
            this.urlType = deliveryDomainConstants$UrlTypes;
            this.url = str6;
            this.dateTime = dateTime;
            this.agentPin = str7;
            this.location = str8;
            this.msgId = j;
            this.sender = str9;
            this.msgDateTime = dateTime2;
            this.conversationId = j2;
            this.isIM = z;
            this.r = barVar;
            this.s = domainOrigin;
            this.t = z2;
            this.u = str10;
        }

        /* renamed from: a, reason: from getter */
        public final java.lang.String getAgentPin() {
            return this.agentPin;
        }

        /* renamed from: b, reason: from getter */
        public final org.joda.time.DateTime getDateTime() {
            return this.dateTime;
        }

        /* renamed from: c, reason: from getter */
        public final java.lang.String getOrderItem() {
            return this.orderItem;
        }

        /* renamed from: d, reason: from getter */
        public final com.truecaller.insights.commons.utils.domain.OrderStatus getOrderStatus() {
            return this.orderStatus;
        }

        /* renamed from: e, reason: from getter */
        public final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus getOrderSubStatus() {
            return this.orderSubStatus;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.database.models.InsightsDomain.a)) {
                return false;
            }
            com.truecaller.insights.database.models.InsightsDomain.a aVar = (com.truecaller.insights.database.models.InsightsDomain.a) obj;
            return this.orderStatus == aVar.orderStatus && this.orderSubStatus == aVar.orderSubStatus && kotlin.jvm.internal.Intrinsics.b(this.orderId, aVar.orderId) && kotlin.jvm.internal.Intrinsics.b(this.trackingId, aVar.trackingId) && kotlin.jvm.internal.Intrinsics.b(this.orderItem, aVar.orderItem) && kotlin.jvm.internal.Intrinsics.b(this.orderAmount, aVar.orderAmount) && kotlin.jvm.internal.Intrinsics.b(this.teleNum, aVar.teleNum) && this.urlType == aVar.urlType && kotlin.jvm.internal.Intrinsics.b(this.url, aVar.url) && kotlin.jvm.internal.Intrinsics.b(this.dateTime, aVar.dateTime) && kotlin.jvm.internal.Intrinsics.b(this.agentPin, aVar.agentPin) && kotlin.jvm.internal.Intrinsics.b(this.location, aVar.location) && this.msgId == aVar.msgId && kotlin.jvm.internal.Intrinsics.b(this.sender, aVar.sender) && kotlin.jvm.internal.Intrinsics.b(this.msgDateTime, aVar.msgDateTime) && this.conversationId == aVar.conversationId && this.isIM == aVar.isIM && kotlin.jvm.internal.Intrinsics.b(this.r, aVar.r) && this.s == aVar.s && this.t == aVar.t && kotlin.jvm.internal.Intrinsics.b(this.u, aVar.u);
        }

        /* renamed from: f, reason: from getter */
        public final java.lang.String getTeleNum() {
            return this.teleNum;
        }

        /* renamed from: g, reason: from getter */
        public final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes getUrlType() {
            return this.urlType;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getActionState, reason: from getter */
        public final uu1.bar getY() {
            return this.r;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getConversationId() {
            return this.conversationId;
        }

        public final java.lang.String getLocation() {
            return this.location;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getMessage, reason: from getter */
        public final java.lang.String getH() {
            return this.u;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final org.joda.time.DateTime getMsgDateTime() {
            return this.msgDateTime;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getMsgId() {
            return this.msgId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getOrigin, reason: from getter */
        public final com.truecaller.insights.database.models.DomainOrigin getF() {
            return this.s;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final java.lang.String getSender() {
            return this.sender;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int i;
            com.truecaller.insights.commons.utils.domain.OrderStatus orderStatus = this.orderStatus;
            int i2 = 0;
            if (orderStatus == null) {
                hashCode = 0;
            } else {
                hashCode = orderStatus.hashCode();
            }
            int i3 = hashCode * 31;
            com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus deliveryDomainConstants$OrderSubStatus = this.orderSubStatus;
            if (deliveryDomainConstants$OrderSubStatus == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = deliveryDomainConstants$OrderSubStatus.hashCode();
            }
            int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e((i3 + hashCode2) * 31, 31, this.orderId), 31, this.trackingId), 31, this.orderItem), 31, this.orderAmount), 31, this.teleNum);
            com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes deliveryDomainConstants$UrlTypes = this.urlType;
            if (deliveryDomainConstants$UrlTypes == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = deliveryDomainConstants$UrlTypes.hashCode();
            }
            int e2 = ax1.bar.e((e + hashCode3) * 31, 31, this.url);
            org.joda.time.DateTime dateTime = this.dateTime;
            if (dateTime == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = dateTime.hashCode();
            }
            int e3 = ax1.bar.e(ax1.bar.e((e2 + hashCode4) * 31, 31, this.agentPin), 31, this.location);
            long j = this.msgId;
            int w = ro0.f.w(this.msgDateTime, ax1.bar.e((e3 + ((int) (j ^ (j >>> 32)))) * 31, 31, this.sender), 31);
            long j2 = this.conversationId;
            int i4 = (w + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            int i5 = 1237;
            if (this.isIM) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i6 = (i4 + i) * 31;
            uu1.bar barVar = this.r;
            if (barVar != null) {
                i2 = barVar.hashCode();
            }
            int hashCode5 = (this.s.hashCode() + ((i6 + i2) * 31)) * 31;
            if (this.t) {
                i5 = 1231;
            }
            return this.u.hashCode() + ((hashCode5 + i5) * 31);
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isIM, reason: from getter */
        public final boolean getIsIM() {
            return this.isIM;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isSenderVerifiedForSmartFeatures, reason: from getter */
        public final boolean getG() {
            return this.t;
        }

        public final java.lang.String toString() {
            com.truecaller.insights.commons.utils.domain.OrderStatus orderStatus = this.orderStatus;
            com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus deliveryDomainConstants$OrderSubStatus = this.orderSubStatus;
            java.lang.String str = this.orderId;
            java.lang.String str2 = this.trackingId;
            java.lang.String str3 = this.orderItem;
            java.lang.String str4 = this.orderAmount;
            java.lang.String str5 = this.teleNum;
            com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes deliveryDomainConstants$UrlTypes = this.urlType;
            java.lang.String str6 = this.url;
            org.joda.time.DateTime dateTime = this.dateTime;
            java.lang.String str7 = this.agentPin;
            java.lang.String str8 = this.location;
            long j = this.msgId;
            java.lang.String str9 = this.sender;
            org.joda.time.DateTime dateTime2 = this.msgDateTime;
            long j2 = this.conversationId;
            boolean z = this.isIM;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Delivery(orderStatus=");
            sb.append(orderStatus);
            sb.append(", orderSubStatus=");
            sb.append(deliveryDomainConstants$OrderSubStatus);
            sb.append(", orderId=");
            bar.E(sb, str, ", trackingId=", str2, ", orderItem=");
            bar.E(sb, str3, ", orderAmount=", str4, ", teleNum=");
            sb.append(str5);
            sb.append(", urlType=");
            sb.append(deliveryDomainConstants$UrlTypes);
            sb.append(", url=");
            sb.append(str6);
            sb.append(", dateTime=");
            sb.append(dateTime);
            sb.append(", agentPin=");
            bar.E(sb, str7, ", location=", str8, ", msgId=");
            ro0.f.K(sb, j, ", sender=", str9);
            sb.append(", msgDateTime=");
            sb.append(dateTime2);
            sb.append(", conversationId=");
            bx.e1.A(sb, j2, ", isIM=", z);
            sb.append(", actionState=");
            sb.append(this.r);
            sb.append(", origin=");
            sb.append(this.s);
            sb.append(", isSenderVerifiedForSmartFeatures=");
            sb.append(this.t);
            sb.append(", message=");
            sb.append(this.u);
            sb.append(")");
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\b\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006R\u001a\u0010'\u001a\u00020\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0015R\u001a\u0010*\u001a\u00020\u001c8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010 R\u001a\u0010.\u001a\u00020+8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/truecaller/insights/database/models/InsightsDomain$b;", "Lcom/truecaller/insights/database/models/InsightsDomain;", "", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "eventType", "b", "c", "eventStatus", "d", "eventSubStatus", "getLocation", "location", "bookingId", "f", "name", "Lorg/joda/time/DateTime;", "g", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "dateTime", "h", "secretCode", "i", "getUrl", "url", "", "j", "J", "getMsgId", "()J", "msgId", "k", "getSender", "sender", "l", "getMsgDateTime", "msgDateTime", "m", "getConversationId", "conversationId", "", "n", "Z", "isIM", "()Z", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class b extends com.truecaller.insights.database.models.InsightsDomain {

        /* renamed from: a, reason: from kotlin metadata */
        @bw.qux("k")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String eventType;

        /* renamed from: b, reason: from kotlin metadata */
        @bw.qux("p")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String eventStatus;

        /* renamed from: c, reason: from kotlin metadata */
        @bw.qux("c")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String eventSubStatus;

        /* renamed from: d, reason: from kotlin metadata */
        @bw.qux("o")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String location;

        /* renamed from: e, reason: from kotlin metadata */
        @bw.qux("g")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String bookingId;

        /* renamed from: f, reason: from kotlin metadata */
        @bw.qux("s")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name;

        /* renamed from: g, reason: from kotlin metadata */
        @bw.qux("datetime")
        @org.jetbrains.annotations.Nullable
        private final org.joda.time.DateTime dateTime;

        /* renamed from: h, reason: from kotlin metadata */
        @bw.qux("val3")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String secretCode;

        /* renamed from: i, reason: from kotlin metadata */
        @bw.qux("dff_val5")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String url;

        /* renamed from: j, reason: from kotlin metadata */
        @bw.qux("messageID")
        private final long msgId;

        /* renamed from: k, reason: from kotlin metadata */
        @bw.qux("address")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String sender;

        /* renamed from: l, reason: from kotlin metadata */
        @bw.qux("msgdatetime")
        @org.jetbrains.annotations.NotNull
        private final org.joda.time.DateTime msgDateTime;

        /* renamed from: m, reason: from kotlin metadata */
        @bw.qux("conversation_id")
        private final long conversationId;

        /* renamed from: n, reason: from kotlin metadata */
        @bw.qux("is_im")
        private final boolean isIM;
        public final com.truecaller.insights.database.models.DomainOrigin o;
        public final boolean p;
        public final java.lang.String q;

        public b() {
            this(null, null, null, null, null, null, null, null, null, 0L, null, null, 0L, false, null, false, null, 262143);
        }

        /* renamed from: a, reason: from getter */
        public final java.lang.String getBookingId() {
            return this.bookingId;
        }

        /* renamed from: b, reason: from getter */
        public final org.joda.time.DateTime getDateTime() {
            return this.dateTime;
        }

        /* renamed from: c, reason: from getter */
        public final java.lang.String getEventStatus() {
            return this.eventStatus;
        }

        /* renamed from: d, reason: from getter */
        public final java.lang.String getEventSubStatus() {
            return this.eventSubStatus;
        }

        /* renamed from: e, reason: from getter */
        public final java.lang.String getEventType() {
            return this.eventType;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.database.models.InsightsDomain.b)) {
                return false;
            }
            com.truecaller.insights.database.models.InsightsDomain.b bVar = (com.truecaller.insights.database.models.InsightsDomain.b) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.eventType, bVar.eventType) && kotlin.jvm.internal.Intrinsics.b(this.eventStatus, bVar.eventStatus) && kotlin.jvm.internal.Intrinsics.b(this.eventSubStatus, bVar.eventSubStatus) && kotlin.jvm.internal.Intrinsics.b(this.location, bVar.location) && kotlin.jvm.internal.Intrinsics.b(this.bookingId, bVar.bookingId) && kotlin.jvm.internal.Intrinsics.b(this.name, bVar.name) && kotlin.jvm.internal.Intrinsics.b(this.dateTime, bVar.dateTime) && kotlin.jvm.internal.Intrinsics.b(this.secretCode, bVar.secretCode) && kotlin.jvm.internal.Intrinsics.b(this.url, bVar.url) && this.msgId == bVar.msgId && kotlin.jvm.internal.Intrinsics.b(this.sender, bVar.sender) && kotlin.jvm.internal.Intrinsics.b(this.msgDateTime, bVar.msgDateTime) && this.conversationId == bVar.conversationId && this.isIM == bVar.isIM && this.o == bVar.o && this.p == bVar.p && kotlin.jvm.internal.Intrinsics.b(this.q, bVar.q);
        }

        /* renamed from: f, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: g, reason: from getter */
        public final java.lang.String getSecretCode() {
            return this.secretCode;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getActionState */
        public final uu1.bar getY() {
            return null;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getConversationId() {
            return this.conversationId;
        }

        public final java.lang.String getLocation() {
            return this.location;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getMessage, reason: from getter */
        public final java.lang.String getH() {
            return this.q;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final org.joda.time.DateTime getMsgDateTime() {
            return this.msgDateTime;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getMsgId() {
            return this.msgId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getOrigin, reason: from getter */
        public final com.truecaller.insights.database.models.DomainOrigin getF() {
            return this.o;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final java.lang.String getSender() {
            return this.sender;
        }

        public final int hashCode() {
            int hashCode;
            int i;
            int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(this.eventType.hashCode() * 31, 31, this.eventStatus), 31, this.eventSubStatus), 31, this.location), 31, this.bookingId), 31, this.name);
            org.joda.time.DateTime dateTime = this.dateTime;
            if (dateTime == null) {
                hashCode = 0;
            } else {
                hashCode = dateTime.hashCode();
            }
            int e2 = ax1.bar.e(ax1.bar.e((e + hashCode) * 31, 31, this.secretCode), 31, this.url);
            long j = this.msgId;
            int w = ro0.f.w(this.msgDateTime, ax1.bar.e((e2 + ((int) (j ^ (j >>> 32)))) * 31, 31, this.sender), 31);
            long j2 = this.conversationId;
            int i2 = (w + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            int i3 = 1237;
            if (this.isIM) {
                i = 1231;
            } else {
                i = 1237;
            }
            int hashCode2 = (this.o.hashCode() + ((i2 + i) * 961)) * 31;
            if (this.p) {
                i3 = 1231;
            }
            return this.q.hashCode() + ((hashCode2 + i3) * 31);
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isIM, reason: from getter */
        public final boolean getIsIM() {
            return this.isIM;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isSenderVerifiedForSmartFeatures, reason: from getter */
        public final boolean getG() {
            return this.p;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.eventType;
            java.lang.String str2 = this.eventStatus;
            java.lang.String str3 = this.eventSubStatus;
            java.lang.String str4 = this.location;
            java.lang.String str5 = this.bookingId;
            java.lang.String str6 = this.name;
            org.joda.time.DateTime dateTime = this.dateTime;
            java.lang.String str7 = this.secretCode;
            java.lang.String str8 = this.url;
            long j = this.msgId;
            java.lang.String str9 = this.sender;
            org.joda.time.DateTime dateTime2 = this.msgDateTime;
            long j2 = this.conversationId;
            boolean z = this.isIM;
            java.lang.StringBuilder E = ro0.f.E("Event(eventType=", str, ", eventStatus=", str2, ", eventSubStatus=");
            bar.E(E, str3, ", location=", str4, ", bookingId=");
            bar.E(E, str5, ", name=", str6, ", dateTime=");
            E.append(dateTime);
            E.append(", secretCode=");
            E.append(str7);
            E.append(", url=");
            com.appsflyer.internal.e.y(E, j, str8, ", msgId=");
            E.append(", sender=");
            E.append(str9);
            E.append(", msgDateTime=");
            E.append(dateTime2);
            ro0.f.L(E, ", conversationId=", j2, ", isIM=");
            E.append(z);
            E.append(", actionState=null, origin=");
            E.append(this.o);
            E.append(", isSenderVerifiedForSmartFeatures=");
            E.append(this.p);
            E.append(", message=");
            E.append(this.q);
            E.append(")");
            return E.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, org.joda.time.DateTime dateTime, java.lang.String str7, java.lang.String str8, long j, java.lang.String str9, org.joda.time.DateTime dateTime2, long j2, boolean z, com.truecaller.insights.database.models.DomainOrigin domainOrigin, boolean z2, java.lang.String str10, int i) {
            super("Event", null);
            boolean z3;
            java.lang.String str11;
            java.lang.String str12 = (i & 1) != 0 ? "" : str;
            java.lang.String str13 = (i & 2) != 0 ? "" : str2;
            java.lang.String str14 = (i & 4) != 0 ? "" : str3;
            java.lang.String str15 = (i & 8) != 0 ? "" : str4;
            java.lang.String str16 = (i & 16) != 0 ? "" : str5;
            java.lang.String str17 = (i & 32) != 0 ? "" : str6;
            org.joda.time.DateTime dateTime3 = (i & 64) != 0 ? null : dateTime;
            java.lang.String str18 = (i & 128) != 0 ? "" : str7;
            java.lang.String str19 = (i & 256) != 0 ? "" : str8;
            long j3 = (i & 512) != 0 ? -1L : j;
            java.lang.String str20 = (i & 1024) != 0 ? "" : str9;
            org.joda.time.DateTime v = (i & 2048) != 0 ? wi0.bar.v("now(...)") : dateTime2;
            long j4 = (i & 4096) != 0 ? -1L : j2;
            boolean z4 = (i & 8192) != 0 ? false : z;
            com.truecaller.insights.database.models.DomainOrigin domainOrigin2 = (i & 32768) != 0 ? com.truecaller.insights.database.models.DomainOrigin.SMS : domainOrigin;
            boolean z5 = (i & 65536) != 0 ? false : z2;
            if ((i & 131072) != 0) {
                z3 = z4;
                str11 = "";
            } else {
                z3 = z4;
                str11 = str10;
            }
            long j5 = j3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str12, "eventType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str13, "eventStatus");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str14, "eventSubStatus");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str15, "location");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str16, "bookingId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str17, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str18, "secretCode");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str19, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str20, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "msgDateTime");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainOrigin2, "origin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "message");
            this.eventType = str12;
            this.eventStatus = str13;
            this.eventSubStatus = str14;
            this.location = str15;
            this.bookingId = str16;
            this.name = str17;
            this.dateTime = dateTime3;
            this.secretCode = str18;
            this.url = str19;
            this.msgId = j5;
            this.sender = str20;
            this.msgDateTime = v;
            this.conversationId = j4;
            this.isIM = z3;
            this.o = domainOrigin2;
            this.p = z5;
            this.q = str11;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u001c\u0010%\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u001a\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u001a\u0010,\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010\u0006R\u001a\u0010/\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R\u001a\u00105\u001a\u0002008\u0016X\u0097\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010;\u001a\u0002068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010A\u001a\u00020<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010E\u001a\u00020B8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lcom/truecaller/insights/database/models/InsightsDomain$bar;", "Lcom/truecaller/insights/database/models/InsightsDomain;", "", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "trxCategory", "b", "h", "trxSubCategory", "c", "i", "trxType", "d", "accType", "e", "auxInstr", "getRefId", "refId", "g", "j", "vendor", "accNum", "auxInstrVal", "trxAmt", "k", "getBalAmt", "balAmt", "l", "getTotCrdLmt", "totCrdLmt", "Lorg/joda/time/LocalDate;", "m", "Lorg/joda/time/LocalDate;", "getDate", "()Lorg/joda/time/LocalDate;", "date", "n", "trxCurrency", "o", "vendorNorm", "p", "getLoc", "loc", "q", "getSender", "sender", "Lorg/joda/time/DateTime;", "r", "Lorg/joda/time/DateTime;", "getMsgDateTime", "()Lorg/joda/time/DateTime;", "msgDateTime", "", "s", "J", "getConversationId", "()J", "conversationId", "", "t", "I", "getSpamCategory", "()I", "spamCategory", "", "u", "Z", "isIM", "()Z", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class bar extends com.truecaller.insights.database.models.InsightsDomain {

        /* renamed from: a, reason: from kotlin metadata */
        @bw.qux("k")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String trxCategory;

        /* renamed from: b, reason: from kotlin metadata */
        @bw.qux("p")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String trxSubCategory;

        /* renamed from: c, reason: from kotlin metadata */
        @bw.qux("c")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String trxType;

        /* renamed from: d, reason: from kotlin metadata */
        @bw.qux("o")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String accType;

        /* renamed from: e, reason: from kotlin metadata */
        @bw.qux("f")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String auxInstr;

        /* renamed from: f, reason: from kotlin metadata */
        @bw.qux("g")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String refId;

        /* renamed from: g, reason: from kotlin metadata */
        @bw.qux("s")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String vendor;

        /* renamed from: h, reason: from kotlin metadata */
        @bw.qux("val1")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String accNum;

        /* renamed from: i, reason: from kotlin metadata */
        @bw.qux("val2")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String auxInstrVal;

        /* renamed from: j, reason: from kotlin metadata */
        @bw.qux("val3")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String trxAmt;

        /* renamed from: k, reason: from kotlin metadata */
        @bw.qux("val4")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String balAmt;

        /* renamed from: l, reason: from kotlin metadata */
        @bw.qux("val5")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String totCrdLmt;

        /* renamed from: m, reason: from kotlin metadata */
        @bw.qux("date")
        @org.jetbrains.annotations.Nullable
        private final org.joda.time.LocalDate date;

        /* renamed from: n, reason: from kotlin metadata */
        @bw.qux("dffVal1")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String trxCurrency;

        /* renamed from: o, reason: from kotlin metadata */
        @bw.qux("dffVal2")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String vendorNorm;

        /* renamed from: p, reason: from kotlin metadata */
        @bw.qux("dffVal3")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String loc;

        /* renamed from: q, reason: from kotlin metadata */
        @bw.qux("address")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String sender;

        /* renamed from: r, reason: from kotlin metadata */
        @bw.qux("msgdatetime")
        @org.jetbrains.annotations.NotNull
        private final org.joda.time.DateTime msgDateTime;

        /* renamed from: s, reason: from kotlin metadata */
        @bw.qux("conversation_id")
        private final long conversationId;

        /* renamed from: t, reason: from kotlin metadata */
        @bw.qux("spam_category")
        private final int spamCategory;

        /* renamed from: u, reason: from kotlin metadata */
        @bw.qux("is_im")
        private final boolean isIM;
        public final long v;
        public final com.truecaller.insights.database.models.DomainOrigin w;
        public final boolean x;
        public final java.lang.String y;

        public bar() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, null, 67108863);
        }

        /* renamed from: a, reason: from getter */
        public final java.lang.String getAccNum() {
            return this.accNum;
        }

        /* renamed from: b, reason: from getter */
        public final java.lang.String getAccType() {
            return this.accType;
        }

        /* renamed from: c, reason: from getter */
        public final java.lang.String getAuxInstr() {
            return this.auxInstr;
        }

        /* renamed from: d, reason: from getter */
        public final java.lang.String getAuxInstrVal() {
            return this.auxInstrVal;
        }

        /* renamed from: e, reason: from getter */
        public final java.lang.String getTrxAmt() {
            return this.trxAmt;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.database.models.InsightsDomain.bar)) {
                return false;
            }
            com.truecaller.insights.database.models.InsightsDomain.bar barVar = (com.truecaller.insights.database.models.InsightsDomain.bar) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.trxCategory, barVar.trxCategory) && kotlin.jvm.internal.Intrinsics.b(this.trxSubCategory, barVar.trxSubCategory) && kotlin.jvm.internal.Intrinsics.b(this.trxType, barVar.trxType) && kotlin.jvm.internal.Intrinsics.b(this.accType, barVar.accType) && kotlin.jvm.internal.Intrinsics.b(this.auxInstr, barVar.auxInstr) && kotlin.jvm.internal.Intrinsics.b(this.refId, barVar.refId) && kotlin.jvm.internal.Intrinsics.b(this.vendor, barVar.vendor) && kotlin.jvm.internal.Intrinsics.b(this.accNum, barVar.accNum) && kotlin.jvm.internal.Intrinsics.b(this.auxInstrVal, barVar.auxInstrVal) && kotlin.jvm.internal.Intrinsics.b(this.trxAmt, barVar.trxAmt) && kotlin.jvm.internal.Intrinsics.b(this.balAmt, barVar.balAmt) && kotlin.jvm.internal.Intrinsics.b(this.totCrdLmt, barVar.totCrdLmt) && kotlin.jvm.internal.Intrinsics.b(this.date, barVar.date) && kotlin.jvm.internal.Intrinsics.b(this.trxCurrency, barVar.trxCurrency) && kotlin.jvm.internal.Intrinsics.b(this.vendorNorm, barVar.vendorNorm) && kotlin.jvm.internal.Intrinsics.b(this.loc, barVar.loc) && kotlin.jvm.internal.Intrinsics.b(this.sender, barVar.sender) && kotlin.jvm.internal.Intrinsics.b(this.msgDateTime, barVar.msgDateTime) && this.conversationId == barVar.conversationId && this.spamCategory == barVar.spamCategory && this.isIM == barVar.isIM && this.v == barVar.v && this.w == barVar.w && this.x == barVar.x && kotlin.jvm.internal.Intrinsics.b(this.y, barVar.y);
        }

        /* renamed from: f, reason: from getter */
        public final java.lang.String getTrxCategory() {
            return this.trxCategory;
        }

        /* renamed from: g, reason: from getter */
        public final java.lang.String getTrxCurrency() {
            return this.trxCurrency;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getActionState */
        public final uu1.bar getY() {
            return null;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getConversationId() {
            return this.conversationId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getMessage, reason: from getter */
        public final java.lang.String getH() {
            return this.y;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final org.joda.time.DateTime getMsgDateTime() {
            return this.msgDateTime;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getMsgId() {
            return this.v;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getOrigin, reason: from getter */
        public final com.truecaller.insights.database.models.DomainOrigin getF() {
            return this.w;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final java.lang.String getSender() {
            return this.sender;
        }

        /* renamed from: h, reason: from getter */
        public final java.lang.String getTrxSubCategory() {
            return this.trxSubCategory;
        }

        public final int hashCode() {
            int hashCode;
            int i;
            int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(this.trxCategory.hashCode() * 31, 31, this.trxSubCategory), 31, this.trxType), 31, this.accType), 31, this.auxInstr), 31, this.refId), 31, this.vendor), 31, this.accNum), 31, this.auxInstrVal), 31, this.trxAmt), 31, this.balAmt), 31, this.totCrdLmt);
            org.joda.time.LocalDate localDate = this.date;
            if (localDate == null) {
                hashCode = 0;
            } else {
                hashCode = localDate.hashCode();
            }
            int w = ro0.f.w(this.msgDateTime, ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e((e + hashCode) * 31, 31, this.trxCurrency), 31, this.vendorNorm), 31, this.loc), 31, this.sender), 31);
            long j = this.conversationId;
            int i2 = (((w + ((int) (j ^ (j >>> 32)))) * 31) + this.spamCategory) * 31;
            int i3 = 1237;
            if (this.isIM) {
                i = 1231;
            } else {
                i = 1237;
            }
            long j2 = this.v;
            int hashCode2 = (this.w.hashCode() + ((((i2 + i) * 961) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
            if (this.x) {
                i3 = 1231;
            }
            return this.y.hashCode() + ((hashCode2 + i3) * 31);
        }

        /* renamed from: i, reason: from getter */
        public final java.lang.String getTrxType() {
            return this.trxType;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isIM, reason: from getter */
        public final boolean getIsIM() {
            return this.isIM;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isSenderVerifiedForSmartFeatures, reason: from getter */
        public final boolean getG() {
            return this.x;
        }

        /* renamed from: j, reason: from getter */
        public final java.lang.String getVendor() {
            return this.vendor;
        }

        /* renamed from: k, reason: from getter */
        public final java.lang.String getVendorNorm() {
            return this.vendorNorm;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.trxCategory;
            java.lang.String str2 = this.trxSubCategory;
            java.lang.String str3 = this.trxType;
            java.lang.String str4 = this.accType;
            java.lang.String str5 = this.auxInstr;
            java.lang.String str6 = this.refId;
            java.lang.String str7 = this.vendor;
            java.lang.String str8 = this.accNum;
            java.lang.String str9 = this.auxInstrVal;
            java.lang.String str10 = this.trxAmt;
            java.lang.String str11 = this.balAmt;
            java.lang.String str12 = this.totCrdLmt;
            org.joda.time.LocalDate localDate = this.date;
            java.lang.String str13 = this.trxCurrency;
            java.lang.String str14 = this.vendorNorm;
            java.lang.String str15 = this.loc;
            java.lang.String str16 = this.sender;
            org.joda.time.DateTime dateTime = this.msgDateTime;
            long j = this.conversationId;
            int i = this.spamCategory;
            boolean z = this.isIM;
            java.lang.StringBuilder E = ro0.f.E("Bank(trxCategory=", str, ", trxSubCategory=", str2, ", trxType=");
            bar.E(E, str3, ", accType=", str4, ", auxInstr=");
            bar.E(E, str5, ", refId=", str6, ", vendor=");
            bar.E(E, str7, ", accNum=", str8, ", auxInstrVal=");
            bar.E(E, str9, ", trxAmt=", str10, ", balAmt=");
            bar.E(E, str11, ", totCrdLmt=", str12, ", date=");
            E.append(localDate);
            E.append(", trxCurrency=");
            E.append(str13);
            E.append(", vendorNorm=");
            bar.E(E, str14, ", loc=", str15, ", sender=");
            E.append(str16);
            E.append(", msgDateTime=");
            E.append(dateTime);
            E.append(", conversationId=");
            h8.s0.y(i, j, ", spamCategory=", E);
            E.append(", isIM=");
            E.append(z);
            E.append(", actionState=null, msgId=");
            E.append(this.v);
            E.append(", origin=");
            E.append(this.w);
            E.append(", isSenderVerifiedForSmartFeatures=");
            E.append(this.x);
            E.append(", message=");
            E.append(this.y);
            E.append(")");
            return E.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public bar(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, org.joda.time.LocalDate localDate, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, org.joda.time.DateTime dateTime, long j, int i, boolean z, long j2, com.truecaller.insights.database.models.DomainOrigin domainOrigin, boolean z2, java.lang.String str17, int i2) {
            super("Bank", null);
            java.lang.String str18 = (i2 & 1) != 0 ? "" : str;
            java.lang.String str19 = (i2 & 2) != 0 ? "" : str2;
            java.lang.String str20 = (i2 & 4) != 0 ? "" : str3;
            java.lang.String str21 = (i2 & 8) != 0 ? "" : str4;
            java.lang.String str22 = (i2 & 16) != 0 ? "" : str5;
            java.lang.String str23 = (i2 & 32) != 0 ? "" : str6;
            java.lang.String str24 = (i2 & 64) != 0 ? "" : str7;
            java.lang.String str25 = (i2 & 128) != 0 ? "" : str8;
            java.lang.String str26 = (i2 & 256) != 0 ? "" : str9;
            java.lang.String str27 = (i2 & 512) != 0 ? "" : str10;
            java.lang.String str28 = (i2 & 1024) != 0 ? "" : str11;
            java.lang.String str29 = (i2 & 2048) != 0 ? "" : str12;
            org.joda.time.LocalDate localDate2 = (i2 & 4096) != 0 ? null : localDate;
            java.lang.String str30 = (i2 & 8192) != 0 ? "" : str13;
            org.joda.time.LocalDate localDate3 = localDate2;
            java.lang.String str31 = (i2 & 16384) != 0 ? "" : str14;
            java.lang.String str32 = (i2 & 32768) != 0 ? "" : str15;
            java.lang.String str33 = (i2 & 65536) != 0 ? "" : str16;
            org.joda.time.DateTime v = (i2 & 131072) != 0 ? wi0.bar.v("now(...)") : dateTime;
            long j3 = (i2 & 262144) != 0 ? -1L : j;
            int i3 = (i2 & 524288) != 0 ? 1 : i;
            boolean z3 = (i2 & 1048576) != 0 ? false : z;
            long j4 = (i2 & 4194304) != 0 ? -1L : j2;
            com.truecaller.insights.database.models.DomainOrigin domainOrigin2 = (i2 & 8388608) != 0 ? com.truecaller.insights.database.models.DomainOrigin.SMS : domainOrigin;
            boolean z4 = (i2 & 16777216) != 0 ? false : z2;
            java.lang.String str34 = (i2 & 33554432) != 0 ? "" : str17;
            java.lang.String str35 = str33;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str18, "trxCategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str19, "trxSubCategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str20, "trxType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str21, "accType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str22, "auxInstr");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str23, "refId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str24, "vendor");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str25, "accNum");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str26, "auxInstrVal");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str27, "trxAmt");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str28, "balAmt");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str29, "totCrdLmt");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str30, "trxCurrency");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str31, "vendorNorm");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str32, "loc");
            java.lang.String str36 = str32;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str35, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "msgDateTime");
            com.truecaller.insights.database.models.DomainOrigin domainOrigin3 = domainOrigin2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainOrigin3, "origin");
            java.lang.String str37 = str34;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str37, "message");
            this.trxCategory = str18;
            this.trxSubCategory = str19;
            this.trxType = str20;
            this.accType = str21;
            this.auxInstr = str22;
            this.refId = str23;
            this.vendor = str24;
            this.accNum = str25;
            this.auxInstrVal = str26;
            this.trxAmt = str27;
            this.balAmt = str28;
            this.totCrdLmt = str29;
            this.date = localDate3;
            this.trxCurrency = str30;
            this.vendorNorm = str31;
            this.loc = str36;
            this.sender = str35;
            this.msgDateTime = v;
            this.conversationId = j3;
            this.spamCategory = i3;
            this.isIM = z3;
            this.v = j4;
            this.w = domainOrigin3;
            this.x = z4;
            this.y = str37;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u001a\u001a\u00020\u00178\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001d\u0010\fR\u001a\u0010!\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\fR\u001a\u0010$\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b#\u0010\fR\u001a\u0010*\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010-\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b,\u0010\fR\u001a\u00100\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\n\u001a\u0004\b/\u0010\fR\u001a\u00103\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b2\u0010\fR\u001a\u00106\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b5\u0010\f¨\u00067"}, d2 = {"Lcom/truecaller/insights/database/models/InsightsDomain$baz;", "Lcom/truecaller/insights/database/models/InsightsDomain;", "", "a", "J", "getMsgId", "()J", "msgId", "", "b", "Ljava/lang/String;", "getSender", "()Ljava/lang/String;", "sender", "Lorg/joda/time/DateTime;", "c", "Lorg/joda/time/DateTime;", "getMsgDateTime", "()Lorg/joda/time/DateTime;", "msgDateTime", "d", "getConversationId", "conversationId", "", "e", "Z", "isIM", "()Z", "j", "getBlacklistCategory", "blacklistCategory", "k", "getBlacklistSubcategory", "blacklistSubcategory", "l", "getPatternId", "patternId", "", "m", "I", "getThreshold", "()I", "threshold", "n", "getSubPatterns", "subPatterns", "o", "getUrlType", "urlType", "p", "getTeleNum", "teleNum", "q", "getUrl", "url", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class baz extends com.truecaller.insights.database.models.InsightsDomain {

        /* renamed from: a, reason: from kotlin metadata */
        @bw.qux("messageID")
        private final long msgId;

        /* renamed from: b, reason: from kotlin metadata */
        @bw.qux("address")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String sender;

        /* renamed from: c, reason: from kotlin metadata */
        @bw.qux("msgdatetime")
        @org.jetbrains.annotations.NotNull
        private final org.joda.time.DateTime msgDateTime;

        /* renamed from: d, reason: from kotlin metadata */
        @bw.qux("conversation_id")
        private final long conversationId;

        /* renamed from: e, reason: from kotlin metadata */
        @bw.qux("is_im")
        private final boolean isIM;
        public final com.truecaller.insights.database.models.DomainOrigin f;
        public final boolean g;
        public final java.lang.String h;
        public final com.truecaller.insights.models.pdo.ClassifierType i;

        /* renamed from: j, reason: from kotlin metadata */
        @bw.qux("k")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String blacklistCategory;

        /* renamed from: k, reason: from kotlin metadata */
        @bw.qux("p")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String blacklistSubcategory;

        /* renamed from: l, reason: from kotlin metadata */
        @bw.qux("c")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String patternId;

        /* renamed from: m, reason: from kotlin metadata */
        @bw.qux("o")
        private final int threshold;

        /* renamed from: n, reason: from kotlin metadata */
        @bw.qux("f")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String subPatterns;

        /* renamed from: o, reason: from kotlin metadata */
        @bw.qux("dff_val3")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String urlType;

        /* renamed from: p, reason: from kotlin metadata */
        @bw.qux("dff_val4")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String teleNum;

        /* renamed from: q, reason: from kotlin metadata */
        @bw.qux("dff_val5")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public baz(long j, java.lang.String str, org.joda.time.DateTime dateTime, long j2, boolean z, com.truecaller.insights.database.models.DomainOrigin domainOrigin, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
            super("Blacklist", null);
            com.truecaller.insights.models.pdo.ClassifierType classifierType = com.truecaller.insights.models.pdo.ClassifierType.DEFAULT;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "msgDateTime");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainOrigin, "origin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifierType, "classifiedBy");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "blacklistCategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "blacklistSubcategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "patternId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "subPatterns");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "urlType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "teleNum");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "url");
            this.msgId = j;
            this.sender = str;
            this.msgDateTime = dateTime;
            this.conversationId = j2;
            this.isIM = z;
            this.f = domainOrigin;
            this.g = z2;
            this.h = str2;
            this.i = classifierType;
            this.blacklistCategory = str3;
            this.blacklistSubcategory = str4;
            this.patternId = str5;
            this.threshold = i;
            this.subPatterns = str6;
            this.urlType = str7;
            this.teleNum = str8;
            this.url = str9;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.database.models.InsightsDomain.baz)) {
                return false;
            }
            com.truecaller.insights.database.models.InsightsDomain.baz bazVar = (com.truecaller.insights.database.models.InsightsDomain.baz) obj;
            return this.msgId == bazVar.msgId && kotlin.jvm.internal.Intrinsics.b(this.sender, bazVar.sender) && kotlin.jvm.internal.Intrinsics.b(this.msgDateTime, bazVar.msgDateTime) && this.conversationId == bazVar.conversationId && this.isIM == bazVar.isIM && this.f == bazVar.f && this.g == bazVar.g && kotlin.jvm.internal.Intrinsics.b(this.h, bazVar.h) && this.i == bazVar.i && kotlin.jvm.internal.Intrinsics.b(this.blacklistCategory, bazVar.blacklistCategory) && kotlin.jvm.internal.Intrinsics.b(this.blacklistSubcategory, bazVar.blacklistSubcategory) && kotlin.jvm.internal.Intrinsics.b(this.patternId, bazVar.patternId) && this.threshold == bazVar.threshold && kotlin.jvm.internal.Intrinsics.b(this.subPatterns, bazVar.subPatterns) && kotlin.jvm.internal.Intrinsics.b(this.urlType, bazVar.urlType) && kotlin.jvm.internal.Intrinsics.b(this.teleNum, bazVar.teleNum) && kotlin.jvm.internal.Intrinsics.b(this.url, bazVar.url);
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getActionState */
        public final uu1.bar getY() {
            return null;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getConversationId() {
            return this.conversationId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getMessage, reason: from getter */
        public final java.lang.String getH() {
            return this.h;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final org.joda.time.DateTime getMsgDateTime() {
            return this.msgDateTime;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getMsgId() {
            return this.msgId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getOrigin, reason: from getter */
        public final com.truecaller.insights.database.models.DomainOrigin getF() {
            return this.f;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final java.lang.String getSender() {
            return this.sender;
        }

        public final int hashCode() {
            int i;
            long j = this.msgId;
            int w = ro0.f.w(this.msgDateTime, ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.sender), 31);
            long j2 = this.conversationId;
            int i2 = (w + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            int i3 = 1237;
            if (this.isIM) {
                i = 1231;
            } else {
                i = 1237;
            }
            int hashCode = (this.f.hashCode() + ((i2 + i) * 961)) * 31;
            if (this.g) {
                i3 = 1231;
            }
            return this.url.hashCode() + ax1.bar.e(ax1.bar.e(ax1.bar.e((ax1.bar.e(ax1.bar.e(ax1.bar.e((this.i.hashCode() + ax1.bar.e((hashCode + i3) * 31, 31, this.h)) * 31, 31, this.blacklistCategory), 31, this.blacklistSubcategory), 31, this.patternId) + this.threshold) * 31, 31, this.subPatterns), 31, this.urlType), 31, this.teleNum);
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isIM, reason: from getter */
        public final boolean getIsIM() {
            return this.isIM;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isSenderVerifiedForSmartFeatures, reason: from getter */
        public final boolean getG() {
            return this.g;
        }

        public final java.lang.String toString() {
            long j = this.msgId;
            java.lang.String str = this.sender;
            org.joda.time.DateTime dateTime = this.msgDateTime;
            long j2 = this.conversationId;
            boolean z = this.isIM;
            java.lang.String str2 = this.blacklistCategory;
            java.lang.String str3 = this.blacklistSubcategory;
            java.lang.String str4 = this.patternId;
            int i = this.threshold;
            java.lang.String str5 = this.subPatterns;
            java.lang.String str6 = this.urlType;
            java.lang.String str7 = this.teleNum;
            java.lang.String str8 = this.url;
            java.lang.StringBuilder p = com.appsflyer.internal.e.p("Blacklist(msgId=", j, ", sender=", str);
            p.append(", msgDateTime=");
            p.append(dateTime);
            p.append(", conversationId=");
            bx.e1.A(p, j2, ", isIM=", z);
            p.append(", actionState=null, origin=");
            p.append(this.f);
            p.append(", isSenderVerifiedForSmartFeatures=");
            p.append(this.g);
            p.append(", message=");
            p.append(this.h);
            p.append(", classifiedBy=");
            p.append(this.i);
            bar.E(p, ", blacklistCategory=", str2, ", blacklistSubcategory=", str3);
            p.append(", patternId=");
            p.append(str4);
            p.append(", threshold=");
            p.append(i);
            bar.E(p, ", subPatterns=", str5, ", urlType=", str6);
            bar.E(p, ", teleNum=", str7, ", url=", str8);
            p.append(")");
            return p.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0005R\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00198\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/truecaller/insights/database/models/InsightsDomain$c;", "Lcom/truecaller/insights/database/models/InsightsDomain;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "notifCategory", "", "b", "J", "getMsgId", "()J", "msgId", "c", "getSender", "sender", "Lorg/joda/time/DateTime;", "d", "Lorg/joda/time/DateTime;", "getMsgDateTime", "()Lorg/joda/time/DateTime;", "msgDateTime", "e", "getConversationId", "conversationId", "", "f", "Z", "isIM", "()Z", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class c extends com.truecaller.insights.database.models.InsightsDomain {

        /* renamed from: a, reason: from kotlin metadata */
        @bw.qux("k")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String notifCategory;

        /* renamed from: b, reason: from kotlin metadata */
        @bw.qux("messageID")
        private final long msgId;

        /* renamed from: c, reason: from kotlin metadata */
        @bw.qux("address")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String sender;

        /* renamed from: d, reason: from kotlin metadata */
        @bw.qux("msgdatetime")
        @org.jetbrains.annotations.NotNull
        private final org.joda.time.DateTime msgDateTime;

        /* renamed from: e, reason: from kotlin metadata */
        @bw.qux("conversation_id")
        private final long conversationId;

        /* renamed from: f, reason: from kotlin metadata */
        @bw.qux("is_im")
        private final boolean isIM;
        public final com.truecaller.insights.database.models.DomainOrigin g;
        public final boolean h;
        public final java.lang.String i;

        public c() {
            this(null, 0L, null, null, 0L, false, null, false, null, 1023);
        }

        /* renamed from: a, reason: from getter */
        public final java.lang.String getNotifCategory() {
            return this.notifCategory;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.database.models.InsightsDomain.c)) {
                return false;
            }
            com.truecaller.insights.database.models.InsightsDomain.c cVar = (com.truecaller.insights.database.models.InsightsDomain.c) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.notifCategory, cVar.notifCategory) && this.msgId == cVar.msgId && kotlin.jvm.internal.Intrinsics.b(this.sender, cVar.sender) && kotlin.jvm.internal.Intrinsics.b(this.msgDateTime, cVar.msgDateTime) && this.conversationId == cVar.conversationId && this.isIM == cVar.isIM && this.g == cVar.g && this.h == cVar.h && kotlin.jvm.internal.Intrinsics.b(this.i, cVar.i);
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getActionState */
        public final uu1.bar getY() {
            return null;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getConversationId() {
            return this.conversationId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getMessage, reason: from getter */
        public final java.lang.String getH() {
            return this.i;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final org.joda.time.DateTime getMsgDateTime() {
            return this.msgDateTime;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getMsgId() {
            return this.msgId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getOrigin, reason: from getter */
        public final com.truecaller.insights.database.models.DomainOrigin getF() {
            return this.g;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final java.lang.String getSender() {
            return this.sender;
        }

        public final int hashCode() {
            int i;
            int hashCode = this.notifCategory.hashCode() * 31;
            long j = this.msgId;
            int w = ro0.f.w(this.msgDateTime, ax1.bar.e((hashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.sender), 31);
            long j2 = this.conversationId;
            int i2 = (w + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            int i3 = 1237;
            if (this.isIM) {
                i = 1231;
            } else {
                i = 1237;
            }
            int hashCode2 = (this.g.hashCode() + ((i2 + i) * 961)) * 31;
            if (this.h) {
                i3 = 1231;
            }
            return this.i.hashCode() + ((hashCode2 + i3) * 31);
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isIM, reason: from getter */
        public final boolean getIsIM() {
            return this.isIM;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isSenderVerifiedForSmartFeatures, reason: from getter */
        public final boolean getG() {
            return this.h;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.notifCategory;
            long j = this.msgId;
            java.lang.String str2 = this.sender;
            org.joda.time.DateTime dateTime = this.msgDateTime;
            long j2 = this.conversationId;
            boolean z = this.isIM;
            java.lang.StringBuilder q = com.appsflyer.internal.e.q("Notif(notifCategory=", str, ", msgId=", j);
            q.append(", sender=");
            q.append(str2);
            q.append(", msgDateTime=");
            q.append(dateTime);
            ro0.f.L(q, ", conversationId=", j2, ", isIM=");
            q.append(z);
            q.append(", actionState=null, origin=");
            q.append(this.g);
            q.append(", isSenderVerifiedForSmartFeatures=");
            q.append(this.h);
            q.append(", message=");
            q.append(this.i);
            q.append(")");
            return q.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(java.lang.String str, long j, java.lang.String str2, org.joda.time.DateTime dateTime, long j2, boolean z, com.truecaller.insights.database.models.DomainOrigin domainOrigin, boolean z2, java.lang.String str3, int i) {
            super("Notif", null);
            str = (i & 1) != 0 ? "" : str;
            long j3 = (i & 2) != 0 ? -1L : j;
            java.lang.String str4 = (i & 4) != 0 ? "" : str2;
            org.joda.time.DateTime v = (i & 8) != 0 ? wi0.bar.v("now(...)") : dateTime;
            long j4 = (i & 16) == 0 ? j2 : -1L;
            boolean z3 = (i & 32) != 0 ? false : z;
            com.truecaller.insights.database.models.DomainOrigin domainOrigin2 = (i & 128) != 0 ? com.truecaller.insights.database.models.DomainOrigin.SMS : domainOrigin;
            boolean z4 = (i & 256) == 0 ? z2 : false;
            java.lang.String str5 = (i & 512) == 0 ? str3 : "";
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "notifCategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "msgDateTime");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainOrigin2, "origin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "message");
            this.notifCategory = str;
            this.msgId = j3;
            this.sender = str4;
            this.msgDateTime = v;
            this.conversationId = j4;
            this.isIM = z3;
            this.g = domainOrigin2;
            this.h = z4;
            this.i = str5;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00168\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/truecaller/insights/database/models/InsightsDomain$d;", "Lcom/truecaller/insights/database/models/InsightsDomain;", "", "a", "J", "getMsgId", "()J", "msgId", "b", "getConversationId", "conversationId", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "code", "Lorg/joda/time/DateTime;", "d", "Lorg/joda/time/DateTime;", "getMsgDateTime", "()Lorg/joda/time/DateTime;", "msgDateTime", "", "e", "Z", "isIM", "()Z", "f", "getSender", "sender", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class d extends com.truecaller.insights.database.models.InsightsDomain {

        /* renamed from: a, reason: from kotlin metadata */
        @bw.qux("messageID")
        private final long msgId;

        /* renamed from: b, reason: from kotlin metadata */
        @bw.qux("conversation_id")
        private final long conversationId;

        /* renamed from: c, reason: from kotlin metadata */
        @bw.qux("g")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String code;

        /* renamed from: d, reason: from kotlin metadata */
        @bw.qux("msgdatetime")
        @org.jetbrains.annotations.NotNull
        private final org.joda.time.DateTime msgDateTime;

        /* renamed from: e, reason: from kotlin metadata */
        @bw.qux("is_im")
        private final boolean isIM;

        /* renamed from: f, reason: from kotlin metadata */
        @bw.qux("address")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String sender;
        public final com.truecaller.insights.database.models.DomainOrigin g;
        public final java.lang.String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, long j2, java.lang.String str, org.joda.time.DateTime dateTime, boolean z, java.lang.String str2, com.truecaller.insights.database.models.DomainOrigin domainOrigin, java.lang.String str3) {
            super("Offers", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "code");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "msgDateTime");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainOrigin, "origin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "message");
            this.msgId = j;
            this.conversationId = j2;
            this.code = str;
            this.msgDateTime = dateTime;
            this.isIM = z;
            this.sender = str2;
            this.g = domainOrigin;
            this.h = str3;
        }

        /* renamed from: a, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.database.models.InsightsDomain.d)) {
                return false;
            }
            com.truecaller.insights.database.models.InsightsDomain.d dVar = (com.truecaller.insights.database.models.InsightsDomain.d) obj;
            return this.msgId == dVar.msgId && this.conversationId == dVar.conversationId && kotlin.jvm.internal.Intrinsics.b(this.code, dVar.code) && kotlin.jvm.internal.Intrinsics.b(this.msgDateTime, dVar.msgDateTime) && this.isIM == dVar.isIM && kotlin.jvm.internal.Intrinsics.b(this.sender, dVar.sender) && this.g == dVar.g && kotlin.jvm.internal.Intrinsics.b(this.h, dVar.h);
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getActionState */
        public final uu1.bar getY() {
            return null;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getConversationId() {
            return this.conversationId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getMessage, reason: from getter */
        public final java.lang.String getH() {
            return this.h;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final org.joda.time.DateTime getMsgDateTime() {
            return this.msgDateTime;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getMsgId() {
            return this.msgId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getOrigin, reason: from getter */
        public final com.truecaller.insights.database.models.DomainOrigin getF() {
            return this.g;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final java.lang.String getSender() {
            return this.sender;
        }

        public final int hashCode() {
            int i;
            long j = this.msgId;
            long j2 = this.conversationId;
            int w = ro0.f.w(this.msgDateTime, ax1.bar.e(((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.code), 31);
            if (this.isIM) {
                i = 1231;
            } else {
                i = 1237;
            }
            return this.h.hashCode() + ((((this.g.hashCode() + ax1.bar.e((w + i) * 31, 961, this.sender)) * 31) + 1237) * 31);
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isIM, reason: from getter */
        public final boolean getIsIM() {
            return this.isIM;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isSenderVerifiedForSmartFeatures */
        public final boolean getG() {
            return false;
        }

        public final java.lang.String toString() {
            long j = this.msgId;
            long j2 = this.conversationId;
            java.lang.String str = this.code;
            org.joda.time.DateTime dateTime = this.msgDateTime;
            boolean z = this.isIM;
            java.lang.String str2 = this.sender;
            java.lang.StringBuilder T = h0.b.T(j, "Offers(msgId=", ", conversationId=");
            ro0.f.K(T, j2, ", code=", str);
            T.append(", msgDateTime=");
            T.append(dateTime);
            T.append(", isIM=");
            T.append(z);
            T.append(", sender=");
            T.append(str2);
            T.append(", actionState=null, origin=");
            T.append(this.g);
            return y.o.f(", isSenderVerifiedForSmartFeatures=false, message=", this.h, ")", T);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0003\u0010\u000eR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u001c8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000e¨\u0006$"}, d2 = {"Lcom/truecaller/insights/database/models/InsightsDomain$e;", "Lcom/truecaller/insights/database/models/InsightsDomain;", "", "a", "J", "getMsgId", "()J", "msgId", "b", "getConversationId", "conversationId", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "otp", "Lorg/joda/time/DateTime;", "d", "Lorg/joda/time/DateTime;", "getMsgDateTime", "()Lorg/joda/time/DateTime;", "msgDateTime", "e", "codeType", "f", "trxAmt", "g", "trxCurrency", "", "h", "Z", "isIM", "()Z", "i", "getSender", "sender", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class e extends com.truecaller.insights.database.models.InsightsDomain {

        /* renamed from: a, reason: from kotlin metadata */
        @bw.qux("messageID")
        private final long msgId;

        /* renamed from: b, reason: from kotlin metadata */
        @bw.qux("conversation_id")
        private final long conversationId;

        /* renamed from: c, reason: from kotlin metadata */
        @bw.qux("val3")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String otp;

        /* renamed from: d, reason: from kotlin metadata */
        @bw.qux("msgdatetime")
        @org.jetbrains.annotations.NotNull
        private final org.joda.time.DateTime msgDateTime;

        /* renamed from: e, reason: from kotlin metadata */
        @bw.qux("k")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String codeType;

        /* renamed from: f, reason: from kotlin metadata */
        @bw.qux("val3")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String trxAmt;

        /* renamed from: g, reason: from kotlin metadata */
        @bw.qux("dffVal1")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String trxCurrency;

        /* renamed from: h, reason: from kotlin metadata */
        @bw.qux("is_im")
        private final boolean isIM;

        /* renamed from: i, reason: from kotlin metadata */
        @bw.qux("address")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String sender;
        public final com.truecaller.insights.database.models.DomainOrigin j;
        public final java.lang.String k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, long j2, java.lang.String str, org.joda.time.DateTime dateTime, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, com.truecaller.insights.database.models.DomainOrigin domainOrigin, java.lang.String str6) {
            super("OTP", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "otp");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "msgDateTime");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "trxCurrency");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainOrigin, "origin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "message");
            this.msgId = j;
            this.conversationId = j2;
            this.otp = str;
            this.msgDateTime = dateTime;
            this.codeType = str2;
            this.trxAmt = str3;
            this.trxCurrency = str4;
            this.isIM = z;
            this.sender = str5;
            this.j = domainOrigin;
            this.k = str6;
        }

        /* renamed from: a, reason: from getter */
        public final java.lang.String getCodeType() {
            return this.codeType;
        }

        /* renamed from: b, reason: from getter */
        public final java.lang.String getOtp() {
            return this.otp;
        }

        /* renamed from: c, reason: from getter */
        public final java.lang.String getTrxAmt() {
            return this.trxAmt;
        }

        /* renamed from: d, reason: from getter */
        public final java.lang.String getTrxCurrency() {
            return this.trxCurrency;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.database.models.InsightsDomain.e)) {
                return false;
            }
            com.truecaller.insights.database.models.InsightsDomain.e eVar = (com.truecaller.insights.database.models.InsightsDomain.e) obj;
            return this.msgId == eVar.msgId && this.conversationId == eVar.conversationId && kotlin.jvm.internal.Intrinsics.b(this.otp, eVar.otp) && kotlin.jvm.internal.Intrinsics.b(this.msgDateTime, eVar.msgDateTime) && kotlin.jvm.internal.Intrinsics.b(this.codeType, eVar.codeType) && kotlin.jvm.internal.Intrinsics.b(this.trxAmt, eVar.trxAmt) && kotlin.jvm.internal.Intrinsics.b(this.trxCurrency, eVar.trxCurrency) && this.isIM == eVar.isIM && kotlin.jvm.internal.Intrinsics.b(this.sender, eVar.sender) && this.j == eVar.j && kotlin.jvm.internal.Intrinsics.b(this.k, eVar.k);
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getActionState */
        public final uu1.bar getY() {
            return null;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getConversationId() {
            return this.conversationId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getMessage, reason: from getter */
        public final java.lang.String getH() {
            return this.k;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final org.joda.time.DateTime getMsgDateTime() {
            return this.msgDateTime;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getMsgId() {
            return this.msgId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getOrigin, reason: from getter */
        public final com.truecaller.insights.database.models.DomainOrigin getF() {
            return this.j;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final java.lang.String getSender() {
            return this.sender;
        }

        public final int hashCode() {
            int hashCode;
            int i;
            long j = this.msgId;
            long j2 = this.conversationId;
            int w = ro0.f.w(this.msgDateTime, ax1.bar.e(((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.otp), 31);
            java.lang.String str = this.codeType;
            int i2 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = (w + hashCode) * 31;
            java.lang.String str2 = this.trxAmt;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            int e = ax1.bar.e((i3 + i2) * 31, 31, this.trxCurrency);
            if (this.isIM) {
                i = 1231;
            } else {
                i = 1237;
            }
            return this.k.hashCode() + ((((this.j.hashCode() + ax1.bar.e((e + i) * 31, 961, this.sender)) * 31) + 1237) * 31);
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isIM, reason: from getter */
        public final boolean getIsIM() {
            return this.isIM;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isSenderVerifiedForSmartFeatures */
        public final boolean getG() {
            return false;
        }

        public final java.lang.String toString() {
            long j = this.msgId;
            long j2 = this.conversationId;
            java.lang.String str = this.otp;
            org.joda.time.DateTime dateTime = this.msgDateTime;
            java.lang.String str2 = this.codeType;
            java.lang.String str3 = this.trxAmt;
            java.lang.String str4 = this.trxCurrency;
            boolean z = this.isIM;
            java.lang.String str5 = this.sender;
            java.lang.StringBuilder T = h0.b.T(j, "Otp(msgId=", ", conversationId=");
            ro0.f.K(T, j2, ", otp=", str);
            T.append(", msgDateTime=");
            T.append(dateTime);
            T.append(", codeType=");
            T.append(str2);
            bar.E(T, ", trxAmt=", str3, ", trxCurrency=", str4);
            T.append(", isIM=");
            T.append(z);
            T.append(", sender=");
            T.append(str5);
            T.append(", actionState=null, origin=");
            T.append(this.j);
            T.append(", isSenderVerifiedForSmartFeatures=false, message=");
            T.append(this.k);
            T.append(")");
            return T.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\u000b\u0010\"R\u001c\u0010)\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010\u0006R\u001a\u0010.\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u001a\u00101\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u001a\u00107\u001a\u0002028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u0010<\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010;R\u001a\u0010>\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u001a\u0010A\u001a\u00020 8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b?\u0010!\u001a\u0004\b@\u0010\"R\u001a\u0010D\u001a\u0002028\u0016X\u0097\u0004¢\u0006\f\n\u0004\bB\u00104\u001a\u0004\bC\u00106R\u001a\u0010J\u001a\u00020E8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010N\u001a\u00020K8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lcom/truecaller/insights/database/models/InsightsDomain$f;", "Lcom/truecaller/insights/database/models/InsightsDomain;", "", "a", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "travelCategory", "b", "d", "fromLoc", "c", "i", "toLoc", "e", "pnrId", "alertType", "f", "boardPointOrClassType", "g", "l", "travelVendor", "h", "psngerName", "m", "tripId", "seat", "k", "getSeatNum", "seatNum", "getFareAmt", "fareAmt", "Lorg/joda/time/DateTime;", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "deptDateTime", "Lorg/joda/time/LocalTime;", "n", "Lorg/joda/time/LocalTime;", "getDeptTime", "()Lorg/joda/time/LocalTime;", "deptTime", "o", "getUrlType", "urlType", "p", "teleNum", "q", "getUrl", "url", "", "r", "J", "getMsgId", "()J", "msgId", "s", "getSender", "setSender", "(Ljava/lang/String;)V", "sender", "t", "travelMode", "u", "getMsgDateTime", "msgDateTime", "v", "getConversationId", "conversationId", "", "w", "I", "getSpamCategory", "()I", "spamCategory", "", "x", "Z", "isIM", "()Z", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class f extends com.truecaller.insights.database.models.InsightsDomain {
        public final boolean A;
        public final java.lang.String B;
        public final org.joda.time.DateTime C;

        /* renamed from: a, reason: from kotlin metadata */
        @bw.qux("k")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String travelCategory;

        /* renamed from: b, reason: from kotlin metadata */
        @bw.qux("p")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String fromLoc;

        /* renamed from: c, reason: from kotlin metadata */
        @bw.qux("c")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String toLoc;

        /* renamed from: d, reason: from kotlin metadata */
        @bw.qux("o")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String pnrId;

        /* renamed from: e, reason: from kotlin metadata */
        @bw.qux("f")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String alertType;

        /* renamed from: f, reason: from kotlin metadata */
        @bw.qux("g")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String boardPointOrClassType;

        /* renamed from: g, reason: from kotlin metadata */
        @bw.qux("s")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String travelVendor;

        /* renamed from: h, reason: from kotlin metadata */
        @bw.qux("val1")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String psngerName;

        /* renamed from: i, reason: from kotlin metadata */
        @bw.qux("val2")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String tripId;

        /* renamed from: j, reason: from kotlin metadata */
        @bw.qux("val3")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String seat;

        /* renamed from: k, reason: from kotlin metadata */
        @bw.qux("val4")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String seatNum;

        /* renamed from: l, reason: from kotlin metadata */
        @bw.qux("val5")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String fareAmt;

        /* renamed from: m, reason: from kotlin metadata */
        @bw.qux("datetime")
        @org.jetbrains.annotations.Nullable
        private final org.joda.time.DateTime deptDateTime;

        /* renamed from: n, reason: from kotlin metadata */
        @bw.qux("dffVal1")
        @org.jetbrains.annotations.Nullable
        private final org.joda.time.LocalTime deptTime;

        /* renamed from: o, reason: from kotlin metadata */
        @bw.qux("dffVal3")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String urlType;

        /* renamed from: p, reason: from kotlin metadata */
        @bw.qux("dffVal4")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String teleNum;

        /* renamed from: q, reason: from kotlin metadata */
        @bw.qux("dffVal5")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String url;

        /* renamed from: r, reason: from kotlin metadata */
        @bw.qux("messageID")
        private final long msgId;

        /* renamed from: s, reason: from kotlin metadata */
        @bw.qux("address")
        @org.jetbrains.annotations.NotNull
        private java.lang.String sender;

        /* renamed from: t, reason: from kotlin metadata */
        @bw.qux("dffVal2")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String travelMode;

        /* renamed from: u, reason: from kotlin metadata */
        @bw.qux("msgdatetime")
        @org.jetbrains.annotations.NotNull
        private final org.joda.time.DateTime msgDateTime;

        /* renamed from: v, reason: from kotlin metadata */
        @bw.qux("conversation_id")
        private final long conversationId;

        /* renamed from: w, reason: from kotlin metadata */
        @bw.qux("spam_category")
        private final int spamCategory;

        /* renamed from: x, reason: from kotlin metadata */
        @bw.qux("is_im")
        private final boolean isIM;
        public final uu1.bar y;
        public final com.truecaller.insights.database.models.DomainOrigin z;

        public f() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0, 268435455);
        }

        /* renamed from: a, reason: from getter */
        public final java.lang.String getAlertType() {
            return this.alertType;
        }

        /* renamed from: b, reason: from getter */
        public final java.lang.String getBoardPointOrClassType() {
            return this.boardPointOrClassType;
        }

        /* renamed from: c, reason: from getter */
        public final org.joda.time.DateTime getDeptDateTime() {
            return this.deptDateTime;
        }

        /* renamed from: d, reason: from getter */
        public final java.lang.String getFromLoc() {
            return this.fromLoc;
        }

        /* renamed from: e, reason: from getter */
        public final java.lang.String getPnrId() {
            return this.pnrId;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.database.models.InsightsDomain.f)) {
                return false;
            }
            com.truecaller.insights.database.models.InsightsDomain.f fVar = (com.truecaller.insights.database.models.InsightsDomain.f) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.travelCategory, fVar.travelCategory) && kotlin.jvm.internal.Intrinsics.b(this.fromLoc, fVar.fromLoc) && kotlin.jvm.internal.Intrinsics.b(this.toLoc, fVar.toLoc) && kotlin.jvm.internal.Intrinsics.b(this.pnrId, fVar.pnrId) && kotlin.jvm.internal.Intrinsics.b(this.alertType, fVar.alertType) && kotlin.jvm.internal.Intrinsics.b(this.boardPointOrClassType, fVar.boardPointOrClassType) && kotlin.jvm.internal.Intrinsics.b(this.travelVendor, fVar.travelVendor) && kotlin.jvm.internal.Intrinsics.b(this.psngerName, fVar.psngerName) && kotlin.jvm.internal.Intrinsics.b(this.tripId, fVar.tripId) && kotlin.jvm.internal.Intrinsics.b(this.seat, fVar.seat) && kotlin.jvm.internal.Intrinsics.b(this.seatNum, fVar.seatNum) && kotlin.jvm.internal.Intrinsics.b(this.fareAmt, fVar.fareAmt) && kotlin.jvm.internal.Intrinsics.b(this.deptDateTime, fVar.deptDateTime) && kotlin.jvm.internal.Intrinsics.b(this.deptTime, fVar.deptTime) && kotlin.jvm.internal.Intrinsics.b(this.urlType, fVar.urlType) && kotlin.jvm.internal.Intrinsics.b(this.teleNum, fVar.teleNum) && kotlin.jvm.internal.Intrinsics.b(this.url, fVar.url) && this.msgId == fVar.msgId && kotlin.jvm.internal.Intrinsics.b(this.sender, fVar.sender) && kotlin.jvm.internal.Intrinsics.b(this.travelMode, fVar.travelMode) && kotlin.jvm.internal.Intrinsics.b(this.msgDateTime, fVar.msgDateTime) && this.conversationId == fVar.conversationId && this.spamCategory == fVar.spamCategory && this.isIM == fVar.isIM && kotlin.jvm.internal.Intrinsics.b(this.y, fVar.y) && this.z == fVar.z && this.A == fVar.A && kotlin.jvm.internal.Intrinsics.b(this.B, fVar.B);
        }

        /* renamed from: f, reason: from getter */
        public final java.lang.String getPsngerName() {
            return this.psngerName;
        }

        /* renamed from: g, reason: from getter */
        public final java.lang.String getSeat() {
            return this.seat;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getActionState, reason: from getter */
        public final uu1.bar getY() {
            return this.y;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getConversationId() {
            return this.conversationId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getMessage, reason: from getter */
        public final java.lang.String getH() {
            return this.B;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final org.joda.time.DateTime getMsgDateTime() {
            return this.msgDateTime;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getMsgId() {
            return this.msgId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getOrigin, reason: from getter */
        public final com.truecaller.insights.database.models.DomainOrigin getF() {
            return this.z;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final java.lang.String getSender() {
            return this.sender;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String getUrlType() {
            return this.urlType;
        }

        /* renamed from: h, reason: from getter */
        public final java.lang.String getTeleNum() {
            return this.teleNum;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int i;
            int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(this.travelCategory.hashCode() * 31, 31, this.fromLoc), 31, this.toLoc), 31, this.pnrId), 31, this.alertType), 31, this.boardPointOrClassType), 31, this.travelVendor), 31, this.psngerName), 31, this.tripId), 31, this.seat), 31, this.seatNum), 31, this.fareAmt);
            org.joda.time.DateTime dateTime = this.deptDateTime;
            int i2 = 0;
            if (dateTime == null) {
                hashCode = 0;
            } else {
                hashCode = dateTime.hashCode();
            }
            int i3 = (e + hashCode) * 31;
            org.joda.time.LocalTime localTime = this.deptTime;
            if (localTime == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = localTime.hashCode();
            }
            int e2 = ax1.bar.e(ax1.bar.e(ax1.bar.e((i3 + hashCode2) * 31, 31, this.urlType), 31, this.teleNum), 31, this.url);
            long j = this.msgId;
            int w = ro0.f.w(this.msgDateTime, ax1.bar.e(ax1.bar.e((e2 + ((int) (j ^ (j >>> 32)))) * 31, 31, this.sender), 31, this.travelMode), 31);
            long j2 = this.conversationId;
            int i4 = (((w + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.spamCategory) * 31;
            int i5 = 1237;
            if (this.isIM) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i6 = (i4 + i) * 31;
            uu1.bar barVar = this.y;
            if (barVar != null) {
                i2 = barVar.hashCode();
            }
            int hashCode3 = (this.z.hashCode() + ((i6 + i2) * 31)) * 31;
            if (this.A) {
                i5 = 1231;
            }
            return this.B.hashCode() + ((hashCode3 + i5) * 31);
        }

        /* renamed from: i, reason: from getter */
        public final java.lang.String getToLoc() {
            return this.toLoc;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isIM, reason: from getter */
        public final boolean getIsIM() {
            return this.isIM;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isSenderVerifiedForSmartFeatures, reason: from getter */
        public final boolean getG() {
            return this.A;
        }

        /* renamed from: j, reason: from getter */
        public final java.lang.String getTravelCategory() {
            return this.travelCategory;
        }

        /* renamed from: k, reason: from getter */
        public final java.lang.String getTravelMode() {
            return this.travelMode;
        }

        /* renamed from: l, reason: from getter */
        public final java.lang.String getTravelVendor() {
            return this.travelVendor;
        }

        /* renamed from: m, reason: from getter */
        public final java.lang.String getTripId() {
            return this.tripId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.travelCategory;
            java.lang.String str2 = this.fromLoc;
            java.lang.String str3 = this.toLoc;
            java.lang.String str4 = this.pnrId;
            java.lang.String str5 = this.alertType;
            java.lang.String str6 = this.boardPointOrClassType;
            java.lang.String str7 = this.travelVendor;
            java.lang.String str8 = this.psngerName;
            java.lang.String str9 = this.tripId;
            java.lang.String str10 = this.seat;
            java.lang.String str11 = this.seatNum;
            java.lang.String str12 = this.fareAmt;
            org.joda.time.DateTime dateTime = this.deptDateTime;
            org.joda.time.LocalTime localTime = this.deptTime;
            java.lang.String str13 = this.urlType;
            java.lang.String str14 = this.teleNum;
            java.lang.String str15 = this.url;
            long j = this.msgId;
            java.lang.String str16 = this.sender;
            java.lang.String str17 = this.travelMode;
            org.joda.time.DateTime dateTime2 = this.msgDateTime;
            long j2 = this.conversationId;
            int i = this.spamCategory;
            boolean z = this.isIM;
            java.lang.StringBuilder E = ro0.f.E("Travel(travelCategory=", str, ", fromLoc=", str2, ", toLoc=");
            bar.E(E, str3, ", pnrId=", str4, ", alertType=");
            bar.E(E, str5, ", boardPointOrClassType=", str6, ", travelVendor=");
            bar.E(E, str7, ", psngerName=", str8, ", tripId=");
            bar.E(E, str9, ", seat=", str10, ", seatNum=");
            bar.E(E, str11, ", fareAmt=", str12, ", deptDateTime=");
            E.append(dateTime);
            E.append(", deptTime=");
            E.append(localTime);
            E.append(", urlType=");
            bar.E(E, str13, ", teleNum=", str14, ", url=");
            com.appsflyer.internal.e.y(E, j, str15, ", msgId=");
            bar.E(E, ", sender=", str16, ", travelMode=", str17);
            E.append(", msgDateTime=");
            E.append(dateTime2);
            E.append(", conversationId=");
            h8.s0.y(i, j2, ", spamCategory=", E);
            E.append(", isIM=");
            E.append(z);
            E.append(", actionState=");
            E.append(this.y);
            E.append(", origin=");
            E.append(this.z);
            E.append(", isSenderVerifiedForSmartFeatures=");
            E.append(this.A);
            return y.o.f(", message=", this.B, ")", E);
        }

        public f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, org.joda.time.DateTime dateTime, org.joda.time.LocalTime localTime, java.lang.String str13, java.lang.String str14, java.lang.String str15, long j, java.lang.String str16, java.lang.String str17, org.joda.time.DateTime dateTime2, int i, int i2) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? "" : str11, (i2 & 2048) != 0 ? "" : str12, (i2 & 4096) != 0 ? null : dateTime, (i2 & 8192) != 0 ? null : localTime, (i2 & 16384) != 0 ? "" : str13, (32768 & i2) != 0 ? "" : str14, (65536 & i2) != 0 ? "" : str15, (131072 & i2) != 0 ? -1L : j, (262144 & i2) != 0 ? "" : str16, (524288 & i2) != 0 ? "" : str17, (1048576 & i2) != 0 ? wi0.bar.v("now(...)") : dateTime2, -1L, (i2 & 4194304) != 0 ? 1 : i, false, null, com.truecaller.insights.database.models.DomainOrigin.SMS, false, "");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, org.joda.time.DateTime dateTime, org.joda.time.LocalTime localTime, java.lang.String str13, java.lang.String str14, java.lang.String str15, long j, java.lang.String str16, java.lang.String str17, org.joda.time.DateTime dateTime2, long j2, int i, boolean z, uu1.bar barVar, com.truecaller.insights.database.models.DomainOrigin domainOrigin, boolean z2, java.lang.String str18) {
            super("Travel", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "travelCategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "fromLoc");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "toLoc");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "pnrId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "alertType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "boardPointOrClassType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "travelVendor");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "psngerName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "tripId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "seat");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "seatNum");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str12, "fareAmt");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str13, "urlType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str14, "teleNum");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str15, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str16, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str17, "travelMode");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime2, "msgDateTime");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainOrigin, "origin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str18, "message");
            this.travelCategory = str;
            this.fromLoc = str2;
            this.toLoc = str3;
            this.pnrId = str4;
            this.alertType = str5;
            this.boardPointOrClassType = str6;
            this.travelVendor = str7;
            this.psngerName = str8;
            this.tripId = str9;
            this.seat = str10;
            this.seatNum = str11;
            this.fareAmt = str12;
            org.joda.time.DateTime dateTime3 = dateTime;
            this.deptDateTime = dateTime3;
            this.deptTime = localTime;
            this.urlType = str13;
            this.teleNum = str14;
            this.url = str15;
            this.msgId = j;
            this.sender = str16;
            this.travelMode = str17;
            this.msgDateTime = dateTime2;
            this.conversationId = j2;
            this.spamCategory = i;
            this.isIM = z;
            this.y = barVar;
            this.z = domainOrigin;
            this.A = z2;
            this.B = str18;
            this.C = dateTime3 == null ? dateTime2 : dateTime3;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u001a\u001a\u00020\u00178\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/truecaller/insights/database/models/InsightsDomain$g;", "Lcom/truecaller/insights/database/models/InsightsDomain;", "", "c", "J", "getMsgId", "()J", "msgId", "", "d", "Ljava/lang/String;", "getSender", "()Ljava/lang/String;", "sender", "Lorg/joda/time/DateTime;", "e", "Lorg/joda/time/DateTime;", "getMsgDateTime", "()Lorg/joda/time/DateTime;", "msgDateTime", "f", "getConversationId", "conversationId", "", "g", "Z", "isIM", "()Z", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class g extends com.truecaller.insights.database.models.InsightsDomain {
        public final com.truecaller.insights.models.updates.UpdateCategory a;
        public final java.lang.String b;

        /* renamed from: c, reason: from kotlin metadata */
        @bw.qux("messageID")
        private final long msgId;

        /* renamed from: d, reason: from kotlin metadata */
        @bw.qux("address")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String sender;

        /* renamed from: e, reason: from kotlin metadata */
        @bw.qux("msgdatetime")
        @org.jetbrains.annotations.NotNull
        private final org.joda.time.DateTime msgDateTime;

        /* renamed from: f, reason: from kotlin metadata */
        @bw.qux("conversation_id")
        private final long conversationId;

        /* renamed from: g, reason: from kotlin metadata */
        @bw.qux("is_im")
        private final boolean isIM;
        public final com.truecaller.insights.database.models.DomainOrigin h;
        public final java.lang.String i;
        public final com.truecaller.insights.models.pdo.ClassifierType j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.truecaller.insights.models.updates.UpdateCategory updateCategory, java.lang.String str, long j, java.lang.String str2, org.joda.time.DateTime dateTime, long j2, boolean z, java.lang.String str3, com.truecaller.insights.models.pdo.ClassifierType classifierType) {
            super("Updates", null);
            com.truecaller.insights.database.models.DomainOrigin domainOrigin = com.truecaller.insights.database.models.DomainOrigin.SMS;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "updateCategoryString");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "msgDateTime");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainOrigin, "origin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifierType, "classifiedBy");
            this.a = updateCategory;
            this.b = str;
            this.msgId = j;
            this.sender = str2;
            this.msgDateTime = dateTime;
            this.conversationId = j2;
            this.isIM = z;
            this.h = domainOrigin;
            this.i = str3;
            this.j = classifierType;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.database.models.InsightsDomain.g)) {
                return false;
            }
            com.truecaller.insights.database.models.InsightsDomain.g gVar = (com.truecaller.insights.database.models.InsightsDomain.g) obj;
            return this.a == gVar.a && kotlin.jvm.internal.Intrinsics.b(this.b, gVar.b) && this.msgId == gVar.msgId && kotlin.jvm.internal.Intrinsics.b(this.sender, gVar.sender) && kotlin.jvm.internal.Intrinsics.b(this.msgDateTime, gVar.msgDateTime) && this.conversationId == gVar.conversationId && this.isIM == gVar.isIM && this.h == gVar.h && kotlin.jvm.internal.Intrinsics.b(this.i, gVar.i) && this.j == gVar.j;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getActionState */
        public final uu1.bar getY() {
            return null;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getConversationId() {
            return this.conversationId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getMessage, reason: from getter */
        public final java.lang.String getH() {
            return this.i;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final org.joda.time.DateTime getMsgDateTime() {
            return this.msgDateTime;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getMsgId() {
            return this.msgId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getOrigin, reason: from getter */
        public final com.truecaller.insights.database.models.DomainOrigin getF() {
            return this.h;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final java.lang.String getSender() {
            return this.sender;
        }

        public final int hashCode() {
            int hashCode;
            int i;
            com.truecaller.insights.models.updates.UpdateCategory updateCategory = this.a;
            if (updateCategory == null) {
                hashCode = 0;
            } else {
                hashCode = updateCategory.hashCode();
            }
            int e = ax1.bar.e(hashCode * 31, 31, this.b);
            long j = this.msgId;
            int w = ro0.f.w(this.msgDateTime, ax1.bar.e((e + ((int) (j ^ (j >>> 32)))) * 31, 31, this.sender), 31);
            long j2 = this.conversationId;
            int i2 = (w + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            if (this.isIM) {
                i = 1231;
            } else {
                i = 1237;
            }
            return this.j.hashCode() + ax1.bar.e((((this.h.hashCode() + ((i2 + i) * 961)) * 31) + 1237) * 31, 31, this.i);
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isIM, reason: from getter */
        public final boolean getIsIM() {
            return this.isIM;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isSenderVerifiedForSmartFeatures */
        public final boolean getG() {
            return false;
        }

        public final java.lang.String toString() {
            long j = this.msgId;
            java.lang.String str = this.sender;
            org.joda.time.DateTime dateTime = this.msgDateTime;
            long j2 = this.conversationId;
            boolean z = this.isIM;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Updates(updateCategory=");
            sb.append(this.a);
            sb.append(", updateCategoryString=");
            sb.append(this.b);
            sb.append(", msgId=");
            ro0.f.K(sb, j, ", sender=", str);
            sb.append(", msgDateTime=");
            sb.append(dateTime);
            sb.append(", conversationId=");
            bx.e1.A(sb, j2, ", isIM=", z);
            sb.append(", actionState=null, origin=");
            sb.append(this.h);
            sb.append(", isSenderVerifiedForSmartFeatures=false, message=");
            sb.append(this.i);
            sb.append(", classifiedBy=");
            sb.append(this.j);
            sb.append(")");
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u001a\u001a\u00020\u00178\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001d\u0010\fR\u001a\u0010!\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\fR\u001a\u0010'\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010*\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0010\u001a\u0004\b)\u0010\u0012R\u001a\u0010-\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b,\u0010\fR\u001a\u00100\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\n\u001a\u0004\b/\u0010\f¨\u00061"}, d2 = {"Lcom/truecaller/insights/database/models/InsightsDomain$qux;", "Lcom/truecaller/insights/database/models/InsightsDomain;", "", "a", "J", "getMsgId", "()J", "msgId", "", "b", "Ljava/lang/String;", "getSender", "()Ljava/lang/String;", "sender", "Lorg/joda/time/DateTime;", "c", "Lorg/joda/time/DateTime;", "getMsgDateTime", "()Lorg/joda/time/DateTime;", "msgDateTime", "d", "getConversationId", "conversationId", "", "e", "Z", "isIM", "()Z", "j", "getCallAlertCategory", "callAlertCategory", "k", "getCallerNum", "callerNum", "", "l", "I", "getNoOfMissedCalls", "()I", "noOfMissedCalls", "m", "getDateTime", "dateTime", "n", "getUrl", "url", "o", "getUrlType", "urlType", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class qux extends com.truecaller.insights.database.models.InsightsDomain {

        /* renamed from: a, reason: from kotlin metadata */
        @bw.qux("messageID")
        private final long msgId;

        /* renamed from: b, reason: from kotlin metadata */
        @bw.qux("address")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String sender;

        /* renamed from: c, reason: from kotlin metadata */
        @bw.qux("msgdatetime")
        @org.jetbrains.annotations.NotNull
        private final org.joda.time.DateTime msgDateTime;

        /* renamed from: d, reason: from kotlin metadata */
        @bw.qux("conversation_id")
        private final long conversationId;

        /* renamed from: e, reason: from kotlin metadata */
        @bw.qux("is_im")
        private final boolean isIM;
        public final com.truecaller.insights.database.models.DomainOrigin f;
        public final boolean g;
        public final java.lang.String h;
        public final com.truecaller.insights.models.pdo.ClassifierType i;

        /* renamed from: j, reason: from kotlin metadata */
        @bw.qux("k")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String callAlertCategory;

        /* renamed from: k, reason: from kotlin metadata */
        @bw.qux("val1")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String callerNum;

        /* renamed from: l, reason: from kotlin metadata */
        @bw.qux("val3")
        private final int noOfMissedCalls;

        /* renamed from: m, reason: from kotlin metadata */
        @bw.qux("datetime")
        @org.jetbrains.annotations.Nullable
        private final org.joda.time.DateTime dateTime;

        /* renamed from: n, reason: from kotlin metadata */
        @bw.qux("dff_val5")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String url;

        /* renamed from: o, reason: from kotlin metadata */
        @bw.qux("dff_val3")
        @org.jetbrains.annotations.NotNull
        private final java.lang.String urlType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public qux(long j, java.lang.String str, org.joda.time.DateTime dateTime, long j2, boolean z, com.truecaller.insights.database.models.DomainOrigin domainOrigin, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, org.joda.time.DateTime dateTime2, java.lang.String str5, java.lang.String str6) {
            super("CallAlerts", null);
            com.truecaller.insights.models.pdo.ClassifierType classifierType = com.truecaller.insights.models.pdo.ClassifierType.DEFAULT;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "sender");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "msgDateTime");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainOrigin, "origin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifierType, "classifiedBy");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "callAlertCategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "callerNum");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "urlType");
            this.msgId = j;
            this.sender = str;
            this.msgDateTime = dateTime;
            this.conversationId = j2;
            this.isIM = z;
            this.f = domainOrigin;
            this.g = z2;
            this.h = str2;
            this.i = classifierType;
            this.callAlertCategory = str3;
            this.callerNum = str4;
            this.noOfMissedCalls = i;
            this.dateTime = dateTime2;
            this.url = str5;
            this.urlType = str6;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.insights.database.models.InsightsDomain.qux)) {
                return false;
            }
            com.truecaller.insights.database.models.InsightsDomain.qux quxVar = (com.truecaller.insights.database.models.InsightsDomain.qux) obj;
            return this.msgId == quxVar.msgId && kotlin.jvm.internal.Intrinsics.b(this.sender, quxVar.sender) && kotlin.jvm.internal.Intrinsics.b(this.msgDateTime, quxVar.msgDateTime) && this.conversationId == quxVar.conversationId && this.isIM == quxVar.isIM && this.f == quxVar.f && this.g == quxVar.g && kotlin.jvm.internal.Intrinsics.b(this.h, quxVar.h) && this.i == quxVar.i && kotlin.jvm.internal.Intrinsics.b(this.callAlertCategory, quxVar.callAlertCategory) && kotlin.jvm.internal.Intrinsics.b(this.callerNum, quxVar.callerNum) && this.noOfMissedCalls == quxVar.noOfMissedCalls && kotlin.jvm.internal.Intrinsics.b(this.dateTime, quxVar.dateTime) && kotlin.jvm.internal.Intrinsics.b(this.url, quxVar.url) && kotlin.jvm.internal.Intrinsics.b(this.urlType, quxVar.urlType);
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getActionState */
        public final uu1.bar getY() {
            return null;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getConversationId() {
            return this.conversationId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getMessage, reason: from getter */
        public final java.lang.String getH() {
            return this.h;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final org.joda.time.DateTime getMsgDateTime() {
            return this.msgDateTime;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final long getMsgId() {
            return this.msgId;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: getOrigin, reason: from getter */
        public final com.truecaller.insights.database.models.DomainOrigin getF() {
            return this.f;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        public final java.lang.String getSender() {
            return this.sender;
        }

        public final int hashCode() {
            int i;
            int hashCode;
            long j = this.msgId;
            int w = ro0.f.w(this.msgDateTime, ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.sender), 31);
            long j2 = this.conversationId;
            int i2 = (w + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            int i3 = 1237;
            if (this.isIM) {
                i = 1231;
            } else {
                i = 1237;
            }
            int hashCode2 = (this.f.hashCode() + ((i2 + i) * 961)) * 31;
            if (this.g) {
                i3 = 1231;
            }
            int e = (ax1.bar.e(ax1.bar.e((this.i.hashCode() + ax1.bar.e((hashCode2 + i3) * 31, 31, this.h)) * 31, 31, this.callAlertCategory), 31, this.callerNum) + this.noOfMissedCalls) * 31;
            org.joda.time.DateTime dateTime = this.dateTime;
            if (dateTime == null) {
                hashCode = 0;
            } else {
                hashCode = dateTime.hashCode();
            }
            return this.urlType.hashCode() + ax1.bar.e((e + hashCode) * 31, 31, this.url);
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isIM, reason: from getter */
        public final boolean getIsIM() {
            return this.isIM;
        }

        @Override // com.truecaller.insights.database.models.InsightsDomain
        /* renamed from: isSenderVerifiedForSmartFeatures, reason: from getter */
        public final boolean getG() {
            return this.g;
        }

        public final java.lang.String toString() {
            long j = this.msgId;
            java.lang.String str = this.sender;
            org.joda.time.DateTime dateTime = this.msgDateTime;
            long j2 = this.conversationId;
            boolean z = this.isIM;
            java.lang.String str2 = this.callAlertCategory;
            java.lang.String str3 = this.callerNum;
            int i = this.noOfMissedCalls;
            org.joda.time.DateTime dateTime2 = this.dateTime;
            java.lang.String str4 = this.url;
            java.lang.String str5 = this.urlType;
            java.lang.StringBuilder p = com.appsflyer.internal.e.p("CallAlert(msgId=", j, ", sender=", str);
            p.append(", msgDateTime=");
            p.append(dateTime);
            p.append(", conversationId=");
            bx.e1.A(p, j2, ", isIM=", z);
            p.append(", actionState=null, origin=");
            p.append(this.f);
            p.append(", isSenderVerifiedForSmartFeatures=");
            p.append(this.g);
            p.append(", message=");
            p.append(this.h);
            p.append(", classifiedBy=");
            p.append(this.i);
            bar.E(p, ", callAlertCategory=", str2, ", callerNum=", str3);
            p.append(", noOfMissedCalls=");
            p.append(i);
            p.append(", dateTime=");
            p.append(dateTime2);
            bar.E(p, ", url=", str4, ", urlType=", str5);
            p.append(")");
            return p.toString();
        }
    }

    public /* synthetic */ InsightsDomain(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: getActionState */
    public abstract uu1.bar getY();

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategory() {
        return this.category;
    }

    public abstract long getConversationId();

    @org.jetbrains.annotations.NotNull
    /* renamed from: getMessage */
    public abstract java.lang.String getH();

    @org.jetbrains.annotations.NotNull
    public abstract org.joda.time.DateTime getMsgDateTime();

    public abstract long getMsgId();

    @org.jetbrains.annotations.NotNull
    /* renamed from: getOrigin */
    public abstract com.truecaller.insights.database.models.DomainOrigin getF();

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getSender();

    /* renamed from: isIM */
    public abstract boolean getIsIM();

    /* renamed from: isSenderVerifiedForSmartFeatures */
    public abstract boolean getG();

    private InsightsDomain(java.lang.String str) {
        this.category = str;
    }
}
