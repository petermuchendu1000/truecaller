package com.truecaller.videocallerid.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/videocallerid/utils/ReceiveVideoPreferences;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Everyone", "Contacts", "NoOne", "video-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReceiveVideoPreferences {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.videocallerid.utils.ReceiveVideoPreferences[] $VALUES;
    private final int value;
    public static final com.truecaller.videocallerid.utils.ReceiveVideoPreferences Everyone = new com.truecaller.videocallerid.utils.ReceiveVideoPreferences("Everyone", 0, 0);
    public static final com.truecaller.videocallerid.utils.ReceiveVideoPreferences Contacts = new com.truecaller.videocallerid.utils.ReceiveVideoPreferences("Contacts", 1, 1);
    public static final com.truecaller.videocallerid.utils.ReceiveVideoPreferences NoOne = new com.truecaller.videocallerid.utils.ReceiveVideoPreferences("NoOne", 2, 2);

    private static final /* synthetic */ com.truecaller.videocallerid.utils.ReceiveVideoPreferences[] $values() {
        return new com.truecaller.videocallerid.utils.ReceiveVideoPreferences[]{Everyone, Contacts, NoOne};
    }

    static {
        com.truecaller.videocallerid.utils.ReceiveVideoPreferences[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ReceiveVideoPreferences(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.videocallerid.utils.ReceiveVideoPreferences valueOf(java.lang.String str) {
        return (com.truecaller.videocallerid.utils.ReceiveVideoPreferences) java.lang.Enum.valueOf(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.class, str);
    }

    public static com.truecaller.videocallerid.utils.ReceiveVideoPreferences[] values() {
        return (com.truecaller.videocallerid.utils.ReceiveVideoPreferences[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
