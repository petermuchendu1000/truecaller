package com.truecaller.calling.initiate_call;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b#\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.¨\u0006/"}, d2 = {"com/truecaller/calling/initiate_call/InitiateCallHelper$CallSource", "Landroid/os/Parcelable;", "", "Lcom/truecaller/calling/initiate_call/InitiateCallHelper$CallSource;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "CALL_TAB_RECENTS", "CALL_TAB_FILTER_OUTGOING", "CALL_TAB_FILTER_INCOMING", "CALL_TAB_FILTER_MISSED", "CALL_TAB_FILTER_BLOCKED", "CONTACTS", "FAVOURITES", "DIALPAD", "SPEED_DIALPAD", "DIALPAD_SEARCH_RESULT", "DETAIL_VIEW_LEGACY", "DETAILS_VIEW", "GLOBAL_SEARCH", "DIALPAD_T9_SEARCH", "ACS", "DEEPLINK", "CALL_AND_RECORD", "CALL_ASSISTANT_CHAT", "CALL_LOG_FAMILY_PROTECT", "CONTACT_CALL_HISTORY", "CONVERSATION", "CALL_ME_BACK", "NOTIFICATION", "MISSED_CALL_NOTIFICATION", "MISSED_CALL_REMINDER_NOTIFICATION", "ROAMING_BOTTOM_SHEET", "CALL_TAB_USSD", "GOVERNMENT_SERVICES", "CHANGE_SIM", "VOICEMAIL_TAB", "NOTIFICATION_VB_MISSED_CALL", "UNKNOWN", "calling_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class InitiateCallHelper$CallSource implements android.os.Parcelable {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource> CREATOR;
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource CALL_TAB_RECENTS = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("CALL_TAB_RECENTS", 0);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource CALL_TAB_FILTER_OUTGOING = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("CALL_TAB_FILTER_OUTGOING", 1);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource CALL_TAB_FILTER_INCOMING = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("CALL_TAB_FILTER_INCOMING", 2);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource CALL_TAB_FILTER_MISSED = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("CALL_TAB_FILTER_MISSED", 3);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource CALL_TAB_FILTER_BLOCKED = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("CALL_TAB_FILTER_BLOCKED", 4);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource CONTACTS = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("CONTACTS", 5);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource FAVOURITES = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("FAVOURITES", 6);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource DIALPAD = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("DIALPAD", 7);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource SPEED_DIALPAD = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("SPEED_DIALPAD", 8);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource DIALPAD_SEARCH_RESULT = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("DIALPAD_SEARCH_RESULT", 9);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource DETAIL_VIEW_LEGACY = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("DETAIL_VIEW_LEGACY", 10);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource DETAILS_VIEW = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("DETAILS_VIEW", 11);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource GLOBAL_SEARCH = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("GLOBAL_SEARCH", 12);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource DIALPAD_T9_SEARCH = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("DIALPAD_T9_SEARCH", 13);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource ACS = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("ACS", 14);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource DEEPLINK = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("DEEPLINK", 15);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource CALL_AND_RECORD = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("CALL_AND_RECORD", 16);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource CALL_ASSISTANT_CHAT = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("CALL_ASSISTANT_CHAT", 17);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource CALL_LOG_FAMILY_PROTECT = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("CALL_LOG_FAMILY_PROTECT", 18);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource CONTACT_CALL_HISTORY = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("CONTACT_CALL_HISTORY", 19);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource CONVERSATION = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("CONVERSATION", 20);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource CALL_ME_BACK = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("CALL_ME_BACK", 21);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource NOTIFICATION = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("NOTIFICATION", 22);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource MISSED_CALL_NOTIFICATION = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("MISSED_CALL_NOTIFICATION", 23);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource MISSED_CALL_REMINDER_NOTIFICATION = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("MISSED_CALL_REMINDER_NOTIFICATION", 24);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource ROAMING_BOTTOM_SHEET = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("ROAMING_BOTTOM_SHEET", 25);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource CALL_TAB_USSD = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("CALL_TAB_USSD", 26);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource GOVERNMENT_SERVICES = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("GOVERNMENT_SERVICES", 27);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource CHANGE_SIM = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("CHANGE_SIM", 28);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource VOICEMAIL_TAB = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("VOICEMAIL_TAB", 29);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource NOTIFICATION_VB_MISSED_CALL = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("NOTIFICATION_VB_MISSED_CALL", 30);
    public static final com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource UNKNOWN = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource("UNKNOWN", 31);

    private static final /* synthetic */ com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource[] $values() {
        return new com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource[]{CALL_TAB_RECENTS, CALL_TAB_FILTER_OUTGOING, CALL_TAB_FILTER_INCOMING, CALL_TAB_FILTER_MISSED, CALL_TAB_FILTER_BLOCKED, CONTACTS, FAVOURITES, DIALPAD, SPEED_DIALPAD, DIALPAD_SEARCH_RESULT, DETAIL_VIEW_LEGACY, DETAILS_VIEW, GLOBAL_SEARCH, DIALPAD_T9_SEARCH, ACS, DEEPLINK, CALL_AND_RECORD, CALL_ASSISTANT_CHAT, CALL_LOG_FAMILY_PROTECT, CONTACT_CALL_HISTORY, CONVERSATION, CALL_ME_BACK, NOTIFICATION, MISSED_CALL_NOTIFICATION, MISSED_CALL_REMINDER_NOTIFICATION, ROAMING_BOTTOM_SHEET, CALL_TAB_USSD, GOVERNMENT_SERVICES, CHANGE_SIM, VOICEMAIL_TAB, NOTIFICATION_VB_MISSED_CALL, UNKNOWN};
    }

    static {
        com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        CREATOR = new ks2.bar(23);
    }

    private InitiateCallHelper$CallSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource valueOf(java.lang.String str) {
        return (com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource) java.lang.Enum.valueOf(com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource.class, str);
    }

    public static com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource[] values() {
        return (com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource[]) $VALUES.clone();
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
