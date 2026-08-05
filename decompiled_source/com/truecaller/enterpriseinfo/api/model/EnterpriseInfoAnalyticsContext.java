package com.truecaller.enterpriseinfo.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/enterpriseinfo/api/model/EnterpriseInfoAnalyticsContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DETAILS_VIEW_V3", "SAVE_PAGE", "EDIT_PAGE", "REPORT_PROFILE_PAGE", "BLOCK_PAGE", "UNBLOCK_PAGE", "REMOVE_CONTACT", "PACS", "FACS", "NEO_PACS", "NEO_FACS", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class EnterpriseInfoAnalyticsContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext DETAILS_VIEW_V3 = new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext("DETAILS_VIEW_V3", 0, "DetailsViewV3");
    public static final com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext SAVE_PAGE = new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext("SAVE_PAGE", 1, "SavePage");
    public static final com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext EDIT_PAGE = new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext("EDIT_PAGE", 2, "EditPage");
    public static final com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext REPORT_PROFILE_PAGE = new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext("REPORT_PROFILE_PAGE", 3, "ReportProfilePage");
    public static final com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext BLOCK_PAGE = new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext("BLOCK_PAGE", 4, "BlockPage");
    public static final com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext UNBLOCK_PAGE = new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext("UNBLOCK_PAGE", 5, "UnBlockPopUp");
    public static final com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext REMOVE_CONTACT = new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext("REMOVE_CONTACT", 6, "RemoveContactPopUp");
    public static final com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext PACS = new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext("PACS", 7, "Pacs");
    public static final com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext FACS = new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext("FACS", 8, "Facs");
    public static final com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext NEO_PACS = new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext("NEO_PACS", 9, "NeoPacs");
    public static final com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext NEO_FACS = new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext("NEO_FACS", 10, "NeoFacs");

    private static final /* synthetic */ com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext[] $values() {
        return new com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext[]{DETAILS_VIEW_V3, SAVE_PAGE, EDIT_PAGE, REPORT_PROFILE_PAGE, BLOCK_PAGE, UNBLOCK_PAGE, REMOVE_CONTACT, PACS, FACS, NEO_PACS, NEO_FACS};
    }

    static {
        com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private EnterpriseInfoAnalyticsContext(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext valueOf(java.lang.String str) {
        return (com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext) java.lang.Enum.valueOf(com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext.class, str);
    }

    public static com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext[] values() {
        return (com.truecaller.enterpriseinfo.api.model.EnterpriseInfoAnalyticsContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
