package com.truecaller.compose.ui.components.messaging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/compose/ui/components/messaging/SubTitleStatus;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS_FAILED", "STATUS_TRANSPORT", "STATUS_NONE", "compose-ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class SubTitleStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.compose.ui.components.messaging.SubTitleStatus[] $VALUES;
    public static final com.truecaller.compose.ui.components.messaging.SubTitleStatus STATUS_FAILED = new com.truecaller.compose.ui.components.messaging.SubTitleStatus("STATUS_FAILED", 0);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleStatus STATUS_TRANSPORT = new com.truecaller.compose.ui.components.messaging.SubTitleStatus("STATUS_TRANSPORT", 1);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleStatus STATUS_NONE = new com.truecaller.compose.ui.components.messaging.SubTitleStatus("STATUS_NONE", 2);

    private static final /* synthetic */ com.truecaller.compose.ui.components.messaging.SubTitleStatus[] $values() {
        return new com.truecaller.compose.ui.components.messaging.SubTitleStatus[]{STATUS_FAILED, STATUS_TRANSPORT, STATUS_NONE};
    }

    static {
        com.truecaller.compose.ui.components.messaging.SubTitleStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SubTitleStatus(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.compose.ui.components.messaging.SubTitleStatus valueOf(java.lang.String str) {
        return (com.truecaller.compose.ui.components.messaging.SubTitleStatus) java.lang.Enum.valueOf(com.truecaller.compose.ui.components.messaging.SubTitleStatus.class, str);
    }

    public static com.truecaller.compose.ui.components.messaging.SubTitleStatus[] values() {
        return (com.truecaller.compose.ui.components.messaging.SubTitleStatus[]) $VALUES.clone();
    }
}
