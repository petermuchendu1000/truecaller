package com.truecaller.database.tcdb;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class TruecallerContentProvider extends t81.bar implements t41.l0 {
    public static final /* synthetic */ int k = 0;
    public final java.lang.ThreadLocal h = new java.lang.ThreadLocal();
    public final x81.qux i = new x81.qux();
    public android.os.Handler j;

    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public enum AggregationState {
        NONE,
        DELAYED,
        IMMEDIATE
    }

    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface bar {
        public static final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference();
    }

    public static android.net.Uri o(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f fVar, java.lang.String str, java.lang.String str2) {
        u81.f d = fVar.d(str);
        d.g = true;
        d.e = str2;
        u81.f d2 = d.c().d(str);
        d2.g = true;
        d2.e = str2;
        d2.f = true;
        u81.f d3 = d2.c().d(str);
        d3.g = true;
        d3.e = str2;
        d3.h = true;
        d3.c();
        return fVar.d(str).d();
    }

    public final android.database.sqlite.SQLiteDatabase d(android.content.Context context, boolean z) {
        c91.f fVar;
        int i = w81.bar.a;
        com.truecaller.database.tcdb.TruecallerContentProvider.bar barVar = (com.truecaller.database.tcdb.TruecallerContentProvider.bar) com.truecaller.database.tcdb.TruecallerContentProvider.bar.a.get();
        if (barVar == null) {
            barVar = (com.truecaller.database.tcdb.TruecallerContentProvider.bar) f40.d0.z(r11.bar.a(), com.truecaller.database.tcdb.TruecallerContentProvider.bar.class);
        }
        v81.bar[] h = c91.f.h();
        tx.w wVar = (tx.w) barVar;
        boolean d = wVar.c().d();
        synchronized (c91.f.class) {
            try {
                if (c91.f.g == null) {
                    c91.f.g = new c91.f(context, h, d);
                }
                fVar = c91.f.g;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (z) {
            return fVar.l();
        }
        try {
            return fVar.getWritableDatabase();
        } catch (c91.e e) {
            context.deleteDatabase("tc.db");
            java.util.Iterator it = ((java.util.Set) wVar.Hk.get()).iterator();
            while (it.hasNext()) {
                ((n11.k) it.next()).a(false);
            }
            throw e.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [u81.b, java.lang.Object, u81.a, u81.d] */
    /* JADX WARN: Type inference failed for: r0v59, types: [u81.b, java.lang.Object, u81.a, u81.d] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, u81.baz] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, v2.x0] */
    /* JADX WARN: Type inference failed for: r2v25, types: [u81.c, java.lang.Object, v6.g] */
    /* JADX WARN: Type inference failed for: r2v27, types: [u81.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34, types: [u81.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [u81.c, java.lang.Object, u6.i] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, u81.baz] */
    /* JADX WARN: Type inference failed for: r3v8, types: [u81.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, u81.d] */
    @Override // t81.bar
    public final j01.qux j(android.content.Context context) {
        java.util.HashSet hashSet;
        java.lang.String str;
        y81.e aVar;
        y81.b aVar2;
        int i = w81.bar.a;
        com.truecaller.database.tcdb.TruecallerContentProvider.bar barVar = (com.truecaller.database.tcdb.TruecallerContentProvider.bar) com.truecaller.database.tcdb.TruecallerContentProvider.bar.a.get();
        if (barVar == null) {
            barVar = (com.truecaller.database.tcdb.TruecallerContentProvider.bar) f40.d0.z(r11.bar.a(), com.truecaller.database.tcdb.TruecallerContentProvider.bar.class);
        }
        tx.w wVar = (tx.w) barVar;
        oo1.f d = wVar.d();
        qo1.k kVar = (qo1.k) wVar.v0.get();
        m02.s sVar = (m02.s) wVar.Z2.get();
        xz1.bar barVar2 = (xz1.bar) wVar.mm.get();
        te1.baz bazVar = (te1.baz) wVar.H.b.e4.get();
        q11.bar barVar3 = (q11.bar) wVar.U.get();
        java.lang.String e = t41.j0.e(context, getClass());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f fVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f(7);
        qo1.r rVar = (qo1.r) wVar.V3.get();
        j81.qux quxVar = (j81.qux) wVar.sh.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "featuresInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "blacklistedOperatorRepository");
        ?? obj = new java.lang.Object();
        ((v2.x0) obj).a = rVar;
        ((v2.x0) obj).b = quxVar;
        v6.g gVar = new v6.g(12);
        n32.bar barVar4 = (n32.bar) wVar.w9.get();
        com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil = (com.google.i18n.phonenumbers.PhoneNumberUtil) wVar.w1.get();
        x81.qux quxVar2 = this.i;
        quxVar2.c = obj;
        quxVar2.d = gVar;
        quxVar2.b = bazVar;
        quxVar2.e = kVar;
        quxVar2.f = barVar4;
        fVar.e = e;
        if (e != null && ((android.net.Uri) fVar.f) == null) {
            fVar.f = android.net.Uri.parse("content://".concat(e));
        }
        if (((com.truecaller.database.tcdb.TruecallerContentProvider) fVar.d) == null) {
            fVar.d = this;
            java.util.HashSet hashSet2 = new java.util.HashSet();
            hashSet2.add(o(fVar, "history_with_raw_contact", "history_with_raw_contact"));
            hashSet2.add(o(fVar, "history_with_aggregated_contact", "history_with_aggregated_contact"));
            hashSet2.add(o(fVar, "history_top_called_with_aggregated_contact", "history_top_called_with_aggregated_contact"));
            hashSet2.add(o(fVar, "history_with_aggregated_contact_number", "history_with_aggregated_contact_number"));
            hashSet2.add(o(fVar, "history_with_aggregated_contact_number_data", "history_with_aggregated_contact_number_data"));
            hashSet2.add(o(fVar, "history_with_call_recording", "history_with_call_recording"));
            hashSet2.add(o(fVar, "call_recordings_with_history_event", "call_recordings_with_history_event"));
            android.net.Uri o = o(fVar, "sorted_contacts_with_data", "sorted_contacts_with_data");
            hashSet2.add(o);
            hashSet2.add(o(fVar, "sorted_contacts_shallow", "sorted_contacts_shallow"));
            hashSet2.add(o(fVar, "wvm_incoming_with_raw_contact_data", "wvm_incoming_with_raw_contact_data"));
            hashSet2.add(h81.a.x());
            hashSet2.add(h81.a.r());
            hashSet2.add(o(fVar, "history_with_aggregated_contact_no_cr", "history_with_aggregated_contact_no_cr"));
            hashSet2.add(o(fVar, "aggregated_contact_raw_contact", "aggregated_contact_raw_contact"));
            java.util.HashSet hashSet3 = new java.util.HashSet();
            android.net.Uri uri = h81.e.a;
            hashSet3.add(android.net.Uri.withAppendedPath(uri, "history_with_raw_contact"));
            hashSet3.add(android.net.Uri.withAppendedPath(uri, "history_with_call_recording"));
            hashSet3.add(h81.c.f());
            hashSet3.add(h81.c.g());
            hashSet3.add(uri.buildUpon().appendEncodedPath("call_recordings_with_history_event").build());
            java.util.HashSet hashSet4 = new java.util.HashSet();
            hashSet4.add(android.net.Uri.withAppendedPath(uri, "profile_view_events"));
            u81.f d2 = fVar.d("aggregated_contact");
            d2.i = 5;
            d2.a(hashSet2);
            d2.c();
            u81.f d3 = fVar.d("aggregated_contact");
            d3.a(hashSet2);
            d3.f = true;
            d3.c();
            u81.f d4 = fVar.d("aggregated_contact");
            d4.h = true;
            d4.c();
            so1.a aVar3 = ((qo1.s) rVar).b;
            com.truecaller.featuretoggles.FeatureState featureState = com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG;
            if (aVar3.a("featureReplaceT9FromGlobalSearch", featureState)) {
                str = "profile_view_events";
                hashSet = hashSet3;
                aVar = new y81.e(9);
            } else {
                hashSet = hashSet3;
                str = "profile_view_events";
                aVar = new c0.a(true, d);
            }
            u81.f d5 = fVar.d("aggregated_contact_t9");
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            d5.k = bool;
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            d5.j = bool2;
            d5.m = aVar;
            d5.c();
            int i2 = 0;
            if (aVar3.a("featureReplaceT9FromGlobalSearch", featureState)) {
                aVar2 = new y81.b();
            } else {
                aVar2 = new c0.a(false, d);
            }
            u81.f d6 = fVar.d("aggregated_contact_plain_text");
            d6.k = bool;
            d6.j = bool2;
            d6.m = aVar2;
            d6.c();
            u81.f d7 = fVar.d("aggregated_contact_filtered_on_raw");
            d7.k = bool;
            d7.j = bool2;
            d7.m = new y81.e(1);
            d7.c();
            u81.f d8 = fVar.d("raw_contact_data_limited_source_16");
            d8.k = bool;
            d8.j = bool2;
            d8.m = new y81.e(29);
            d8.c();
            u81.f d9 = fVar.d("raw_contact");
            d9.i = 5;
            d9.n = quxVar2;
            d9.q = quxVar2;
            d9.p = quxVar2;
            d9.r = quxVar2;
            d9.a(hashSet2);
            d9.c();
            u81.f d10 = fVar.d("raw_contact");
            d10.p = quxVar2;
            d10.a(hashSet2);
            d10.f = true;
            d10.c();
            u81.f d11 = fVar.d("raw_contact");
            d11.h = true;
            d11.c();
            ?? obj2 = new java.lang.Object();
            uk2.h hVar = new uk2.h(23, false);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "dialerCacheManager");
            hVar.b = bazVar;
            u81.f d13 = fVar.d("history");
            d13.q = obj2;
            d13.s = hVar;
            d13.a(hashSet2);
            d13.c();
            u81.f d14 = fVar.d("history");
            d14.a(hashSet2);
            d14.f = true;
            d14.s = hVar;
            d14.c();
            u81.f d15 = fVar.d("history");
            d15.h = true;
            d15.c();
            hashSet2.add(fVar.d("raw_contact").d());
            hashSet2.add(o(fVar, "raw_contact_data", "raw_contact/data"));
            hashSet2.add(o(fVar, "aggregated_contact_data", "aggregated_contact/data"));
            y81.e eVar = new y81.e(26);
            u81.f d16 = fVar.d("data");
            d16.n = eVar;
            d16.q = eVar;
            d16.a(hashSet2);
            d16.c();
            u81.f d17 = fVar.d("data");
            d17.n = eVar;
            d17.q = eVar;
            d17.a(hashSet2);
            d17.f = true;
            d17.c();
            u81.f d18 = fVar.d("data");
            d18.h = true;
            d18.c();
            ?? obj3 = new java.lang.Object();
            u81.f d19 = fVar.d("msg_conversations");
            d19.e = "msg/msg_conversations";
            d19.k = bool2;
            d19.n = obj3;
            d19.o = obj3;
            d19.p = obj3;
            d19.c();
            u81.f d20 = fVar.d("msg_thread_stats");
            d20.e = "msg/msg_thread_stats";
            d20.b(h81.a.p());
            d20.c();
            u81.f d21 = fVar.d("msg/msg_thread_stats_specific_update");
            d21.o = new java.lang.Object();
            d21.j = bool;
            d21.k = bool2;
            d21.c();
            u81.f d23 = fVar.d("msg_conversations_list");
            d23.e = "msg/msg_conversations_list";
            d23.f = true;
            d23.k = bool;
            d23.m = new wm0.bar(sVar, barVar2, barVar4);
            d23.c();
            u81.f d24 = fVar.d("msg_conversations_list");
            d24.e = "msg/msg_conversations_list";
            d24.k = bool;
            d24.m = new wm0.bar(sVar, barVar2, barVar4);
            d24.c();
            u81.f d25 = fVar.d("msg_participants");
            d25.e = "msg/msg_participants";
            d25.n = new wm0.bar((t41.t) wVar.A1.get(), new b91.d(15), (ij0.e) wVar.m7.get());
            d25.o = new y81.e(27);
            d25.j = bool2;
            d25.c();
            u81.f d26 = fVar.d("msg_conversation_participants");
            d26.e = "msg/msg_conversation_participants";
            d26.k = bool;
            d26.j = bool2;
            d26.c();
            u81.f d27 = fVar.d("msg_participants_with_contact_info");
            d27.e = "msg/msg_participants_with_contact_info";
            d27.m = new a8.l(context, 12);
            d27.k = bool;
            d27.c();
            y81.e eVar2 = new y81.e(i2);
            y81.e eVar3 = new y81.e(24);
            y81.e eVar4 = new y81.e(23);
            u81.f d28 = fVar.d("msg_messages");
            d28.e = "msg/msg_messages";
            d28.m = eVar4;
            d28.o = eVar4;
            d28.p = eVar4;
            d28.n = eVar2;
            d28.b(h81.a.p());
            d28.b(h81.a.x());
            d28.c();
            u81.f d29 = fVar.d("msg_messages");
            d29.e = "msg/msg_messages";
            d29.f = true;
            d29.o = eVar3;
            d29.p = eVar2;
            d29.b(h81.a.p());
            d29.c();
            u81.f d30 = fVar.d("msg_entities");
            d30.e = "msg/msg_entities";
            d30.n = new wf.h((h81.baz) wVar.eh.get());
            d30.b(h81.a.x());
            d30.b(h81.a.p());
            d30.c();
            u81.f d31 = fVar.d("msg_im_reactions");
            d31.e = "msg/msg_im_reactions";
            d31.n = new y81.e(13);
            d31.b(h81.a.x());
            d31.b(h81.a.p());
            d31.c();
            u81.f d33 = fVar.d("reaction_with_participants");
            d33.k = bool;
            d33.j = bool2;
            int i3 = 2;
            d33.m = new y81.j(i3);
            d33.c();
            u81.f d34 = fVar.d("msg/msg_messages_with_entities");
            d34.k = bool;
            d34.j = bool2;
            d34.m = new a52.bar(context, 13);
            d34.f = true;
            d34.c();
            u81.f d35 = fVar.d("msg/msg_messages_with_pdos");
            d35.k = bool;
            d35.j = bool2;
            d35.m = new a53.bar(context, 10);
            d35.f = true;
            d35.c();
            u81.f d36 = fVar.d("msg_im_mentions");
            d36.e = "msg/msg_im_mentions";
            d36.b(h81.a.x());
            d36.c();
            u81.f d37 = fVar.d("msg_messages_with_entities");
            d37.e = "msg/msg_messages_with_entities";
            d37.k = bool;
            d37.j = bool2;
            d37.m = new a52.bar(context, 13);
            d37.c();
            u81.f d38 = fVar.d("msg_messages_with_pdos");
            d38.e = "msg/msg_messages_with_pdos";
            d38.k = bool;
            d38.j = bool2;
            d38.m = new a53.bar(context, 10);
            d38.c();
            u81.f d39 = fVar.d("messages_moved_to_spam_query");
            d39.k = bool;
            d39.j = bool2;
            d39.m = new y81.e(22);
            d39.c();
            u81.f d40 = fVar.d("msg_im_attachments");
            d40.e = "msg/msg_im_attachments";
            d40.c();
            u81.f d41 = fVar.d("msg_im_attachments_entities");
            d41.k = bool;
            d41.j = bool2;
            d41.c();
            u81.f d43 = fVar.d("msg_im_report_message");
            d43.e = "msg/msg_im_report_message";
            d43.k = bool;
            d43.j = bool2;
            d43.f = true;
            d43.m = new y81.e(14);
            d43.c();
            ?? obj4 = new java.lang.Object();
            u81.f d44 = fVar.d("msg_im_users");
            d44.e = "msg/msg_im_users";
            d44.k = bool2;
            d44.j = bool2;
            d44.n = obj4;
            d44.o = obj4;
            d44.p = obj4;
            d44.i = 5;
            d44.c();
            u81.f d45 = fVar.d("message_attachments");
            d45.k = bool;
            d45.j = bool2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "smsCategorizerFlagProvider");
            ?? obj5 = new java.lang.Object();
            ((v6.g) obj5).a = sVar;
            d45.m = obj5;
            d45.c();
            u81.f d46 = fVar.d("inbox_cleaner_spam_messages_query");
            d46.k = bool;
            d46.j = bool2;
            d46.m = new y81.e(15);
            d46.c();
            u81.f d47 = fVar.d("inbox_cleaner_otp_messages_query");
            d47.k = bool;
            d47.j = bool2;
            d47.m = new java.lang.Object();
            d47.c();
            u81.f d48 = fVar.d("post_on_boarding_spam_messages_query");
            d48.k = bool;
            d48.j = bool2;
            d48.m = new y81.e(28);
            d48.c();
            u81.f d49 = fVar.d("dds_messages_query");
            d49.k = bool;
            d49.j = bool2;
            d49.m = new y81.e(5);
            d49.c();
            u81.f d50 = fVar.d("message_to_nudge");
            d50.k = bool;
            d50.j = bool2;
            d50.m = new wu.a(d, kVar);
            d50.c();
            u81.f d51 = fVar.d("media_storage");
            d51.k = bool;
            d51.j = bool2;
            d51.m = new y81.e(20);
            d51.c();
            u81.f d53 = fVar.d("media_size_by_conversation");
            d53.k = bool;
            d53.j = bool2;
            d53.m = new y81.e(19);
            d53.c();
            u81.f d54 = fVar.d("new_conversation_items");
            d54.k = bool;
            d54.j = bool2;
            d54.m = new y81.g(barVar3, kVar, phoneNumberUtil);
            d54.c();
            u81.f d55 = fVar.d("conversation_messages");
            d55.k = bool2;
            d55.j = bool2;
            d55.m = new java.lang.Object();
            d55.c();
            u81.f d56 = fVar.d("messages_brand_keywords");
            d56.k = bool2;
            d56.j = bool2;
            d56.m = new y81.e(i3);
            d56.c();
            u81.f d57 = fVar.d("messages_to_translate");
            d57.k = bool;
            d57.j = bool2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "smsCategorizerFlagProvider");
            ?? obj6 = new java.lang.Object();
            ((u6.i) obj6).a = sVar;
            d57.m = obj6;
            d57.c();
            u81.f d58 = fVar.d("gif_stats");
            d58.k = bool;
            d58.j = bool2;
            d58.m = new y81.e(11);
            d58.c();
            u81.f d59 = fVar.d("msg_links");
            d59.e = "msg/msg_links";
            d59.k = bool2;
            d59.j = bool2;
            d59.i = 5;
            d59.c();
            u81.f d60 = fVar.d("msg_im_quick_actions");
            d60.e = "msg/msg_im_quick_actions";
            d60.k = bool2;
            d60.j = bool2;
            d60.i = 5;
            d60.c();
            u81.f d61 = fVar.d("business_im");
            d61.j = bool2;
            d61.m = new y81.e(18);
            d61.c();
            u81.f d63 = fVar.d("insights_resync_directory");
            d63.k = bool2;
            d63.j = bool2;
            d63.m = new y81.e(17);
            d63.c();
            u81.f d64 = fVar.d("insights_message_match_directory");
            d64.k = bool2;
            d64.j = bool2;
            d64.m = new y81.e(16);
            d64.c();
            u81.f d65 = fVar.d("filters");
            d65.e = "filters";
            d65.n = new java.lang.Object();
            d65.o = new y81.e(10);
            d65.p = new y81.e(8);
            u81.f d66 = d65.c().d("filters");
            d66.e = "filters";
            d66.f = true;
            u81.f d67 = d66.c().d("filters");
            d67.e = "filters";
            d67.h = true;
            d67.c();
            u81.f d68 = fVar.d("topspammers");
            d68.e = "topspammers";
            d68.q = new java.lang.Object();
            d68.r = new y81.j(5);
            int i4 = 4;
            d68.s = new y81.j(i4);
            u81.f d69 = d68.c().d("topspammers");
            d69.e = "topspammers";
            d69.f = true;
            u81.f d70 = d69.c().d("topspammers");
            d70.e = "topspammers";
            d70.h = true;
            d70.c();
            u81.f d73 = fVar.d("t9_mapping");
            d73.k = bool2;
            d73.j = bool2;
            d73.c();
            u81.f d74 = fVar.d("contact_sorting_index");
            d74.b(o);
            d74.k = bool2;
            d74.j = bool2;
            d74.c();
            u81.f d75 = fVar.d("contact_sorting_index");
            d75.e = "contact_sorting_index/fast_scroll";
            d75.k = bool;
            d75.j = bool2;
            d75.m = new y81.e(7);
            d75.c();
            u81.f d76 = fVar.d("call_recordings");
            d76.e = "call_recordings";
            d76.a(hashSet);
            d76.k = bool2;
            d76.j = bool2;
            d76.c();
            java.lang.String str2 = str;
            u81.f d77 = fVar.d(str2);
            d77.e = str2;
            d77.a(hashSet4);
            d77.k = bool2;
            d77.j = bool2;
            d77.c();
            u81.f d78 = fVar.d("msg_im_unsupported_events");
            d78.e = "msg/msg_im_unsupported_events";
            d78.k = bool2;
            d78.j = bool2;
            d78.c();
            u81.f d79 = fVar.d("contact_settings");
            d79.e = "contact_settings";
            d79.k = bool2;
            d79.j = bool2;
            d79.i = 5;
            d79.c();
            u81.f d80 = fVar.d("voip_history_peers");
            d80.e = "voip_history_peers";
            d80.k = bool2;
            d80.j = bool2;
            d80.i = 5;
            d80.c();
            u81.f d83 = fVar.d("voip_history_with_aggregated_contacts_shallow");
            d83.e = "voip_history_with_aggregated_contacts_shallow";
            d83.k = bool;
            d83.j = bool2;
            d83.c();
            u81.f d84 = fVar.d("message_notifications_analytics");
            d84.k = bool;
            d84.j = bool2;
            d84.m = new y81.e(21);
            d84.c();
            u81.f d85 = fVar.d("group_conversation_search");
            d85.k = bool;
            d85.j = bool2;
            d85.m = new y81.e(12);
            d85.c();
            u81.f d86 = fVar.d("screened_calls");
            d86.e = "screened_calls";
            d86.k = bool2;
            d86.j = bool2;
            d86.i = 5;
            d86.b(h81.a.r());
            d86.c();
            u81.f d87 = fVar.d("enriched_screened_calls");
            d87.k = bool;
            d87.j = bool2;
            d87.m = new y81.e(6);
            d87.c();
            u81.f d88 = fVar.d("screened_call_messages");
            d88.e = "screened_call_messages";
            d88.k = bool2;
            d88.j = bool2;
            d88.i = 5;
            d88.b(h81.a.r());
            d88.c();
            u81.f d89 = fVar.d("missed_after_call_history");
            d89.k = bool;
            d89.j = bool2;
            d89.m = new y81.e(25);
            d89.c();
            u81.f d90 = fVar.d("conversation_unread_message_count_query");
            d90.k = bool;
            d90.j = bool2;
            int i5 = 3;
            d90.m = new y81.e(i5);
            d90.c();
            u81.f d93 = fVar.d("unread_message_count");
            d93.j = bool2;
            d93.m = new c0.bar(4, barVar2.a(), barVar4.d());
            d93.c();
            u81.f d94 = fVar.d("dds_contact");
            d94.k = bool;
            d94.j = bool2;
            d94.m = new y81.e(i4);
            d94.c();
            u81.f d95 = fVar.d("report_sender_update");
            d95.k = bool2;
            d95.o = new y81.j(i5);
            d95.c();
            u81.f d96 = fVar.d("favorite_contact");
            d96.e = "favorite_contact";
            d96.k = bool2;
            d96.j = bool2;
            d96.i = 5;
            d96.c();
            u81.f d97 = fVar.d("rcs_historic_message_detail");
            d97.k = bool;
            d97.j = bool2;
            d97.m = new y81.j(i2);
            d97.c();
            u81.f d98 = fVar.d("rcs_notification_message");
            d98.k = bool;
            d98.j = bool2;
            d98.m = new y81.j(1);
            d98.c();
            return new j01.qux((android.net.Uri) fVar.f, (android.util.SparseArray) fVar.b, (android.content.UriMatcher) fVar.c, (com.truecaller.database.tcdb.TruecallerContentProvider) fVar.d, 20);
        }
        throw new java.lang.IllegalStateException("Database factory already set");
    }

    @Override // t81.bar
    public final void l() {
        java.lang.ThreadLocal threadLocal = this.h;
        com.truecaller.database.tcdb.TruecallerContentProvider.AggregationState aggregationState = (com.truecaller.database.tcdb.TruecallerContentProvider.AggregationState) threadLocal.get();
        if (aggregationState == null) {
            aggregationState = com.truecaller.database.tcdb.TruecallerContentProvider.AggregationState.NONE;
        }
        if (aggregationState == com.truecaller.database.tcdb.TruecallerContentProvider.AggregationState.IMMEDIATE) {
            this.i.h(g());
            threadLocal.remove();
            a(h81.c.c());
        }
    }

    @Override // t81.bar
    public final void m(boolean z) {
        if (this.c && z) {
            this.c = false;
            java.util.Collection<android.net.Uri> collection = (java.util.Collection) this.b.get();
            if (collection != null && !collection.isEmpty()) {
                for (android.net.Uri uri : collection) {
                    android.content.Context context = getContext();
                    if (context != null) {
                        context.getContentResolver().notifyChange(uri, (android.database.ContentObserver) null, false);
                    }
                }
            }
        }
        this.b.remove();
        com.truecaller.database.tcdb.TruecallerContentProvider.AggregationState aggregationState = (com.truecaller.database.tcdb.TruecallerContentProvider.AggregationState) this.h.get();
        if (aggregationState == null) {
            aggregationState = com.truecaller.database.tcdb.TruecallerContentProvider.AggregationState.NONE;
        }
        if (aggregationState != com.truecaller.database.tcdb.TruecallerContentProvider.AggregationState.DELAYED && aggregationState != com.truecaller.database.tcdb.TruecallerContentProvider.AggregationState.IMMEDIATE) {
            return;
        }
        this.h.remove();
        this.j.sendEmptyMessageDelayed(1, 100L);
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
        this.h.remove();
        if (this.j.hasMessages(1)) {
            this.j.removeMessages(1);
            p(com.truecaller.database.tcdb.TruecallerContentProvider.AggregationState.DELAYED);
        }
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(getContext()).registerReceiver(new s9.qux(this, 3), new android.content.IntentFilter("ACTION_RESTORE_AGGREGATION"));
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("Aggregation", 10);
        handlerThread.start();
        this.j = new android.os.Handler(handlerThread.getLooper(), new com.google.android.gms.common.internal.h(this, 3));
        return true;
    }

    public final void p(com.truecaller.database.tcdb.TruecallerContentProvider.AggregationState aggregationState) {
        java.lang.ThreadLocal threadLocal = this.h;
        com.truecaller.database.tcdb.TruecallerContentProvider.AggregationState aggregationState2 = (com.truecaller.database.tcdb.TruecallerContentProvider.AggregationState) threadLocal.get();
        if (aggregationState2 == null) {
            aggregationState2 = com.truecaller.database.tcdb.TruecallerContentProvider.AggregationState.NONE;
        }
        if (aggregationState2.ordinal() < aggregationState.ordinal()) {
            threadLocal.set(aggregationState);
        }
    }
}
