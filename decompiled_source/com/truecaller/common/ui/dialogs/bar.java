package com.truecaller.common.ui.dialogs;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class bar implements androidx.lifecycle.r0 {
    public final /* synthetic */ kotlin.jvm.functions.Function0 a;
    public final /* synthetic */ kotlin.jvm.functions.Function1 b;
    public final /* synthetic */ kotlin.jvm.functions.Function1 c;
    public final /* synthetic */ androidx.lifecycle.o1 d;

    public bar(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.lifecycle.o1 o1Var) {
        this.a = function0;
        this.b = function1;
        this.c = function12;
        this.d = o1Var;
    }

    public final void a(java.lang.Object obj) {
        e41.d dVar = (e41.d) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "value");
        if (kotlin.jvm.internal.Intrinsics.b(dVar, e41.b.b)) {
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.b(dVar, e41.b.a)) {
            kotlin.jvm.functions.Function0 function0 = this.a;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (dVar instanceof e41.c) {
            this.b.invoke(java.lang.Boolean.valueOf(((e41.c) dVar).a));
        }
        kotlin.jvm.functions.Function1 function1 = this.c;
        if (function1 != null) {
            function1.invoke(dVar);
        }
        ((e41.e) this.d.getValue()).o().j(this);
    }
}
