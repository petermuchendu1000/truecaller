package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class n1 {
    public final kotlin.text.Regex a;

    public n1(kotlin.text.Regex regex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "pattern");
        this.a = regex;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.truecaller.account.domain.auth.n1)) {
            kotlin.text.Regex regex = this.a;
            java.lang.String pattern = regex.a.pattern();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pattern, "pattern(...)");
            kotlin.text.Regex regex2 = ((com.truecaller.account.domain.auth.n1) obj).a;
            java.lang.String pattern2 = regex2.a.pattern();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pattern2, "pattern(...)");
            if (kotlin.jvm.internal.Intrinsics.b(pattern, pattern2) && kotlin.jvm.internal.Intrinsics.b(regex.d(), regex2.d())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        kotlin.text.Regex regex = this.a;
        java.lang.String pattern = regex.a.pattern();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pattern, "pattern(...)");
        return java.util.Objects.hash(pattern, regex.d());
    }

    public final java.lang.String toString() {
        return "Path(pattern=" + this.a + ")";
    }
}
