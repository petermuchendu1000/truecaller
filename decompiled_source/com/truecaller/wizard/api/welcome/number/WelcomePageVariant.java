package com.truecaller.wizard.api.welcome.number;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/wizard/api/welcome/number/WelcomePageVariant;", "", "", "value", "displayValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "getDisplayValue", "Companion", "n83/a", "Control", "Old", "New", "Cta", "Carousel", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@ug3.d
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WelcomePageVariant {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wizard.api.welcome.number.WelcomePageVariant[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer> $cachedSerializer$delegate;

    @org.jetbrains.annotations.NotNull
    public static final n83.a Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String displayValue;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.wizard.api.welcome.number.WelcomePageVariant Control = new com.truecaller.wizard.api.welcome.number.WelcomePageVariant("Control", 0, "Control", "Legacy onboarding");
    public static final com.truecaller.wizard.api.welcome.number.WelcomePageVariant Old = new com.truecaller.wizard.api.welcome.number.WelcomePageVariant("Old", 1, "VariantOldCopy", "Enter number with old copy");
    public static final com.truecaller.wizard.api.welcome.number.WelcomePageVariant New = new com.truecaller.wizard.api.welcome.number.WelcomePageVariant("New", 2, "VariantNewCopy", "Enter number with new copy");
    public static final com.truecaller.wizard.api.welcome.number.WelcomePageVariant Cta = new com.truecaller.wizard.api.welcome.number.WelcomePageVariant("Cta", 3, "Logo", "With logo and CTA");
    public static final com.truecaller.wizard.api.welcome.number.WelcomePageVariant Carousel = new com.truecaller.wizard.api.welcome.number.WelcomePageVariant("Carousel", 4, "Carousel", "Carousel");

    private static final /* synthetic */ com.truecaller.wizard.api.welcome.number.WelcomePageVariant[] $values() {
        return new com.truecaller.wizard.api.welcome.number.WelcomePageVariant[]{Control, Old, New, Cta, Carousel};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [n83.a, java.lang.Object] */
    static {
        com.truecaller.wizard.api.welcome.number.WelcomePageVariant[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.k.b, new n10.b(4));
    }

    private WelcomePageVariant(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
        this.value = str2;
        this.displayValue = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ kotlinx.serialization.KSerializer _init_$_anonymous_() {
        return yg3.w0.e("com.truecaller.wizard.api.welcome.number.WelcomePageVariant", values(), new java.lang.String[]{"Control", "VariantOldCopy", "VariantNewCopy", "Logo", "Carousel"}, new java.lang.annotation.Annotation[][]{null, null, null, null, null});
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wizard.api.welcome.number.WelcomePageVariant valueOf(java.lang.String str) {
        return (com.truecaller.wizard.api.welcome.number.WelcomePageVariant) java.lang.Enum.valueOf(com.truecaller.wizard.api.welcome.number.WelcomePageVariant.class, str);
    }

    public static com.truecaller.wizard.api.welcome.number.WelcomePageVariant[] values() {
        return (com.truecaller.wizard.api.welcome.number.WelcomePageVariant[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDisplayValue() {
        return this.displayValue;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
