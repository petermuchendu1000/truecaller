package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class i1 {
    public final com.truecaller.ads.util.PartnerQPSStatus a(java.util.List list) {
        java.lang.Object obj;
        com.truecaller.ads.util.PartnerQPSStatus partnerQPSStatus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "config");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                com.truecaller.ads.mediation.model.PartnerQpsConfig partnerQpsConfig = (com.truecaller.ads.mediation.model.PartnerQpsConfig) obj;
                java.time.LocalTime m = com.google.android.gms.internal.ads.c5.m();
                int startHour = partnerQpsConfig.getStartHour();
                int endHour = partnerQpsConfig.getEndHour();
                int c = com.google.android.gms.internal.ads.c5.c(m);
                int startHour2 = partnerQpsConfig.getStartHour();
                int endHour2 = partnerQpsConfig.getEndHour();
                java.lang.StringBuilder e = z0.a0.e(c, startHour2, "PartnerQps- cHour: ", ", start: ", ", end: ");
                e.append(endHour2);
                e.append(" -> ");
                e.append(endHour);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e.toString(), com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
                kotlin.Unit unit = kotlin.Unit.a;
                int c2 = com.google.android.gms.internal.ads.c5.c(m);
                if (startHour <= c2 && c2 <= endHour) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.truecaller.ads.mediation.model.PartnerQpsConfig partnerQpsConfig2 = (com.truecaller.ads.mediation.model.PartnerQpsConfig) obj;
        if (partnerQpsConfig2 == null) {
            partnerQPSStatus = com.truecaller.ads.util.PartnerQPSStatus.PARTNER_NOT_IN_TIME_RANGE;
        } else {
            int percentage = partnerQpsConfig2.getPercentage();
            sf3.a.a.getClass();
            int e2 = sf3.a.b.e(0, 100);
            java.lang.StringBuilder e3 = z0.a0.e(e2, percentage, "PartnerQps- randomValue: ", " and percentage: ", " -> ");
            e3.append(percentage);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e3.toString(), com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
            kotlin.Unit unit2 = kotlin.Unit.a;
            if (e2 <= percentage) {
                partnerQPSStatus = com.truecaller.ads.util.PartnerQPSStatus.PARTNER_SELECTED;
            } else {
                partnerQPSStatus = com.truecaller.ads.util.PartnerQPSStatus.PARTNER_IN_TIME_RANGE_BUT_NOT_SELECTED;
            }
        }
        uf.qux.r("PartnerQps- status: ", partnerQPSStatus.name(), com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        kotlin.Unit unit3 = kotlin.Unit.a;
        return partnerQPSStatus;
    }
}
