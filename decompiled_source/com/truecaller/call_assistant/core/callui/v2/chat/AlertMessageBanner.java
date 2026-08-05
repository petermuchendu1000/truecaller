package com.truecaller.call_assistant.core.callui.v2.chat;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertMessageBanner;", "", "title", "", "body", "CTAButtons", "", "Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertMessageButton;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getCTAButtons", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AlertMessageBanner {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageButton> CTAButtons;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String body;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String title;

    public AlertMessageBanner(java.lang.String str, java.lang.String str2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? kotlin.collections.h0.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner copy$default(com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner alertMessageBanner, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = alertMessageBanner.title;
        }
        if ((i & 2) != 0) {
            str2 = alertMessageBanner.body;
        }
        if ((i & 4) != 0) {
            list = alertMessageBanner.CTAButtons;
        }
        return alertMessageBanner.copy(str, str2, list);
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

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageButton> component3() {
        return this.CTAButtons;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner copy(@org.jetbrains.annotations.Nullable java.lang.String title, @org.jetbrains.annotations.NotNull java.lang.String body, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageButton> CTAButtons) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return new com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner(title, body, CTAButtons);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner)) {
            return false;
        }
        com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner alertMessageBanner = (com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner) other;
        return kotlin.jvm.internal.Intrinsics.b(this.title, alertMessageBanner.title) && kotlin.jvm.internal.Intrinsics.b(this.body, alertMessageBanner.body) && kotlin.jvm.internal.Intrinsics.b(this.CTAButtons, alertMessageBanner.CTAButtons);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBody() {
        return this.body;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageButton> getCTAButtons() {
        return this.CTAButtons;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        java.lang.String str = this.title;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int e = ax1.bar.e(hashCode * 31, 31, this.body);
        java.util.List<com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageButton> list = this.CTAButtons;
        if (list != null) {
            i = list.hashCode();
        }
        return e + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.body;
        return y.o.g(ro0.f.E("AlertMessageBanner(title=", str, ", body=", str2, ", CTAButtons="), this.CTAButtons, ")");
    }

    public AlertMessageBanner(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageButton> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "body");
        this.title = str;
        this.body = str2;
        this.CTAButtons = list;
    }
}
