package com.truecaller.insights.network.adapter;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/insights/network/adapter/b;", "", "", "appVersion", "countryCode", "Lcom/truecaller/insights/network/adapter/InsightsCountryFeatures;", "a", "(Ljava/lang/String;Ljava/lang/String;Ldf3/bar;)Ljava/lang/Object;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
interface b {
    @ak3.c("/api/v1/feature-sync")
    @org.jetbrains.annotations.Nullable
    java.lang.Object a(@ak3.q("appVersion") @org.jetbrains.annotations.NotNull java.lang.String str, @ak3.q("country") @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull df3.bar<? super com.truecaller.insights.network.adapter.InsightsCountryFeatures> barVar);
}
