package com.truecaller.ads.mediation.model.rtb;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006!"}, d2 = {"com/truecaller/ads/mediation/model/rtb/Asset$TitleAsset", "Lz70/bar;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "required", "Lcom/truecaller/ads/mediation/model/rtb/Title;", "title", "<init>", "(IILcom/truecaller/ads/mediation/model/rtb/Title;)V", "len", "(III)V", "component1", "()I", "component2", "component3", "()Lcom/truecaller/ads/mediation/model/rtb/Title;", "Lcom/truecaller/ads/mediation/model/rtb/Asset$TitleAsset;", "copy", "(IILcom/truecaller/ads/mediation/model/rtb/Title;)Lcom/truecaller/ads/mediation/model/rtb/Asset$TitleAsset;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getRequired", "Lcom/truecaller/ads/mediation/model/rtb/Title;", "getTitle", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Asset$TitleAsset extends z70.bar {
    public static final int $stable = 0;
    private final int id;
    private final int required;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.mediation.model.rtb.Title title;

    public Asset$TitleAsset(int i, int i2, @org.jetbrains.annotations.NotNull com.truecaller.ads.mediation.model.rtb.Title title) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        this.id = i;
        this.required = i2;
        this.title = title;
    }

    public static /* synthetic */ com.truecaller.ads.mediation.model.rtb.Asset$TitleAsset copy$default(com.truecaller.ads.mediation.model.rtb.Asset$TitleAsset asset$TitleAsset, int i, int i2, com.truecaller.ads.mediation.model.rtb.Title title, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = asset$TitleAsset.id;
        }
        if ((i3 & 2) != 0) {
            i2 = asset$TitleAsset.required;
        }
        if ((i3 & 4) != 0) {
            title = asset$TitleAsset.title;
        }
        return asset$TitleAsset.copy(i, i2, title);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRequired() {
        return this.required;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.ads.mediation.model.rtb.Title getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.rtb.Asset$TitleAsset copy(int id, int required, @org.jetbrains.annotations.NotNull com.truecaller.ads.mediation.model.rtb.Title title) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        return new com.truecaller.ads.mediation.model.rtb.Asset$TitleAsset(id, required, title);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.model.rtb.Asset$TitleAsset)) {
            return false;
        }
        com.truecaller.ads.mediation.model.rtb.Asset$TitleAsset asset$TitleAsset = (com.truecaller.ads.mediation.model.rtb.Asset$TitleAsset) other;
        return this.id == asset$TitleAsset.id && this.required == asset$TitleAsset.required && kotlin.jvm.internal.Intrinsics.b(this.title, asset$TitleAsset.title);
    }

    public int getId() {
        return this.id;
    }

    public int getRequired() {
        return this.required;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.rtb.Title getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (((this.id * 31) + this.required) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.id;
        int i2 = this.required;
        com.truecaller.ads.mediation.model.rtb.Title title = this.title;
        java.lang.StringBuilder e = z0.a0.e(i, i2, "TitleAsset(id=", ", required=", ", title=");
        e.append(title);
        e.append(")");
        return e.toString();
    }

    public Asset$TitleAsset(int i, int i2, int i3) {
        this(i, i2, new com.truecaller.ads.mediation.model.rtb.Title(i3));
    }
}
