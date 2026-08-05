package com.truecaller.contactrequest.persistence;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class qux extends ff3.g implements kotlin.jvm.functions.Function2 {
    public int x;
    public final /* synthetic */ com.truecaller.contactrequest.persistence.a y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qux(com.truecaller.contactrequest.persistence.a aVar, df3.bar barVar) {
        super(2, barVar);
        this.y = aVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.contactrequest.persistence.qux(this.y, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r4 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        com.truecaller.contactrequest.persistence.ContactRequestEntryType contactRequestEntryType;
        com.truecaller.contactrequest.persistence.ContactRequestStatus contactRequestStatus;
        com.truecaller.contactrequest.persistence.a aVar = this.y;
        com.truecaller.contactrequest.persistence.bar barVar = aVar.b;
        ef3.bar barVar2 = ef3.bar.a;
        int i = this.x;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            try {
                java.lang.String string = ((android.content.SharedPreferences) barVar.c.getValue()).getString(com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.CONTACT_REQUEST_ENTRIES_KEY, null);
                if (string != null) {
                    com.google.gson.Gson gson = barVar.b;
                    java.lang.reflect.Type type = new t71.j().getType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    java.lang.Object fromJson = gson.fromJson(string, type);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
                    list = (java.util.List) fromJson;
                }
                list = kotlin.collections.h0.a;
            } catch (com.google.gson.v unused) {
                list = kotlin.collections.h0.a;
            }
            java.util.List<com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Entry> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(list2, 10));
            for (com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.Entry entry : list2) {
                java.lang.String requestId = entry.getRequestId();
                if (entry.isSentByUser()) {
                    contactRequestEntryType = com.truecaller.contactrequest.persistence.ContactRequestEntryType.SENT;
                } else {
                    contactRequestEntryType = com.truecaller.contactrequest.persistence.ContactRequestEntryType.RECEIVED;
                }
                java.lang.String tcId = entry.getTcId();
                java.lang.String name = entry.getName();
                java.lang.String phoneNumber = entry.getPhoneNumber();
                long lastTimeUpdated = entry.getLastTimeUpdated();
                int i3 = com.truecaller.contactrequest.persistence.baz.a[entry.getType().ordinal()];
                if (i3 != i2) {
                    if (i3 != 2) {
                        contactRequestStatus = com.truecaller.contactrequest.persistence.ContactRequestStatus.PENDING;
                    } else {
                        contactRequestStatus = com.truecaller.contactrequest.persistence.ContactRequestStatus.REJECTED;
                    }
                } else {
                    contactRequestStatus = com.truecaller.contactrequest.persistence.ContactRequestStatus.ACCEPTED;
                }
                arrayList.add(new t71.f(requestId, contactRequestEntryType, tcId, name, phoneNumber, lastTimeUpdated, contactRequestStatus));
                i2 = 1;
            }
            t71.d dVar = (t71.d) aVar.c.get();
            this.x = 1;
            java.lang.Object q = mc.f.q(dVar.a, false, true, new s93.baz(14, dVar, arrayList), this);
            if (q != ef3.bar.a) {
                q = kotlin.Unit.a;
            }
            if (q == barVar2) {
                return barVar2;
            }
        }
        ((android.content.SharedPreferences) barVar.c.getValue()).edit().remove(com.truecaller.contactrequest.persistence.ContactRequestSharedPrefsRoomMigration$ContactRequestSharedPrefsModel.CONTACT_REQUEST_ENTRIES_KEY).apply();
        return kotlin.Unit.a;
    }
}
