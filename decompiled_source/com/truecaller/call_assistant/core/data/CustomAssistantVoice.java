package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/truecaller/call_assistant/core/data/CustomAssistantVoice;", "", "previewUrl", "", "transcript", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPreviewUrl", "()Ljava/lang/String;", "getTranscript", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CustomAssistantVoice {
    public static final int $stable = 0;

    @bw.qux("preview")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String previewUrl;

    @bw.qux("transcript")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String transcript;

    public CustomAssistantVoice(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        this.previewUrl = str;
        this.transcript = str2;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPreviewUrl() {
        return this.previewUrl;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTranscript() {
        return this.transcript;
    }
}
