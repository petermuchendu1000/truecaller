package com.truecaller.dynamicfeaturesupport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/dynamicfeaturesupport/DynamicFeature;", "", "moduleName", "", "graphProviderClassName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getModuleName", "()Ljava/lang/String;", "getGraphProviderClassName", "MESSAGING_TRANSLATE", "INSIGHTS_CATEGORY_MODEL", "dynamic-features-support_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DynamicFeature {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.dynamicfeaturesupport.DynamicFeature[] $VALUES;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String graphProviderClassName;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String moduleName;
    public static final com.truecaller.dynamicfeaturesupport.DynamicFeature MESSAGING_TRANSLATE = new com.truecaller.dynamicfeaturesupport.DynamicFeature("MESSAGING_TRANSLATE", 0, "messaging_translate", "com.truecaller.messaging_translate.MessagingTranslateGraphProvider");
    public static final com.truecaller.dynamicfeaturesupport.DynamicFeature INSIGHTS_CATEGORY_MODEL = new com.truecaller.dynamicfeaturesupport.DynamicFeature("INSIGHTS_CATEGORY_MODEL", 1, "insights_category_model", "com.truecaller.insights.categorymodel.CategoryModelGraphProvider");

    private static final /* synthetic */ com.truecaller.dynamicfeaturesupport.DynamicFeature[] $values() {
        return new com.truecaller.dynamicfeaturesupport.DynamicFeature[]{MESSAGING_TRANSLATE, INSIGHTS_CATEGORY_MODEL};
    }

    static {
        com.truecaller.dynamicfeaturesupport.DynamicFeature[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private DynamicFeature(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
        this.moduleName = str2;
        this.graphProviderClassName = str3;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.dynamicfeaturesupport.DynamicFeature valueOf(java.lang.String str) {
        return (com.truecaller.dynamicfeaturesupport.DynamicFeature) java.lang.Enum.valueOf(com.truecaller.dynamicfeaturesupport.DynamicFeature.class, str);
    }

    public static com.truecaller.dynamicfeaturesupport.DynamicFeature[] values() {
        return (com.truecaller.dynamicfeaturesupport.DynamicFeature[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGraphProviderClassName() {
        return this.graphProviderClassName;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getModuleName() {
        return this.moduleName;
    }

    public /* synthetic */ DynamicFeature(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : str3);
    }
}
