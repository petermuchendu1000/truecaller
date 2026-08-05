package com.truecaller.call_assistant.campaigns.display;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class b implements com.truecaller.call_assistant.campaigns.display.a {
    public final im0.bar a;
    public final gm0.bar b;
    public final c71.k c;
    public final lf2.r d;
    public final qc3.bar e;
    public fg3.k0 f;

    public b(im0.bar barVar, gm0.bar barVar2, c71.k kVar, lf2.r rVar, qc3.bar barVar3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "popupsDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "interstitialsDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "assistantBannersRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "validCampaignViewIdProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "campaignsSyncer");
        this.a = barVar;
        this.b = barVar2;
        this.c = kVar;
        this.d = rVar;
        this.e = barVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        if (e(r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen displayInScreen, ff3.qux quxVar) {
        om0.qux quxVar2;
        java.lang.Object obj;
        int i;
        if (quxVar instanceof om0.qux) {
            quxVar2 = (om0.qux) quxVar;
            int i2 = quxVar2.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                quxVar2.A = i2 - Integer.MIN_VALUE;
                obj = quxVar2.y;
                java.lang.Object obj2 = ef3.bar.a;
                i = quxVar2.A;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    od.p.E(obj);
                                    com.truecaller.call_assistant.campaigns.data.db.banners.AssistantBannerEntity assistantBannerEntity = (com.truecaller.call_assistant.campaigns.data.db.banners.AssistantBannerEntity) obj;
                                    if (assistantBannerEntity != null) {
                                        return em0.bar.a(assistantBannerEntity);
                                    }
                                    return null;
                                }
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            od.p.E(obj);
                            um0.bar barVar = (um0.bar) obj;
                            if (barVar != null) {
                                java.lang.String str = barVar.a;
                                quxVar2.x = null;
                                quxVar2.A = 4;
                                obj = this.c.q(str, quxVar2);
                            }
                            return null;
                        }
                        displayInScreen = quxVar2.x;
                        od.p.E(obj);
                        quxVar2.x = null;
                        quxVar2.A = 3;
                        obj = this.d.r(displayInScreen, quxVar2);
                    } else {
                        displayInScreen = quxVar2.x;
                        od.p.E(obj);
                    }
                } else {
                    od.p.E(obj);
                    qm0.qux quxVar3 = (qm0.qux) this.e.get();
                    quxVar2.x = displayInScreen;
                    quxVar2.A = 1;
                    obj = quxVar3.b(quxVar2);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    quxVar2.x = displayInScreen;
                    quxVar2.A = 2;
                }
                quxVar2.x = null;
                quxVar2.A = 3;
                obj = this.d.r(displayInScreen, quxVar2);
            }
        }
        quxVar2 = new om0.qux(this, quxVar);
        obj = quxVar2.y;
        java.lang.Object obj22 = ef3.bar.a;
        i = quxVar2.A;
        if (i == 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
        quxVar2.x = null;
        quxVar2.A = 3;
        obj = this.d.r(displayInScreen, quxVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
    
        if (r12 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        if (r12 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:
    
        if (r12 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007d, code lost:
    
        if (e(r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0069, code lost:
    
        if (r12 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen displayInScreen, ff3.qux quxVar) {
        om0.a aVar;
        java.lang.Object obj;
        int i;
        um0.bar barVar;
        com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Popup a;
        com.truecaller.call_assistant.campaigns.display.AssistantCampaignViewDisplayData.Interstitial a2;
        if (quxVar instanceof om0.a) {
            aVar = (om0.a) quxVar;
            int i2 = aVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.B = i2 - Integer.MIN_VALUE;
                obj = aVar.z;
                java.lang.Object obj2 = ef3.bar.a;
                i = aVar.B;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5) {
                                        barVar = aVar.y;
                                        od.p.E(obj);
                                        com.truecaller.call_assistant.campaigns.data.db.interstitials.AssistantInterstitialEntity assistantInterstitialEntity = (com.truecaller.call_assistant.campaigns.data.db.interstitials.AssistantInterstitialEntity) obj;
                                        if (assistantInterstitialEntity != null && (a2 = gm0.baz.a(assistantInterstitialEntity)) != null) {
                                            return a2;
                                        }
                                        com.truecaller.call_assistant.campaigns.util.DebugUtilsKt.a("Couldn't find interstitial with id: " + barVar.a);
                                        return null;
                                    }
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                barVar = aVar.y;
                                od.p.E(obj);
                                com.truecaller.call_assistant.campaigns.data.db.popups.AssistantPopupEntity assistantPopupEntity = (com.truecaller.call_assistant.campaigns.data.db.popups.AssistantPopupEntity) obj;
                                if (assistantPopupEntity != null && (a = im0.baz.a(assistantPopupEntity)) != null) {
                                    return a;
                                }
                                com.truecaller.call_assistant.campaigns.util.DebugUtilsKt.a("Couldn't find popup with id: " + barVar.a);
                                return null;
                            }
                            od.p.E(obj);
                            barVar = (um0.bar) obj;
                            if (barVar != null) {
                                java.lang.String str = barVar.a;
                                int i3 = om0.baz.a[barVar.h.ordinal()];
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        if (i3 != 3) {
                                            throw new java.lang.RuntimeException();
                                        }
                                    } else {
                                        aVar.x = null;
                                        aVar.y = barVar;
                                        aVar.B = 5;
                                        obj = this.b.a(str, aVar);
                                    }
                                } else {
                                    aVar.x = null;
                                    aVar.y = barVar;
                                    aVar.B = 4;
                                    obj = this.a.a(str, aVar);
                                }
                                return obj2;
                            }
                            return null;
                        }
                        displayInScreen = aVar.x;
                        od.p.E(obj);
                        aVar.x = null;
                        aVar.B = 3;
                        obj = this.d.s(displayInScreen, aVar);
                    } else {
                        displayInScreen = aVar.x;
                        od.p.E(obj);
                    }
                } else {
                    od.p.E(obj);
                    qm0.qux quxVar2 = (qm0.qux) this.e.get();
                    aVar.x = displayInScreen;
                    aVar.B = 1;
                    obj = quxVar2.b(aVar);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    aVar.x = displayInScreen;
                    aVar.B = 2;
                }
                aVar.x = null;
                aVar.B = 3;
                obj = this.d.s(displayInScreen, aVar);
            }
        }
        aVar = new om0.a(this, quxVar);
        obj = aVar.z;
        java.lang.Object obj22 = ef3.bar.a;
        i = aVar.B;
        if (i == 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
        aVar.x = null;
        aVar.B = 3;
        obj = this.d.s(displayInScreen, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        if (r14 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f4, code lost:
    
        if (r14 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (r14 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0076, code lost:
    
        if (r14 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(java.lang.String str, com.truecaller.call_assistant.campaigns.data.CampaignViewType campaignViewType, com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen displayInScreen, ff3.qux quxVar) {
        om0.b bVar;
        java.lang.Object obj;
        int i;
        java.lang.String str2;
        com.truecaller.call_assistant.campaigns.data.CampaignViewType campaignViewType2;
        java.lang.String str3;
        com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen displayInScreen2;
        if (quxVar instanceof om0.b) {
            bVar = (om0.b) quxVar;
            int i2 = bVar.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.C = i2 - Integer.MIN_VALUE;
                obj = bVar.A;
                java.lang.Object obj2 = ef3.bar.a;
                i = bVar.C;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5) {
                                        od.p.E(obj);
                                        com.truecaller.call_assistant.campaigns.data.db.interstitials.AssistantInterstitialEntity assistantInterstitialEntity = (com.truecaller.call_assistant.campaigns.data.db.interstitials.AssistantInterstitialEntity) obj;
                                        if (assistantInterstitialEntity != null) {
                                            return gm0.baz.a(assistantInterstitialEntity);
                                        }
                                        return null;
                                    }
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                od.p.E(obj);
                                com.truecaller.call_assistant.campaigns.data.db.popups.AssistantPopupEntity assistantPopupEntity = (com.truecaller.call_assistant.campaigns.data.db.popups.AssistantPopupEntity) obj;
                                if (assistantPopupEntity != null) {
                                    return im0.baz.a(assistantPopupEntity);
                                }
                                return null;
                            }
                            campaignViewType2 = bVar.y;
                            str2 = bVar.x;
                            od.p.E(obj);
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                int i3 = om0.baz.a[campaignViewType2.ordinal()];
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        if (i3 != 3) {
                                            throw new java.lang.RuntimeException();
                                        }
                                    } else {
                                        bVar.x = null;
                                        bVar.y = null;
                                        bVar.z = null;
                                        bVar.C = 5;
                                        obj = this.b.a(str2, bVar);
                                    }
                                } else {
                                    bVar.x = null;
                                    bVar.y = null;
                                    bVar.z = null;
                                    bVar.C = 4;
                                    obj = this.a.a(str2, bVar);
                                }
                                return obj2;
                            }
                            return null;
                        }
                        displayInScreen2 = bVar.z;
                        campaignViewType = bVar.y;
                        str3 = bVar.x;
                        od.p.E(obj);
                        java.lang.String str4 = str3;
                        displayInScreen = displayInScreen2;
                        campaignViewType2 = campaignViewType;
                        str2 = str4;
                        bVar.x = str2;
                        bVar.y = campaignViewType2;
                        bVar.z = null;
                        bVar.C = 3;
                        obj = this.d.K(str2, campaignViewType2, displayInScreen, bVar);
                    } else {
                        displayInScreen = bVar.z;
                        campaignViewType = bVar.y;
                        str = bVar.x;
                        od.p.E(obj);
                    }
                } else {
                    od.p.E(obj);
                    qm0.qux quxVar2 = (qm0.qux) this.e.get();
                    bVar.x = str;
                    bVar.y = campaignViewType;
                    bVar.z = displayInScreen;
                    bVar.C = 1;
                    obj = quxVar2.b(bVar);
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    bVar.x = str;
                    bVar.y = campaignViewType;
                    bVar.z = displayInScreen;
                    bVar.C = 2;
                    if (e(bVar) != obj2) {
                        com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen displayInScreen3 = displayInScreen;
                        str3 = str;
                        displayInScreen2 = displayInScreen3;
                        java.lang.String str42 = str3;
                        displayInScreen = displayInScreen2;
                        campaignViewType2 = campaignViewType;
                        str2 = str42;
                        bVar.x = str2;
                        bVar.y = campaignViewType2;
                        bVar.z = null;
                        bVar.C = 3;
                        obj = this.d.K(str2, campaignViewType2, displayInScreen, bVar);
                    }
                    return obj2;
                }
                com.truecaller.call_assistant.campaigns.data.CampaignViewType campaignViewType3 = campaignViewType;
                str2 = str;
                campaignViewType2 = campaignViewType3;
                bVar.x = str2;
                bVar.y = campaignViewType2;
                bVar.z = null;
                bVar.C = 3;
                obj = this.d.K(str2, campaignViewType2, displayInScreen, bVar);
            }
        }
        bVar = new om0.b(this, quxVar);
        obj = bVar.A;
        java.lang.Object obj22 = ef3.bar.a;
        i = bVar.C;
        if (i == 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x005a, code lost:
    
        if (r10 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0074, code lost:
    
        if (r10 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
    
        if (r10 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(java.lang.String str, com.truecaller.call_assistant.campaigns.data.CampaignViewType campaignViewType, com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen displayInScreen, ff3.qux quxVar) {
        om0.c cVar;
        int i;
        if (quxVar instanceof om0.c) {
            cVar = (om0.c) quxVar;
            int i2 = cVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = cVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = cVar.z;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                od.p.E(obj);
                                com.truecaller.call_assistant.campaigns.data.db.banners.AssistantBannerEntity assistantBannerEntity = (com.truecaller.call_assistant.campaigns.data.db.banners.AssistantBannerEntity) obj;
                                if (assistantBannerEntity != null) {
                                    return em0.bar.a(assistantBannerEntity);
                                }
                                return null;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.p.E(obj);
                        com.truecaller.call_assistant.campaigns.data.db.interstitials.AssistantInterstitialEntity assistantInterstitialEntity = (com.truecaller.call_assistant.campaigns.data.db.interstitials.AssistantInterstitialEntity) obj;
                        if (assistantInterstitialEntity != null) {
                            return gm0.baz.a(assistantInterstitialEntity);
                        }
                        return null;
                    }
                    od.p.E(obj);
                    com.truecaller.call_assistant.campaigns.data.db.popups.AssistantPopupEntity assistantPopupEntity = (com.truecaller.call_assistant.campaigns.data.db.popups.AssistantPopupEntity) obj;
                    if (assistantPopupEntity != null) {
                        return im0.baz.a(assistantPopupEntity);
                    }
                    return null;
                }
                od.p.E(obj);
                if (displayInScreen == com.truecaller.call_assistant.campaigns.validation.displayin.DisplayInScreen.QA_MENU) {
                    int i3 = om0.baz.a[campaignViewType.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                cVar.z = 3;
                                obj = this.c.q(str, cVar);
                            } else {
                                throw new java.lang.RuntimeException();
                            }
                        } else {
                            cVar.z = 2;
                            obj = this.b.a(str, cVar);
                        }
                    } else {
                        cVar.z = 1;
                        obj = this.a.a(str, cVar);
                    }
                    return barVar;
                }
                throw new java.lang.IllegalArgumentException("getItemPreviewById can be called only from QA_MENU screen");
            }
        }
        cVar = new om0.c(this, quxVar);
        java.lang.Object obj2 = cVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = cVar.z;
        if (i == 0) {
        }
    }

    public final java.lang.Object e(ff3.qux quxVar) {
        java.lang.Object q = fg3.h0.q(new ob2.n(this, (df3.bar) null, 6), quxVar);
        if (q == ef3.bar.a) {
            return q;
        }
        return kotlin.Unit.a;
    }
}
