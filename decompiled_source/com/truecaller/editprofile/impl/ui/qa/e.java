package com.truecaller.editprofile.impl.ui.qa;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class e {
    public final java.util.List a;

    public e(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "fields");
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.editprofile.impl.ui.qa.e) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.editprofile.impl.ui.qa.e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return com.appsflyer.internal.e.k("EditProfileConfigurationUI(fields=", ")", this.a);
    }
}
