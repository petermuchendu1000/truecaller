package com.truecaller.bizmon.callSurvey.data.entities;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/truecaller/bizmon/callSurvey/data/entities/BizSurveyChoice;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "text", "", "selectedChoice", "", "<init>", "(ILjava/lang/String;Ljava/lang/Boolean;)V", "getId", "()I", "getText", "()Ljava/lang/String;", "getSelectedChoice", "()Ljava/lang/Boolean;", "setSelectedChoice", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Boolean;)Lcom/truecaller/bizmon/callSurvey/data/entities/BizSurveyChoice;", "equals", "other", "hashCode", "toString", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BizSurveyChoice {
    public static final int $stable = 8;
    private final int id;

    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean selectedChoice;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String text;

    public BizSurveyChoice(int i, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.Boolean bool) {
        this.id = i;
        this.text = str;
        this.selectedChoice = bool;
    }

    public static /* synthetic */ com.truecaller.bizmon.callSurvey.data.entities.BizSurveyChoice copy$default(com.truecaller.bizmon.callSurvey.data.entities.BizSurveyChoice bizSurveyChoice, int i, java.lang.String str, java.lang.Boolean bool, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = bizSurveyChoice.id;
        }
        if ((i2 & 2) != 0) {
            str = bizSurveyChoice.text;
        }
        if ((i2 & 4) != 0) {
            bool = bizSurveyChoice.selectedChoice;
        }
        return bizSurveyChoice.copy(i, str, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.Boolean getSelectedChoice() {
        return this.selectedChoice;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.bizmon.callSurvey.data.entities.BizSurveyChoice copy(int id, @org.jetbrains.annotations.Nullable java.lang.String text, @org.jetbrains.annotations.Nullable java.lang.Boolean selectedChoice) {
        return new com.truecaller.bizmon.callSurvey.data.entities.BizSurveyChoice(id, text, selectedChoice);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.bizmon.callSurvey.data.entities.BizSurveyChoice)) {
            return false;
        }
        com.truecaller.bizmon.callSurvey.data.entities.BizSurveyChoice bizSurveyChoice = (com.truecaller.bizmon.callSurvey.data.entities.BizSurveyChoice) other;
        return this.id == bizSurveyChoice.id && kotlin.jvm.internal.Intrinsics.b(this.text, bizSurveyChoice.text) && kotlin.jvm.internal.Intrinsics.b(this.selectedChoice, bizSurveyChoice.selectedChoice);
    }

    public final int getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getSelectedChoice() {
        return this.selectedChoice;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getText() {
        return this.text;
    }

    public int hashCode() {
        int i = this.id * 31;
        java.lang.String str = this.text;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Boolean bool = this.selectedChoice;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final void setSelectedChoice(@org.jetbrains.annotations.Nullable java.lang.Boolean bool) {
        this.selectedChoice = bool;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.id;
        java.lang.String str = this.text;
        java.lang.Boolean bool = this.selectedChoice;
        java.lang.StringBuilder r = qb.qux.r("BizSurveyChoice(id=", i, ", text=", str, ", selectedChoice=");
        r.append(bool);
        r.append(")");
        return r.toString();
    }
}
