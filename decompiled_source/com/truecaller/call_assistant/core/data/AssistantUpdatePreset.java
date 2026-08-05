package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/truecaller/call_assistant/core/data/AssistantUpdatePreset;", "", "text", "", "shortText", "action", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getText", "()Ljava/lang/String;", "getShortText", "getAction", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantUpdatePreset {
    public static final int $stable = 0;
    private final int action;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String shortText;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String text;

    public AssistantUpdatePreset(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "shortText");
        this.text = str;
        this.shortText = str2;
        this.action = i;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.AssistantUpdatePreset copy$default(com.truecaller.call_assistant.core.data.AssistantUpdatePreset assistantUpdatePreset, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = assistantUpdatePreset.text;
        }
        if ((i2 & 2) != 0) {
            str2 = assistantUpdatePreset.shortText;
        }
        if ((i2 & 4) != 0) {
            i = assistantUpdatePreset.action;
        }
        return assistantUpdatePreset.copy(str, str2, i);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getShortText() {
        return this.shortText;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.AssistantUpdatePreset copy(@org.jetbrains.annotations.NotNull java.lang.String text, @org.jetbrains.annotations.NotNull java.lang.String shortText, int action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shortText, "shortText");
        return new com.truecaller.call_assistant.core.data.AssistantUpdatePreset(text, shortText, action);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.AssistantUpdatePreset)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.AssistantUpdatePreset assistantUpdatePreset = (com.truecaller.call_assistant.core.data.AssistantUpdatePreset) other;
        return kotlin.jvm.internal.Intrinsics.b(this.text, assistantUpdatePreset.text) && kotlin.jvm.internal.Intrinsics.b(this.shortText, assistantUpdatePreset.shortText) && this.action == assistantUpdatePreset.action;
    }

    public final int getAction() {
        return this.action;
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
        return ax1.bar.e(this.text.hashCode() * 31, 31, this.shortText) + this.action;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.m(this.action, ")", ro0.f.E("AssistantUpdatePreset(text=", this.text, ", shortText=", this.shortText, ", action="));
    }
}
