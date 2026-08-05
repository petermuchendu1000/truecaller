package com.truecaller.ads.adsrules.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/truecaller/ads/adsrules/model/NeoRuleHolder;", "Landroid/os/Parcelable;", "neoRules", "", "Lcom/truecaller/ads/adsrules/model/NeoRule;", "neoStatus", "Lcom/truecaller/ads/adsrules/model/NeoStatus;", "<init>", "(Ljava/util/List;Lcom/truecaller/ads/adsrules/model/NeoStatus;)V", "getNeoRules", "()Ljava/util/List;", "getNeoStatus", "()Lcom/truecaller/ads/adsrules/model/NeoStatus;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class NeoRuleHolder implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrules.model.NeoRuleHolder> CREATOR = new om0.bar(22);

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.adsrules.model.NeoRule> neoRules;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.adsrules.model.NeoStatus neoStatus;

    public NeoRuleHolder(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.adsrules.model.NeoRule> list, @org.jetbrains.annotations.Nullable com.truecaller.ads.adsrules.model.NeoStatus neoStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "neoRules");
        this.neoRules = list;
        this.neoStatus = neoStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.adsrules.model.NeoRuleHolder copy$default(com.truecaller.ads.adsrules.model.NeoRuleHolder neoRuleHolder, java.util.List list, com.truecaller.ads.adsrules.model.NeoStatus neoStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = neoRuleHolder.neoRules;
        }
        if ((i & 2) != 0) {
            neoStatus = neoRuleHolder.neoStatus;
        }
        return neoRuleHolder.copy(list, neoStatus);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.adsrules.model.NeoRule> component1() {
        return this.neoRules;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.ads.adsrules.model.NeoStatus getNeoStatus() {
        return this.neoStatus;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrules.model.NeoRuleHolder copy(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.adsrules.model.NeoRule> neoRules, @org.jetbrains.annotations.Nullable com.truecaller.ads.adsrules.model.NeoStatus neoStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(neoRules, "neoRules");
        return new com.truecaller.ads.adsrules.model.NeoRuleHolder(neoRules, neoStatus);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrules.model.NeoRuleHolder)) {
            return false;
        }
        com.truecaller.ads.adsrules.model.NeoRuleHolder neoRuleHolder = (com.truecaller.ads.adsrules.model.NeoRuleHolder) other;
        return kotlin.jvm.internal.Intrinsics.b(this.neoRules, neoRuleHolder.neoRules) && kotlin.jvm.internal.Intrinsics.b(this.neoStatus, neoRuleHolder.neoStatus);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.adsrules.model.NeoRule> getNeoRules() {
        return this.neoRules;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.adsrules.model.NeoStatus getNeoStatus() {
        return this.neoStatus;
    }

    public int hashCode() {
        int hashCode = this.neoRules.hashCode() * 31;
        com.truecaller.ads.adsrules.model.NeoStatus neoStatus = this.neoStatus;
        return hashCode + (neoStatus == null ? 0 : neoStatus.hashCode());
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "NeoRuleHolder(neoRules=" + this.neoRules + ", neoStatus=" + this.neoStatus + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        java.util.Iterator f = z0.a0.f(this.neoRules, dest);
        while (f.hasNext()) {
            ((com.truecaller.ads.adsrules.model.NeoRule) f.next()).writeToParcel(dest, flags);
        }
        com.truecaller.ads.adsrules.model.NeoStatus neoStatus = this.neoStatus;
        if (neoStatus == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            neoStatus.writeToParcel(dest, flags);
        }
    }
}
