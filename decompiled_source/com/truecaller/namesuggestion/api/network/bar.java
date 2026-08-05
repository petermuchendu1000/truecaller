package com.truecaller.namesuggestion.api.network;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/namesuggestion/api/network/bar;", "", "", "Lcom/truecaller/namesuggestion/api/network/NameSuggestionRestModel$bar;", "nameSuggestions", "Lwj3/a;", "Lokhttp3/ResponseBody;", "a", "(Ljava/util/List;)Lwj3/a;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public interface bar {
    @ak3.l("/v1/upload/nameSuggestion")
    @org.jetbrains.annotations.NotNull
    wj3.a<okhttp3.ResponseBody> a(@ak3.bar @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.namesuggestion.api.network.NameSuggestionRestModel.bar> nameSuggestions);
}
