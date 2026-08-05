package com.truecaller.detailsview.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b4\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5¨\u00066"}, d2 = {"Lcom/truecaller/detailsview/api/model/DetailsViewSource;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "nc1/bar", "AfterInAppOutgoingCall", "AfterCall", "BulkSmsReferral", "CallAssistantChat", "CallAssistantIncomingCall", "CallAssistantScreenedCalls", "CallFromDV", "CallingGovServices", "CallLog", "CallNotification", "CallRecording", "ContactEditor", "Contacts", "Conversation", "DeepLink", "DefaultDialerIncomingCall", "DefaultDialerOngoingCall", "DefaultDialerOutgoingCall", "EditFamily", "External", "FavoriteContacts", "FavoriteContactsCallLog", "ImGroupInfo", "Inbox", "MessageId", "MissedCallReminder", "NotificationCallMeBack", "NotificationContactRequestAccept", "NotificationContactRequestRejected", "NotificationImpact", "OtherMessageID", "PostCallBlockPrompt", "SearchHistory", "SearchResult", "SpammersList", "T9Search", "TelegramMessageID", "VoicemailTab", "WhatsappMessageID", "WhoSearchedForMe", "WhoViewedMe", "NotificationVBMissedCall", "ContactRequestUpdates", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DetailsViewSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.detailsview.api.model.DetailsViewSource[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final nc1.bar Companion;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource ContactRequestUpdates;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource Conversation;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource DeepLink;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource DefaultDialerIncomingCall;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource DefaultDialerOngoingCall;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource DefaultDialerOutgoingCall;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource EditFamily;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource External;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource FavoriteContacts;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource FavoriteContactsCallLog;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource ImGroupInfo;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<com.truecaller.detailsview.api.model.DetailsViewSource> InCallUiSources;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource Inbox;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource MessageId;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<com.truecaller.detailsview.api.model.DetailsViewSource> MessageSources;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource MissedCallReminder;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource NotificationCallMeBack;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource NotificationContactRequestAccept;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource NotificationContactRequestRejected;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource NotificationImpact;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource NotificationVBMissedCall;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource OtherMessageID;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource PostCallBlockPrompt;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource SearchHistory;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource SearchResult;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource SpammersList;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource T9Search;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource TelegramMessageID;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource VoicemailTab;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource WhatsappMessageID;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource WhoSearchedForMe;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource WhoViewedMe;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.detailsview.api.model.DetailsViewSource AfterInAppOutgoingCall = new com.truecaller.detailsview.api.model.DetailsViewSource("AfterInAppOutgoingCall", 0, "AfterInAppOutgoingCall");
    public static final com.truecaller.detailsview.api.model.DetailsViewSource AfterCall = new com.truecaller.detailsview.api.model.DetailsViewSource("AfterCall", 1, "AfterCall");
    public static final com.truecaller.detailsview.api.model.DetailsViewSource BulkSmsReferral = new com.truecaller.detailsview.api.model.DetailsViewSource("BulkSmsReferral", 2, "BulkSmsReferral");
    public static final com.truecaller.detailsview.api.model.DetailsViewSource CallAssistantChat = new com.truecaller.detailsview.api.model.DetailsViewSource("CallAssistantChat", 3, "CallAssistantChat");
    public static final com.truecaller.detailsview.api.model.DetailsViewSource CallAssistantIncomingCall = new com.truecaller.detailsview.api.model.DetailsViewSource("CallAssistantIncomingCall", 4, "CallAssistantIncomingCall");
    public static final com.truecaller.detailsview.api.model.DetailsViewSource CallAssistantScreenedCalls = new com.truecaller.detailsview.api.model.DetailsViewSource("CallAssistantScreenedCalls", 5, "CallAssistantScreenedCalls");
    public static final com.truecaller.detailsview.api.model.DetailsViewSource CallFromDV = new com.truecaller.detailsview.api.model.DetailsViewSource("CallFromDV", 6, "CallFromDV");
    public static final com.truecaller.detailsview.api.model.DetailsViewSource CallingGovServices = new com.truecaller.detailsview.api.model.DetailsViewSource("CallingGovServices", 7, "CallingGovServices");
    public static final com.truecaller.detailsview.api.model.DetailsViewSource CallLog = new com.truecaller.detailsview.api.model.DetailsViewSource("CallLog", 8, "CallLog");
    public static final com.truecaller.detailsview.api.model.DetailsViewSource CallNotification = new com.truecaller.detailsview.api.model.DetailsViewSource("CallNotification", 9, "CallNotification");
    public static final com.truecaller.detailsview.api.model.DetailsViewSource CallRecording = new com.truecaller.detailsview.api.model.DetailsViewSource("CallRecording", 10, "CallRecording");
    public static final com.truecaller.detailsview.api.model.DetailsViewSource ContactEditor = new com.truecaller.detailsview.api.model.DetailsViewSource("ContactEditor", 11, "ContactEditor");
    public static final com.truecaller.detailsview.api.model.DetailsViewSource Contacts = new com.truecaller.detailsview.api.model.DetailsViewSource("Contacts", 12, "Contacts");

    private static final /* synthetic */ com.truecaller.detailsview.api.model.DetailsViewSource[] $values() {
        return new com.truecaller.detailsview.api.model.DetailsViewSource[]{AfterInAppOutgoingCall, AfterCall, BulkSmsReferral, CallAssistantChat, CallAssistantIncomingCall, CallAssistantScreenedCalls, CallFromDV, CallingGovServices, CallLog, CallNotification, CallRecording, ContactEditor, Contacts, Conversation, DeepLink, DefaultDialerIncomingCall, DefaultDialerOngoingCall, DefaultDialerOutgoingCall, EditFamily, External, FavoriteContacts, FavoriteContactsCallLog, ImGroupInfo, Inbox, MessageId, MissedCallReminder, NotificationCallMeBack, NotificationContactRequestAccept, NotificationContactRequestRejected, NotificationImpact, OtherMessageID, PostCallBlockPrompt, SearchHistory, SearchResult, SpammersList, T9Search, TelegramMessageID, VoicemailTab, WhatsappMessageID, WhoSearchedForMe, WhoViewedMe, NotificationVBMissedCall, ContactRequestUpdates};
    }

    /* JADX WARN: Type inference failed for: r10v27, types: [nc1.bar, java.lang.Object] */
    static {
        com.truecaller.detailsview.api.model.DetailsViewSource detailsViewSource = new com.truecaller.detailsview.api.model.DetailsViewSource("Conversation", 13, "Conversation");
        Conversation = detailsViewSource;
        DeepLink = new com.truecaller.detailsview.api.model.DetailsViewSource("DeepLink", 14, "DeepLink");
        com.truecaller.detailsview.api.model.DetailsViewSource detailsViewSource2 = new com.truecaller.detailsview.api.model.DetailsViewSource("DefaultDialerIncomingCall", 15, "DefaultDialerIncomingCall");
        DefaultDialerIncomingCall = detailsViewSource2;
        com.truecaller.detailsview.api.model.DetailsViewSource detailsViewSource3 = new com.truecaller.detailsview.api.model.DetailsViewSource("DefaultDialerOngoingCall", 16, "DefaultDialerOngoingCall");
        DefaultDialerOngoingCall = detailsViewSource3;
        com.truecaller.detailsview.api.model.DetailsViewSource detailsViewSource4 = new com.truecaller.detailsview.api.model.DetailsViewSource("DefaultDialerOutgoingCall", 17, "DefaultDialerOutgoingCall");
        DefaultDialerOutgoingCall = detailsViewSource4;
        EditFamily = new com.truecaller.detailsview.api.model.DetailsViewSource("EditFamily", 18, "EditFamily");
        External = new com.truecaller.detailsview.api.model.DetailsViewSource("External", 19, "External");
        FavoriteContacts = new com.truecaller.detailsview.api.model.DetailsViewSource("FavoriteContacts", 20, "FavoriteContacts");
        FavoriteContactsCallLog = new com.truecaller.detailsview.api.model.DetailsViewSource("FavoriteContactsCallLog", 21, "FavoriteContactsCallLog");
        ImGroupInfo = new com.truecaller.detailsview.api.model.DetailsViewSource("ImGroupInfo", 22, "ImGroupInfo");
        com.truecaller.detailsview.api.model.DetailsViewSource detailsViewSource5 = new com.truecaller.detailsview.api.model.DetailsViewSource("Inbox", 23, "Inbox");
        Inbox = detailsViewSource5;
        com.truecaller.detailsview.api.model.DetailsViewSource detailsViewSource6 = new com.truecaller.detailsview.api.model.DetailsViewSource("MessageId", 24, "MessageId");
        MessageId = detailsViewSource6;
        MissedCallReminder = new com.truecaller.detailsview.api.model.DetailsViewSource("MissedCallReminder", 25, "MissedCallReminder");
        NotificationCallMeBack = new com.truecaller.detailsview.api.model.DetailsViewSource("NotificationCallMeBack", 26, "NotificationCallMeBack");
        NotificationContactRequestAccept = new com.truecaller.detailsview.api.model.DetailsViewSource("NotificationContactRequestAccept", 27, "NotificationContactRequestAccept");
        NotificationContactRequestRejected = new com.truecaller.detailsview.api.model.DetailsViewSource("NotificationContactRequestRejected", 28, "NotificationContactRequestRejected");
        NotificationImpact = new com.truecaller.detailsview.api.model.DetailsViewSource("NotificationImpact", 29, "NotificationImpact");
        OtherMessageID = new com.truecaller.detailsview.api.model.DetailsViewSource("OtherMessageID", 30, "OtherMessageID");
        PostCallBlockPrompt = new com.truecaller.detailsview.api.model.DetailsViewSource("PostCallBlockPrompt", 31, "PostCallBlockPrompt");
        SearchHistory = new com.truecaller.detailsview.api.model.DetailsViewSource("SearchHistory", 32, "SearchHistory");
        SearchResult = new com.truecaller.detailsview.api.model.DetailsViewSource("SearchResult", 33, "SearchResult");
        SpammersList = new com.truecaller.detailsview.api.model.DetailsViewSource("SpammersList", 34, "SpammersList");
        T9Search = new com.truecaller.detailsview.api.model.DetailsViewSource("T9Search", 35, "T9Search");
        TelegramMessageID = new com.truecaller.detailsview.api.model.DetailsViewSource("TelegramMessageID", 36, "TelegramMessageID");
        VoicemailTab = new com.truecaller.detailsview.api.model.DetailsViewSource("VoicemailTab", 37, "VoicemailTab");
        WhatsappMessageID = new com.truecaller.detailsview.api.model.DetailsViewSource("WhatsappMessageID", 38, "WhatsappMessageID");
        WhoSearchedForMe = new com.truecaller.detailsview.api.model.DetailsViewSource("WhoSearchedForMe", 39, "WhoSearchedForMe");
        WhoViewedMe = new com.truecaller.detailsview.api.model.DetailsViewSource("WhoViewedMe", 40, "WhoViewedMe");
        NotificationVBMissedCall = new com.truecaller.detailsview.api.model.DetailsViewSource("NotificationVBMissedCall", 41, "NotificationVBMissedCall");
        ContactRequestUpdates = new com.truecaller.detailsview.api.model.DetailsViewSource("ContactRequestUpdates", 42, "ContactRequestUpdates");
        com.truecaller.detailsview.api.model.DetailsViewSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        com.truecaller.detailsview.api.model.DetailsViewSource[] detailsViewSourceArr = {detailsViewSource, detailsViewSource6, detailsViewSource5};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsViewSourceArr, "elements");
        MessageSources = kotlin.collections.v.l0(detailsViewSourceArr);
        com.truecaller.detailsview.api.model.DetailsViewSource[] detailsViewSourceArr2 = {detailsViewSource2, detailsViewSource3, detailsViewSource4};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsViewSourceArr2, "elements");
        InCallUiSources = kotlin.collections.v.l0(detailsViewSourceArr2);
    }

    private DetailsViewSource(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.detailsview.api.model.DetailsViewSource valueOf(java.lang.String str) {
        return (com.truecaller.detailsview.api.model.DetailsViewSource) java.lang.Enum.valueOf(com.truecaller.detailsview.api.model.DetailsViewSource.class, str);
    }

    public static com.truecaller.detailsview.api.model.DetailsViewSource[] values() {
        return (com.truecaller.detailsview.api.model.DetailsViewSource[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
