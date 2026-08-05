package com.truecaller.scamfeed.data.transport.posts.entities;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JT\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lcom/truecaller/scamfeed/data/transport/posts/entities/QuizOptionRemote;", "", "id", "", "text", "isCorrect", "", "voteShare", "", "answerTitle", "answerBody", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getText", "()Z", "getVoteShare", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAnswerTitle", "getAnswerBody", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/truecaller/scamfeed/data/transport/posts/entities/QuizOptionRemote;", "equals", "other", "hashCode", "", "toString", "scam-feed_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class QuizOptionRemote {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String answerBody;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String answerTitle;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String id;
    private final boolean isCorrect;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String text;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long voteShare;

    public QuizOptionRemote() {
        this(null, null, false, null, null, null, 63, null);
    }

    public static /* synthetic */ com.truecaller.scamfeed.data.transport.posts.entities.QuizOptionRemote copy$default(com.truecaller.scamfeed.data.transport.posts.entities.QuizOptionRemote quizOptionRemote, java.lang.String str, java.lang.String str2, boolean z, java.lang.Long l, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = quizOptionRemote.id;
        }
        if ((i & 2) != 0) {
            str2 = quizOptionRemote.text;
        }
        if ((i & 4) != 0) {
            z = quizOptionRemote.isCorrect;
        }
        if ((i & 8) != 0) {
            l = quizOptionRemote.voteShare;
        }
        if ((i & 16) != 0) {
            str3 = quizOptionRemote.answerTitle;
        }
        if ((i & 32) != 0) {
            str4 = quizOptionRemote.answerBody;
        }
        java.lang.String str5 = str3;
        java.lang.String str6 = str4;
        return quizOptionRemote.copy(str, str2, z, l, str5, str6);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCorrect() {
        return this.isCorrect;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.Long getVoteShare() {
        return this.voteShare;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAnswerTitle() {
        return this.answerTitle;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getAnswerBody() {
        return this.answerBody;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.scamfeed.data.transport.posts.entities.QuizOptionRemote copy(@org.jetbrains.annotations.Nullable java.lang.String id, @org.jetbrains.annotations.Nullable java.lang.String text, boolean isCorrect, @org.jetbrains.annotations.Nullable java.lang.Long voteShare, @org.jetbrains.annotations.Nullable java.lang.String answerTitle, @org.jetbrains.annotations.Nullable java.lang.String answerBody) {
        return new com.truecaller.scamfeed.data.transport.posts.entities.QuizOptionRemote(id, text, isCorrect, voteShare, answerTitle, answerBody);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.scamfeed.data.transport.posts.entities.QuizOptionRemote)) {
            return false;
        }
        com.truecaller.scamfeed.data.transport.posts.entities.QuizOptionRemote quizOptionRemote = (com.truecaller.scamfeed.data.transport.posts.entities.QuizOptionRemote) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, quizOptionRemote.id) && kotlin.jvm.internal.Intrinsics.b(this.text, quizOptionRemote.text) && this.isCorrect == quizOptionRemote.isCorrect && kotlin.jvm.internal.Intrinsics.b(this.voteShare, quizOptionRemote.voteShare) && kotlin.jvm.internal.Intrinsics.b(this.answerTitle, quizOptionRemote.answerTitle) && kotlin.jvm.internal.Intrinsics.b(this.answerBody, quizOptionRemote.answerBody);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAnswerBody() {
        return this.answerBody;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAnswerTitle() {
        return this.answerTitle;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getVoteShare() {
        return this.voteShare;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int hashCode3;
        int hashCode4;
        java.lang.String str = this.id;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = hashCode * 31;
        java.lang.String str2 = this.text;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        if (this.isCorrect) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i5 = (i4 + i) * 31;
        java.lang.Long l = this.voteShare;
        if (l == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        java.lang.String str3 = this.answerTitle;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        java.lang.String str4 = this.answerBody;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return i7 + i2;
    }

    public final boolean isCorrect() {
        return this.isCorrect;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.text;
        boolean z = this.isCorrect;
        java.lang.Long l = this.voteShare;
        java.lang.String str3 = this.answerTitle;
        java.lang.String str4 = this.answerBody;
        java.lang.StringBuilder E = ro0.f.E("QuizOptionRemote(id=", str, ", text=", str2, ", isCorrect=");
        E.append(z);
        E.append(", voteShare=");
        E.append(l);
        E.append(", answerTitle=");
        return bar.x(E, str3, ", answerBody=", str4, ")");
    }

    public QuizOptionRemote(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, boolean z, @org.jetbrains.annotations.Nullable java.lang.Long l, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4) {
        this.id = str;
        this.text = str2;
        this.isCorrect = z;
        this.voteShare = l;
        this.answerTitle = str3;
        this.answerBody = str4;
    }

    public /* synthetic */ QuizOptionRemote(java.lang.String str, java.lang.String str2, boolean z, java.lang.Long l, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
