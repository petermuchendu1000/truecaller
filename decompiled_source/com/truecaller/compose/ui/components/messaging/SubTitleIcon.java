package com.truecaller.compose.ui.components.messaging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/compose/ui/components/messaging/SubTitleIcon;", "", "<init>", "(Ljava/lang/String;I)V", "ICON_GROUP", "ICON_DRAFT", "ICON_FAILED", "ICON_SENDING", "ICON_READ", "ICON_DELIVERED", "ICON_SENT", "ICON_GIF", "ICON_IMAGE", "ICON_VIDEO", "ICON_VCARD", "ICON_AUDIO", "ICON_DOCUMENT", "ICON_LOCATION", "ICON_SPAM", "ICON_FRAUD", "compose-ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class SubTitleIcon {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.compose.ui.components.messaging.SubTitleIcon[] $VALUES;
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_GROUP = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_GROUP", 0);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_DRAFT = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_DRAFT", 1);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_FAILED = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_FAILED", 2);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_SENDING = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_SENDING", 3);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_READ = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_READ", 4);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_DELIVERED = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_DELIVERED", 5);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_SENT = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_SENT", 6);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_GIF = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_GIF", 7);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_IMAGE = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_IMAGE", 8);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_VIDEO = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_VIDEO", 9);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_VCARD = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_VCARD", 10);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_AUDIO = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_AUDIO", 11);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_DOCUMENT = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_DOCUMENT", 12);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_LOCATION = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_LOCATION", 13);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_SPAM = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_SPAM", 14);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleIcon ICON_FRAUD = new com.truecaller.compose.ui.components.messaging.SubTitleIcon("ICON_FRAUD", 15);

    private static final /* synthetic */ com.truecaller.compose.ui.components.messaging.SubTitleIcon[] $values() {
        return new com.truecaller.compose.ui.components.messaging.SubTitleIcon[]{ICON_GROUP, ICON_DRAFT, ICON_FAILED, ICON_SENDING, ICON_READ, ICON_DELIVERED, ICON_SENT, ICON_GIF, ICON_IMAGE, ICON_VIDEO, ICON_VCARD, ICON_AUDIO, ICON_DOCUMENT, ICON_LOCATION, ICON_SPAM, ICON_FRAUD};
    }

    static {
        com.truecaller.compose.ui.components.messaging.SubTitleIcon[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SubTitleIcon(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.compose.ui.components.messaging.SubTitleIcon valueOf(java.lang.String str) {
        return (com.truecaller.compose.ui.components.messaging.SubTitleIcon) java.lang.Enum.valueOf(com.truecaller.compose.ui.components.messaging.SubTitleIcon.class, str);
    }

    public static com.truecaller.compose.ui.components.messaging.SubTitleIcon[] values() {
        return (com.truecaller.compose.ui.components.messaging.SubTitleIcon[]) $VALUES.clone();
    }
}
