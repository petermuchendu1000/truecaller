package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class w {
    public final com.truecaller.blockinglevel.api.BlockLevelVariant a;
    public final com.truecaller.blockinglevel.api.BlockLevel b;
    public final com.truecaller.blockinglevel.api.BlockLevelLaunchContext c;
    public final boolean d;
    public final boolean e;

    public w(com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant, com.truecaller.blockinglevel.api.BlockLevel blockLevel, com.truecaller.blockinglevel.api.BlockLevelLaunchContext blockLevelLaunchContext, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelVariant, "variant");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel, "selectedLevel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelLaunchContext, "context");
        this.a = blockLevelVariant;
        this.b = blockLevel;
        this.c = blockLevelLaunchContext;
        this.d = z;
        this.e = z2;
    }

    public static com.truecaller.blockinglevel.presentation.w a(com.truecaller.blockinglevel.presentation.w wVar, com.truecaller.blockinglevel.api.BlockLevel blockLevel, boolean z, int i) {
        com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant = wVar.a;
        if ((i & 2) != 0) {
            blockLevel = wVar.b;
        }
        com.truecaller.blockinglevel.api.BlockLevel blockLevel2 = blockLevel;
        com.truecaller.blockinglevel.api.BlockLevelLaunchContext blockLevelLaunchContext = wVar.c;
        boolean z2 = wVar.d;
        if ((i & 16) != 0) {
            z = wVar.e;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelVariant, "variant");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel2, "selectedLevel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelLaunchContext, "context");
        return new com.truecaller.blockinglevel.presentation.w(blockLevelVariant, blockLevel2, blockLevelLaunchContext, z2, z);
    }

    public final com.truecaller.premium.PremiumLaunchContext.Static b() {
        int i = com.truecaller.blockinglevel.presentation.v.a[this.c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return i82.r.Y8;
                }
                throw new java.lang.RuntimeException();
            }
            return i82.r.E7;
        }
        return i82.r.A8;
    }

    public final boolean c() {
        int i = com.truecaller.blockinglevel.presentation.v.a[this.c.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw new java.lang.RuntimeException();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.blockinglevel.presentation.w)) {
            return false;
        }
        com.truecaller.blockinglevel.presentation.w wVar = (com.truecaller.blockinglevel.presentation.w) obj;
        return this.a == wVar.a && this.b == wVar.b && this.c == wVar.c && this.d == wVar.d && this.e == wVar.e;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i2 = 1237;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (hashCode + i) * 31;
        if (this.e) {
            i2 = 1231;
        }
        return i3 + i2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BlockLevelUiState(variant=");
        sb.append(this.a);
        sb.append(", selectedLevel=");
        sb.append(this.b);
        sb.append(", context=");
        sb.append(this.c);
        sb.append(", isMaxLevelUnlocked=");
        sb.append(this.d);
        sb.append(", showLoading=");
        return h8.s0.s(sb, this.e, ")");
    }
}
