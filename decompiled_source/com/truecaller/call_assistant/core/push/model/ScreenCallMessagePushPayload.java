package com.truecaller.call_assistant.core.push.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JF\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/truecaller/call_assistant/core/push/model/ScreenCallMessagePushPayload;", "", "text", "", "isFinal", "", "payloadType", "", "summary", "terminationReason", "<init>", "(Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;I)V", "getText", "()Ljava/lang/String;", "()Z", "getPayloadType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSummary", "getTerminationReason", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;I)Lcom/truecaller/call_assistant/core/push/model/ScreenCallMessagePushPayload;", "equals", "other", "hashCode", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class ScreenCallMessagePushPayload {
    public static final int $stable = 0;
    private final boolean isFinal;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer payloadType;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String summary;
    private final int terminationReason;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String text;

    public ScreenCallMessagePushPayload(@org.jetbrains.annotations.Nullable java.lang.String str, boolean z, @org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.Nullable java.lang.String str2, int i) {
        this.text = str;
        this.isFinal = z;
        this.payloadType = num;
        this.summary = str2;
        this.terminationReason = i;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.push.model.ScreenCallMessagePushPayload copy$default(com.truecaller.call_assistant.core.push.model.ScreenCallMessagePushPayload screenCallMessagePushPayload, java.lang.String str, boolean z, java.lang.Integer num, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = screenCallMessagePushPayload.text;
        }
        if ((i2 & 2) != 0) {
            z = screenCallMessagePushPayload.isFinal;
        }
        if ((i2 & 4) != 0) {
            num = screenCallMessagePushPayload.payloadType;
        }
        if ((i2 & 8) != 0) {
            str2 = screenCallMessagePushPayload.summary;
        }
        if ((i2 & 16) != 0) {
            i = screenCallMessagePushPayload.terminationReason;
        }
        int i3 = i;
        java.lang.Integer num2 = num;
        return screenCallMessagePushPayload.copy(str, z, num2, str2, i3);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFinal() {
        return this.isFinal;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getPayloadType() {
        return this.payloadType;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSummary() {
        return this.summary;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTerminationReason() {
        return this.terminationReason;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.push.model.ScreenCallMessagePushPayload copy(@org.jetbrains.annotations.Nullable java.lang.String text, boolean isFinal, @org.jetbrains.annotations.Nullable java.lang.Integer payloadType, @org.jetbrains.annotations.Nullable java.lang.String summary, int terminationReason) {
        return new com.truecaller.call_assistant.core.push.model.ScreenCallMessagePushPayload(text, isFinal, payloadType, summary, terminationReason);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.push.model.ScreenCallMessagePushPayload)) {
            return false;
        }
        com.truecaller.call_assistant.core.push.model.ScreenCallMessagePushPayload screenCallMessagePushPayload = (com.truecaller.call_assistant.core.push.model.ScreenCallMessagePushPayload) other;
        return kotlin.jvm.internal.Intrinsics.b(this.text, screenCallMessagePushPayload.text) && this.isFinal == screenCallMessagePushPayload.isFinal && kotlin.jvm.internal.Intrinsics.b(this.payloadType, screenCallMessagePushPayload.payloadType) && kotlin.jvm.internal.Intrinsics.b(this.summary, screenCallMessagePushPayload.summary) && this.terminationReason == screenCallMessagePushPayload.terminationReason;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPayloadType() {
        return this.payloadType;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSummary() {
        return this.summary;
    }

    public final int getTerminationReason() {
        return this.terminationReason;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        java.lang.String str = this.text;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = hashCode * 31;
        if (this.isFinal) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i4 = (i3 + i) * 31;
        java.lang.Integer num = this.payloadType;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        java.lang.String str2 = this.summary;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((i5 + i2) * 31) + this.terminationReason;
    }

    public final boolean isFinal() {
        return this.isFinal;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.text;
        boolean z = this.isFinal;
        java.lang.Integer num = this.payloadType;
        java.lang.String str2 = this.summary;
        int i = this.terminationReason;
        java.lang.StringBuilder t = ax1.bar.t("ScreenCallMessagePushPayload(text=", str, ", isFinal=", ", payloadType=", z);
        bar.D(num, ", summary=", str2, ", terminationReason=", t);
        return bar.m(i, ")", t);
    }
}
