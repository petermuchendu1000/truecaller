package com.truecaller.editprofile.impl.ui.legacy;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class p extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ com.truecaller.editprofile.impl.ui.legacy.s A;
    public final /* synthetic */ java.lang.String B;
    public final /* synthetic */ java.lang.String C;
    public final /* synthetic */ java.lang.String D;
    public final /* synthetic */ java.lang.String E;
    public final /* synthetic */ java.lang.String F;
    public final /* synthetic */ java.lang.String G;
    public final /* synthetic */ java.lang.String H;
    public final /* synthetic */ java.lang.String I;
    public final /* synthetic */ java.lang.String J;
    public final /* synthetic */ java.lang.String K;
    public java.util.List x;
    public com.truecaller.editprofile.impl.ui.legacy.s y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.truecaller.editprofile.impl.ui.legacy.s sVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, df3.bar barVar) {
        super(2, barVar);
        this.A = sVar;
        this.B = str;
        this.C = str2;
        this.D = str3;
        this.E = str4;
        this.F = str5;
        this.G = str6;
        this.H = str7;
        this.I = str8;
        this.J = str9;
        this.K = str10;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.editprofile.impl.ui.legacy.p(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0159, code lost:
    
        if (r3 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013b, code lost:
    
        if (r3 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0122, code lost:
    
        if (r2 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0178  */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.truecaller.sdk.bar, og2.a] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.truecaller.sdk.bar, og2.a] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.truecaller.sdk.bar, og2.a] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.truecaller.sdk.bar, og2.a] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.truecaller.sdk.bar, og2.a] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.truecaller.sdk.bar, og2.a] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.truecaller.sdk.bar, og2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object obj2;
        java.lang.Object w;
        java.lang.Object obj3;
        com.truecaller.editprofile.impl.ui.legacy.h hVar;
        java.util.List arrayList;
        java.lang.Object g2;
        java.lang.Object c;
        java.lang.Object f;
        com.truecaller.editprofile.impl.ui.legacy.s sVar;
        java.lang.String birthday;
        com.truecaller.editprofile.impl.ui.legacy.h hVar2;
        com.truecaller.editprofile.impl.ui.legacy.h hVar3;
        androidx.fragment.app.FragmentActivity activity;
        ef3.bar barVar = ef3.bar.a;
        int i2 = this.z;
        com.truecaller.editprofile.impl.ui.legacy.s sVar2 = this.A;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            sVar = this.y;
                            arrayList = this.x;
                            od.p.E(obj);
                            str = "";
                            i = 0;
                            f = obj;
                            pg2.m mVar = (pg2.m) f;
                            com.truecaller.clevertap.CleverTapManager cleverTapManager = sVar.p;
                            birthday = mVar.getBirthday();
                            if (birthday == null) {
                                birthday = str;
                            }
                            kotlin.Pair pair = new kotlin.Pair("DOB", birthday);
                            kotlin.Pair pair2 = new kotlin.Pair("Gender", mVar.getGender());
                            kotlin.Pair[] pairArr = new kotlin.Pair[2];
                            pairArr[i] = pair;
                            pairArr[1] = pair2;
                            cleverTapManager.push("ProfileEdit", kotlin.collections.r0.i(pairArr));
                            sVar2.j.getClass();
                            ff0.g.H();
                            hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar2).a;
                            if (hVar2 != null) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "configs");
                                androidx.fragment.app.FragmentActivity activity2 = ((com.truecaller.editprofile.impl.ui.legacy.d) hVar2).getActivity();
                                if (activity2 != null) {
                                    android.content.Intent intent = new android.content.Intent();
                                    intent.putExtra("configs", (android.os.Parcelable[]) arrayList.toArray(new com.truecaller.rewardprogram.api.model.ProgressConfig[i]));
                                    activity2.setResult(-1, intent);
                                }
                            }
                            hVar3 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar2).a;
                            if (hVar3 != null && (activity = ((com.truecaller.editprofile.impl.ui.legacy.d) hVar3).getActivity()) != null) {
                                activity.finish();
                            }
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = this.x;
                    od.p.E(obj);
                    str = "";
                    i = 0;
                    c = obj;
                    com.truecaller.rewardprogram.api.model.ProgressConfig progressConfig = (com.truecaller.rewardprogram.api.model.ProgressConfig) c;
                    if (progressConfig != null) {
                        arrayList.add(progressConfig);
                    }
                    rg2.m mVar2 = sVar2.e;
                    this.x = arrayList;
                    this.y = sVar2;
                    this.z = 4;
                    f = mVar2.f(this);
                    if (f != barVar) {
                        sVar = sVar2;
                        pg2.m mVar3 = (pg2.m) f;
                        com.truecaller.clevertap.CleverTapManager cleverTapManager2 = sVar.p;
                        birthday = mVar3.getBirthday();
                        if (birthday == null) {
                        }
                        kotlin.Pair pair3 = new kotlin.Pair("DOB", birthday);
                        kotlin.Pair pair22 = new kotlin.Pair("Gender", mVar3.getGender());
                        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                        pairArr2[i] = pair3;
                        pairArr2[1] = pair22;
                        cleverTapManager2.push("ProfileEdit", kotlin.collections.r0.i(pairArr2));
                        sVar2.j.getClass();
                        ff0.g.H();
                        hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar2).a;
                        if (hVar2 != null) {
                        }
                        hVar3 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar2).a;
                        if (hVar3 != null) {
                            activity.finish();
                        }
                        return kotlin.Unit.a;
                    }
                    return barVar;
                }
                arrayList = this.x;
                od.p.E(obj);
                str = "";
                i = 0;
                g2 = obj;
                com.truecaller.rewardprogram.api.model.ProgressConfig progressConfig2 = (com.truecaller.rewardprogram.api.model.ProgressConfig) g2;
                if (progressConfig2 != null) {
                    arrayList.add(progressConfig2);
                }
                if (sVar2.z != null) {
                    uk2.g gVar = sVar2.s;
                    com.truecaller.rewardprogram.api.model.BonusTaskType bonusTaskType = com.truecaller.rewardprogram.api.model.BonusTaskType.CONNECT_GOOGLE_ACCOUNT;
                    this.x = arrayList;
                    this.z = 3;
                    c = gVar.c(bonusTaskType, this);
                }
                rg2.m mVar22 = sVar2.e;
                this.x = arrayList;
                this.y = sVar2;
                this.z = 4;
                f = mVar22.f(this);
                if (f != barVar) {
                }
                return barVar;
            }
            od.p.E(obj);
            w = obj;
            str = "";
            obj2 = null;
            i = 0;
        } else {
            od.p.E(obj);
            com.truecaller.sdk.bar barVar2 = new com.truecaller.sdk.bar(com.truecaller.editprofile.impl.ui.legacy.s.h2(this.B));
            com.truecaller.sdk.bar barVar3 = new com.truecaller.sdk.bar(com.truecaller.editprofile.impl.ui.legacy.s.h2(this.C));
            com.truecaller.sdk.bar barVar4 = new com.truecaller.sdk.bar(com.truecaller.editprofile.impl.ui.legacy.s.h2(this.D));
            com.truecaller.sdk.bar barVar5 = new com.truecaller.sdk.bar(sVar2.w.name());
            i = 0;
            ?? barVar6 = new com.truecaller.sdk.bar(com.truecaller.editprofile.impl.ui.legacy.s.h2(this.E));
            com.truecaller.sdk.bar barVar7 = new com.truecaller.sdk.bar(com.truecaller.editprofile.impl.ui.legacy.s.h2(this.F));
            ?? barVar8 = new com.truecaller.sdk.bar(com.truecaller.editprofile.impl.ui.legacy.s.h2(this.G));
            com.truecaller.sdk.bar barVar9 = new com.truecaller.sdk.bar(sVar2.z);
            ?? barVar10 = new com.truecaller.sdk.bar(com.truecaller.editprofile.impl.ui.legacy.s.h2(this.H));
            ?? barVar11 = new com.truecaller.sdk.bar(com.truecaller.editprofile.impl.ui.legacy.s.h2(this.I));
            ?? barVar12 = new com.truecaller.sdk.bar(com.truecaller.editprofile.impl.ui.legacy.s.h2(this.J));
            str = "";
            ?? barVar13 = new com.truecaller.sdk.bar(com.truecaller.editprofile.impl.ui.legacy.s.h2(this.K));
            java.util.Date date = sVar2.x;
            if (date == null || (str2 = sVar2.B.format(date)) == null) {
                str2 = str;
            }
            obj2 = null;
            og2.b bVar = new og2.b(barVar2, barVar3, null, barVar4, barVar5, barVar6, barVar7, barVar8, barVar9, barVar10, barVar11, barVar12, barVar13, new com.truecaller.sdk.bar(str2), new com.truecaller.sdk.bar((java.lang.Object) null), 772);
            q6.baz bazVar = sVar2.f;
            this.z = 1;
            w = bazVar.w(bVar, this);
        }
        pg2.o0 o0Var = (pg2.o0) w;
        if (o0Var instanceof pg2.n0) {
            arrayList = new java.util.ArrayList();
            this.x = arrayList;
            this.z = 2;
            kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.editprofile.impl.ui.legacy.s.D;
            g2 = sVar2.g2(this);
        } else {
            if (o0Var instanceof pg2.m0) {
                com.truecaller.editprofile.impl.ui.legacy.s.c2(sVar2);
                pg2.k0 e = sVar2.o.e(((pg2.m0) o0Var).a);
                com.truecaller.editprofile.impl.ui.legacy.h hVar4 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar2).a;
                if (hVar4 != null) {
                    ((com.truecaller.editprofile.impl.ui.legacy.d) hVar4).r6(e);
                }
                pg2.h[] hVarArr = {e.c, e.k};
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVarArr, "elements");
                java.util.Iterator it = kotlin.collections.v.l0(hVarArr).iterator();
                while (true) {
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        if (((pg2.h) next) instanceof pg2.f) {
                            obj3 = next;
                            break;
                        }
                    } else {
                        obj3 = obj2;
                        break;
                    }
                }
                pg2.h hVar5 = (pg2.h) obj3;
                if (hVar5 != null && (hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar2).a) != null) {
                    ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).s6(((pg2.f) hVar5).a);
                }
            } else {
                com.truecaller.editprofile.impl.ui.legacy.s.c2(sVar2);
                com.truecaller.editprofile.impl.ui.legacy.h hVar6 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar2).a;
                if (hVar6 != null) {
                    java.lang.String h = sVar2.g.h(2132020747, new java.lang.Object[0]);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
                    ((com.truecaller.editprofile.impl.ui.legacy.d) hVar6).s6(h);
                }
            }
            return kotlin.Unit.a;
        }
    }
}
