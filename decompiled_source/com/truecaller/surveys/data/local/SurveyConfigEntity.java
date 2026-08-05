package com.truecaller.surveys.data.local;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/truecaller/surveys/data/local/SurveyConfigEntity;", "", "id", "", "surveyId", "", "contactId", "lastTimeAnswered", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;J)V", "getId", "()I", "getSurveyId", "()Ljava/lang/String;", "getContactId", "getLastTimeAnswered", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class SurveyConfigEntity {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String contactId;
    private final int id;
    private final long lastTimeAnswered;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String surveyId;

    public SurveyConfigEntity(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "surveyId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "contactId");
        this.id = i;
        this.surveyId = str;
        this.contactId = str2;
        this.lastTimeAnswered = j;
    }

    public static /* synthetic */ com.truecaller.surveys.data.local.SurveyConfigEntity copy$default(com.truecaller.surveys.data.local.SurveyConfigEntity surveyConfigEntity, int i, java.lang.String str, java.lang.String str2, long j, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = surveyConfigEntity.id;
        }
        if ((i2 & 2) != 0) {
            str = surveyConfigEntity.surveyId;
        }
        if ((i2 & 4) != 0) {
            str2 = surveyConfigEntity.contactId;
        }
        if ((i2 & 8) != 0) {
            j = surveyConfigEntity.lastTimeAnswered;
        }
        java.lang.String str3 = str2;
        return surveyConfigEntity.copy(i, str, str3, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSurveyId() {
        return this.surveyId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getContactId() {
        return this.contactId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getLastTimeAnswered() {
        return this.lastTimeAnswered;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.surveys.data.local.SurveyConfigEntity copy(int id, @org.jetbrains.annotations.NotNull java.lang.String surveyId, @org.jetbrains.annotations.NotNull java.lang.String contactId, long lastTimeAnswered) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "contactId");
        return new com.truecaller.surveys.data.local.SurveyConfigEntity(id, surveyId, contactId, lastTimeAnswered);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.surveys.data.local.SurveyConfigEntity)) {
            return false;
        }
        com.truecaller.surveys.data.local.SurveyConfigEntity surveyConfigEntity = (com.truecaller.surveys.data.local.SurveyConfigEntity) other;
        return this.id == surveyConfigEntity.id && kotlin.jvm.internal.Intrinsics.b(this.surveyId, surveyConfigEntity.surveyId) && kotlin.jvm.internal.Intrinsics.b(this.contactId, surveyConfigEntity.contactId) && this.lastTimeAnswered == surveyConfigEntity.lastTimeAnswered;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContactId() {
        return this.contactId;
    }

    public final int getId() {
        return this.id;
    }

    public final long getLastTimeAnswered() {
        return this.lastTimeAnswered;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSurveyId() {
        return this.surveyId;
    }

    public int hashCode() {
        int e = ax1.bar.e(ax1.bar.e(this.id * 31, 31, this.surveyId), 31, this.contactId);
        long j = this.lastTimeAnswered;
        return e + ((int) (j ^ (j >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.id;
        java.lang.String str = this.surveyId;
        java.lang.String str2 = this.contactId;
        long j = this.lastTimeAnswered;
        java.lang.StringBuilder r = qb.qux.r("SurveyConfigEntity(id=", i, ", surveyId=", str, ", contactId=");
        com.appsflyer.internal.e.y(r, j, str2, ", lastTimeAnswered=");
        r.append(")");
        return r.toString();
    }

    public /* synthetic */ SurveyConfigEntity(int i, java.lang.String str, java.lang.String str2, long j, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, str2, j);
    }
}
