package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class k {
    public final m03.s a;
    public final u03.b b;
    public final u03.w c;
    public final jp2.bar d;
    public final r32.qux e;
    public final qc3.bar f;
    public final com.truecaller.messaging.notifications.j g;
    public final p81.bar h;

    public k(m03.s sVar, u03.b bVar, u03.w wVar, jp2.bar barVar, r32.qux quxVar, qc3.bar barVar2, com.truecaller.messaging.notifications.j jVar, p81.bar barVar3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "deviceInfoUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wVar, "networkUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "contactStalenessHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "participantSearchHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "topSpammersRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "analyticsHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "aggregatedContactDao");
        this.a = sVar;
        this.b = bVar;
        this.c = wVar;
        this.d = barVar;
        this.e = quxVar;
        this.f = barVar2;
        this.g = jVar;
        this.h = barVar3;
    }

    public final java.util.LinkedHashMap a(java.util.List list) {
        java.lang.String str;
        com.truecaller.data.entity.Contact contact;
        int i;
        java.lang.String C;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "messages");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.String str2 = ((com.truecaller.messaging.data.types.Message) obj).c.e;
            java.lang.Object obj2 = linkedHashMap.get(str2);
            if (obj2 == null) {
                obj2 = h8.s0.u(linkedHashMap, str2);
            }
            ((java.util.List) obj2).add(obj);
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.q0.b(linkedHashMap.size()));
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.util.List list2 = (java.util.List) entry.getValue();
            com.truecaller.data.entity.messaging.Participant participant = ((com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.V(list2)).c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participant, "participant");
            java.util.List<com.truecaller.messaging.data.types.Message> list3 = list2;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(list3, 10));
            for (com.truecaller.messaging.data.types.Message message : list3) {
                arrayList.add(com.truecaller.messaging.data.types.Message.d(message.n.d0(), message.e));
            }
            if (this.b.p()) {
                str = "notification";
            } else {
                str = "notificationNotDefault";
            }
            boolean e = this.c.e();
            com.truecaller.messaging.notifications.j jVar = this.g;
            if (!e) {
                jVar.a(c(participant), "noConnection", str, arrayList);
            } else if (!this.a.b()) {
                jVar.a(c(participant), "noAccount", str, arrayList);
            } else {
                int i2 = participant.b;
                boolean z = true;
                if (i2 != 0 && i2 != 1 && i2 != 3) {
                    jVar.a(c(participant), "notNumber", str, arrayList);
                } else if (!this.d.c(participant)) {
                    jVar.a(c(participant), "validCacheResult", str, arrayList);
                } else {
                    c62.v b = this.e.b(participant, str, arrayList);
                    com.truecaller.topspammers.api.TopSpammer topSpammer = null;
                    if (b != null) {
                        contact = b.a();
                    } else {
                        contact = null;
                    }
                    if (contact != null) {
                        if (participant.b == 1) {
                            z = false;
                        }
                        s81.baz bazVar = new s81.baz(participant);
                        if (z) {
                            C = contact.s();
                        } else {
                            C = ak.r0.C(participant);
                        }
                        bazVar.m = C;
                        bazVar.p = participant.q & contact.W;
                        bazVar.x = contact.t;
                        bazVar.o = contact.O;
                        bazVar.r = contact.A;
                        participant = bazVar.a();
                    } else if (participant.l) {
                        kx2.bar barVar = (kx2.bar) this.f.get();
                        java.lang.String str3 = participant.e;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "normalizedAddress");
                        barVar.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "phoneNumber");
                        mx2.b bVar = barVar.e;
                        bVar.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "phoneNumber");
                        android.database.Cursor query = bVar.a.query(h81.c.e(), null, "value = ?", new java.lang.String[]{str3}, null);
                        if (query == null || !query.moveToFirst()) {
                            query = null;
                        }
                        if (query != null) {
                            android.database.Cursor cursor = query;
                            try {
                                topSpammer = mx2.b.d(cursor);
                                cursor.close();
                            } finally {
                            }
                        }
                        if (topSpammer != null) {
                            s81.baz bazVar2 = new s81.baz(participant);
                            java.lang.String label = topSpammer.getLabel();
                            if (label == null) {
                                label = participant.n;
                            }
                            bazVar2.m = label;
                            java.lang.Integer reports = topSpammer.getReports();
                            if (reports != null) {
                                i = reports.intValue();
                            } else {
                                i = participant.s;
                            }
                            bazVar2.r = i;
                            participant = bazVar2.a();
                        }
                    } else {
                        continue;
                    }
                }
            }
            linkedHashMap2.put(key, participant);
        }
        return linkedHashMap2;
    }

    public final java.util.Map b(java.util.Map map) {
        java.util.ArrayList k = nc0.k1.k("conversations", map);
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            kotlin.collections.d0.v(k, (java.util.List) ((java.util.Map.Entry) it.next()).getValue());
        }
        java.util.LinkedHashMap a = a(k);
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            com.truecaller.messaging.data.types.Conversation conversation = (com.truecaller.messaging.data.types.Conversation) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            conversation.getClass();
            c22.baz bazVar = new c22.baz(conversation);
            com.truecaller.data.entity.messaging.Participant[] participantArr = conversation.l;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participantArr, "participants");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(participantArr.length);
            for (com.truecaller.data.entity.messaging.Participant participant : participantArr) {
                com.truecaller.data.entity.messaging.Participant participant2 = (com.truecaller.data.entity.messaging.Participant) a.get(participant.e);
                if (participant2 != null) {
                    participant = participant2;
                }
                arrayList2.add(participant);
            }
            java.util.ArrayList arrayList3 = bazVar.l;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            com.truecaller.messaging.data.types.Conversation conversation2 = new com.truecaller.messaging.data.types.Conversation(bazVar);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(conversation2, "build(...)");
            java.util.List<com.truecaller.messaging.data.types.Message> list2 = list;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.z.q(list2, 10));
            for (com.truecaller.messaging.data.types.Message message : list2) {
                c22.f b = message.b();
                java.lang.String str = message.c.e;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "<this>");
                b.c = (com.truecaller.data.entity.messaging.Participant) kotlin.collections.p0.a(str, a);
                arrayList4.add(b.a());
            }
            arrayList.add(new kotlin.Pair(conversation2, arrayList4));
        }
        return kotlin.collections.r0.p(arrayList);
    }

    public final kotlin.Pair c(com.truecaller.data.entity.messaging.Participant participant) {
        return new kotlin.Pair(participant, ((p81.baz) this.h).c(participant.h));
    }
}
