package com.truecaller.ads.mediation.model.rtb;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bBU\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0016¨\u0006'"}, d2 = {"com/truecaller/ads/mediation/model/rtb/Asset$VideoAsset", "Lz70/bar;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "required", "Lcom/truecaller/ads/mediation/model/rtb/Video;", "video", "<init>", "(IILcom/truecaller/ads/mediation/model/rtb/Video;)V", "", "", "mimes", "protocols", "w", "h", "minduration", "maxduration", "(IILjava/util/List;Ljava/util/List;IIII)V", "component1", "()I", "component2", "component3", "()Lcom/truecaller/ads/mediation/model/rtb/Video;", "Lcom/truecaller/ads/mediation/model/rtb/Asset$VideoAsset;", "copy", "(IILcom/truecaller/ads/mediation/model/rtb/Video;)Lcom/truecaller/ads/mediation/model/rtb/Asset$VideoAsset;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getRequired", "Lcom/truecaller/ads/mediation/model/rtb/Video;", "getVideo", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Asset$VideoAsset extends z70.bar {
    public static final int $stable = 8;
    private final int id;
    private final int required;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.mediation.model.rtb.Video video;

    public Asset$VideoAsset(int i, int i2, @org.jetbrains.annotations.NotNull com.truecaller.ads.mediation.model.rtb.Video video) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(video, "video");
        this.id = i;
        this.required = i2;
        this.video = video;
    }

    public static /* synthetic */ com.truecaller.ads.mediation.model.rtb.Asset$VideoAsset copy$default(com.truecaller.ads.mediation.model.rtb.Asset$VideoAsset asset$VideoAsset, int i, int i2, com.truecaller.ads.mediation.model.rtb.Video video, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = asset$VideoAsset.id;
        }
        if ((i3 & 2) != 0) {
            i2 = asset$VideoAsset.required;
        }
        if ((i3 & 4) != 0) {
            video = asset$VideoAsset.video;
        }
        return asset$VideoAsset.copy(i, i2, video);
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
    public final com.truecaller.ads.mediation.model.rtb.Video getVideo() {
        return this.video;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.rtb.Asset$VideoAsset copy(int id, int required, @org.jetbrains.annotations.NotNull com.truecaller.ads.mediation.model.rtb.Video video) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(video, "video");
        return new com.truecaller.ads.mediation.model.rtb.Asset$VideoAsset(id, required, video);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.model.rtb.Asset$VideoAsset)) {
            return false;
        }
        com.truecaller.ads.mediation.model.rtb.Asset$VideoAsset asset$VideoAsset = (com.truecaller.ads.mediation.model.rtb.Asset$VideoAsset) other;
        return this.id == asset$VideoAsset.id && this.required == asset$VideoAsset.required && kotlin.jvm.internal.Intrinsics.b(this.video, asset$VideoAsset.video);
    }

    public int getId() {
        return this.id;
    }

    public int getRequired() {
        return this.required;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.rtb.Video getVideo() {
        return this.video;
    }

    public int hashCode() {
        return this.video.hashCode() + (((this.id * 31) + this.required) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.id;
        int i2 = this.required;
        com.truecaller.ads.mediation.model.rtb.Video video = this.video;
        java.lang.StringBuilder e = z0.a0.e(i, i2, "VideoAsset(id=", ", required=", ", video=");
        e.append(video);
        e.append(")");
        return e.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Asset$VideoAsset(int i, int i2, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> list2, int i3, int i4, int i5, int i6) {
        this(i, i2, new com.truecaller.ads.mediation.model.rtb.Video(list, list2, i3, i4, i5, i6, null, null, null, null, null, null, null, null, null, null, null, 131008, null));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "mimes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "protocols");
    }
}
