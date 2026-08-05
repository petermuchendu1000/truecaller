package com.truecaller.contactrequest.persistence;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class bar {
    public final android.content.Context a;
    public final com.google.gson.Gson b;
    public final kotlin.Lazy c;

    public bar(android.content.Context context, com.google.gson.Gson gson) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gson, "gson");
        this.a = context;
        this.b = gson;
        this.c = kotlin.LazyKt.lazy(new t2.e(this, 13));
    }
}
