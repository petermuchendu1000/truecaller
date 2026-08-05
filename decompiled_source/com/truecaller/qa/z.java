package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class z extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public /* synthetic */ java.lang.Object y;
    public final /* synthetic */ kotlin.jvm.internal.j0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(kotlin.jvm.internal.j0 j0Var, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = j0Var;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                com.truecaller.qa.z zVar = new com.truecaller.qa.z(this.z, barVar, 0);
                zVar.y = obj;
                return zVar;
            case 1:
                com.truecaller.qa.z zVar2 = new com.truecaller.qa.z(this.z, barVar, 1);
                zVar2.y = obj;
                return zVar2;
            case 2:
                com.truecaller.qa.z zVar3 = new com.truecaller.qa.z(this.z, barVar, 2);
                zVar3.y = obj;
                return zVar3;
            case 3:
                com.truecaller.qa.z zVar4 = new com.truecaller.qa.z(this.z, barVar, 3);
                zVar4.y = obj;
                return zVar4;
            case 4:
                com.truecaller.qa.z zVar5 = new com.truecaller.qa.z(this.z, barVar, 4);
                zVar5.y = obj;
                return zVar5;
            case 5:
                com.truecaller.qa.z zVar6 = new com.truecaller.qa.z(this.z, barVar, 5);
                zVar6.y = obj;
                return zVar6;
            case 6:
                com.truecaller.qa.z zVar7 = new com.truecaller.qa.z(this.z, barVar, 6);
                zVar7.y = obj;
                return zVar7;
            case 7:
                com.truecaller.qa.z zVar8 = new com.truecaller.qa.z(this.z, barVar, 7);
                zVar8.y = obj;
                return zVar8;
            case 8:
                com.truecaller.qa.z zVar9 = new com.truecaller.qa.z(this.z, barVar, 8);
                zVar9.y = obj;
                return zVar9;
            case 9:
                com.truecaller.qa.z zVar10 = new com.truecaller.qa.z(this.z, barVar, 9);
                zVar10.y = obj;
                return zVar10;
            case 10:
                com.truecaller.qa.z zVar11 = new com.truecaller.qa.z(this.z, barVar, 10);
                zVar11.y = obj;
                return zVar11;
            case 11:
                com.truecaller.qa.z zVar12 = new com.truecaller.qa.z(this.z, barVar, 11);
                zVar12.y = obj;
                return zVar12;
            case 12:
                com.truecaller.qa.z zVar13 = new com.truecaller.qa.z(this.z, barVar, 12);
                zVar13.y = obj;
                return zVar13;
            case 13:
                com.truecaller.qa.z zVar14 = new com.truecaller.qa.z(this.z, barVar, 13);
                zVar14.y = obj;
                return zVar14;
            case 14:
                com.truecaller.qa.z zVar15 = new com.truecaller.qa.z(this.z, barVar, 14);
                zVar15.y = obj;
                return zVar15;
            default:
                com.truecaller.qa.z zVar16 = new com.truecaller.qa.z(this.z, barVar, 15);
                zVar16.y = obj;
                return zVar16;
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.x) {
            case 0:
                return create((java.lang.String) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create((com.truecaller.settings.api.SettingsCategory) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 2:
                return create((com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 3:
                return create((java.lang.String) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 4:
                return create((java.lang.String) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 5:
                return create((java.lang.String) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 6:
                return create((java.lang.String) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 7:
                return create((y7.baz) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 8:
                return create((java.lang.String) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 9:
                return create((java.lang.String) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 10:
                return create((java.lang.String) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 11:
                return create((java.lang.String) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 12:
                return create((java.lang.String) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 13:
                return create((java.lang.String) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 14:
                return create((java.lang.String) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            default:
                return create((java.lang.String) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.x;
        kotlin.jvm.internal.j0 j0Var = this.z;
        switch (i6) {
            case 0:
                java.lang.String str = (java.lang.String) this.y;
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                j0Var.a = str;
                return kotlin.Unit.a;
            case 1:
                com.truecaller.settings.api.SettingsCategory settingsCategory = (com.truecaller.settings.api.SettingsCategory) this.y;
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                j0Var.a = settingsCategory;
                return kotlin.Unit.a;
            case 2:
                com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage referralNameSuggestionImage = (com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage) this.y;
                ef3.bar barVar3 = ef3.bar.a;
                od.p.E(obj);
                j0Var.a = ej2.qux.a((ej2.qux) j0Var.a, referralNameSuggestionImage, null, null, null, null, null, 1021);
                return kotlin.Unit.a;
            case 3:
                java.lang.String str2 = (java.lang.String) this.y;
                ef3.bar barVar4 = ef3.bar.a;
                od.p.E(obj);
                if (str2.length() == 0) {
                    return kotlin.Unit.a;
                }
                j0Var.a = ej2.qux.a((ej2.qux) j0Var.a, null, str2, null, null, null, null, 1019);
                return kotlin.Unit.a;
            case 4:
                java.lang.String str3 = (java.lang.String) this.y;
                ef3.bar barVar5 = ef3.bar.a;
                od.p.E(obj);
                if (str3.length() == 0) {
                    return kotlin.Unit.a;
                }
                j0Var.a = ej2.qux.a((ej2.qux) j0Var.a, null, null, str3, null, null, null, 1007);
                return kotlin.Unit.a;
            case 5:
                java.lang.String str4 = (java.lang.String) this.y;
                ef3.bar barVar6 = ef3.bar.a;
                od.p.E(obj);
                if (str4.length() == 0) {
                    return kotlin.Unit.a;
                }
                j0Var.a = str4;
                return kotlin.Unit.a;
            case 6:
                java.lang.String str5 = (java.lang.String) this.y;
                ef3.bar barVar7 = ef3.bar.a;
                od.p.E(obj);
                j0Var.a = str5;
                return kotlin.Unit.a;
            case 7:
                y7.baz bazVar = (y7.baz) this.y;
                ef3.bar barVar8 = ef3.bar.a;
                od.p.E(obj);
                java.lang.Integer num = (java.lang.Integer) bazVar.b(wc0.c.b);
                int i7 = 0;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                java.lang.Integer num2 = (java.lang.Integer) bazVar.b(wc0.c.c);
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = 0;
                }
                java.lang.Integer num3 = (java.lang.Integer) bazVar.b(wc0.c.d);
                if (num3 != null) {
                    i3 = num3.intValue();
                } else {
                    i3 = 0;
                }
                java.lang.Integer num4 = (java.lang.Integer) bazVar.b(wc0.c.e);
                if (num4 != null) {
                    i4 = num4.intValue();
                } else {
                    i4 = 0;
                }
                java.lang.Integer num5 = (java.lang.Integer) bazVar.b(wc0.c.f);
                if (num5 != null) {
                    i5 = num5.intValue();
                } else {
                    i5 = 0;
                }
                java.lang.Integer num6 = (java.lang.Integer) bazVar.b(wc0.c.g);
                if (num6 != null) {
                    i7 = num6.intValue();
                }
                j0Var.a = new wc0.h(i, i2, i3, i4, i5, i7);
                bazVar.f();
                return kotlin.Unit.a;
            case 8:
                java.lang.String str6 = (java.lang.String) this.y;
                ef3.bar barVar9 = ef3.bar.a;
                od.p.E(obj);
                j0Var.a = str6;
                return kotlin.Unit.a;
            case 9:
                java.lang.String str7 = (java.lang.String) this.y;
                ef3.bar barVar10 = ef3.bar.a;
                od.p.E(obj);
                j0Var.a = str7;
                return kotlin.Unit.a;
            case 10:
                java.lang.String str8 = (java.lang.String) this.y;
                ef3.bar barVar11 = ef3.bar.a;
                od.p.E(obj);
                j0Var.a = str8;
                return kotlin.Unit.a;
            case 11:
                java.lang.String str9 = (java.lang.String) this.y;
                ef3.bar barVar12 = ef3.bar.a;
                od.p.E(obj);
                j0Var.a = str9;
                return kotlin.Unit.a;
            case 12:
                java.lang.String str10 = (java.lang.String) this.y;
                ef3.bar barVar13 = ef3.bar.a;
                od.p.E(obj);
                j0Var.a = str10;
                return kotlin.Unit.a;
            case 13:
                java.lang.String str11 = (java.lang.String) this.y;
                ef3.bar barVar14 = ef3.bar.a;
                od.p.E(obj);
                j0Var.a = str11;
                return kotlin.Unit.a;
            case 14:
                java.lang.String str12 = (java.lang.String) this.y;
                ef3.bar barVar15 = ef3.bar.a;
                od.p.E(obj);
                j0Var.a = str12;
                return kotlin.Unit.a;
            default:
                java.lang.String str13 = (java.lang.String) this.y;
                ef3.bar barVar16 = ef3.bar.a;
                od.p.E(obj);
                j0Var.a = str13;
                return kotlin.Unit.a;
        }
    }
}
