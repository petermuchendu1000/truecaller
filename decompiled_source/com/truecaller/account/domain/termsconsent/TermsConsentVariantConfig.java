package com.truecaller.account.domain.termsconsent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/account/domain/termsconsent/TermsConsentVariantConfig;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "oy/h", "NONE", "BLOCKING", "NON_BLOCKING", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TermsConsentVariantConfig {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.account.domain.termsconsent.TermsConsentVariantConfig[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final oy.h Companion;
    public static final com.truecaller.account.domain.termsconsent.TermsConsentVariantConfig NONE = new com.truecaller.account.domain.termsconsent.TermsConsentVariantConfig("NONE", 0);
    public static final com.truecaller.account.domain.termsconsent.TermsConsentVariantConfig BLOCKING = new com.truecaller.account.domain.termsconsent.TermsConsentVariantConfig("BLOCKING", 1);
    public static final com.truecaller.account.domain.termsconsent.TermsConsentVariantConfig NON_BLOCKING = new com.truecaller.account.domain.termsconsent.TermsConsentVariantConfig("NON_BLOCKING", 2);

    private static final /* synthetic */ com.truecaller.account.domain.termsconsent.TermsConsentVariantConfig[] $values() {
        return new com.truecaller.account.domain.termsconsent.TermsConsentVariantConfig[]{NONE, BLOCKING, NON_BLOCKING};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [oy.h, java.lang.Object] */
    static {
        com.truecaller.account.domain.termsconsent.TermsConsentVariantConfig[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private TermsConsentVariantConfig(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.account.domain.termsconsent.TermsConsentVariantConfig valueOf(java.lang.String str) {
        return (com.truecaller.account.domain.termsconsent.TermsConsentVariantConfig) java.lang.Enum.valueOf(com.truecaller.account.domain.termsconsent.TermsConsentVariantConfig.class, str);
    }

    public static com.truecaller.account.domain.termsconsent.TermsConsentVariantConfig[] values() {
        return (com.truecaller.account.domain.termsconsent.TermsConsentVariantConfig[]) $VALUES.clone();
    }
}
