package com.truecaller.wizard.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/wizard/api/WizardCompletionType;", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE, "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "NORMAL", "SECONDARY_NUMBER", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WizardCompletionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wizard.api.WizardCompletionType[] $VALUES;
    public static final com.truecaller.wizard.api.WizardCompletionType NORMAL = new com.truecaller.wizard.api.WizardCompletionType("NORMAL", 0, 1);
    public static final com.truecaller.wizard.api.WizardCompletionType SECONDARY_NUMBER = new com.truecaller.wizard.api.WizardCompletionType("SECONDARY_NUMBER", 1, 2);
    private final int type;

    private static final /* synthetic */ com.truecaller.wizard.api.WizardCompletionType[] $values() {
        return new com.truecaller.wizard.api.WizardCompletionType[]{NORMAL, SECONDARY_NUMBER};
    }

    static {
        com.truecaller.wizard.api.WizardCompletionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private WizardCompletionType(java.lang.String str, int i, int i2) {
        this.type = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wizard.api.WizardCompletionType valueOf(java.lang.String str) {
        return (com.truecaller.wizard.api.WizardCompletionType) java.lang.Enum.valueOf(com.truecaller.wizard.api.WizardCompletionType.class, str);
    }

    public static com.truecaller.wizard.api.WizardCompletionType[] values() {
        return (com.truecaller.wizard.api.WizardCompletionType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
