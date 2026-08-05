package com.truecaller.bizmon.callMeBack.db.entity;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/truecaller/bizmon/callMeBack/db/entity/BizSlot;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "text", "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BizSlot {
    public static final int $stable = 0;
    private final int id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String text;

    public BizSlot(int i, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        this.id = i;
        this.text = str;
    }

    public static /* synthetic */ com.truecaller.bizmon.callMeBack.db.entity.BizSlot copy$default(com.truecaller.bizmon.callMeBack.db.entity.BizSlot bizSlot, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = bizSlot.id;
        }
        if ((i2 & 2) != 0) {
            str = bizSlot.text;
        }
        return bizSlot.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.bizmon.callMeBack.db.entity.BizSlot copy(int id, @org.jetbrains.annotations.NotNull java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        return new com.truecaller.bizmon.callMeBack.db.entity.BizSlot(id, text);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.bizmon.callMeBack.db.entity.BizSlot)) {
            return false;
        }
        com.truecaller.bizmon.callMeBack.db.entity.BizSlot bizSlot = (com.truecaller.bizmon.callMeBack.db.entity.BizSlot) other;
        return this.id == bizSlot.id && kotlin.jvm.internal.Intrinsics.b(this.text, bizSlot.text);
    }

    public final int getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.id * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bx.e1.n("BizSlot(id=", this.id, ", text=", this.text, ")");
    }
}
