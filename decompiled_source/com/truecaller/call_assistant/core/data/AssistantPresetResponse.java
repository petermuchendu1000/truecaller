package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/truecaller/call_assistant/core/data/AssistantPresetResponse;", "", "action", "", "text", "", "shortText", "presetId", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()I", "getText", "()Ljava/lang/String;", "getShortText", "getPresetId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantPresetResponse {
    public static final int $stable = 0;
    private final int action;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String presetId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String shortText;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String text;

    public AssistantPresetResponse(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "shortText");
        this.action = i;
        this.text = str;
        this.shortText = str2;
        this.presetId = str3;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.AssistantPresetResponse copy$default(com.truecaller.call_assistant.core.data.AssistantPresetResponse assistantPresetResponse, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = assistantPresetResponse.action;
        }
        if ((i2 & 2) != 0) {
            str = assistantPresetResponse.text;
        }
        if ((i2 & 4) != 0) {
            str2 = assistantPresetResponse.shortText;
        }
        if ((i2 & 8) != 0) {
            str3 = assistantPresetResponse.presetId;
        }
        return assistantPresetResponse.copy(i, str, str2, str3);
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
    public final java.lang.String getShortText() {
        return this.shortText;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPresetId() {
        return this.presetId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.AssistantPresetResponse copy(int action, @org.jetbrains.annotations.NotNull java.lang.String text, @org.jetbrains.annotations.NotNull java.lang.String shortText, @org.jetbrains.annotations.Nullable java.lang.String presetId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shortText, "shortText");
        return new com.truecaller.call_assistant.core.data.AssistantPresetResponse(action, text, shortText, presetId);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.AssistantPresetResponse)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.AssistantPresetResponse assistantPresetResponse = (com.truecaller.call_assistant.core.data.AssistantPresetResponse) other;
        return this.action == assistantPresetResponse.action && kotlin.jvm.internal.Intrinsics.b(this.text, assistantPresetResponse.text) && kotlin.jvm.internal.Intrinsics.b(this.shortText, assistantPresetResponse.shortText) && kotlin.jvm.internal.Intrinsics.b(this.presetId, assistantPresetResponse.presetId);
    }

    public final int getAction() {
        return this.action;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPresetId() {
        return this.presetId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShortText() {
        return this.shortText;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(ax1.bar.e(this.action * 31, 31, this.text), 31, this.shortText);
        java.lang.String str = this.presetId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return e + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.action;
        java.lang.String str = this.text;
        return bar.x(qb.qux.r("AssistantPresetResponse(action=", i, ", text=", str, ", shortText="), this.shortText, ", presetId=", this.presetId, ")");
    }

    public /* synthetic */ AssistantPresetResponse(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, str2, str3);
    }
}
