package com.truecaller.profile.impl.remote;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class t extends x52.bar implements x52.qux {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(cd3.bar barVar) {
        super(barVar, com.truecaller.common.network.util.KnownEndpoints.PROFILE, 10);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "stubCreator");
    }

    public final jd3.bar a(gd3.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "channel");
        gd3.qux quxVar = gd3.qux.j;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quxVar, "DEFAULT");
        return new we0.h(aVar, quxVar);
    }
}
