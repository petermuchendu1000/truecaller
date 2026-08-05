package com.truecaller.details_view.routing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/truecaller/details_view/routing/PayActionsManager$Source", "Landroid/os/Parcelable;", "", "Lcom/truecaller/details_view/routing/PayActionsManager$Source;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Acs", "DetailsView", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PayActionsManager$Source implements android.os.Parcelable {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.details_view.routing.PayActionsManager$Source[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.details_view.routing.PayActionsManager$Source> CREATOR;
    public static final com.truecaller.details_view.routing.PayActionsManager$Source Acs = new com.truecaller.details_view.routing.PayActionsManager$Source("Acs", 0);
    public static final com.truecaller.details_view.routing.PayActionsManager$Source DetailsView = new com.truecaller.details_view.routing.PayActionsManager$Source("DetailsView", 1);

    private static final /* synthetic */ com.truecaller.details_view.routing.PayActionsManager$Source[] $values() {
        return new com.truecaller.details_view.routing.PayActionsManager$Source[]{Acs, DetailsView};
    }

    static {
        com.truecaller.details_view.routing.PayActionsManager$Source[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        CREATOR = new hn.bar(13);
    }

    private PayActionsManager$Source(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.details_view.routing.PayActionsManager$Source valueOf(java.lang.String str) {
        return (com.truecaller.details_view.routing.PayActionsManager$Source) java.lang.Enum.valueOf(com.truecaller.details_view.routing.PayActionsManager$Source.class, str);
    }

    public static com.truecaller.details_view.routing.PayActionsManager$Source[] values() {
        return (com.truecaller.details_view.routing.PayActionsManager$Source[]) $VALUES.clone();
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
