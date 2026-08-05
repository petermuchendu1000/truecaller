package com.truecaller.push;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class qux {
    public final java.lang.String a;
    public final com.truecaller.push.PushProviderService b;

    public qux(com.truecaller.push.PushProviderService pushProviderService, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "token");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProviderService, "provider");
        this.a = str;
        this.b = pushProviderService;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.push.qux)) {
            return false;
        }
        com.truecaller.push.qux quxVar = (com.truecaller.push.qux) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, quxVar.a) && this.b == quxVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "PushId(token=" + this.a + ", provider=" + this.b + ")";
    }
}
