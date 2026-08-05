package com.truecaller.onboarding_education.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/onboarding_education/domain/SkipMode;", "", "skipStart", "", "skipMiddle", "<init>", "(Ljava/lang/String;IZZ)V", "getSkipStart", "()Z", "getSkipMiddle", "SkippableStart", "SkippableMiddle", "SkippableStartMiddle", "NotSkippable", "onboarding-education_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SkipMode {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.onboarding_education.domain.SkipMode[] $VALUES;
    private final boolean skipMiddle;
    private final boolean skipStart;
    public static final com.truecaller.onboarding_education.domain.SkipMode SkippableStart = new com.truecaller.onboarding_education.domain.SkipMode("SkippableStart", 0, true, false);
    public static final com.truecaller.onboarding_education.domain.SkipMode SkippableMiddle = new com.truecaller.onboarding_education.domain.SkipMode("SkippableMiddle", 1, false, true);
    public static final com.truecaller.onboarding_education.domain.SkipMode SkippableStartMiddle = new com.truecaller.onboarding_education.domain.SkipMode("SkippableStartMiddle", 2, true, true);
    public static final com.truecaller.onboarding_education.domain.SkipMode NotSkippable = new com.truecaller.onboarding_education.domain.SkipMode("NotSkippable", 3, false, false);

    private static final /* synthetic */ com.truecaller.onboarding_education.domain.SkipMode[] $values() {
        return new com.truecaller.onboarding_education.domain.SkipMode[]{SkippableStart, SkippableMiddle, SkippableStartMiddle, NotSkippable};
    }

    static {
        com.truecaller.onboarding_education.domain.SkipMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SkipMode(java.lang.String str, int i, boolean z, boolean z2) {
        this.skipStart = z;
        this.skipMiddle = z2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.onboarding_education.domain.SkipMode valueOf(java.lang.String str) {
        return (com.truecaller.onboarding_education.domain.SkipMode) java.lang.Enum.valueOf(com.truecaller.onboarding_education.domain.SkipMode.class, str);
    }

    public static com.truecaller.onboarding_education.domain.SkipMode[] values() {
        return (com.truecaller.onboarding_education.domain.SkipMode[]) $VALUES.clone();
    }

    public final boolean getSkipMiddle() {
        return this.skipMiddle;
    }

    public final boolean getSkipStart() {
        return this.skipStart;
    }
}
