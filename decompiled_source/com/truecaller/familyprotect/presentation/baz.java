package com.truecaller.familyprotect.presentation;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class baz extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod A;
    public final /* synthetic */ java.lang.String B;
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.familyprotect.presentation.FamilyGroupMainActivity z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ baz(com.truecaller.familyprotect.presentation.FamilyGroupMainActivity familyGroupMainActivity, com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod shareTextClickHandler$DeliveryMethod, java.lang.String str, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = familyGroupMainActivity;
        this.A = shareTextClickHandler$DeliveryMethod;
        this.B = str;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.familyprotect.presentation.baz(this.z, this.A, this.B, barVar, 0);
            default:
                return new com.truecaller.familyprotect.presentation.baz(this.z, this.A, this.B, barVar, 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.content.Context, com.truecaller.familyprotect.presentation.FamilyGroupMainActivity] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.truecaller.familyprotect.presentation.FamilyGroupMainActivity, android.app.Activity] */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        java.lang.Object obj2 = ef3.bar.a;
        switch (i) {
            case 0:
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ?? r1 = this.z;
                    to1.e eVar = r1.f0;
                    if (eVar != 0) {
                        com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$Type shareTextClickHandler$Type = com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$Type.DOWNLOAD_LINK;
                        a8.l lVar = r1.h0;
                        if (lVar != null) {
                            java.lang.String string = lVar.a.getString(2132021048, "https://play.google.com/store/apps/details?id=com.truecaller", "https://apps.apple.com/us/app/truecaller-premium-caller-id/id448142450");
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            com.truecaller.familyprotect.api.navigation.FamilyProtectLaunchContext familyProtectLaunchContext = com.truecaller.familyprotect.api.navigation.FamilyProtectLaunchContext.FP_DOWNLOAD_LINK_BOTTOM_SHEET;
                            this.y = 1;
                            if (eVar.n(r1, shareTextClickHandler$Type, this.A, this.B, string, familyProtectLaunchContext, this) == obj2) {
                                return obj2;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("appShareHelper");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("shareTextClickHandler");
                        throw null;
                    }
                }
                return kotlin.Unit.a;
            default:
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ?? r0 = this.z;
                    p7.bar barVar = r0.g0;
                    if (barVar != null) {
                        java.lang.String string2 = r0.getString(2132021184, barVar.p());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        to1.e eVar2 = r0.f0;
                        if (eVar2 != null) {
                            com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$Type shareTextClickHandler$Type2 = com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$Type.INVITE_REMINDER;
                            com.truecaller.familyprotect.api.navigation.FamilyProtectLaunchContext familyProtectLaunchContext2 = com.truecaller.familyprotect.api.navigation.FamilyProtectLaunchContext.FP_REMINDER_BOTTOM_SHEET_ADMIN_CENTER_ACTION;
                            this.y = 1;
                            if (eVar2.n(this.z, shareTextClickHandler$Type2, this.A, this.B, string2, familyProtectLaunchContext2, this) == obj2) {
                                return obj2;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("shareTextClickHandler");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("remindPendingMemberDeeplinkProvider");
                        throw null;
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
