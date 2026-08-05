package com.truecaller.cloudtelephony.callrecording.ui.details;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class o extends dd.baz {
    public final /* synthetic */ int v = 0;
    public final java.lang.Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.fragment.app.FragmentActivity fragmentActivity, com.truecaller.cloudtelephony.callrecording.data.CallRecording callRecording) {
        super(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callRecording, "callRecording");
        this.w = callRecording;
    }

    public boolean b(long j) {
        switch (this.v) {
            case 1:
                long j2 = j / 2;
                if (j2 < ((java.util.ArrayList) this.w).size() && getItemId((int) j2) == j) {
                    return true;
                }
                return false;
            default:
                return super.b(j);
        }
    }

    public final androidx.fragment.app.Fragment c(int i) {
        switch (this.v) {
            case 0:
                com.truecaller.cloudtelephony.callrecording.data.CallRecording callRecording = (com.truecaller.cloudtelephony.callrecording.data.CallRecording) this.w;
                if (i != 0) {
                    if (i == 1) {
                        e01.baz bazVar = f01.bar.o;
                        java.lang.String str = callRecording.a;
                        bazVar.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "callRecordingId");
                        f01.bar barVar = new f01.bar();
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("extra_call_recording_id", str);
                        barVar.setArguments(bundle);
                        return barVar;
                    }
                    throw new java.lang.IllegalArgumentException(bar.k(i, "Invalid position: "));
                }
                e01.baz bazVar2 = e01.qux.n;
                java.lang.String str2 = callRecording.h;
                com.truecaller.cloudtelephony.callrecording.data.CallRecordingSummaryStatus callRecordingSummaryStatus = callRecording.i;
                bazVar2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callRecordingSummaryStatus, "value");
                e01.qux quxVar = new e01.qux();
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("extra_summary", str2);
                bundle2.putSerializable("extra_summary_status", callRecordingSummaryStatus);
                quxVar.setArguments(bundle2);
                return quxVar;
            default:
                q41.baz bazVar3 = (q41.baz) ((java.util.ArrayList) this.w).get(i);
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) bazVar3.a.invoke();
                bazVar3.b = fragment;
                return fragment;
        }
    }

    public final int getItemCount() {
        switch (this.v) {
            case 0:
                return 2;
            default:
                return ((java.util.ArrayList) this.w).size();
        }
    }

    public long getItemId(int i) {
        switch (this.v) {
            case 1:
                androidx.fragment.app.Fragment fragment = ((q41.baz) ((java.util.ArrayList) this.w).get(i)).b;
                return i * 2;
            default:
                return super.getItemId(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q41.c cVar, androidx.fragment.app.Fragment fragment) {
        super(fragment.getChildFragmentManager(), fragment.getLifecycle());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "hostFragment");
        this.w = new java.util.ArrayList();
    }
}
