package com.truecaller.common.cloudtelephony.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/common/cloudtelephony/utils/MediaType;", "", "directoryName", "", "fileNamePrefix", "extension", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDirectoryName", "()Ljava/lang/String;", "getFileNamePrefix", "getExtension", "VOICEMAIL", "common-cloud-telephony_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class MediaType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.cloudtelephony.utils.MediaType[] $VALUES;
    public static final com.truecaller.common.cloudtelephony.utils.MediaType VOICEMAIL = new com.truecaller.common.cloudtelephony.utils.MediaType("VOICEMAIL", 0, "TrueCallerVoicemails", "voicemail_", ".m4a");

    @org.jetbrains.annotations.NotNull
    private final java.lang.String directoryName;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String extension;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String fileNamePrefix;

    private static final /* synthetic */ com.truecaller.common.cloudtelephony.utils.MediaType[] $values() {
        return new com.truecaller.common.cloudtelephony.utils.MediaType[]{VOICEMAIL};
    }

    static {
        com.truecaller.common.cloudtelephony.utils.MediaType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MediaType(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.directoryName = str2;
        this.fileNamePrefix = str3;
        this.extension = str4;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.cloudtelephony.utils.MediaType valueOf(java.lang.String str) {
        return (com.truecaller.common.cloudtelephony.utils.MediaType) java.lang.Enum.valueOf(com.truecaller.common.cloudtelephony.utils.MediaType.class, str);
    }

    public static com.truecaller.common.cloudtelephony.utils.MediaType[] values() {
        return (com.truecaller.common.cloudtelephony.utils.MediaType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDirectoryName() {
        return this.directoryName;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getExtension() {
        return this.extension;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFileNamePrefix() {
        return this.fileNamePrefix;
    }
}
