package com.truecaller.ads.mediation.google;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/truecaller/ads/mediation/google/ServerParams;", "", "publisherId", "", "context", "adUnitId", "tagPrice", "layoutId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPublisherId", "()Ljava/lang/String;", "getContext", "getAdUnitId", "getTagPrice", "getLayoutId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class ServerParams {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String adUnitId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String context;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String layoutId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String publisherId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String tagPrice;

    public ServerParams() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ com.truecaller.ads.mediation.google.ServerParams copy$default(com.truecaller.ads.mediation.google.ServerParams serverParams, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = serverParams.publisherId;
        }
        if ((i & 2) != 0) {
            str2 = serverParams.context;
        }
        if ((i & 4) != 0) {
            str3 = serverParams.adUnitId;
        }
        if ((i & 8) != 0) {
            str4 = serverParams.tagPrice;
        }
        if ((i & 16) != 0) {
            str5 = serverParams.layoutId;
        }
        java.lang.String str6 = str5;
        java.lang.String str7 = str3;
        return serverParams.copy(str, str2, str7, str4, str6);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPublisherId() {
        return this.publisherId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getContext() {
        return this.context;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTagPrice() {
        return this.tagPrice;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getLayoutId() {
        return this.layoutId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.google.ServerParams copy(@org.jetbrains.annotations.NotNull java.lang.String publisherId, @org.jetbrains.annotations.NotNull java.lang.String context, @org.jetbrains.annotations.Nullable java.lang.String adUnitId, @org.jetbrains.annotations.Nullable java.lang.String tagPrice, @org.jetbrains.annotations.Nullable java.lang.String layoutId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherId, "publisherId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new com.truecaller.ads.mediation.google.ServerParams(publisherId, context, adUnitId, tagPrice, layoutId);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.google.ServerParams)) {
            return false;
        }
        com.truecaller.ads.mediation.google.ServerParams serverParams = (com.truecaller.ads.mediation.google.ServerParams) other;
        return kotlin.jvm.internal.Intrinsics.b(this.publisherId, serverParams.publisherId) && kotlin.jvm.internal.Intrinsics.b(this.context, serverParams.context) && kotlin.jvm.internal.Intrinsics.b(this.adUnitId, serverParams.adUnitId) && kotlin.jvm.internal.Intrinsics.b(this.tagPrice, serverParams.tagPrice) && kotlin.jvm.internal.Intrinsics.b(this.layoutId, serverParams.layoutId);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContext() {
        return this.context;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLayoutId() {
        return this.layoutId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPublisherId() {
        return this.publisherId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTagPrice() {
        return this.tagPrice;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int e = ax1.bar.e(this.publisherId.hashCode() * 31, 31, this.context);
        java.lang.String str = this.adUnitId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        java.lang.String str2 = this.tagPrice;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        java.lang.String str3 = this.layoutId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.publisherId;
        java.lang.String str2 = this.context;
        java.lang.String str3 = this.adUnitId;
        java.lang.String str4 = this.tagPrice;
        java.lang.String str5 = this.layoutId;
        java.lang.StringBuilder E = ro0.f.E("ServerParams(publisherId=", str, ", context=", str2, ", adUnitId=");
        bar.E(E, str3, ", tagPrice=", str4, ", layoutId=");
        return bar.v(str5, ")", E);
    }

    public ServerParams(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "publisherId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "context");
        this.publisherId = str;
        this.context = str2;
        this.adUnitId = str3;
        this.tagPrice = str4;
        this.layoutId = str5;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ ServerParams(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r2 = "734f7b23d66740c0abcca5ec9c532200"
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            java.lang.String r3 = "AFTERCALL"
        Lc:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L12
            r4 = r0
        L12:
            r8 = r7 & 8
            if (r8 == 0) goto L17
            r5 = r0
        L17:
            r7 = r7 & 16
            if (r7 == 0) goto L22
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L28
        L22:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L28:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truecaller.ads.mediation.google.ServerParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
