package com.truecaller.call_assistant.core.data.messages;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u0013\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001b\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/truecaller/call_assistant/core/data/messages/AlertPayloadDto;", "", "level", "Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertLevel;", "label", "Lcom/truecaller/call_assistant/core/data/messages/AlertMessageLabelDto;", "banner", "Lcom/truecaller/call_assistant/core/data/messages/AlertMessageBannerDto;", "vibration", "", "closeButton", "ctaButtons", "", "Lcom/truecaller/call_assistant/core/data/messages/AlertMessageButtonDto;", "<init>", "(Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertLevel;Lcom/truecaller/call_assistant/core/data/messages/AlertMessageLabelDto;Lcom/truecaller/call_assistant/core/data/messages/AlertMessageBannerDto;ZZLjava/util/List;)V", "getLevel", "()Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertLevel;", "getLabel", "()Lcom/truecaller/call_assistant/core/data/messages/AlertMessageLabelDto;", "getBanner", "()Lcom/truecaller/call_assistant/core/data/messages/AlertMessageBannerDto;", "getVibration", "()Z", "getCloseButton", "getCtaButtons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AlertPayloadDto {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.call_assistant.core.data.messages.AlertMessageBannerDto banner;
    private final boolean closeButton;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.call_assistant.core.data.messages.AlertMessageButtonDto> ctaButtons;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.call_assistant.core.data.messages.AlertMessageLabelDto label;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel level;
    private final boolean vibration;

    public AlertPayloadDto(@org.jetbrains.annotations.NotNull com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel alertLevel, @org.jetbrains.annotations.Nullable com.truecaller.call_assistant.core.data.messages.AlertMessageLabelDto alertMessageLabelDto, @org.jetbrains.annotations.NotNull com.truecaller.call_assistant.core.data.messages.AlertMessageBannerDto alertMessageBannerDto, boolean z, boolean z2, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.call_assistant.core.data.messages.AlertMessageButtonDto> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertLevel, "level");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertMessageBannerDto, "banner");
        this.level = alertLevel;
        this.label = alertMessageLabelDto;
        this.banner = alertMessageBannerDto;
        this.vibration = z;
        this.closeButton = z2;
        this.ctaButtons = list;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.messages.AlertPayloadDto copy$default(com.truecaller.call_assistant.core.data.messages.AlertPayloadDto alertPayloadDto, com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel alertLevel, com.truecaller.call_assistant.core.data.messages.AlertMessageLabelDto alertMessageLabelDto, com.truecaller.call_assistant.core.data.messages.AlertMessageBannerDto alertMessageBannerDto, boolean z, boolean z2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            alertLevel = alertPayloadDto.level;
        }
        if ((i & 2) != 0) {
            alertMessageLabelDto = alertPayloadDto.label;
        }
        if ((i & 4) != 0) {
            alertMessageBannerDto = alertPayloadDto.banner;
        }
        if ((i & 8) != 0) {
            z = alertPayloadDto.vibration;
        }
        if ((i & 16) != 0) {
            z2 = alertPayloadDto.closeButton;
        }
        if ((i & 32) != 0) {
            list = alertPayloadDto.ctaButtons;
        }
        boolean z3 = z2;
        java.util.List list2 = list;
        return alertPayloadDto.copy(alertLevel, alertMessageLabelDto, alertMessageBannerDto, z, z3, list2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel getLevel() {
        return this.level;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.call_assistant.core.data.messages.AlertMessageLabelDto getLabel() {
        return this.label;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.call_assistant.core.data.messages.AlertMessageBannerDto getBanner() {
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

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.call_assistant.core.data.messages.AlertMessageButtonDto> component6() {
        return this.ctaButtons;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.messages.AlertPayloadDto copy(@org.jetbrains.annotations.NotNull com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel level, @org.jetbrains.annotations.Nullable com.truecaller.call_assistant.core.data.messages.AlertMessageLabelDto label, @org.jetbrains.annotations.NotNull com.truecaller.call_assistant.core.data.messages.AlertMessageBannerDto banner, boolean vibration, boolean closeButton, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.call_assistant.core.data.messages.AlertMessageButtonDto> ctaButtons) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(banner, "banner");
        return new com.truecaller.call_assistant.core.data.messages.AlertPayloadDto(level, label, banner, vibration, closeButton, ctaButtons);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.messages.AlertPayloadDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.messages.AlertPayloadDto alertPayloadDto = (com.truecaller.call_assistant.core.data.messages.AlertPayloadDto) other;
        return this.level == alertPayloadDto.level && kotlin.jvm.internal.Intrinsics.b(this.label, alertPayloadDto.label) && kotlin.jvm.internal.Intrinsics.b(this.banner, alertPayloadDto.banner) && this.vibration == alertPayloadDto.vibration && this.closeButton == alertPayloadDto.closeButton && kotlin.jvm.internal.Intrinsics.b(this.ctaButtons, alertPayloadDto.ctaButtons);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.messages.AlertMessageBannerDto getBanner() {
        return this.banner;
    }

    public final boolean getCloseButton() {
        return this.closeButton;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.call_assistant.core.data.messages.AlertMessageButtonDto> getCtaButtons() {
        return this.ctaButtons;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.call_assistant.core.data.messages.AlertMessageLabelDto getLabel() {
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
        com.truecaller.call_assistant.core.data.messages.AlertMessageLabelDto alertMessageLabelDto = this.label;
        int i2 = 0;
        if (alertMessageLabelDto == null) {
            hashCode = 0;
        } else {
            hashCode = alertMessageLabelDto.hashCode();
        }
        int hashCode3 = (this.banner.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        int i3 = 1237;
        if (this.vibration) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i4 = (hashCode3 + i) * 31;
        if (this.closeButton) {
            i3 = 1231;
        }
        int i5 = (i4 + i3) * 31;
        java.util.List<com.truecaller.call_assistant.core.data.messages.AlertMessageButtonDto> list = this.ctaButtons;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i5 + i2;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "AlertPayloadDto(level=" + this.level + ", label=" + this.label + ", banner=" + this.banner + ", vibration=" + this.vibration + ", closeButton=" + this.closeButton + ", ctaButtons=" + this.ctaButtons + ")";
    }

    public AlertPayloadDto(com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel alertLevel, com.truecaller.call_assistant.core.data.messages.AlertMessageLabelDto alertMessageLabelDto, com.truecaller.call_assistant.core.data.messages.AlertMessageBannerDto alertMessageBannerDto, boolean z, boolean z2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(alertLevel, alertMessageLabelDto, alertMessageBannerDto, z, z2, (i & 32) != 0 ? kotlin.collections.h0.a : list);
    }
}
