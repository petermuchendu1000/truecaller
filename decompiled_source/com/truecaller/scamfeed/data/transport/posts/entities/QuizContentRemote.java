package com.truecaller.scamfeed.data.transport.posts.entities;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J@\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/truecaller/scamfeed/data/transport/posts/entities/QuizContentRemote;", "", "answered", "", "answeredId", "", "totalVotes", "", "options", "", "Lcom/truecaller/scamfeed/data/transport/posts/entities/QuizOptionRemote;", "<init>", "(ZLjava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "getAnswered", "()Z", "getAnsweredId", "()Ljava/lang/String;", "getTotalVotes", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lcom/truecaller/scamfeed/data/transport/posts/entities/QuizContentRemote;", "equals", "other", "hashCode", "", "toString", "scam-feed_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class QuizContentRemote {
    public static final int $stable = 8;
    private final boolean answered;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String answeredId;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.scamfeed.data.transport.posts.entities.QuizOptionRemote> options;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long totalVotes;

    public QuizContentRemote() {
        this(false, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.scamfeed.data.transport.posts.entities.QuizContentRemote copy$default(com.truecaller.scamfeed.data.transport.posts.entities.QuizContentRemote quizContentRemote, boolean z, java.lang.String str, java.lang.Long l, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = quizContentRemote.answered;
        }
        if ((i & 2) != 0) {
            str = quizContentRemote.answeredId;
        }
        if ((i & 4) != 0) {
            l = quizContentRemote.totalVotes;
        }
        if ((i & 8) != 0) {
            list = quizContentRemote.options;
        }
        return quizContentRemote.copy(z, str, l, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAnswered() {
        return this.answered;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAnsweredId() {
        return this.answeredId;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getTotalVotes() {
        return this.totalVotes;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.scamfeed.data.transport.posts.entities.QuizOptionRemote> component4() {
        return this.options;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.scamfeed.data.transport.posts.entities.QuizContentRemote copy(boolean answered, @org.jetbrains.annotations.Nullable java.lang.String answeredId, @org.jetbrains.annotations.Nullable java.lang.Long totalVotes, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.scamfeed.data.transport.posts.entities.QuizOptionRemote> options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new com.truecaller.scamfeed.data.transport.posts.entities.QuizContentRemote(answered, answeredId, totalVotes, options);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.scamfeed.data.transport.posts.entities.QuizContentRemote)) {
            return false;
        }
        com.truecaller.scamfeed.data.transport.posts.entities.QuizContentRemote quizContentRemote = (com.truecaller.scamfeed.data.transport.posts.entities.QuizContentRemote) other;
        return this.answered == quizContentRemote.answered && kotlin.jvm.internal.Intrinsics.b(this.answeredId, quizContentRemote.answeredId) && kotlin.jvm.internal.Intrinsics.b(this.totalVotes, quizContentRemote.totalVotes) && kotlin.jvm.internal.Intrinsics.b(this.options, quizContentRemote.options);
    }

    public final boolean getAnswered() {
        return this.answered;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAnsweredId() {
        return this.answeredId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.scamfeed.data.transport.posts.entities.QuizOptionRemote> getOptions() {
        return this.options;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getTotalVotes() {
        return this.totalVotes;
    }

    public int hashCode() {
        int i;
        int hashCode;
        if (this.answered) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i2 = i * 31;
        java.lang.String str = this.answeredId;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        java.lang.Long l = this.totalVotes;
        if (l != null) {
            i3 = l.hashCode();
        }
        return this.options.hashCode() + ((i4 + i3) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.answered;
        java.lang.String str = this.answeredId;
        java.lang.Long l = this.totalVotes;
        java.util.List<com.truecaller.scamfeed.data.transport.posts.entities.QuizOptionRemote> list = this.options;
        java.lang.StringBuilder u = bx.e1.u("QuizContentRemote(answered=", ", answeredId=", str, ", totalVotes=", z);
        u.append(l);
        u.append(", options=");
        u.append(list);
        u.append(")");
        return u.toString();
    }

    public QuizContentRemote(boolean z, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.Long l, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.scamfeed.data.transport.posts.entities.QuizOptionRemote> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "options");
        this.answered = z;
        this.answeredId = str;
        this.totalVotes = l;
        this.options = list;
    }

    public QuizContentRemote(boolean z, java.lang.String str, java.lang.Long l, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? kotlin.collections.h0.a : list);
    }
}
