package com.truecaller.ads.adsrouter.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0003J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lcom/truecaller/ads/adsrouter/model/CountDown;", "Landroid/os/Parcelable;", "delay", "", "text", "", "position", "Lcom/truecaller/ads/adsrouter/model/CountDownPosition;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/truecaller/ads/adsrouter/model/CountDownPosition;)V", "getDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getText", "()Ljava/lang/String;", "getPosition", "()Lcom/truecaller/ads/adsrouter/model/CountDownPosition;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/truecaller/ads/adsrouter/model/CountDownPosition;)Lcom/truecaller/ads/adsrouter/model/CountDown;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CountDown implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrouter.model.CountDown> CREATOR = new y02.t(11);

    @bw.qux("delay")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer delay;

    @bw.qux("position")
    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.adsrouter.model.CountDownPosition position;

    @bw.qux("text")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String text;

    public CountDown(@org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable com.truecaller.ads.adsrouter.model.CountDownPosition countDownPosition) {
        this.delay = num;
        this.text = str;
        this.position = countDownPosition;
    }

    public static /* synthetic */ com.truecaller.ads.adsrouter.model.CountDown copy$default(com.truecaller.ads.adsrouter.model.CountDown countDown, java.lang.Integer num, java.lang.String str, com.truecaller.ads.adsrouter.model.CountDownPosition countDownPosition, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = countDown.delay;
        }
        if ((i & 2) != 0) {
            str = countDown.text;
        }
        if ((i & 4) != 0) {
            countDownPosition = countDown.position;
        }
        return countDown.copy(num, str, countDownPosition);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getDelay() {
        return this.delay;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.ads.adsrouter.model.CountDownPosition getPosition() {
        return this.position;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.model.CountDown copy(@org.jetbrains.annotations.Nullable java.lang.Integer delay, @org.jetbrains.annotations.Nullable java.lang.String text, @org.jetbrains.annotations.Nullable com.truecaller.ads.adsrouter.model.CountDownPosition position) {
        return new com.truecaller.ads.adsrouter.model.CountDown(delay, text, position);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrouter.model.CountDown)) {
            return false;
        }
        com.truecaller.ads.adsrouter.model.CountDown countDown = (com.truecaller.ads.adsrouter.model.CountDown) other;
        return kotlin.jvm.internal.Intrinsics.b(this.delay, countDown.delay) && kotlin.jvm.internal.Intrinsics.b(this.text, countDown.text) && this.position == countDown.position;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getDelay() {
        return this.delay;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.adsrouter.model.CountDownPosition getPosition() {
        return this.position;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getText() {
        return this.text;
    }

    public int hashCode() {
        java.lang.Integer num = this.delay;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.truecaller.ads.adsrouter.model.CountDownPosition countDownPosition = this.position;
        return hashCode2 + (countDownPosition != null ? countDownPosition.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "CountDown(delay=" + this.delay + ", text=" + this.text + ", position=" + this.position + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        java.lang.Integer num = this.delay;
        if (num == null) {
            dest.writeInt(0);
        } else {
            z0.a0.j(dest, 1, num);
        }
        dest.writeString(this.text);
        com.truecaller.ads.adsrouter.model.CountDownPosition countDownPosition = this.position;
        if (countDownPosition == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(countDownPosition.name());
        }
    }
}
