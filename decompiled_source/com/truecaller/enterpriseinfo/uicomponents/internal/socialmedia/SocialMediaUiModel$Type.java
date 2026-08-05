package com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/truecaller/enterpriseinfo/uicomponents/internal/socialmedia/SocialMediaUiModel$Type", "", "Lcom/truecaller/enterpriseinfo/uicomponents/internal/socialmedia/SocialMediaUiModel$Type;", "", "priority", "<init>", "(Ljava/lang/String;II)V", "I", "getPriority", "()I", "WEBSITE", "FACEBOOK", "INSTAGRAM", "GOOGLE_PLAY_STORE", "X", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SocialMediaUiModel$Type {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type[] $VALUES;
    private final int priority;
    public static final com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type WEBSITE = new com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type("WEBSITE", 0, 1);
    public static final com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type FACEBOOK = new com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type("FACEBOOK", 1, 2);
    public static final com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type INSTAGRAM = new com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type("INSTAGRAM", 2, 3);
    public static final com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type GOOGLE_PLAY_STORE = new com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type("GOOGLE_PLAY_STORE", 3, 4);
    public static final com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type X = new com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type("X", 4, 5);

    private static final /* synthetic */ com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type[] $values() {
        return new com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type[]{WEBSITE, FACEBOOK, INSTAGRAM, GOOGLE_PLAY_STORE, X};
    }

    static {
        com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SocialMediaUiModel$Type(java.lang.String str, int i, int i2) {
        this.priority = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type valueOf(java.lang.String str) {
        return (com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type) java.lang.Enum.valueOf(com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type.class, str);
    }

    public static com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type[] values() {
        return (com.truecaller.enterpriseinfo.uicomponents.internal.socialmedia.SocialMediaUiModel$Type[]) $VALUES.clone();
    }

    public final int getPriority() {
        return this.priority;
    }
}
