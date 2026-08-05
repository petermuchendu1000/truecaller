package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/truecaller/call_assistant/core/data/VoiceDto;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "name", "default", "", "language", "Lcom/truecaller/call_assistant/core/data/AssistantLanguage;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/truecaller/call_assistant/core/data/AssistantLanguage;)V", "getId", "()Ljava/lang/String;", "getName", "getDefault", "()Z", "getLanguage", "()Lcom/truecaller/call_assistant/core/data/AssistantLanguage;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class VoiceDto {
    public static final int $stable = 8;

    @bw.qux("default")
    private final boolean default;

    @bw.qux("_id")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    @bw.qux("language")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.call_assistant.core.data.AssistantLanguage language;

    @bw.qux("name")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    public VoiceDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, boolean z, @org.jetbrains.annotations.NotNull com.truecaller.call_assistant.core.data.AssistantLanguage assistantLanguage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assistantLanguage, "language");
        this.id = str;
        this.name = str2;
        this.default = z;
        this.language = assistantLanguage;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.VoiceDto copy$default(com.truecaller.call_assistant.core.data.VoiceDto voiceDto, java.lang.String str, java.lang.String str2, boolean z, com.truecaller.call_assistant.core.data.AssistantLanguage assistantLanguage, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = voiceDto.id;
        }
        if ((i & 2) != 0) {
            str2 = voiceDto.name;
        }
        if ((i & 4) != 0) {
            z = voiceDto.default;
        }
        if ((i & 8) != 0) {
            assistantLanguage = voiceDto.language;
        }
        return voiceDto.copy(str, str2, z, assistantLanguage);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getDefault() {
        return this.default;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final com.truecaller.call_assistant.core.data.AssistantLanguage getLanguage() {
        return this.language;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.VoiceDto copy(@org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String name, boolean r4, @org.jetbrains.annotations.NotNull com.truecaller.call_assistant.core.data.AssistantLanguage language) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        return new com.truecaller.call_assistant.core.data.VoiceDto(id, name, r4, language);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.VoiceDto)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.VoiceDto voiceDto = (com.truecaller.call_assistant.core.data.VoiceDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, voiceDto.id) && kotlin.jvm.internal.Intrinsics.b(this.name, voiceDto.name) && this.default == voiceDto.default && kotlin.jvm.internal.Intrinsics.b(this.language, voiceDto.language);
    }

    public final boolean getDefault() {
        return this.default;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.AssistantLanguage getLanguage() {
        return this.language;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    public int hashCode() {
        int i;
        int e = ax1.bar.e(this.id.hashCode() * 31, 31, this.name);
        if (this.default) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.language.hashCode() + ((e + i) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        boolean z = this.default;
        com.truecaller.call_assistant.core.data.AssistantLanguage assistantLanguage = this.language;
        java.lang.StringBuilder E = ro0.f.E("VoiceDto(id=", str, ", name=", str2, ", default=");
        E.append(z);
        E.append(", language=");
        E.append(assistantLanguage);
        E.append(")");
        return E.toString();
    }
}
