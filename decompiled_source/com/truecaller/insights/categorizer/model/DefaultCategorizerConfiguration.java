package com.truecaller.insights.categorizer.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/truecaller/insights/categorizer/model/DefaultCategorizerConfiguration;", "", "minWordsIdentified", "", "<init>", "(Ljava/lang/Integer;)V", "getMinWordsIdentified", "()Ljava/lang/Integer;", "setMinWordsIdentified", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/truecaller/insights/categorizer/model/DefaultCategorizerConfiguration;", "equals", "", "other", "hashCode", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class DefaultCategorizerConfiguration {

    @bw.qux("minWordsIdentified")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer minWordsIdentified;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DefaultCategorizerConfiguration() {
        this(r0, 1, r0);
        java.lang.Integer num = null;
    }

    public static /* synthetic */ com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration copy$default(com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration defaultCategorizerConfiguration, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = defaultCategorizerConfiguration.minWordsIdentified;
        }
        return defaultCategorizerConfiguration.copy(num);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getMinWordsIdentified() {
        return this.minWordsIdentified;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration copy(@org.jetbrains.annotations.Nullable java.lang.Integer minWordsIdentified) {
        return new com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration(minWordsIdentified);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration) && kotlin.jvm.internal.Intrinsics.b(this.minWordsIdentified, ((com.truecaller.insights.categorizer.model.DefaultCategorizerConfiguration) other).minWordsIdentified);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getMinWordsIdentified() {
        return this.minWordsIdentified;
    }

    public int hashCode() {
        java.lang.Integer num = this.minWordsIdentified;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final void setMinWordsIdentified(@org.jetbrains.annotations.Nullable java.lang.Integer num) {
        this.minWordsIdentified = num;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "DefaultCategorizerConfiguration(minWordsIdentified=" + this.minWordsIdentified + ")";
    }

    public DefaultCategorizerConfiguration(@org.jetbrains.annotations.Nullable java.lang.Integer num) {
        this.minWordsIdentified = num;
    }

    public /* synthetic */ DefaultCategorizerConfiguration(java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
