package com.truecaller.ads.domain.core.clickguard;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class qux {
    public final com.truecaller.ads.domain.core.clickguard.baz a;

    public qux(com.truecaller.ads.domain.core.clickguard.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "clickGuardConfigProvider");
        this.a = bazVar;
    }

    public final c30.i a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.Object obj;
        java.util.List list = (java.util.List) this.a.b.getValue();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    com.truecaller.ads.domain.core.clickguard.AdClickGuardConfigProviderImpl$ClickGuardConfigEntry adClickGuardConfigProviderImpl$ClickGuardConfigEntry = (com.truecaller.ads.domain.core.clickguard.AdClickGuardConfigProviderImpl$ClickGuardConfigEntry) obj;
                    if (adClickGuardConfigProviderImpl$ClickGuardConfigEntry.getEnable() && com.truecaller.ads.domain.core.clickguard.baz.a(str, adClickGuardConfigProviderImpl$ClickGuardConfigEntry.getPlacements()) && com.truecaller.ads.domain.core.clickguard.baz.a(str3, adClickGuardConfigProviderImpl$ClickGuardConfigEntry.getPartners()) && com.truecaller.ads.domain.core.clickguard.baz.a(str2, adClickGuardConfigProviderImpl$ClickGuardConfigEntry.getAdTypes())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            com.truecaller.ads.domain.core.clickguard.AdClickGuardConfigProviderImpl$ClickGuardConfigEntry adClickGuardConfigProviderImpl$ClickGuardConfigEntry2 = (com.truecaller.ads.domain.core.clickguard.AdClickGuardConfigProviderImpl$ClickGuardConfigEntry) obj;
            if (adClickGuardConfigProviderImpl$ClickGuardConfigEntry2 != null) {
                return new c30.i(new c30.k(adClickGuardConfigProviderImpl$ClickGuardConfigEntry2.getClickGuard().getRow(), adClickGuardConfigProviderImpl$ClickGuardConfigEntry2.getClickGuard().getColumn()), adClickGuardConfigProviderImpl$ClickGuardConfigEntry2.getClickGuard().getToolTip(), oj3.e.P(adClickGuardConfigProviderImpl$ClickGuardConfigEntry2.getClickGuard().getUnsafeCells()), adClickGuardConfigProviderImpl$ClickGuardConfigEntry2.getIntervalInMs());
            }
        }
        return null;
    }
}
