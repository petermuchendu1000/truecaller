package com.truecaller.call_assistant.core.push.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/truecaller/call_assistant/core/push/model/ScreenCallAlertPayload;", "", "level", "", "title", "body", "vibration", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getLevel", "()Ljava/lang/String;", "getTitle", "getBody", "getVibration", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class ScreenCallAlertPayload {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String body;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String level;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String title;
    private final boolean vibration;

    public ScreenCallAlertPayload(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "level");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "body");
        this.level = str;
        this.title = str2;
        this.body = str3;
        this.vibration = z;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.push.model.ScreenCallAlertPayload copy$default(com.truecaller.call_assistant.core.push.model.ScreenCallAlertPayload screenCallAlertPayload, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = screenCallAlertPayload.level;
        }
        if ((i & 2) != 0) {
            str2 = screenCallAlertPayload.title;
        }
        if ((i & 4) != 0) {
            str3 = screenCallAlertPayload.body;
        }
        if ((i & 8) != 0) {
            z = screenCallAlertPayload.vibration;
        }
        return screenCallAlertPayload.copy(str, str2, str3, z);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLevel() {
        return this.level;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBody() {
        return this.body;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getVibration() {
        return this.vibration;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.push.model.ScreenCallAlertPayload copy(@org.jetbrains.annotations.NotNull java.lang.String level, @org.jetbrains.annotations.NotNull java.lang.String title, @org.jetbrains.annotations.NotNull java.lang.String body, boolean vibration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return new com.truecaller.call_assistant.core.push.model.ScreenCallAlertPayload(level, title, body, vibration);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.push.model.ScreenCallAlertPayload)) {
            return false;
        }
        com.truecaller.call_assistant.core.push.model.ScreenCallAlertPayload screenCallAlertPayload = (com.truecaller.call_assistant.core.push.model.ScreenCallAlertPayload) other;
        return kotlin.jvm.internal.Intrinsics.b(this.level, screenCallAlertPayload.level) && kotlin.jvm.internal.Intrinsics.b(this.title, screenCallAlertPayload.title) && kotlin.jvm.internal.Intrinsics.b(this.body, screenCallAlertPayload.body) && this.vibration == screenCallAlertPayload.vibration;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBody() {
        return this.body;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLevel() {
        return this.level;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return this.title;
    }

    public final boolean getVibration() {
        return this.vibration;
    }

    public int hashCode() {
        int i;
        int e = ax1.bar.e(ax1.bar.e(this.level.hashCode() * 31, 31, this.title), 31, this.body);
        if (this.vibration) {
            i = 1231;
        } else {
            i = 1237;
        }
        return e + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.level;
        java.lang.String str2 = this.title;
        return ax1.bar.m(this.body, ", vibration=", ")", ro0.f.E("ScreenCallAlertPayload(level=", str, ", title=", str2, ", body="), this.vibration);
    }
}
