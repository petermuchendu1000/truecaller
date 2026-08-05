package com.truecaller.ads.api.internal.dl.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/ads/api/internal/dl/model/DlRequestSourceType;", "", "<init>", "(Ljava/lang/String;I)V", "", "toValue", "()I", "Companion", "w20/i", "PreFetch", "Live", "PostFetch", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class DlRequestSourceType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlRequestSourceType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final w20.i Companion;
    public static final com.truecaller.ads.api.internal.dl.model.DlRequestSourceType PreFetch = new com.truecaller.ads.api.internal.dl.model.DlRequestSourceType("PreFetch", 0);
    public static final com.truecaller.ads.api.internal.dl.model.DlRequestSourceType Live = new com.truecaller.ads.api.internal.dl.model.DlRequestSourceType("Live", 1);
    public static final com.truecaller.ads.api.internal.dl.model.DlRequestSourceType PostFetch = new com.truecaller.ads.api.internal.dl.model.DlRequestSourceType("PostFetch", 2);

    private static final /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlRequestSourceType[] $values() {
        return new com.truecaller.ads.api.internal.dl.model.DlRequestSourceType[]{PreFetch, Live, PostFetch};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [w20.i, java.lang.Object] */
    static {
        com.truecaller.ads.api.internal.dl.model.DlRequestSourceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private DlRequestSourceType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.internal.dl.model.DlRequestSourceType valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.internal.dl.model.DlRequestSourceType) java.lang.Enum.valueOf(com.truecaller.ads.api.internal.dl.model.DlRequestSourceType.class, str);
    }

    public static com.truecaller.ads.api.internal.dl.model.DlRequestSourceType[] values() {
        return (com.truecaller.ads.api.internal.dl.model.DlRequestSourceType[]) $VALUES.clone();
    }

    public final int toValue() {
        int i = w20.j.a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            throw new java.lang.RuntimeException();
        }
        return 0;
    }
}
