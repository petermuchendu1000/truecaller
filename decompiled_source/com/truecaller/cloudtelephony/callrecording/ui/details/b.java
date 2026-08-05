package com.truecaller.cloudtelephony.callrecording.ui.details;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class b extends ed.e {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public /* synthetic */ b(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public void onPageScrollStateChanged(int i) {
        switch (this.a) {
            case 1:
                ((c80.l0) this.b).c(false);
                return;
            case 2:
                try {
                    java.util.Iterator it = ((java.util.ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((ed.e) it.next()).onPageScrollStateChanged(i);
                    }
                    return;
                } catch (java.util.ConcurrentModificationException e) {
                    throw new java.lang.IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 3:
                if (i == 1) {
                    com.truecaller.ads.mutliad.ui.container.MultiAdContainer multiAdContainer = (com.truecaller.ads.mutliad.ui.container.MultiAdContainer) this.b;
                    p80.bar barVar = multiAdContainer.c;
                    if (barVar.b) {
                        barVar.b = false;
                        android.os.Handler handler = multiAdContainer.getHandler();
                        if (handler != null) {
                            handler.removeCallbacks(multiAdContainer.d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        int i3 = this.a;
        java.lang.Object obj = this.b;
        switch (i3) {
            case 2:
                try {
                    java.util.Iterator it = ((java.util.ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((ed.e) it.next()).onPageScrolled(i, f, i2);
                    }
                    return;
                } catch (java.util.ConcurrentModificationException e) {
                    throw new java.lang.IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 3:
                int i4 = com.truecaller.ads.mutliad.ui.container.MultiAdContainer.i;
                ((com.truecaller.ads.mutliad.ui.container.MultiAdContainer) obj).u(f, i);
                return;
            default:
                return;
        }
    }

    public final void onPageSelected(int i) {
        int i2;
        int i3 = this.a;
        java.lang.Object obj = this.b;
        switch (i3) {
            case 0:
                com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity = (com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) obj;
                com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = callRecordingDetailsActivity.g0;
                if (nVar != null) {
                    fg3.h0.J(nVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ao1.baz(i, nVar, (df3.bar) null), 3);
                    com.google.android.material.chip.ChipGroup chipGroup = callRecordingDetailsActivity.t0().d.b;
                    if (i == 0) {
                        i2 = 2131366717;
                    } else {
                        i2 = 2131367138;
                    }
                    j02.baz bazVar = chipGroup.h;
                    jr.c cVar = (jr.c) ((java.util.HashMap) bazVar.d).get(java.lang.Integer.valueOf(i2));
                    if (cVar != null && bazVar.a(cVar)) {
                        bazVar.i();
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("presenter");
                throw null;
            case 1:
                ((c80.l0) obj).c(false);
                return;
            case 2:
                try {
                    java.util.Iterator it = ((java.util.ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((ed.e) it.next()).onPageSelected(i);
                    }
                    return;
                } catch (java.util.ConcurrentModificationException e) {
                    throw new java.lang.IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 3:
                com.truecaller.ads.mutliad.ui.container.MultiAdContainer multiAdContainer = (com.truecaller.ads.mutliad.ui.container.MultiAdContainer) obj;
                int i4 = com.truecaller.ads.mutliad.ui.container.MultiAdContainer.i;
                multiAdContainer.u(0.0f, i);
                if (i != multiAdContainer.g) {
                    multiAdContainer.g = i;
                    p80.baz bazVar2 = multiAdContainer.f;
                    if (bazVar2 != null) {
                        bazVar2.onPageSelected(i);
                        return;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("presenter");
                        throw null;
                    }
                }
                return;
            case 4:
                if (i == 0) {
                    ((com.truecaller.android.truemoji.keyboard.EmojiKeyboardView) obj).s.notifyDataSetChanged();
                    return;
                }
                return;
            default:
                com.truecaller.survey.qa.SurveyListQaActivity surveyListQaActivity = (com.truecaller.survey.qa.SurveyListQaActivity) obj;
                int i5 = com.truecaller.survey.qa.SurveyListQaActivity.g0;
                java.util.List a = surveyListQaActivity.u0().a();
                d41.a aVar = surveyListQaActivity.e0;
                if (aVar != null) {
                    aVar.e.setTitle("Survey " + (i + 1) + "/" + a.size());
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("binding");
                throw null;
        }
    }

    public b() {
        this.a = 2;
        this.b = new java.util.ArrayList(3);
    }
}
