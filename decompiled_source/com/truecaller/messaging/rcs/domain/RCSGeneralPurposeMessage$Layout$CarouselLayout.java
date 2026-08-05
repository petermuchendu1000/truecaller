package com.truecaller.messaging.rcs.domain;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0007J\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"com/truecaller/messaging/rcs/domain/RCSGeneralPurposeMessage$Layout$CarouselLayout", "Lo32/qux;", "", "cardWidth", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "Lcom/truecaller/messaging/rcs/domain/RCSGeneralPurposeMessage$Layout$CarouselLayout;", "copy", "(Ljava/lang/String;)Lcom/truecaller/messaging/rcs/domain/RCSGeneralPurposeMessage$Layout$CarouselLayout;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardWidth", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class RCSGeneralPurposeMessage$Layout$CarouselLayout extends o32.qux {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String cardWidth;

    public RCSGeneralPurposeMessage$Layout$CarouselLayout(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "cardWidth");
        this.cardWidth = str;
    }

    public static /* synthetic */ com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage$Layout$CarouselLayout copy$default(com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage$Layout$CarouselLayout rCSGeneralPurposeMessage$Layout$CarouselLayout, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = rCSGeneralPurposeMessage$Layout$CarouselLayout.cardWidth;
        }
        return rCSGeneralPurposeMessage$Layout$CarouselLayout.copy(str);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCardWidth() {
        return this.cardWidth;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage$Layout$CarouselLayout copy(@org.jetbrains.annotations.NotNull java.lang.String cardWidth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardWidth, "cardWidth");
        return new com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage$Layout$CarouselLayout(cardWidth);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage$Layout$CarouselLayout) && kotlin.jvm.internal.Intrinsics.b(this.cardWidth, ((com.truecaller.messaging.rcs.domain.RCSGeneralPurposeMessage$Layout$CarouselLayout) other).cardWidth);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCardWidth() {
        return this.cardWidth;
    }

    public int hashCode() {
        return this.cardWidth.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.t("CarouselLayout(cardWidth=", this.cardWidth, ")");
    }
}
