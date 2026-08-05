package com.truecaller.call_assistant.campaigns.data.db;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/data/db/AssistantCampaignsDatabase_Impl;", "Lcom/truecaller/call_assistant/campaigns/data/db/AssistantCampaignsDatabase;", "<init>", "()V", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantCampaignsDatabase_Impl extends com.truecaller.call_assistant.campaigns.data.db.AssistantCampaignsDatabase {
    public final kotlin.Lazy a;
    public final kotlin.Lazy b;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;

    public AssistantCampaignsDatabase_Impl() {
        final int i = 0;
        this.a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: dm0.bar
            public final /* synthetic */ com.truecaller.call_assistant.campaigns.data.db.AssistantCampaignsDatabase_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i) {
                    case 0:
                        return new im0.bar(this.b);
                    case 1:
                        return new em0.a(this.b);
                    case 2:
                        return new gm0.bar(this.b);
                    default:
                        return new fm0.d(this.b);
                }
            }
        });
        final int i2 = 1;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: dm0.bar
            public final /* synthetic */ com.truecaller.call_assistant.campaigns.data.db.AssistantCampaignsDatabase_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i2) {
                    case 0:
                        return new im0.bar(this.b);
                    case 1:
                        return new em0.a(this.b);
                    case 2:
                        return new gm0.bar(this.b);
                    default:
                        return new fm0.d(this.b);
                }
            }
        });
        final int i3 = 2;
        this.c = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: dm0.bar
            public final /* synthetic */ com.truecaller.call_assistant.campaigns.data.db.AssistantCampaignsDatabase_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i3) {
                    case 0:
                        return new im0.bar(this.b);
                    case 1:
                        return new em0.a(this.b);
                    case 2:
                        return new gm0.bar(this.b);
                    default:
                        return new fm0.d(this.b);
                }
            }
        });
        final int i4 = 3;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: dm0.bar
            public final /* synthetic */ com.truecaller.call_assistant.campaigns.data.db.AssistantCampaignsDatabase_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i4) {
                    case 0:
                        return new im0.bar(this.b);
                    case 1:
                        return new em0.a(this.b);
                    case 2:
                        return new gm0.bar(this.b);
                    default:
                        return new fm0.d(this.b);
                }
            }
        });
    }

    @Override // com.truecaller.call_assistant.campaigns.data.db.AssistantCampaignsDatabase
    public final em0.a b() {
        return (em0.a) this.b.getValue();
    }

    @Override // com.truecaller.call_assistant.campaigns.data.db.AssistantCampaignsDatabase
    public final gm0.bar c() {
        return (gm0.bar) this.c.getValue();
    }

    public final void clearAllTables() {
        performClear(false, new java.lang.String[]{"assistant_campaigns_popups", "assistant_campaigns_view_occurrences", "assistant_campaigns_banners", "assistant_campaigns_interstitials"});
    }

    public final java.util.List createAutoMigrations(java.util.Map map) {
        return nc0.k1.k("autoMigrationSpecs", map);
    }

    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new java.lang.String[]{"assistant_campaigns_popups", "assistant_campaigns_view_occurrences", "assistant_campaigns_banners", "assistant_campaigns_interstitials"});
    }

    public final androidx.room.q0 createOpenDelegate() {
        return new a11.d(this);
    }

    @Override // com.truecaller.call_assistant.campaigns.data.db.AssistantCampaignsDatabase
    public final fm0.d d() {
        return (fm0.d) this.d.getValue();
    }

    @Override // com.truecaller.call_assistant.campaigns.data.db.AssistantCampaignsDatabase
    public final im0.bar e() {
        return (im0.bar) this.a.getValue();
    }

    public final java.util.Set getRequiredAutoMigrationSpecClasses() {
        return new java.util.LinkedHashSet();
    }

    public final java.util.Map getRequiredTypeConverterClasses() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        linkedHashMap.put(l0Var.getOrCreateKotlinClass(im0.bar.class), kotlin.collections.y.j(new kotlin.reflect.KClass[]{l0Var.getOrCreateKotlinClass(fm0.g.class), l0Var.getOrCreateKotlinClass(fm0.l.class), l0Var.getOrCreateKotlinClass(fm0.a.class), l0Var.getOrCreateKotlinClass(fm0.j.class)}));
        linkedHashMap.put(l0Var.getOrCreateKotlinClass(em0.a.class), kotlin.collections.y.j(new kotlin.reflect.KClass[]{l0Var.getOrCreateKotlinClass(fm0.g.class), l0Var.getOrCreateKotlinClass(fm0.a.class), l0Var.getOrCreateKotlinClass(fm0.l.class), l0Var.getOrCreateKotlinClass(fm0.j.class)}));
        linkedHashMap.put(l0Var.getOrCreateKotlinClass(gm0.bar.class), kotlin.collections.y.j(new kotlin.reflect.KClass[]{l0Var.getOrCreateKotlinClass(fm0.g.class), l0Var.getOrCreateKotlinClass(fm0.l.class), l0Var.getOrCreateKotlinClass(fm0.a.class), l0Var.getOrCreateKotlinClass(fm0.j.class)}));
        linkedHashMap.put(l0Var.getOrCreateKotlinClass(fm0.d.class), kotlin.collections.h0.a);
        return linkedHashMap;
    }
}
