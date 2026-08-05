package com.truecaller.utils.extensions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/utils/extensions/Scheme;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FILE", "CONTENT", "TEL", "generic_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class Scheme {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.utils.extensions.Scheme[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.utils.extensions.Scheme FILE = new com.truecaller.utils.extensions.Scheme("FILE", 0, "file");
    public static final com.truecaller.utils.extensions.Scheme CONTENT = new com.truecaller.utils.extensions.Scheme("CONTENT", 1, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
    public static final com.truecaller.utils.extensions.Scheme TEL = new com.truecaller.utils.extensions.Scheme("TEL", 2, "tel");

    private static final /* synthetic */ com.truecaller.utils.extensions.Scheme[] $values() {
        return new com.truecaller.utils.extensions.Scheme[]{FILE, CONTENT, TEL};
    }

    static {
        com.truecaller.utils.extensions.Scheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Scheme(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.utils.extensions.Scheme valueOf(java.lang.String str) {
        return (com.truecaller.utils.extensions.Scheme) java.lang.Enum.valueOf(com.truecaller.utils.extensions.Scheme.class, str);
    }

    public static com.truecaller.utils.extensions.Scheme[] values() {
        return (com.truecaller.utils.extensions.Scheme[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
