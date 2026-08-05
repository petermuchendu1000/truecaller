package com.truecaller.ads.mediation.model.rtb;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/truecaller/ads/mediation/model/rtb/Device;", "", "ip", "", "ua", "ifa", "os", "geo", "Lcom/truecaller/ads/mediation/model/rtb/Geo;", "ipv6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/ads/mediation/model/rtb/Geo;Ljava/lang/String;)V", "getIp", "()Ljava/lang/String;", "getUa", "getIfa", "getOs", "getGeo", "()Lcom/truecaller/ads/mediation/model/rtb/Geo;", "getIpv6", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Device {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.mediation.model.rtb.Geo geo;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String ifa;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String ip;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String ipv6;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String os;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String ua;

    public Device(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.Nullable com.truecaller.ads.mediation.model.rtb.Geo geo, @org.jetbrains.annotations.Nullable java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "ua");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "ifa");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "os");
        this.ip = str;
        this.ua = str2;
        this.ifa = str3;
        this.os = str4;
        this.geo = geo;
        this.ipv6 = str5;
    }

    public static /* synthetic */ com.truecaller.ads.mediation.model.rtb.Device copy$default(com.truecaller.ads.mediation.model.rtb.Device device, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.truecaller.ads.mediation.model.rtb.Geo geo, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = device.ip;
        }
        if ((i & 2) != 0) {
            str2 = device.ua;
        }
        if ((i & 4) != 0) {
            str3 = device.ifa;
        }
        if ((i & 8) != 0) {
            str4 = device.os;
        }
        if ((i & 16) != 0) {
            geo = device.geo;
        }
        if ((i & 32) != 0) {
            str5 = device.ipv6;
        }
        com.truecaller.ads.mediation.model.rtb.Geo geo2 = geo;
        java.lang.String str6 = str5;
        return device.copy(str, str2, str3, str4, geo2, str6);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getIp() {
        return this.ip;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUa() {
        return this.ua;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getIfa() {
        return this.ifa;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getOs() {
        return this.os;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final com.truecaller.ads.mediation.model.rtb.Geo getGeo() {
        return this.geo;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getIpv6() {
        return this.ipv6;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.rtb.Device copy(@org.jetbrains.annotations.Nullable java.lang.String ip, @org.jetbrains.annotations.NotNull java.lang.String ua, @org.jetbrains.annotations.NotNull java.lang.String ifa, @org.jetbrains.annotations.NotNull java.lang.String os, @org.jetbrains.annotations.Nullable com.truecaller.ads.mediation.model.rtb.Geo geo, @org.jetbrains.annotations.Nullable java.lang.String ipv6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ua, "ua");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ifa, "ifa");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(os, "os");
        return new com.truecaller.ads.mediation.model.rtb.Device(ip, ua, ifa, os, geo, ipv6);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.model.rtb.Device)) {
            return false;
        }
        com.truecaller.ads.mediation.model.rtb.Device device = (com.truecaller.ads.mediation.model.rtb.Device) other;
        return kotlin.jvm.internal.Intrinsics.b(this.ip, device.ip) && kotlin.jvm.internal.Intrinsics.b(this.ua, device.ua) && kotlin.jvm.internal.Intrinsics.b(this.ifa, device.ifa) && kotlin.jvm.internal.Intrinsics.b(this.os, device.os) && kotlin.jvm.internal.Intrinsics.b(this.geo, device.geo) && kotlin.jvm.internal.Intrinsics.b(this.ipv6, device.ipv6);
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.mediation.model.rtb.Geo getGeo() {
        return this.geo;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIfa() {
        return this.ifa;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIp() {
        return this.ip;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIpv6() {
        return this.ipv6;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOs() {
        return this.os;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUa() {
        return this.ua;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        java.lang.String str = this.ip;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(hashCode * 31, 31, this.ua), 31, this.ifa), 31, this.os);
        com.truecaller.ads.mediation.model.rtb.Geo geo = this.geo;
        if (geo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = geo.hashCode();
        }
        int i2 = (e + hashCode2) * 31;
        java.lang.String str2 = this.ipv6;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.ip;
        java.lang.String str2 = this.ua;
        java.lang.String str3 = this.ifa;
        java.lang.String str4 = this.os;
        com.truecaller.ads.mediation.model.rtb.Geo geo = this.geo;
        java.lang.String str5 = this.ipv6;
        java.lang.StringBuilder E = ro0.f.E("Device(ip=", str, ", ua=", str2, ", ifa=");
        bar.E(E, str3, ", os=", str4, ", geo=");
        E.append(geo);
        E.append(", ipv6=");
        E.append(str5);
        E.append(")");
        return E.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Device(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.truecaller.ads.mediation.model.rtb.Geo r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = "1.1.1.1"
        L6:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto Lc
            r6 = r0
        Lc:
            r8 = r8 & 32
            if (r8 == 0) goto L18
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L1f
        L18:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L1f:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truecaller.ads.mediation.model.rtb.Device.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.truecaller.ads.mediation.model.rtb.Geo, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
