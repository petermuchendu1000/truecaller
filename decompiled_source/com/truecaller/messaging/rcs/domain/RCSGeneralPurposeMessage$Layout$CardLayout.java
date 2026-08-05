package com.truecaller.messaging.rcs.domain;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"com/truecaller/messaging/rcs/domain/RCSGeneralPurposeMessage$Layout$CardLayout", "Lo32/qux;", "", "cardOrientation", "imageAlignment", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "Lcom/truecaller/messaging/rcs/domain/RCSGeneralPurposeMessage$Layout$CardLayout;", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/truecaller/messaging/rcs/domain/RCSGeneralPurposeMessage$Layout$CardLayout;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardOrientation", "getImageAlignment", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class RCSGeneralPurposeMessage$Layout$CardLayout extends o32.qux {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String cardOrientation;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String imageAlignment;

    public RCSGeneralPurposeMessage$Layout$CardLayout(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "cardOrientation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "imageAlignment");
        this.cardOrientation = str;
        this.imageAlignment = str2;
    }

    public static /* synthetic */ com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage$Layout$CardLayout copy$default(com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage$Layout$CardLayout rCSGeneralPurposeMessage$Layout$CardLayout, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = rCSGeneralPurposeMessage$Layout$CardLayout.cardOrientation;
        }
        if ((i & 2) != 0) {
            str2 = rCSGeneralPurposeMessage$Layout$CardLayout.imageAlignment;
        }
        return rCSGeneralPurposeMessage$Layout$CardLayout.copy(str, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCardOrientation() {
        return this.cardOrientation;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getImageAlignment() {
        return this.imageAlignment;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage$Layout$CardLayout copy(@org.jetbrains.annotations.NotNull java.lang.String cardOrientation, @org.jetbrains.annotations.NotNull java.lang.String imageAlignment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardOrientation, "cardOrientation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageAlignment, "imageAlignment");
        return new com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage$Layout$CardLayout(cardOrientation, imageAlignment);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage$Layout$CardLayout)) {
            return false;
        }
        com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage$Layout$CardLayout rCSGeneralPurposeMessage$Layout$CardLayout = (com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage$Layout$CardLayout) other;
        return kotlin.jvm.internal.Intrinsics.b(this.cardOrientation, rCSGeneralPurposeMessage$Layout$CardLayout.cardOrientation) && kotlin.jvm.internal.Intrinsics.b(this.imageAlignment, rCSGeneralPurposeMessage$Layout$CardLayout.imageAlignment);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCardOrientation() {
        return this.cardOrientation;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImageAlignment() {
        return this.imageAlignment;
    }

    public int hashCode() {
        return this.imageAlignment.hashCode() + (this.cardOrientation.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("CardLayout(cardOrientation=", this.cardOrientation, ", imageAlignment=", this.imageAlignment, ")");
    }
}
