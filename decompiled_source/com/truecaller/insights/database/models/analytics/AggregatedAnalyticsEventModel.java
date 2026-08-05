package com.truecaller.insights.database.models.analytics;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0019J\u008a\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0019J\u0010\u0010,\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b,\u0010\"J\u001a\u0010.\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J!\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020100H\u0002¢\u0006\u0004\b2\u00103J\u0013\u00104\u001a\u00020\u0002*\u00020\tH\u0002¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010 R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010\"R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010$R\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\bC\u0010 R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\bF\u0010\u0019¨\u0006G"}, d2 = {"Lcom/truecaller/insights/database/models/analytics/AggregatedAnalyticsEventModel;", "", "", "feature", "eventCategory", "eventInfo", "context", "actionType", "actionInfo", "Ljava/util/Date;", "eventDate", "", "counts", "", "aggEventId", "createdAt", "", "consumed", "propertyMap", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;IJLjava/util/Date;ZLjava/lang/String;)V", "Lqx2/yd;", "mapToAppSmsInsightsEvent", "()Lqx2/yd;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/Date;", "component8", "()I", "component9", "()J", "component10", "component11", "()Z", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;IJLjava/util/Date;ZLjava/lang/String;)Lcom/truecaller/insights/database/models/analytics/AggregatedAnalyticsEventModel;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "", "Lkotlin/Pair;", "getDeserializedPropertyMap", "()Ljava/util/List;", "formatDate", "(Ljava/util/Date;)Ljava/lang/String;", "Ljava/lang/String;", "getFeature", "getEventCategory", "getEventInfo", "getContext", "getActionType", "getActionInfo", "Ljava/util/Date;", "getEventDate", "I", "getCounts", "J", "getAggEventId", "getCreatedAt", "Z", "getConsumed", "getPropertyMap", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class AggregatedAnalyticsEventModel {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String actionInfo;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String actionType;
    private final long aggEventId;
    private final boolean consumed;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String context;
    private final int counts;

    @org.jetbrains.annotations.NotNull
    private final java.util.Date createdAt;

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

    public AggregatedAnalyticsEventModel(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.NotNull java.lang.String str5, @org.jetbrains.annotations.NotNull java.lang.String str6, @org.jetbrains.annotations.NotNull java.util.Date date, int i, long j, @org.jetbrains.annotations.NotNull java.util.Date date2, boolean z, @org.jetbrains.annotations.Nullable java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "feature");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "eventCategory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "eventInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "actionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "actionInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "eventDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date2, "createdAt");
        this.feature = str;
        this.eventCategory = str2;
        this.eventInfo = str3;
        this.context = str4;
        this.actionType = str5;
        this.actionInfo = str6;
        this.eventDate = date;
        this.counts = i;
        this.aggEventId = j;
        this.createdAt = date2;
        this.consumed = z;
        this.propertyMap = str7;
    }

    public static /* synthetic */ com.truecaller.insights.database.models.analytics.AggregatedAnalyticsEventModel copy$default(com.truecaller.insights.database.models.analytics.AggregatedAnalyticsEventModel aggregatedAnalyticsEventModel, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Date date, int i, long j, java.util.Date date2, boolean z, java.lang.String str7, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = aggregatedAnalyticsEventModel.feature;
        }
        return aggregatedAnalyticsEventModel.copy(str, (i2 & 2) != 0 ? aggregatedAnalyticsEventModel.eventCategory : str2, (i2 & 4) != 0 ? aggregatedAnalyticsEventModel.eventInfo : str3, (i2 & 8) != 0 ? aggregatedAnalyticsEventModel.context : str4, (i2 & 16) != 0 ? aggregatedAnalyticsEventModel.actionType : str5, (i2 & 32) != 0 ? aggregatedAnalyticsEventModel.actionInfo : str6, (i2 & 64) != 0 ? aggregatedAnalyticsEventModel.eventDate : date, (i2 & 128) != 0 ? aggregatedAnalyticsEventModel.counts : i, (i2 & 256) != 0 ? aggregatedAnalyticsEventModel.aggEventId : j, (i2 & 512) != 0 ? aggregatedAnalyticsEventModel.createdAt : date2, (i2 & 1024) != 0 ? aggregatedAnalyticsEventModel.consumed : z, (i2 & 2048) != 0 ? aggregatedAnalyticsEventModel.propertyMap : str7);
    }

    private final java.lang.String formatDate(java.util.Date date) {
        java.lang.String g = com.truecaller.insights.commons.utils.DateFormat.yyyy_MM_dd.formatter().g(new org.joda.time.LocalDate(date));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(g, "print(...)");
        return g;
    }

    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getDeserializedPropertyMap() {
        java.util.List f0;
        try {
            java.lang.String str = this.propertyMap;
            if (str != null && (f0 = kotlin.text.StringsKt.f0(str, new char[]{','}, 6)) != null) {
                java.util.List list = f0;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.util.List f03 = kotlin.text.StringsKt.f0((java.lang.String) it.next(), new char[]{'='}, 6);
                    arrayList.add(new kotlin.Pair(f03.get(0), f03.get(1)));
                }
                return arrayList;
            }
            return kotlin.collections.h0.a;
        } catch (java.lang.Exception e) {
            bt1.baz.b(null, e);
            return kotlin.collections.h0.a;
        }
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFeature() {
        return this.feature;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component10, reason: from getter */
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getConsumed() {
        return this.consumed;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component12, reason: from getter */
    public final java.lang.String getPropertyMap() {
        return this.propertyMap;
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

    /* renamed from: component9, reason: from getter */
    public final long getAggEventId() {
        return this.aggEventId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.models.analytics.AggregatedAnalyticsEventModel copy(@org.jetbrains.annotations.NotNull java.lang.String feature, @org.jetbrains.annotations.NotNull java.lang.String eventCategory, @org.jetbrains.annotations.NotNull java.lang.String eventInfo, @org.jetbrains.annotations.NotNull java.lang.String context, @org.jetbrains.annotations.NotNull java.lang.String actionType, @org.jetbrains.annotations.NotNull java.lang.String actionInfo, @org.jetbrains.annotations.NotNull java.util.Date eventDate, int counts, long aggEventId, @org.jetbrains.annotations.NotNull java.util.Date createdAt, boolean consumed, @org.jetbrains.annotations.Nullable java.lang.String propertyMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "feature");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventCategory, "eventCategory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventInfo, "eventInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "actionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDate, "eventDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new com.truecaller.insights.database.models.analytics.AggregatedAnalyticsEventModel(feature, eventCategory, eventInfo, context, actionType, actionInfo, eventDate, counts, aggEventId, createdAt, consumed, propertyMap);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.models.analytics.AggregatedAnalyticsEventModel)) {
            return false;
        }
        com.truecaller.insights.database.models.analytics.AggregatedAnalyticsEventModel aggregatedAnalyticsEventModel = (com.truecaller.insights.database.models.analytics.AggregatedAnalyticsEventModel) other;
        return kotlin.jvm.internal.Intrinsics.b(this.feature, aggregatedAnalyticsEventModel.feature) && kotlin.jvm.internal.Intrinsics.b(this.eventCategory, aggregatedAnalyticsEventModel.eventCategory) && kotlin.jvm.internal.Intrinsics.b(this.eventInfo, aggregatedAnalyticsEventModel.eventInfo) && kotlin.jvm.internal.Intrinsics.b(this.context, aggregatedAnalyticsEventModel.context) && kotlin.jvm.internal.Intrinsics.b(this.actionType, aggregatedAnalyticsEventModel.actionType) && kotlin.jvm.internal.Intrinsics.b(this.actionInfo, aggregatedAnalyticsEventModel.actionInfo) && kotlin.jvm.internal.Intrinsics.b(this.eventDate, aggregatedAnalyticsEventModel.eventDate) && this.counts == aggregatedAnalyticsEventModel.counts && this.aggEventId == aggregatedAnalyticsEventModel.aggEventId && kotlin.jvm.internal.Intrinsics.b(this.createdAt, aggregatedAnalyticsEventModel.createdAt) && this.consumed == aggregatedAnalyticsEventModel.consumed && kotlin.jvm.internal.Intrinsics.b(this.propertyMap, aggregatedAnalyticsEventModel.propertyMap);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActionInfo() {
        return this.actionInfo;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActionType() {
        return this.actionType;
    }

    public final long getAggEventId() {
        return this.aggEventId;
    }

    public final boolean getConsumed() {
        return this.consumed;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContext() {
        return this.context;
    }

    public final int getCounts() {
        return this.counts;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
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
        int i;
        int hashCode;
        int h = (uf.qux.h(this.eventDate, ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(this.feature.hashCode() * 31, 31, this.eventCategory), 31, this.eventInfo), 31, this.context), 31, this.actionType), 31, this.actionInfo), 31) + this.counts) * 31;
        long j = this.aggEventId;
        int h2 = uf.qux.h(this.createdAt, (h + ((int) (j ^ (j >>> 32)))) * 31, 31);
        if (this.consumed) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i2 = (h2 + i) * 31;
        java.lang.String str = this.propertyMap;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i2 + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public final qx2.yd mapToAppSmsInsightsEvent() {
        hi3.e eVar = new hi3.e(qx2.yd.o, qx2.yd.p);
        java.lang.String str = this.feature;
        bi3.j0[] j0VarArr = eVar.b;
        hi3.e.d(j0VarArr[2], str);
        ((qx2.z9) eVar).g = str;
        boolean[] zArr = eVar.c;
        zArr[2] = true;
        java.lang.String str2 = this.eventCategory;
        hi3.e.d(j0VarArr[3], str2);
        ((qx2.z9) eVar).h = str2;
        zArr[3] = true;
        java.lang.String str3 = this.eventInfo;
        hi3.e.d(j0VarArr[4], str3);
        ((qx2.z9) eVar).i = str3;
        zArr[4] = true;
        java.lang.String str4 = this.context;
        hi3.e.d(j0VarArr[5], str4);
        ((qx2.z9) eVar).j = str4;
        zArr[5] = true;
        java.lang.String str5 = this.actionType;
        hi3.e.d(j0VarArr[6], str5);
        ((qx2.z9) eVar).k = str5;
        zArr[6] = true;
        int i = this.counts;
        bi3.j0 j0Var = j0VarArr[7];
        ((qx2.z9) eVar).e = i;
        zArr[7] = true;
        java.lang.String str6 = this.actionInfo;
        hi3.e.d(j0VarArr[9], str6);
        ((qx2.z9) eVar).m = str6;
        zArr[9] = true;
        java.lang.String formatDate = formatDate(this.eventDate);
        hi3.e.d(j0VarArr[10], formatDate);
        ((qx2.z9) eVar).n = formatDate;
        zArr[10] = true;
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> deserializedPropertyMap = getDeserializedPropertyMap();
        int b = kotlin.collections.q0.b(kotlin.collections.z.q(deserializedPropertyMap, 10));
        if (b < 16) {
            b = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(b);
        java.util.Iterator<T> it = deserializedPropertyMap.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            linkedHashMap.put(pair.a, pair.b);
        }
        bi3.j0 j0Var2 = j0VarArr[8];
        ((qx2.z9) eVar).l = linkedHashMap;
        zArr[8] = true;
        qx2.yd e = eVar.e();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "build(...)");
        return e;
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
        long j = this.aggEventId;
        java.util.Date date2 = this.createdAt;
        boolean z = this.consumed;
        java.lang.String str7 = this.propertyMap;
        java.lang.StringBuilder E = ro0.f.E("AggregatedAnalyticsEventModel(feature=", str, ", eventCategory=", str2, ", eventInfo=");
        bar.E(E, str3, ", context=", str4, ", actionType=");
        bar.E(E, str5, ", actionInfo=", str6, ", eventDate=");
        E.append(date);
        E.append(", counts=");
        E.append(i);
        E.append(", aggEventId=");
        E.append(j);
        E.append(", createdAt=");
        E.append(date2);
        E.append(", consumed=");
        E.append(z);
        E.append(", propertyMap=");
        E.append(str7);
        E.append(")");
        return E.toString();
    }

    public /* synthetic */ AggregatedAnalyticsEventModel(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Date date, int i, long j, java.util.Date date2, boolean z, java.lang.String str7, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, date, i, (i2 & 256) != 0 ? 0L : j, (i2 & 512) != 0 ? new java.util.Date() : date2, (i2 & 1024) != 0 ? false : z, str7);
    }
}
