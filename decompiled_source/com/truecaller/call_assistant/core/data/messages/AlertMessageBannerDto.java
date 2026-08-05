package com.truecaller.call_assistant.core.data.messages;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/call_assistant/core/data/messages/AlertMessageBannerDto;", "", "title", "", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AlertMessageBannerDto {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String body;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String title;

    public AlertMessageBannerDto(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "body");
        this.title = str;
        this.body = str2;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.messages.AlertMessageBannerDto copy$default(com.truecaller.call_assistant.core.data.messages.AlertMessageBannerDto alertMessageBannerDto, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = alertMessageBannerDto.title;
        }
        if ((i & 2) != 0) {
            str2 = alertMessageBannerDto.body;
        }
        return alertMessageBannerDto.copy(str, str2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBody() {
        return this.body;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.messages.AlertMessageBannerDto copy(@org.jetbrains.annotations.Nullable java.lang.String title, @org.jetbrains.annotations.NotNull java.lang.String body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return new com.truecaller.call_assistant.core.data.messages.AlertMessageBannerDto(title, body);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.messages.AlertMessageBannerDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.messages.AlertMessageBannerDto alertMessageBannerDto = (com.truecaller.call_assistant.core.data.messages.AlertMessageBannerDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.title, alertMessageBannerDto.title) && kotlin.jvm.internal.Intrinsics.b(this.body, alertMessageBannerDto.body);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBody() {
        return this.body;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return this.title;
    }

    public int hashCode() {
        java.lang.String str = this.title;
        return this.body.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("AlertMessageBannerDto(title=", this.title, ", body=", this.body, ")");
    }
}
