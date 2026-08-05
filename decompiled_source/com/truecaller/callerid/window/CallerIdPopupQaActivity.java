package com.truecaller.callerid.window;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/callerid/window/CallerIdPopupQaActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallerIdPopupQaActivity extends com.truecaller.callerid.window.Hilt_CallerIdPopupQaActivity {
    public static final /* synthetic */ int N0 = 0;
    public u03.b I0;
    public jq2.b J0;
    public wz1.bar K0;
    public p81.bar L0;
    public hu0.p M0;
    public final java.lang.String d0 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, \n        |quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse \n        |cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est \n        |laborum.";
    public final java.lang.String e0 = "+46704506210";
    public final kotlin.Lazy f0 = gj.m.J(this, 2131364393);
    public final kotlin.Lazy g0 = gj.m.J(this, 2131364394);
    public final kotlin.Lazy h0 = gj.m.J(this, 2131364395);
    public final kotlin.Lazy i0 = gj.m.J(this, 2131364398);
    public final kotlin.Lazy j0 = gj.m.J(this, 2131364404);
    public final kotlin.Lazy k0 = gj.m.J(this, 2131364405);
    public final kotlin.Lazy l0 = gj.m.J(this, 2131364407);
    public final kotlin.Lazy m0 = gj.m.J(this, 2131364409);
    public final kotlin.Lazy n0 = gj.m.J(this, 2131364410);
    public final kotlin.Lazy o0 = gj.m.J(this, 2131364411);
    public final kotlin.Lazy p0 = gj.m.J(this, 2131364745);
    public final kotlin.Lazy q0 = gj.m.J(this, 2131364746);
    public final kotlin.Lazy r0 = gj.m.J(this, 2131364752);
    public final kotlin.Lazy s0 = gj.m.J(this, 2131364753);
    public final kotlin.Lazy t0 = gj.m.J(this, 2131364754);
    public final kotlin.Lazy u0 = gj.m.J(this, 2131364755);
    public final kotlin.Lazy v0 = gj.m.J(this, 2131364758);
    public final kotlin.Lazy w0 = gj.m.J(this, 2131364759);
    public final kotlin.Lazy x0 = gj.m.J(this, 2131364756);
    public final kotlin.Lazy y0 = gj.m.J(this, 2131364760);
    public final kotlin.Lazy z0 = gj.m.J(this, 2131366410);
    public final kotlin.Lazy A0 = gj.m.J(this, 2131366429);
    public final kotlin.Lazy B0 = gj.m.J(this, 2131366435);
    public final kotlin.Lazy C0 = gj.m.J(this, 2131367352);
    public final kotlin.Lazy D0 = gj.m.J(this, 2131366415);
    public final kotlin.Lazy E0 = gj.m.J(this, 2131364744);
    public final kotlin.Lazy F0 = gj.m.J(this, 2131364762);
    public final kotlin.Lazy G0 = gj.m.J(this, 2131364749);
    public final kotlin.Lazy H0 = gj.m.J(this, 2131364757);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object t0(com.truecaller.callerid.window.CallerIdPopupQaActivity callerIdPopupQaActivity, ff3.qux quxVar) {
        hu0.a aVar;
        int i;
        hu0.k kVar;
        com.truecaller.data.entity.Number number;
        com.truecaller.blocking.FilterMatch filterMatch;
        if (quxVar instanceof hu0.a) {
            aVar = (hu0.a) quxVar;
            int i2 = aVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.B = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.z;
                ef3.bar barVar = ef3.bar.a;
                i = aVar.B;
                if (i == 0) {
                    if (i == 1) {
                        com.truecaller.data.entity.Number number2 = aVar.y;
                        kVar = aVar.x;
                        od.p.E(obj);
                        number = number2;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ev.d dVar = new ev.d(12);
                    jq2.b bVar = callerIdPopupQaActivity.J0;
                    if (bVar != null) {
                        hu0.p pVar = callerIdPopupQaActivity.M0;
                        if (pVar != null) {
                            hu0.k kVar2 = new hu0.k(callerIdPopupQaActivity, dVar, bVar, pVar);
                            try {
                                kVar2.d();
                                kVar2.a();
                                com.truecaller.data.entity.Number number3 = new com.truecaller.data.entity.Number(callerIdPopupQaActivity.e0, (java.lang.String) null);
                                aVar.x = kVar2;
                                aVar.y = number3;
                                aVar.B = 1;
                                java.lang.Object u0 = callerIdPopupQaActivity.u0(aVar);
                                if (u0 == barVar) {
                                    return barVar;
                                }
                                kVar = kVar2;
                                obj = u0;
                                number = number3;
                            } catch (java.lang.RuntimeException e) {
                                throw new java.lang.RuntimeException(k9.d.q("Please, make sure you've given DRAW OVER OTHER APPS permission. It might be a cause for ", e.getMessage()));
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("callerIdWindowIdPositionCalculator");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("searchSettings");
                        throw null;
                    }
                }
                com.truecaller.data.entity.Contact contact = (com.truecaller.data.entity.Contact) obj;
                boolean isChecked = ((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) callerIdPopupQaActivity.H0.getValue()).isChecked();
                int i3 = !((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) callerIdPopupQaActivity.D0.getValue()).isChecked() ? 1 : 0;
                if (!((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) callerIdPopupQaActivity.E0.getValue()).isChecked()) {
                    filterMatch = new com.truecaller.blocking.FilterMatch(0L, com.truecaller.blocking.FilterAction.FILTER_BLACKLISTED, com.truecaller.blocking.ActionSource.BLACKLISTED_NUMBER, null, null, null, 0, null, null, null, null, false, 4088);
                } else if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) callerIdPopupQaActivity.F0.getValue()).isChecked()) {
                    filterMatch = new com.truecaller.blocking.FilterMatch(0L, com.truecaller.blocking.FilterAction.ALLOW_WHITELISTED, com.truecaller.blocking.ActionSource.CUSTOM_WHITELIST, null, null, null, 0, null, null, null, null, false, 4088);
                } else {
                    filterMatch = com.truecaller.blocking.FilterMatch.m;
                }
                cu0.c cVar = new cu0.c(i3, 0, number, 0, "", false, 0L, 0L, contact, "", filterMatch, 1046656);
                cVar.n = ((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) callerIdPopupQaActivity.u0.getValue()).isChecked();
                cVar.p = isChecked;
                kVar.e(cVar);
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) callerIdPopupQaActivity.z0.getValue()).isChecked()) {
                    new android.os.Handler().postDelayed(new g7.qux(9, callerIdPopupQaActivity, kVar), 1000L);
                }
                return kotlin.Unit.a;
            }
        }
        aVar = new hu0.a(callerIdPopupQaActivity, quxVar);
        java.lang.Object obj2 = aVar.z;
        ef3.bar barVar2 = ef3.bar.a;
        i = aVar.B;
        if (i == 0) {
        }
        com.truecaller.data.entity.Contact contact2 = (com.truecaller.data.entity.Contact) obj2;
        boolean isChecked2 = ((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) callerIdPopupQaActivity.H0.getValue()).isChecked();
        int i32 = !((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) callerIdPopupQaActivity.D0.getValue()).isChecked() ? 1 : 0;
        if (!((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) callerIdPopupQaActivity.E0.getValue()).isChecked()) {
        }
        cu0.c cVar2 = new cu0.c(i32, 0, number, 0, "", false, 0L, 0L, contact2, "", filterMatch, 1046656);
        cVar2.n = ((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) callerIdPopupQaActivity.u0.getValue()).isChecked();
        cVar2.p = isChecked2;
        kVar.e(cVar2);
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) callerIdPopupQaActivity.z0.getValue()).isChecked()) {
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.callerid.window.Hilt_CallerIdPopupQaActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        u03.c cVar = this.I0;
        if (cVar != null) {
            if (!cVar.v()) {
                if (this.I0 != null) {
                    finish();
                } else {
                    kotlin.jvm.internal.Intrinsics.n("deviceInfoUtil");
                    throw null;
                }
            }
            yy.qux.C(this, 2);
            setContentView(2131558454);
            ((android.widget.Button) this.A0.getValue()).setOnClickListener(new gr2.bar(this, 10));
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("deviceInfoUtil");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00ae, code lost:
    
        if (r1 == r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object u0(ff3.qux quxVar) {
        hu0.baz bazVar;
        int i;
        kotlin.Lazy lazy;
        com.truecaller.data.entity.Contact contact;
        com.truecaller.data.entity.Contact contact2;
        com.truecaller.data.entity.Contact contact3;
        if (quxVar instanceof hu0.baz) {
            bazVar = (hu0.baz) quxVar;
            int i2 = bazVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bazVar.B = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bazVar.z;
                ef3.bar barVar = ef3.bar.a;
                i = bazVar.B;
                lazy = this.n0;
                kotlin.Lazy lazy2 = this.G0;
                df3.bar barVar2 = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            contact3 = bazVar.y;
                            od.p.E(obj);
                            contact = contact3;
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.p0.getValue()).isChecked()) {
                                contact.a0(new java.lang.Integer(contact.t + 64));
                                contact.Q = v0("True Software Scandinavia AB");
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.w0.getValue()).isChecked()) {
                                contact.a0(new java.lang.Integer(contact.t + 128));
                                contact.Q = v0("True Software Scandinavia AB");
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.x0.getValue()).isChecked()) {
                                contact.a0(new java.lang.Integer(contact.t + 1024));
                                contact.Q = v0("True Software Scandinavia AB");
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.k0.getValue()).isChecked()) {
                                contact.I = v0("Alan Mamedi");
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.g0.getValue()).isChecked()) {
                                contact.L = v0("Bruce Wayne");
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.j0.getValue()).isChecked()) {
                                contact.Q = v0("True Software Scandinavia AB");
                                contact.P = v0("CEO");
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.f0.getValue()).isChecked()) {
                                contact.a(qk3.p.p(1407, v0("Stockholm"), "SE"));
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.h0.getValue()).isChecked()) {
                                contact.O = "https://storage.googleapis.com/tc-images-eu/myview/1/e9118ec2a5b4fdf1ab572ab98362bd74/3";
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.o0.getValue()).isChecked()) {
                                com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields = new com.truecaller.contact.entity.model.DataEntityPrimaryFields(null, null, false, null, null);
                                sf3.a.a.getClass();
                                contact.d(new com.truecaller.contact.entity.model.TagEntity(dataEntityPrimaryFields, java.lang.String.valueOf(sf3.a.b.e(1, 12))));
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.B0.getValue()).isChecked()) {
                                contact.a(qk3.p.p(383, v0("India"), "IN"));
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.s0.getValue()).isChecked()) {
                                contact.j0 = com.truecaller.data.entity.PremiumLevel.REGULAR;
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.q0.getValue()).isChecked()) {
                                contact.j0 = com.truecaller.data.entity.PremiumLevel.GOLD;
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.y0.getValue()).isChecked()) {
                                contact.a0(new java.lang.Integer(contact.t + 2));
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.v0.getValue()).isChecked()) {
                                contact.B = "SPAMMER";
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) lazy.getValue()).isChecked()) {
                                contact.j0(new java.lang.Integer(123));
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.m0.getValue()).isChecked()) {
                                contact.D = kotlin.collections.x.c(new java.lang.Long(1L));
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.t0.getValue()).isChecked()) {
                                contact.a0(new java.lang.Integer(contact.t + 16));
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.r0.getValue()).isChecked()) {
                                contact.g0(new java.lang.Long(1234L));
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.l0.getValue()).isChecked()) {
                                contact.f.add(new com.truecaller.contact.entity.model.SearchWarningEntity(null, "3", kotlin.collections.h0.a, "rule", "123", 1, null));
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.i0.getValue()).isChecked()) {
                                java.util.List c = kotlin.collections.x.c(new com.truecaller.contact.entity.model.BusinessProfileEntity.MediaCallerId("1234", "https://storage.googleapis.com/tc-priority-public/19e57be7-cc00-4e4d-9d4a-17ad4b8f5d3d;Video;Landscape;2521823400000|", "Video", "Landscape", 2521823400000L));
                                kotlin.collections.h0 h0Var = kotlin.collections.h0.a;
                                contact.w = new com.truecaller.contact.entity.model.BusinessProfileEntity(null, c, h0Var, h0Var, null, h0Var, null, 65, null);
                            }
                            contact.e0(java.lang.Boolean.valueOf(((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) lazy2.getValue()).isChecked()));
                            return contact;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    contact = bazVar.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    contact = new com.truecaller.data.entity.Contact();
                    com.truecaller.data.entity.Number number = new com.truecaller.data.entity.Number();
                    java.lang.String str = this.e0;
                    number.f = str;
                    number.h = str;
                    number.i = new java.lang.Integer(46);
                    number.d = v0("Mobile carrier");
                    number.e = "SE";
                    number.j(com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE);
                    number.m = new java.lang.Integer(2);
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) lazy.getValue()).isChecked()) {
                        number.k = 123;
                    }
                    contact.c(number);
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) lazy2.getValue()).isChecked()) {
                        ng3.a aVar = fg3.r0.b;
                        fi2.g gVar = new fi2.g(this, (df3.bar) null, 26);
                        bazVar.x = contact;
                        bazVar.B = 1;
                        obj = fg3.h0.W(aVar, gVar, bazVar);
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.p0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.w0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.x0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.k0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.g0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.j0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.f0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.h0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.o0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.B0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.s0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.q0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.y0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.v0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) lazy.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.m0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.t0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.r0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.l0.getValue()).isChecked()) {
                    }
                    if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.i0.getValue()).isChecked()) {
                    }
                    contact.e0(java.lang.Boolean.valueOf(((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) lazy2.getValue()).isChecked()));
                    return contact;
                }
                contact2 = (com.truecaller.data.entity.Contact) obj;
                if (contact2 != null) {
                    wz1.bar barVar3 = this.K0;
                    if (barVar3 != null) {
                        boolean isChecked = ((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) lazy2.getValue()).isChecked();
                        bazVar.x = null;
                        bazVar.y = contact2;
                        bazVar.B = 2;
                        if (fg3.h0.W(barVar3.a, new a00.b(barVar3, contact2, isChecked, barVar2, 22), bazVar) != barVar) {
                            contact3 = contact2;
                            contact = contact3;
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.p0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.w0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.x0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.k0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.g0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.j0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.f0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.h0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.o0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.B0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.s0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.q0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.y0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.v0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) lazy.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.m0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.t0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.r0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.l0.getValue()).isChecked()) {
                            }
                            if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.i0.getValue()).isChecked()) {
                            }
                            contact.e0(java.lang.Boolean.valueOf(((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) lazy2.getValue()).isChecked()));
                            return contact;
                        }
                        return barVar;
                    }
                    kotlin.jvm.internal.Intrinsics.n("manualCallerIdManager");
                    throw null;
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.p0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.w0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.x0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.k0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.g0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.j0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.f0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.h0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.o0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.B0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.s0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.q0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.y0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.v0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) lazy.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.m0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.t0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.r0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.l0.getValue()).isChecked()) {
                }
                if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.i0.getValue()).isChecked()) {
                }
                contact.e0(java.lang.Boolean.valueOf(((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) lazy2.getValue()).isChecked()));
                return contact;
            }
        }
        bazVar = new hu0.baz(this, quxVar);
        java.lang.Object obj2 = bazVar.z;
        ef3.bar barVar4 = ef3.bar.a;
        i = bazVar.B;
        lazy = this.n0;
        kotlin.Lazy lazy22 = this.G0;
        df3.bar barVar22 = null;
        if (i == 0) {
        }
        contact2 = (com.truecaller.data.entity.Contact) obj2;
        if (contact2 != null) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.p0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.w0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.x0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.k0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.g0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.j0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.f0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.h0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.o0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.B0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.s0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.q0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.y0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.v0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) lazy.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.m0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.t0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.r0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.l0.getValue()).isChecked()) {
        }
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.i0.getValue()).isChecked()) {
        }
        contact.e0(java.lang.Boolean.valueOf(((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) lazy22.getValue()).isChecked()));
        return contact;
    }

    public final java.lang.String v0(java.lang.String str) {
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.C0.getValue()).isChecked()) {
            return this.d0;
        }
        return str;
    }
}
