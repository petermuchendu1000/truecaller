package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class p1 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public /* synthetic */ java.lang.Object y;
    public final /* synthetic */ com.truecaller.wizard.verification.s1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(com.truecaller.wizard.verification.s1 s1Var, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = s1Var;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                com.truecaller.wizard.verification.p1 p1Var = new com.truecaller.wizard.verification.p1(this.z, barVar, 0);
                p1Var.y = obj;
                return p1Var;
            case 1:
                com.truecaller.wizard.verification.p1 p1Var2 = new com.truecaller.wizard.verification.p1(this.z, barVar, 1);
                p1Var2.y = obj;
                return p1Var2;
            default:
                com.truecaller.wizard.verification.p1 p1Var3 = new com.truecaller.wizard.verification.p1(this.z, barVar, 2);
                p1Var3.y = obj;
                return p1Var3;
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.x) {
            case 0:
                return create((kotlin.Pair) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create((java.lang.String) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            default:
                return create((q93.h) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        r1.b("VerificationAutofillWhatsApp");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if (r4.equals("WhatsAppZeroTap") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        if (r4.equals("SmsRetrieverApi") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004b, code lost:
    
        if (r4.equals("SmsListener") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0071, code lost:
    
        r1.b("VerificationSmsOtpRead");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0054, code lost:
    
        if (r4.equals("WhatsAppAutofill") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        java.lang.String str = null;
        com.truecaller.wizard.verification.s1 s1Var = this.z;
        switch (i) {
            case 0:
                kotlin.Pair pair = (kotlin.Pair) this.y;
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                java.lang.Integer num = (java.lang.Integer) ((kotlin.Pair) pair.a).b;
                if (num != null) {
                    str = java.lang.String.valueOf(num.intValue());
                }
                s1Var.Y = str;
                return kotlin.Unit.a;
            case 1:
                java.lang.String str2 = (java.lang.String) this.y;
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                com.truecaller.wizard.verification.v1 v1Var = s1Var.f0;
                com.truecaller.wizard.verification.s sVar = v1Var.a;
                if (sVar instanceof com.truecaller.wizard.verification.r) {
                    com.truecaller.wizard.verification.r rVar = (com.truecaller.wizard.verification.r) sVar;
                    java.lang.String str3 = rVar.a;
                    long j = rVar.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "phoneNumber");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "otp");
                    s1Var.E2(com.truecaller.wizard.verification.v1.a(v1Var, new com.truecaller.wizard.verification.r(j, str3, str2), null, null, 6));
                } else if (sVar instanceof com.truecaller.wizard.verification.w1) {
                    com.truecaller.wizard.verification.w1 w1Var = (com.truecaller.wizard.verification.w1) sVar;
                    java.lang.String str4 = w1Var.a;
                    long j2 = w1Var.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "phoneNumber");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "otp");
                    s1Var.E2(com.truecaller.wizard.verification.v1.a(v1Var, new com.truecaller.wizard.verification.w1(j2, str4, str2), null, null, 6));
                }
                return kotlin.Unit.a;
            default:
                q93.h hVar = (q93.h) this.y;
                ef3.bar barVar3 = ef3.bar.a;
                od.p.E(obj);
                f43.baz bazVar = s1Var.n;
                java.lang.String str5 = s1Var.N;
                java.lang.String str6 = hVar.b;
                gd0.d dVar = (gd0.c) bazVar.e;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE);
                ((nc0.bar) bazVar.b).d(new n93.e(str6, "OtpRead", (java.lang.String) bazVar.f, (com.truecaller.wizard.WizardVerificationMode) bazVar.c, str5, null, null));
                switch (str6.hashCode()) {
                    case -1465834915:
                        break;
                    case -1385553431:
                        break;
                    case 749890404:
                        break;
                    case 943727885:
                        break;
                }
                if (((java.lang.Boolean) ((kotlin.Lazy) s1Var.A.g).getValue()).booleanValue()) {
                    s1Var.Y = hVar.c;
                }
                return kotlin.Unit.a;
        }
    }
}
