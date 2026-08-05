package com.truecaller.messaging.businesshome.presentation.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0004J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0019"}, d2 = {"Lcom/truecaller/messaging/businesshome/presentation/data/BusinessHomeFilterType;", "Landroid/os/Parcelable;", "", "displayName", "", "iconRes", "<init>", "(Ljava/lang/String;III)V", "getDisplayName", "()I", "getIconRes", "UNREAD", "INBOX", "BILL", "DELIVERY", "TRAVEL", "OTP", "TRANSACTION", "SPAM", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BusinessHomeFilterType implements android.os.Parcelable {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType> CREATOR;
    private final int displayName;
    private final int iconRes;
    public static final com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType UNREAD = new com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType("UNREAD", 0, 2132017782, 2131232653);
    public static final com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType INBOX = new com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType("INBOX", 1, 2132017776, 2131232647);
    public static final com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType BILL = new com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType("BILL", 2, 2132017774, 2131232644);
    public static final com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType DELIVERY = new com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType("DELIVERY", 3, 2132017775, 2131232646);
    public static final com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType TRAVEL = new com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType("TRAVEL", 4, 2132017781, 2131232652);
    public static final com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType OTP = new com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType("OTP", 5, 2132017777, 2131232649);
    public static final com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType TRANSACTION = new com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType("TRANSACTION", 6, 2132017780, 2131232651);
    public static final com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType SPAM = new com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType("SPAM", 7, 2132017779, 2131232650);

    private static final /* synthetic */ com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType[] $values() {
        return new com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType[]{UNREAD, INBOX, BILL, DELIVERY, TRAVEL, OTP, TRANSACTION, SPAM};
    }

    static {
        com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        CREATOR = new hn.bar(5);
    }

    private BusinessHomeFilterType(java.lang.String str, int i, int i2, int i3) {
        this.displayName = i2;
        this.iconRes = i3;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType valueOf(java.lang.String str) {
        return (com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType) java.lang.Enum.valueOf(com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType.class, str);
    }

    public static com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType[] values() {
        return (com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getDisplayName() {
        return this.displayName;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
