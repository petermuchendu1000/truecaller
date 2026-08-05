package com.truecaller.call_assistant.core.data.messages;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/truecaller/call_assistant/core/data/messages/AlertMessageButtonDto;", "", "text", "", "action", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAction", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AlertMessageButtonDto {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String action;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String text;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String url;

    public AlertMessageButtonDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        this.text = str;
        this.action = str2;
        this.url = str3;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.messages.AlertMessageButtonDto copy$default(com.truecaller.call_assistant.core.data.messages.AlertMessageButtonDto alertMessageButtonDto, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = alertMessageButtonDto.text;
        }
        if ((i & 2) != 0) {
            str2 = alertMessageButtonDto.action;
        }
        if ((i & 4) != 0) {
            str3 = alertMessageButtonDto.url;
        }
        return alertMessageButtonDto.copy(str, str2, str3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAction() {
        return this.action;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.messages.AlertMessageButtonDto copy(@org.jetbrains.annotations.NotNull java.lang.String text, @org.jetbrains.annotations.Nullable java.lang.String action, @org.jetbrains.annotations.Nullable java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        return new com.truecaller.call_assistant.core.data.messages.AlertMessageButtonDto(text, action, url);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.messages.AlertMessageButtonDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.messages.AlertMessageButtonDto alertMessageButtonDto = (com.truecaller.call_assistant.core.data.messages.AlertMessageButtonDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.text, alertMessageButtonDto.text) && kotlin.jvm.internal.Intrinsics.b(this.action, alertMessageButtonDto.action) && kotlin.jvm.internal.Intrinsics.b(this.url, alertMessageButtonDto.url);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAction() {
        return this.action;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        java.lang.String str = this.action;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.url;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.url, ")", ro0.f.E("AlertMessageButtonDto(text=", this.text, ", action=", this.action, ", url="));
    }
}
