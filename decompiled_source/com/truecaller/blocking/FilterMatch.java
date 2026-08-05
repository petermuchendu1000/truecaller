package com.truecaller.blocking;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/truecaller/blocking/FilterMatch;", "Landroid/os/Parcelable;", "dj0/o", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class FilterMatch implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.blocking.FilterMatch> CREATOR;
    public static final com.truecaller.blocking.FilterMatch m = new com.truecaller.blocking.FilterMatch(0, com.truecaller.blocking.FilterAction.NONE_FOUND, com.truecaller.blocking.ActionSource.NONE, null, null, null, 0, null, null, null, null, false, 4089);
    public static final com.truecaller.blocking.FilterMatch n;
    public static final com.truecaller.blocking.FilterMatch o;
    public static final com.truecaller.blocking.FilterMatch p;
    public static final com.truecaller.blocking.FilterMatch q;
    public static final com.truecaller.blocking.FilterMatch r;
    public static final com.truecaller.blocking.FilterMatch s;
    public static final com.truecaller.blocking.FilterMatch t;
    public final long a;
    public final com.truecaller.blocking.FilterAction b;
    public final com.truecaller.blocking.ActionSource c;
    public final com.truecaller.blocking.api.model.FilterType d;
    public final java.lang.String e;
    public final com.truecaller.blocking.api.model.SyncState f;
    public final int g;
    public final com.truecaller.blocking.api.model.WildCardType h;
    public final java.util.List i;
    public final java.lang.Integer j;
    public final java.lang.Long k;
    public final boolean l;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        com.truecaller.blocking.FilterAction filterAction = com.truecaller.blocking.FilterAction.FILTER_BLACKLISTED;
        com.truecaller.blocking.ActionSource actionSource = com.truecaller.blocking.ActionSource.UNKNOWN;
        n = new com.truecaller.blocking.FilterMatch(0L, filterAction, actionSource, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, 4089);
        java.lang.Object[] objArr = 0 == true ? 1 : 0;
        java.lang.Object[] objArr2 = 0 == true ? 1 : 0;
        java.lang.Object[] objArr3 = 0 == true ? 1 : 0;
        o = new com.truecaller.blocking.FilterMatch(0L, com.truecaller.blocking.FilterAction.FILTER_DISABLED, actionSource, objArr, objArr2, 0 == true ? 1 : 0, objArr3, null, null, null, null, false, 4089);
        boolean z = false;
        int i = 4089;
        long j = 0;
        java.lang.String str = null;
        int i2 = 0;
        java.lang.Long l = null;
        p = new com.truecaller.blocking.FilterMatch(j, filterAction, com.truecaller.blocking.ActionSource.NON_PHONEBOOK, null, str, null, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, l, z, i);
        q = new com.truecaller.blocking.FilterMatch(j, filterAction, com.truecaller.blocking.ActionSource.FOREIGN, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, l, z, i);
        r = new com.truecaller.blocking.FilterMatch(j, filterAction, com.truecaller.blocking.ActionSource.NEIGHBOUR_SPOOFING, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, l, z, i);
        s = new com.truecaller.blocking.FilterMatch(j, filterAction, com.truecaller.blocking.ActionSource.NUMBER_SERIES, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, l, z, i);
        new com.truecaller.blocking.FilterMatch(j, filterAction, com.truecaller.blocking.ActionSource.SPAMMER, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, l, z, i);
        new com.truecaller.blocking.FilterMatch(0L, com.truecaller.blocking.FilterAction.ALLOW_WHITELISTED, com.truecaller.blocking.ActionSource.CUSTOM_WHITELIST, null, null, null, 0, null, null, null, null, false, 4089);
        java.lang.Object[] objArr4 = 0 == true ? 1 : 0;
        java.lang.Object[] objArr5 = 0 == true ? 1 : 0;
        t = new com.truecaller.blocking.FilterMatch(0L, com.truecaller.blocking.FilterAction.FILTER_AUTO_REJECT, com.truecaller.blocking.ActionSource.ASSISTANT_AUTO_REJECT, null, null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, null, objArr4, objArr5, false, 4089);
        CREATOR = new cb1.bar(14);
    }

    public FilterMatch(long j, com.truecaller.blocking.FilterAction filterAction, com.truecaller.blocking.ActionSource actionSource, com.truecaller.blocking.api.model.FilterType filterType, java.lang.String str, com.truecaller.blocking.api.model.SyncState syncState, int i, com.truecaller.blocking.api.model.WildCardType wildCardType, java.util.List list, java.lang.Integer num, java.lang.Long l, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterAction, "action");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionSource, "filterSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterType, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncState, "syncState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wildCardType, "wildCardType");
        this.a = j;
        this.b = filterAction;
        this.c = actionSource;
        this.d = filterType;
        this.e = str;
        this.f = syncState;
        this.g = i;
        this.h = wildCardType;
        this.i = list;
        this.j = num;
        this.k = l;
        this.l = z;
    }

    public final boolean a() {
        if (this.b == com.truecaller.blocking.FilterAction.FILTER_BLACKLISTED) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (!equals(m) && !equals(dj0.o.a)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        if (this.c == com.truecaller.blocking.ActionSource.TOP_SPAMMER) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.b == com.truecaller.blocking.FilterAction.ALLOW_WHITELISTED) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.blocking.FilterMatch)) {
            return false;
        }
        com.truecaller.blocking.FilterMatch filterMatch = (com.truecaller.blocking.FilterMatch) obj;
        return this.a == filterMatch.a && this.b == filterMatch.b && this.c == filterMatch.c && this.d == filterMatch.d && kotlin.jvm.internal.Intrinsics.b(this.e, filterMatch.e) && this.f == filterMatch.f && this.g == filterMatch.g && this.h == filterMatch.h && kotlin.jvm.internal.Intrinsics.b(this.i, filterMatch.i) && kotlin.jvm.internal.Intrinsics.b(this.j, filterMatch.j) && kotlin.jvm.internal.Intrinsics.b(this.k, filterMatch.k) && this.l == filterMatch.l;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i;
        long j = this.a;
        int hashCode4 = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31)) * 31;
        int i2 = 0;
        java.lang.String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (this.h.hashCode() + ((((this.f.hashCode() + ((hashCode4 + hashCode) * 31)) * 31) + this.g) * 31)) * 31;
        java.util.List list = this.i;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (hashCode5 + hashCode2) * 31;
        java.lang.Integer num = this.j;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        java.lang.Long l = this.k;
        if (l != null) {
            i2 = l.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (this.l) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i5 + i;
    }

    public final java.lang.String toString() {
        return "FilterMatch(id=" + this.a + ", action=" + this.b + ", filterSource=" + this.c + ", type=" + this.d + ", label=" + this.e + ", syncState=" + this.f + ", count=" + this.g + ", wildCardType=" + this.h + ", spamCategoryIds=" + this.i + ", spamVersion=" + this.j + ", timestamp=" + this.k + ", isManualBlock=" + this.l + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2;
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeLong(this.a);
        parcel.writeInt(this.b.ordinal());
        parcel.writeInt(this.c.ordinal());
        parcel.writeInt(this.d.ordinal());
        parcel.writeString(this.e);
        parcel.writeInt(this.f.ordinal());
        parcel.writeInt(this.g);
        parcel.writeInt(this.h.ordinal());
        parcel.writeList(this.i);
        java.lang.Integer num = this.j;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
        java.lang.Long l = this.k;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        parcel.writeLong(j);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ FilterMatch(long r18, com.truecaller.blocking.FilterAction r20, com.truecaller.blocking.ActionSource r21, com.truecaller.blocking.api.model.FilterType r22, java.lang.String r23, com.truecaller.blocking.api.model.SyncState r24, int r25, com.truecaller.blocking.api.model.WildCardType r26, java.util.ArrayList r27, java.lang.Integer r28, java.lang.Long r29, boolean r30, int r31) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 1
            if (r1 == 0) goto La
            r1 = -1
            r4 = r1
            goto Lc
        La:
            r4 = r18
        Lc:
            r1 = r0 & 8
            if (r1 == 0) goto L14
            com.truecaller.blocking.api.model.FilterType r1 = com.truecaller.blocking.api.model.FilterType.PRIVATE
            r8 = r1
            goto L16
        L14:
            r8 = r22
        L16:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L1d
            r9 = r2
            goto L1f
        L1d:
            r9 = r23
        L1f:
            r1 = r0 & 32
            if (r1 == 0) goto L27
            com.truecaller.blocking.api.model.SyncState r1 = com.truecaller.blocking.api.model.SyncState.NONE_NEEDED
            r10 = r1
            goto L29
        L27:
            r10 = r24
        L29:
            r1 = r0 & 64
            r3 = 0
            if (r1 == 0) goto L30
            r11 = r3
            goto L32
        L30:
            r11 = r25
        L32:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L3a
            com.truecaller.blocking.api.model.WildCardType r1 = com.truecaller.blocking.api.model.WildCardType.NONE
            r12 = r1
            goto L3c
        L3a:
            r12 = r26
        L3c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L42
            r13 = r2
            goto L44
        L42:
            r13 = r27
        L44:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L4a
            r14 = r2
            goto L4c
        L4a:
            r14 = r28
        L4c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L52
            r15 = r2
            goto L54
        L52:
            r15 = r29
        L54:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L61
            r16 = r3
            r6 = r20
            r7 = r21
            r3 = r17
            goto L69
        L61:
            r16 = r30
            r3 = r17
            r6 = r20
            r7 = r21
        L69:
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truecaller.blocking.FilterMatch.<init>(long, com.truecaller.blocking.FilterAction, com.truecaller.blocking.ActionSource, com.truecaller.blocking.api.model.FilterType, java.lang.String, com.truecaller.blocking.api.model.SyncState, int, com.truecaller.blocking.api.model.WildCardType, java.util.ArrayList, java.lang.Integer, java.lang.Long, boolean, int):void");
    }
}
