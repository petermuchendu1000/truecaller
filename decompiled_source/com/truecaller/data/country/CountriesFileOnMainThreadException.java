package com.truecaller.data.country;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/data/country/CountriesFileOnMainThreadException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "data-country_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
final class CountriesFileOnMainThreadException extends java.lang.RuntimeException {
    public CountriesFileOnMainThreadException() {
        super("Countries file shouldn't be read on the main thread");
    }
}
