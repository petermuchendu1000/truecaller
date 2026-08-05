package com.truecaller.qa.premium;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/qa/premium/QaPremiumReportDialog;", "Li/x;", "<init>", "()V", "Type", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class QaPremiumReportDialog extends c12.baz {
    public tf2.s0 i;
    public is0.qux j;
    public ki2.h k;
    public com.truecaller.qa.premium.QaPremiumReportDialog.Type l;
    public final kotlin.Lazy m;
    public final kotlin.Lazy n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/qa/premium/QaPremiumReportDialog$Type;", "", "<init>", "(Ljava/lang/String;I)V", "PREMIUM_REPORT", "PRODUCTS_REPORT", "DISCOUNT_STRINGS", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final class Type {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.qa.premium.QaPremiumReportDialog.Type[] $VALUES;
        public static final com.truecaller.qa.premium.QaPremiumReportDialog.Type PREMIUM_REPORT = new com.truecaller.qa.premium.QaPremiumReportDialog.Type("PREMIUM_REPORT", 0);
        public static final com.truecaller.qa.premium.QaPremiumReportDialog.Type PRODUCTS_REPORT = new com.truecaller.qa.premium.QaPremiumReportDialog.Type("PRODUCTS_REPORT", 1);
        public static final com.truecaller.qa.premium.QaPremiumReportDialog.Type DISCOUNT_STRINGS = new com.truecaller.qa.premium.QaPremiumReportDialog.Type("DISCOUNT_STRINGS", 2);

        private static final /* synthetic */ com.truecaller.qa.premium.QaPremiumReportDialog.Type[] $values() {
            return new com.truecaller.qa.premium.QaPremiumReportDialog.Type[]{PREMIUM_REPORT, PRODUCTS_REPORT, DISCOUNT_STRINGS};
        }

        static {
            com.truecaller.qa.premium.QaPremiumReportDialog.Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private Type(java.lang.String str, int i) {
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.qa.premium.QaPremiumReportDialog.Type valueOf(java.lang.String str) {
            return (com.truecaller.qa.premium.QaPremiumReportDialog.Type) java.lang.Enum.valueOf(com.truecaller.qa.premium.QaPremiumReportDialog.Type.class, str);
        }

        public static com.truecaller.qa.premium.QaPremiumReportDialog.Type[] values() {
            return (com.truecaller.qa.premium.QaPremiumReportDialog.Type[]) $VALUES.clone();
        }
    }

    public QaPremiumReportDialog() {
        super(4);
        this.m = gj.m.K(this, 2131366066);
        this.n = gj.m.K(this, 2131364423);
    }

    public static final com.truecaller.qa.premium.QaPremiumReportDialog k5(com.truecaller.qa.premium.QaPremiumReportDialog.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        com.truecaller.qa.premium.QaPremiumReportDialog qaPremiumReportDialog = new com.truecaller.qa.premium.QaPremiumReportDialog();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putSerializable("extra_type", type);
        qaPremiumReportDialog.setArguments(bundle);
        return qaPremiumReportDialog;
    }

    public final void onCreate(android.os.Bundle bundle) {
        java.io.Serializable serializable;
        super/*androidx.fragment.app.t*/.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (serializable = arguments.getSerializable("extra_type")) == null) {
            serializable = com.truecaller.qa.premium.QaPremiumReportDialog.Type.PREMIUM_REPORT;
        }
        kotlin.jvm.internal.Intrinsics.e(serializable, "null cannot be cast to non-null type com.truecaller.qa.premium.QaPremiumReportDialog.Type");
        this.l = (com.truecaller.qa.premium.QaPremiumReportDialog.Type) serializable;
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(2131559032, viewGroup, false);
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.qa.premium.baz(this, null), 3);
    }
}
