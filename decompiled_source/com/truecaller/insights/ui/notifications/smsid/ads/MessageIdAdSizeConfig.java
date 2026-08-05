package com.truecaller.insights.ui.notifications.smsid.ads;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/insights/ui/notifications/smsid/ads/MessageIdAdSizeConfig;", "", "height", "", "width", "<init>", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class MessageIdAdSizeConfig {
    public static final int $stable = 0;
    private final int height;
    private final int width;

    public MessageIdAdSizeConfig(int i, int i2) {
        this.height = i;
        this.width = i2;
    }

    public static /* synthetic */ com.truecaller.insights.ui.notifications.smsid.ads.MessageIdAdSizeConfig copy$default(com.truecaller.insights.ui.notifications.smsid.ads.MessageIdAdSizeConfig messageIdAdSizeConfig, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = messageIdAdSizeConfig.height;
        }
        if ((i3 & 2) != 0) {
            i2 = messageIdAdSizeConfig.width;
        }
        return messageIdAdSizeConfig.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.ui.notifications.smsid.ads.MessageIdAdSizeConfig copy(int height, int width) {
        return new com.truecaller.insights.ui.notifications.smsid.ads.MessageIdAdSizeConfig(height, width);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.ui.notifications.smsid.ads.MessageIdAdSizeConfig)) {
            return false;
        }
        com.truecaller.insights.ui.notifications.smsid.ads.MessageIdAdSizeConfig messageIdAdSizeConfig = (com.truecaller.insights.ui.notifications.smsid.ads.MessageIdAdSizeConfig) other;
        return this.height == messageIdAdSizeConfig.height && this.width == messageIdAdSizeConfig.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.height * 31) + this.width;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return h0.b.P(this.height, this.width, "MessageIdAdSizeConfig(height=", ", width=", ")");
    }
}
