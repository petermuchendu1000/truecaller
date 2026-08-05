package com.truecaller.account.network;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H§@¢\u0006\u0004\b\u0014\u0010\u0013J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\t2\b\b\u0001\u0010\b\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\t2\b\b\u0001\u0010\b\u001a\u00020\u001dH'¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\t2\b\b\u0001\u0010\"\u001a\u00020!H'¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\tH'¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\b\u001a\u00020)H'¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\b\u001a\u00020\rH'¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001a0\t2\b\b\u0001\u0010/\u001a\u00020.H'¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\b\u0012\u0004\u0012\u0002020\tH'¢\u0006\u0004\b3\u0010(J\u0010\u00105\u001a\u000204H§@¢\u0006\u0004\b5\u0010\u0013J \u00108\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\b\b\u0001\u00107\u001a\u000206H§@¢\u0006\u0004\b8\u00109¨\u0006:À\u0006\u0003"}, d2 = {"Lcom/truecaller/account/network/baz;", "", "", "", "header", "Lh31/c;", "targetDomain", "Lcom/truecaller/account/network/SendTokenRequestDto;", "requestDto", "Lwj3/a;", "Lcom/truecaller/account/network/TokenResponseDto;", "h", "(Ljava/util/Map;Lh31/c;Lcom/truecaller/account/network/SendTokenRequestDto;)Lwj3/a;", "Lcom/truecaller/account/network/VerifyTokenRequestDto;", "n", "(Lh31/c;Lcom/truecaller/account/network/VerifyTokenRequestDto;)Lwj3/a;", "Lwj3/k0;", "", "m", "(Ldf3/bar;)Ljava/lang/Object;", "b", "Lcom/truecaller/account/network/DeactivateAccountRequest;", "deactivateAccountRequest", "d", "(Lcom/truecaller/account/network/DeactivateAccountRequest;Ldf3/bar;)Ljava/lang/Object;", "Lcom/truecaller/account/network/InstallationDetailsDto;", "Lokhttp3/ResponseBody;", "g", "(Lcom/truecaller/account/network/InstallationDetailsDto;)Lwj3/a;", "Lcom/truecaller/account/network/CheckCredentialsRequestDto;", "Lcom/truecaller/account/network/CheckCredentialsResponseSuccessDto;", "l", "(Lcom/truecaller/account/network/CheckCredentialsRequestDto;)Lwj3/a;", "Lcom/truecaller/account/network/ExchangeCredentialsRequestDto;", "request", "Lcom/truecaller/account/network/ExchangeCredentialsResponseDto;", "k", "(Lcom/truecaller/account/network/ExchangeCredentialsRequestDto;)Lwj3/a;", "Lcom/truecaller/account/network/TemporaryTokenDto;", "c", "()Lwj3/a;", "Lcom/truecaller/account/network/AddSecondaryNumberRequestDto;", "o", "(Lcom/truecaller/account/network/AddSecondaryNumberRequestDto;)Lwj3/a;", "e", "(Lcom/truecaller/account/network/VerifyTokenRequestDto;)Lwj3/a;", "Lcom/truecaller/account/network/DeleteSecondaryNumberRequestDto;", "deleteSecondaryNumberDto", "a", "(Lcom/truecaller/account/network/DeleteSecondaryNumberRequestDto;)Lwj3/a;", "Lcom/truecaller/account/network/AccountPhoneNumbersResponseDto;", "j", "Lcom/truecaller/account/network/CallHeroTokenDto;", "i", "Lcom/truecaller/account/network/TermsConsentVersionRequest;", "termsVersionDto", "f", "(Lcom/truecaller/account/network/TermsConsentVersionRequest;Ldf3/bar;)Ljava/lang/Object;", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public interface baz {
    @ak3.l("/v1/deleteSecondaryNumber")
    @org.jetbrains.annotations.NotNull
    wj3.a<okhttp3.ResponseBody> a(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.account.network.DeleteSecondaryNumberRequestDto deleteSecondaryNumberDto);

    @ak3.l("/v1/deactivate")
    @org.jetbrains.annotations.Nullable
    java.lang.Object b(@org.jetbrains.annotations.NotNull df3.bar<? super wj3.k0<kotlin.Unit>> barVar);

    @ak3.c("/v1/token/crossDomain")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.account.network.TemporaryTokenDto> c();

    @ak3.l("/v1/deactivate")
    @org.jetbrains.annotations.Nullable
    java.lang.Object d(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.account.network.DeactivateAccountRequest deactivateAccountRequest, @org.jetbrains.annotations.NotNull df3.bar<? super wj3.k0<kotlin.Unit>> barVar);

    @ak3.l("/v1/verifySecondaryNumber")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.account.network.TokenResponseDto> e(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.account.network.VerifyTokenRequestDto requestDto);

    @ak3.l("/v1/terms/accept")
    @org.jetbrains.annotations.Nullable
    java.lang.Object f(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.account.network.TermsConsentVersionRequest termsConsentVersionRequest, @org.jetbrains.annotations.NotNull df3.bar<? super wj3.k0<okhttp3.ResponseBody>> barVar);

    @ak3.m("/v1/installation")
    @org.jetbrains.annotations.NotNull
    wj3.a<okhttp3.ResponseBody> g(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.account.network.InstallationDetailsDto requestDto);

    @ak3.l("/v3/sendOnboardingOtp")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.account.network.TokenResponseDto> h(@ak3.g @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> header, @ak3.u @org.jetbrains.annotations.NotNull h31.c targetDomain, @ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.account.network.SendTokenRequestDto requestDto);

    @ak3.l("/v1/callhero/token")
    @org.jetbrains.annotations.Nullable
    java.lang.Object i(@org.jetbrains.annotations.NotNull df3.bar<? super com.truecaller.account.network.CallHeroTokenDto> barVar);

    @ak3.c("/v1/phoneNumbers")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.account.network.AccountPhoneNumbersResponseDto> j();

    @ak3.l("/v1/credentials/exchange")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.account.network.ExchangeCredentialsResponseDto> k(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.account.network.ExchangeCredentialsRequestDto request);

    @ak3.l("/v2.2/credentials/check")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.account.network.CheckCredentialsResponseSuccessDto> l(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.account.network.CheckCredentialsRequestDto requestDto);

    @ak3.l("/v1/deactivateAndDelete")
    @org.jetbrains.annotations.Nullable
    java.lang.Object m(@org.jetbrains.annotations.NotNull df3.bar<? super wj3.k0<kotlin.Unit>> barVar);

    @ak3.l("/v1/verifyOnboardingOtp")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.account.network.TokenResponseDto> n(@ak3.u @org.jetbrains.annotations.NotNull h31.c targetDomain, @ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.account.network.VerifyTokenRequestDto requestDto);

    @ak3.l("/v1/addSecondaryNumber")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.account.network.TokenResponseDto> o(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.account.network.AddSecondaryNumberRequestDto requestDto);
}
