package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class e implements t7.j0 {
    public static final com.truecaller.account.domain.auth.e a = new java.lang.Object();

    public final java.lang.Object getDefaultValue() {
        com.truecaller.account.domain.auth.d e = com.truecaller.account.domain.auth.d.e();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "getDefaultInstance(...)");
        return e;
    }

    public final java.lang.Object readFrom(java.io.InputStream inputStream, df3.bar barVar) {
        try {
            com.truecaller.account.domain.auth.d h = com.truecaller.account.domain.auth.d.h(inputStream);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "parseFrom(...)");
            return h;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Cannot read proto.", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
            com.truecaller.log.AssertionUtil.shouldNeverHappen(new java.io.IOException("Cannot read proto.", e), new java.lang.String[0]);
            com.truecaller.account.domain.auth.d e2 = com.truecaller.account.domain.auth.d.e();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e2, "getDefaultInstance(...)");
            return e2;
        }
    }

    public final java.lang.Object writeTo(java.lang.Object obj, java.io.OutputStream outputStream, df3.bar barVar) {
        ((com.truecaller.account.domain.auth.d) obj).writeTo(outputStream);
        return kotlin.Unit.a;
    }
}
