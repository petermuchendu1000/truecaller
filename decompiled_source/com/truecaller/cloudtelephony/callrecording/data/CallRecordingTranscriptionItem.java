package com.truecaller.cloudtelephony.callrecording.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0005J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/data/CallRecordingTranscriptionItem;", "Landroid/os/Parcelable;", "text", "", "speakerTag", "", "time", "<init>", "(Ljava/lang/String;II)V", "getText", "()Ljava/lang/String;", "getSpeakerTag", "()I", "getTime", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CallRecordingTranscriptionItem implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionItem> CREATOR = new rz0.b0(0);
    private final int speakerTag;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String text;
    private final int time;

    public CallRecordingTranscriptionItem(@org.jetbrains.annotations.NotNull java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        this.text = str;
        this.speakerTag = i;
        this.time = i2;
    }

    public static /* synthetic */ com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionItem copy$default(com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionItem callRecordingTranscriptionItem, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = callRecordingTranscriptionItem.text;
        }
        if ((i3 & 2) != 0) {
            i = callRecordingTranscriptionItem.speakerTag;
        }
        if ((i3 & 4) != 0) {
            i2 = callRecordingTranscriptionItem.time;
        }
        return callRecordingTranscriptionItem.copy(str, i, i2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSpeakerTag() {
        return this.speakerTag;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionItem copy(@org.jetbrains.annotations.NotNull java.lang.String text, int speakerTag, int time) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        return new com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionItem(text, speakerTag, time);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionItem)) {
            return false;
        }
        com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionItem callRecordingTranscriptionItem = (com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionItem) other;
        return kotlin.jvm.internal.Intrinsics.b(this.text, callRecordingTranscriptionItem.text) && this.speakerTag == callRecordingTranscriptionItem.speakerTag && this.time == callRecordingTranscriptionItem.time;
    }

    public final int getSpeakerTag() {
        return this.speakerTag;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return this.text;
    }

    public final int getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.speakerTag) * 31) + this.time;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.text;
        return bar.m(this.time, ")", bar.z("CallRecordingTranscriptionItem(text=", this.speakerTag, str, ", speakerTag=", ", time="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        dest.writeInt(this.speakerTag);
        dest.writeInt(this.time);
    }
}
