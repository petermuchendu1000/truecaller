package com.truecaller.call_assistant.core.callui.v2.chat;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertPayload;", "", "level", "Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertLevel;", "label", "Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertMessageLabel;", "banner", "Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertMessageBanner;", "vibration", "", "closeButton", "<init>", "(Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertLevel;Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertMessageLabel;Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertMessageBanner;ZZ)V", "getLevel", "()Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertLevel;", "getLabel", "()Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertMessageLabel;", "getBanner", "()Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertMessageBanner;", "getVibration", "()Z", "getCloseButton", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AlertPayload {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner banner;
    private final boolean closeButton;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageLabel label;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel level;
    private final boolean vibration;

    public AlertPayload(@org.jetbrains.annotations.NotNull com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel alertLevel, @org.jetbrains.annotations.Nullable com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageLabel alertMessageLabel, @org.jetbrains.annotations.NotNull com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner alertMessageBanner, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertLevel, "level");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertMessageBanner, "banner");
        this.level = alertLevel;
        this.label = alertMessageLabel;
        this.banner = alertMessageBanner;
        this.vibration = z;
        this.closeButton = z2;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.callui.v2.chat.AlertPayload copy$default(com.truecaller.call_assistant.core.callui.v2.chat.AlertPayload alertPayload, com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel alertLevel, com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageLabel alertMessageLabel, com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner alertMessageBanner, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            alertLevel = alertPayload.level;
        }
        if ((i & 2) != 0) {
            alertMessageLabel = alertPayload.label;
        }
        if ((i & 4) != 0) {
            alertMessageBanner = alertPayload.banner;
        }
        if ((i & 8) != 0) {
            z = alertPayload.vibration;
        }
        if ((i & 16) != 0) {
            z2 = alertPayload.closeButton;
        }
        boolean z3 = z2;
        com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner alertMessageBanner2 = alertMessageBanner;
        return alertPayload.copy(alertLevel, alertMessageLabel, alertMessageBanner2, z, z3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel getLevel() {
        return this.level;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageLabel getLabel() {
        return this.label;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner getBanner() {
        return this.banner;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getVibration() {
        return this.vibration;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCloseButton() {
        return this.closeButton;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.callui.v2.chat.AlertPayload copy(@org.jetbrains.annotations.NotNull com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel level, @org.jetbrains.annotations.Nullable com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageLabel label, @org.jetbrains.annotations.NotNull com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner banner, boolean vibration, boolean closeButton) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(banner, "banner");
        return new com.truecaller.call_assistant.core.callui.v2.chat.AlertPayload(level, label, banner, vibration, closeButton);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.callui.v2.chat.AlertPayload)) {
            return false;
        }
        com.truecaller.call_assistant.core.callui.v2.chat.AlertPayload alertPayload = (com.truecaller.call_assistant.core.callui.v2.chat.AlertPayload) other;
        return this.level == alertPayload.level && kotlin.jvm.internal.Intrinsics.b(this.label, alertPayload.label) && kotlin.jvm.internal.Intrinsics.b(this.banner, alertPayload.banner) && this.vibration == alertPayload.vibration && this.closeButton == alertPayload.closeButton;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner getBanner() {
        return this.banner;
    }

    public final boolean getCloseButton() {
        return this.closeButton;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageLabel getLabel() {
        return this.label;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel getLevel() {
        return this.level;
    }

    public final boolean getVibration() {
        return this.vibration;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = this.level.hashCode() * 31;
        com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageLabel alertMessageLabel = this.label;
        if (alertMessageLabel == null) {
            hashCode = 0;
        } else {
            hashCode = alertMessageLabel.hashCode();
        }
        int hashCode3 = (this.banner.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        int i2 = 1237;
        if (this.vibration) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (hashCode3 + i) * 31;
        if (this.closeButton) {
            i2 = 1231;
        }
        return i3 + i2;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel alertLevel = this.level;
        com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageLabel alertMessageLabel = this.label;
        com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner alertMessageBanner = this.banner;
        boolean z = this.vibration;
        boolean z2 = this.closeButton;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AlertPayload(level=");
        sb.append(alertLevel);
        sb.append(", label=");
        sb.append(alertMessageLabel);
        sb.append(", banner=");
        sb.append(alertMessageBanner);
        sb.append(", vibration=");
        sb.append(z);
        sb.append(", closeButton=");
        return h8.s0.s(sb, z2, ")");
    }

    public /* synthetic */ AlertPayload(com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel alertLevel, com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageLabel alertMessageLabel, com.truecaller.call_assistant.core.callui.v2.chat.AlertMessageBanner alertMessageBanner, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(alertLevel, (i & 2) != 0 ? null : alertMessageLabel, alertMessageBanner, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2);
    }
}
