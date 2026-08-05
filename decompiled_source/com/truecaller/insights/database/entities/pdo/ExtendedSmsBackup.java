package com.truecaller.insights.database.entities.pdo;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/truecaller/insights/database/entities/pdo/ExtendedSmsBackup;", "Lcom/truecaller/insights/database/entities/pdo/SmsBackup;", "isIM", "", "<init>", "(Z)V", "()Z", "equals", "other", "", "hashCode", "", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ExtendedSmsBackup extends com.truecaller.insights.database.entities.pdo.SmsBackup {
    private final boolean isIM;

    public ExtendedSmsBackup() {
        this(false, 1, null);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        java.lang.Class<?> cls;
        if (this == other) {
            return true;
        }
        if (other != null) {
            cls = other.getClass();
        } else {
            cls = null;
        }
        if (!com.truecaller.insights.database.entities.pdo.ExtendedSmsBackup.class.equals(cls)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.e(other, "null cannot be cast to non-null type com.truecaller.insights.database.entities.pdo.ExtendedSmsBackup");
        if (this.isIM != ((com.truecaller.insights.database.entities.pdo.ExtendedSmsBackup) other).isIM) {
            return false;
        }
        return super.equals(other);
    }

    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        if (this.isIM) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode + i;
    }

    /* renamed from: isIM, reason: from getter */
    public final boolean getIsIM() {
        return this.isIM;
    }

    public ExtendedSmsBackup(boolean z) {
        this.isIM = z;
    }

    public /* synthetic */ ExtendedSmsBackup(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
