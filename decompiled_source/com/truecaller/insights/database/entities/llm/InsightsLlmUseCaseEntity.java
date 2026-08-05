package com.truecaller.insights.database.entities.llm;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lcom/truecaller/insights/database/entities/llm/InsightsLlmUseCaseEntity;", "", "useCasePrimaryId", "", "useCaseId", "", "patternId", "useCaseTitle", "useCaseSubtitle", "useCaseStatus", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUseCasePrimaryId", "()I", "getUseCaseId", "()Ljava/lang/String;", "getPatternId", "getUseCaseTitle", "getUseCaseSubtitle", "getUseCaseStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class InsightsLlmUseCaseEntity {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String patternId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String useCaseId;
    private final int useCasePrimaryId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String useCaseStatus;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String useCaseSubtitle;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String useCaseTitle;

    public InsightsLlmUseCaseEntity(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "useCaseId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "patternId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "useCaseTitle");
        this.useCasePrimaryId = i;
        this.useCaseId = str;
        this.patternId = str2;
        this.useCaseTitle = str3;
        this.useCaseSubtitle = str4;
        this.useCaseStatus = str5;
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.llm.InsightsLlmUseCaseEntity copy$default(com.truecaller.insights.database.entities.llm.InsightsLlmUseCaseEntity insightsLlmUseCaseEntity, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = insightsLlmUseCaseEntity.useCasePrimaryId;
        }
        if ((i2 & 2) != 0) {
            str = insightsLlmUseCaseEntity.useCaseId;
        }
        if ((i2 & 4) != 0) {
            str2 = insightsLlmUseCaseEntity.patternId;
        }
        if ((i2 & 8) != 0) {
            str3 = insightsLlmUseCaseEntity.useCaseTitle;
        }
        if ((i2 & 16) != 0) {
            str4 = insightsLlmUseCaseEntity.useCaseSubtitle;
        }
        if ((i2 & 32) != 0) {
            str5 = insightsLlmUseCaseEntity.useCaseStatus;
        }
        java.lang.String str6 = str4;
        java.lang.String str7 = str5;
        return insightsLlmUseCaseEntity.copy(i, str, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUseCasePrimaryId() {
        return this.useCasePrimaryId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUseCaseId() {
        return this.useCaseId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPatternId() {
        return this.patternId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getUseCaseTitle() {
        return this.useCaseTitle;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getUseCaseSubtitle() {
        return this.useCaseSubtitle;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getUseCaseStatus() {
        return this.useCaseStatus;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.llm.InsightsLlmUseCaseEntity copy(int useCasePrimaryId, @org.jetbrains.annotations.NotNull java.lang.String useCaseId, @org.jetbrains.annotations.NotNull java.lang.String patternId, @org.jetbrains.annotations.NotNull java.lang.String useCaseTitle, @org.jetbrains.annotations.Nullable java.lang.String useCaseSubtitle, @org.jetbrains.annotations.Nullable java.lang.String useCaseStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseId, "useCaseId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(patternId, "patternId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseTitle, "useCaseTitle");
        return new com.truecaller.insights.database.entities.llm.InsightsLlmUseCaseEntity(useCasePrimaryId, useCaseId, patternId, useCaseTitle, useCaseSubtitle, useCaseStatus);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.llm.InsightsLlmUseCaseEntity)) {
            return false;
        }
        com.truecaller.insights.database.entities.llm.InsightsLlmUseCaseEntity insightsLlmUseCaseEntity = (com.truecaller.insights.database.entities.llm.InsightsLlmUseCaseEntity) other;
        return this.useCasePrimaryId == insightsLlmUseCaseEntity.useCasePrimaryId && kotlin.jvm.internal.Intrinsics.b(this.useCaseId, insightsLlmUseCaseEntity.useCaseId) && kotlin.jvm.internal.Intrinsics.b(this.patternId, insightsLlmUseCaseEntity.patternId) && kotlin.jvm.internal.Intrinsics.b(this.useCaseTitle, insightsLlmUseCaseEntity.useCaseTitle) && kotlin.jvm.internal.Intrinsics.b(this.useCaseSubtitle, insightsLlmUseCaseEntity.useCaseSubtitle) && kotlin.jvm.internal.Intrinsics.b(this.useCaseStatus, insightsLlmUseCaseEntity.useCaseStatus);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPatternId() {
        return this.patternId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUseCaseId() {
        return this.useCaseId;
    }

    public final int getUseCasePrimaryId() {
        return this.useCasePrimaryId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUseCaseStatus() {
        return this.useCaseStatus;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUseCaseSubtitle() {
        return this.useCaseSubtitle;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUseCaseTitle() {
        return this.useCaseTitle;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(this.useCasePrimaryId * 31, 31, this.useCaseId), 31, this.patternId), 31, this.useCaseTitle);
        java.lang.String str = this.useCaseSubtitle;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        java.lang.String str2 = this.useCaseStatus;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.useCasePrimaryId;
        java.lang.String str = this.useCaseId;
        java.lang.String str2 = this.patternId;
        java.lang.String str3 = this.useCaseTitle;
        java.lang.String str4 = this.useCaseSubtitle;
        java.lang.String str5 = this.useCaseStatus;
        java.lang.StringBuilder r = qb.qux.r("InsightsLlmUseCaseEntity(useCasePrimaryId=", i, ", useCaseId=", str, ", patternId=");
        bar.E(r, str2, ", useCaseTitle=", str3, ", useCaseSubtitle=");
        return bar.x(r, str4, ", useCaseStatus=", str5, ")");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ InsightsLlmUseCaseEntity(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto Lb
            r6 = r0
        Lb:
            r8 = r8 & 32
            if (r8 == 0) goto L17
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L1e
        L17:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L1e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truecaller.insights.database.entities.llm.InsightsLlmUseCaseEntity.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
