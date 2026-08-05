package com.truecaller.ads.configmanagement.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/truecaller/ads/configmanagement/model/SuggestedAppsTemplate;", "", "template", "", "<init>", "(Ljava/lang/String;)V", "getTemplate", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class SuggestedAppsTemplate {
    public static final int $stable = 0;

    @bw.qux("template")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String template;

    public SuggestedAppsTemplate(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "template");
        this.template = str;
    }

    public static /* synthetic */ com.truecaller.ads.configmanagement.model.SuggestedAppsTemplate copy$default(com.truecaller.ads.configmanagement.model.SuggestedAppsTemplate suggestedAppsTemplate, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = suggestedAppsTemplate.template;
        }
        return suggestedAppsTemplate.copy(str);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTemplate() {
        return this.template;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.configmanagement.model.SuggestedAppsTemplate copy(@org.jetbrains.annotations.NotNull java.lang.String template) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(template, "template");
        return new com.truecaller.ads.configmanagement.model.SuggestedAppsTemplate(template);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.ads.configmanagement.model.SuggestedAppsTemplate) && kotlin.jvm.internal.Intrinsics.b(this.template, ((com.truecaller.ads.configmanagement.model.SuggestedAppsTemplate) other).template);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTemplate() {
        return this.template;
    }

    public int hashCode() {
        return this.template.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.t("SuggestedAppsTemplate(template=", this.template, ")");
    }
}
