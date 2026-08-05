package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/truecaller/call_assistant/core/data/AssistantStaticPresetResponse;", "", "action", "", "text", "", "url", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()I", "getText", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantStaticPresetResponse {
    public static final int $stable = 0;
    private final int action;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String text;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String url;

    public AssistantStaticPresetResponse(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "url");
        this.action = i;
        this.text = str;
        this.url = str2;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.AssistantStaticPresetResponse copy$default(com.truecaller.call_assistant.core.data.AssistantStaticPresetResponse assistantStaticPresetResponse, int i, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = assistantStaticPresetResponse.action;
        }
        if ((i2 & 2) != 0) {
            str = assistantStaticPresetResponse.text;
        }
        if ((i2 & 4) != 0) {
            str2 = assistantStaticPresetResponse.url;
        }
        return assistantStaticPresetResponse.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.AssistantStaticPresetResponse copy(int action, @org.jetbrains.annotations.NotNull java.lang.String text, @org.jetbrains.annotations.NotNull java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        return new com.truecaller.call_assistant.core.data.AssistantStaticPresetResponse(action, text, url);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.AssistantStaticPresetResponse)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.AssistantStaticPresetResponse assistantStaticPresetResponse = (com.truecaller.call_assistant.core.data.AssistantStaticPresetResponse) other;
        return this.action == assistantStaticPresetResponse.action && kotlin.jvm.internal.Intrinsics.b(this.text, assistantStaticPresetResponse.text) && kotlin.jvm.internal.Intrinsics.b(this.url, assistantStaticPresetResponse.url);
    }

    public final int getAction() {
        return this.action;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + ax1.bar.e(this.action * 31, 31, this.text);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.url, ")", qb.qux.r("AssistantStaticPresetResponse(action=", this.action, ", text=", this.text, ", url="));
    }
}
