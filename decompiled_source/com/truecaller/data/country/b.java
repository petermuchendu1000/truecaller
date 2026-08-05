package com.truecaller.data.country;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/data/country/b;", "", "", "checksum", "Lwj3/a;", "Lcom/truecaller/data/country/CountryListDto;", "get", "(Ljava/lang/String;)Lwj3/a;", "data-country_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
interface b {
    @ak3.c("/v1/countryList")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.data.country.CountryListDto> get(@ak3.q("checksum") @org.jetbrains.annotations.Nullable java.lang.String checksum);
}
