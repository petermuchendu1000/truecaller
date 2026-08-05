package com.truecaller.acs.qa;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/acs/qa/AcsQaActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AcsQaActivity extends com.truecaller.acs.qa.Hilt_AcsQaActivity {
    public static final /* synthetic */ int q0 = 0;
    public up2.qux e0;
    public su0.u f0;
    public u03.b g0;
    public u03.baz h0;
    public ej.b i0;
    public com.truecaller.acs.AfterCallScreen j0;
    public p81.bar k0;
    public wz1.bar l0;
    public rp2.c m0;
    public d91.bar p0;
    public final java.lang.String d0 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, \n        |quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse \n        |cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est \n        |laborum.";
    public java.lang.String n0 = "+46735358210";
    public final kotlin.Lazy o0 = kotlin.LazyKt.lazy(new hl2.f(6));

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        if (r11.z0(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object t0(com.truecaller.acs.qa.AcsQaActivity acsQaActivity, ff3.qux quxVar) {
        hz.d dVar;
        int i;
        com.truecaller.acs.AfterCallScreen afterCallScreen;
        com.truecaller.acs.AfterCallScreen afterCallScreen2;
        if (quxVar instanceof hz.d) {
            dVar = (hz.d) quxVar;
            int i2 = dVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = dVar.y;
                java.lang.Object obj2 = ef3.bar.a;
                i = dVar.A;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            afterCallScreen2 = dVar.x;
                            od.p.E(obj);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "buildHistoryEvent(...)");
                            ((zy.c) afterCallScreen2).h(new com.truecaller.acs.data.AfterCallHistoryEvent((com.truecaller.data.entity.HistoryEvent) obj, false, false, com.truecaller.blocking.FilterMatch.m, false, false, acsQaActivity.C0()));
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    dVar.A = 1;
                }
                acsQaActivity.D0();
                afterCallScreen = acsQaActivity.j0;
                if (afterCallScreen == null) {
                    dVar.x = afterCallScreen;
                    dVar.A = 2;
                    java.lang.Object w0 = acsQaActivity.w0(dVar);
                    if (w0 != obj2) {
                        afterCallScreen2 = afterCallScreen;
                        obj = w0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "buildHistoryEvent(...)");
                        ((zy.c) afterCallScreen2).h(new com.truecaller.acs.data.AfterCallHistoryEvent((com.truecaller.data.entity.HistoryEvent) obj, false, false, com.truecaller.blocking.FilterMatch.m, false, false, acsQaActivity.C0()));
                        return kotlin.Unit.a;
                    }
                    return obj2;
                }
                kotlin.jvm.internal.Intrinsics.n("afterCallScreen");
                throw null;
            }
        }
        dVar = new hz.d(acsQaActivity, quxVar);
        java.lang.Object obj3 = dVar.y;
        java.lang.Object obj22 = ef3.bar.a;
        i = dVar.A;
        if (i == 0) {
        }
        acsQaActivity.D0();
        afterCallScreen = acsQaActivity.j0;
        if (afterCallScreen == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        if (r11.z0(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object u0(com.truecaller.acs.qa.AcsQaActivity acsQaActivity, ff3.qux quxVar) {
        hz.e eVar;
        int i;
        com.truecaller.acs.AfterCallScreen afterCallScreen;
        com.truecaller.acs.AfterCallScreen afterCallScreen2;
        if (quxVar instanceof hz.e) {
            eVar = (hz.e) quxVar;
            int i2 = eVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = eVar.y;
                java.lang.Object obj2 = ef3.bar.a;
                i = eVar.A;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            afterCallScreen2 = eVar.x;
                            od.p.E(obj);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "buildHistoryEvent(...)");
                            ((zy.c) afterCallScreen2).g(new com.truecaller.acs.data.AfterCallHistoryEvent((com.truecaller.data.entity.HistoryEvent) obj, false, false, com.truecaller.blocking.FilterMatch.m, false, false, acsQaActivity.C0()));
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    eVar.A = 1;
                }
                acsQaActivity.D0();
                afterCallScreen = acsQaActivity.j0;
                if (afterCallScreen == null) {
                    eVar.x = afterCallScreen;
                    eVar.A = 2;
                    java.lang.Object w0 = acsQaActivity.w0(eVar);
                    if (w0 != obj2) {
                        afterCallScreen2 = afterCallScreen;
                        obj = w0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "buildHistoryEvent(...)");
                        ((zy.c) afterCallScreen2).g(new com.truecaller.acs.data.AfterCallHistoryEvent((com.truecaller.data.entity.HistoryEvent) obj, false, false, com.truecaller.blocking.FilterMatch.m, false, false, acsQaActivity.C0()));
                        return kotlin.Unit.a;
                    }
                    return obj2;
                }
                kotlin.jvm.internal.Intrinsics.n("afterCallScreen");
                throw null;
            }
        }
        eVar = new hz.e(acsQaActivity, quxVar);
        java.lang.Object obj3 = eVar.y;
        java.lang.Object obj22 = ef3.bar.a;
        i = eVar.A;
        if (i == 0) {
        }
        acsQaActivity.D0();
        afterCallScreen = acsQaActivity.j0;
        if (afterCallScreen == null) {
        }
    }

    public static com.truecaller.contact.entity.model.BusinessProfileEntity x0(com.truecaller.acs.qa.AcsQaActivity acsQaActivity, java.util.List list, int i) {
        java.lang.String str;
        if ((i & 1) != 0) {
            list = kotlin.collections.h0.a;
        }
        java.util.List list2 = list;
        if ((i & 2) != 0) {
            str = "";
        } else {
            str = "Your pizza delivery person is waiting at the doorstep";
        }
        java.lang.String str2 = str;
        kotlin.collections.h0 h0Var = kotlin.collections.h0.a;
        return new com.truecaller.contact.entity.model.BusinessProfileEntity(null, list2, h0Var, h0Var, str2, h0Var, null, 65, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, com.truecaller.data.entity.HistoryEvent] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x018f -> B:10:0x0190). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object A0(ff3.qux quxVar) {
        hz.b bVar;
        int i;
        int i2;
        int i3;
        int i4;
        d91.bar barVar;
        if (quxVar instanceof hz.b) {
            bVar = (hz.b) quxVar;
            int i5 = bVar.B;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.B = i5 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.z;
                ef3.bar barVar2 = ef3.bar.a;
                i = bVar.B;
                java.lang.String str = "binding";
                int i6 = 1;
                if (i == 0) {
                    if (i == 1) {
                        i4 = bVar.y;
                        i3 = bVar.x;
                        od.p.E(obj);
                        java.lang.String str2 = "binding";
                        int i7 = 1;
                        i4 += i7;
                        i6 = i7;
                        str = str2;
                        if (i4 < i3) {
                            ?? obj2 = new java.lang.Object();
                            ((com.truecaller.data.entity.HistoryEvent) obj2).c = "";
                            ((com.truecaller.data.entity.HistoryEvent) obj2).m = "-1";
                            java.lang.Integer valueOf = java.lang.Integer.valueOf(i6);
                            ((com.truecaller.data.entity.HistoryEvent) obj2).r = i6;
                            ((com.truecaller.data.entity.HistoryEvent) obj2).u = 4;
                            ((com.truecaller.data.entity.HistoryEvent) obj2).z = false;
                            ((com.truecaller.data.entity.HistoryEvent) obj2).A = 0;
                            ((com.truecaller.data.entity.HistoryEvent) obj2).B = 0;
                            ((com.truecaller.data.entity.HistoryEvent) obj2).C = 0;
                            ((com.truecaller.data.entity.HistoryEvent) obj2).D = 0;
                            java.lang.String str3 = this.n0;
                            sf3.a.a.getClass();
                            java.lang.String l = bar.l(sf3.a.b.e(0, 10000), str3, "#");
                            com.truecaller.data.entity.Contact contact = new com.truecaller.data.entity.Contact();
                            contact.I = "Fake missed call entry";
                            contact.i0(valueOf);
                            if (this.h0 != null) {
                                contact.h0(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                                str2 = str;
                                contact.T = java.lang.Long.valueOf(java.util.concurrent.TimeUnit.DAYS.toMillis(30L));
                                contact.U = 100;
                                contact.e0(java.lang.Boolean.FALSE);
                                com.truecaller.data.entity.Number a = com.truecaller.data.entity.Number.a(l, l, "SE");
                                if (a != null) {
                                    a.c = valueOf;
                                } else {
                                    a = new com.truecaller.data.entity.Number();
                                }
                                contact.c(a);
                                ((com.truecaller.data.entity.HistoryEvent) obj2).h = contact;
                                if (this.h0 != null) {
                                    int i8 = i3;
                                    ((com.truecaller.data.entity.HistoryEvent) obj2).j = java.lang.System.currentTimeMillis() - java.util.concurrent.TimeUnit.MINUTES.toMillis(3L);
                                    ((com.truecaller.data.entity.HistoryEvent) obj2).e = l;
                                    ((com.truecaller.data.entity.HistoryEvent) obj2).d = l;
                                    ((com.truecaller.data.entity.HistoryEvent) obj2).s = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE;
                                    ((com.truecaller.data.entity.HistoryEvent) obj2).f = "SE";
                                    ((com.truecaller.data.entity.HistoryEvent) obj2).o = 0;
                                    ((com.truecaller.data.entity.HistoryEvent) obj2).r = 1;
                                    ((com.truecaller.data.entity.HistoryEvent) obj2).D = 1;
                                    ((com.truecaller.data.entity.HistoryEvent) obj2).t = 3;
                                    android.content.ContentValues contentValues = new android.content.ContentValues();
                                    contentValues.put("number", ((com.truecaller.data.entity.HistoryEvent) obj2).e);
                                    contentValues.put("date", new java.lang.Long(((com.truecaller.data.entity.HistoryEvent) obj2).j));
                                    contentValues.put("duration", new java.lang.Long(((com.truecaller.data.entity.HistoryEvent) obj2).k));
                                    contentValues.put(com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, new java.lang.Integer(1));
                                    android.net.Uri insert = getContentResolver().insert(android.provider.CallLog.Calls.CONTENT_URI, contentValues);
                                    kotlin.jvm.internal.Intrinsics.d(insert);
                                    android.database.Cursor query = getContentResolver().query(insert, new java.lang.String[]{"_id"}, null, null, null);
                                    kotlin.jvm.internal.Intrinsics.d(query);
                                    query.moveToFirst();
                                    ((com.truecaller.data.entity.HistoryEvent) obj2).i = new java.lang.Long(query.getLong(0));
                                    query.close();
                                    su0.u uVar = this.f0;
                                    if (uVar != null) {
                                        bVar.x = i8;
                                        bVar.y = i4;
                                        i7 = 1;
                                        bVar.B = 1;
                                        if (fg3.h0.W(uVar.a, new rv2.b0((java.lang.Object) obj2, uVar, (df3.bar) null, 14), bVar) == barVar2) {
                                            return barVar2;
                                        }
                                        i3 = i8;
                                        i4 += i7;
                                        i6 = i7;
                                        str = str2;
                                        if (i4 < i3) {
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("callLogManager");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("clock");
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("clock");
                                throw null;
                            }
                        }
                        java.lang.String str4 = str;
                        barVar = this.p0;
                        if (barVar == null) {
                            barVar.I.setText("0");
                            return kotlin.Unit.a;
                        }
                        kotlin.jvm.internal.Intrinsics.n(str4);
                        throw null;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.p.E(obj);
                d91.bar barVar3 = this.p0;
                if (barVar3 != null) {
                    java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(java.lang.String.valueOf(barVar3.I.getText()));
                    if (intOrNull != null) {
                        i2 = intOrNull.intValue();
                    } else {
                        i2 = 0;
                    }
                    if (i2 > 0) {
                        i3 = i2;
                        i4 = 0;
                        if (i4 < i3) {
                        }
                    }
                    java.lang.String str42 = str;
                    barVar = this.p0;
                    if (barVar == null) {
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
            }
        }
        bVar = new hz.b(this, quxVar);
        java.lang.Object obj3 = bVar.z;
        ef3.bar barVar22 = ef3.bar.a;
        i = bVar.B;
        java.lang.String str5 = "binding";
        int i62 = 1;
        if (i == 0) {
        }
    }

    public final java.lang.String B0(java.lang.String str) {
        d91.bar barVar = this.p0;
        if (barVar != null) {
            if (barVar.R.isChecked()) {
                return this.d0;
            }
            return str;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final com.truecaller.data.entity.assistant.ScreenedCallAcsDetails C0() {
        d91.bar barVar = this.p0;
        if (barVar != null) {
            java.lang.Object selectedItem = barVar.K.getSelectedItem();
            if (kotlin.jvm.internal.Intrinsics.b(selectedItem, "Call time out")) {
                return new com.truecaller.data.entity.assistant.ScreenedCallAcsDetails("123", "1234567", "caller_timeout", (java.lang.String) null);
            }
            if (kotlin.jvm.internal.Intrinsics.b(selectedItem, "Caller didn't respond")) {
                return new com.truecaller.data.entity.assistant.ScreenedCallAcsDetails("123", "1234567", "caller_hungup", (java.lang.String) null);
            }
            if (!kotlin.jvm.internal.Intrinsics.b(selectedItem, "Caller hang-up message")) {
                return null;
            }
            return new com.truecaller.data.entity.assistant.ScreenedCallAcsDetails("123", "1234567", "caller_hungup", "Hi! I’m calling to check on the renewal of your subscription");
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void D0() {
        rp2.baz bazVar;
        d91.bar barVar = this.p0;
        if (barVar != null) {
            if (barVar.D.isChecked()) {
                bazVar = new rp2.baz("qa_token");
            } else {
                bazVar = rp2.qux.a;
            }
            rp2.c cVar = this.m0;
            if (cVar != null) {
                cVar.b(bazVar);
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("softThrottleStatusObserver");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.acs.qa.Hilt_AcsQaActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        u03.c cVar = this.g0;
        if (cVar != null) {
            if (!cVar.v()) {
                if (this.g0 != null) {
                    finish();
                } else {
                    kotlin.jvm.internal.Intrinsics.n("deviceInfoUtil");
                    throw null;
                }
            }
            yy.qux.C(this, 2);
            final int i = 0;
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(2131558434, (android.view.ViewGroup) null, false);
            int i2 = 2131362179;
            com.truecaller.common.ui.switchmaterial.SwitchMaterialX o = df0.qux.o(2131362179, inflate);
            if (o != null) {
                i2 = 2131363078;
                com.google.android.material.textfield.TextInputEditText o2 = df0.qux.o(2131363078, inflate);
                if (o2 != null) {
                    i2 = 2131363079;
                    if (df0.qux.o(2131363079, inflate) != null) {
                        i2 = 2131364393;
                        com.truecaller.common.ui.switchmaterial.SwitchMaterialX o3 = df0.qux.o(2131364393, inflate);
                        if (o3 != null) {
                            i2 = 2131364394;
                            com.truecaller.common.ui.switchmaterial.SwitchMaterialX o4 = df0.qux.o(2131364394, inflate);
                            if (o4 != null) {
                                i2 = 2131364395;
                                com.truecaller.common.ui.switchmaterial.SwitchMaterialX o5 = df0.qux.o(2131364395, inflate);
                                if (o5 != null) {
                                    i2 = 2131364396;
                                    com.truecaller.common.ui.switchmaterial.SwitchMaterialX o6 = df0.qux.o(2131364396, inflate);
                                    if (o6 != null) {
                                        i2 = 2131364397;
                                        com.truecaller.common.ui.switchmaterial.SwitchMaterialX o7 = df0.qux.o(2131364397, inflate);
                                        if (o7 != null) {
                                            i2 = 2131364398;
                                            com.truecaller.common.ui.switchmaterial.SwitchMaterialX o8 = df0.qux.o(2131364398, inflate);
                                            if (o8 != null) {
                                                i2 = 2131364399;
                                                com.truecaller.common.ui.switchmaterial.SwitchMaterialX o9 = df0.qux.o(2131364399, inflate);
                                                if (o9 != null) {
                                                    i2 = 2131364400;
                                                    com.truecaller.common.ui.switchmaterial.SwitchMaterialX o11 = df0.qux.o(2131364400, inflate);
                                                    if (o11 != null) {
                                                        i2 = 2131364401;
                                                        com.truecaller.common.ui.switchmaterial.SwitchMaterialX o12 = df0.qux.o(2131364401, inflate);
                                                        if (o12 != null) {
                                                            i2 = 2131364402;
                                                            com.truecaller.common.ui.switchmaterial.SwitchMaterialX o13 = df0.qux.o(2131364402, inflate);
                                                            if (o13 != null) {
                                                                i2 = 2131364404;
                                                                com.truecaller.common.ui.switchmaterial.SwitchMaterialX o14 = df0.qux.o(2131364404, inflate);
                                                                if (o14 != null) {
                                                                    i2 = 2131364405;
                                                                    com.truecaller.common.ui.switchmaterial.SwitchMaterialX o15 = df0.qux.o(2131364405, inflate);
                                                                    if (o15 != null) {
                                                                        i2 = 2131364407;
                                                                        com.truecaller.common.ui.switchmaterial.SwitchMaterialX o16 = df0.qux.o(2131364407, inflate);
                                                                        if (o16 != null) {
                                                                            i2 = 2131364408;
                                                                            com.truecaller.common.ui.switchmaterial.SwitchMaterialX o17 = df0.qux.o(2131364408, inflate);
                                                                            if (o17 != null) {
                                                                                i2 = 2131364410;
                                                                                com.truecaller.common.ui.switchmaterial.SwitchMaterialX o18 = df0.qux.o(2131364410, inflate);
                                                                                if (o18 != null) {
                                                                                    i2 = 2131364411;
                                                                                    com.truecaller.common.ui.switchmaterial.SwitchMaterialX o19 = df0.qux.o(2131364411, inflate);
                                                                                    if (o19 != null) {
                                                                                        i2 = 2131364412;
                                                                                        com.truecaller.common.ui.switchmaterial.SwitchMaterialX o20 = df0.qux.o(2131364412, inflate);
                                                                                        if (o20 != null) {
                                                                                            i2 = 2131364745;
                                                                                            com.truecaller.common.ui.switchmaterial.SwitchMaterialX o21 = df0.qux.o(2131364745, inflate);
                                                                                            if (o21 != null) {
                                                                                                i2 = 2131364746;
                                                                                                com.truecaller.common.ui.switchmaterial.SwitchMaterialX o22 = df0.qux.o(2131364746, inflate);
                                                                                                if (o22 != null) {
                                                                                                    i2 = 2131364747;
                                                                                                    com.truecaller.common.ui.switchmaterial.SwitchMaterialX o23 = df0.qux.o(2131364747, inflate);
                                                                                                    if (o23 != null) {
                                                                                                        i2 = 2131364748;
                                                                                                        com.truecaller.common.ui.switchmaterial.SwitchMaterialX o24 = df0.qux.o(2131364748, inflate);
                                                                                                        if (o24 != null) {
                                                                                                            i2 = 2131364750;
                                                                                                            com.truecaller.common.ui.switchmaterial.SwitchMaterialX o25 = df0.qux.o(2131364750, inflate);
                                                                                                            if (o25 != null) {
                                                                                                                i2 = 2131364751;
                                                                                                                com.truecaller.common.ui.switchmaterial.SwitchMaterialX o26 = df0.qux.o(2131364751, inflate);
                                                                                                                if (o26 != null) {
                                                                                                                    i2 = 2131364753;
                                                                                                                    com.truecaller.common.ui.switchmaterial.SwitchMaterialX o27 = df0.qux.o(2131364753, inflate);
                                                                                                                    if (o27 != null) {
                                                                                                                        i2 = 2131364754;
                                                                                                                        com.truecaller.common.ui.switchmaterial.SwitchMaterialX o28 = df0.qux.o(2131364754, inflate);
                                                                                                                        if (o28 != null) {
                                                                                                                            i2 = 2131364756;
                                                                                                                            com.truecaller.common.ui.switchmaterial.SwitchMaterialX o29 = df0.qux.o(2131364756, inflate);
                                                                                                                            if (o29 != null) {
                                                                                                                                i2 = 2131364757;
                                                                                                                                com.truecaller.common.ui.switchmaterial.SwitchMaterialX o31 = df0.qux.o(2131364757, inflate);
                                                                                                                                if (o31 != null) {
                                                                                                                                    i2 = 2131364758;
                                                                                                                                    com.truecaller.common.ui.switchmaterial.SwitchMaterialX o32 = df0.qux.o(2131364758, inflate);
                                                                                                                                    if (o32 != null) {
                                                                                                                                        i2 = 2131364759;
                                                                                                                                        com.truecaller.common.ui.switchmaterial.SwitchMaterialX o33 = df0.qux.o(2131364759, inflate);
                                                                                                                                        if (o33 != null) {
                                                                                                                                            i2 = 2131364760;
                                                                                                                                            com.truecaller.common.ui.switchmaterial.SwitchMaterialX o34 = df0.qux.o(2131364760, inflate);
                                                                                                                                            if (o34 != null) {
                                                                                                                                                i2 = 2131364761;
                                                                                                                                                com.truecaller.common.ui.switchmaterial.SwitchMaterialX o35 = df0.qux.o(2131364761, inflate);
                                                                                                                                                if (o35 != null) {
                                                                                                                                                    i2 = 2131365346;
                                                                                                                                                    com.google.android.material.textfield.TextInputEditText o36 = df0.qux.o(2131365346, inflate);
                                                                                                                                                    if (o36 != null) {
                                                                                                                                                        i2 = 2131365347;
                                                                                                                                                        if (df0.qux.o(2131365347, inflate) != null) {
                                                                                                                                                            i2 = 2131365418;
                                                                                                                                                            com.google.android.material.textfield.TextInputEditText o37 = df0.qux.o(2131365418, inflate);
                                                                                                                                                            if (o37 != null) {
                                                                                                                                                                i2 = 2131365419;
                                                                                                                                                                if (df0.qux.o(2131365419, inflate) != null) {
                                                                                                                                                                    i2 = 2131366410;
                                                                                                                                                                    if (df0.qux.o(2131366410, inflate) != null) {
                                                                                                                                                                        i2 = 2131366414;
                                                                                                                                                                        android.widget.Spinner spinner = (android.widget.Spinner) df0.qux.o(2131366414, inflate);
                                                                                                                                                                        if (spinner != null) {
                                                                                                                                                                            i2 = 2131366417;
                                                                                                                                                                            com.truecaller.common.ui.switchmaterial.SwitchMaterialX o38 = df0.qux.o(2131366417, inflate);
                                                                                                                                                                            if (o38 != null) {
                                                                                                                                                                                i2 = 2131366426;
                                                                                                                                                                                android.widget.Button button = (android.widget.Button) df0.qux.o(2131366426, inflate);
                                                                                                                                                                                if (button != null) {
                                                                                                                                                                                    i2 = 2131366429;
                                                                                                                                                                                    android.widget.Button button2 = (android.widget.Button) df0.qux.o(2131366429, inflate);
                                                                                                                                                                                    if (button2 != null) {
                                                                                                                                                                                        i2 = 2131366435;
                                                                                                                                                                                        com.truecaller.common.ui.switchmaterial.SwitchMaterialX o39 = df0.qux.o(2131366435, inflate);
                                                                                                                                                                                        if (o39 != null) {
                                                                                                                                                                                            i2 = 2131366729;
                                                                                                                                                                                            com.google.android.material.textfield.TextInputEditText o41 = df0.qux.o(2131366729, inflate);
                                                                                                                                                                                            if (o41 != null) {
                                                                                                                                                                                                i2 = 2131366730;
                                                                                                                                                                                                if (df0.qux.o(2131366730, inflate) != null) {
                                                                                                                                                                                                    i2 = 2131366732;
                                                                                                                                                                                                    com.google.android.material.textfield.TextInputEditText o42 = df0.qux.o(2131366732, inflate);
                                                                                                                                                                                                    if (o42 != null) {
                                                                                                                                                                                                        i2 = 2131366733;
                                                                                                                                                                                                        if (df0.qux.o(2131366733, inflate) != null) {
                                                                                                                                                                                                            i2 = 2131366749;
                                                                                                                                                                                                            if (((android.widget.ScrollView) df0.qux.o(2131366749, inflate)) != null) {
                                                                                                                                                                                                                i2 = 2131367352;
                                                                                                                                                                                                                com.truecaller.common.ui.switchmaterial.SwitchMaterialX o43 = df0.qux.o(2131367352, inflate);
                                                                                                                                                                                                                if (o43 != null) {
                                                                                                                                                                                                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
                                                                                                                                                                                                                    d91.bar barVar = new d91.bar(linearLayout, o, o2, o3, o4, o5, o6, o7, o8, o9, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22, o23, o24, o25, o26, o27, o28, o29, o31, o32, o33, o34, o35, o36, o37, spinner, o38, button, button2, o39, o41, o42, o43);
                                                                                                                                                                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "inflate(...)");
                                                                                                                                                                                                                    this.p0 = barVar;
                                                                                                                                                                                                                    setContentView(linearLayout);
                                                                                                                                                                                                                    d91.bar barVar2 = this.p0;
                                                                                                                                                                                                                    if (barVar2 != null) {
                                                                                                                                                                                                                        android.widget.LinearLayout linearLayout2 = barVar2.a;
                                                                                                                                                                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout2, "getRoot(...)");
                                                                                                                                                                                                                        ak.r0.i(linearLayout2, com.truecaller.common.ui.insets.InsetType.SystemBars);
                                                                                                                                                                                                                        d91.bar barVar3 = this.p0;
                                                                                                                                                                                                                        if (barVar3 != null) {
                                                                                                                                                                                                                            barVar3.N.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: hz.bar
                                                                                                                                                                                                                                public final /* synthetic */ com.truecaller.acs.qa.AcsQaActivity b;

                                                                                                                                                                                                                                {
                                                                                                                                                                                                                                    this.b = this;
                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                                                                                public final void onClick(android.view.View view) {
                                                                                                                                                                                                                                    int i3 = i;
                                                                                                                                                                                                                                    fg3.f1 f1Var = fg3.f1.a;
                                                                                                                                                                                                                                    com.truecaller.acs.qa.AcsQaActivity acsQaActivity = this.b;
                                                                                                                                                                                                                                    switch (i3) {
                                                                                                                                                                                                                                        case 0:
                                                                                                                                                                                                                                            int i4 = com.truecaller.acs.qa.AcsQaActivity.q0;
                                                                                                                                                                                                                                            ng3.b bVar = fg3.r0.a;
                                                                                                                                                                                                                                            fg3.h0.J(f1Var, lg3.k.a, (fg3.f0) null, new hz.c(acsQaActivity, null, 1), 2);
                                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                                        default:
                                                                                                                                                                                                                                            int i5 = com.truecaller.acs.qa.AcsQaActivity.q0;
                                                                                                                                                                                                                                            ng3.b bVar2 = fg3.r0.a;
                                                                                                                                                                                                                                            fg3.h0.J(f1Var, lg3.k.a, (fg3.f0) null, new hz.c(acsQaActivity, null, 2), 2);
                                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });
                                                                                                                                                                                                                            d91.bar barVar4 = this.p0;
                                                                                                                                                                                                                            if (barVar4 != null) {
                                                                                                                                                                                                                                final int i3 = 1;
                                                                                                                                                                                                                                barVar4.M.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: hz.bar
                                                                                                                                                                                                                                    public final /* synthetic */ com.truecaller.acs.qa.AcsQaActivity b;

                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                        this.b = this;
                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                                                                                                    public final void onClick(android.view.View view) {
                                                                                                                                                                                                                                        int i32 = i3;
                                                                                                                                                                                                                                        fg3.f1 f1Var = fg3.f1.a;
                                                                                                                                                                                                                                        com.truecaller.acs.qa.AcsQaActivity acsQaActivity = this.b;
                                                                                                                                                                                                                                        switch (i32) {
                                                                                                                                                                                                                                            case 0:
                                                                                                                                                                                                                                                int i4 = com.truecaller.acs.qa.AcsQaActivity.q0;
                                                                                                                                                                                                                                                ng3.b bVar = fg3.r0.a;
                                                                                                                                                                                                                                                fg3.h0.J(f1Var, lg3.k.a, (fg3.f0) null, new hz.c(acsQaActivity, null, 1), 2);
                                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                            default:
                                                                                                                                                                                                                                                int i5 = com.truecaller.acs.qa.AcsQaActivity.q0;
                                                                                                                                                                                                                                                ng3.b bVar2 = fg3.r0.a;
                                                                                                                                                                                                                                                fg3.h0.J(f1Var, lg3.k.a, (fg3.f0) null, new hz.c(acsQaActivity, null, 2), 2);
                                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                d91.bar barVar5 = this.p0;
                                                                                                                                                                                                                                if (barVar5 != null) {
                                                                                                                                                                                                                                    android.widget.Spinner spinner2 = barVar5.K;
                                                                                                                                                                                                                                    android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter((android.content.Context) this, android.R.layout.simple_spinner_item, kotlin.collections.y.j(new java.lang.String[]{"No widget", "Call time out", "Caller didn't respond", "Caller hang-up message"}));
                                                                                                                                                                                                                                    arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                                                                                                                                                                                                                    spinner2.setAdapter((android.widget.SpinnerAdapter) arrayAdapter);
                                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        }
        kotlin.jvm.internal.Intrinsics.n("deviceInfoUtil");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object v0(ff3.qux quxVar) {
        hz.baz bazVar;
        int i;
        d91.bar barVar;
        int i2;
        com.truecaller.contact.entity.model.BusinessProfileEntity.MediaCallerId mediaCallerId;
        com.truecaller.contact.entity.model.BusinessProfileEntity.MediaCallerId mediaCallerId2;
        long j;
        if (quxVar instanceof hz.baz) {
            bazVar = (hz.baz) quxVar;
            int i3 = bazVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bazVar.z = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = bazVar.x;
                java.lang.Object obj2 = ef3.bar.a;
                i = bazVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    bazVar.z = 1;
                    obj = y0(bazVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                com.truecaller.data.entity.Contact contact = (com.truecaller.data.entity.Contact) obj;
                barVar = this.p0;
                if (barVar == null) {
                    if (barVar.h.isChecked()) {
                        ej.b bVar = this.i0;
                        if (bVar != null) {
                            java.lang.String H = ((qi0.baz) ((qc3.bar) bVar.c).get()).H("biz_call_survey_test_number", "");
                            if (H.length() > 0) {
                                this.n0 = H;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("bizmonQaTestManager");
                            throw null;
                        }
                    }
                    d91.bar barVar2 = this.p0;
                    if (barVar2 != null) {
                        if (barVar2.g.isChecked()) {
                            ej.b bVar2 = this.i0;
                            if (bVar2 != null) {
                                java.lang.String t = bVar2.t();
                                if (t.length() > 0) {
                                    this.n0 = t;
                                }
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("bizmonQaTestManager");
                                throw null;
                            }
                        }
                        d91.bar barVar3 = this.p0;
                        if (barVar3 != null) {
                            if (!kotlin.text.StringsKt.X(java.lang.String.valueOf(barVar3.Q.getText()))) {
                                com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields = new com.truecaller.contact.entity.model.DataEntityPrimaryFields(null, null, false, null, null);
                                d91.bar barVar4 = this.p0;
                                if (barVar4 != null) {
                                    java.lang.String valueOf = java.lang.String.valueOf(barVar4.Q.getText());
                                    d91.bar barVar5 = this.p0;
                                    if (barVar5 != null) {
                                        java.lang.Long t0 = kotlin.text.StringsKt.t0(java.lang.String.valueOf(barVar5.P.getText()));
                                        if (t0 != null) {
                                            j = t0.longValue();
                                        } else {
                                            j = 0;
                                        }
                                        contact.g.add(new com.truecaller.contact.entity.model.ContactSurveyEntity(dataEntityPrimaryFields, valueOf, new java.lang.Long(j), "passthroughData", new java.lang.Long(300L), "dynamicAccessKey"));
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                    throw null;
                                }
                            }
                            d91.bar barVar6 = this.p0;
                            if (barVar6 != null) {
                                if (!kotlin.text.StringsKt.X(java.lang.String.valueOf(barVar6.c.getText()))) {
                                    d91.bar barVar7 = this.p0;
                                    if (barVar7 != null) {
                                        contact.y = new com.truecaller.contact.entity.model.FeedbackEntity.CommentsEntity(null, java.lang.Integer.parseInt(java.lang.String.valueOf(barVar7.c.getText())), 1, null);
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                        throw null;
                                    }
                                }
                                d91.bar barVar8 = this.p0;
                                if (barVar8 != null) {
                                    if (barVar8.o.isChecked()) {
                                        contact.I = B0("Alan Mamedi");
                                    }
                                    d91.bar barVar9 = this.p0;
                                    if (barVar9 != null) {
                                        if (barVar9.e.isChecked()) {
                                            contact.L = B0("Bruce Wayne");
                                        }
                                        d91.bar barVar10 = this.p0;
                                        if (barVar10 != null) {
                                            if (barVar10.t.isChecked()) {
                                                contact.L = B0("Transliterated Name");
                                            }
                                            d91.bar barVar11 = this.p0;
                                            if (barVar11 != null) {
                                                if (barVar11.d.isChecked()) {
                                                    contact.a(qk3.p.p(1407, B0("Stockholm"), "SE"));
                                                }
                                                d91.bar barVar12 = this.p0;
                                                if (barVar12 != null) {
                                                    if (barVar12.O.isChecked()) {
                                                        contact.a(qk3.p.p(383, "India", "IN"));
                                                    }
                                                    d91.bar barVar13 = this.p0;
                                                    if (barVar13 != null) {
                                                        if (barVar13.f.isChecked()) {
                                                            contact.O = "https://storage.googleapis.com/tc-images-eu/myview/1/e9118ec2a5b4fdf1ab572ab98362bd74/3";
                                                        }
                                                        d91.bar barVar14 = this.p0;
                                                        if (barVar14 != null) {
                                                            if (barVar14.s.isChecked()) {
                                                                com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields2 = new com.truecaller.contact.entity.model.DataEntityPrimaryFields(null, null, false, null, null);
                                                                sf3.a.a.getClass();
                                                                contact.d(new com.truecaller.contact.entity.model.TagEntity(dataEntityPrimaryFields2, java.lang.String.valueOf(sf3.a.b.e(1, 12))));
                                                            }
                                                            d91.bar barVar15 = this.p0;
                                                            if (barVar15 != null) {
                                                                if (barVar15.E.isChecked()) {
                                                                    contact.B = "SPAMMER";
                                                                }
                                                                d91.bar barVar16 = this.p0;
                                                                if (barVar16 != null) {
                                                                    if (barVar16.r.isChecked()) {
                                                                        contact.j0(new java.lang.Integer(142));
                                                                    }
                                                                    d91.bar barVar17 = this.p0;
                                                                    if (barVar17 != null) {
                                                                        if (barVar17.B.isChecked()) {
                                                                            contact.a0(new java.lang.Integer(contact.t + 16));
                                                                        }
                                                                        d91.bar barVar18 = this.p0;
                                                                        if (barVar18 != null) {
                                                                            if (barVar18.G.isChecked()) {
                                                                                contact.a0(new java.lang.Integer(contact.t + 2));
                                                                            }
                                                                            d91.bar barVar19 = this.p0;
                                                                            if (barVar19 != null) {
                                                                                if (barVar19.A.isChecked()) {
                                                                                    contact.a0(new java.lang.Integer(contact.t + 4));
                                                                                }
                                                                                d91.bar barVar20 = this.p0;
                                                                                if (barVar20 != null) {
                                                                                    if (barVar20.v.isChecked()) {
                                                                                        contact.a0(new java.lang.Integer(contact.t + 32));
                                                                                    }
                                                                                    d91.bar barVar21 = this.p0;
                                                                                    if (barVar21 != null) {
                                                                                        if (barVar21.u.isChecked()) {
                                                                                            contact.a0(new java.lang.Integer(contact.t + 64));
                                                                                            contact.Q = B0("True Software Scandinavia AB");
                                                                                        }
                                                                                        d91.bar barVar22 = this.p0;
                                                                                        if (barVar22 != null) {
                                                                                            if (barVar22.F.isChecked()) {
                                                                                                contact.a0(new java.lang.Integer(contact.t + 128));
                                                                                                contact.Q = B0("True Software Scandinavia AB");
                                                                                            }
                                                                                            d91.bar barVar23 = this.p0;
                                                                                            if (barVar23 != null) {
                                                                                                if (barVar23.C.isChecked()) {
                                                                                                    contact.a0(new java.lang.Integer(contact.t + 1024));
                                                                                                    contact.Q = B0("True Software Scandinavia AB");
                                                                                                }
                                                                                                d91.bar barVar24 = this.p0;
                                                                                                if (barVar24 != null) {
                                                                                                    if (barVar24.n.isChecked()) {
                                                                                                        contact.Q = B0("True Software Scandinavia AB");
                                                                                                        contact.P = B0("CEO");
                                                                                                    }
                                                                                                    d91.bar barVar25 = this.p0;
                                                                                                    if (barVar25 != null) {
                                                                                                        if (barVar25.p.isChecked()) {
                                                                                                            contact.f.add((com.truecaller.contact.entity.model.SearchWarningEntity) this.o0.getValue());
                                                                                                        }
                                                                                                        d91.bar barVar26 = this.p0;
                                                                                                        if (barVar26 != null) {
                                                                                                            if (barVar26.w.isChecked()) {
                                                                                                                contact.g0(new java.lang.Long(100L));
                                                                                                            }
                                                                                                            d91.bar barVar27 = this.p0;
                                                                                                            if (barVar27 != null) {
                                                                                                                if (barVar27.l.isChecked()) {
                                                                                                                    contact.w = x0(this, null, 1);
                                                                                                                }
                                                                                                                d91.bar barVar28 = this.p0;
                                                                                                                if (barVar28 != null) {
                                                                                                                    if (barVar28.j.isChecked()) {
                                                                                                                        d91.bar barVar29 = this.p0;
                                                                                                                        if (barVar29 != null) {
                                                                                                                            if (barVar29.k.isChecked()) {
                                                                                                                                mediaCallerId2 = new com.truecaller.contact.entity.model.BusinessProfileEntity.MediaCallerId("1234", "https://storage.googleapis.com/tc-priority-public/98988b55-13b7-447b-b6e7-9a321a5cad76", "Video", "Landscape", 2521823400000L);
                                                                                                                            } else {
                                                                                                                                mediaCallerId2 = new com.truecaller.contact.entity.model.BusinessProfileEntity.MediaCallerId("1234", "https://storage.googleapis.com/tc-priority-public/570ed8ec-6ed9-45e0-b06f-cb69cdaff062", "Video", "Landscape", 2521823400000L);
                                                                                                                            }
                                                                                                                            contact.w = x0(this, kotlin.collections.x.c(mediaCallerId2), 2);
                                                                                                                        } else {
                                                                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    d91.bar barVar30 = this.p0;
                                                                                                                    if (barVar30 != null) {
                                                                                                                        if (barVar30.i.isChecked()) {
                                                                                                                            d91.bar barVar31 = this.p0;
                                                                                                                            if (barVar31 != null) {
                                                                                                                                if (barVar31.k.isChecked()) {
                                                                                                                                    mediaCallerId = new com.truecaller.contact.entity.model.BusinessProfileEntity.MediaCallerId("1234", "https://storage.googleapis.com/tc-priority-public/19e57be7-cc00-4e4d-9d4a-17ad4b8f5d3d", "Video", "Landscape", 2521823400000L);
                                                                                                                                } else {
                                                                                                                                    mediaCallerId = new com.truecaller.contact.entity.model.BusinessProfileEntity.MediaCallerId("1234", "https://storage.googleapis.com/tc-priority-public/c0941db9-9c89-4d2a-b068-e07ef1bc797c", "Video", "Landscape", 2521823400000L);
                                                                                                                                }
                                                                                                                                contact.w = x0(this, kotlin.collections.x.c(mediaCallerId), 2);
                                                                                                                            } else {
                                                                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        d91.bar barVar32 = this.p0;
                                                                                                                        if (barVar32 != null) {
                                                                                                                            barVar32.L.isChecked();
                                                                                                                            d91.bar barVar33 = this.p0;
                                                                                                                            if (barVar33 != null) {
                                                                                                                                if (barVar33.b.isChecked()) {
                                                                                                                                    contact.H = "v4XAj2EZSRF+sI6mWTtoiq==";
                                                                                                                                }
                                                                                                                                contact.i0(new java.lang.Integer(1));
                                                                                                                                if (this.h0 != null) {
                                                                                                                                    contact.h0(new java.lang.Long(java.lang.System.currentTimeMillis()));
                                                                                                                                    contact.T = new java.lang.Long(java.util.concurrent.TimeUnit.DAYS.toMillis(30L));
                                                                                                                                    d91.bar barVar34 = this.p0;
                                                                                                                                    if (barVar34 != null) {
                                                                                                                                        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(java.lang.String.valueOf(barVar34.J.getText()));
                                                                                                                                        if (intOrNull != null) {
                                                                                                                                            i2 = intOrNull.intValue();
                                                                                                                                        } else {
                                                                                                                                            i2 = 100;
                                                                                                                                        }
                                                                                                                                        contact.U = new java.lang.Integer(i2);
                                                                                                                                        d91.bar barVar35 = this.p0;
                                                                                                                                        if (barVar35 != null) {
                                                                                                                                            contact.e0(java.lang.Boolean.valueOf(barVar35.y.isChecked()));
                                                                                                                                            java.lang.String str = this.n0;
                                                                                                                                            com.truecaller.data.entity.Number a = com.truecaller.data.entity.Number.a(str, str, "SE");
                                                                                                                                            if (a != null) {
                                                                                                                                                a.c = new java.lang.Integer(1);
                                                                                                                                            } else {
                                                                                                                                                a = new com.truecaller.data.entity.Number();
                                                                                                                                            }
                                                                                                                                            contact.c(a);
                                                                                                                                            return contact;
                                                                                                                                        }
                                                                                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                kotlin.jvm.internal.Intrinsics.n("clock");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                    throw null;
                                                                                                }
                                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                throw null;
                                                                                            }
                                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                            throw null;
                                                                                        }
                                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                        throw null;
                                                                                    }
                                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                    throw null;
                                                                                }
                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                throw null;
                                                                            }
                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                            throw null;
                                                                        }
                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                        throw null;
                                                                    }
                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                throw null;
                                            }
                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                    throw null;
                                }
                                kotlin.jvm.internal.Intrinsics.n("binding");
                                throw null;
                            }
                            kotlin.jvm.internal.Intrinsics.n("binding");
                            throw null;
                        }
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("binding");
                throw null;
            }
        }
        bazVar = new hz.baz(this, quxVar);
        java.lang.Object obj3 = bazVar.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = bazVar.z;
        if (i == 0) {
        }
        com.truecaller.data.entity.Contact contact2 = (com.truecaller.data.entity.Contact) obj3;
        barVar = this.p0;
        if (barVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object w0(ff3.qux quxVar) {
        hz.qux quxVar2;
        int i;
        q81.qux quxVar3;
        q81.qux quxVar4;
        if (quxVar instanceof hz.qux) {
            quxVar2 = (hz.qux) quxVar;
            int i2 = quxVar2.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                quxVar2.B = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = quxVar2.z;
                java.lang.Object obj2 = ef3.bar.a;
                i = quxVar2.B;
                int i3 = 1;
                if (i == 0) {
                    if (i == 1) {
                        quxVar3 = quxVar2.y;
                        quxVar4 = quxVar2.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    q81.qux quxVar5 = new q81.qux();
                    d91.bar barVar = this.p0;
                    if (barVar != null) {
                        if (barVar.H.isChecked()) {
                            quxVar5.a.v = "com.whatsapp";
                        }
                        quxVar2.x = quxVar5;
                        quxVar2.y = quxVar5;
                        quxVar2.B = 1;
                        java.lang.Object v0 = v0(quxVar2);
                        if (v0 == obj2) {
                            return obj2;
                        }
                        quxVar3 = quxVar5;
                        obj = v0;
                        quxVar4 = quxVar3;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                }
                com.truecaller.data.entity.HistoryEvent historyEvent = quxVar3.a;
                historyEvent.h = (com.truecaller.data.entity.Contact) obj;
                if (this.h0 == null) {
                    historyEvent.j = java.lang.System.currentTimeMillis() - java.util.concurrent.TimeUnit.MINUTES.toMillis(3L);
                    java.lang.String str = this.n0;
                    historyEvent.e = str;
                    historyEvent.d = str;
                    historyEvent.s = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE;
                    historyEvent.f = "SE";
                    historyEvent.i = new java.lang.Long(-1L);
                    d91.bar barVar2 = this.p0;
                    if (barVar2 != null) {
                        if (barVar2.z.isChecked()) {
                            i3 = 2;
                        } else {
                            d91.bar barVar3 = this.p0;
                            if (barVar3 != null) {
                                if (!barVar3.x.isChecked()) {
                                    i3 = 3;
                                }
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("binding");
                                throw null;
                            }
                        }
                        historyEvent.t = i3;
                        d91.bar barVar4 = this.p0;
                        if (barVar4 != null) {
                            if (barVar4.m.isChecked()) {
                                historyEvent.y = new com.truecaller.data.entity.CallContextMessage("Potential sales veeeeeeeeeeeeeeeery looooooooooong message", this.n0, "Very Very Very Very loooooooong call context message", com.truecaller.data.entity.FeatureType.UNDEFINED, com.truecaller.data.entity.MessageType.Undefined.a, "", false);
                            }
                            return quxVar4.a;
                        }
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("clock");
                throw null;
            }
        }
        quxVar2 = new hz.qux(this, quxVar);
        java.lang.Object obj3 = quxVar2.z;
        java.lang.Object obj22 = ef3.bar.a;
        i = quxVar2.B;
        int i32 = 1;
        if (i == 0) {
        }
        com.truecaller.data.entity.HistoryEvent historyEvent2 = quxVar3.a;
        historyEvent2.h = (com.truecaller.data.entity.Contact) obj3;
        if (this.h0 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object y0(ff3.qux quxVar) {
        hz.a aVar;
        int i;
        com.truecaller.data.entity.Contact contact;
        if (quxVar instanceof hz.a) {
            aVar = (hz.a) quxVar;
            int i2 = aVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = aVar.z;
                boolean z = true;
                df3.bar barVar2 = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            com.truecaller.data.entity.Contact contact2 = (com.truecaller.data.entity.Contact) obj;
                            if (contact2 == null) {
                                return new com.truecaller.data.entity.Contact();
                            }
                            return contact2;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    d91.bar barVar3 = this.p0;
                    if (barVar3 != null) {
                        if (barVar3.y.isChecked()) {
                            ng3.a aVar2 = fg3.r0.b;
                            fi2.g gVar = new fi2.g(this, (df3.bar) null, 29);
                            aVar.z = 1;
                            obj = fg3.h0.W(aVar2, gVar, aVar);
                        }
                        return new com.truecaller.data.entity.Contact();
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
                contact = (com.truecaller.data.entity.Contact) obj;
                if (contact != null) {
                    wz1.bar barVar4 = this.l0;
                    if (barVar4 != null) {
                        aVar.z = 2;
                        obj = fg3.h0.W(barVar4.a, new a00.b(barVar4, contact, z, barVar2, 22), aVar);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("manualCallerIdManager");
                        throw null;
                    }
                }
                return new com.truecaller.data.entity.Contact();
            }
        }
        aVar = new hz.a(this, quxVar);
        java.lang.Object obj2 = aVar.x;
        ef3.bar barVar5 = ef3.bar.a;
        i = aVar.z;
        boolean z2 = true;
        df3.bar barVar22 = null;
        if (i == 0) {
        }
        contact = (com.truecaller.data.entity.Contact) obj2;
        if (contact != null) {
        }
        return new com.truecaller.data.entity.Contact();
    }

    public final java.lang.Object z0(ff3.qux quxVar) {
        d91.bar barVar = this.p0;
        if (barVar != null) {
            if (barVar.p.isChecked()) {
                fg3.h0.J(fg3.f1.a, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new hz.c(this, null, 0), 3);
            }
            java.lang.Object A0 = A0(quxVar);
            if (A0 == ef3.bar.a) {
                return A0;
            }
            return kotlin.Unit.a;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }
}
