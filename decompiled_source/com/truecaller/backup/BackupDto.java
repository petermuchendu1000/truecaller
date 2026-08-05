package com.truecaller.backup;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/truecaller/backup/BackupDto;", "Landroid/os/Parcelable;", "", "a", "J", "()J", "timestamp", "backup_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BackupDto implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.backup.BackupDto> CREATOR = new y02.t(5);

    /* renamed from: a, reason: from kotlin metadata */
    @bw.qux("last")
    private final long timestamp;

    public BackupDto(long j) {
        this.timestamp = j;
    }

    /* renamed from: a, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeLong(this.timestamp);
    }
}
