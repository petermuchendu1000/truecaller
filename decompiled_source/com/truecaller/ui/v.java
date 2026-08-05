package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class v extends androidx.fragment.app.Fragment {
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);
    public fy2.f d;

    public void R4() {
    }

    public final boolean S4() {
        if (getActivity() != null && !getActivity().isFinishing()) {
            return false;
        }
        return true;
    }

    public final void T4(boolean z) {
        if (S4()) {
            return;
        }
        try {
            if (this.d == null) {
                this.d = new fy2.f(getActivity(), z);
            }
            this.d.show();
        } catch (java.lang.Exception e) {
            o82.a.B("TCActivity Exception while showing loading dialog", e);
        }
    }

    public final void U4(int i) {
        android.content.Context context = getContext();
        if (context != null) {
            android.widget.Toast.makeText(context, i, 0).show();
        }
    }

    public final void e() {
        if (!S4()) {
            try {
                fy2.f fVar = this.d;
                if (fVar != null) {
                    fVar.dismiss();
                }
            } catch (java.lang.Exception e) {
                o82.a.B("TCActivity Exception while dismissing loading dialog", e);
            }
        }
    }

    public void onAttach(android.app.Activity activity) {
        activity.getApplication().d();
        super.onAttach(activity);
        this.c.set(true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        R4();
    }

    public void onDetach() {
        super.onDetach();
        this.c.set(false);
    }

    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if0.y1.L(strArr, iArr);
    }

    public final void onResume() {
        super.onResume();
        if (!getActivity().getApplication().d()) {
            getActivity().finish();
        }
    }

    public final void onStop() {
        e();
        this.d = null;
        super.onStop();
    }

    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        if (isAdded() && this.c.get()) {
            return;
        }
        requireActivity().finish();
    }
}
