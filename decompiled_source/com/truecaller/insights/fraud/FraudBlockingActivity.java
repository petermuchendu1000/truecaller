package com.truecaller.insights.fraud;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/insights/fraud/FraudBlockingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "qk/b1", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudBlockingActivity extends com.truecaller.insights.fraud.Hilt_FraudBlockingActivity {
    public static final /* synthetic */ int f0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(jv1.a.class), new jv1.baz(this, 1), new jv1.baz(this, 0), new jv1.baz(this, 2));
    public xj0.bar e0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        java.util.List list;
        com.truecaller.commentfeedback.db.NumberAndType numberAndType;
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            jv1.a aVar = (jv1.a) this.d0.getValue();
            zj0.baz bazVar = this.e0;
            java.lang.String str = null;
            if (bazVar != null) {
                com.truecaller.blocking.ui.BlockResult c = bazVar.c(intent);
                aVar.getClass();
                if (c != null && c.j) {
                    com.truecaller.blocking.ui.BlockRequest blockRequest = (com.truecaller.blocking.ui.BlockRequest) aVar.e.getValue();
                    if (blockRequest != null && (list = blockRequest.d) != null && (numberAndType = (com.truecaller.commentfeedback.db.NumberAndType) kotlin.collections.CollectionsKt.firstOrNull(list)) != null) {
                        str = numberAndType.a;
                    }
                    ax1.bar.c(aVar.d, str, c, "fraud-warnings", com.truecaller.insights.feedbackrevamp.RevampFeedbackType.FRAUD);
                }
            } else {
                kotlin.jvm.internal.Intrinsics.n("blockingActivityRouter");
                throw null;
            }
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.insights.fraud.Hilt_FraudBlockingActivity
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.Object obj;
        com.truecaller.data.entity.messaging.Participant participant;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
        android.os.Bundle extras = getIntent().getExtras();
        if (extras != null) {
            obj = extras.get("participant");
        } else {
            obj = null;
        }
        if (obj instanceof com.truecaller.data.entity.messaging.Participant) {
            participant = (com.truecaller.data.entity.messaging.Participant) obj;
        } else {
            participant = null;
        }
        if (participant == null) {
            finish();
            return;
        }
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new jv1.bar(this, null, 1), 3);
        jv1.a aVar = (jv1.a) this.d0.getValue();
        aVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(participant, "participant");
        fg3.h0.J(androidx.lifecycle.g1.l(aVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new jd3.qux(aVar, participant, (df3.bar) null, 13), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPause() {
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super.onStart();
        overridePendingTransition(0, 0);
    }
}
