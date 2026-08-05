package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class g implements com.google.android.gms.tasks.Continuation, com.google.android.gms.tasks.OnCompleteListener {
    public final /* synthetic */ com.truecaller.qa.QMActivity a;

    public void onComplete(com.google.android.gms.tasks.Task task) {
        int i = com.truecaller.qa.QMActivity.B1;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.a;
        appCompatActivity.getClass();
        if (task.isSuccessful()) {
            android.widget.Toast.makeText((android.content.Context) appCompatActivity, (java.lang.CharSequence) "Firebase token has been refereshed!", 0).show();
        } else {
            task.getException();
        }
    }

    public java.lang.Object then(com.google.android.gms.tasks.Task task) {
        int i = com.truecaller.qa.QMActivity.B1;
        if (task.isSuccessful()) {
            com.google.firebase.messaging.FirebaseMessaging firebaseMessaging = (com.google.firebase.messaging.FirebaseMessaging) this.a.u1.e.getValue();
            if (firebaseMessaging.f() == null) {
                return com.google.android.gms.tasks.Tasks.forResult((java.lang.Object) null);
            }
            com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
            java.util.concurrent.Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.NamedThreadFactory("Firebase-Messaging-Network-Io")).execute(new com.google.firebase.messaging.h(firebaseMessaging, taskCompletionSource, 1));
            return taskCompletionSource.getTask();
        }
        task.getException();
        return null;
    }
}
