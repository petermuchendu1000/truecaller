package com.truecaller.insights.core.smartnotifications.helper;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0003J\u0006\u0010\u000f\u001a\u00020\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006!"}, d2 = {"Lcom/truecaller/insights/core/smartnotifications/helper/OtpAnalyticsModel;", "Landroid/os/Parcelable;", "otpProcessor", "", "message", "Lcom/truecaller/messaging/data/types/Message;", "rawMessageId", "<init>", "(Ljava/lang/String;Lcom/truecaller/messaging/data/types/Message;Ljava/lang/String;)V", "getOtpProcessor", "()Ljava/lang/String;", "getMessage", "()Lcom/truecaller/messaging/data/types/Message;", "getRawMessageId", "getContext", "getEventInfo", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class OtpAnalyticsModel implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.insights.core.smartnotifications.helper.OtpAnalyticsModel> CREATOR = new hn.bar(3);

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.messaging.data.types.Message message;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String otpProcessor;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String rawMessageId;

    public OtpAnalyticsModel(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull com.truecaller.messaging.data.types.Message message, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "otpProcessor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "rawMessageId");
        this.otpProcessor = str;
        this.message = message;
        this.rawMessageId = str2;
    }

    public static /* synthetic */ com.truecaller.insights.core.smartnotifications.helper.OtpAnalyticsModel copy$default(com.truecaller.insights.core.smartnotifications.helper.OtpAnalyticsModel otpAnalyticsModel, java.lang.String str, com.truecaller.messaging.data.types.Message message, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = otpAnalyticsModel.otpProcessor;
        }
        if ((i & 2) != 0) {
            message = otpAnalyticsModel.message;
        }
        if ((i & 4) != 0) {
            str2 = otpAnalyticsModel.rawMessageId;
        }
        return otpAnalyticsModel.copy(str, message, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getOtpProcessor() {
        return this.otpProcessor;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.messaging.data.types.Message getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRawMessageId() {
        return this.rawMessageId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.core.smartnotifications.helper.OtpAnalyticsModel copy(@org.jetbrains.annotations.NotNull java.lang.String otpProcessor, @org.jetbrains.annotations.NotNull com.truecaller.messaging.data.types.Message message, @org.jetbrains.annotations.NotNull java.lang.String rawMessageId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpProcessor, "otpProcessor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawMessageId, "rawMessageId");
        return new com.truecaller.insights.core.smartnotifications.helper.OtpAnalyticsModel(otpProcessor, message, rawMessageId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.core.smartnotifications.helper.OtpAnalyticsModel)) {
            return false;
        }
        com.truecaller.insights.core.smartnotifications.helper.OtpAnalyticsModel otpAnalyticsModel = (com.truecaller.insights.core.smartnotifications.helper.OtpAnalyticsModel) other;
        return kotlin.jvm.internal.Intrinsics.b(this.otpProcessor, otpAnalyticsModel.otpProcessor) && kotlin.jvm.internal.Intrinsics.b(this.message, otpAnalyticsModel.message) && kotlin.jvm.internal.Intrinsics.b(this.rawMessageId, otpAnalyticsModel.rawMessageId);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContext() {
        int i = this.message.k;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return "unsupported";
                }
                return "im";
            }
            return "mms";
        }
        return "sms";
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEventInfo() {
        java.lang.String str = this.message.c.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "normalizedAddress");
        return str;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.data.types.Message getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOtpProcessor() {
        return this.otpProcessor;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRawMessageId() {
        return this.rawMessageId;
    }

    public int hashCode() {
        return this.rawMessageId.hashCode() + ((this.message.hashCode() + (this.otpProcessor.hashCode() * 31)) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.otpProcessor;
        com.truecaller.messaging.data.types.Message message = this.message;
        java.lang.String str2 = this.rawMessageId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OtpAnalyticsModel(otpProcessor=");
        sb.append(str);
        sb.append(", message=");
        sb.append(message);
        sb.append(", rawMessageId=");
        return bar.v(str2, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.otpProcessor);
        dest.writeParcelable(this.message, flags);
        dest.writeString(this.rawMessageId);
    }
}
