package com.truecaller.messaging.inboxcleanup;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class d extends ff3.g implements kotlin.jvm.functions.Function2 {
    public java.util.List A;
    public java.util.List B;
    public kotlin.jvm.internal.h0 C;
    public java.util.ArrayList D;
    public kotlin.jvm.internal.h0 E;
    public kotlin.jvm.internal.h0 F;
    public java.lang.Object G;
    public java.lang.Object H;
    public java.lang.Object I;
    public java.lang.Object J;
    public java.util.List K;
    public java.util.List L;
    public long M;
    public long N;
    public long O;
    public int P;
    public int Q;
    public final /* synthetic */ com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker R;
    public f6.f0 x;
    public java.util.List y;
    public java.util.List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker, df3.bar barVar) {
        super(2, barVar);
        this.R = inboxManualCleanupWorker;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.messaging.inboxcleanup.d(this.R, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0441  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [kotlin.jvm.internal.h0] */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v7, types: [kotlin.jvm.internal.h0] */
    /* JADX WARN: Type inference failed for: r2v124, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v99, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v51, types: [kotlin.jvm.internal.h0] */
    /* JADX WARN: Type inference failed for: r4v57, types: [kotlin.jvm.internal.h0] */
    /* JADX WARN: Type inference failed for: r5v21, types: [kotlin.jvm.internal.h0] */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v20, types: [kotlin.jvm.internal.h0] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x050c -> B:87:0x0518). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x06ce -> B:37:0x06da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0713 -> B:41:0x0707). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x05d0 -> B:62:0x05dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0609 -> B:66:0x0611). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x04c3 -> B:83:0x04d3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        qo1.k kVar;
        m22.r rVar;
        java.lang.String str;
        nd.m mVar;
        java.util.List arrayList;
        long i;
        f6.f0 f0Var;
        long j;
        java.lang.Object c;
        f6.f0 f0Var2;
        java.util.List list;
        java.util.ArrayList arrayList2;
        m22.k kVar2;
        xz1.q qVar;
        long i2;
        java.lang.String str2;
        f6.f0 f0Var3;
        java.util.Collection collection;
        java.lang.Object obj2;
        java.util.List list2;
        java.util.Collection collection2;
        java.util.ArrayList arrayList3;
        java.util.List list3;
        long i3;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.util.Collection collection3;
        long j2;
        java.lang.Object d;
        long j3;
        java.util.ArrayList arrayList4;
        f6.f0 f0Var4;
        java.util.Collection collection4;
        java.util.Iterator it;
        java.util.Collection collection5;
        java.util.ArrayList arrayList5;
        java.util.ArrayList arrayList6;
        ef3.bar barVar;
        com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker;
        f6.f0 f0Var5;
        int i4;
        java.util.Collection collection6;
        long j4;
        ?? r10;
        long j5;
        long j6;
        ?? r14;
        java.lang.String str6;
        java.lang.String str7;
        ef3.bar barVar2;
        java.lang.String str8;
        int i5;
        ?? obj3;
        java.util.Iterator it2;
        long j7;
        f6.f0 f0Var6;
        com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker2;
        java.lang.String str9;
        java.util.List list4;
        com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker3;
        f6.f0 f0Var7;
        java.lang.String str10;
        ef3.bar barVar3;
        java.util.Collection collection7;
        java.util.ArrayList arrayList7;
        java.util.Iterator it3;
        java.lang.Object b;
        long j8;
        long j9;
        java.util.Collection collection8;
        f6.f0 f0Var8;
        int i6;
        com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker4;
        long j10;
        kotlin.jvm.internal.h0 h0Var;
        kotlin.jvm.internal.h0 h0Var2;
        kotlin.jvm.internal.h0 h0Var3;
        kotlin.jvm.internal.h0 h0Var4;
        boolean booleanValue;
        kotlin.jvm.internal.h0 h0Var5;
        kotlin.jvm.internal.h0 h0Var6;
        com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker5;
        java.lang.String str11;
        java.util.Iterator it4;
        java.util.ArrayList arrayList8;
        java.lang.Object obj4;
        long j11;
        java.util.ArrayList arrayList9;
        long j13;
        f6.f0 f0Var9;
        int i7;
        kotlin.jvm.internal.h0 h0Var7;
        com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker6;
        java.util.List list5;
        com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker7;
        java.util.Iterator it5;
        java.lang.String str12;
        long j14;
        com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker8;
        int i8;
        java.util.ArrayList arrayList10;
        java.lang.Object b2;
        long j15;
        kotlin.jvm.internal.h0 h0Var8;
        kotlin.jvm.internal.h0 h0Var9;
        kotlin.jvm.internal.h0 h0Var10;
        kotlin.jvm.internal.h0 h0Var11;
        kotlin.jvm.internal.h0 h0Var12;
        kotlin.jvm.internal.h0 h0Var13;
        boolean booleanValue2;
        kotlin.jvm.internal.h0 h0Var14;
        kotlin.jvm.internal.h0 h0Var15;
        ?? r4;
        kotlin.jvm.internal.h0 h0Var16;
        kotlin.jvm.internal.h0 h0Var17;
        java.util.List list6;
        f6.f0 f0Var10;
        java.util.Iterator it6;
        java.util.ArrayList arrayList11;
        java.lang.Object b3;
        java.util.ArrayList arrayList12;
        long j16;
        f6.f0 f0Var11;
        com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker9;
        long j17;
        kotlin.jvm.internal.h0 h0Var18;
        kotlin.jvm.internal.h0 h0Var19;
        kotlin.jvm.internal.h0 h0Var20;
        java.lang.Object obj5;
        kotlin.jvm.internal.h0 h0Var21;
        ?? r6;
        boolean booleanValue3;
        java.util.Iterator it7;
        boolean z;
        xz1.r rVar2;
        hi3.e eVar;
        int i9;
        com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker10 = this.R;
        qo1.k kVar3 = inboxManualCleanupWorker10.i;
        m22.r rVar3 = inboxManualCleanupWorker10.f;
        m22.k kVar4 = inboxManualCleanupWorker10.e;
        xz1.q qVar2 = inboxManualCleanupWorker10.d;
        ef3.bar barVar4 = ef3.bar.a;
        java.lang.String str13 = "isManualCleanupOtpEnabled";
        java.lang.String str14 = "getString(...)";
        switch (this.Q) {
            case 0:
                kVar = kVar3;
                rVar = rVar3;
                str = "isManualCleanupSpamEnabled";
                od.p.E(obj);
                com.truecaller.messaging.inboxcleanup.b bVar = (com.truecaller.messaging.inboxcleanup.b) rVar;
                android.content.Context context = bVar.a;
                java.lang.String string = context.getString(2132021717);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                f6.f0 a = com.truecaller.messaging.inboxcleanup.b.a(bVar, string, null, null, 30);
                a.l(2, true);
                a.q(100, 0, true);
                java.lang.String string2 = context.getString(2132021748);
                android.content.Context context2 = bVar.a;
                android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.truecaller.messaging.inboxcleanup.InboxCleanerBroadcastReceiver.class);
                intent.setAction("com.truecaller.stop_cleanup");
                a.a(0, ((s62.f) bVar.b).m(com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), 0, 201326592, context2, intent, "inboxCleanupManual"), string2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "addAction(...)");
                android.app.Notification d2 = a.d();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    mVar = new nd.m(2131364630, d2, 1);
                } else {
                    mVar = new nd.m(2131364630, d2, 0);
                }
                inboxManualCleanupWorker10.setForegroundAsync(mVar).get();
                arrayList = new java.util.ArrayList();
                i = new org.joda.time.DateTime().x(((xz1.r) qVar2).u0()).i();
                if (((xz1.r) qVar2).z("isManualCleanupOtpEnabled", true)) {
                    this.x = a;
                    this.y = arrayList;
                    this.z = arrayList;
                    this.M = i;
                    this.Q = 1;
                    c = ((com.truecaller.messaging.inboxcleanup.a) kVar4).c(i, this);
                    if (c != barVar4) {
                        f0Var2 = a;
                        list = arrayList;
                        arrayList.addAll((java.util.Collection) c);
                        arrayList = list;
                        j = i;
                        f0Var = f0Var2;
                        arrayList2 = new java.util.ArrayList();
                        kVar2 = kVar4;
                        qVar = qVar2;
                        i2 = new org.joda.time.DateTime().x(((xz1.r) qVar2).v0()).i();
                        str2 = str;
                        if (!((xz1.r) qVar).z("isManualCleanupPromotionalEnabled", true) && ((qo1.l) kVar).g()) {
                            this.x = f0Var;
                            this.y = arrayList;
                            this.z = arrayList2;
                            this.A = arrayList2;
                            this.M = j;
                            this.N = i2;
                            this.Q = 2;
                            ((com.truecaller.messaging.inboxcleanup.a) kVar2).getClass();
                            obj2 = kotlin.collections.h0.a;
                            if (obj2 != barVar4) {
                                list2 = arrayList;
                                collection2 = arrayList2;
                                arrayList2.addAll((java.util.Collection) obj2);
                                f0Var3 = f0Var;
                                collection = collection2;
                                arrayList = list2;
                                arrayList3 = new java.util.ArrayList();
                                java.util.Collection collection9 = collection;
                                list3 = arrayList;
                                i3 = new org.joda.time.DateTime().x(((xz1.r) qVar).w0()).i();
                                str3 = str14;
                                str4 = str2;
                                str5 = "isManualCleanupPromotionalEnabled";
                                if (((xz1.r) qVar).z(str4, true)) {
                                }
                            }
                        } else {
                            f0Var3 = f0Var;
                            collection = arrayList2;
                            arrayList3 = new java.util.ArrayList();
                            java.util.Collection collection92 = collection;
                            list3 = arrayList;
                            i3 = new org.joda.time.DateTime().x(((xz1.r) qVar).w0()).i();
                            str3 = str14;
                            str4 = str2;
                            str5 = "isManualCleanupPromotionalEnabled";
                            if (((xz1.r) qVar).z(str4, true)) {
                                this.x = f0Var3;
                                this.y = list3;
                                this.z = (java.util.List) collection92;
                                this.A = arrayList3;
                                this.B = arrayList3;
                                this.M = j;
                                this.N = i2;
                                this.O = i3;
                                this.Q = 3;
                                d = ((com.truecaller.messaging.inboxcleanup.a) kVar2).d(i3, this);
                                if (d != barVar4) {
                                    j2 = j;
                                    j3 = i2;
                                    arrayList4 = arrayList3;
                                    f0Var4 = f0Var3;
                                    collection4 = collection92;
                                    arrayList3.addAll((java.util.Collection) d);
                                    collection3 = collection4;
                                    f0Var3 = f0Var4;
                                    arrayList3 = arrayList4;
                                    i2 = j3;
                                    long j18 = i3;
                                    java.util.List list7 = list3;
                                    java.util.ArrayList l0 = kotlin.collections.CollectionsKt.l0(kotlin.collections.CollectionsKt.l0(list7, arrayList3), collection3);
                                    java.lang.Object obj6 = new java.lang.Object();
                                    java.util.ArrayList arrayList13 = new java.util.ArrayList();
                                    java.lang.Object obj7 = new java.lang.Object();
                                    java.util.Collection collection10 = collection3;
                                    it = kotlin.collections.CollectionsKt.M(list7, 100).iterator();
                                    collection5 = collection10;
                                    arrayList5 = l0;
                                    arrayList6 = arrayList13;
                                    barVar = barVar4;
                                    long j19 = i2;
                                    inboxManualCleanupWorker = inboxManualCleanupWorker10;
                                    f0Var5 = f0Var3;
                                    i4 = 0;
                                    collection6 = arrayList3;
                                    j4 = j19;
                                    r10 = obj7;
                                    j5 = j2;
                                    j6 = j18;
                                    r14 = obj6;
                                    if (!it.hasNext()) {
                                        str9 = str4;
                                        list4 = (java.util.List) it.next();
                                        if (!com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.k) {
                                            str10 = str13;
                                            if (!inboxManualCleanupWorker.g.p() || !inboxManualCleanupWorker.h.n()) {
                                                inboxManualCleanupWorker3 = inboxManualCleanupWorker;
                                                f0Var7 = f0Var5;
                                            } else {
                                                m22.k kVar5 = inboxManualCleanupWorker.e;
                                                this.x = f0Var5;
                                                f6.f0 f0Var12 = f0Var5;
                                                this.y = null;
                                                this.z = (java.util.List) collection5;
                                                this.A = (java.util.List) collection6;
                                                this.B = arrayList5;
                                                this.C = r14;
                                                this.D = arrayList6;
                                                this.E = r10;
                                                this.F = null;
                                                this.G = inboxManualCleanupWorker;
                                                this.H = it;
                                                this.I = null;
                                                this.J = list4;
                                                this.M = j5;
                                                this.N = j4;
                                                com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker11 = inboxManualCleanupWorker;
                                                long j20 = j6;
                                                this.O = j20;
                                                this.P = i4;
                                                it3 = it;
                                                this.Q = 4;
                                                b = ((s42.e) ((com.truecaller.messaging.inboxcleanup.a) kVar5).a.get()).b(list4, "cleanInbox-confirmCleanupManually", false, this);
                                                barVar3 = barVar;
                                                if (b != barVar3) {
                                                    j8 = j5;
                                                    j9 = j20;
                                                    collection8 = collection5;
                                                    f0Var8 = f0Var12;
                                                    arrayList7 = arrayList5;
                                                    long j21 = j4;
                                                    i6 = i4;
                                                    inboxManualCleanupWorker4 = inboxManualCleanupWorker11;
                                                    j10 = j21;
                                                    h0Var4 = r10;
                                                    h0Var3 = r14;
                                                    java.lang.Boolean bool = (java.lang.Boolean) b;
                                                    booleanValue = bool.booleanValue();
                                                    arrayList6.add(bool);
                                                    if (booleanValue) {
                                                        h0Var4.a = list4.size() + h0Var4.a;
                                                        int size = list4.size() + h0Var3.a;
                                                        h0Var3.a = size;
                                                        com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.e(inboxManualCleanupWorker4, f0Var8, size, arrayList7.size());
                                                    }
                                                    collection7 = collection8;
                                                    it = it3;
                                                    f0Var5 = f0Var8;
                                                    j6 = j9;
                                                    j5 = j8;
                                                    inboxManualCleanupWorker = inboxManualCleanupWorker4;
                                                    i4 = i6;
                                                    j4 = j10;
                                                    h0Var2 = h0Var4;
                                                    h0Var = h0Var3;
                                                    barVar = barVar3;
                                                    arrayList5 = arrayList7;
                                                    str13 = str10;
                                                    collection5 = collection7;
                                                    str4 = str9;
                                                    r10 = h0Var2;
                                                    r14 = h0Var;
                                                    if (!it.hasNext()) {
                                                        f6.f0 f0Var13 = f0Var5;
                                                        str6 = str4;
                                                        str7 = str13;
                                                        barVar2 = barVar;
                                                        str8 = "cleanInbox-confirmCleanupManually";
                                                        i5 = 0;
                                                        obj3 = new java.lang.Object();
                                                        it2 = kotlin.collections.CollectionsKt.M(collection5, 100).iterator();
                                                        j7 = j4;
                                                        f0Var6 = f0Var13;
                                                        inboxManualCleanupWorker2 = inboxManualCleanupWorker10;
                                                        h0Var6 = r10;
                                                        h0Var5 = r14;
                                                        if (!it2.hasNext()) {
                                                            java.lang.String str15 = str8;
                                                            list5 = (java.util.List) it2.next();
                                                            if (!com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.k) {
                                                                inboxManualCleanupWorker7 = inboxManualCleanupWorker10;
                                                                if (inboxManualCleanupWorker2.g.p() && inboxManualCleanupWorker2.h.n()) {
                                                                    m22.k kVar6 = inboxManualCleanupWorker2.e;
                                                                    this.x = f0Var6;
                                                                    this.y = null;
                                                                    this.z = null;
                                                                    this.A = (java.util.List) collection6;
                                                                    this.B = arrayList5;
                                                                    this.C = h0Var5;
                                                                    this.D = arrayList6;
                                                                    this.E = h0Var6;
                                                                    this.F = obj3;
                                                                    this.G = null;
                                                                    this.H = inboxManualCleanupWorker2;
                                                                    this.I = it2;
                                                                    this.J = null;
                                                                    this.K = list5;
                                                                    this.M = j5;
                                                                    this.N = j7;
                                                                    it5 = it2;
                                                                    this.O = j6;
                                                                    this.P = i5;
                                                                    this.Q = 5;
                                                                    str12 = str15;
                                                                    f6.f0 f0Var14 = f0Var6;
                                                                    b2 = ((s42.e) ((com.truecaller.messaging.inboxcleanup.a) kVar6).a.get()).b(list5, str12, false, this);
                                                                    if (b2 != barVar2) {
                                                                        j14 = j7;
                                                                        f0Var6 = f0Var14;
                                                                        inboxManualCleanupWorker8 = inboxManualCleanupWorker2;
                                                                        j15 = j6;
                                                                        i8 = i5;
                                                                        h0Var8 = h0Var6;
                                                                        arrayList10 = arrayList5;
                                                                        h0Var13 = obj3;
                                                                        h0Var12 = h0Var5;
                                                                        java.lang.Boolean bool2 = (java.lang.Boolean) b2;
                                                                        booleanValue2 = bool2.booleanValue();
                                                                        arrayList6.add(bool2);
                                                                        if (booleanValue2) {
                                                                            h0Var13.a = list5.size() + h0Var13.a;
                                                                            int size2 = list5.size() + h0Var12.a;
                                                                            h0Var12.a = size2;
                                                                            com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.e(inboxManualCleanupWorker8, f0Var6, size2, arrayList10.size());
                                                                        }
                                                                        h0Var10 = h0Var8;
                                                                        j6 = j15;
                                                                        h0Var11 = h0Var13;
                                                                        h0Var9 = h0Var12;
                                                                        str8 = str12;
                                                                        arrayList5 = arrayList10;
                                                                        i5 = i8;
                                                                        inboxManualCleanupWorker2 = inboxManualCleanupWorker8;
                                                                        inboxManualCleanupWorker10 = inboxManualCleanupWorker7;
                                                                        it2 = it5;
                                                                        j7 = j14;
                                                                        obj3 = h0Var11;
                                                                        h0Var6 = h0Var10;
                                                                        h0Var5 = h0Var9;
                                                                        if (!it2.hasNext()) {
                                                                            inboxManualCleanupWorker5 = inboxManualCleanupWorker10;
                                                                            f6.f0 f0Var15 = f0Var6;
                                                                            str11 = str8;
                                                                            java.lang.Object obj8 = new java.lang.Object();
                                                                            it4 = kotlin.collections.CollectionsKt.M(collection6, 100).iterator();
                                                                            arrayList8 = arrayList5;
                                                                            obj4 = obj8;
                                                                            j11 = j7;
                                                                            arrayList9 = arrayList6;
                                                                            j13 = j6;
                                                                            f0Var9 = f0Var15;
                                                                            i7 = 0;
                                                                            h0Var7 = obj3;
                                                                            inboxManualCleanupWorker6 = inboxManualCleanupWorker5;
                                                                            h0Var15 = h0Var6;
                                                                            h0Var14 = h0Var5;
                                                                            if (!it4.hasNext()) {
                                                                                list6 = (java.util.List) it4.next();
                                                                                if (!com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.k) {
                                                                                    arrayList11 = arrayList8;
                                                                                    if (!inboxManualCleanupWorker6.g.p() || !inboxManualCleanupWorker6.h.n()) {
                                                                                        f0Var10 = f0Var9;
                                                                                        it6 = it4;
                                                                                    } else {
                                                                                        m22.k kVar7 = inboxManualCleanupWorker6.e;
                                                                                        this.x = f0Var9;
                                                                                        f6.f0 f0Var16 = f0Var9;
                                                                                        this.y = null;
                                                                                        this.z = null;
                                                                                        this.A = null;
                                                                                        this.B = arrayList11;
                                                                                        this.C = h0Var14;
                                                                                        this.D = arrayList9;
                                                                                        this.E = h0Var15;
                                                                                        this.F = h0Var7;
                                                                                        this.G = obj4;
                                                                                        this.H = null;
                                                                                        this.I = inboxManualCleanupWorker6;
                                                                                        this.J = it4;
                                                                                        this.K = null;
                                                                                        this.L = list6;
                                                                                        this.M = j5;
                                                                                        java.util.Iterator it8 = it4;
                                                                                        long j23 = j11;
                                                                                        this.N = j23;
                                                                                        long j24 = j13;
                                                                                        this.O = j24;
                                                                                        this.P = i7;
                                                                                        it6 = it8;
                                                                                        this.Q = 6;
                                                                                        com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker12 = inboxManualCleanupWorker6;
                                                                                        b3 = ((s42.e) ((com.truecaller.messaging.inboxcleanup.a) kVar7).a.get()).b(list6, str11, false, this);
                                                                                        if (b3 != barVar2) {
                                                                                            arrayList12 = arrayList11;
                                                                                            j16 = j24;
                                                                                            f0Var11 = f0Var16;
                                                                                            inboxManualCleanupWorker9 = inboxManualCleanupWorker12;
                                                                                            j17 = j23;
                                                                                            h0Var18 = h0Var15;
                                                                                            r6 = obj4;
                                                                                            h0Var21 = h0Var14;
                                                                                            java.lang.Boolean bool3 = (java.lang.Boolean) b3;
                                                                                            booleanValue3 = bool3.booleanValue();
                                                                                            arrayList9.add(bool3);
                                                                                            if (booleanValue3) {
                                                                                                ((kotlin.jvm.internal.h0) r6).a = list6.size() + ((kotlin.jvm.internal.h0) r6).a;
                                                                                                int size3 = list6.size() + h0Var21.a;
                                                                                                h0Var21.a = size3;
                                                                                                com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.e(inboxManualCleanupWorker9, f0Var11, size3, arrayList12.size());
                                                                                            }
                                                                                            f0Var9 = f0Var11;
                                                                                            arrayList8 = arrayList12;
                                                                                            h0Var20 = h0Var18;
                                                                                            j11 = j17;
                                                                                            j13 = j16;
                                                                                            inboxManualCleanupWorker6 = inboxManualCleanupWorker9;
                                                                                            obj5 = r6;
                                                                                            h0Var19 = h0Var21;
                                                                                            it4 = it6;
                                                                                            obj4 = obj5;
                                                                                            h0Var15 = h0Var20;
                                                                                            h0Var14 = h0Var19;
                                                                                            if (!it4.hasNext()) {
                                                                                                this.x = null;
                                                                                                this.y = null;
                                                                                                this.z = null;
                                                                                                this.A = null;
                                                                                                this.B = null;
                                                                                                this.C = null;
                                                                                                this.D = arrayList9;
                                                                                                this.E = h0Var15;
                                                                                                this.F = h0Var7;
                                                                                                this.G = obj4;
                                                                                                this.H = null;
                                                                                                this.I = null;
                                                                                                this.J = null;
                                                                                                this.K = null;
                                                                                                this.L = null;
                                                                                                this.M = j5;
                                                                                                this.N = j11;
                                                                                                this.O = j13;
                                                                                                this.Q = 7;
                                                                                                if (fg3.h0.r(500L, this) == barVar2) {
                                                                                                    return barVar2;
                                                                                                }
                                                                                                r4 = obj4;
                                                                                                h0Var16 = h0Var7;
                                                                                                h0Var17 = h0Var15;
                                                                                                if (arrayList9 != null || !arrayList9.isEmpty()) {
                                                                                                    it7 = arrayList9.iterator();
                                                                                                    while (it7.hasNext()) {
                                                                                                        if (!((java.lang.Boolean) it7.next()).booleanValue()) {
                                                                                                            xz1.r rVar4 = (xz1.r) qVar;
                                                                                                            z = true;
                                                                                                            rVar4.d0("manualCleanupFailureRunCount", rVar4.C("manualCleanupFailureRunCount", 0) + 1);
                                                                                                            int i10 = h0Var17.a;
                                                                                                            int i11 = h0Var16.a;
                                                                                                            int i13 = ((kotlin.jvm.internal.h0) r4).a;
                                                                                                            xz1.r rVar5 = (xz1.r) qVar;
                                                                                                            rVar5.c0("manualCleanupDone", z);
                                                                                                            org.joda.time.DateTime dateTime = new org.joda.time.DateTime();
                                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dateTime, "now(...)");
                                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "value");
                                                                                                            rVar5.e0("manualCleanupLastDate", dateTime.i());
                                                                                                            rVar5.d0("manualCleanupStatsOtpCount", i10);
                                                                                                            rVar5.d0("manualCleanupStatsPromotionalCount", i11);
                                                                                                            rVar5.d0("manualCleanupStatsSpamCount", i13);
                                                                                                            rVar5.d0("allTimeCleanupStatsOtpCount", rVar5.C("allTimeCleanupStatsOtpCount", 0) + i10);
                                                                                                            rVar5.d0("allTimeCleanupStatsPromotionalCount", rVar5.C("allTimeCleanupStatsPromotionalCount", 0) + i11);
                                                                                                            rVar5.d0("allTimeCleanupStatsSpamCount", rVar5.o0() + i13);
                                                                                                            com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker13 = inboxManualCleanupWorker5;
                                                                                                            androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(inboxManualCleanupWorker13.a).sendBroadcast(new android.content.Intent("com.truecaller.inboxcleanup.CLEANUP_DONE").putExtra("deleted_otp", h0Var17.a).putExtra("deleted_promotional", h0Var16.a).putExtra("deleted_spam", ((kotlin.jvm.internal.h0) r4).a));
                                                                                                            int i14 = h0Var17.a;
                                                                                                            int i15 = h0Var16.a;
                                                                                                            int i16 = ((kotlin.jvm.internal.h0) r4).a;
                                                                                                            rVar2 = (xz1.r) qVar;
                                                                                                            java.lang.String f = com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.f(rVar2.u0());
                                                                                                            java.lang.String f2 = com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.f(rVar2.v0());
                                                                                                            java.lang.String f3 = com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.f(rVar2.w0());
                                                                                                            eVar = new hi3.e(qx2.d5.l, qx2.d5.m);
                                                                                                            bi3.j0[] j0VarArr = eVar.b;
                                                                                                            bi3.j0 j0Var = j0VarArr[2];
                                                                                                            ((qx2.c5) eVar).e = "manual";
                                                                                                            boolean[] zArr = eVar.c;
                                                                                                            zArr[2] = true;
                                                                                                            bi3.j0 j0Var2 = j0VarArr[3];
                                                                                                            ((qx2.c5) eVar).f = f;
                                                                                                            zArr[3] = true;
                                                                                                            bi3.j0 j0Var3 = j0VarArr[4];
                                                                                                            ((qx2.c5) eVar).g = f3;
                                                                                                            zArr[4] = true;
                                                                                                            int C = rVar2.C("manualCleanupRunCount", 0);
                                                                                                            bi3.j0 j0Var4 = j0VarArr[7];
                                                                                                            ((qx2.c5) eVar).j = C;
                                                                                                            zArr[7] = true;
                                                                                                            int C2 = rVar2.C("manualCleanupFailureRunCount", 0);
                                                                                                            bi3.j0 j0Var5 = j0VarArr[6];
                                                                                                            ((qx2.c5) eVar).i = C2;
                                                                                                            zArr[6] = true;
                                                                                                            bi3.j0 j0Var6 = j0VarArr[5];
                                                                                                            ((qx2.c5) eVar).h = f2;
                                                                                                            zArr[5] = true;
                                                                                                            if (rVar2.z(str7, true)) {
                                                                                                                bi3.j0 j0Var7 = j0VarArr[8];
                                                                                                                ((qx2.c5) eVar).k = i14;
                                                                                                                zArr[8] = true;
                                                                                                                i9 = 0;
                                                                                                            } else {
                                                                                                                bi3.j0 j0Var8 = j0VarArr[8];
                                                                                                                i9 = 0;
                                                                                                                ((qx2.c5) eVar).k = 0;
                                                                                                                zArr[8] = true;
                                                                                                            }
                                                                                                            if (rVar2.z(str6, true)) {
                                                                                                                bi3.j0 j0Var9 = j0VarArr[9];
                                                                                                                ((qx2.c5) eVar).l = i16;
                                                                                                                zArr[9] = true;
                                                                                                            } else {
                                                                                                                bi3.j0 j0Var10 = j0VarArr[9];
                                                                                                                ((qx2.c5) eVar).l = i9;
                                                                                                                zArr[9] = true;
                                                                                                            }
                                                                                                            if (!((qo1.l) kVar).g() && rVar2.z(str5, true)) {
                                                                                                                eVar.f(java.lang.Integer.valueOf(i15));
                                                                                                            } else {
                                                                                                                eVar.f(0);
                                                                                                            }
                                                                                                            inboxManualCleanupWorker13.b.c(eVar.e());
                                                                                                            com.truecaller.messaging.inboxcleanup.CleanupResult.Success success = new com.truecaller.messaging.inboxcleanup.CleanupResult.Success(h0Var17.a, h0Var16.a, ((kotlin.jvm.internal.h0) r4).a);
                                                                                                            com.truecaller.messaging.inboxcleanup.b bVar2 = (com.truecaller.messaging.inboxcleanup.b) rVar;
                                                                                                            android.content.Context context3 = bVar2.a;
                                                                                                            s62.d dVar = bVar2.b;
                                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "result");
                                                                                                            android.content.Context context4 = bVar2.a;
                                                                                                            int i17 = com.truecaller.messaging.inboxcleanup.InboxCleanupActivity.d0;
                                                                                                            android.content.Intent k = h0.k.k(context4, success, "Notification", 8);
                                                                                                            com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                                                                                                            s62.f fVar = (s62.f) dVar;
                                                                                                            android.app.PendingIntent k2 = fVar.k(pushNotificationSource.getType(), 0, 201326592, context4, k, "inboxCleanupManual");
                                                                                                            java.lang.String string3 = context3.getString(2132021767);
                                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, str3);
                                                                                                            android.app.Notification d3 = com.truecaller.messaging.inboxcleanup.b.a(bVar2, string3, context3.getString(2132021749), k2, 16).d();
                                                                                                            kotlin.jvm.internal.Intrinsics.d(d3);
                                                                                                            fVar.v(2131364629, d3, pushNotificationSource.getType(), "inboxCleanupManual");
                                                                                                            return kotlin.Unit.a;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                z = true;
                                                                                                xz1.r rVar6 = (xz1.r) qVar;
                                                                                                rVar6.d0("manualCleanupRunCount", rVar6.C("manualCleanupRunCount", 0) + 1);
                                                                                                int i102 = h0Var17.a;
                                                                                                int i112 = h0Var16.a;
                                                                                                int i132 = ((kotlin.jvm.internal.h0) r4).a;
                                                                                                xz1.r rVar52 = (xz1.r) qVar;
                                                                                                rVar52.c0("manualCleanupDone", z);
                                                                                                org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dateTime2, "now(...)");
                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime2, "value");
                                                                                                rVar52.e0("manualCleanupLastDate", dateTime2.i());
                                                                                                rVar52.d0("manualCleanupStatsOtpCount", i102);
                                                                                                rVar52.d0("manualCleanupStatsPromotionalCount", i112);
                                                                                                rVar52.d0("manualCleanupStatsSpamCount", i132);
                                                                                                rVar52.d0("allTimeCleanupStatsOtpCount", rVar52.C("allTimeCleanupStatsOtpCount", 0) + i102);
                                                                                                rVar52.d0("allTimeCleanupStatsPromotionalCount", rVar52.C("allTimeCleanupStatsPromotionalCount", 0) + i112);
                                                                                                rVar52.d0("allTimeCleanupStatsSpamCount", rVar52.o0() + i132);
                                                                                                com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker132 = inboxManualCleanupWorker5;
                                                                                                androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(inboxManualCleanupWorker132.a).sendBroadcast(new android.content.Intent("com.truecaller.inboxcleanup.CLEANUP_DONE").putExtra("deleted_otp", h0Var17.a).putExtra("deleted_promotional", h0Var16.a).putExtra("deleted_spam", ((kotlin.jvm.internal.h0) r4).a));
                                                                                                int i142 = h0Var17.a;
                                                                                                int i152 = h0Var16.a;
                                                                                                int i162 = ((kotlin.jvm.internal.h0) r4).a;
                                                                                                rVar2 = (xz1.r) qVar;
                                                                                                java.lang.String f4 = com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.f(rVar2.u0());
                                                                                                java.lang.String f23 = com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.f(rVar2.v0());
                                                                                                java.lang.String f33 = com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.f(rVar2.w0());
                                                                                                eVar = new hi3.e(qx2.d5.l, qx2.d5.m);
                                                                                                bi3.j0[] j0VarArr2 = eVar.b;
                                                                                                bi3.j0 j0Var11 = j0VarArr2[2];
                                                                                                ((qx2.c5) eVar).e = "manual";
                                                                                                boolean[] zArr2 = eVar.c;
                                                                                                zArr2[2] = true;
                                                                                                bi3.j0 j0Var22 = j0VarArr2[3];
                                                                                                ((qx2.c5) eVar).f = f4;
                                                                                                zArr2[3] = true;
                                                                                                bi3.j0 j0Var32 = j0VarArr2[4];
                                                                                                ((qx2.c5) eVar).g = f33;
                                                                                                zArr2[4] = true;
                                                                                                int C3 = rVar2.C("manualCleanupRunCount", 0);
                                                                                                bi3.j0 j0Var42 = j0VarArr2[7];
                                                                                                ((qx2.c5) eVar).j = C3;
                                                                                                zArr2[7] = true;
                                                                                                int C22 = rVar2.C("manualCleanupFailureRunCount", 0);
                                                                                                bi3.j0 j0Var52 = j0VarArr2[6];
                                                                                                ((qx2.c5) eVar).i = C22;
                                                                                                zArr2[6] = true;
                                                                                                bi3.j0 j0Var62 = j0VarArr2[5];
                                                                                                ((qx2.c5) eVar).h = f23;
                                                                                                zArr2[5] = true;
                                                                                                if (rVar2.z(str7, true)) {
                                                                                                }
                                                                                                if (rVar2.z(str6, true)) {
                                                                                                }
                                                                                                if (!((qo1.l) kVar).g()) {
                                                                                                }
                                                                                                eVar.f(0);
                                                                                                inboxManualCleanupWorker132.b.c(eVar.e());
                                                                                                com.truecaller.messaging.inboxcleanup.CleanupResult.Success success2 = new com.truecaller.messaging.inboxcleanup.CleanupResult.Success(h0Var17.a, h0Var16.a, ((kotlin.jvm.internal.h0) r4).a);
                                                                                                com.truecaller.messaging.inboxcleanup.b bVar22 = (com.truecaller.messaging.inboxcleanup.b) rVar;
                                                                                                android.content.Context context32 = bVar22.a;
                                                                                                s62.d dVar2 = bVar22.b;
                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success2, "result");
                                                                                                android.content.Context context42 = bVar22.a;
                                                                                                int i172 = com.truecaller.messaging.inboxcleanup.InboxCleanupActivity.d0;
                                                                                                android.content.Intent k3 = h0.k.k(context42, success2, "Notification", 8);
                                                                                                com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource2 = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                                                                                                s62.f fVar2 = (s62.f) dVar2;
                                                                                                android.app.PendingIntent k23 = fVar2.k(pushNotificationSource2.getType(), 0, 201326592, context42, k3, "inboxCleanupManual");
                                                                                                java.lang.String string32 = context32.getString(2132021767);
                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string32, str3);
                                                                                                android.app.Notification d33 = com.truecaller.messaging.inboxcleanup.b.a(bVar22, string32, context32.getString(2132021749), k23, 16).d();
                                                                                                kotlin.jvm.internal.Intrinsics.d(d33);
                                                                                                fVar2.v(2131364629, d33, pushNotificationSource2.getType(), "inboxCleanupManual");
                                                                                                return kotlin.Unit.a;
                                                                                            }
                                                                                        } else {
                                                                                            return barVar2;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    f0Var10 = f0Var9;
                                                                                    it6 = it4;
                                                                                    arrayList11 = arrayList8;
                                                                                }
                                                                                j13 = j13;
                                                                                f0Var9 = f0Var10;
                                                                                inboxManualCleanupWorker6 = inboxManualCleanupWorker6;
                                                                                j11 = j11;
                                                                                arrayList8 = arrayList11;
                                                                                obj5 = obj4;
                                                                                h0Var20 = h0Var15;
                                                                                h0Var19 = h0Var14;
                                                                                it4 = it6;
                                                                                obj4 = obj5;
                                                                                h0Var15 = h0Var20;
                                                                                h0Var14 = h0Var19;
                                                                                if (!it4.hasNext()) {
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        return barVar2;
                                                                    }
                                                                }
                                                            } else {
                                                                inboxManualCleanupWorker7 = inboxManualCleanupWorker10;
                                                            }
                                                            it5 = it2;
                                                            str12 = str15;
                                                            j14 = j7;
                                                            f0Var6 = f0Var6;
                                                            inboxManualCleanupWorker8 = inboxManualCleanupWorker2;
                                                            i8 = i5;
                                                            arrayList10 = arrayList5;
                                                            h0Var11 = obj3;
                                                            h0Var10 = h0Var6;
                                                            h0Var9 = h0Var5;
                                                            str8 = str12;
                                                            arrayList5 = arrayList10;
                                                            i5 = i8;
                                                            inboxManualCleanupWorker2 = inboxManualCleanupWorker8;
                                                            inboxManualCleanupWorker10 = inboxManualCleanupWorker7;
                                                            it2 = it5;
                                                            j7 = j14;
                                                            obj3 = h0Var11;
                                                            h0Var6 = h0Var10;
                                                            h0Var5 = h0Var9;
                                                            if (!it2.hasNext()) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    return barVar3;
                                                }
                                            }
                                        } else {
                                            inboxManualCleanupWorker3 = inboxManualCleanupWorker;
                                            f0Var7 = f0Var5;
                                            str10 = str13;
                                        }
                                        barVar3 = barVar;
                                        it = it;
                                        collection7 = collection5;
                                        arrayList7 = arrayList5;
                                        j6 = j6;
                                        f0Var5 = f0Var7;
                                        inboxManualCleanupWorker = inboxManualCleanupWorker3;
                                        h0Var2 = r10;
                                        h0Var = r14;
                                        barVar = barVar3;
                                        arrayList5 = arrayList7;
                                        str13 = str10;
                                        collection5 = collection7;
                                        str4 = str9;
                                        r10 = h0Var2;
                                        r14 = h0Var;
                                        if (!it.hasNext()) {
                                        }
                                    }
                                }
                            } else {
                                collection3 = collection92;
                                j2 = j;
                                long j182 = i3;
                                java.util.List list72 = list3;
                                java.util.ArrayList l03 = kotlin.collections.CollectionsKt.l0(kotlin.collections.CollectionsKt.l0(list72, arrayList3), collection3);
                                java.lang.Object obj62 = new java.lang.Object();
                                java.util.ArrayList arrayList132 = new java.util.ArrayList();
                                java.lang.Object obj72 = new java.lang.Object();
                                java.util.Collection collection102 = collection3;
                                it = kotlin.collections.CollectionsKt.M(list72, 100).iterator();
                                collection5 = collection102;
                                arrayList5 = l03;
                                arrayList6 = arrayList132;
                                barVar = barVar4;
                                long j192 = i2;
                                inboxManualCleanupWorker = inboxManualCleanupWorker10;
                                f0Var5 = f0Var3;
                                i4 = 0;
                                collection6 = arrayList3;
                                j4 = j192;
                                r10 = obj72;
                                j5 = j2;
                                j6 = j182;
                                r14 = obj62;
                                if (!it.hasNext()) {
                                }
                            }
                        }
                    }
                    return barVar4;
                }
                f0Var = a;
                j = i;
                arrayList2 = new java.util.ArrayList();
                kVar2 = kVar4;
                qVar = qVar2;
                i2 = new org.joda.time.DateTime().x(((xz1.r) qVar2).v0()).i();
                str2 = str;
                if (!((xz1.r) qVar).z("isManualCleanupPromotionalEnabled", true)) {
                }
                f0Var3 = f0Var;
                collection = arrayList2;
                arrayList3 = new java.util.ArrayList();
                java.util.Collection collection922 = collection;
                list3 = arrayList;
                i3 = new org.joda.time.DateTime().x(((xz1.r) qVar).w0()).i();
                str3 = str14;
                str4 = str2;
                str5 = "isManualCleanupPromotionalEnabled";
                if (((xz1.r) qVar).z(str4, true)) {
                }
                break;
            case 1:
                kVar = kVar3;
                rVar = rVar3;
                str = "isManualCleanupSpamEnabled";
                i = this.M;
                arrayList = this.z;
                java.util.List list8 = this.y;
                f6.f0 f0Var17 = this.x;
                od.p.E(obj);
                c = obj;
                f0Var2 = f0Var17;
                list = list8;
                str14 = "getString(...)";
                arrayList.addAll((java.util.Collection) c);
                arrayList = list;
                j = i;
                f0Var = f0Var2;
                arrayList2 = new java.util.ArrayList();
                kVar2 = kVar4;
                qVar = qVar2;
                i2 = new org.joda.time.DateTime().x(((xz1.r) qVar2).v0()).i();
                str2 = str;
                if (!((xz1.r) qVar).z("isManualCleanupPromotionalEnabled", true)) {
                }
                f0Var3 = f0Var;
                collection = arrayList2;
                arrayList3 = new java.util.ArrayList();
                java.util.Collection collection9222 = collection;
                list3 = arrayList;
                i3 = new org.joda.time.DateTime().x(((xz1.r) qVar).w0()).i();
                str3 = str14;
                str4 = str2;
                str5 = "isManualCleanupPromotionalEnabled";
                if (((xz1.r) qVar).z(str4, true)) {
                }
                break;
            case 2:
                kVar = kVar3;
                rVar = rVar3;
                long j25 = this.N;
                long j26 = this.M;
                java.util.List list9 = this.A;
                java.util.Collection collection11 = (java.util.List) this.z;
                java.util.List list10 = this.y;
                f0Var = this.x;
                od.p.E(obj);
                qVar = qVar2;
                arrayList2 = list9;
                list2 = list10;
                obj2 = obj;
                kVar2 = kVar4;
                i2 = j25;
                str2 = "isManualCleanupSpamEnabled";
                collection2 = collection11;
                j = j26;
                str14 = "getString(...)";
                arrayList2.addAll((java.util.Collection) obj2);
                f0Var3 = f0Var;
                collection = collection2;
                arrayList = list2;
                arrayList3 = new java.util.ArrayList();
                java.util.Collection collection92222 = collection;
                list3 = arrayList;
                i3 = new org.joda.time.DateTime().x(((xz1.r) qVar).w0()).i();
                str3 = str14;
                str4 = str2;
                str5 = "isManualCleanupPromotionalEnabled";
                if (((xz1.r) qVar).z(str4, true)) {
                }
                break;
            case 3:
                kVar = kVar3;
                rVar = rVar3;
                long j27 = this.O;
                long j28 = this.N;
                long j29 = this.M;
                java.util.List list11 = this.B;
                java.util.List list12 = this.A;
                java.util.Collection collection12 = (java.util.List) this.z;
                java.util.List list13 = this.y;
                f6.f0 f0Var18 = this.x;
                od.p.E(obj);
                j2 = j29;
                str3 = "getString(...)";
                j3 = j28;
                i3 = j27;
                list3 = list13;
                str5 = "isManualCleanupPromotionalEnabled";
                collection4 = collection12;
                qVar = qVar2;
                arrayList4 = list12;
                str4 = "isManualCleanupSpamEnabled";
                arrayList3 = list11;
                f0Var4 = f0Var18;
                d = obj;
                arrayList3.addAll((java.util.Collection) d);
                collection3 = collection4;
                f0Var3 = f0Var4;
                arrayList3 = arrayList4;
                i2 = j3;
                long j1822 = i3;
                java.util.List list722 = list3;
                java.util.ArrayList l032 = kotlin.collections.CollectionsKt.l0(kotlin.collections.CollectionsKt.l0(list722, arrayList3), collection3);
                java.lang.Object obj622 = new java.lang.Object();
                java.util.ArrayList arrayList1322 = new java.util.ArrayList();
                java.lang.Object obj722 = new java.lang.Object();
                java.util.Collection collection1022 = collection3;
                it = kotlin.collections.CollectionsKt.M(list722, 100).iterator();
                collection5 = collection1022;
                arrayList5 = l032;
                arrayList6 = arrayList1322;
                barVar = barVar4;
                long j1922 = i2;
                inboxManualCleanupWorker = inboxManualCleanupWorker10;
                f0Var5 = f0Var3;
                i4 = 0;
                collection6 = arrayList3;
                j4 = j1922;
                r10 = obj722;
                j5 = j2;
                j6 = j1822;
                r14 = obj622;
                if (!it.hasNext()) {
                }
                break;
            case 4:
                kVar = kVar3;
                rVar = rVar3;
                int i18 = this.P;
                long j30 = this.O;
                long j31 = this.N;
                long j33 = this.M;
                list4 = (java.util.List) this.J;
                java.util.Iterator it9 = (java.util.Iterator) this.H;
                com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker14 = (com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker) this.G;
                java.lang.Iterable iterable = this.F;
                kotlin.jvm.internal.h0 h0Var22 = this.E;
                java.util.ArrayList arrayList14 = this.D;
                kotlin.jvm.internal.h0 h0Var23 = this.C;
                arrayList7 = this.B;
                java.util.Collection collection13 = (java.util.List) this.A;
                java.util.Collection collection14 = (java.util.List) this.z;
                java.util.List list14 = this.y;
                f6.f0 f0Var19 = this.x;
                od.p.E(obj);
                j10 = j31;
                j8 = j33;
                h0Var4 = h0Var22;
                arrayList6 = arrayList14;
                j9 = j30;
                str3 = "getString(...)";
                it3 = it9;
                inboxManualCleanupWorker4 = inboxManualCleanupWorker14;
                collection6 = collection13;
                f0Var8 = f0Var19;
                str5 = "isManualCleanupPromotionalEnabled";
                str10 = "isManualCleanupOtpEnabled";
                h0Var3 = h0Var23;
                b = obj;
                barVar3 = barVar4;
                i6 = i18;
                qVar = qVar2;
                collection8 = collection14;
                str9 = "isManualCleanupSpamEnabled";
                java.lang.Boolean bool4 = (java.lang.Boolean) b;
                booleanValue = bool4.booleanValue();
                arrayList6.add(bool4);
                if (booleanValue) {
                }
                collection7 = collection8;
                it = it3;
                f0Var5 = f0Var8;
                j6 = j9;
                j5 = j8;
                inboxManualCleanupWorker = inboxManualCleanupWorker4;
                i4 = i6;
                j4 = j10;
                h0Var2 = h0Var4;
                h0Var = h0Var3;
                barVar = barVar3;
                arrayList5 = arrayList7;
                str13 = str10;
                collection5 = collection7;
                str4 = str9;
                r10 = h0Var2;
                r14 = h0Var;
                if (!it.hasNext()) {
                }
                break;
            case 5:
                kVar = kVar3;
                int i19 = this.P;
                long j34 = this.O;
                long j35 = this.N;
                rVar = rVar3;
                long j36 = this.M;
                list5 = this.K;
                java.util.Iterator it10 = (java.util.Iterator) this.I;
                com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker15 = (com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker) this.H;
                kotlin.jvm.internal.h0 h0Var24 = this.F;
                h0Var8 = this.E;
                java.util.ArrayList arrayList15 = this.D;
                kotlin.jvm.internal.h0 h0Var25 = this.C;
                java.util.List list15 = this.B;
                java.util.Collection collection15 = (java.util.List) this.A;
                java.util.List list16 = this.z;
                java.util.List list17 = this.y;
                f6.f0 f0Var20 = this.x;
                od.p.E(obj);
                i8 = i19;
                arrayList10 = list15;
                str7 = "isManualCleanupOtpEnabled";
                barVar2 = barVar4;
                j14 = j35;
                it5 = it10;
                j5 = j36;
                collection6 = collection15;
                qVar = qVar2;
                str6 = "isManualCleanupSpamEnabled";
                str5 = "isManualCleanupPromotionalEnabled";
                h0Var13 = h0Var24;
                h0Var12 = h0Var25;
                inboxManualCleanupWorker8 = inboxManualCleanupWorker15;
                str3 = "getString(...)";
                inboxManualCleanupWorker7 = inboxManualCleanupWorker10;
                f0Var6 = f0Var20;
                str12 = "cleanInbox-confirmCleanupManually";
                b2 = obj;
                arrayList6 = arrayList15;
                j15 = j34;
                java.lang.Boolean bool22 = (java.lang.Boolean) b2;
                booleanValue2 = bool22.booleanValue();
                arrayList6.add(bool22);
                if (booleanValue2) {
                }
                h0Var10 = h0Var8;
                j6 = j15;
                h0Var11 = h0Var13;
                h0Var9 = h0Var12;
                str8 = str12;
                arrayList5 = arrayList10;
                i5 = i8;
                inboxManualCleanupWorker2 = inboxManualCleanupWorker8;
                inboxManualCleanupWorker10 = inboxManualCleanupWorker7;
                it2 = it5;
                j7 = j14;
                obj3 = h0Var11;
                h0Var6 = h0Var10;
                h0Var5 = h0Var9;
                if (!it2.hasNext()) {
                }
                break;
            case 6:
                int i20 = this.P;
                long j37 = this.O;
                long j38 = this.N;
                long j39 = this.M;
                list6 = this.L;
                kVar = kVar3;
                java.util.Iterator it11 = (java.util.Iterator) this.J;
                com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker16 = (com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker) this.I;
                kotlin.jvm.internal.h0 h0Var26 = (kotlin.jvm.internal.h0) this.G;
                kotlin.jvm.internal.h0 h0Var27 = this.F;
                h0Var18 = this.E;
                java.util.ArrayList arrayList16 = this.D;
                kotlin.jvm.internal.h0 h0Var28 = this.C;
                java.util.List list18 = this.B;
                java.util.List list19 = this.A;
                java.util.List list20 = this.z;
                java.util.List list21 = this.y;
                f6.f0 f0Var21 = this.x;
                od.p.E(obj);
                str6 = "isManualCleanupSpamEnabled";
                j17 = j38;
                j16 = j37;
                h0Var7 = h0Var27;
                rVar = rVar3;
                qVar = qVar2;
                j5 = j39;
                str3 = "getString(...)";
                inboxManualCleanupWorker9 = inboxManualCleanupWorker16;
                arrayList12 = list18;
                inboxManualCleanupWorker5 = inboxManualCleanupWorker10;
                i7 = i20;
                str5 = "isManualCleanupPromotionalEnabled";
                str7 = "isManualCleanupOtpEnabled";
                h0Var21 = h0Var28;
                b3 = obj;
                f0Var11 = f0Var21;
                barVar2 = barVar4;
                str11 = "cleanInbox-confirmCleanupManually";
                it6 = it11;
                r6 = h0Var26;
                arrayList9 = arrayList16;
                java.lang.Boolean bool32 = (java.lang.Boolean) b3;
                booleanValue3 = bool32.booleanValue();
                arrayList9.add(bool32);
                if (booleanValue3) {
                }
                f0Var9 = f0Var11;
                arrayList8 = arrayList12;
                h0Var20 = h0Var18;
                j11 = j17;
                j13 = j16;
                inboxManualCleanupWorker6 = inboxManualCleanupWorker9;
                obj5 = r6;
                h0Var19 = h0Var21;
                it4 = it6;
                obj4 = obj5;
                h0Var15 = h0Var20;
                h0Var14 = h0Var19;
                if (!it4.hasNext()) {
                }
                break;
            case 7:
                r4 = (kotlin.jvm.internal.h0) this.G;
                h0Var16 = this.F;
                h0Var17 = this.E;
                arrayList9 = this.D;
                java.util.List list22 = this.B;
                java.util.List list23 = this.A;
                java.util.List list24 = this.z;
                java.util.List list25 = this.y;
                od.p.E(obj);
                inboxManualCleanupWorker5 = inboxManualCleanupWorker10;
                kVar = kVar3;
                rVar = rVar3;
                qVar = qVar2;
                str3 = "getString(...)";
                str6 = "isManualCleanupSpamEnabled";
                str5 = "isManualCleanupPromotionalEnabled";
                str7 = "isManualCleanupOtpEnabled";
                if (arrayList9 != null) {
                    break;
                }
                it7 = arrayList9.iterator();
                while (it7.hasNext()) {
                }
                z = true;
                xz1.r rVar62 = (xz1.r) qVar;
                rVar62.d0("manualCleanupRunCount", rVar62.C("manualCleanupRunCount", 0) + 1);
                int i1022 = h0Var17.a;
                int i1122 = h0Var16.a;
                int i1322 = ((kotlin.jvm.internal.h0) r4).a;
                xz1.r rVar522 = (xz1.r) qVar;
                rVar522.c0("manualCleanupDone", z);
                org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dateTime22, "now(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime22, "value");
                rVar522.e0("manualCleanupLastDate", dateTime22.i());
                rVar522.d0("manualCleanupStatsOtpCount", i1022);
                rVar522.d0("manualCleanupStatsPromotionalCount", i1122);
                rVar522.d0("manualCleanupStatsSpamCount", i1322);
                rVar522.d0("allTimeCleanupStatsOtpCount", rVar522.C("allTimeCleanupStatsOtpCount", 0) + i1022);
                rVar522.d0("allTimeCleanupStatsPromotionalCount", rVar522.C("allTimeCleanupStatsPromotionalCount", 0) + i1122);
                rVar522.d0("allTimeCleanupStatsSpamCount", rVar522.o0() + i1322);
                com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker inboxManualCleanupWorker1322 = inboxManualCleanupWorker5;
                androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(inboxManualCleanupWorker1322.a).sendBroadcast(new android.content.Intent("com.truecaller.inboxcleanup.CLEANUP_DONE").putExtra("deleted_otp", h0Var17.a).putExtra("deleted_promotional", h0Var16.a).putExtra("deleted_spam", ((kotlin.jvm.internal.h0) r4).a));
                int i1422 = h0Var17.a;
                int i1522 = h0Var16.a;
                int i1622 = ((kotlin.jvm.internal.h0) r4).a;
                rVar2 = (xz1.r) qVar;
                java.lang.String f43 = com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.f(rVar2.u0());
                java.lang.String f232 = com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.f(rVar2.v0());
                java.lang.String f332 = com.truecaller.messaging.inboxcleanup.InboxManualCleanupWorker.f(rVar2.w0());
                eVar = new hi3.e(qx2.d5.l, qx2.d5.m);
                bi3.j0[] j0VarArr22 = eVar.b;
                bi3.j0 j0Var112 = j0VarArr22[2];
                ((qx2.c5) eVar).e = "manual";
                boolean[] zArr22 = eVar.c;
                zArr22[2] = true;
                bi3.j0 j0Var222 = j0VarArr22[3];
                ((qx2.c5) eVar).f = f43;
                zArr22[3] = true;
                bi3.j0 j0Var322 = j0VarArr22[4];
                ((qx2.c5) eVar).g = f332;
                zArr22[4] = true;
                int C32 = rVar2.C("manualCleanupRunCount", 0);
                bi3.j0 j0Var422 = j0VarArr22[7];
                ((qx2.c5) eVar).j = C32;
                zArr22[7] = true;
                int C222 = rVar2.C("manualCleanupFailureRunCount", 0);
                bi3.j0 j0Var522 = j0VarArr22[6];
                ((qx2.c5) eVar).i = C222;
                zArr22[6] = true;
                bi3.j0 j0Var622 = j0VarArr22[5];
                ((qx2.c5) eVar).h = f232;
                zArr22[5] = true;
                if (rVar2.z(str7, true)) {
                }
                if (rVar2.z(str6, true)) {
                }
                if (!((qo1.l) kVar).g()) {
                }
                eVar.f(0);
                inboxManualCleanupWorker1322.b.c(eVar.e());
                com.truecaller.messaging.inboxcleanup.CleanupResult.Success success22 = new com.truecaller.messaging.inboxcleanup.CleanupResult.Success(h0Var17.a, h0Var16.a, ((kotlin.jvm.internal.h0) r4).a);
                com.truecaller.messaging.inboxcleanup.b bVar222 = (com.truecaller.messaging.inboxcleanup.b) rVar;
                android.content.Context context322 = bVar222.a;
                s62.d dVar22 = bVar222.b;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success22, "result");
                android.content.Context context422 = bVar222.a;
                int i1722 = com.truecaller.messaging.inboxcleanup.InboxCleanupActivity.d0;
                android.content.Intent k33 = h0.k.k(context422, success22, "Notification", 8);
                com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource22 = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                s62.f fVar22 = (s62.f) dVar22;
                android.app.PendingIntent k232 = fVar22.k(pushNotificationSource22.getType(), 0, 201326592, context422, k33, "inboxCleanupManual");
                java.lang.String string322 = context322.getString(2132021767);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string322, str3);
                android.app.Notification d332 = com.truecaller.messaging.inboxcleanup.b.a(bVar222, string322, context322.getString(2132021749), k232, 16).d();
                kotlin.jvm.internal.Intrinsics.d(d332);
                fVar22.v(2131364629, d332, pushNotificationSource22.getType(), "inboxCleanupManual");
                return kotlin.Unit.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
