package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class p implements com.truecaller.wizard.verification.r0 {
    public final q73.qux a;

    public p(q73.qux quxVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "accountHelper");
        this.a = quxVar;
    }

    @Override // com.truecaller.wizard.verification.r0
    public final java.lang.Object a(yy.e1 e1Var, v73.f fVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.truecaller.wizard.verification.r0
    public final java.lang.Object b(com.truecaller.account.network.TokenResponseDto tokenResponseDto, java.lang.Long l, java.lang.String str, java.lang.String str2, df3.bar barVar) {
        java.lang.String v;
        int i;
        java.lang.Long parsedPhoneNumber = tokenResponseDto.getParsedPhoneNumber();
        if (parsedPhoneNumber != null) {
            l = parsedPhoneNumber;
        }
        if (l != null && (v = ze0.c0.v(l.longValue())) != null) {
            java.lang.String parsedCountryCode = tokenResponseDto.getParsedCountryCode();
            if (parsedCountryCode == null) {
                if (str == null) {
                    throw new java.lang.IllegalStateException();
                }
            } else {
                str = parsedCountryCode;
            }
            q73.qux quxVar = this.a;
            quxVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "normalizedPhoneNumber");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "countryIso");
            zx.bar barVar2 = new zx.bar(str, v);
            n11.o oVar = quxVar.f;
            boolean b = kotlin.jvm.internal.Intrinsics.b(oVar.i(), barVar2);
            if (!b) {
                f13.b bVar = oVar.b;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "secondaryPhoneNumber");
                java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = oVar.m;
                java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i = reentrantReadWriteLock.getReadHoldCount();
                } else {
                    i = 0;
                }
                for (int i3 = 0; i3 < i; i3++) {
                    readLock.unlock();
                }
                java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    n11.bar e = oVar.e();
                    if (e != null) {
                        bVar.n("secondary_country_code", barVar2.a);
                        bVar.n("secondary_normalized_number", barVar2.b);
                        oVar.m(n11.bar.a(e, (zx.bar) null, barVar2, 3));
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                    }
                    quxVar.e.j();
                } finally {
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            }
            if (kotlin.jvm.internal.Intrinsics.b(tokenResponseDto.getSuspended(), java.lang.Boolean.TRUE)) {
                quxVar.d(null);
            }
            if (!b) {
                return com.truecaller.wizard.verification.p0.a;
            }
            return com.truecaller.wizard.verification.n0.a;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.truecaller.wizard.verification.r0
    public final void c() {
    }

    @Override // com.truecaller.wizard.verification.r0
    public final java.lang.Object d(yy.e1 e1Var, java.lang.Long l, java.lang.String str, java.lang.String str2, df3.bar barVar) {
        throw new java.lang.UnsupportedOperationException();
    }
}
