package com.truecaller.surveys.data.dto;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, d2 = {"Lcom/truecaller/surveys/data/dto/ChoiceDto;", "", "", "id", "", "text", "followupQuestionId", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/Integer;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/ChoiceDto;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "copy", "(ILjava/lang/String;Ljava/lang/Integer;)Lcom/truecaller/surveys/data/dto/ChoiceDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getText", "Ljava/lang/Integer;", "getFollowupQuestionId", "Companion", "du2/baz", "du2/qux", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@ug3.d
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class ChoiceDto {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final du2.qux Companion = new java.lang.Object();

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer followupQuestionId;
    private final int id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String text;

    public /* synthetic */ ChoiceDto(int i, int i2, java.lang.String str, java.lang.Integer num, yg3.g1 g1Var) {
        if (7 != (i & 7)) {
            yg3.w0.l(i, 7, du2.baz.a.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.text = str;
        this.followupQuestionId = num;
    }

    public static /* synthetic */ com.truecaller.surveys.data.dto.ChoiceDto copy$default(com.truecaller.surveys.data.dto.ChoiceDto choiceDto, int i, java.lang.String str, java.lang.Integer num, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = choiceDto.id;
        }
        if ((i2 & 2) != 0) {
            str = choiceDto.text;
        }
        if ((i2 & 4) != 0) {
            num = choiceDto.followupQuestionId;
        }
        return choiceDto.copy(i, str, num);
    }

    public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.ChoiceDto self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.C(0, self.id, serialDesc);
        output.o(serialDesc, 1, self.text);
        output.g(serialDesc, 2, yg3.g0.a, self.followupQuestionId);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getFollowupQuestionId() {
        return this.followupQuestionId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.surveys.data.dto.ChoiceDto copy(int id, @org.jetbrains.annotations.NotNull java.lang.String text, @org.jetbrains.annotations.Nullable java.lang.Integer followupQuestionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        return new com.truecaller.surveys.data.dto.ChoiceDto(id, text, followupQuestionId);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.surveys.data.dto.ChoiceDto)) {
            return false;
        }
        com.truecaller.surveys.data.dto.ChoiceDto choiceDto = (com.truecaller.surveys.data.dto.ChoiceDto) other;
        return this.id == choiceDto.id && kotlin.jvm.internal.Intrinsics.b(this.text, choiceDto.text) && kotlin.jvm.internal.Intrinsics.b(this.followupQuestionId, choiceDto.followupQuestionId);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getFollowupQuestionId() {
        return this.followupQuestionId;
    }

    public final int getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(this.id * 31, 31, this.text);
        java.lang.Integer num = this.followupQuestionId;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return e + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.id;
        java.lang.String str = this.text;
        return com.appsflyer.internal.e.m(qb.qux.r("ChoiceDto(id=", i, ", text=", str, ", followupQuestionId="), this.followupQuestionId, ")");
    }

    public ChoiceDto(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        this.id = i;
        this.text = str;
        this.followupQuestionId = num;
    }
}
