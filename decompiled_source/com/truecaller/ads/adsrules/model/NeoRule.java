package com.truecaller.ads.adsrules.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/truecaller/ads/adsrules/model/NeoRule;", "Landroid/os/Parcelable;", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "Lcom/truecaller/ads/adsrules/model/NeoRuleId;", "value", "", "placement", "<init>", "(Lcom/truecaller/ads/adsrules/model/NeoRuleId;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Lcom/truecaller/ads/adsrules/model/NeoRuleId;", "getValue", "()Ljava/lang/String;", "getPlacement", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class NeoRule implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrules.model.NeoRule> CREATOR = new om0.bar(21);

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.adsrules.model.NeoRuleId id;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String placement;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    public NeoRule(@org.jetbrains.annotations.NotNull com.truecaller.ads.adsrules.model.NeoRuleId neoRuleId, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(neoRuleId, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "value");
        this.id = neoRuleId;
        this.value = str;
        this.placement = str2;
    }

    public static /* synthetic */ com.truecaller.ads.adsrules.model.NeoRule copy$default(com.truecaller.ads.adsrules.model.NeoRule neoRule, com.truecaller.ads.adsrules.model.NeoRuleId neoRuleId, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            neoRuleId = neoRule.id;
        }
        if ((i & 2) != 0) {
            str = neoRule.value;
        }
        if ((i & 4) != 0) {
            str2 = neoRule.placement;
        }
        return neoRule.copy(neoRuleId, str, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.ads.adsrules.model.NeoRuleId getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrules.model.NeoRule copy(@org.jetbrains.annotations.NotNull com.truecaller.ads.adsrules.model.NeoRuleId id, @org.jetbrains.annotations.NotNull java.lang.String value, @org.jetbrains.annotations.Nullable java.lang.String placement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        return new com.truecaller.ads.adsrules.model.NeoRule(id, value, placement);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrules.model.NeoRule)) {
            return false;
        }
        com.truecaller.ads.adsrules.model.NeoRule neoRule = (com.truecaller.ads.adsrules.model.NeoRule) other;
        return this.id == neoRule.id && kotlin.jvm.internal.Intrinsics.b(this.value, neoRule.value) && kotlin.jvm.internal.Intrinsics.b(this.placement, neoRule.placement);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrules.model.NeoRuleId getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(this.id.hashCode() * 31, 31, this.value);
        java.lang.String str = this.placement;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return e + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.ads.adsrules.model.NeoRuleId neoRuleId = this.id;
        java.lang.String str = this.value;
        java.lang.String str2 = this.placement;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NeoRule(id=");
        sb.append(neoRuleId);
        sb.append(", value=");
        sb.append(str);
        sb.append(", placement=");
        return bar.v(str2, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id.name());
        dest.writeString(this.value);
        dest.writeString(this.placement);
    }

    public /* synthetic */ NeoRule(com.truecaller.ads.adsrules.model.NeoRuleId neoRuleId, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(neoRuleId, str, (i & 4) != 0 ? null : str2);
    }
}
