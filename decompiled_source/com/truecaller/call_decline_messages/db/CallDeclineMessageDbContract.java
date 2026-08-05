package com.truecaller.call_decline_messages.db;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/truecaller/call_decline_messages/db/CallDeclineMessageDbContract;", "", "<init>", "()V", "TABLE_NAME", "", "ID_COLUMN", "MESSAGE_COLUMN", "TYPE_COLUMN", "call-decline-messages_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallDeclineMessageDbContract {

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ID_COLUMN = "id";

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract INSTANCE = new com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract();

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MESSAGE_COLUMN = "message";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TABLE_NAME = "call_decline_message";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TYPE_COLUMN = "type";

    private CallDeclineMessageDbContract() {
    }
}
