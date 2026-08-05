package com.truecaller.data.entity.assistant;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/truecaller/data/entity/assistant/ScreenedCallClassification;", "", "type", "", "level", "", "<init>", "(ILjava/lang/String;)V", "getType", "()I", "getLevel", "()Ljava/lang/String;", "classificationType", "Lcom/truecaller/data/entity/assistant/CallClassificationType;", "getClassificationType", "()Lcom/truecaller/data/entity/assistant/CallClassificationType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ScreenedCallClassification {

    @bw.qux("level")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String level;

    @bw.qux("type")
    private final int type;

    public ScreenedCallClassification(int i, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "level");
        this.type = i;
        this.level = str;
    }

    public static /* synthetic */ com.truecaller.data.entity.assistant.ScreenedCallClassification copy$default(com.truecaller.data.entity.assistant.ScreenedCallClassification screenedCallClassification, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = screenedCallClassification.type;
        }
        if ((i2 & 2) != 0) {
            str = screenedCallClassification.level;
        }
        return screenedCallClassification.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLevel() {
        return this.level;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.data.entity.assistant.ScreenedCallClassification copy(int type, @org.jetbrains.annotations.NotNull java.lang.String level) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
        return new com.truecaller.data.entity.assistant.ScreenedCallClassification(type, level);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.data.entity.assistant.ScreenedCallClassification)) {
            return false;
        }
        com.truecaller.data.entity.assistant.ScreenedCallClassification screenedCallClassification = (com.truecaller.data.entity.assistant.ScreenedCallClassification) other;
        return this.type == screenedCallClassification.type && kotlin.jvm.internal.Intrinsics.b(this.level, screenedCallClassification.level);
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.data.entity.assistant.CallClassificationType getClassificationType() {
        java.lang.Object obj;
        r81.bar barVar = com.truecaller.data.entity.assistant.CallClassificationType.Companion;
        int i = this.type;
        barVar.getClass();
        java.util.Iterator it = com.truecaller.data.entity.assistant.CallClassificationType.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((com.truecaller.data.entity.assistant.CallClassificationType) obj).getValue() == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (com.truecaller.data.entity.assistant.CallClassificationType) obj;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLevel() {
        return this.level;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.level.hashCode() + (this.type * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bx.e1.n("ScreenedCallClassification(type=", this.type, ", level=", this.level, ")");
    }
}
