package com.truecaller.acspromo.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/acspromo/domain/model/PromoContext;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "l00/a", "PREMIUM", "ASSISTANT", "CALLRECORDING", "VOICEMAIL", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PromoContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.acspromo.domain.model.PromoContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final l00.a Companion;
    public static final com.truecaller.acspromo.domain.model.PromoContext PREMIUM = new com.truecaller.acspromo.domain.model.PromoContext("PREMIUM", 0);
    public static final com.truecaller.acspromo.domain.model.PromoContext ASSISTANT = new com.truecaller.acspromo.domain.model.PromoContext("ASSISTANT", 1);
    public static final com.truecaller.acspromo.domain.model.PromoContext CALLRECORDING = new com.truecaller.acspromo.domain.model.PromoContext("CALLRECORDING", 2);
    public static final com.truecaller.acspromo.domain.model.PromoContext VOICEMAIL = new com.truecaller.acspromo.domain.model.PromoContext("VOICEMAIL", 3);

    private static final /* synthetic */ com.truecaller.acspromo.domain.model.PromoContext[] $values() {
        return new com.truecaller.acspromo.domain.model.PromoContext[]{PREMIUM, ASSISTANT, CALLRECORDING, VOICEMAIL};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l00.a, java.lang.Object] */
    static {
        com.truecaller.acspromo.domain.model.PromoContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private PromoContext(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.acspromo.domain.model.PromoContext valueOf(java.lang.String str) {
        return (com.truecaller.acspromo.domain.model.PromoContext) java.lang.Enum.valueOf(com.truecaller.acspromo.domain.model.PromoContext.class, str);
    }

    public static com.truecaller.acspromo.domain.model.PromoContext[] values() {
        return (com.truecaller.acspromo.domain.model.PromoContext[]) $VALUES.clone();
    }
}
