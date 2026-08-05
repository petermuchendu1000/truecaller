package com.truecaller.insights.database.models;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/insights/database/models/SenderBlockPreference;", "", "version", "", "senderPreferences", "", "Lcom/truecaller/insights/database/models/SenderBlockList;", "<init>", "(ILjava/util/List;)V", "getVersion", "()I", "getSenderPreferences", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SenderBlockPreference {

    @bw.qux("sender_preferences")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.insights.database.models.SenderBlockList> senderPreferences;

    @bw.qux("version")
    private final int version;

    public SenderBlockPreference(int i, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.database.models.SenderBlockList> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "senderPreferences");
        this.version = i;
        this.senderPreferences = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.database.models.SenderBlockPreference copy$default(com.truecaller.insights.database.models.SenderBlockPreference senderBlockPreference, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = senderBlockPreference.version;
        }
        if ((i2 & 2) != 0) {
            list = senderBlockPreference.senderPreferences;
        }
        return senderBlockPreference.copy(i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.database.models.SenderBlockList> component2() {
        return this.senderPreferences;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.models.SenderBlockPreference copy(int version, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.database.models.SenderBlockList> senderPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderPreferences, "senderPreferences");
        return new com.truecaller.insights.database.models.SenderBlockPreference(version, senderPreferences);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.models.SenderBlockPreference)) {
            return false;
        }
        com.truecaller.insights.database.models.SenderBlockPreference senderBlockPreference = (com.truecaller.insights.database.models.SenderBlockPreference) other;
        return this.version == senderBlockPreference.version && kotlin.jvm.internal.Intrinsics.b(this.senderPreferences, senderBlockPreference.senderPreferences);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.database.models.SenderBlockList> getSenderPreferences() {
        return this.senderPreferences;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.senderPreferences.hashCode() + (this.version * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "SenderBlockPreference(version=" + this.version + ", senderPreferences=" + this.senderPreferences + ")";
    }
}
