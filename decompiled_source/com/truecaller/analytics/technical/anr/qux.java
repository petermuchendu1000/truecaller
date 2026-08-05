package com.truecaller.analytics.technical.anr;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class qux {
    public boolean a;
    public final boolean b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public final java.lang.Object i;

    public qux(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "appExitDescription");
        this.c = str;
        boolean N = kotlin.text.StringsKt.N(str, "Input dispatching timed out", true);
        this.a = N;
        this.b = N;
        final int i = 0;
        this.e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.analytics.technical.anr.baz
            public final /* synthetic */ com.truecaller.analytics.technical.anr.qux b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                boolean z;
                switch (i) {
                    case 0:
                        return java.lang.Boolean.valueOf(kotlin.text.StringsKt.N((java.lang.String) this.b.c, "does not have a focused window", true));
                    case 1:
                        com.truecaller.analytics.technical.anr.qux quxVar = this.b;
                        if (!((java.lang.Boolean) ((kotlin.Lazy) quxVar.e).getValue()).booleanValue() && !new kotlin.text.Regex("\\bwindow\\b", kotlin.text.q.c).a((java.lang.String) quxVar.c)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        return java.lang.Boolean.valueOf(z);
                    case 2:
                        com.truecaller.analytics.technical.anr.qux quxVar2 = this.b;
                        return quxVar2.b("ActivityRecord\\{.*?\\s" + ((java.lang.String) quxVar2.d));
                    case 3:
                        com.truecaller.analytics.technical.anr.qux quxVar3 = this.b;
                        return quxVar3.b(((java.lang.String) quxVar3.d) + "(?:\\s+\\(server\\))?\\sis not responding");
                    default:
                        com.truecaller.analytics.technical.anr.qux quxVar4 = this.b;
                        return quxVar4.b((java.lang.String) quxVar4.d);
                }
            }
        });
        final int i2 = 1;
        this.f = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.analytics.technical.anr.baz
            public final /* synthetic */ com.truecaller.analytics.technical.anr.qux b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                boolean z;
                switch (i2) {
                    case 0:
                        return java.lang.Boolean.valueOf(kotlin.text.StringsKt.N((java.lang.String) this.b.c, "does not have a focused window", true));
                    case 1:
                        com.truecaller.analytics.technical.anr.qux quxVar = this.b;
                        if (!((java.lang.Boolean) ((kotlin.Lazy) quxVar.e).getValue()).booleanValue() && !new kotlin.text.Regex("\\bwindow\\b", kotlin.text.q.c).a((java.lang.String) quxVar.c)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        return java.lang.Boolean.valueOf(z);
                    case 2:
                        com.truecaller.analytics.technical.anr.qux quxVar2 = this.b;
                        return quxVar2.b("ActivityRecord\\{.*?\\s" + ((java.lang.String) quxVar2.d));
                    case 3:
                        com.truecaller.analytics.technical.anr.qux quxVar3 = this.b;
                        return quxVar3.b(((java.lang.String) quxVar3.d) + "(?:\\s+\\(server\\))?\\sis not responding");
                    default:
                        com.truecaller.analytics.technical.anr.qux quxVar4 = this.b;
                        return quxVar4.b((java.lang.String) quxVar4.d);
                }
            }
        });
        final int i3 = 2;
        this.g = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.analytics.technical.anr.baz
            public final /* synthetic */ com.truecaller.analytics.technical.anr.qux b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                boolean z;
                switch (i3) {
                    case 0:
                        return java.lang.Boolean.valueOf(kotlin.text.StringsKt.N((java.lang.String) this.b.c, "does not have a focused window", true));
                    case 1:
                        com.truecaller.analytics.technical.anr.qux quxVar = this.b;
                        if (!((java.lang.Boolean) ((kotlin.Lazy) quxVar.e).getValue()).booleanValue() && !new kotlin.text.Regex("\\bwindow\\b", kotlin.text.q.c).a((java.lang.String) quxVar.c)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        return java.lang.Boolean.valueOf(z);
                    case 2:
                        com.truecaller.analytics.technical.anr.qux quxVar2 = this.b;
                        return quxVar2.b("ActivityRecord\\{.*?\\s" + ((java.lang.String) quxVar2.d));
                    case 3:
                        com.truecaller.analytics.technical.anr.qux quxVar3 = this.b;
                        return quxVar3.b(((java.lang.String) quxVar3.d) + "(?:\\s+\\(server\\))?\\sis not responding");
                    default:
                        com.truecaller.analytics.technical.anr.qux quxVar4 = this.b;
                        return quxVar4.b((java.lang.String) quxVar4.d);
                }
            }
        });
        final int i4 = 3;
        this.h = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.analytics.technical.anr.baz
            public final /* synthetic */ com.truecaller.analytics.technical.anr.qux b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                boolean z;
                switch (i4) {
                    case 0:
                        return java.lang.Boolean.valueOf(kotlin.text.StringsKt.N((java.lang.String) this.b.c, "does not have a focused window", true));
                    case 1:
                        com.truecaller.analytics.technical.anr.qux quxVar = this.b;
                        if (!((java.lang.Boolean) ((kotlin.Lazy) quxVar.e).getValue()).booleanValue() && !new kotlin.text.Regex("\\bwindow\\b", kotlin.text.q.c).a((java.lang.String) quxVar.c)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        return java.lang.Boolean.valueOf(z);
                    case 2:
                        com.truecaller.analytics.technical.anr.qux quxVar2 = this.b;
                        return quxVar2.b("ActivityRecord\\{.*?\\s" + ((java.lang.String) quxVar2.d));
                    case 3:
                        com.truecaller.analytics.technical.anr.qux quxVar3 = this.b;
                        return quxVar3.b(((java.lang.String) quxVar3.d) + "(?:\\s+\\(server\\))?\\sis not responding");
                    default:
                        com.truecaller.analytics.technical.anr.qux quxVar4 = this.b;
                        return quxVar4.b((java.lang.String) quxVar4.d);
                }
            }
        });
        final int i5 = 4;
        this.i = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.analytics.technical.anr.baz
            public final /* synthetic */ com.truecaller.analytics.technical.anr.qux b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                boolean z;
                switch (i5) {
                    case 0:
                        return java.lang.Boolean.valueOf(kotlin.text.StringsKt.N((java.lang.String) this.b.c, "does not have a focused window", true));
                    case 1:
                        com.truecaller.analytics.technical.anr.qux quxVar = this.b;
                        if (!((java.lang.Boolean) ((kotlin.Lazy) quxVar.e).getValue()).booleanValue() && !new kotlin.text.Regex("\\bwindow\\b", kotlin.text.q.c).a((java.lang.String) quxVar.c)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        return java.lang.Boolean.valueOf(z);
                    case 2:
                        com.truecaller.analytics.technical.anr.qux quxVar2 = this.b;
                        return quxVar2.b("ActivityRecord\\{.*?\\s" + ((java.lang.String) quxVar2.d));
                    case 3:
                        com.truecaller.analytics.technical.anr.qux quxVar3 = this.b;
                        return quxVar3.b(((java.lang.String) quxVar3.d) + "(?:\\s+\\(server\\))?\\sis not responding");
                    default:
                        com.truecaller.analytics.technical.anr.qux quxVar4 = this.b;
                        return quxVar4.b((java.lang.String) quxVar4.d);
                }
            }
        });
        this.d = "([a-zA-Z0-9_.]+)/([a-zA-Z0-9_.$]+)";
    }

    public void a(java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull(obj);
        synchronized (this.i) {
            try {
                if (this.a) {
                    return;
                }
                ((java.util.concurrent.CopyOnWriteArraySet) this.f).add(new k9.o(obj));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public java.lang.String b(java.lang.String str) {
        kotlin.text.m b = new kotlin.text.Regex(str, kotlin.text.q.c).b((java.lang.String) this.c);
        if (b != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "match");
            java.lang.String str2 = (java.lang.String) b.a().get(1);
            java.lang.String str3 = (java.lang.String) b.a().get(2);
            if (kotlin.text.y.w(str3, ".", false)) {
                str3 = h0.b.Q(str2, str3);
            }
            if (!kotlin.text.StringsKt.X(str3)) {
                return str3;
            }
        }
        return null;
    }

    public void c() {
        boolean z;
        k9.b0 b0Var = (k9.b0) this.d;
        java.util.ArrayDeque arrayDeque = (java.util.ArrayDeque) this.g;
        if (this.b) {
            if (java.lang.Thread.currentThread() == ((java.lang.Thread) this.c)) {
                z = true;
            } else {
                z = false;
            }
            com.google.common.base.Preconditions.checkState(z);
        }
        java.util.ArrayDeque arrayDeque2 = (java.util.ArrayDeque) this.h;
        if (!arrayDeque2.isEmpty()) {
            if (((k9.n) this.e) != null) {
                k9.b0 b0Var2 = (k9.l) com.google.common.base.Preconditions.checkNotNull(b0Var);
                b0Var2.getClass();
                com.google.common.base.Preconditions.checkArgument(true);
                if (!b0Var2.a.hasMessages(1)) {
                    k9.a0 a = b0Var.a(1);
                    b0Var.a.sendMessageAtFrontOfQueue((android.os.Message) com.google.common.base.Preconditions.checkNotNull(a.a));
                    a.a();
                }
            }
            boolean isEmpty = arrayDeque.isEmpty();
            arrayDeque.addAll(arrayDeque2);
            arrayDeque2.clear();
            if (isEmpty) {
                while (!arrayDeque.isEmpty()) {
                    ((java.lang.Runnable) arrayDeque.peekFirst()).run();
                    arrayDeque.removeFirst();
                }
            }
        }
    }

    public void d(int i, k9.m mVar) {
        boolean z;
        if (this.b) {
            if (java.lang.Thread.currentThread() == ((java.lang.Thread) this.c)) {
                z = true;
            } else {
                z = false;
            }
            com.google.common.base.Preconditions.checkState(z);
        }
        ((java.util.ArrayDeque) this.h).add(new bx.q0(new java.util.concurrent.CopyOnWriteArraySet((java.util.concurrent.CopyOnWriteArraySet) this.f), i, mVar, 10));
    }

    public void e() {
        boolean z;
        if (this.b) {
            if (java.lang.Thread.currentThread() == ((java.lang.Thread) this.c)) {
                z = true;
            } else {
                z = false;
            }
            com.google.common.base.Preconditions.checkState(z);
        }
        synchronized (this.i) {
            this.a = true;
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f).iterator();
        while (it.hasNext()) {
            k9.o oVar = (k9.o) it.next();
            k9.n nVar = (k9.n) this.e;
            oVar.d = true;
            if (nVar != null && oVar.c) {
                oVar.c = false;
                nVar.a(oVar.a, oVar.b.c());
            }
        }
        ((java.util.concurrent.CopyOnWriteArraySet) this.f).clear();
    }

    public void f(java.lang.Object obj) {
        boolean z;
        if (this.b) {
            if (java.lang.Thread.currentThread() == ((java.lang.Thread) this.c)) {
                z = true;
            } else {
                z = false;
            }
            com.google.common.base.Preconditions.checkState(z);
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) this.f;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            k9.o oVar = (k9.o) it.next();
            if (oVar.a.equals(obj)) {
                k9.n nVar = (k9.n) this.e;
                oVar.d = true;
                if (nVar != null && oVar.c) {
                    oVar.c = false;
                    nVar.a(oVar.a, oVar.b.c());
                }
                copyOnWriteArraySet.remove(oVar);
            }
        }
    }

    public void g(int i, k9.m mVar) {
        d(i, mVar);
        c();
    }

    public qux(java.lang.Thread thread) {
        this(new java.util.concurrent.CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public qux(java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet, android.os.Looper looper, java.lang.Thread thread, k9.b bVar, k9.n nVar, boolean z) {
        this.c = thread;
        this.f = copyOnWriteArraySet;
        this.e = nVar;
        this.i = new java.lang.Object();
        this.g = new java.util.ArrayDeque();
        this.h = new java.util.ArrayDeque();
        if (looper != null && bVar != null && nVar != null) {
            this.d = ((k9.z) bVar).a(looper, new co.g(this, 1));
        } else {
            this.d = null;
        }
        this.b = z;
    }
}
