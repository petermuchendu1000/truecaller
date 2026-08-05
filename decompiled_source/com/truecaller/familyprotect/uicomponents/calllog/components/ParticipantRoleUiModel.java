package com.truecaller.familyprotect.uicomponents.calllog.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/familyprotect/uicomponents/calllog/components/ParticipantRoleUiModel;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "en1/m0", "ADMIN", "MEMBER", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ParticipantRoleUiModel {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.uicomponents.calllog.components.ParticipantRoleUiModel[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final en1.m0 Companion;
    public static final com.truecaller.familyprotect.uicomponents.calllog.components.ParticipantRoleUiModel ADMIN = new com.truecaller.familyprotect.uicomponents.calllog.components.ParticipantRoleUiModel("ADMIN", 0);
    public static final com.truecaller.familyprotect.uicomponents.calllog.components.ParticipantRoleUiModel MEMBER = new com.truecaller.familyprotect.uicomponents.calllog.components.ParticipantRoleUiModel("MEMBER", 1);

    private static final /* synthetic */ com.truecaller.familyprotect.uicomponents.calllog.components.ParticipantRoleUiModel[] $values() {
        return new com.truecaller.familyprotect.uicomponents.calllog.components.ParticipantRoleUiModel[]{ADMIN, MEMBER};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [en1.m0, java.lang.Object] */
    static {
        com.truecaller.familyprotect.uicomponents.calllog.components.ParticipantRoleUiModel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ParticipantRoleUiModel(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.uicomponents.calllog.components.ParticipantRoleUiModel valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.uicomponents.calllog.components.ParticipantRoleUiModel) java.lang.Enum.valueOf(com.truecaller.familyprotect.uicomponents.calllog.components.ParticipantRoleUiModel.class, str);
    }

    public static com.truecaller.familyprotect.uicomponents.calllog.components.ParticipantRoleUiModel[] values() {
        return (com.truecaller.familyprotect.uicomponents.calllog.components.ParticipantRoleUiModel[]) $VALUES.clone();
    }
}
