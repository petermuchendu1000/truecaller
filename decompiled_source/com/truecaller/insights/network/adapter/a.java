package com.truecaller.insights.network.adapter;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J0\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/insights/network/adapter/a;", "", "", "appVersion", "countryCode", "offsetVersion", "Lcom/truecaller/insights/models/classifierseed/ClassifierSeedServiceModel;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldf3/bar;)Ljava/lang/Object;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
interface a {
    @ak3.c("/api/v1/updates-classifier/seed")
    @org.jetbrains.annotations.Nullable
    java.lang.Object a(@ak3.q("appVersion") @org.jetbrains.annotations.NotNull java.lang.String str, @ak3.q("country") @org.jetbrains.annotations.NotNull java.lang.String str2, @ak3.q("offsetVersion") @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.NotNull df3.bar<? super com.truecaller.insights.models.classifierseed.ClassifierSeedServiceModel> barVar);
}
