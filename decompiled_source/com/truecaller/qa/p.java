package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class p extends android.os.AsyncTask {
    public final /* synthetic */ int a = 2;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public p(a8.q qVar, q9.x xVar) {
        this.c = qVar;
        this.b = xVar;
    }

    @Override // android.os.AsyncTask
    public final java.lang.Object doInBackground(java.lang.Object[] objArr) {
        switch (this.a) {
            case 0:
                return ((n11.l) ((java.lang.ref.WeakReference) this.c).get()).c();
            case 1:
                ((gy.qux) ((java.lang.ref.WeakReference) this.c).get()).b(true, com.truecaller.account.api.LogoutContext.QA_MENU);
                return null;
            default:
                try {
                    return ((a8.q) this.c).a();
                } catch (java.lang.Exception unused) {
                    return null;
                }
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(java.lang.Object obj) {
        java.lang.String str;
        switch (this.a) {
            case 0:
                n11.baz bazVar = (n11.e) obj;
                if (bazVar != null && !(bazVar instanceof n11.a)) {
                    if (bazVar instanceof n11.d) {
                        str = "Secondary number deleted";
                    } else if (bazVar instanceof n11.baz) {
                        str = "Error deleting secondary number status:" + bazVar.a;
                    } else if (bazVar instanceof n11.qux) {
                        str = "No internet connection";
                    } else if (bazVar instanceof n11.b) {
                        str = "No secondary number to delete";
                    } else {
                        str = "Unknown result";
                    }
                } else {
                    str = "Unexpected error";
                }
                android.app.Activity activity = (android.app.Activity) ((java.lang.ref.WeakReference) this.b).get();
                if (activity != null) {
                    android.widget.Toast.makeText(activity, str, 0).show();
                    return;
                }
                return;
            case 1:
                android.app.Activity activity2 = (android.app.Activity) ((java.lang.ref.WeakReference) this.b).get();
                if (activity2 != null) {
                    y90.m6.O(activity2, com.truecaller.bottombar.BottomBarButtonType.CALLS, "qaLaunchContext");
                    activity2.finish();
                    return;
                }
                return;
            default:
                ve2.c.H((ve2.c) ((q9.x) this.b).b, (xb.b) obj);
                return;
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        switch (this.a) {
            case 0:
                super.onPreExecute();
                android.app.Activity activity = (android.app.Activity) ((java.lang.ref.WeakReference) this.b).get();
                if (activity != null) {
                    android.widget.Toast.makeText(activity, "Deleting secondary number", 0).show();
                    return;
                }
                return;
            default:
                super.onPreExecute();
                return;
        }
    }

    public p(com.truecaller.qa.QMActivity qMActivity, gy.qux quxVar) {
        this.b = new java.lang.ref.WeakReference(qMActivity);
        this.c = new java.lang.ref.WeakReference(quxVar);
    }

    public p(com.truecaller.qa.QMActivity qMActivity, n11.l lVar) {
        this.b = new java.lang.ref.WeakReference(qMActivity);
        this.c = new java.lang.ref.WeakReference(lVar);
    }
}
