package com.truecaller.messaging.messaginglist.v2.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/truecaller/messaging/messaginglist/v2/model/MessageFilterType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "UNREAD", "INBOX", "BILL", "DELIVERY", "TRAVEL", "OTP", "TRANSACTION", "SPAM", "OFFERS", "NON_DMA_INBOX", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageFilterType implements android.os.Parcelable {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.messaginglist.v2.model.MessageFilterType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.messaginglist.v2.model.MessageFilterType> CREATOR;
    public static final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType UNREAD = new com.truecaller.messaging.messaginglist.v2.model.MessageFilterType("UNREAD", 0);
    public static final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType INBOX = new com.truecaller.messaging.messaginglist.v2.model.MessageFilterType("INBOX", 1);
    public static final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType BILL = new com.truecaller.messaging.messaginglist.v2.model.MessageFilterType("BILL", 2);
    public static final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType DELIVERY = new com.truecaller.messaging.messaginglist.v2.model.MessageFilterType("DELIVERY", 3);
    public static final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType TRAVEL = new com.truecaller.messaging.messaginglist.v2.model.MessageFilterType("TRAVEL", 4);
    public static final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType OTP = new com.truecaller.messaging.messaginglist.v2.model.MessageFilterType("OTP", 5);
    public static final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType TRANSACTION = new com.truecaller.messaging.messaginglist.v2.model.MessageFilterType("TRANSACTION", 6);
    public static final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType SPAM = new com.truecaller.messaging.messaginglist.v2.model.MessageFilterType("SPAM", 7);
    public static final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType OFFERS = new com.truecaller.messaging.messaginglist.v2.model.MessageFilterType("OFFERS", 8);
    public static final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType NON_DMA_INBOX = new com.truecaller.messaging.messaginglist.v2.model.MessageFilterType("NON_DMA_INBOX", 9);

    private static final /* synthetic */ com.truecaller.messaging.messaginglist.v2.model.MessageFilterType[] $values() {
        return new com.truecaller.messaging.messaginglist.v2.model.MessageFilterType[]{UNREAD, INBOX, BILL, DELIVERY, TRAVEL, OTP, TRANSACTION, SPAM, OFFERS, NON_DMA_INBOX};
    }

    static {
        com.truecaller.messaging.messaginglist.v2.model.MessageFilterType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        CREATOR = new rz0.b0(13);
    }

    private MessageFilterType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.messaginglist.v2.model.MessageFilterType valueOf(java.lang.String str) {
        return (com.truecaller.messaging.messaginglist.v2.model.MessageFilterType) java.lang.Enum.valueOf(com.truecaller.messaging.messaginglist.v2.model.MessageFilterType.class, str);
    }

    public static com.truecaller.messaging.messaginglist.v2.model.MessageFilterType[] values() {
        return (com.truecaller.messaging.messaginglist.v2.model.MessageFilterType[]) $VALUES.clone();
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
