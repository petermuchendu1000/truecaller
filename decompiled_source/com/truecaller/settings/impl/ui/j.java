package com.truecaller.settings.impl.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class j {
    public final kotlin.Lazy a;
    public final kotlin.Lazy b;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public final java.lang.Object i;
    public final java.lang.Object j;
    public final java.lang.Object k;
    public final java.lang.Object l;
    public final java.lang.Object m;
    public final java.lang.Object n;
    public final java.lang.Object o;
    public final java.lang.Object p;

    public j(qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3, qc3.bar barVar4, qc3.bar barVar5, qc3.bar barVar6, qc3.bar barVar7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "callRecordingDaoLazy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "recordedCallInfoDaoLazy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "restAdapterLazy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "storageHelperLazy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar5, "recordingsDataSourceFactoryProviderLazy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar6, "gsonLazy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar7, "ioContextLazy");
        this.e = barVar;
        this.f = barVar2;
        this.g = barVar3;
        this.h = barVar4;
        this.i = barVar5;
        this.j = barVar6;
        this.k = barVar7;
        this.a = kotlin.LazyKt.lazy(new rz0.i(this, 0));
        this.b = kotlin.LazyKt.lazy(new rz0.i(this, 1));
        this.c = kotlin.LazyKt.lazy(new rz0.i(this, 2));
        this.d = kotlin.LazyKt.lazy(new rz0.i(this, 3));
        this.l = kotlin.LazyKt.lazy(new rz0.i(this, 4));
        this.m = kotlin.LazyKt.lazy(new rz0.i(this, 5));
        this.n = kotlin.LazyKt.lazy(new rz0.i(this, 6));
        this.o = kotlin.LazyKt.lazy(new r2.n(28));
        this.p = new rz0.j().getType();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(ff3.qux quxVar) {
        rz0.l lVar;
        int i;
        sz0.a aVar;
        boolean booleanValue;
        boolean z;
        if (quxVar instanceof rz0.l) {
            lVar = (rz0.l) quxVar;
            int i2 = lVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.B = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = lVar.z;
                ef3.bar barVar = ef3.bar.a;
                i = lVar.B;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                z = lVar.y;
                                od.p.E(obj);
                                booleanValue = z;
                                return java.lang.Boolean.valueOf(booleanValue);
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = lVar.x;
                        od.p.E(obj);
                        booleanValue = ((java.lang.Boolean) obj).booleanValue();
                        if (booleanValue) {
                            sz0.baz c = c();
                            java.lang.String str = aVar.a;
                            lVar.x = null;
                            lVar.y = booleanValue;
                            lVar.B = 3;
                            java.lang.Object q = mc.f.q(c.a, false, true, new nu1.m(str, 25), lVar);
                            if (q != barVar) {
                                q = kotlin.Unit.a;
                            }
                            if (q != barVar) {
                                z = booleanValue;
                                booleanValue = z;
                            }
                            return barVar;
                        }
                        return java.lang.Boolean.valueOf(booleanValue);
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    sz0.baz c2 = c();
                    lVar.B = 1;
                    obj = mc.f.q(c2.a, true, false, new sr2.k(27), lVar);
                }
                aVar = (sz0.a) obj;
                if (aVar != null) {
                    return java.lang.Boolean.FALSE;
                }
                zz0.a aVar2 = (zz0.a) this.d.getValue();
                java.lang.String str2 = aVar.b;
                lVar.x = aVar;
                lVar.B = 2;
                aVar2.getClass();
                obj = zz0.a.a(aVar2, str2, lVar);
            }
        }
        lVar = new rz0.l(this, quxVar);
        java.lang.Object obj2 = lVar.z;
        ef3.bar barVar2 = ef3.bar.a;
        i = lVar.B;
        if (i == 0) {
        }
        aVar = (sz0.a) obj2;
        if (aVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object b(com.truecaller.cloudtelephony.callrecording.data.CallRecording callRecording, ff3.qux quxVar) {
        rz0.m mVar;
        int i;
        boolean booleanValue;
        boolean z;
        if (quxVar instanceof rz0.m) {
            mVar = (rz0.m) quxVar;
            int i2 = mVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.B = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = mVar.z;
                ef3.bar barVar = ef3.bar.a;
                i = mVar.B;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            z = mVar.y;
                            od.p.E(obj);
                            booleanValue = z;
                            return java.lang.Boolean.valueOf(booleanValue);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    callRecording = mVar.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    zz0.a aVar = (zz0.a) this.d.getValue();
                    java.lang.String str = callRecording.b;
                    mVar.x = callRecording;
                    mVar.B = 1;
                    aVar.getClass();
                    obj = zz0.a.a(aVar, str, mVar);
                }
                booleanValue = ((java.lang.Boolean) obj).booleanValue();
                if (booleanValue) {
                    sz0.baz c = c();
                    java.lang.String str2 = callRecording.a;
                    mVar.x = null;
                    mVar.y = booleanValue;
                    mVar.B = 2;
                    java.lang.Object q = mc.f.q(c.a, false, true, new nu1.m(str2, 25), mVar);
                    if (q != barVar) {
                        q = kotlin.Unit.a;
                    }
                    if (q != barVar) {
                        z = booleanValue;
                        booleanValue = z;
                    }
                    return barVar;
                }
                return java.lang.Boolean.valueOf(booleanValue);
            }
        }
        mVar = new rz0.m(this, quxVar);
        java.lang.Object obj2 = mVar.z;
        ef3.bar barVar2 = ef3.bar.a;
        i = mVar.B;
        if (i == 0) {
        }
        booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
        return java.lang.Boolean.valueOf(booleanValue);
    }

    public sz0.baz c() {
        return (sz0.baz) this.a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object d(java.lang.String str, ff3.qux quxVar) {
        rz0.n nVar;
        int i;
        try {
            if (quxVar instanceof rz0.n) {
                nVar = (rz0.n) quxVar;
                int i2 = nVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nVar.z = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = nVar.x;
                    ef3.bar barVar = ef3.bar.a;
                    i = nVar.z;
                    if (i == 0) {
                        if (i == 1) {
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        vz0.bar barVar2 = (vz0.bar) this.c.getValue();
                        nVar.z = 1;
                        obj = barVar2.e(str, nVar);
                        if (obj == barVar) {
                            return barVar;
                        }
                    }
                    return (java.util.List) obj;
                }
            }
            if (i == 0) {
            }
            return (java.util.List) obj;
        } catch (java.lang.Exception unused) {
            return kotlin.collections.h0.a;
        }
        nVar = new rz0.n(this, quxVar);
        java.lang.Object obj2 = nVar.x;
        ef3.bar barVar3 = ef3.bar.a;
        i = nVar.z;
    }

    public ij3.bar e() {
        java.lang.Object value = ((kotlin.Lazy) this.o).getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ij3.bar) value;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object f(java.lang.String str, ff3.qux quxVar) {
        rz0.o oVar;
        int i;
        boolean z;
        java.lang.Boolean bool;
        if (quxVar instanceof rz0.o) {
            oVar = (rz0.o) quxVar;
            int i2 = oVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = oVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = oVar.z;
                z = false;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    sz0.baz c = c();
                    oVar.z = 1;
                    obj = mc.f.q(c.a, true, false, new nu1.m(str, 27), oVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                bool = (java.lang.Boolean) obj;
                if (bool != null && bool.equals(java.lang.Boolean.TRUE)) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }
        oVar = new rz0.o(this, quxVar);
        java.lang.Object obj2 = oVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = oVar.z;
        z = false;
        if (i == 0) {
        }
        bool = (java.lang.Boolean) obj2;
        if (bool != null) {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: Exception -> 0x0028, TRY_LEAVE, TryCatch #0 {Exception -> 0x0028, blocks: (B:10:0x0024, B:11:0x004c, B:13:0x0050, B:21:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object g(java.lang.String str, ff3.qux quxVar) {
        rz0.p pVar;
        int i;
        sz0.a aVar;
        try {
            if (quxVar instanceof rz0.p) {
                pVar = (rz0.p) quxVar;
                int i2 = pVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pVar.z = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = pVar.x;
                    ef3.bar barVar = ef3.bar.a;
                    i = pVar.z;
                    if (i == 0) {
                        if (i == 1) {
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        sz0.baz c = c();
                        pVar.z = 1;
                        obj = mc.f.q(c.a, true, false, new nu1.m(str, 26), pVar);
                        if (obj == barVar) {
                            return barVar;
                        }
                    }
                    aVar = (sz0.a) obj;
                    if (aVar != null) {
                        return null;
                    }
                    return o(aVar);
                }
            }
            if (i == 0) {
            }
            aVar = (sz0.a) obj;
            if (aVar != null) {
            }
        } catch (java.lang.Exception e) {
            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("Error fetching local recording " + e);
            return null;
        }
        pVar = new rz0.p(this, quxVar);
        java.lang.Object obj2 = pVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = pVar.z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060 A[LOOP:0: B:11:0x005a->B:13:0x0060, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.io.Serializable h(ff3.qux quxVar) {
        rz0.q qVar;
        int i;
        java.util.Iterator it;
        if (quxVar instanceof rz0.q) {
            qVar = (rz0.q) quxVar;
            int i2 = qVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = qVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = qVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    sz0.baz c = c();
                    qVar.z = 1;
                    obj = mc.f.q(c.a, true, false, new sr2.k(28), qVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                java.lang.Iterable iterable = (java.lang.Iterable) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(o((sz0.a) it.next()));
                }
                return arrayList;
            }
        }
        qVar = new rz0.q(this, quxVar);
        java.lang.Object obj2 = qVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = qVar.z;
        if (i == 0) {
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object i(java.lang.String str, ff3.qux quxVar) {
        rz0.s sVar;
        int i;
        o9.b bVar;
        if (quxVar instanceof rz0.s) {
            sVar = (rz0.s) quxVar;
            int i2 = sVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = sVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = sVar.A;
                if (i == 0) {
                    if (i == 1) {
                        str = sVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    s01.n nVar = (s01.n) ((kotlin.Lazy) this.l).getValue();
                    sVar.x = str;
                    sVar.A = 1;
                    nVar.getClass();
                    obj = fg3.h0.W(fg3.r0.b, new pk1.l(nVar, (df3.bar) null, 17), sVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                bVar = (o9.b) obj;
                if (bVar != null) {
                    return null;
                }
                return new z9.z0(bVar).g(androidx.media3.common.MediaItem.b(android.net.Uri.parse(str)));
            }
        }
        sVar = new rz0.s(this, quxVar);
        java.lang.Object obj2 = sVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = sVar.A;
        if (i == 0) {
        }
        bVar = (o9.b) obj2;
        if (bVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object j(java.lang.String str, ff3.qux quxVar) {
        rz0.t tVar;
        int i;
        org.joda.time.DateTime a;
        java.util.Iterator it;
        java.lang.Object next;
        sz0.f fVar;
        if (quxVar instanceof rz0.t) {
            tVar = (rz0.t) quxVar;
            int i2 = tVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = tVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = tVar.A;
                if (i == 0) {
                    if (i == 1) {
                        a = tVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    a = e().a(str);
                    sz0.e eVar = (sz0.e) this.b.getValue();
                    tVar.x = a;
                    tVar.A = 1;
                    obj = mc.f.q(eVar.a, true, false, new sz0.bar(1), tVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : (java.util.List) obj) {
                    if (new org.joda.time.base.BaseDuration(e().a(((sz0.f) obj2).a), a).g().d() < org.joda.time.Duration.k(30L).d()) {
                        arrayList.add(obj2);
                    }
                }
                it = arrayList.iterator();
                if (it.hasNext()) {
                    next = null;
                } else {
                    next = it.next();
                    if (it.hasNext()) {
                        long d = new org.joda.time.base.BaseDuration(e().a(((sz0.f) next).a), a).g().d() / 1000;
                        do {
                            java.lang.Object next2 = it.next();
                            long d2 = new org.joda.time.base.BaseDuration(e().a(((sz0.f) next2).a), a).g().d() / 1000;
                            if (d > d2) {
                                next = next2;
                                d = d2;
                            }
                        } while (it.hasNext());
                    }
                }
                fVar = (sz0.f) next;
                if (fVar != null) {
                    return null;
                }
                int i3 = fVar.e;
                org.joda.time.DateTime a2 = e().a(fVar.a);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "parseDateTime(...)");
                return new rz0.h0(i3, a2, fVar.b, fVar.c, fVar.d);
            }
        }
        tVar = new rz0.t(this, quxVar);
        java.lang.Object obj3 = tVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = tVar.A;
        if (i == 0) {
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (r12.hasNext()) {
        }
        it = arrayList2.iterator();
        if (it.hasNext()) {
        }
        fVar = (sz0.f) next;
        if (fVar != null) {
        }
    }

    public java.lang.Object k(com.truecaller.cloudtelephony.callrecording.data.CallRecording callRecording, rz0.e eVar) {
        java.lang.String str;
        sz0.baz c = c();
        if (callRecording.g != null) {
            str = ((com.google.gson.Gson) ((kotlin.Lazy) this.m).getValue()).toJson(callRecording.g);
        } else {
            str = null;
        }
        java.lang.String str2 = str;
        java.lang.Object q = mc.f.q(c.a, false, true, new s93.baz(4, c, new sz0.a(callRecording.a, callRecording.b, callRecording.c.getTime(), callRecording.d, callRecording.e, callRecording.f, str2, callRecording.h, callRecording.i.getValue(), callRecording.j, callRecording.k.getValue(), callRecording.l, callRecording.m, callRecording.n)), eVar);
        ef3.bar barVar = ef3.bar.a;
        if (q != barVar) {
            q = kotlin.Unit.a;
        }
        if (q == barVar) {
            return q;
        }
        return kotlin.Unit.a;
    }

    public java.lang.Object l(rz0.h0 h0Var, ff3.qux quxVar) {
        sz0.e eVar = (sz0.e) this.b.getValue();
        java.lang.Object q = mc.f.q(eVar.a, false, true, new sz0.d(eVar, p(h0Var), 1), quxVar);
        ef3.bar barVar = ef3.bar.a;
        if (q != barVar) {
            q = kotlin.Unit.a;
        }
        if (q == barVar) {
            return q;
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object m(ff3.qux quxVar) {
        com.truecaller.settings.impl.ui.h hVar;
        int i;
        boolean a;
        if (quxVar instanceof com.truecaller.settings.impl.ui.h) {
            hVar = (com.truecaller.settings.impl.ui.h) quxVar;
            int i2 = hVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = hVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = hVar.z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            a = ((qw2.j) obj).a;
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        a = ((rw2.b) obj).a();
                    }
                } else {
                    od.p.E(obj);
                    if (((qo1.v) this.f).b()) {
                        sw2.b bVar = (sw2.b) this.d.getValue();
                        hVar.z = 1;
                        obj = bVar.b(hVar);
                    } else {
                        qw2.d0 d0Var = (qw2.d0) this.h;
                        ((qw2.b0) ((qw2.a0) this.i)).getClass();
                        java.lang.String[] strArr = (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"android.permission.READ_SMS", "android.permission.RECEIVE_SMS"}, 2);
                        hVar.z = 2;
                        obj = d0Var.g(strArr, hVar);
                    }
                    return barVar;
                }
                return java.lang.Boolean.valueOf(a);
            }
        }
        hVar = new com.truecaller.settings.impl.ui.h(this, quxVar);
        java.lang.Object obj2 = hVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = hVar.z;
        if (i == 0) {
        }
        return java.lang.Boolean.valueOf(a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object n(int i, ff3.qux quxVar) {
        com.truecaller.settings.impl.ui.i iVar;
        int i2;
        boolean a;
        if (quxVar instanceof com.truecaller.settings.impl.ui.i) {
            iVar = (com.truecaller.settings.impl.ui.i) quxVar;
            int i3 = iVar.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.A = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = iVar.y;
                ef3.bar barVar = ef3.bar.a;
                i2 = iVar.A;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            od.p.E(obj);
                            a = ((qw2.j) obj).a;
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        i = iVar.x;
                        od.p.E(obj);
                        a = ((rw2.b) obj).a();
                        if (!a) {
                            android.widget.Toast.makeText((android.content.Context) this.e, i, 0).show();
                        }
                    }
                } else {
                    od.p.E(obj);
                    if (((qo1.v) this.f).b()) {
                        sw2.b bVar = (sw2.b) this.b.getValue();
                        iVar.x = i;
                        iVar.A = 1;
                        obj = bVar.b(iVar);
                    } else {
                        qw2.d0 d0Var = (qw2.d0) this.h;
                        com.truecaller.tcpermissions.PermissionRequestOptions permissionRequestOptions = new com.truecaller.tcpermissions.PermissionRequestOptions(new java.lang.Integer(i), 3);
                        java.lang.String[] f = qb.qux.f((qw2.a0) this.i);
                        java.lang.String[] strArr = (java.lang.String[]) java.util.Arrays.copyOf(f, f.length);
                        iVar.x = i;
                        iVar.A = 2;
                        obj = d0Var.f(permissionRequestOptions, strArr, iVar);
                    }
                    return barVar;
                }
                return java.lang.Boolean.valueOf(a);
            }
        }
        iVar = new com.truecaller.settings.impl.ui.i(this, quxVar);
        java.lang.Object obj2 = iVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i2 = iVar.A;
        if (i2 == 0) {
        }
        return java.lang.Boolean.valueOf(a);
    }

    public com.truecaller.cloudtelephony.callrecording.data.CallRecording o(sz0.a aVar) {
        java.util.List list;
        if (aVar.g != null) {
            list = (java.util.List) ((com.google.gson.Gson) ((kotlin.Lazy) this.m).getValue()).fromJson(aVar.g, (java.lang.reflect.Type) this.p);
        } else {
            list = null;
        }
        java.util.List list2 = list;
        rz0.a0 a0Var = com.truecaller.cloudtelephony.callrecording.data.CallRecordingSummaryStatus.Companion;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(aVar.i);
        a0Var.getClass();
        com.truecaller.cloudtelephony.callrecording.data.CallRecordingSummaryStatus a = rz0.a0.a(valueOf);
        rz0.z zVar = com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus.Companion;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(aVar.k);
        zVar.getClass();
        return new com.truecaller.cloudtelephony.callrecording.data.CallRecording(aVar.a, aVar.b, new java.util.Date(aVar.c), aVar.d, aVar.e, aVar.f, list2, aVar.h, a, aVar.j, rz0.z.a(valueOf2), aVar.l, aVar.m, aVar.n);
    }

    public sz0.f p(rz0.h0 h0Var) {
        java.lang.String f;
        org.joda.time.DateTime dateTime = h0Var.b;
        ij3.bar e = e();
        if (e == null) {
            f = dateTime.toString();
        } else {
            dateTime.getClass();
            f = e.f(dateTime);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "toString(...)");
        sz0.f fVar = new sz0.f(f, h0Var.c, h0Var.d, h0Var.e);
        fVar.e = h0Var.a;
        return fVar;
    }

    public j(fg3.e0 e0Var, android.content.Context context, qo1.v vVar, sw2.bar barVar, qw2.d0 d0Var, qw2.a0 a0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar, "userGrowthFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "permissionRequestFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "tcPermissionsView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "tcPermissionsUtil");
        this.e = context;
        this.f = vVar;
        this.g = barVar;
        this.h = d0Var;
        this.i = a0Var;
        this.j = qk.b1.r() ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE";
        final int i = 0;
        this.a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.settings.impl.ui.d
            public final /* synthetic */ com.truecaller.settings.impl.ui.j b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i) {
                    case 0:
                        return ((qw2.b0) ((qw2.a0) this.b.i)).h(true);
                    case 1:
                        com.truecaller.settings.impl.ui.j jVar = this.b;
                        return ((sw2.bar) jVar.g).a((java.lang.String[]) jVar.a.getValue());
                    case 2:
                        com.truecaller.settings.impl.ui.j jVar2 = this.b;
                        return ((sw2.bar) jVar2.g).a((java.lang.String[]) jVar2.o);
                    default:
                        com.truecaller.settings.impl.ui.j jVar3 = this.b;
                        return ((sw2.bar) jVar3.g).a((java.lang.String[]) jVar3.p);
                }
            }
        });
        final int i2 = 1;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.settings.impl.ui.d
            public final /* synthetic */ com.truecaller.settings.impl.ui.j b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i2) {
                    case 0:
                        return ((qw2.b0) ((qw2.a0) this.b.i)).h(true);
                    case 1:
                        com.truecaller.settings.impl.ui.j jVar = this.b;
                        return ((sw2.bar) jVar.g).a((java.lang.String[]) jVar.a.getValue());
                    case 2:
                        com.truecaller.settings.impl.ui.j jVar2 = this.b;
                        return ((sw2.bar) jVar2.g).a((java.lang.String[]) jVar2.o);
                    default:
                        com.truecaller.settings.impl.ui.j jVar3 = this.b;
                        return ((sw2.bar) jVar3.g).a((java.lang.String[]) jVar3.p);
                }
            }
        });
        rw2.a aVar = rw2.a.a;
        this.l = new java.util.concurrent.atomic.AtomicReference(aVar);
        this.o = new java.lang.String[]{"android.permission.RECORD_AUDIO"};
        final int i3 = 2;
        this.c = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.settings.impl.ui.d
            public final /* synthetic */ com.truecaller.settings.impl.ui.j b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i3) {
                    case 0:
                        return ((qw2.b0) ((qw2.a0) this.b.i)).h(true);
                    case 1:
                        com.truecaller.settings.impl.ui.j jVar = this.b;
                        return ((sw2.bar) jVar.g).a((java.lang.String[]) jVar.a.getValue());
                    case 2:
                        com.truecaller.settings.impl.ui.j jVar2 = this.b;
                        return ((sw2.bar) jVar2.g).a((java.lang.String[]) jVar2.o);
                    default:
                        com.truecaller.settings.impl.ui.j jVar3 = this.b;
                        return ((sw2.bar) jVar3.g).a((java.lang.String[]) jVar3.p);
                }
            }
        });
        this.m = new java.util.concurrent.atomic.AtomicReference(aVar);
        this.k = "android.permission.READ_SMS";
        this.p = new java.lang.String[]{"android.permission.RECEIVE_SMS", "android.permission.READ_SMS"};
        final int i4 = 3;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.settings.impl.ui.d
            public final /* synthetic */ com.truecaller.settings.impl.ui.j b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i4) {
                    case 0:
                        return ((qw2.b0) ((qw2.a0) this.b.i)).h(true);
                    case 1:
                        com.truecaller.settings.impl.ui.j jVar = this.b;
                        return ((sw2.bar) jVar.g).a((java.lang.String[]) jVar.a.getValue());
                    case 2:
                        com.truecaller.settings.impl.ui.j jVar2 = this.b;
                        return ((sw2.bar) jVar2.g).a((java.lang.String[]) jVar2.o);
                    default:
                        com.truecaller.settings.impl.ui.j jVar3 = this.b;
                        return ((sw2.bar) jVar3.g).a((java.lang.String[]) jVar3.p);
                }
            }
        });
        this.n = new java.util.concurrent.atomic.AtomicReference(aVar);
        if (vVar.b()) {
            df3.bar barVar2 = null;
            fg3.h0.J(e0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.settings.impl.ui.g(this, barVar2, 0), 3);
            fg3.h0.J(e0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.settings.impl.ui.g(this, barVar2, 1), 3);
            fg3.h0.J(e0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.settings.impl.ui.g(this, barVar2, 2), 3);
        }
    }
}
