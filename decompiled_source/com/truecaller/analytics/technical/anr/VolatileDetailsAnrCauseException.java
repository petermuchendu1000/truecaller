package com.truecaller.analytics.technical.anr;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/analytics/technical/anr/VolatileDetailsAnrCauseException;", "Lcom/truecaller/analytics/technical/anr/NoDefaultStacktraceException;", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, "", "<init>", "(Ljava/lang/String;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
final class VolatileDetailsAnrCauseException extends com.truecaller.analytics.technical.anr.NoDefaultStacktraceException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VolatileDetailsAnrCauseException(@org.jetbrains.annotations.NotNull java.lang.String str) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
    }
}
