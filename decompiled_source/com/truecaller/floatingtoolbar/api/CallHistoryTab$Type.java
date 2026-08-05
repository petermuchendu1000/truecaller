package com.truecaller.floatingtoolbar.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"com/truecaller/floatingtoolbar/api/CallHistoryTab$Type", "Landroid/os/Parcelable;", "", "Lcom/truecaller/floatingtoolbar/api/CallHistoryTab$Type;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ussd", "Contacts", "Favorite", "Voice", "Recordings", "Blocking", "TrueStory", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CallHistoryTab$Type implements android.os.Parcelable {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.floatingtoolbar.api.CallHistoryTab$Type[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.floatingtoolbar.api.CallHistoryTab$Type> CREATOR;
    public static final com.truecaller.floatingtoolbar.api.CallHistoryTab$Type Ussd = new com.truecaller.floatingtoolbar.api.CallHistoryTab$Type("Ussd", 0);
    public static final com.truecaller.floatingtoolbar.api.CallHistoryTab$Type Contacts = new com.truecaller.floatingtoolbar.api.CallHistoryTab$Type("Contacts", 1);
    public static final com.truecaller.floatingtoolbar.api.CallHistoryTab$Type Favorite = new com.truecaller.floatingtoolbar.api.CallHistoryTab$Type("Favorite", 2);
    public static final com.truecaller.floatingtoolbar.api.CallHistoryTab$Type Voice = new com.truecaller.floatingtoolbar.api.CallHistoryTab$Type("Voice", 3);
    public static final com.truecaller.floatingtoolbar.api.CallHistoryTab$Type Recordings = new com.truecaller.floatingtoolbar.api.CallHistoryTab$Type("Recordings", 4);
    public static final com.truecaller.floatingtoolbar.api.CallHistoryTab$Type Blocking = new com.truecaller.floatingtoolbar.api.CallHistoryTab$Type("Blocking", 5);
    public static final com.truecaller.floatingtoolbar.api.CallHistoryTab$Type TrueStory = new com.truecaller.floatingtoolbar.api.CallHistoryTab$Type("TrueStory", 6);

    private static final /* synthetic */ com.truecaller.floatingtoolbar.api.CallHistoryTab$Type[] $values() {
        return new com.truecaller.floatingtoolbar.api.CallHistoryTab$Type[]{Ussd, Contacts, Favorite, Voice, Recordings, Blocking, TrueStory};
    }

    static {
        com.truecaller.floatingtoolbar.api.CallHistoryTab$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        CREATOR = new cb1.bar(23);
    }

    private CallHistoryTab$Type(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.floatingtoolbar.api.CallHistoryTab$Type valueOf(java.lang.String str) {
        return (com.truecaller.floatingtoolbar.api.CallHistoryTab$Type) java.lang.Enum.valueOf(com.truecaller.floatingtoolbar.api.CallHistoryTab$Type.class, str);
    }

    public static com.truecaller.floatingtoolbar.api.CallHistoryTab$Type[] values() {
        return (com.truecaller.floatingtoolbar.api.CallHistoryTab$Type[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
