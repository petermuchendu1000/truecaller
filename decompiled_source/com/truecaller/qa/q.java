package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class q extends android.os.AsyncTask {
    public final java.lang.ref.WeakReference a;

    public q(com.truecaller.qa.QMActivity qMActivity) {
        this.a = new java.lang.ref.WeakReference(qMActivity);
    }

    @Override // android.os.AsyncTask
    public final java.lang.Object doInBackground(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) this.a.get();
        if (context == null) {
            return java.lang.Boolean.FALSE;
        }
        com.bumptech.glide.baz a = com.bumptech.glide.baz.a(context.getApplicationContext());
        a.getClass();
        char[] cArr = qg.h.a;
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            ((id3.b0) a.a.g).a().clear();
            return java.lang.Boolean.TRUE;
        }
        throw new java.lang.IllegalArgumentException("You must call this method on a background thread");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(java.lang.Object obj) {
        android.content.Context context;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        super.onPostExecute(bool);
        if (bool.booleanValue() && (context = (android.content.Context) this.a.get()) != null) {
            android.widget.Toast.makeText(context, "Glide disk cache cleared", 0).show();
        }
    }
}
