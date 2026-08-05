package com.truecaller.messaging.conversationlist;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011BC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/truecaller/messaging/conversationlist/ConversationSpamSearchWorker;", "Lcom/truecaller/background_work/TrackedWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Ljavax/inject/Provider;", "Lx12/c;", "spamSearcher", "Lx12/bar;", "spamSearchTrigger", "Lnc0/bar;", "analytics", "Lqo1/m;", "platformFeaturesInventory", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ljavax/inject/Provider;Lx12/bar;Lnc0/bar;Lqo1/m;)V", "m22/v0", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ConversationSpamSearchWorker extends com.truecaller.background_work.TrackedWorker {
    public static final m22.v0 e = new m22.v0(1);
    public final javax.inject.Provider a;
    public final x12.bar b;
    public final nc0.bar c;
    public final qo1.m d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSpamSearchWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull javax.inject.Provider<x12.c> provider, @org.jetbrains.annotations.NotNull x12.bar barVar, @org.jetbrains.annotations.NotNull nc0.bar barVar2, @org.jetbrains.annotations.NotNull qo1.m mVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "spamSearcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "spamSearchTrigger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "platformFeaturesInventory");
        this.a = provider;
        this.b = barVar;
        this.c = barVar2;
        this.d = mVar;
    }

    /* renamed from: a, reason: from getter */
    public final nc0.bar getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final qo1.m getD() {
        return this.d;
    }

    public final boolean c() {
        return ((x12.baz) this.b).b();
    }

    public final nd.t d() {
        java.lang.Object O = fg3.h0.O(kotlin.coroutines.d.a, new uz.e(this, (df3.bar) null, 24));
        kotlin.jvm.internal.Intrinsics.d(O);
        return (nd.t) O;
    }
}
