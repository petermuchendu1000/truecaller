package com.truecaller.insights.ui.qa.view;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/insights/ui/qa/view/InsightsQAActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "oe0/e", "ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsightsQAActivity extends com.truecaller.insights.ui.qa.view.Hilt_InsightsQAActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0027. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // com.truecaller.insights.ui.qa.view.Hilt_InsightsQAActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(android.os.Bundle bundle) {
        androidx.fragment.app.Fragment fragment;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        vy2.i.H(this);
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("qaPageToOpen");
        java.lang.String stringExtra2 = getIntent().getStringExtra("extras_param");
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -1929128887:
                    if (stringExtra.equals("ModelQAFragment")) {
                        fragment = new xy1.b0();
                        if (fragment != null) {
                            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
                            barVar.g(android.R.id.content, fragment, (java.lang.String) null);
                            barVar.l();
                            return;
                        }
                        return;
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                case -1824717841:
                    if (stringExtra.equals("InsightsParserSeedFetch")) {
                        fragment = new xy1.o();
                        if (fragment != null) {
                        }
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
                case -1542764875:
                    if (stringExtra.equals("FtsFragment")) {
                        fragment = new xy1.b();
                        if (fragment != null) {
                        }
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
                case -1491662423:
                    if (stringExtra.equals("NudgeListFragment")) {
                        fragment = new xy1.d0();
                        if (fragment != null) {
                        }
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
                case -1439192832:
                    if (stringExtra.equals("SenderResolutionTester")) {
                        fragment = new xy1.x0();
                        if (fragment != null) {
                        }
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
                case -1358078965:
                    if (stringExtra.equals("TextHighlightingFragment")) {
                        fragment = new xy1.b1();
                        if (fragment != null) {
                        }
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
                case -1160696077:
                    if (stringExtra.equals("InsightsBrandSearchTester")) {
                        fragment = new xy1.bar();
                        if (fragment != null) {
                        }
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
                case -844714961:
                    if (stringExtra.equals("SenderConfigTool")) {
                        fragment = new xy1.u();
                        if (fragment != null) {
                        }
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
                case -562673557:
                    if (stringExtra.equals("InsightsCategorizerSeedFetch")) {
                        fragment = new xy1.h();
                        if (fragment != null) {
                        }
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
                case -254198094:
                    if (stringExtra.equals("InsightsAddressFiltersFragment")) {
                        xy1.n0.m.getClass();
                        if (stringExtra2 != null) {
                            fragment = new xy1.n0();
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            bundle2.putString("address", stringExtra2);
                            fragment.setArguments(bundle2);
                            if (fragment != null) {
                            }
                        } else {
                            throw new java.lang.IllegalArgumentException("Address is null");
                        }
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
                case 577271001:
                    if (stringExtra.equals("InsightsUpdatesClassifierSeedFetch")) {
                        fragment = new xy1.k();
                        if (fragment != null) {
                        }
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
                case 614306529:
                    if (stringExtra.equals("InsightRowFFTester")) {
                        fragment = new xy1.p0();
                        if (fragment != null) {
                        }
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
                case 1232706939:
                    if (stringExtra.equals("TotalSmartCardsShownDialog")) {
                        fragment = new xy1.e1();
                        if (fragment != null) {
                        }
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
                case 1380045928:
                    if (stringExtra.equals("InsightsMalanaSeed")) {
                        fragment = new xy1.z();
                        if (fragment != null) {
                        }
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
                case 2065857583:
                    if (stringExtra.equals("InsightsSmsFeatureFilterTester")) {
                        fragment = new xy1.t0();
                        if (fragment != null) {
                        }
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
                case 2141318274:
                    if (stringExtra.equals("InsightsUpdatesClassifierTest")) {
                        fragment = new xy1.x();
                        if (fragment != null) {
                        }
                    }
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
                default:
                    android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Please provide a valid QA_PAGE_TO_OPEN option to open the required page", 1).show();
                    fragment = null;
                    if (fragment != null) {
                    }
                    break;
            }
        }
    }
}
