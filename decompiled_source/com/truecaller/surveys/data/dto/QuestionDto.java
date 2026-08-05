package com.truecaller.surveys.data.dto;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001a2\u00020\u0001:\t\u001b\u001c\u001d\u001e\u001f !\"#B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016\u0082\u0001\b$%&'()*+¨\u0006,"}, d2 = {"Lcom/truecaller/surveys/data/dto/QuestionDto;", "", "<init>", "()V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/truecaller/surveys/data/dto/QuestionDto;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getId", "()I", "id", "", "getHeaderMessage", "()Ljava/lang/String;", "headerMessage", "getMessage", "message", "Companion", "Binary", "SingleChoice", "FreeText", "Rating", "Confirmation", "DynamicSingleChoice", "SpamCategories", "RatingAndReview", "du2/b", "Lcom/truecaller/surveys/data/dto/QuestionDto$Binary;", "Lcom/truecaller/surveys/data/dto/QuestionDto$Confirmation;", "Lcom/truecaller/surveys/data/dto/QuestionDto$DynamicSingleChoice;", "Lcom/truecaller/surveys/data/dto/QuestionDto$FreeText;", "Lcom/truecaller/surveys/data/dto/QuestionDto$Rating;", "Lcom/truecaller/surveys/data/dto/QuestionDto$RatingAndReview;", "Lcom/truecaller/surveys/data/dto/QuestionDto$SingleChoice;", "Lcom/truecaller/surveys/data/dto/QuestionDto$SpamCategories;", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@ug3.d
/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class QuestionDto {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final du2.b Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.k.b, new da0.bar(14));

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b1\u0010\u001f¨\u00065"}, d2 = {"Lcom/truecaller/surveys/data/dto/QuestionDto$Binary;", "Lcom/truecaller/surveys/data/dto/QuestionDto;", "", "id", "", "headerMessage", "message", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "choiceTrue", "choiceFalse", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/truecaller/surveys/data/dto/ChoiceDto;Lcom/truecaller/surveys/data/dto/ChoiceDto;)V", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lcom/truecaller/surveys/data/dto/ChoiceDto;Lcom/truecaller/surveys/data/dto/ChoiceDto;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/QuestionDto$Binary;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/truecaller/surveys/data/dto/ChoiceDto;", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/truecaller/surveys/data/dto/ChoiceDto;Lcom/truecaller/surveys/data/dto/ChoiceDto;)Lcom/truecaller/surveys/data/dto/QuestionDto$Binary;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getHeaderMessage", "getMessage", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "getChoiceTrue", "getChoiceFalse", "Companion", "com/truecaller/surveys/data/dto/i", "com/truecaller/surveys/data/dto/j", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class Binary extends com.truecaller.surveys.data.dto.QuestionDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.j Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.surveys.data.dto.ChoiceDto choiceFalse;

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.surveys.data.dto.ChoiceDto choiceTrue;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String headerMessage;
        private final int id;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Binary(int i, int i2, java.lang.String str, java.lang.String str2, com.truecaller.surveys.data.dto.ChoiceDto choiceDto, com.truecaller.surveys.data.dto.ChoiceDto choiceDto2, yg3.g1 g1Var) {
            super(i, g1Var);
            if (31 != (i & 31)) {
                yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.i.a.getDescriptor());
                throw null;
            }
            this.id = i2;
            this.headerMessage = str;
            this.message = str2;
            this.choiceTrue = choiceDto;
            this.choiceFalse = choiceDto2;
        }

        public static /* synthetic */ com.truecaller.surveys.data.dto.QuestionDto.Binary copy$default(com.truecaller.surveys.data.dto.QuestionDto.Binary binary, int i, java.lang.String str, java.lang.String str2, com.truecaller.surveys.data.dto.ChoiceDto choiceDto, com.truecaller.surveys.data.dto.ChoiceDto choiceDto2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = binary.id;
            }
            if ((i2 & 2) != 0) {
                str = binary.headerMessage;
            }
            if ((i2 & 4) != 0) {
                str2 = binary.message;
            }
            if ((i2 & 8) != 0) {
                choiceDto = binary.choiceTrue;
            }
            if ((i2 & 16) != 0) {
                choiceDto2 = binary.choiceFalse;
            }
            com.truecaller.surveys.data.dto.ChoiceDto choiceDto3 = choiceDto2;
            java.lang.String str3 = str2;
            return binary.copy(i, str, str3, choiceDto, choiceDto3);
        }

        public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.QuestionDto.Binary self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.surveys.data.dto.QuestionDto.write$Self(self, output, serialDesc);
            output.C(0, self.getId(), serialDesc);
            output.o(serialDesc, 1, self.getHeaderMessage());
            output.o(serialDesc, 2, self.getMessage());
            du2.baz bazVar = du2.baz.a;
            output.e(serialDesc, 3, bazVar, self.choiceTrue);
            output.e(serialDesc, 4, bazVar, self.choiceFalse);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component4, reason: from getter */
        public final com.truecaller.surveys.data.dto.ChoiceDto getChoiceTrue() {
            return this.choiceTrue;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component5, reason: from getter */
        public final com.truecaller.surveys.data.dto.ChoiceDto getChoiceFalse() {
            return this.choiceFalse;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.QuestionDto.Binary copy(int id, @org.jetbrains.annotations.NotNull java.lang.String headerMessage, @org.jetbrains.annotations.NotNull java.lang.String message, @org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto choiceTrue, @org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto choiceFalse) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerMessage, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choiceTrue, "choiceTrue");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choiceFalse, "choiceFalse");
            return new com.truecaller.surveys.data.dto.QuestionDto.Binary(id, headerMessage, message, choiceTrue, choiceFalse);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.surveys.data.dto.QuestionDto.Binary)) {
                return false;
            }
            com.truecaller.surveys.data.dto.QuestionDto.Binary binary = (com.truecaller.surveys.data.dto.QuestionDto.Binary) other;
            return this.id == binary.id && kotlin.jvm.internal.Intrinsics.b(this.headerMessage, binary.headerMessage) && kotlin.jvm.internal.Intrinsics.b(this.message, binary.message) && kotlin.jvm.internal.Intrinsics.b(this.choiceTrue, binary.choiceTrue) && kotlin.jvm.internal.Intrinsics.b(this.choiceFalse, binary.choiceFalse);
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.ChoiceDto getChoiceFalse() {
            return this.choiceFalse;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.ChoiceDto getChoiceTrue() {
            return this.choiceTrue;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        public int getId() {
            return this.id;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.choiceFalse.hashCode() + ((this.choiceTrue.hashCode() + ax1.bar.e(ax1.bar.e(this.id * 31, 31, this.headerMessage), 31, this.message)) * 31);
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            int i = this.id;
            java.lang.String str = this.headerMessage;
            java.lang.String str2 = this.message;
            com.truecaller.surveys.data.dto.ChoiceDto choiceDto = this.choiceTrue;
            com.truecaller.surveys.data.dto.ChoiceDto choiceDto2 = this.choiceFalse;
            java.lang.StringBuilder r = qb.qux.r("Binary(id=", i, ", headerMessage=", str, ", message=");
            r.append(str2);
            r.append(", choiceTrue=");
            r.append(choiceDto);
            r.append(", choiceFalse=");
            r.append(choiceDto2);
            r.append(")");
            return r.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Binary(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto choiceDto, @org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto choiceDto2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choiceDto, "choiceTrue");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choiceDto2, "choiceFalse");
            this.id = i;
            this.headerMessage = str;
            this.message = str2;
            this.choiceTrue = choiceDto;
            this.choiceFalse = choiceDto2;
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b/\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010 ¨\u00065"}, d2 = {"Lcom/truecaller/surveys/data/dto/QuestionDto$Confirmation;", "Lcom/truecaller/surveys/data/dto/QuestionDto;", "", "id", "", "headerMessage", "message", "actionLabel", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "choice", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/surveys/data/dto/ChoiceDto;)V", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/surveys/data/dto/ChoiceDto;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/QuestionDto$Confirmation;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/truecaller/surveys/data/dto/ChoiceDto;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/surveys/data/dto/ChoiceDto;)Lcom/truecaller/surveys/data/dto/QuestionDto$Confirmation;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getHeaderMessage", "getMessage", "getActionLabel", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "getChoice", "Companion", "com/truecaller/surveys/data/dto/k", "com/truecaller/surveys/data/dto/l", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class Confirmation extends com.truecaller.surveys.data.dto.QuestionDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.l Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final java.lang.String actionLabel;

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.surveys.data.dto.ChoiceDto choice;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String headerMessage;
        private final int id;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Confirmation(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, com.truecaller.surveys.data.dto.ChoiceDto choiceDto, yg3.g1 g1Var) {
            super(i, g1Var);
            if (31 != (i & 31)) {
                yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.k.a.getDescriptor());
                throw null;
            }
            this.id = i2;
            this.headerMessage = str;
            this.message = str2;
            this.actionLabel = str3;
            this.choice = choiceDto;
        }

        public static /* synthetic */ com.truecaller.surveys.data.dto.QuestionDto.Confirmation copy$default(com.truecaller.surveys.data.dto.QuestionDto.Confirmation confirmation, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, com.truecaller.surveys.data.dto.ChoiceDto choiceDto, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = confirmation.id;
            }
            if ((i2 & 2) != 0) {
                str = confirmation.headerMessage;
            }
            if ((i2 & 4) != 0) {
                str2 = confirmation.message;
            }
            if ((i2 & 8) != 0) {
                str3 = confirmation.actionLabel;
            }
            if ((i2 & 16) != 0) {
                choiceDto = confirmation.choice;
            }
            com.truecaller.surveys.data.dto.ChoiceDto choiceDto2 = choiceDto;
            java.lang.String str4 = str2;
            return confirmation.copy(i, str, str4, str3, choiceDto2);
        }

        public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.QuestionDto.Confirmation self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.surveys.data.dto.QuestionDto.write$Self(self, output, serialDesc);
            output.C(0, self.getId(), serialDesc);
            output.o(serialDesc, 1, self.getHeaderMessage());
            output.o(serialDesc, 2, self.getMessage());
            output.o(serialDesc, 3, self.actionLabel);
            output.e(serialDesc, 4, du2.baz.a, self.choice);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component4, reason: from getter */
        public final java.lang.String getActionLabel() {
            return this.actionLabel;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component5, reason: from getter */
        public final com.truecaller.surveys.data.dto.ChoiceDto getChoice() {
            return this.choice;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.QuestionDto.Confirmation copy(int id, @org.jetbrains.annotations.NotNull java.lang.String headerMessage, @org.jetbrains.annotations.NotNull java.lang.String message, @org.jetbrains.annotations.NotNull java.lang.String actionLabel, @org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto choice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerMessage, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choice, "choice");
            return new com.truecaller.surveys.data.dto.QuestionDto.Confirmation(id, headerMessage, message, actionLabel, choice);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.surveys.data.dto.QuestionDto.Confirmation)) {
                return false;
            }
            com.truecaller.surveys.data.dto.QuestionDto.Confirmation confirmation = (com.truecaller.surveys.data.dto.QuestionDto.Confirmation) other;
            return this.id == confirmation.id && kotlin.jvm.internal.Intrinsics.b(this.headerMessage, confirmation.headerMessage) && kotlin.jvm.internal.Intrinsics.b(this.message, confirmation.message) && kotlin.jvm.internal.Intrinsics.b(this.actionLabel, confirmation.actionLabel) && kotlin.jvm.internal.Intrinsics.b(this.choice, confirmation.choice);
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getActionLabel() {
            return this.actionLabel;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.ChoiceDto getChoice() {
            return this.choice;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        public int getId() {
            return this.id;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.choice.hashCode() + ax1.bar.e(ax1.bar.e(ax1.bar.e(this.id * 31, 31, this.headerMessage), 31, this.message), 31, this.actionLabel);
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            int i = this.id;
            java.lang.String str = this.headerMessage;
            java.lang.String str2 = this.message;
            java.lang.String str3 = this.actionLabel;
            com.truecaller.surveys.data.dto.ChoiceDto choiceDto = this.choice;
            java.lang.StringBuilder r = qb.qux.r("Confirmation(id=", i, ", headerMessage=", str, ", message=");
            bar.E(r, str2, ", actionLabel=", str3, ", choice=");
            r.append(choiceDto);
            r.append(")");
            return r.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Confirmation(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto choiceDto) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "actionLabel");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choiceDto, "choice");
            this.id = i;
            this.headerMessage = str;
            this.message = str2;
            this.actionLabel = str3;
            this.choice = choiceDto;
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001e¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/QuestionDto$DynamicSingleChoice;", "Lcom/truecaller/surveys/data/dto/QuestionDto;", "", "id", "", "headerMessage", "message", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "noneOfAboveChoice", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/truecaller/surveys/data/dto/ChoiceDto;)V", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lcom/truecaller/surveys/data/dto/ChoiceDto;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/QuestionDto$DynamicSingleChoice;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/truecaller/surveys/data/dto/ChoiceDto;", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/truecaller/surveys/data/dto/ChoiceDto;)Lcom/truecaller/surveys/data/dto/QuestionDto$DynamicSingleChoice;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getHeaderMessage", "getMessage", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "getNoneOfAboveChoice", "Companion", "com/truecaller/surveys/data/dto/m", "com/truecaller/surveys/data/dto/n", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class DynamicSingleChoice extends com.truecaller.surveys.data.dto.QuestionDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.n Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final java.lang.String headerMessage;
        private final int id;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String message;

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.surveys.data.dto.ChoiceDto noneOfAboveChoice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DynamicSingleChoice(int i, int i2, java.lang.String str, java.lang.String str2, com.truecaller.surveys.data.dto.ChoiceDto choiceDto, yg3.g1 g1Var) {
            super(i, g1Var);
            if (15 != (i & 15)) {
                yg3.w0.l(i, 15, com.truecaller.surveys.data.dto.m.a.getDescriptor());
                throw null;
            }
            this.id = i2;
            this.headerMessage = str;
            this.message = str2;
            this.noneOfAboveChoice = choiceDto;
        }

        public static /* synthetic */ com.truecaller.surveys.data.dto.QuestionDto.DynamicSingleChoice copy$default(com.truecaller.surveys.data.dto.QuestionDto.DynamicSingleChoice dynamicSingleChoice, int i, java.lang.String str, java.lang.String str2, com.truecaller.surveys.data.dto.ChoiceDto choiceDto, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = dynamicSingleChoice.id;
            }
            if ((i2 & 2) != 0) {
                str = dynamicSingleChoice.headerMessage;
            }
            if ((i2 & 4) != 0) {
                str2 = dynamicSingleChoice.message;
            }
            if ((i2 & 8) != 0) {
                choiceDto = dynamicSingleChoice.noneOfAboveChoice;
            }
            return dynamicSingleChoice.copy(i, str, str2, choiceDto);
        }

        public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.QuestionDto.DynamicSingleChoice self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.surveys.data.dto.QuestionDto.write$Self(self, output, serialDesc);
            output.C(0, self.getId(), serialDesc);
            output.o(serialDesc, 1, self.getHeaderMessage());
            output.o(serialDesc, 2, self.getMessage());
            output.e(serialDesc, 3, du2.baz.a, self.noneOfAboveChoice);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component4, reason: from getter */
        public final com.truecaller.surveys.data.dto.ChoiceDto getNoneOfAboveChoice() {
            return this.noneOfAboveChoice;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.QuestionDto.DynamicSingleChoice copy(int id, @org.jetbrains.annotations.NotNull java.lang.String headerMessage, @org.jetbrains.annotations.NotNull java.lang.String message, @org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto noneOfAboveChoice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerMessage, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noneOfAboveChoice, "noneOfAboveChoice");
            return new com.truecaller.surveys.data.dto.QuestionDto.DynamicSingleChoice(id, headerMessage, message, noneOfAboveChoice);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.surveys.data.dto.QuestionDto.DynamicSingleChoice)) {
                return false;
            }
            com.truecaller.surveys.data.dto.QuestionDto.DynamicSingleChoice dynamicSingleChoice = (com.truecaller.surveys.data.dto.QuestionDto.DynamicSingleChoice) other;
            return this.id == dynamicSingleChoice.id && kotlin.jvm.internal.Intrinsics.b(this.headerMessage, dynamicSingleChoice.headerMessage) && kotlin.jvm.internal.Intrinsics.b(this.message, dynamicSingleChoice.message) && kotlin.jvm.internal.Intrinsics.b(this.noneOfAboveChoice, dynamicSingleChoice.noneOfAboveChoice);
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        public int getId() {
            return this.id;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getMessage() {
            return this.message;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.ChoiceDto getNoneOfAboveChoice() {
            return this.noneOfAboveChoice;
        }

        public int hashCode() {
            return this.noneOfAboveChoice.hashCode() + ax1.bar.e(ax1.bar.e(this.id * 31, 31, this.headerMessage), 31, this.message);
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            int i = this.id;
            java.lang.String str = this.headerMessage;
            java.lang.String str2 = this.message;
            com.truecaller.surveys.data.dto.ChoiceDto choiceDto = this.noneOfAboveChoice;
            java.lang.StringBuilder r = qb.qux.r("DynamicSingleChoice(id=", i, ", headerMessage=", str, ", message=");
            r.append(str2);
            r.append(", noneOfAboveChoice=");
            r.append(choiceDto);
            r.append(")");
            return r.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DynamicSingleChoice(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull com.truecaller.surveys.data.dto.ChoiceDto choiceDto) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choiceDto, "noneOfAboveChoice");
            this.id = i;
            this.headerMessage = str;
            this.message = str2;
            this.noneOfAboveChoice = choiceDto;
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b0\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b1\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010!¨\u00067"}, d2 = {"Lcom/truecaller/surveys/data/dto/QuestionDto$FreeText;", "Lcom/truecaller/surveys/data/dto/QuestionDto;", "", "id", "", "headerMessage", "message", "hint", "actionLabel", "followupQuestionId", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/QuestionDto$FreeText;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/truecaller/surveys/data/dto/QuestionDto$FreeText;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getHeaderMessage", "getMessage", "getHint", "getActionLabel", "Ljava/lang/Integer;", "getFollowupQuestionId", "Companion", "com/truecaller/surveys/data/dto/o", "com/truecaller/surveys/data/dto/p", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class FreeText extends com.truecaller.surveys.data.dto.QuestionDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.p Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final java.lang.String actionLabel;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer followupQuestionId;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String headerMessage;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String hint;
        private final int id;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FreeText(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, yg3.g1 g1Var) {
            super(i, g1Var);
            if (63 != (i & 63)) {
                yg3.w0.l(i, 63, com.truecaller.surveys.data.dto.o.a.getDescriptor());
                throw null;
            }
            this.id = i2;
            this.headerMessage = str;
            this.message = str2;
            this.hint = str3;
            this.actionLabel = str4;
            this.followupQuestionId = num;
        }

        public static /* synthetic */ com.truecaller.surveys.data.dto.QuestionDto.FreeText copy$default(com.truecaller.surveys.data.dto.QuestionDto.FreeText freeText, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = freeText.id;
            }
            if ((i2 & 2) != 0) {
                str = freeText.headerMessage;
            }
            if ((i2 & 4) != 0) {
                str2 = freeText.message;
            }
            if ((i2 & 8) != 0) {
                str3 = freeText.hint;
            }
            if ((i2 & 16) != 0) {
                str4 = freeText.actionLabel;
            }
            if ((i2 & 32) != 0) {
                num = freeText.followupQuestionId;
            }
            java.lang.String str5 = str4;
            java.lang.Integer num2 = num;
            return freeText.copy(i, str, str2, str3, str5, num2);
        }

        public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.QuestionDto.FreeText self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.surveys.data.dto.QuestionDto.write$Self(self, output, serialDesc);
            output.C(0, self.getId(), serialDesc);
            output.o(serialDesc, 1, self.getHeaderMessage());
            output.o(serialDesc, 2, self.getMessage());
            output.o(serialDesc, 3, self.hint);
            output.o(serialDesc, 4, self.actionLabel);
            output.g(serialDesc, 5, yg3.g0.a, self.followupQuestionId);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component4, reason: from getter */
        public final java.lang.String getHint() {
            return this.hint;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component5, reason: from getter */
        public final java.lang.String getActionLabel() {
            return this.actionLabel;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component6, reason: from getter */
        public final java.lang.Integer getFollowupQuestionId() {
            return this.followupQuestionId;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.QuestionDto.FreeText copy(int id, @org.jetbrains.annotations.NotNull java.lang.String headerMessage, @org.jetbrains.annotations.NotNull java.lang.String message, @org.jetbrains.annotations.NotNull java.lang.String hint, @org.jetbrains.annotations.NotNull java.lang.String actionLabel, @org.jetbrains.annotations.Nullable java.lang.Integer followupQuestionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerMessage, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hint, "hint");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
            return new com.truecaller.surveys.data.dto.QuestionDto.FreeText(id, headerMessage, message, hint, actionLabel, followupQuestionId);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.surveys.data.dto.QuestionDto.FreeText)) {
                return false;
            }
            com.truecaller.surveys.data.dto.QuestionDto.FreeText freeText = (com.truecaller.surveys.data.dto.QuestionDto.FreeText) other;
            return this.id == freeText.id && kotlin.jvm.internal.Intrinsics.b(this.headerMessage, freeText.headerMessage) && kotlin.jvm.internal.Intrinsics.b(this.message, freeText.message) && kotlin.jvm.internal.Intrinsics.b(this.hint, freeText.hint) && kotlin.jvm.internal.Intrinsics.b(this.actionLabel, freeText.actionLabel) && kotlin.jvm.internal.Intrinsics.b(this.followupQuestionId, freeText.followupQuestionId);
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getActionLabel() {
            return this.actionLabel;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getFollowupQuestionId() {
            return this.followupQuestionId;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getHint() {
            return this.hint;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        public int getId() {
            return this.id;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode;
            int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(this.id * 31, 31, this.headerMessage), 31, this.message), 31, this.hint), 31, this.actionLabel);
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
            java.lang.String str = this.headerMessage;
            java.lang.String str2 = this.message;
            java.lang.String str3 = this.hint;
            java.lang.String str4 = this.actionLabel;
            java.lang.Integer num = this.followupQuestionId;
            java.lang.StringBuilder r = qb.qux.r("FreeText(id=", i, ", headerMessage=", str, ", message=");
            bar.E(r, str2, ", hint=", str3, ", actionLabel=");
            r.append(str4);
            r.append(", followupQuestionId=");
            r.append(num);
            r.append(")");
            return r.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FreeText(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.Integer num) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "hint");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "actionLabel");
            this.id = i;
            this.headerMessage = str;
            this.message = str2;
            this.hint = str3;
            this.actionLabel = str4;
            this.followupQuestionId = num;
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u001f¨\u00063"}, d2 = {"Lcom/truecaller/surveys/data/dto/QuestionDto$Rating;", "Lcom/truecaller/surveys/data/dto/QuestionDto;", "", "id", "", "headerMessage", "message", "", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "choices", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/QuestionDto$Rating;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/truecaller/surveys/data/dto/QuestionDto$Rating;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getHeaderMessage", "getMessage", "Ljava/util/List;", "getChoices", "Companion", "com/truecaller/surveys/data/dto/q", "com/truecaller/surveys/data/dto/r", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class Rating extends com.truecaller.surveys.data.dto.QuestionDto {
        public static final int $stable = 8;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.truecaller.surveys.data.dto.ChoiceDto> choices;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String headerMessage;
        private final int id;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String message;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.r Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer>[] $childSerializers = {null, null, null, kotlin.LazyKt.lazy(kotlin.k.b, new da0.bar(15))};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Rating(int i, int i2, java.lang.String str, java.lang.String str2, java.util.List list, yg3.g1 g1Var) {
            super(i, g1Var);
            if (15 != (i & 15)) {
                yg3.w0.l(i, 15, com.truecaller.surveys.data.dto.q.a.getDescriptor());
                throw null;
            }
            this.id = i2;
            this.headerMessage = str;
            this.message = str2;
            this.choices = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_() {
            return new yg3.a(du2.baz.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.truecaller.surveys.data.dto.QuestionDto.Rating copy$default(com.truecaller.surveys.data.dto.QuestionDto.Rating rating, int i, java.lang.String str, java.lang.String str2, java.util.List list, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = rating.id;
            }
            if ((i2 & 2) != 0) {
                str = rating.headerMessage;
            }
            if ((i2 & 4) != 0) {
                str2 = rating.message;
            }
            if ((i2 & 8) != 0) {
                list = rating.choices;
            }
            return rating.copy(i, str, str2, list);
        }

        public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.QuestionDto.Rating self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.surveys.data.dto.QuestionDto.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer>[] lazyArr = $childSerializers;
            output.C(0, self.getId(), serialDesc);
            output.o(serialDesc, 1, self.getHeaderMessage());
            output.o(serialDesc, 2, self.getMessage());
            output.e(serialDesc, 3, (kotlinx.serialization.KSerializer) lazyArr[3].getValue(), self.choices);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.truecaller.surveys.data.dto.ChoiceDto> component4() {
            return this.choices;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.QuestionDto.Rating copy(int id, @org.jetbrains.annotations.NotNull java.lang.String headerMessage, @org.jetbrains.annotations.NotNull java.lang.String message, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.surveys.data.dto.ChoiceDto> choices) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerMessage, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choices, "choices");
            return new com.truecaller.surveys.data.dto.QuestionDto.Rating(id, headerMessage, message, choices);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.surveys.data.dto.QuestionDto.Rating)) {
                return false;
            }
            com.truecaller.surveys.data.dto.QuestionDto.Rating rating = (com.truecaller.surveys.data.dto.QuestionDto.Rating) other;
            return this.id == rating.id && kotlin.jvm.internal.Intrinsics.b(this.headerMessage, rating.headerMessage) && kotlin.jvm.internal.Intrinsics.b(this.message, rating.message) && kotlin.jvm.internal.Intrinsics.b(this.choices, rating.choices);
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.truecaller.surveys.data.dto.ChoiceDto> getChoices() {
            return this.choices;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        public int getId() {
            return this.id;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.choices.hashCode() + ax1.bar.e(ax1.bar.e(this.id * 31, 31, this.headerMessage), 31, this.message);
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            int i = this.id;
            java.lang.String str = this.headerMessage;
            return z0.a0.d(this.message, ", choices=", ")", qb.qux.r("Rating(id=", i, ", headerMessage=", str, ", message="), this.choices);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rating(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.surveys.data.dto.ChoiceDto> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "choices");
            this.id = i;
            this.headerMessage = str;
            this.message = str2;
            this.choices = list;
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b0\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b1\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010!¨\u00067"}, d2 = {"Lcom/truecaller/surveys/data/dto/QuestionDto$RatingAndReview;", "Lcom/truecaller/surveys/data/dto/QuestionDto;", "", "id", "", "headerMessage", "message", "actionLabel", "hint", "followupQuestionId", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/QuestionDto$RatingAndReview;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/truecaller/surveys/data/dto/QuestionDto$RatingAndReview;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getHeaderMessage", "getMessage", "getActionLabel", "getHint", "Ljava/lang/Integer;", "getFollowupQuestionId", "Companion", "com/truecaller/surveys/data/dto/s", "com/truecaller/surveys/data/dto/t", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class RatingAndReview extends com.truecaller.surveys.data.dto.QuestionDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.t Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final java.lang.String actionLabel;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer followupQuestionId;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String headerMessage;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String hint;
        private final int id;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RatingAndReview(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, yg3.g1 g1Var) {
            super(i, g1Var);
            if (63 != (i & 63)) {
                yg3.w0.l(i, 63, com.truecaller.surveys.data.dto.s.a.getDescriptor());
                throw null;
            }
            this.id = i2;
            this.headerMessage = str;
            this.message = str2;
            this.actionLabel = str3;
            this.hint = str4;
            this.followupQuestionId = num;
        }

        public static /* synthetic */ com.truecaller.surveys.data.dto.QuestionDto.RatingAndReview copy$default(com.truecaller.surveys.data.dto.QuestionDto.RatingAndReview ratingAndReview, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = ratingAndReview.id;
            }
            if ((i2 & 2) != 0) {
                str = ratingAndReview.headerMessage;
            }
            if ((i2 & 4) != 0) {
                str2 = ratingAndReview.message;
            }
            if ((i2 & 8) != 0) {
                str3 = ratingAndReview.actionLabel;
            }
            if ((i2 & 16) != 0) {
                str4 = ratingAndReview.hint;
            }
            if ((i2 & 32) != 0) {
                num = ratingAndReview.followupQuestionId;
            }
            java.lang.String str5 = str4;
            java.lang.Integer num2 = num;
            return ratingAndReview.copy(i, str, str2, str3, str5, num2);
        }

        public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.QuestionDto.RatingAndReview self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.surveys.data.dto.QuestionDto.write$Self(self, output, serialDesc);
            output.C(0, self.getId(), serialDesc);
            output.o(serialDesc, 1, self.getHeaderMessage());
            output.o(serialDesc, 2, self.getMessage());
            output.o(serialDesc, 3, self.actionLabel);
            output.o(serialDesc, 4, self.hint);
            output.g(serialDesc, 5, yg3.g0.a, self.followupQuestionId);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component4, reason: from getter */
        public final java.lang.String getActionLabel() {
            return this.actionLabel;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component5, reason: from getter */
        public final java.lang.String getHint() {
            return this.hint;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component6, reason: from getter */
        public final java.lang.Integer getFollowupQuestionId() {
            return this.followupQuestionId;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.QuestionDto.RatingAndReview copy(int id, @org.jetbrains.annotations.NotNull java.lang.String headerMessage, @org.jetbrains.annotations.NotNull java.lang.String message, @org.jetbrains.annotations.NotNull java.lang.String actionLabel, @org.jetbrains.annotations.NotNull java.lang.String hint, @org.jetbrains.annotations.Nullable java.lang.Integer followupQuestionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerMessage, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hint, "hint");
            return new com.truecaller.surveys.data.dto.QuestionDto.RatingAndReview(id, headerMessage, message, actionLabel, hint, followupQuestionId);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.surveys.data.dto.QuestionDto.RatingAndReview)) {
                return false;
            }
            com.truecaller.surveys.data.dto.QuestionDto.RatingAndReview ratingAndReview = (com.truecaller.surveys.data.dto.QuestionDto.RatingAndReview) other;
            return this.id == ratingAndReview.id && kotlin.jvm.internal.Intrinsics.b(this.headerMessage, ratingAndReview.headerMessage) && kotlin.jvm.internal.Intrinsics.b(this.message, ratingAndReview.message) && kotlin.jvm.internal.Intrinsics.b(this.actionLabel, ratingAndReview.actionLabel) && kotlin.jvm.internal.Intrinsics.b(this.hint, ratingAndReview.hint) && kotlin.jvm.internal.Intrinsics.b(this.followupQuestionId, ratingAndReview.followupQuestionId);
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getActionLabel() {
            return this.actionLabel;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getFollowupQuestionId() {
            return this.followupQuestionId;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getHint() {
            return this.hint;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        public int getId() {
            return this.id;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode;
            int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(this.id * 31, 31, this.headerMessage), 31, this.message), 31, this.actionLabel), 31, this.hint);
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
            java.lang.String str = this.headerMessage;
            java.lang.String str2 = this.message;
            java.lang.String str3 = this.actionLabel;
            java.lang.String str4 = this.hint;
            java.lang.Integer num = this.followupQuestionId;
            java.lang.StringBuilder r = qb.qux.r("RatingAndReview(id=", i, ", headerMessage=", str, ", message=");
            bar.E(r, str2, ", actionLabel=", str3, ", hint=");
            r.append(str4);
            r.append(", followupQuestionId=");
            r.append(num);
            r.append(")");
            return r.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RatingAndReview(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.Integer num) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "actionLabel");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "hint");
            this.id = i;
            this.headerMessage = str;
            this.message = str2;
            this.actionLabel = str3;
            this.hint = str4;
            this.followupQuestionId = num;
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u001f¨\u00063"}, d2 = {"Lcom/truecaller/surveys/data/dto/QuestionDto$SingleChoice;", "Lcom/truecaller/surveys/data/dto/QuestionDto;", "", "id", "", "headerMessage", "message", "", "Lcom/truecaller/surveys/data/dto/ChoiceDto;", "choices", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/QuestionDto$SingleChoice;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/truecaller/surveys/data/dto/QuestionDto$SingleChoice;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getHeaderMessage", "getMessage", "Ljava/util/List;", "getChoices", "Companion", "com/truecaller/surveys/data/dto/u", "com/truecaller/surveys/data/dto/v", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class SingleChoice extends com.truecaller.surveys.data.dto.QuestionDto {
        public static final int $stable = 8;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.truecaller.surveys.data.dto.ChoiceDto> choices;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String headerMessage;
        private final int id;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String message;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.v Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer>[] $childSerializers = {null, null, null, kotlin.LazyKt.lazy(kotlin.k.b, new da0.bar(16))};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SingleChoice(int i, int i2, java.lang.String str, java.lang.String str2, java.util.List list, yg3.g1 g1Var) {
            super(i, g1Var);
            if (15 != (i & 15)) {
                yg3.w0.l(i, 15, com.truecaller.surveys.data.dto.u.a.getDescriptor());
                throw null;
            }
            this.id = i2;
            this.headerMessage = str;
            this.message = str2;
            this.choices = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_() {
            return new yg3.a(du2.baz.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.truecaller.surveys.data.dto.QuestionDto.SingleChoice copy$default(com.truecaller.surveys.data.dto.QuestionDto.SingleChoice singleChoice, int i, java.lang.String str, java.lang.String str2, java.util.List list, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = singleChoice.id;
            }
            if ((i2 & 2) != 0) {
                str = singleChoice.headerMessage;
            }
            if ((i2 & 4) != 0) {
                str2 = singleChoice.message;
            }
            if ((i2 & 8) != 0) {
                list = singleChoice.choices;
            }
            return singleChoice.copy(i, str, str2, list);
        }

        public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.QuestionDto.SingleChoice self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.surveys.data.dto.QuestionDto.write$Self(self, output, serialDesc);
            kotlin.Lazy<kotlinx.serialization.KSerializer>[] lazyArr = $childSerializers;
            output.C(0, self.getId(), serialDesc);
            output.o(serialDesc, 1, self.getHeaderMessage());
            output.o(serialDesc, 2, self.getMessage());
            output.e(serialDesc, 3, (kotlinx.serialization.KSerializer) lazyArr[3].getValue(), self.choices);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.truecaller.surveys.data.dto.ChoiceDto> component4() {
            return this.choices;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.QuestionDto.SingleChoice copy(int id, @org.jetbrains.annotations.NotNull java.lang.String headerMessage, @org.jetbrains.annotations.NotNull java.lang.String message, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.surveys.data.dto.ChoiceDto> choices) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerMessage, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choices, "choices");
            return new com.truecaller.surveys.data.dto.QuestionDto.SingleChoice(id, headerMessage, message, choices);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.surveys.data.dto.QuestionDto.SingleChoice)) {
                return false;
            }
            com.truecaller.surveys.data.dto.QuestionDto.SingleChoice singleChoice = (com.truecaller.surveys.data.dto.QuestionDto.SingleChoice) other;
            return this.id == singleChoice.id && kotlin.jvm.internal.Intrinsics.b(this.headerMessage, singleChoice.headerMessage) && kotlin.jvm.internal.Intrinsics.b(this.message, singleChoice.message) && kotlin.jvm.internal.Intrinsics.b(this.choices, singleChoice.choices);
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.truecaller.surveys.data.dto.ChoiceDto> getChoices() {
            return this.choices;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        public int getId() {
            return this.id;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.choices.hashCode() + ax1.bar.e(ax1.bar.e(this.id * 31, 31, this.headerMessage), 31, this.message);
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            int i = this.id;
            java.lang.String str = this.headerMessage;
            return z0.a0.d(this.message, ", choices=", ")", qb.qux.r("SingleChoice(id=", i, ", headerMessage=", str, ", message="), this.choices);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleChoice(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.surveys.data.dto.ChoiceDto> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "choices");
            this.id = i;
            this.headerMessage = str;
            this.message = str2;
            this.choices = list;
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lcom/truecaller/surveys/data/dto/QuestionDto$SpamCategories;", "Lcom/truecaller/surveys/data/dto/QuestionDto;", "", "id", "", "headerMessage", "message", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/QuestionDto$SpamCategories;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/truecaller/surveys/data/dto/QuestionDto$SpamCategories;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getHeaderMessage", "getMessage", "Companion", "com/truecaller/surveys/data/dto/w", "com/truecaller/surveys/data/dto/x", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class SpamCategories extends com.truecaller.surveys.data.dto.QuestionDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.x Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final java.lang.String headerMessage;
        private final int id;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SpamCategories(int i, int i2, java.lang.String str, java.lang.String str2, yg3.g1 g1Var) {
            super(i, g1Var);
            if (7 != (i & 7)) {
                yg3.w0.l(i, 7, com.truecaller.surveys.data.dto.w.a.getDescriptor());
                throw null;
            }
            this.id = i2;
            this.headerMessage = str;
            this.message = str2;
        }

        public static /* synthetic */ com.truecaller.surveys.data.dto.QuestionDto.SpamCategories copy$default(com.truecaller.surveys.data.dto.QuestionDto.SpamCategories spamCategories, int i, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = spamCategories.id;
            }
            if ((i2 & 2) != 0) {
                str = spamCategories.headerMessage;
            }
            if ((i2 & 4) != 0) {
                str2 = spamCategories.message;
            }
            return spamCategories.copy(i, str, str2);
        }

        public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.QuestionDto.SpamCategories self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.surveys.data.dto.QuestionDto.write$Self(self, output, serialDesc);
            output.C(0, self.getId(), serialDesc);
            output.o(serialDesc, 1, self.getHeaderMessage());
            output.o(serialDesc, 2, self.getMessage());
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.QuestionDto.SpamCategories copy(int id, @org.jetbrains.annotations.NotNull java.lang.String headerMessage, @org.jetbrains.annotations.NotNull java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerMessage, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            return new com.truecaller.surveys.data.dto.QuestionDto.SpamCategories(id, headerMessage, message);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.surveys.data.dto.QuestionDto.SpamCategories)) {
                return false;
            }
            com.truecaller.surveys.data.dto.QuestionDto.SpamCategories spamCategories = (com.truecaller.surveys.data.dto.QuestionDto.SpamCategories) other;
            return this.id == spamCategories.id && kotlin.jvm.internal.Intrinsics.b(this.headerMessage, spamCategories.headerMessage) && kotlin.jvm.internal.Intrinsics.b(this.message, spamCategories.message);
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getHeaderMessage() {
            return this.headerMessage;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        public int getId() {
            return this.id;
        }

        @Override // com.truecaller.surveys.data.dto.QuestionDto
        @org.jetbrains.annotations.NotNull
        public java.lang.String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode() + ax1.bar.e(this.id * 31, 31, this.headerMessage);
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return bar.v(this.message, ")", qb.qux.r("SpamCategories(id=", this.id, ", headerMessage=", this.headerMessage, ", message="));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpamCategories(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "headerMessage");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "message");
            this.id = i;
            this.headerMessage = str;
            this.message = str2;
        }
    }

    public /* synthetic */ QuestionDto(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.KSerializer _init_$_anonymous_() {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        return new ug3.c("com.truecaller.surveys.data.dto.QuestionDto", l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.QuestionDto.class), new kotlin.reflect.KClass[]{l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.QuestionDto.Binary.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.QuestionDto.Confirmation.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.QuestionDto.DynamicSingleChoice.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.QuestionDto.FreeText.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.QuestionDto.Rating.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.QuestionDto.RatingAndReview.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.QuestionDto.SingleChoice.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.QuestionDto.SpamCategories.class)}, new kotlinx.serialization.KSerializer[]{com.truecaller.surveys.data.dto.i.a, com.truecaller.surveys.data.dto.k.a, com.truecaller.surveys.data.dto.m.a, com.truecaller.surveys.data.dto.o.a, com.truecaller.surveys.data.dto.q.a, com.truecaller.surveys.data.dto.s.a, com.truecaller.surveys.data.dto.u.a, com.truecaller.surveys.data.dto.w.a}, new java.lang.annotation.Annotation[0]);
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getHeaderMessage();

    public abstract int getId();

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getMessage();

    private QuestionDto() {
    }

    public /* synthetic */ QuestionDto(int i, yg3.g1 g1Var) {
    }

    public static final /* synthetic */ void write$Self(com.truecaller.surveys.data.dto.QuestionDto self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
}
