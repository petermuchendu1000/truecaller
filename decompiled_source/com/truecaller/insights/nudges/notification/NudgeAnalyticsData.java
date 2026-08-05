package com.truecaller.insights.nudges.notification;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006("}, d2 = {"Lcom/truecaller/insights/nudges/notification/NudgeAnalyticsData;", "Landroid/os/Parcelable;", "category", "", "dueDate", "Lorg/joda/time/DateTime;", "nudgeData", "transport", "rawSenderId", "normalizedSenderId", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getDueDate", "()Lorg/joda/time/DateTime;", "getNudgeData", "getTransport", "getRawSenderId", "getNormalizedSenderId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class NudgeAnalyticsData implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.insights.nudges.notification.NudgeAnalyticsData> CREATOR = new om0.bar(28);

    @org.jetbrains.annotations.NotNull
    private final java.lang.String category;

    @org.jetbrains.annotations.NotNull
    private final org.joda.time.DateTime dueDate;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String normalizedSenderId;

    @org.jetbrains.annotations.NotNull
    private final org.joda.time.DateTime nudgeData;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String rawSenderId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String transport;

    public NudgeAnalyticsData(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull org.joda.time.DateTime dateTime, @org.jetbrains.annotations.NotNull org.joda.time.DateTime dateTime2, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "category");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "dueDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime2, "nudgeData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "transport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "rawSenderId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "normalizedSenderId");
        this.category = str;
        this.dueDate = dateTime;
        this.nudgeData = dateTime2;
        this.transport = str2;
        this.rawSenderId = str3;
        this.normalizedSenderId = str4;
    }

    public static /* synthetic */ com.truecaller.insights.nudges.notification.NudgeAnalyticsData copy$default(com.truecaller.insights.nudges.notification.NudgeAnalyticsData nudgeAnalyticsData, java.lang.String str, org.joda.time.DateTime dateTime, org.joda.time.DateTime dateTime2, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = nudgeAnalyticsData.category;
        }
        if ((i & 2) != 0) {
            dateTime = nudgeAnalyticsData.dueDate;
        }
        if ((i & 4) != 0) {
            dateTime2 = nudgeAnalyticsData.nudgeData;
        }
        if ((i & 8) != 0) {
            str2 = nudgeAnalyticsData.transport;
        }
        if ((i & 16) != 0) {
            str3 = nudgeAnalyticsData.rawSenderId;
        }
        if ((i & 32) != 0) {
            str4 = nudgeAnalyticsData.normalizedSenderId;
        }
        java.lang.String str5 = str3;
        java.lang.String str6 = str4;
        return nudgeAnalyticsData.copy(str, dateTime, dateTime2, str2, str5, str6);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCategory() {
        return this.category;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final org.joda.time.DateTime getDueDate() {
        return this.dueDate;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final org.joda.time.DateTime getNudgeData() {
        return this.nudgeData;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTransport() {
        return this.transport;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getRawSenderId() {
        return this.rawSenderId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getNormalizedSenderId() {
        return this.normalizedSenderId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.nudges.notification.NudgeAnalyticsData copy(@org.jetbrains.annotations.NotNull java.lang.String category, @org.jetbrains.annotations.NotNull org.joda.time.DateTime dueDate, @org.jetbrains.annotations.NotNull org.joda.time.DateTime nudgeData, @org.jetbrains.annotations.NotNull java.lang.String transport, @org.jetbrains.annotations.NotNull java.lang.String rawSenderId, @org.jetbrains.annotations.NotNull java.lang.String normalizedSenderId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "category");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nudgeData, "nudgeData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transport, "transport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawSenderId, "rawSenderId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(normalizedSenderId, "normalizedSenderId");
        return new com.truecaller.insights.nudges.notification.NudgeAnalyticsData(category, dueDate, nudgeData, transport, rawSenderId, normalizedSenderId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.nudges.notification.NudgeAnalyticsData)) {
            return false;
        }
        com.truecaller.insights.nudges.notification.NudgeAnalyticsData nudgeAnalyticsData = (com.truecaller.insights.nudges.notification.NudgeAnalyticsData) other;
        return kotlin.jvm.internal.Intrinsics.b(this.category, nudgeAnalyticsData.category) && kotlin.jvm.internal.Intrinsics.b(this.dueDate, nudgeAnalyticsData.dueDate) && kotlin.jvm.internal.Intrinsics.b(this.nudgeData, nudgeAnalyticsData.nudgeData) && kotlin.jvm.internal.Intrinsics.b(this.transport, nudgeAnalyticsData.transport) && kotlin.jvm.internal.Intrinsics.b(this.rawSenderId, nudgeAnalyticsData.rawSenderId) && kotlin.jvm.internal.Intrinsics.b(this.normalizedSenderId, nudgeAnalyticsData.normalizedSenderId);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategory() {
        return this.category;
    }

    @org.jetbrains.annotations.NotNull
    public final org.joda.time.DateTime getDueDate() {
        return this.dueDate;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNormalizedSenderId() {
        return this.normalizedSenderId;
    }

    @org.jetbrains.annotations.NotNull
    public final org.joda.time.DateTime getNudgeData() {
        return this.nudgeData;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRawSenderId() {
        return this.rawSenderId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTransport() {
        return this.transport;
    }

    public int hashCode() {
        return this.normalizedSenderId.hashCode() + ax1.bar.e(ax1.bar.e(ro0.f.w(this.nudgeData, ro0.f.w(this.dueDate, this.category.hashCode() * 31, 31), 31), 31, this.transport), 31, this.rawSenderId);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.category;
        org.joda.time.DateTime dateTime = this.dueDate;
        org.joda.time.DateTime dateTime2 = this.nudgeData;
        java.lang.String str2 = this.transport;
        java.lang.String str3 = this.rawSenderId;
        java.lang.String str4 = this.normalizedSenderId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NudgeAnalyticsData(category=");
        sb.append(str);
        sb.append(", dueDate=");
        sb.append(dateTime);
        sb.append(", nudgeData=");
        sb.append(dateTime2);
        sb.append(", transport=");
        sb.append(str2);
        sb.append(", rawSenderId=");
        return bar.x(sb, str3, ", normalizedSenderId=", str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.category);
        dest.writeSerializable(this.dueDate);
        dest.writeSerializable(this.nudgeData);
        dest.writeString(this.transport);
        dest.writeString(this.rawSenderId);
        dest.writeString(this.normalizedSenderId);
    }
}
