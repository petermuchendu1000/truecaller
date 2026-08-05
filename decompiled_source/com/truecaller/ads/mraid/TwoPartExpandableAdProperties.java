package com.truecaller.ads.mraid;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/truecaller/ads/mraid/TwoPartExpandableAdProperties;", "Landroid/os/Parcelable;", "useCustomClose", "", "isFromMraidTwoPartExpandable", com.truecaller.ads.postclickexperience.deeplink.PostClickExperienceDeeplink.PARAM_DEEPLINK_CREATIVE_ID, "", "<init>", "(ZZLjava/lang/String;)V", "getUseCustomClose", "()Z", "getCreativeId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class TwoPartExpandableAdProperties implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.mraid.TwoPartExpandableAdProperties> CREATOR = new a11.bar(28);

    @org.jetbrains.annotations.Nullable
    private final java.lang.String creativeId;
    private final boolean isFromMraidTwoPartExpandable;
    private final boolean useCustomClose;

    public TwoPartExpandableAdProperties(boolean z, boolean z2, @org.jetbrains.annotations.Nullable java.lang.String str) {
        this.useCustomClose = z;
        this.isFromMraidTwoPartExpandable = z2;
        this.creativeId = str;
    }

    public static /* synthetic */ com.truecaller.ads.mraid.TwoPartExpandableAdProperties copy$default(com.truecaller.ads.mraid.TwoPartExpandableAdProperties twoPartExpandableAdProperties, boolean z, boolean z2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = twoPartExpandableAdProperties.useCustomClose;
        }
        if ((i & 2) != 0) {
            z2 = twoPartExpandableAdProperties.isFromMraidTwoPartExpandable;
        }
        if ((i & 4) != 0) {
            str = twoPartExpandableAdProperties.creativeId;
        }
        return twoPartExpandableAdProperties.copy(z, z2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getUseCustomClose() {
        return this.useCustomClose;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFromMraidTwoPartExpandable() {
        return this.isFromMraidTwoPartExpandable;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCreativeId() {
        return this.creativeId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mraid.TwoPartExpandableAdProperties copy(boolean useCustomClose, boolean isFromMraidTwoPartExpandable, @org.jetbrains.annotations.Nullable java.lang.String creativeId) {
        return new com.truecaller.ads.mraid.TwoPartExpandableAdProperties(useCustomClose, isFromMraidTwoPartExpandable, creativeId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mraid.TwoPartExpandableAdProperties)) {
            return false;
        }
        com.truecaller.ads.mraid.TwoPartExpandableAdProperties twoPartExpandableAdProperties = (com.truecaller.ads.mraid.TwoPartExpandableAdProperties) other;
        return this.useCustomClose == twoPartExpandableAdProperties.useCustomClose && this.isFromMraidTwoPartExpandable == twoPartExpandableAdProperties.isFromMraidTwoPartExpandable && kotlin.jvm.internal.Intrinsics.b(this.creativeId, twoPartExpandableAdProperties.creativeId);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCreativeId() {
        return this.creativeId;
    }

    public final boolean getUseCustomClose() {
        return this.useCustomClose;
    }

    public int hashCode() {
        int i;
        int hashCode;
        int i2 = 1237;
        if (this.useCustomClose) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = i * 31;
        if (this.isFromMraidTwoPartExpandable) {
            i2 = 1231;
        }
        int i4 = (i3 + i2) * 31;
        java.lang.String str = this.creativeId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i4 + hashCode;
    }

    public final boolean isFromMraidTwoPartExpandable() {
        return this.isFromMraidTwoPartExpandable;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.creativeId, ")", bx.e1.v("TwoPartExpandableAdProperties(useCustomClose=", ", isFromMraidTwoPartExpandable=", ", creativeId=", this.useCustomClose, this.isFromMraidTwoPartExpandable));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.useCustomClose ? 1 : 0);
        dest.writeInt(this.isFromMraidTwoPartExpandable ? 1 : 0);
        dest.writeString(this.creativeId);
    }
}
