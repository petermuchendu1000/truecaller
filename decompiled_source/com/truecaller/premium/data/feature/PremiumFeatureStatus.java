package com.truecaller.premium.data.feature;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/premium/data/feature/PremiumFeatureStatus;", "", "", "identifier", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "Companion", "e92/m", "INCLUDED", "EXCLUDED", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumFeatureStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.feature.PremiumFeatureStatus[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final e92.m Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String identifier;
    public static final com.truecaller.premium.data.feature.PremiumFeatureStatus INCLUDED = new com.truecaller.premium.data.feature.PremiumFeatureStatus("INCLUDED", 0, "Included");
    public static final com.truecaller.premium.data.feature.PremiumFeatureStatus EXCLUDED = new com.truecaller.premium.data.feature.PremiumFeatureStatus("EXCLUDED", 1, "Excluded");

    private static final /* synthetic */ com.truecaller.premium.data.feature.PremiumFeatureStatus[] $values() {
        return new com.truecaller.premium.data.feature.PremiumFeatureStatus[]{INCLUDED, EXCLUDED};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [e92.m, java.lang.Object] */
    static {
        com.truecaller.premium.data.feature.PremiumFeatureStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private PremiumFeatureStatus(java.lang.String str, int i, java.lang.String str2) {
        this.identifier = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.data.feature.PremiumFeatureStatus fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        return e92.m.a(str);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.feature.PremiumFeatureStatus valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.feature.PremiumFeatureStatus) java.lang.Enum.valueOf(com.truecaller.premium.data.feature.PremiumFeatureStatus.class, str);
    }

    public static com.truecaller.premium.data.feature.PremiumFeatureStatus[] values() {
        return (com.truecaller.premium.data.feature.PremiumFeatureStatus[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIdentifier() {
        return this.identifier;
    }
}
