package com.truecaller.remoteconfig.firebase;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class c implements com.google.android.gms.tasks.OnCompleteListener {
    public static final com.truecaller.remoteconfig.firebase.c a = new java.lang.Object();

    public final void onComplete(com.google.android.gms.tasks.Task task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "t");
        task.isSuccessful();
    }
}
