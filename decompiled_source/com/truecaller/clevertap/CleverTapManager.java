package com.truecaller.clevertap;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000fH&¢\u0006\u0004\b\r\u0010\u0010J#\u0010\r\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0011H&¢\u0006\u0004\b\r\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0011H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H&¢\u0006\u0004\b\u0019\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/truecaller/clevertap/CleverTapManager;", "", "Lcom/truecaller/push/PushProviderService;", "engine", "", "pushId", "", "updatePushRegistrationId", "(Lcom/truecaller/push/PushProviderService;Ljava/lang/String;)V", "initWithoutActivityLifeCycleCallBacks", "()V", "Ljz0/p;", "profileUpdate", "updateProfile", "(Ljz0/p;)V", "Ljz0/q;", "(Ljz0/q;)V", "", "(Ljava/util/Map;)V", "Lcom/truecaller/clevertap/CleverTapProfile;", "profile", "onUserLogin", "(Lcom/truecaller/clevertap/CleverTapProfile;)V", "eventName", "eventActions", "push", "(Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "mayBeProcessNotificationExtras", "(Landroid/content/Intent;)V", "clevertap_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public interface CleverTapManager {
    void initWithoutActivityLifeCycleCallBacks();

    void mayBeProcessNotificationExtras(@org.jetbrains.annotations.Nullable android.content.Intent intent);

    void onUserLogin(@org.jetbrains.annotations.NotNull com.truecaller.clevertap.CleverTapProfile profile);

    void push(@org.jetbrains.annotations.NotNull java.lang.String eventName);

    void push(@org.jetbrains.annotations.NotNull java.lang.String eventName, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> eventActions);

    void updateProfile(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> profileUpdate);

    void updateProfile(@org.jetbrains.annotations.NotNull jz0.p profileUpdate);

    void updateProfile(@org.jetbrains.annotations.NotNull jz0.q profileUpdate);

    void updatePushRegistrationId(@org.jetbrains.annotations.NotNull com.truecaller.push.PushProviderService engine, @org.jetbrains.annotations.NotNull java.lang.String pushId);
}
