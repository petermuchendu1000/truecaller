package com.truecaller.insights.database.models.analytics;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Je\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\fHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006-"}, d2 = {"Lcom/truecaller/insights/database/models/analytics/AggregratedAnalyticsEvent;", "", "feature", "", "eventCategory", "eventInfo", "context", "actionType", "actionInfo", "eventDate", "Ljava/util/Date;", "counts", "", "propertyMap", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;ILjava/lang/String;)V", "getFeature", "()Ljava/lang/String;", "getEventCategory", "getEventInfo", "getContext", "getActionType", "getActionInfo", "getEventDate", "()Ljava/util/Date;", "getCounts", "()I", "getPropertyMap", "mapToAggregatedAnalyticsEventModel", "Lcom/truecaller/insights/database/models/analytics/AggregatedAnalyticsEventModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class AggregratedAnalyticsEvent {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String actionInfo;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String actionType;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String context;
    private final int counts;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String eventCategory;

    @org.jetbrains.annotations.NotNull
    private final java.util.Date eventDate;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String eventInfo;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String feature;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String propertyMap;

    public AggregratedAnalyticsEvent(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.NotNull java.lang.String str5, @org.jetbrains.annotations.NotNull java.lang.String str6, @org.jetbrains.annotations.NotNull java.util.Date date, int i, @org.jetbrains.annotations.Nullable java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "feature");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "eventCategory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "eventInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "actionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "actionInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "eventDate");
        this.feature = str;
        this.eventCategory = str2;
        this.eventInfo = str3;
        this.context = str4;
        this.actionType = str5;
        this.actionInfo = str6;
        this.eventDate = date;
        this.counts = i;
        this.propertyMap = str7;
    }

    public static /* synthetic */ com.truecaller.insights.database.models.analytics.AggregratedAnalyticsEvent copy$default(com.truecaller.insights.database.models.analytics.AggregratedAnalyticsEvent aggregratedAnalyticsEvent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Date date, int i, java.lang.String str7, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = aggregratedAnalyticsEvent.feature;
        }
        if ((i2 & 2) != 0) {
            str2 = aggregratedAnalyticsEvent.eventCategory;
        }
        if ((i2 & 4) != 0) {
            str3 = aggregratedAnalyticsEvent.eventInfo;
        }
        if ((i2 & 8) != 0) {
            str4 = aggregratedAnalyticsEvent.context;
        }
        if ((i2 & 16) != 0) {
            str5 = aggregratedAnalyticsEvent.actionType;
        }
        if ((i2 & 32) != 0) {
            str6 = aggregratedAnalyticsEvent.actionInfo;
        }
        if ((i2 & 64) != 0) {
            date = aggregratedAnalyticsEvent.eventDate;
        }
        if ((i2 & 128) != 0) {
            i = aggregratedAnalyticsEvent.counts;
        }
        if ((i2 & 256) != 0) {
            str7 = aggregratedAnalyticsEvent.propertyMap;
        }
        int i3 = i;
        java.lang.String str8 = str7;
        java.lang.String str9 = str6;
        java.util.Date date2 = date;
        java.lang.String str10 = str5;
        java.lang.String str11 = str3;
        return aggregratedAnalyticsEvent.copy(str, str2, str11, str4, str10, str9, date2, i3, str8);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFeature() {
        return this.feature;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEventCategory() {
        return this.eventCategory;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEventInfo() {
        return this.eventInfo;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getContext() {
        return this.context;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getActionType() {
        return this.actionType;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getActionInfo() {
        return this.actionInfo;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component7, reason: from getter */
    public final java.util.Date getEventDate() {
        return this.eventDate;
    }

    /* renamed from: component8, reason: from getter */
    public final int getCounts() {
        return this.counts;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component9, reason: from getter */
    public final java.lang.String getPropertyMap() {
        return this.propertyMap;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.models.analytics.AggregratedAnalyticsEvent copy(@org.jetbrains.annotations.NotNull java.lang.String feature, @org.jetbrains.annotations.NotNull java.lang.String eventCategory, @org.jetbrains.annotations.NotNull java.lang.String eventInfo, @org.jetbrains.annotations.NotNull java.lang.String context, @org.jetbrains.annotations.NotNull java.lang.String actionType, @org.jetbrains.annotations.NotNull java.lang.String actionInfo, @org.jetbrains.annotations.NotNull java.util.Date eventDate, int counts, @org.jetbrains.annotations.Nullable java.lang.String propertyMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "feature");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventCategory, "eventCategory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventInfo, "eventInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "actionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDate, "eventDate");
        return new com.truecaller.insights.database.models.analytics.AggregratedAnalyticsEvent(feature, eventCategory, eventInfo, context, actionType, actionInfo, eventDate, counts, propertyMap);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.models.analytics.AggregratedAnalyticsEvent)) {
            return false;
        }
        com.truecaller.insights.database.models.analytics.AggregratedAnalyticsEvent aggregratedAnalyticsEvent = (com.truecaller.insights.database.models.analytics.AggregratedAnalyticsEvent) other;
        return kotlin.jvm.internal.Intrinsics.b(this.feature, aggregratedAnalyticsEvent.feature) && kotlin.jvm.internal.Intrinsics.b(this.eventCategory, aggregratedAnalyticsEvent.eventCategory) && kotlin.jvm.internal.Intrinsics.b(this.eventInfo, aggregratedAnalyticsEvent.eventInfo) && kotlin.jvm.internal.Intrinsics.b(this.context, aggregratedAnalyticsEvent.context) && kotlin.jvm.internal.Intrinsics.b(this.actionType, aggregratedAnalyticsEvent.actionType) && kotlin.jvm.internal.Intrinsics.b(this.actionInfo, aggregratedAnalyticsEvent.actionInfo) && kotlin.jvm.internal.Intrinsics.b(this.eventDate, aggregratedAnalyticsEvent.eventDate) && this.counts == aggregratedAnalyticsEvent.counts && kotlin.jvm.internal.Intrinsics.b(this.propertyMap, aggregratedAnalyticsEvent.propertyMap);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActionInfo() {
        return this.actionInfo;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActionType() {
        return this.actionType;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContext() {
        return this.context;
    }

    public final int getCounts() {
        return this.counts;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEventCategory() {
        return this.eventCategory;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getEventDate() {
        return this.eventDate;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEventInfo() {
        return this.eventInfo;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFeature() {
        return this.feature;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPropertyMap() {
        return this.propertyMap;
    }

    public int hashCode() {
        int hashCode;
        int h = (uf.qux.h(this.eventDate, ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(this.feature.hashCode() * 31, 31, this.eventCategory), 31, this.eventInfo), 31, this.context), 31, this.actionType), 31, this.actionInfo), 31) + this.counts) * 31;
        java.lang.String str = this.propertyMap;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return h + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.models.analytics.AggregatedAnalyticsEventModel mapToAggregatedAnalyticsEventModel() {
        return new com.truecaller.insights.database.models.analytics.AggregatedAnalyticsEventModel(this.feature, this.eventCategory, this.eventInfo, this.context, this.actionType, this.actionInfo, this.eventDate, this.counts, 0L, null, false, this.propertyMap, 1792, null);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.feature;
        java.lang.String str2 = this.eventCategory;
        java.lang.String str3 = this.eventInfo;
        java.lang.String str4 = this.context;
        java.lang.String str5 = this.actionType;
        java.lang.String str6 = this.actionInfo;
        java.util.Date date = this.eventDate;
        int i = this.counts;
        java.lang.String str7 = this.propertyMap;
        java.lang.StringBuilder E = ro0.f.E("AggregratedAnalyticsEvent(feature=", str, ", eventCategory=", str2, ", eventInfo=");
        bar.E(E, str3, ", context=", str4, ", actionType=");
        bar.E(E, str5, ", actionInfo=", str6, ", eventDate=");
        E.append(date);
        E.append(", counts=");
        E.append(i);
        E.append(", propertyMap=");
        return bar.v(str7, ")", E);
    }
}
