package com.truecaller.backup;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u0010\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/truecaller/backup/BackupSettingItem;", "T", "", "key", "", "value", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getType", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lcom/truecaller/backup/BackupSettingItem;", "equals", "", "other", "hashCode", "", "toString", "backup_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BackupSettingItem<T> {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String type;
    private final T value;

    public BackupSettingItem(@org.jetbrains.annotations.NotNull java.lang.String str, T t, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        this.key = str;
        this.value = t;
        this.type = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.backup.BackupSettingItem copy$default(com.truecaller.backup.BackupSettingItem backupSettingItem, java.lang.String str, java.lang.Object obj, java.lang.String str2, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = backupSettingItem.key;
        }
        if ((i & 2) != 0) {
            obj = backupSettingItem.value;
        }
        if ((i & 4) != 0) {
            str2 = backupSettingItem.type;
        }
        return backupSettingItem.copy(str, obj, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    public final T component2() {
        return this.value;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.backup.BackupSettingItem<T> copy(@org.jetbrains.annotations.NotNull java.lang.String key, T value, @org.jetbrains.annotations.Nullable java.lang.String type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return new com.truecaller.backup.BackupSettingItem<>(key, value, type);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.backup.BackupSettingItem)) {
            return false;
        }
        com.truecaller.backup.BackupSettingItem backupSettingItem = (com.truecaller.backup.BackupSettingItem) other;
        return kotlin.jvm.internal.Intrinsics.b(this.key, backupSettingItem.key) && kotlin.jvm.internal.Intrinsics.b(this.value, backupSettingItem.value) && kotlin.jvm.internal.Intrinsics.b(this.type, backupSettingItem.type);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getType() {
        return this.type;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        T t = this.value;
        int hashCode2 = (hashCode + (t == null ? 0 : t.hashCode())) * 31;
        java.lang.String str = this.type;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.key;
        T t = this.value;
        java.lang.String str2 = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BackupSettingItem(key=");
        sb.append(str);
        sb.append(", value=");
        sb.append(t);
        sb.append(", type=");
        return bar.v(str2, ")", sb);
    }
}
