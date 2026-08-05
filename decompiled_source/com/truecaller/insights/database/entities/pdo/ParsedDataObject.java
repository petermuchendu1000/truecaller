package com.truecaller.insights.database.entities.pdo;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010v\u001a\u00020Y2\b\u0010w\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010x\u001a\u00020kH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001e\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001e\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001e\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001e\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001e\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\"\u0010%\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010+\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000fR\u001e\u0010.\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010\u000fR\u001e\u00101\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000fR\u001e\u00104\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\r\"\u0004\b6\u0010\u000fR\u001e\u00107\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\r\"\u0004\b9\u0010\u000fR\u001e\u0010:\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\r\"\u0004\b<\u0010\u000fR\u001e\u0010=\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\r\"\u0004\b?\u0010\u000fR\u001e\u0010@\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\r\"\u0004\bB\u0010\u000fR\u001e\u0010C\u001a\u00020D8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001e\u0010I\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\r\"\u0004\bK\u0010\u000fR\u001e\u0010L\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\r\"\u0004\bN\u0010\u000fR\u001e\u0010O\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\r\"\u0004\bQ\u0010\u000fR\u001e\u0010R\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\r\"\u0004\bT\u0010\u000fR\u001e\u0010U\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\r\"\u0004\bW\u0010\u000fR\u001e\u0010X\u001a\u00020Y8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001e\u0010^\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\r\"\u0004\b`\u0010\u000fR\"\u0010a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\bb\u0010'\"\u0004\bc\u0010)R\u001e\u0010d\u001a\u00020Y8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010[\"\u0004\bf\u0010]R\u001e\u0010g\u001a\u00020D8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010F\"\u0004\bi\u0010HR\u001e\u0010j\u001a\u00020k8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010p\u001a\u0004\u0018\u00010k8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010u\u001a\u0004\bq\u0010r\"\u0004\bs\u0010t¨\u0006y"}, d2 = {"Lcom/truecaller/insights/database/entities/pdo/ParsedDataObject;", "", "<init>", "()V", "messageID", "", "getMessageID", "()J", "setMessageID", "(J)V", "d", "", "getD", "()Ljava/lang/String;", "setD", "(Ljava/lang/String;)V", "k", "getK", "setK", "p", "getP", "setP", "c", "getC", "setC", "o", "getO", "setO", "f", "getF", "setF", "g", "getG", "setG", "s", "getS", "setS", "accountModelId", "getAccountModelId", "()Ljava/lang/Long;", "setAccountModelId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "val1", "getVal1", "setVal1", "val2", "getVal2", "setVal2", "val3", "getVal3", "setVal3", "val4", "getVal4", "setVal4", "val5", "getVal5", "setVal5", "datetime", "getDatetime", "setDatetime", "address", "getAddress", "setAddress", "date", "getDate", "setDate", "msgDate", "Ljava/util/Date;", "getMsgDate", "()Ljava/util/Date;", "setMsgDate", "(Ljava/util/Date;)V", "dffVal1", "getDffVal1", "setDffVal1", "dffVal2", "getDffVal2", "setDffVal2", "dffVal3", "getDffVal3", "setDffVal3", "dffVal4", "getDffVal4", "setDffVal4", "dffVal5", "getDffVal5", "setDffVal5", "active", "", "getActive", "()Z", "setActive", "(Z)V", "state", "getState", "setState", "syntheticRecordId", "getSyntheticRecordId", "setSyntheticRecordId", "deleted", "getDeleted", "setDeleted", "createdAt", "getCreatedAt", "setCreatedAt", "spamCategory", "", "getSpamCategory", "()I", "setSpamCategory", "(I)V", "pdoSource", "getPdoSource", "()Ljava/lang/Integer;", "setPdoSource", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "equals", "other", "hashCode", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public class ParsedDataObject {

    @bw.qux("account_model_id")
    @org.jetbrains.annotations.Nullable
    private java.lang.Long accountModelId;

    @bw.qux("deleted")
    private boolean deleted;

    @bw.qux("messageID")
    private long messageID;

    @bw.qux("synthetic_record_id")
    @org.jetbrains.annotations.Nullable
    private java.lang.Long syntheticRecordId;

    @bw.qux("d")
    @org.jetbrains.annotations.NotNull
    private java.lang.String d = "";

    @bw.qux("k")
    @org.jetbrains.annotations.NotNull
    private java.lang.String k = "";

    @bw.qux("p")
    @org.jetbrains.annotations.NotNull
    private java.lang.String p = "";

    @bw.qux("c")
    @org.jetbrains.annotations.NotNull
    private java.lang.String c = "";

    @bw.qux("o")
    @org.jetbrains.annotations.NotNull
    private java.lang.String o = "";

    @bw.qux("f")
    @org.jetbrains.annotations.NotNull
    private java.lang.String f = "";

    @bw.qux("g")
    @org.jetbrains.annotations.NotNull
    private java.lang.String g = "";

    @bw.qux("s")
    @org.jetbrains.annotations.NotNull
    private java.lang.String s = "";

    @bw.qux("val1")
    @org.jetbrains.annotations.NotNull
    private java.lang.String val1 = "";

    @bw.qux("val2")
    @org.jetbrains.annotations.NotNull
    private java.lang.String val2 = "";

    @bw.qux("val3")
    @org.jetbrains.annotations.NotNull
    private java.lang.String val3 = "";

    @bw.qux("val4")
    @org.jetbrains.annotations.NotNull
    private java.lang.String val4 = "";

    @bw.qux("val5")
    @org.jetbrains.annotations.NotNull
    private java.lang.String val5 = "";

    @bw.qux("datetime")
    @org.jetbrains.annotations.NotNull
    private java.lang.String datetime = "";

    @bw.qux("address")
    @org.jetbrains.annotations.NotNull
    private java.lang.String address = "";

    @bw.qux("date")
    @org.jetbrains.annotations.NotNull
    private java.lang.String date = "";

    @bw.qux("msg_date")
    @org.jetbrains.annotations.NotNull
    private java.util.Date msgDate = new java.util.Date(0);

    @bw.qux("dffVal1")
    @org.jetbrains.annotations.NotNull
    private java.lang.String dffVal1 = "";

    @bw.qux("dffVal2")
    @org.jetbrains.annotations.NotNull
    private java.lang.String dffVal2 = "";

    @bw.qux("dffVal3")
    @org.jetbrains.annotations.NotNull
    private java.lang.String dffVal3 = "";

    @bw.qux("dffVal4")
    @org.jetbrains.annotations.NotNull
    private java.lang.String dffVal4 = "";

    @bw.qux("dffVal5")
    @org.jetbrains.annotations.NotNull
    private java.lang.String dffVal5 = "";

    @bw.qux("active")
    private boolean active = true;

    @bw.qux("state")
    @org.jetbrains.annotations.NotNull
    private java.lang.String state = "ORIGINAL";

    @bw.qux("created_at")
    @org.jetbrains.annotations.NotNull
    private java.util.Date createdAt = new java.util.Date();

    @bw.qux("spam_category")
    private int spamCategory = 1;

    @org.jetbrains.annotations.Nullable
    private java.lang.Integer pdoSource = 0;

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        java.lang.Class<?> cls;
        if (this == other) {
            return true;
        }
        java.lang.Class<?> cls2 = getClass();
        if (other != null) {
            cls = other.getClass();
        } else {
            cls = null;
        }
        if (!cls2.equals(cls)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.e(other, "null cannot be cast to non-null type com.truecaller.insights.database.entities.pdo.ParsedDataObject");
        com.truecaller.insights.database.entities.pdo.ParsedDataObject parsedDataObject = (com.truecaller.insights.database.entities.pdo.ParsedDataObject) other;
        if (this.messageID == parsedDataObject.messageID && kotlin.jvm.internal.Intrinsics.b(this.d, parsedDataObject.d) && kotlin.jvm.internal.Intrinsics.b(this.k, parsedDataObject.k) && kotlin.jvm.internal.Intrinsics.b(this.p, parsedDataObject.p) && kotlin.jvm.internal.Intrinsics.b(this.c, parsedDataObject.c) && kotlin.jvm.internal.Intrinsics.b(this.o, parsedDataObject.o) && kotlin.jvm.internal.Intrinsics.b(this.f, parsedDataObject.f) && kotlin.jvm.internal.Intrinsics.b(this.g, parsedDataObject.g) && kotlin.jvm.internal.Intrinsics.b(this.s, parsedDataObject.s) && kotlin.jvm.internal.Intrinsics.b(this.accountModelId, parsedDataObject.accountModelId) && kotlin.jvm.internal.Intrinsics.b(this.val1, parsedDataObject.val1) && kotlin.jvm.internal.Intrinsics.b(this.val2, parsedDataObject.val2) && kotlin.jvm.internal.Intrinsics.b(this.val3, parsedDataObject.val3) && kotlin.jvm.internal.Intrinsics.b(this.val4, parsedDataObject.val4) && kotlin.jvm.internal.Intrinsics.b(this.val5, parsedDataObject.val5) && kotlin.jvm.internal.Intrinsics.b(this.datetime, parsedDataObject.datetime) && kotlin.jvm.internal.Intrinsics.b(this.address, parsedDataObject.address) && kotlin.jvm.internal.Intrinsics.b(this.msgDate, parsedDataObject.msgDate) && kotlin.jvm.internal.Intrinsics.b(this.date, parsedDataObject.date) && kotlin.jvm.internal.Intrinsics.b(this.dffVal1, parsedDataObject.dffVal1) && kotlin.jvm.internal.Intrinsics.b(this.dffVal2, parsedDataObject.dffVal2) && kotlin.jvm.internal.Intrinsics.b(this.dffVal3, parsedDataObject.dffVal3) && kotlin.jvm.internal.Intrinsics.b(this.dffVal4, parsedDataObject.dffVal4) && kotlin.jvm.internal.Intrinsics.b(this.dffVal5, parsedDataObject.dffVal5) && this.active == parsedDataObject.active && kotlin.jvm.internal.Intrinsics.b(this.state, parsedDataObject.state) && kotlin.jvm.internal.Intrinsics.b(this.syntheticRecordId, parsedDataObject.syntheticRecordId) && this.deleted == parsedDataObject.deleted && kotlin.jvm.internal.Intrinsics.b(this.createdAt, parsedDataObject.createdAt) && this.spamCategory == parsedDataObject.spamCategory && kotlin.jvm.internal.Intrinsics.b(this.pdoSource, parsedDataObject.pdoSource)) {
            return true;
        }
        return false;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getAccountModelId() {
        return this.accountModelId;
    }

    public final boolean getActive() {
        return this.active;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAddress() {
        return this.address;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getC() {
        return this.c;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getD() {
        return this.d;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDate() {
        return this.date;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDatetime() {
        return this.datetime;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDffVal1() {
        return this.dffVal1;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDffVal2() {
        return this.dffVal2;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDffVal3() {
        return this.dffVal3;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDffVal4() {
        return this.dffVal4;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDffVal5() {
        return this.dffVal5;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getF() {
        return this.f;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getG() {
        return this.g;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getK() {
        return this.k;
    }

    public final long getMessageID() {
        return this.messageID;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getMsgDate() {
        return this.msgDate;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getO() {
        return this.o;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getP() {
        return this.p;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPdoSource() {
        return this.pdoSource;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getS() {
        return this.s;
    }

    public final int getSpamCategory() {
        return this.spamCategory;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getState() {
        return this.state;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getSyntheticRecordId() {
        return this.syntheticRecordId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVal1() {
        return this.val1;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVal2() {
        return this.val2;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVal3() {
        return this.val3;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVal4() {
        return this.val4;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVal5() {
        return this.val5;
    }

    public int hashCode() {
        int i;
        int i2;
        long j = this.messageID;
        int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.d), 31, this.k), 31, this.p), 31, this.c), 31, this.o), 31, this.f), 31, this.g), 31, this.s);
        java.lang.Long l = this.accountModelId;
        int i3 = 0;
        if (l != null) {
            long longValue = l.longValue();
            i = (int) (longValue ^ (longValue >>> 32));
        } else {
            i = 0;
        }
        int e2 = ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(uf.qux.h(this.msgDate, ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e((e + i) * 31, 31, this.val1), 31, this.val2), 31, this.val3), 31, this.val4), 31, this.val5), 31, this.datetime), 31, this.address), 31), 31, this.date), 31, this.dffVal1), 31, this.dffVal2), 31, this.dffVal3), 31, this.dffVal4), 31, this.dffVal5);
        int i4 = 1237;
        if (this.active) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int e3 = ax1.bar.e((e2 + i2) * 31, 31, this.state);
        java.lang.Long l2 = this.syntheticRecordId;
        if (l2 != null) {
            long longValue2 = l2.longValue();
            i3 = (int) (longValue2 ^ (longValue2 >>> 32));
        }
        int i5 = (e3 + i3) * 31;
        if (this.deleted) {
            i4 = 1231;
        }
        return uf.qux.h(this.createdAt, (i5 + i4) * 31, 31) + this.spamCategory;
    }

    public final void setAccountModelId(@org.jetbrains.annotations.Nullable java.lang.Long l) {
        this.accountModelId = l;
    }

    public final void setActive(boolean z) {
        this.active = z;
    }

    public final void setAddress(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void setC(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void setCreatedAt(@org.jetbrains.annotations.NotNull java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.createdAt = date;
    }

    public final void setD(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.d = str;
    }

    public final void setDate(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.date = str;
    }

    public final void setDatetime(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.datetime = str;
    }

    public final void setDeleted(boolean z) {
        this.deleted = z;
    }

    public final void setDffVal1(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dffVal1 = str;
    }

    public final void setDffVal2(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dffVal2 = str;
    }

    public final void setDffVal3(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dffVal3 = str;
    }

    public final void setDffVal4(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dffVal4 = str;
    }

    public final void setDffVal5(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dffVal5 = str;
    }

    public final void setF(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f = str;
    }

    public final void setG(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.g = str;
    }

    public final void setK(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.k = str;
    }

    public final void setMessageID(long j) {
        this.messageID = j;
    }

    public final void setMsgDate(@org.jetbrains.annotations.NotNull java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.msgDate = date;
    }

    public final void setO(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.o = str;
    }

    public final void setP(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.p = str;
    }

    public final void setPdoSource(@org.jetbrains.annotations.Nullable java.lang.Integer num) {
        this.pdoSource = num;
    }

    public final void setS(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.s = str;
    }

    public final void setSpamCategory(int i) {
        this.spamCategory = i;
    }

    public final void setState(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state = str;
    }

    public final void setSyntheticRecordId(@org.jetbrains.annotations.Nullable java.lang.Long l) {
        this.syntheticRecordId = l;
    }

    public final void setVal1(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.val1 = str;
    }

    public final void setVal2(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.val2 = str;
    }

    public final void setVal3(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.val3 = str;
    }

    public final void setVal4(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.val4 = str;
    }

    public final void setVal5(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.val5 = str;
    }
}
