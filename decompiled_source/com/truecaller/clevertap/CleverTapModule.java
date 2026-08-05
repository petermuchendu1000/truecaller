package com.truecaller.clevertap;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/truecaller/clevertap/CleverTapModule;", "", "Ljz0/j;", "impl", "Lcom/truecaller/clevertap/CleverTapManager;", "bindCleverTapManager", "(Ljz0/j;)Lcom/truecaller/clevertap/CleverTapManager;", "Ljz0/g;", "Ljz0/bar;", "bindCleverTapAPIWrapper", "(Ljz0/g;)Ljz0/bar;", "Ljz0/h;", "Ljz0/k;", "bindCleverTapFcmMessageHandler", "(Ljz0/h;)Ljz0/k;", "Companion", "jz0/l", "clevertap_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public interface CleverTapModule {

    @org.jetbrains.annotations.NotNull
    public static final jz0.l Companion = jz0.l.a;

    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    jz0.bar bindCleverTapAPIWrapper(@org.jetbrains.annotations.NotNull jz0.g impl);

    @org.jetbrains.annotations.NotNull
    jz0.k bindCleverTapFcmMessageHandler(@org.jetbrains.annotations.NotNull jz0.h impl);

    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    com.truecaller.clevertap.CleverTapManager bindCleverTapManager(@org.jetbrains.annotations.NotNull jz0.j impl);
}
