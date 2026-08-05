package com.truecaller.blockinglevel.presentation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/blockinglevel/presentation/BlockLevelArgs;", "Landroid/os/Parcelable;", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BlockLevelArgs implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.blockinglevel.presentation.BlockLevelArgs> CREATOR = new cb1.bar(8);
    public final com.truecaller.blockinglevel.api.BlockLevel a;
    public final com.truecaller.blockinglevel.api.BlockLevelVariant b;
    public final com.truecaller.blockinglevel.api.BlockLevelLaunchContext c;

    public BlockLevelArgs(com.truecaller.blockinglevel.api.BlockLevel blockLevel, com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant, com.truecaller.blockinglevel.api.BlockLevelLaunchContext blockLevelLaunchContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel, "defaultLevel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelVariant, "variant");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelLaunchContext, "launchContext");
        this.a = blockLevel;
        this.b = blockLevelVariant;
        this.c = blockLevelLaunchContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.blockinglevel.presentation.BlockLevelArgs)) {
            return false;
        }
        com.truecaller.blockinglevel.presentation.BlockLevelArgs blockLevelArgs = (com.truecaller.blockinglevel.presentation.BlockLevelArgs) obj;
        return this.a == blockLevelArgs.a && this.b == blockLevelArgs.b && this.c == blockLevelArgs.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "BlockLevelArgs(defaultLevel=" + this.a + ", variant=" + this.b + ", launchContext=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a.name());
        parcel.writeString(this.b.name());
        parcel.writeString(this.c.name());
    }
}
