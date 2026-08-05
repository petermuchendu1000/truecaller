package com.truecaller.surveys.data.dto;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0005\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/truecaller/surveys/data/dto/AnswerDto;", "", "<init>", "()V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/truecaller/surveys/data/dto/AnswerDto;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Binary", "SingleChoice", "FreeText", "Rating", "Confirmation", "du2/bar", "Lcom/truecaller/surveys/data/dto/AnswerDto$Binary;", "Lcom/truecaller/surveys/data/dto/AnswerDto$Confirmation;", "Lcom/truecaller/surveys/data/dto/AnswerDto$FreeText;", "Lcom/truecaller/surveys/data/dto/AnswerDto$Rating;", "Lcom/truecaller/surveys/data/dto/AnswerDto$SingleChoice;", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@ug3.d
/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class AnswerDto {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final du2.bar Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.k.b, new da0.bar(13));

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/truecaller/surveys/data/dto/AnswerDto$Binary;", "Lcom/truecaller/surveys/data/dto/AnswerDto;", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "choice", "<init>", "(Lcom/truecaller/surveys/data/dto/ChoiceDto;)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILcom/truecaller/surveys/data/dto/ChoiceDto;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/AnswerDto$Binary;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/truecaller/surveys/data/dto/ChoiceDto;", "copy", "(Lcom/truecaller/surveys/data/dto/ChoiceDto;)Lcom/truecaller/surveys/data/dto/AnswerDto$Binary;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "getChoice", "Companion", "com/truecaller/surveys/data/dto/bar", "com/truecaller/surveys/data/dto/baz", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class Binary extends com.truecaller.surveys.data.dto.AnswerDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.baz Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.surveys.data.dto.ChoiceDto choice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Binary(int i, com.truecaller.surveys.data.dto.ChoiceDto choiceDto, yg3.g1 g1Var) {
            super(i, g1Var);
            if (1 != (i & 1)) {
                yg3.w0.l(i, 1, com.truecaller.surveys.data.dto.bar.a.getDescriptor());
                throw null;
            }
            this.choice = choiceDto;
        }

        public static /* synthetic */ com.truecaller.surveys.data.dto.AnswerDto.Binary copy$default(com.truecaller.surveys.data.dto.AnswerDto.Binary binary, com.truecaller.surveys.data.dto.ChoiceDto choiceDto, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                choiceDto = binary.choice;
            }
            return binary.copy(choiceDto);
        }

        public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.AnswerDto.Binary self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.surveys.data.dto.AnswerDto.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, du2.baz.a, self.choice);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final com.truecaller.surveys.data.dto.ChoiceDto getChoice() {
            return this.choice;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.AnswerDto.Binary copy(@org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto choice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choice, "choice");
            return new com.truecaller.surveys.data.dto.AnswerDto.Binary(choice);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.truecaller.surveys.data.dto.AnswerDto.Binary) && kotlin.jvm.internal.Intrinsics.b(this.choice, ((com.truecaller.surveys.data.dto.AnswerDto.Binary) other).choice);
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.ChoiceDto getChoice() {
            return this.choice;
        }

        public int hashCode() {
            return this.choice.hashCode();
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "Binary(choice=" + this.choice + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Binary(@org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto choiceDto) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choiceDto, "choice");
            this.choice = choiceDto;
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/truecaller/surveys/data/dto/AnswerDto$Confirmation;", "Lcom/truecaller/surveys/data/dto/AnswerDto;", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "choice", "<init>", "(Lcom/truecaller/surveys/data/dto/ChoiceDto;)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILcom/truecaller/surveys/data/dto/ChoiceDto;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/AnswerDto$Confirmation;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/truecaller/surveys/data/dto/ChoiceDto;", "copy", "(Lcom/truecaller/surveys/data/dto/ChoiceDto;)Lcom/truecaller/surveys/data/dto/AnswerDto$Confirmation;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "getChoice", "Companion", "com/truecaller/surveys/data/dto/qux", "com/truecaller/surveys/data/dto/a", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class Confirmation extends com.truecaller.surveys.data.dto.AnswerDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.a Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.surveys.data.dto.ChoiceDto choice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Confirmation(int i, com.truecaller.surveys.data.dto.ChoiceDto choiceDto, yg3.g1 g1Var) {
            super(i, g1Var);
            if (1 != (i & 1)) {
                yg3.w0.l(i, 1, com.truecaller.surveys.data.dto.qux.a.getDescriptor());
                throw null;
            }
            this.choice = choiceDto;
        }

        public static /* synthetic */ com.truecaller.surveys.data.dto.AnswerDto.Confirmation copy$default(com.truecaller.surveys.data.dto.AnswerDto.Confirmation confirmation, com.truecaller.surveys.data.dto.ChoiceDto choiceDto, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                choiceDto = confirmation.choice;
            }
            return confirmation.copy(choiceDto);
        }

        public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.AnswerDto.Confirmation self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.surveys.data.dto.AnswerDto.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, du2.baz.a, self.choice);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final com.truecaller.surveys.data.dto.ChoiceDto getChoice() {
            return this.choice;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.AnswerDto.Confirmation copy(@org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto choice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choice, "choice");
            return new com.truecaller.surveys.data.dto.AnswerDto.Confirmation(choice);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.truecaller.surveys.data.dto.AnswerDto.Confirmation) && kotlin.jvm.internal.Intrinsics.b(this.choice, ((com.truecaller.surveys.data.dto.AnswerDto.Confirmation) other).choice);
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.ChoiceDto getChoice() {
            return this.choice;
        }

        public int hashCode() {
            return this.choice.hashCode();
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "Confirmation(choice=" + this.choice + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Confirmation(@org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto choiceDto) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choiceDto, "choice");
            this.choice = choiceDto;
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/truecaller/surveys/data/dto/AnswerDto$FreeText;", "Lcom/truecaller/surveys/data/dto/AnswerDto;", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILjava/lang/String;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/AnswerDto$FreeText;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/truecaller/surveys/data/dto/AnswerDto$FreeText;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Companion", "com/truecaller/surveys/data/dto/b", "com/truecaller/surveys/data/dto/c", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class FreeText extends com.truecaller.surveys.data.dto.AnswerDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.c Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final java.lang.String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FreeText(int i, java.lang.String str, yg3.g1 g1Var) {
            super(i, g1Var);
            if (1 != (i & 1)) {
                yg3.w0.l(i, 1, com.truecaller.surveys.data.dto.b.a.getDescriptor());
                throw null;
            }
            this.text = str;
        }

        public static /* synthetic */ com.truecaller.surveys.data.dto.AnswerDto.FreeText copy$default(com.truecaller.surveys.data.dto.AnswerDto.FreeText freeText, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = freeText.text;
            }
            return freeText.copy(str);
        }

        public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.AnswerDto.FreeText self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.surveys.data.dto.AnswerDto.write$Self(self, output, serialDesc);
            output.o(serialDesc, 0, self.text);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.AnswerDto.FreeText copy(@org.jetbrains.annotations.NotNull java.lang.String text) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
            return new com.truecaller.surveys.data.dto.AnswerDto.FreeText(text);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.truecaller.surveys.data.dto.AnswerDto.FreeText) && kotlin.jvm.internal.Intrinsics.b(this.text, ((com.truecaller.surveys.data.dto.AnswerDto.FreeText) other).text);
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return bar.t("FreeText(text=", this.text, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FreeText(@org.jetbrains.annotations.NotNull java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
            this.text = str;
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/truecaller/surveys/data/dto/AnswerDto$Rating;", "Lcom/truecaller/surveys/data/dto/AnswerDto;", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "choice", "<init>", "(Lcom/truecaller/surveys/data/dto/ChoiceDto;)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILcom/truecaller/surveys/data/dto/ChoiceDto;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/AnswerDto$Rating;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/truecaller/surveys/data/dto/ChoiceDto;", "copy", "(Lcom/truecaller/surveys/data/dto/ChoiceDto;)Lcom/truecaller/surveys/data/dto/AnswerDto$Rating;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "getChoice", "Companion", "com/truecaller/surveys/data/dto/d", "com/truecaller/surveys/data/dto/e", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class Rating extends com.truecaller.surveys.data.dto.AnswerDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.e Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.surveys.data.dto.ChoiceDto choice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Rating(int i, com.truecaller.surveys.data.dto.ChoiceDto choiceDto, yg3.g1 g1Var) {
            super(i, g1Var);
            if (1 != (i & 1)) {
                yg3.w0.l(i, 1, com.truecaller.surveys.data.dto.d.a.getDescriptor());
                throw null;
            }
            this.choice = choiceDto;
        }

        public static /* synthetic */ com.truecaller.surveys.data.dto.AnswerDto.Rating copy$default(com.truecaller.surveys.data.dto.AnswerDto.Rating rating, com.truecaller.surveys.data.dto.ChoiceDto choiceDto, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                choiceDto = rating.choice;
            }
            return rating.copy(choiceDto);
        }

        public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.AnswerDto.Rating self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.surveys.data.dto.AnswerDto.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, du2.baz.a, self.choice);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final com.truecaller.surveys.data.dto.ChoiceDto getChoice() {
            return this.choice;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.AnswerDto.Rating copy(@org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto choice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choice, "choice");
            return new com.truecaller.surveys.data.dto.AnswerDto.Rating(choice);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.truecaller.surveys.data.dto.AnswerDto.Rating) && kotlin.jvm.internal.Intrinsics.b(this.choice, ((com.truecaller.surveys.data.dto.AnswerDto.Rating) other).choice);
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.ChoiceDto getChoice() {
            return this.choice;
        }

        public int hashCode() {
            return this.choice.hashCode();
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "Rating(choice=" + this.choice + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rating(@org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto choiceDto) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choiceDto, "choice");
            this.choice = choiceDto;
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/truecaller/surveys/data/dto/AnswerDto$SingleChoice;", "Lcom/truecaller/surveys/data/dto/AnswerDto;", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "choice", "<init>", "(Lcom/truecaller/surveys/data/dto/ChoiceDto;)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILcom/truecaller/surveys/data/dto/ChoiceDto;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/AnswerDto$SingleChoice;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/truecaller/surveys/data/dto/ChoiceDto;", "copy", "(Lcom/truecaller/surveys/data/dto/ChoiceDto;)Lcom/truecaller/surveys/data/dto/AnswerDto$SingleChoice;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "getChoice", "Companion", "com/truecaller/surveys/data/dto/f", "com/truecaller/surveys/data/dto/g", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class SingleChoice extends com.truecaller.surveys.data.dto.AnswerDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.g Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.surveys.data.dto.ChoiceDto choice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SingleChoice(int i, com.truecaller.surveys.data.dto.ChoiceDto choiceDto, yg3.g1 g1Var) {
            super(i, g1Var);
            if (1 != (i & 1)) {
                yg3.w0.l(i, 1, com.truecaller.surveys.data.dto.f.a.getDescriptor());
                throw null;
            }
            this.choice = choiceDto;
        }

        public static /* synthetic */ com.truecaller.surveys.data.dto.AnswerDto.SingleChoice copy$default(com.truecaller.surveys.data.dto.AnswerDto.SingleChoice singleChoice, com.truecaller.surveys.data.dto.ChoiceDto choiceDto, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                choiceDto = singleChoice.choice;
            }
            return singleChoice.copy(choiceDto);
        }

        public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.AnswerDto.SingleChoice self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.surveys.data.dto.AnswerDto.write$Self(self, output, serialDesc);
            output.e(serialDesc, 0, du2.baz.a, self.choice);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final com.truecaller.surveys.data.dto.ChoiceDto getChoice() {
            return this.choice;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.AnswerDto.SingleChoice copy(@org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto choice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choice, "choice");
            return new com.truecaller.surveys.data.dto.AnswerDto.SingleChoice(choice);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.truecaller.surveys.data.dto.AnswerDto.SingleChoice) && kotlin.jvm.internal.Intrinsics.b(this.choice, ((com.truecaller.surveys.data.dto.AnswerDto.SingleChoice) other).choice);
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.ChoiceDto getChoice() {
            return this.choice;
        }

        public int hashCode() {
            return this.choice.hashCode();
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "SingleChoice(choice=" + this.choice + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleChoice(@org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto choiceDto) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choiceDto, "choice");
            this.choice = choiceDto;
        }
    }

    public /* synthetic */ AnswerDto(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.KSerializer _init_$_anonymous_() {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        return new ug3.c("com.truecaller.surveys.data.dto.AnswerDto", l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.AnswerDto.class), new kotlin.reflect.KClass[]{l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.AnswerDto.Binary.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.AnswerDto.Confirmation.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.AnswerDto.FreeText.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.AnswerDto.Rating.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.AnswerDto.SingleChoice.class)}, new kotlinx.serialization.KSerializer[]{com.truecaller.surveys.data.dto.bar.a, com.truecaller.surveys.data.dto.qux.a, com.truecaller.surveys.data.dto.b.a, com.truecaller.surveys.data.dto.d.a, com.truecaller.surveys.data.dto.f.a}, new java.lang.annotation.Annotation[0]);
    }

    private AnswerDto() {
    }

    public /* synthetic */ AnswerDto(int i, yg3.g1 g1Var) {
    }

    public static final /* synthetic */ void write$Self(com.truecaller.surveys.data.dto.AnswerDto self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
}
