package com.truecaller.push;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class i extends cl2.m {
    public final int c;
    public final java.lang.String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.SharedPreferences sharedPreferences) {
        super(sharedPreferences);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.c = 1;
        this.d = "push_notification_settings";
    }

    @Override // cl2.m
    public final int A() {
        return this.c;
    }

    @Override // cl2.m
    public final java.lang.String E() {
        return this.d;
    }

    @Override // cl2.m
    public final void W(int i, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (i < 1) {
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("tc.settings", 0);
            kotlin.jvm.internal.Intrinsics.d(sharedPreferences);
            java.lang.String[] strArr = {"gcmRegistrationId", "hcmPushToken"};
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "elements");
            cl2.m.M(this, sharedPreferences, kotlin.collections.v.l0(strArr));
        }
    }
}
