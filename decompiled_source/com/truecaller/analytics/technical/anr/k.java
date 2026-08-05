package com.truecaller.analytics.technical.anr;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class k {
    public final java.util.ArrayList a;
    public final java.util.List b;
    public final java.lang.String c;
    public final ki.qux d;
    public final b91.d e;

    public k(java.util.ArrayList arrayList, java.util.List list, java.lang.String str, ki.qux quxVar, b91.d dVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "appExitInfoWraps");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "appStarts");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "ourPackageName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "storage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "trackingMethods");
        this.a = arrayList;
        this.b = list;
        this.c = str;
        this.d = quxVar;
        this.e = dVar;
    }

    public static com.truecaller.analytics.technical.anr.VolatileDetailsAnrCauseException a(wt.l lVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StackTraceElement[] stackTraceElementArr;
        java.lang.String str3;
        kotlin.Lazy lazy = (kotlin.Lazy) lVar.e;
        com.truecaller.analytics.technical.anr.a aVar = (com.truecaller.analytics.technical.anr.a) lVar.b;
        ed0.bar barVar = (ed0.bar) lazy.getValue();
        java.lang.String str4 = null;
        if (barVar != null) {
            long j = 1000;
            long d = (v6.a.d(aVar.a) - barVar.c) / j;
            if (0 <= d && d < 30000000) {
                str3 = com.ironsource.adqualitysdk.sdk.i.bar.m(d, " | Running for: ", "s");
            } else {
                str3 = null;
            }
            java.lang.String str5 = barVar.e;
            java.lang.String str6 = barVar.d;
            long j2 = barVar.b / j;
            java.lang.StringBuilder E = ro0.f.E(" | App starter: ", str5, "(", str6, ") | Starting for: ");
            E.append(j2);
            E.append("s");
            E.append(str3);
            str = E.toString();
        } else {
            str = null;
        }
        com.truecaller.analytics.technical.anr.i iVar = (com.truecaller.analytics.technical.anr.i) ((kotlin.Lazy) lVar.d).getValue();
        int b = v6.a.b(aVar.a);
        int v = ah.z.v(aVar.a);
        long e = ah.z.e(aVar.a);
        long w = ah.z.w(aVar.a);
        java.lang.String o = ah.z.o(aVar.a);
        if (o != null) {
            str2 = kotlin.text.c0.J(100, o);
        } else {
            str2 = null;
        }
        if (iVar != null) {
            str4 = iVar.a;
        }
        java.lang.StringBuilder e2 = z0.a0.e(b, v, "Reason: ", " | PID: ", " | PSS/RSS: ");
        e2.append(e);
        ro0.f.L(e2, "/", w, "kb | Description: ");
        com.truecaller.analytics.technical.anr.VolatileDetailsAnrCauseException volatileDetailsAnrCauseException = new com.truecaller.analytics.technical.anr.VolatileDetailsAnrCauseException(bar.x(e2, str2, " | Trace header: ", str4, str));
        if (iVar != null && (stackTraceElementArr = (java.lang.StackTraceElement[]) iVar.b.toArray(new java.lang.StackTraceElement[0])) != null) {
            volatileDetailsAnrCauseException.setStackTrace(stackTraceElementArr);
        }
        return volatileDetailsAnrCauseException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x02e3, code lost:
    
        if (r0 == r3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x006e, code lost:
    
        if (r1 == r3) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a3  */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, wt.l] */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.jvm.internal.i0, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x02a8 -> B:18:0x02af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x02a3 -> B:18:0x02af). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(ff3.qux quxVar) {
        com.truecaller.analytics.technical.anr.j jVar;
        int i;
        long longValue;
        kotlin.jvm.internal.i0 i0Var;
        java.util.Iterator it;
        int i2;
        int i3;
        java.util.Iterator it2;
        java.lang.Object obj;
        com.truecaller.analytics.technical.anr.qux quxVar2;
        com.truecaller.analytics.technical.anr.qux quxVar3;
        b91.d dVar;
        kotlin.Lazy lazy;
        wt.l lVar;
        java.lang.String str;
        java.lang.StackTraceElement stackTraceElement;
        java.lang.String className;
        java.lang.Throwable otherInputDispatchAnrMacroException;
        java.lang.String str2;
        java.lang.StackTraceElement stackTraceElement2;
        java.lang.StackTraceElement stackTraceElement3;
        com.truecaller.analytics.technical.anr.k kVar = this;
        if (quxVar instanceof com.truecaller.analytics.technical.anr.j) {
            jVar = (com.truecaller.analytics.technical.anr.j) quxVar;
            int i4 = jVar.D;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jVar.D = i4 - Integer.MIN_VALUE;
                java.lang.Object obj2 = jVar.B;
                ef3.bar barVar = ef3.bar.a;
                i = jVar.D;
                final int i5 = 0;
                ki.qux quxVar4 = kVar.d;
                int i6 = 2;
                final int i7 = 1;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                od.p.E(obj2);
                                return kotlin.Unit.a;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = jVar.A;
                        longValue = jVar.x;
                        it = jVar.z;
                        i0Var = jVar.y;
                        od.p.E(obj2);
                        int i8 = 0;
                        int i9 = 1;
                        kVar = this;
                        i7 = i9;
                        i5 = i8;
                        i6 = 2;
                        if (!it.hasNext()) {
                            com.truecaller.analytics.technical.anr.a aVar = (com.truecaller.analytics.technical.anr.a) it.next();
                            if (v6.a.d(aVar.a) > i0Var.a) {
                                i0Var.a = v6.a.d(aVar.a);
                            }
                            if (v6.a.d(aVar.a) > longValue) {
                                jVar.y = i0Var;
                                jVar.z = it;
                                jVar.x = longValue;
                                jVar.A = i2;
                                jVar.D = i6;
                                if (v6.a.b(aVar.a) == 6) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "appExitInfo");
                                    java.util.List list = kVar.b;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "recentAppStarts");
                                    java.lang.String str3 = kVar.c;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "ourPackageName");
                                    final ?? obj3 = new java.lang.Object();
                                    ((wt.l) obj3).b = aVar;
                                    ((wt.l) obj3).c = list;
                                    ((wt.l) obj3).a = str3;
                                    ((wt.l) obj3).d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.truecaller.analytics.technical.anr.bar
                                        public final java.lang.Object invoke() {
                                            java.lang.Object obj4;
                                            int i11 = i5;
                                            wt.l lVar2 = obj3;
                                            switch (i11) {
                                                case 0:
                                                    java.util.List list2 = com.truecaller.analytics.technical.anr.i.f;
                                                    return lk.c.O((com.truecaller.analytics.technical.anr.a) lVar2.b, (java.lang.String) lVar2.a);
                                                default:
                                                    java.util.Iterator it3 = ((java.util.List) lVar2.c).iterator();
                                                    while (true) {
                                                        if (it3.hasNext()) {
                                                            obj4 = it3.next();
                                                            if (((ed0.bar) obj4).a == ah.z.v(((com.truecaller.analytics.technical.anr.a) lVar2.b).a)) {
                                                            }
                                                        } else {
                                                            obj4 = null;
                                                        }
                                                    }
                                                    return (ed0.bar) obj4;
                                            }
                                        }
                                    });
                                    ((wt.l) obj3).e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.truecaller.analytics.technical.anr.bar
                                        public final java.lang.Object invoke() {
                                            java.lang.Object obj4;
                                            int i11 = i7;
                                            wt.l lVar2 = obj3;
                                            switch (i11) {
                                                case 0:
                                                    java.util.List list2 = com.truecaller.analytics.technical.anr.i.f;
                                                    return lk.c.O((com.truecaller.analytics.technical.anr.a) lVar2.b, (java.lang.String) lVar2.a);
                                                default:
                                                    java.util.Iterator it3 = ((java.util.List) lVar2.c).iterator();
                                                    while (true) {
                                                        if (it3.hasNext()) {
                                                            obj4 = it3.next();
                                                            if (((ed0.bar) obj4).a == ah.z.v(((com.truecaller.analytics.technical.anr.a) lVar2.b).a)) {
                                                            }
                                                        } else {
                                                            obj4 = null;
                                                        }
                                                    }
                                                    return (ed0.bar) obj4;
                                            }
                                        }
                                    });
                                    java.lang.String o = ah.z.o(aVar.a);
                                    if (o != null) {
                                        if (kotlin.text.StringsKt.X(o)) {
                                            o = null;
                                        }
                                        if (o != null) {
                                            quxVar2 = new com.truecaller.analytics.technical.anr.qux(o);
                                            ((wt.l) obj3).f = quxVar2;
                                            kotlin.Lazy lazy2 = (kotlin.Lazy) ((wt.l) obj3).d;
                                            quxVar3 = (com.truecaller.analytics.technical.anr.qux) ((wt.l) obj3).f;
                                            if (quxVar3 != null) {
                                                kotlin.Lazy lazy3 = (kotlin.Lazy) quxVar3.i;
                                                kotlin.Lazy lazy4 = (kotlin.Lazy) quxVar3.h;
                                                i8 = i5;
                                                kotlin.Lazy lazy5 = (kotlin.Lazy) quxVar3.g;
                                                boolean z = quxVar3.a;
                                                i3 = i2;
                                                if (quxVar3.b == i7) {
                                                    b91.d dVar2 = kVar.e;
                                                    if (z == i7) {
                                                        com.truecaller.analytics.technical.anr.i iVar = (com.truecaller.analytics.technical.anr.i) lazy2.getValue();
                                                        if (iVar != null) {
                                                            stackTraceElement3 = (java.lang.StackTraceElement) iVar.e.getValue();
                                                        } else {
                                                            stackTraceElement3 = null;
                                                        }
                                                        if (stackTraceElement3 != null) {
                                                            dVar = dVar2;
                                                            com.truecaller.analytics.technical.anr.AnrMicroException anrMicroException = new com.truecaller.analytics.technical.anr.AnrMicroException("PunishableAnrMicroV1");
                                                            lazy = lazy3;
                                                            java.lang.String className2 = stackTraceElement3.getClassName();
                                                            java.lang.StackTraceElement stackTraceElement4 = stackTraceElement3;
                                                            java.lang.String methodName = stackTraceElement4.getMethodName();
                                                            it2 = it;
                                                            java.lang.String fileName = stackTraceElement4.getFileName();
                                                            lVar = obj3;
                                                            i9 = 1;
                                                            java.lang.StackTraceElement stackTraceElement5 = new java.lang.StackTraceElement(className2, methodName, fileName, 1);
                                                            java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[1];
                                                            stackTraceElementArr[i8] = stackTraceElement5;
                                                            anrMicroException.setStackTrace(stackTraceElementArr);
                                                            anrMicroException.initCause(a(lVar));
                                                            dVar.getClass();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anrMicroException, "e");
                                                            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(anrMicroException);
                                                        } else {
                                                            dVar = dVar2;
                                                            lazy = lazy3;
                                                            it2 = it;
                                                            lVar = obj3;
                                                            i9 = 1;
                                                        }
                                                    } else {
                                                        dVar = dVar2;
                                                        lazy = lazy3;
                                                        it2 = it;
                                                        lVar = obj3;
                                                        i9 = i7;
                                                    }
                                                    if (z == i9) {
                                                        java.lang.String str4 = (java.lang.String) lazy5.getValue();
                                                        if (str4 == null || (str = "ActivityRecord:".concat(str4)) == null) {
                                                            java.lang.String str5 = (java.lang.String) lazy4.getValue();
                                                            if (str5 != null) {
                                                                str = "NotResponding:".concat(str5);
                                                            } else {
                                                                java.lang.String str6 = (java.lang.String) lazy.getValue();
                                                                if (str6 != null) {
                                                                    str = "MentionedComponent:".concat(str6);
                                                                } else {
                                                                    str = null;
                                                                }
                                                                if (str == null) {
                                                                    com.truecaller.analytics.technical.anr.i iVar2 = (com.truecaller.analytics.technical.anr.i) lazy2.getValue();
                                                                    if (iVar2 != null && (stackTraceElement = (java.lang.StackTraceElement) iVar2.d.getValue()) != null && (className = stackTraceElement.getClassName()) != null) {
                                                                        str = "MacroBlameFrame:".concat(className);
                                                                    } else {
                                                                        str = null;
                                                                    }
                                                                    if (str == null) {
                                                                        str = "Component:Unknown";
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        java.lang.String q = k9.d.q("PunishableAnrMacroV1 - ", str);
                                                        if (((java.lang.Boolean) ((kotlin.Lazy) quxVar3.e).getValue()).booleanValue()) {
                                                            otherInputDispatchAnrMacroException = new com.truecaller.analytics.technical.anr.NoFocusedWindowInputDispatchAnrMacroException(q);
                                                        } else if (((java.lang.Boolean) ((kotlin.Lazy) quxVar3.f).getValue()).booleanValue()) {
                                                            otherInputDispatchAnrMacroException = new com.truecaller.analytics.technical.anr.WindowMentionedInputDispatchAnrMacroException(q);
                                                        } else {
                                                            otherInputDispatchAnrMacroException = new com.truecaller.analytics.technical.anr.OtherInputDispatchAnrMacroException(q);
                                                        }
                                                        java.lang.String str7 = (java.lang.String) lazy5.getValue();
                                                        if (str7 == null && (str7 = (java.lang.String) lazy4.getValue()) == null && (str7 = (java.lang.String) lazy.getValue()) == null) {
                                                            com.truecaller.analytics.technical.anr.i iVar3 = (com.truecaller.analytics.technical.anr.i) lazy2.getValue();
                                                            if (iVar3 != null && (stackTraceElement2 = (java.lang.StackTraceElement) iVar3.d.getValue()) != null) {
                                                                str2 = stackTraceElement2.getClassName();
                                                            } else {
                                                                str2 = null;
                                                            }
                                                            if (str2 == null) {
                                                                str7 = "UnknownComponent";
                                                            } else {
                                                                str7 = str2;
                                                            }
                                                        }
                                                        i9 = 1;
                                                        java.lang.StackTraceElement stackTraceElement6 = new java.lang.StackTraceElement(str7, "fakeMethod", "PunishableAnrReporterFakeFile", 1);
                                                        java.lang.StackTraceElement[] stackTraceElementArr2 = new java.lang.StackTraceElement[1];
                                                        stackTraceElementArr2[i8] = stackTraceElement6;
                                                        otherInputDispatchAnrMacroException.setStackTrace(stackTraceElementArr2);
                                                        otherInputDispatchAnrMacroException.initCause(a(lVar));
                                                        dVar.getClass();
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otherInputDispatchAnrMacroException, "e");
                                                        com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(otherInputDispatchAnrMacroException);
                                                    }
                                                    obj = fg3.h0.a0(jVar);
                                                    if (obj != ef3.bar.a) {
                                                        obj = kotlin.Unit.a;
                                                    }
                                                    if (obj != barVar) {
                                                        i2 = i3;
                                                        it = it2;
                                                    }
                                                }
                                                i9 = i7;
                                                it2 = it;
                                                obj = kotlin.Unit.a;
                                                if (obj != barVar) {
                                                }
                                            }
                                        }
                                    }
                                    quxVar2 = null;
                                    ((wt.l) obj3).f = quxVar2;
                                    kotlin.Lazy lazy22 = (kotlin.Lazy) ((wt.l) obj3).d;
                                    quxVar3 = (com.truecaller.analytics.technical.anr.qux) ((wt.l) obj3).f;
                                    if (quxVar3 != null) {
                                    }
                                }
                                i3 = i2;
                                i8 = i5;
                                i9 = i7;
                                it2 = it;
                                obj = kotlin.Unit.a;
                                if (obj != barVar) {
                                }
                            } else {
                                i8 = i5;
                                i9 = i7;
                            }
                            kVar = this;
                            i7 = i9;
                            i5 = i8;
                            i6 = 2;
                            if (!it.hasNext()) {
                                long j = i0Var.a;
                                if (j > longValue) {
                                    jVar.y = null;
                                    jVar.z = null;
                                    jVar.x = longValue;
                                    jVar.D = 3;
                                    java.lang.Object Y = ef0.a.Y((t7.e) ((com.truecaller.analytics.technical.anr.m) quxVar4.c).f.getValue(), (y7.b) quxVar4.b, j, jVar);
                                    if (Y != ef3.bar.a) {
                                        Y = kotlin.Unit.a;
                                    }
                                } else {
                                    return kotlin.Unit.a;
                                }
                            }
                        }
                        return barVar;
                    }
                    od.p.E(obj2);
                } else {
                    od.p.E(obj2);
                    jVar.D = 1;
                    obj2 = ef0.a.E((t7.e) ((com.truecaller.analytics.technical.anr.m) quxVar4.c).f.getValue(), (y7.b) quxVar4.b, 0L, jVar);
                }
                longValue = ((java.lang.Number) obj2).longValue();
                ?? obj4 = new java.lang.Object();
                ((kotlin.jvm.internal.i0) obj4).a = longValue;
                i0Var = obj4;
                it = kVar.a.iterator();
                i2 = 0;
                if (!it.hasNext()) {
                }
                return barVar;
            }
        }
        jVar = new com.truecaller.analytics.technical.anr.j(kVar, quxVar);
        java.lang.Object obj22 = jVar.B;
        ef3.bar barVar2 = ef3.bar.a;
        i = jVar.D;
        final int i52 = 0;
        ki.qux quxVar42 = kVar.d;
        int i62 = 2;
        final int i72 = 1;
        if (i == 0) {
        }
        longValue = ((java.lang.Number) obj22).longValue();
        ?? obj42 = new java.lang.Object();
        ((kotlin.jvm.internal.i0) obj42).a = longValue;
        i0Var = obj42;
        it = kVar.a.iterator();
        i2 = 0;
        if (!it.hasNext()) {
        }
        return barVar2;
    }
}
