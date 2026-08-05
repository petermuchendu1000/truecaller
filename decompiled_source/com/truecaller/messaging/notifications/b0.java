package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class b0 implements java.util.Comparator {
    public final /* synthetic */ java.util.LinkedHashMap a;

    public b0(java.util.LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0066  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Long l;
        java.util.List list;
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Long valueOf = java.lang.Long.valueOf(((java.lang.Number) obj).longValue());
        java.util.LinkedHashMap linkedHashMap = this.a;
        java.util.List list2 = (java.util.List) linkedHashMap.get(valueOf);
        java.lang.Long l2 = null;
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            if (!it.hasNext()) {
                next2 = null;
            } else {
                next2 = it.next();
                if (it.hasNext()) {
                    long j = ((com.truecaller.messaging.data.types.Reaction) next2).e;
                    do {
                        java.lang.Object next3 = it.next();
                        long j2 = ((com.truecaller.messaging.data.types.Reaction) next3).e;
                        if (j > j2) {
                            next2 = next3;
                            j = j2;
                        }
                    } while (it.hasNext());
                }
            }
            com.truecaller.messaging.data.types.Reaction reaction = (com.truecaller.messaging.data.types.Reaction) next2;
            if (reaction != null) {
                l = java.lang.Long.valueOf(reaction.e);
                list = (java.util.List) linkedHashMap.get(java.lang.Long.valueOf(((java.lang.Number) obj2).longValue()));
                if (list != null) {
                    java.util.Iterator it2 = list.iterator();
                    if (!it2.hasNext()) {
                        next = null;
                    } else {
                        next = it2.next();
                        if (it2.hasNext()) {
                            long j3 = ((com.truecaller.messaging.data.types.Reaction) next).e;
                            do {
                                java.lang.Object next4 = it2.next();
                                long j4 = ((com.truecaller.messaging.data.types.Reaction) next4).e;
                                if (j3 > j4) {
                                    next = next4;
                                    j3 = j4;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    com.truecaller.messaging.data.types.Reaction reaction2 = (com.truecaller.messaging.data.types.Reaction) next;
                    if (reaction2 != null) {
                        l2 = java.lang.Long.valueOf(reaction2.e);
                    }
                }
                return bf3.baz.b(l, l2);
            }
        }
        l = null;
        list = (java.util.List) linkedHashMap.get(java.lang.Long.valueOf(((java.lang.Number) obj2).longValue()));
        if (list != null) {
        }
        return bf3.baz.b(l, l2);
    }
}
