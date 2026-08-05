package com.truecaller.browser.extension.remote;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/browser/extension/remote/a;", "", "Lcom/truecaller/browser/extension/remote/dto/BrowserExtensionAccountSyncRequestDto;", "requestDto", "Lwj3/a;", "Lokhttp3/ResponseBody;", "a", "(Lcom/truecaller/browser/extension/remote/dto/BrowserExtensionAccountSyncRequestDto;Ldf3/bar;)Ljava/lang/Object;", "browser-extension_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
interface a {
    @ak3.l("/beta/extension/accounts/sync")
    @org.jetbrains.annotations.Nullable
    java.lang.Object a(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.browser.extension.remote.dto.BrowserExtensionAccountSyncRequestDto browserExtensionAccountSyncRequestDto, @org.jetbrains.annotations.NotNull df3.bar<? super wj3.a<okhttp3.ResponseBody>> barVar);
}
