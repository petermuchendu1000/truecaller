package com.truecaller.call_assistant.core.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\bJ\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, d2 = {"Lcom/truecaller/call_assistant/core/data/Input;", "Landroid/os/Parcelable;", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "placeholder", "name", "value", "characterLimit", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getPlaceholder", "getName", "getValue", "getCharacterLimit", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Input implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.call_assistant.core.data.Input> CREATOR = new vp0.bar(3);
    private final int characterLimit;

    @bw.qux("_id")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String placeholder;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String value;

    public Input(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "placeholder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "name");
        this.id = str;
        this.placeholder = str2;
        this.name = str3;
        this.value = str4;
        this.characterLimit = i;
    }

    public static /* synthetic */ com.truecaller.call_assistant.core.data.Input copy$default(com.truecaller.call_assistant.core.data.Input input, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = input.id;
        }
        if ((i2 & 2) != 0) {
            str2 = input.placeholder;
        }
        if ((i2 & 4) != 0) {
            str3 = input.name;
        }
        if ((i2 & 8) != 0) {
            str4 = input.value;
        }
        if ((i2 & 16) != 0) {
            i = input.characterLimit;
        }
        int i3 = i;
        java.lang.String str5 = str3;
        return input.copy(str, str2, str5, str4, i3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPlaceholder() {
        return this.placeholder;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCharacterLimit() {
        return this.characterLimit;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.core.data.Input copy(@org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String placeholder, @org.jetbrains.annotations.NotNull java.lang.String name, @org.jetbrains.annotations.Nullable java.lang.String value, int characterLimit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new com.truecaller.call_assistant.core.data.Input(id, placeholder, name, value, characterLimit);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.core.data.Input)) {
            return false;
        }
        com.truecaller.call_assistant.core.data.Input input = (com.truecaller.call_assistant.core.data.Input) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, input.id) && kotlin.jvm.internal.Intrinsics.b(this.placeholder, input.placeholder) && kotlin.jvm.internal.Intrinsics.b(this.name, input.name) && kotlin.jvm.internal.Intrinsics.b(this.value, input.value) && this.characterLimit == input.characterLimit;
    }

    public final int getCharacterLimit() {
        return this.characterLimit;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlaceholder() {
        return this.placeholder;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(ax1.bar.e(this.id.hashCode() * 31, 31, this.placeholder), 31, this.name);
        java.lang.String str = this.value;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((e + hashCode) * 31) + this.characterLimit;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.placeholder;
        java.lang.String str3 = this.name;
        java.lang.String str4 = this.value;
        int i = this.characterLimit;
        java.lang.StringBuilder E = ro0.f.E("Input(id=", str, ", placeholder=", str2, ", name=");
        bar.E(E, str3, ", value=", str4, ", characterLimit=");
        return bar.m(i, ")", E);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.placeholder);
        dest.writeString(this.name);
        dest.writeString(this.value);
        dest.writeInt(this.characterLimit);
    }
}
