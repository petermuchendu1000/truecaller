package com.truecaller.familyprotect.uicomponents.bottomsheets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/familyprotect/uicomponents/bottomsheets/ShareTextClickHandler$DeliveryMethod", "", "Lcom/truecaller/familyprotect/uicomponents/bottomsheets/ShareTextClickHandler$DeliveryMethod;", "<init>", "(Ljava/lang/String;I)V", "WHATSAPP", "SMS", "CLIPBOARD", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ShareTextClickHandler$DeliveryMethod {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod[] $VALUES;
    public static final com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod WHATSAPP = new com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod("WHATSAPP", 0);
    public static final com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod SMS = new com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod("SMS", 1);
    public static final com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod CLIPBOARD = new com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod("CLIPBOARD", 2);

    private static final /* synthetic */ com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod[] $values() {
        return new com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod[]{WHATSAPP, SMS, CLIPBOARD};
    }

    static {
        com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ShareTextClickHandler$DeliveryMethod(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod) java.lang.Enum.valueOf(com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod.class, str);
    }

    public static com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod[] values() {
        return (com.truecaller.familyprotect.uicomponents.bottomsheets.ShareTextClickHandler$DeliveryMethod[]) $VALUES.clone();
    }
}
