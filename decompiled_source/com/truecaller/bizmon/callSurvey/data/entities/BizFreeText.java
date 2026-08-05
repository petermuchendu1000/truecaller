package com.truecaller.bizmon.callSurvey.data.entities;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/truecaller/bizmon/callSurvey/data/entities/BizFreeText;", "", "hintLabel", "", "buttonLabel", "freeTextAnswer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHintLabel", "()Ljava/lang/String;", "getButtonLabel", "getFreeTextAnswer", "setFreeTextAnswer", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BizFreeText {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String buttonLabel;

    @org.jetbrains.annotations.Nullable
    private java.lang.String freeTextAnswer;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String hintLabel;

    public BizFreeText(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3) {
        this.hintLabel = str;
        this.buttonLabel = str2;
        this.freeTextAnswer = str3;
    }

    public static /* synthetic */ com.truecaller.bizmon.callSurvey.data.entities.BizFreeText copy$default(com.truecaller.bizmon.callSurvey.data.entities.BizFreeText bizFreeText, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bizFreeText.hintLabel;
        }
        if ((i & 2) != 0) {
            str2 = bizFreeText.buttonLabel;
        }
        if ((i & 4) != 0) {
            str3 = bizFreeText.freeTextAnswer;
        }
        return bizFreeText.copy(str, str2, str3);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getHintLabel() {
        return this.hintLabel;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getButtonLabel() {
        return this.buttonLabel;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFreeTextAnswer() {
        return this.freeTextAnswer;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.bizmon.callSurvey.data.entities.BizFreeText copy(@org.jetbrains.annotations.Nullable java.lang.String hintLabel, @org.jetbrains.annotations.Nullable java.lang.String buttonLabel, @org.jetbrains.annotations.Nullable java.lang.String freeTextAnswer) {
        return new com.truecaller.bizmon.callSurvey.data.entities.BizFreeText(hintLabel, buttonLabel, freeTextAnswer);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.bizmon.callSurvey.data.entities.BizFreeText)) {
            return false;
        }
        com.truecaller.bizmon.callSurvey.data.entities.BizFreeText bizFreeText = (com.truecaller.bizmon.callSurvey.data.entities.BizFreeText) other;
        return kotlin.jvm.internal.Intrinsics.b(this.hintLabel, bizFreeText.hintLabel) && kotlin.jvm.internal.Intrinsics.b(this.buttonLabel, bizFreeText.buttonLabel) && kotlin.jvm.internal.Intrinsics.b(this.freeTextAnswer, bizFreeText.freeTextAnswer);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getButtonLabel() {
        return this.buttonLabel;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFreeTextAnswer() {
        return this.freeTextAnswer;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHintLabel() {
        return this.hintLabel;
    }

    public int hashCode() {
        java.lang.String str = this.hintLabel;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.buttonLabel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.freeTextAnswer;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setFreeTextAnswer(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.freeTextAnswer = str;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.freeTextAnswer, ")", ro0.f.E("BizFreeText(hintLabel=", this.hintLabel, ", buttonLabel=", this.buttonLabel, ", freeTextAnswer="));
    }
}
