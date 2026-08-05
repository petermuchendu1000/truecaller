package com.truecaller.surveys.data.dto;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0005\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto;", "", "<init>", "()V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Acs", "DetailsView", "ReportProfile", "RatingsAndReviews", "Block", "du2/e", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$RatingsAndReviews;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$ReportProfile;", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@ug3.d
/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class SurveyFlowDto {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final du2.e Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.k.b, new da0.bar(20));

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001d2\u00020\u0001:\u0006\u001e\u001f !\"#B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013\u0082\u0001\u0005$%&'(¨\u0006)"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto;", "<init>", "()V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getShowIfPickedUp", "()Z", "showIfPickedUp", "getShowIfMissed", "showIfMissed", "getShowIfOutgoing", "showIfOutgoing", "getShowIfInPhonebook", "showIfInPhonebook", "getShowIfNotInPhonebook", "showIfNotInPhonebook", "Companion", "Generic", "NameSuggestion", "Bizmon", "NameQualityFeedback", "PositiveResponseNameSuggestion", "com/truecaller/surveys/data/dto/a0", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$Bizmon;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$Generic;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$NameQualityFeedback;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$NameSuggestion;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$PositiveResponseNameSuggestion;", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static abstract class Acs extends com.truecaller.surveys.data.dto.SurveyFlowDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.a0 Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.k.b, new da0.bar(21));

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$Bizmon;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$Bizmon;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$Bizmon;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/y", "com/truecaller/surveys/data/dto/z", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class Bizmon extends com.truecaller.surveys.data.dto.SurveyFlowDto.Acs {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.z Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Bizmon(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.y.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Bizmon copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Bizmon bizmon, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = bizmon.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = bizmon.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = bizmon.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = bizmon.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = bizmon.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return bizmon.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Bizmon self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Bizmon copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Bizmon(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Bizmon)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Bizmon bizmon = (com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Bizmon) other;
                return this.showIfPickedUp == bizmon.showIfPickedUp && this.showIfMissed == bizmon.showIfMissed && this.showIfOutgoing == bizmon.showIfOutgoing && this.showIfInPhonebook == bizmon.showIfInPhonebook && this.showIfNotInPhonebook == bizmon.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("Bizmon(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public Bizmon(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$Generic;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$Generic;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$Generic;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/b0", "com/truecaller/surveys/data/dto/c0", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class Generic extends com.truecaller.surveys.data.dto.SurveyFlowDto.Acs {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.c0 Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Generic(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.b0.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Generic copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Generic generic, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = generic.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = generic.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = generic.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = generic.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = generic.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return generic.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Generic self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Generic copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Generic(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Generic)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Generic generic = (com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Generic) other;
                return this.showIfPickedUp == generic.showIfPickedUp && this.showIfMissed == generic.showIfMissed && this.showIfOutgoing == generic.showIfOutgoing && this.showIfInPhonebook == generic.showIfInPhonebook && this.showIfNotInPhonebook == generic.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("Generic(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public Generic(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$NameQualityFeedback;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$NameQualityFeedback;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$NameQualityFeedback;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/d0", "com/truecaller/surveys/data/dto/e0", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class NameQualityFeedback extends com.truecaller.surveys.data.dto.SurveyFlowDto.Acs {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.e0 Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ NameQualityFeedback(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.d0.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameQualityFeedback copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameQualityFeedback nameQualityFeedback, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = nameQualityFeedback.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = nameQualityFeedback.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = nameQualityFeedback.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = nameQualityFeedback.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = nameQualityFeedback.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return nameQualityFeedback.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameQualityFeedback self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameQualityFeedback copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameQualityFeedback(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameQualityFeedback)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameQualityFeedback nameQualityFeedback = (com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameQualityFeedback) other;
                return this.showIfPickedUp == nameQualityFeedback.showIfPickedUp && this.showIfMissed == nameQualityFeedback.showIfMissed && this.showIfOutgoing == nameQualityFeedback.showIfOutgoing && this.showIfInPhonebook == nameQualityFeedback.showIfInPhonebook && this.showIfNotInPhonebook == nameQualityFeedback.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("NameQualityFeedback(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public NameQualityFeedback(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$NameSuggestion;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$NameSuggestion;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$NameSuggestion;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/f0", "com/truecaller/surveys/data/dto/g0", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class NameSuggestion extends com.truecaller.surveys.data.dto.SurveyFlowDto.Acs {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.g0 Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ NameSuggestion(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.f0.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameSuggestion copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameSuggestion nameSuggestion, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = nameSuggestion.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = nameSuggestion.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = nameSuggestion.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = nameSuggestion.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = nameSuggestion.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return nameSuggestion.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameSuggestion self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameSuggestion copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameSuggestion(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameSuggestion)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameSuggestion nameSuggestion = (com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameSuggestion) other;
                return this.showIfPickedUp == nameSuggestion.showIfPickedUp && this.showIfMissed == nameSuggestion.showIfMissed && this.showIfOutgoing == nameSuggestion.showIfOutgoing && this.showIfInPhonebook == nameSuggestion.showIfInPhonebook && this.showIfNotInPhonebook == nameSuggestion.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("NameSuggestion(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public NameSuggestion(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$PositiveResponseNameSuggestion;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$PositiveResponseNameSuggestion;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Acs$PositiveResponseNameSuggestion;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/h0", "com/truecaller/surveys/data/dto/i0", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class PositiveResponseNameSuggestion extends com.truecaller.surveys.data.dto.SurveyFlowDto.Acs {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.i0 Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ PositiveResponseNameSuggestion(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.h0.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.PositiveResponseNameSuggestion copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.PositiveResponseNameSuggestion positiveResponseNameSuggestion, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = positiveResponseNameSuggestion.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = positiveResponseNameSuggestion.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = positiveResponseNameSuggestion.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = positiveResponseNameSuggestion.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = positiveResponseNameSuggestion.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return positiveResponseNameSuggestion.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.PositiveResponseNameSuggestion self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.PositiveResponseNameSuggestion copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.PositiveResponseNameSuggestion(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.PositiveResponseNameSuggestion)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.PositiveResponseNameSuggestion positiveResponseNameSuggestion = (com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.PositiveResponseNameSuggestion) other;
                return this.showIfPickedUp == positiveResponseNameSuggestion.showIfPickedUp && this.showIfMissed == positiveResponseNameSuggestion.showIfMissed && this.showIfOutgoing == positiveResponseNameSuggestion.showIfOutgoing && this.showIfInPhonebook == positiveResponseNameSuggestion.showIfInPhonebook && this.showIfNotInPhonebook == positiveResponseNameSuggestion.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Acs
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("PositiveResponseNameSuggestion(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public PositiveResponseNameSuggestion(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        public /* synthetic */ Acs(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlinx.serialization.KSerializer _init_$_anonymous_() {
            kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
            return new ug3.c("com.truecaller.surveys.data.dto.SurveyFlowDto.Acs", l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.class), new kotlin.reflect.KClass[]{l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Bizmon.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Generic.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameQualityFeedback.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameSuggestion.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.PositiveResponseNameSuggestion.class)}, new kotlinx.serialization.KSerializer[]{com.truecaller.surveys.data.dto.y.a, com.truecaller.surveys.data.dto.b0.a, com.truecaller.surveys.data.dto.d0.a, com.truecaller.surveys.data.dto.f0.a, com.truecaller.surveys.data.dto.h0.a}, new java.lang.annotation.Annotation[0]);
        }

        public abstract boolean getShowIfInPhonebook();

        public abstract boolean getShowIfMissed();

        public abstract boolean getShowIfNotInPhonebook();

        public abstract boolean getShowIfOutgoing();

        public abstract boolean getShowIfPickedUp();

        private Acs() {
            super(null);
        }

        public /* synthetic */ Acs(int i, yg3.g1 g1Var) {
            super(i, g1Var);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001d2\u00020\u0001:\b\u001e\u001f !\"#$%B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013\u0082\u0001\u0007&'()*+,¨\u0006-"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto;", "<init>", "()V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getShowIfPickedUp", "()Z", "showIfPickedUp", "getShowIfMissed", "showIfMissed", "getShowIfOutgoing", "showIfOutgoing", "getShowIfInPhonebook", "showIfInPhonebook", "getShowIfNotInPhonebook", "showIfNotInPhonebook", "Companion", "DynamicNameSurvey", "NameQualityFeedback", "DynamicComment", "TopComment", "SpamCategories", "NameSuggestion", "Comments", "com/truecaller/surveys/data/dto/l0", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$Comments;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$DynamicComment;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$DynamicNameSurvey;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$NameQualityFeedback;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$NameSuggestion;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$SpamCategories;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$TopComment;", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static abstract class Block extends com.truecaller.surveys.data.dto.SurveyFlowDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.l0 Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.k.b, new da0.bar(22));

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$Comments;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$Comments;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$Comments;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/j0", "com/truecaller/surveys/data/dto/k0", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class Comments extends com.truecaller.surveys.data.dto.SurveyFlowDto.Block {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.k0 Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Comments(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.j0.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.Block.Comments copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.Comments comments, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = comments.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = comments.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = comments.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = comments.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = comments.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return comments.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.Comments self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.Block.Comments copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.Block.Comments(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.Block.Comments)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.Block.Comments comments = (com.truecaller.surveys.data.dto.SurveyFlowDto.Block.Comments) other;
                return this.showIfPickedUp == comments.showIfPickedUp && this.showIfMissed == comments.showIfMissed && this.showIfOutgoing == comments.showIfOutgoing && this.showIfInPhonebook == comments.showIfInPhonebook && this.showIfNotInPhonebook == comments.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("Comments(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public Comments(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$DynamicComment;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$DynamicComment;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$DynamicComment;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/m0", "com/truecaller/surveys/data/dto/n0", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class DynamicComment extends com.truecaller.surveys.data.dto.SurveyFlowDto.Block {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.n0 Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ DynamicComment(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.m0.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicComment copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicComment dynamicComment, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = dynamicComment.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = dynamicComment.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = dynamicComment.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = dynamicComment.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = dynamicComment.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return dynamicComment.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicComment self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicComment copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicComment(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicComment)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicComment dynamicComment = (com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicComment) other;
                return this.showIfPickedUp == dynamicComment.showIfPickedUp && this.showIfMissed == dynamicComment.showIfMissed && this.showIfOutgoing == dynamicComment.showIfOutgoing && this.showIfInPhonebook == dynamicComment.showIfInPhonebook && this.showIfNotInPhonebook == dynamicComment.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("DynamicComment(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public DynamicComment(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$DynamicNameSurvey;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$DynamicNameSurvey;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$DynamicNameSurvey;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/o0", "com/truecaller/surveys/data/dto/p0", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class DynamicNameSurvey extends com.truecaller.surveys.data.dto.SurveyFlowDto.Block {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.p0 Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ DynamicNameSurvey(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.o0.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicNameSurvey copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicNameSurvey dynamicNameSurvey, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = dynamicNameSurvey.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = dynamicNameSurvey.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = dynamicNameSurvey.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = dynamicNameSurvey.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = dynamicNameSurvey.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return dynamicNameSurvey.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicNameSurvey self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicNameSurvey copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicNameSurvey(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicNameSurvey)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicNameSurvey dynamicNameSurvey = (com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicNameSurvey) other;
                return this.showIfPickedUp == dynamicNameSurvey.showIfPickedUp && this.showIfMissed == dynamicNameSurvey.showIfMissed && this.showIfOutgoing == dynamicNameSurvey.showIfOutgoing && this.showIfInPhonebook == dynamicNameSurvey.showIfInPhonebook && this.showIfNotInPhonebook == dynamicNameSurvey.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("DynamicNameSurvey(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public DynamicNameSurvey(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$NameQualityFeedback;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$NameQualityFeedback;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$NameQualityFeedback;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/q0", "com/truecaller/surveys/data/dto/r0", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class NameQualityFeedback extends com.truecaller.surveys.data.dto.SurveyFlowDto.Block {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.r0 Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ NameQualityFeedback(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.q0.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameQualityFeedback copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameQualityFeedback nameQualityFeedback, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = nameQualityFeedback.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = nameQualityFeedback.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = nameQualityFeedback.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = nameQualityFeedback.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = nameQualityFeedback.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return nameQualityFeedback.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameQualityFeedback self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameQualityFeedback copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameQualityFeedback(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameQualityFeedback)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameQualityFeedback nameQualityFeedback = (com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameQualityFeedback) other;
                return this.showIfPickedUp == nameQualityFeedback.showIfPickedUp && this.showIfMissed == nameQualityFeedback.showIfMissed && this.showIfOutgoing == nameQualityFeedback.showIfOutgoing && this.showIfInPhonebook == nameQualityFeedback.showIfInPhonebook && this.showIfNotInPhonebook == nameQualityFeedback.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("NameQualityFeedback(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public NameQualityFeedback(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$NameSuggestion;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$NameSuggestion;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$NameSuggestion;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/s0", "com/truecaller/surveys/data/dto/t0", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class NameSuggestion extends com.truecaller.surveys.data.dto.SurveyFlowDto.Block {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.t0 Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ NameSuggestion(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.s0.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameSuggestion copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameSuggestion nameSuggestion, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = nameSuggestion.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = nameSuggestion.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = nameSuggestion.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = nameSuggestion.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = nameSuggestion.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return nameSuggestion.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameSuggestion self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameSuggestion copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameSuggestion(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameSuggestion)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameSuggestion nameSuggestion = (com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameSuggestion) other;
                return this.showIfPickedUp == nameSuggestion.showIfPickedUp && this.showIfMissed == nameSuggestion.showIfMissed && this.showIfOutgoing == nameSuggestion.showIfOutgoing && this.showIfInPhonebook == nameSuggestion.showIfInPhonebook && this.showIfNotInPhonebook == nameSuggestion.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("NameSuggestion(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public NameSuggestion(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$SpamCategories;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$SpamCategories;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$SpamCategories;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/u0", "com/truecaller/surveys/data/dto/v0", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class SpamCategories extends com.truecaller.surveys.data.dto.SurveyFlowDto.Block {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.v0 Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ SpamCategories(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.u0.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.Block.SpamCategories copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.SpamCategories spamCategories, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = spamCategories.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = spamCategories.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = spamCategories.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = spamCategories.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = spamCategories.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return spamCategories.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.SpamCategories self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.Block.SpamCategories copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.Block.SpamCategories(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.Block.SpamCategories)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.Block.SpamCategories spamCategories = (com.truecaller.surveys.data.dto.SurveyFlowDto.Block.SpamCategories) other;
                return this.showIfPickedUp == spamCategories.showIfPickedUp && this.showIfMissed == spamCategories.showIfMissed && this.showIfOutgoing == spamCategories.showIfOutgoing && this.showIfInPhonebook == spamCategories.showIfInPhonebook && this.showIfNotInPhonebook == spamCategories.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("SpamCategories(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public SpamCategories(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$TopComment;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$TopComment;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$Block$TopComment;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/w0", "com/truecaller/surveys/data/dto/x0", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class TopComment extends com.truecaller.surveys.data.dto.SurveyFlowDto.Block {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.x0 Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ TopComment(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.w0.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment topComment, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = topComment.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = topComment.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = topComment.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = topComment.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = topComment.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return topComment.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment topComment = (com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment) other;
                return this.showIfPickedUp == topComment.showIfPickedUp && this.showIfMissed == topComment.showIfMissed && this.showIfOutgoing == topComment.showIfOutgoing && this.showIfInPhonebook == topComment.showIfInPhonebook && this.showIfNotInPhonebook == topComment.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.Block
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("TopComment(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public TopComment(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        public /* synthetic */ Block(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlinx.serialization.KSerializer _init_$_anonymous_() {
            kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
            return new ug3.c("com.truecaller.surveys.data.dto.SurveyFlowDto.Block", l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.class), new kotlin.reflect.KClass[]{l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.Comments.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicComment.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicNameSurvey.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameQualityFeedback.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameSuggestion.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.SpamCategories.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment.class)}, new kotlinx.serialization.KSerializer[]{com.truecaller.surveys.data.dto.j0.a, com.truecaller.surveys.data.dto.m0.a, com.truecaller.surveys.data.dto.o0.a, com.truecaller.surveys.data.dto.q0.a, com.truecaller.surveys.data.dto.s0.a, com.truecaller.surveys.data.dto.u0.a, com.truecaller.surveys.data.dto.w0.a}, new java.lang.annotation.Annotation[0]);
        }

        public abstract boolean getShowIfInPhonebook();

        public abstract boolean getShowIfMissed();

        public abstract boolean getShowIfNotInPhonebook();

        public abstract boolean getShowIfOutgoing();

        public abstract boolean getShowIfPickedUp();

        private Block() {
            super(null);
        }

        public /* synthetic */ Block(int i, yg3.g1 g1Var) {
            super(i, g1Var);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001d2\u00020\u0001:\u0005\u001e\u001f !\"B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013\u0082\u0001\u0004#$%&¨\u0006'"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto;", "<init>", "()V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getShowIfPickedUp", "()Z", "showIfPickedUp", "getShowIfMissed", "showIfMissed", "getShowIfOutgoing", "showIfOutgoing", "getShowIfInPhonebook", "showIfInPhonebook", "getShowIfNotInPhonebook", "showIfNotInPhonebook", "Companion", "Generic", "NameSuggestion", "NameQualityFeedback", "PositiveResponseNameSuggestion", "com/truecaller/surveys/data/dto/y0", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$Generic;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$NameQualityFeedback;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$NameSuggestion;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$PositiveResponseNameSuggestion;", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static abstract class DetailsView extends com.truecaller.surveys.data.dto.SurveyFlowDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.y0 Companion = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.k.b, new da0.bar(23));

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$Generic;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$Generic;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$Generic;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/z0", "com/truecaller/surveys/data/dto/a1", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class Generic extends com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.a1 Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Generic(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.z0.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.Generic copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.Generic generic, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = generic.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = generic.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = generic.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = generic.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = generic.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return generic.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.Generic self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.Generic copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.Generic(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.Generic)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.Generic generic = (com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.Generic) other;
                return this.showIfPickedUp == generic.showIfPickedUp && this.showIfMissed == generic.showIfMissed && this.showIfOutgoing == generic.showIfOutgoing && this.showIfInPhonebook == generic.showIfInPhonebook && this.showIfNotInPhonebook == generic.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("Generic(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public Generic(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$NameQualityFeedback;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$NameQualityFeedback;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$NameQualityFeedback;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/b1", "com/truecaller/surveys/data/dto/c1", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class NameQualityFeedback extends com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.c1 Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ NameQualityFeedback(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.b1.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameQualityFeedback copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameQualityFeedback nameQualityFeedback, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = nameQualityFeedback.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = nameQualityFeedback.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = nameQualityFeedback.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = nameQualityFeedback.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = nameQualityFeedback.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return nameQualityFeedback.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameQualityFeedback self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameQualityFeedback copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameQualityFeedback(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameQualityFeedback)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameQualityFeedback nameQualityFeedback = (com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameQualityFeedback) other;
                return this.showIfPickedUp == nameQualityFeedback.showIfPickedUp && this.showIfMissed == nameQualityFeedback.showIfMissed && this.showIfOutgoing == nameQualityFeedback.showIfOutgoing && this.showIfInPhonebook == nameQualityFeedback.showIfInPhonebook && this.showIfNotInPhonebook == nameQualityFeedback.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("NameQualityFeedback(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public NameQualityFeedback(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$NameSuggestion;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$NameSuggestion;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$NameSuggestion;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/d1", "com/truecaller/surveys/data/dto/e1", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class NameSuggestion extends com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.e1 Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ NameSuggestion(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.d1.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameSuggestion copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameSuggestion nameSuggestion, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = nameSuggestion.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = nameSuggestion.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = nameSuggestion.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = nameSuggestion.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = nameSuggestion.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return nameSuggestion.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameSuggestion self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameSuggestion copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameSuggestion(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameSuggestion)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameSuggestion nameSuggestion = (com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameSuggestion) other;
                return this.showIfPickedUp == nameSuggestion.showIfPickedUp && this.showIfMissed == nameSuggestion.showIfMissed && this.showIfOutgoing == nameSuggestion.showIfOutgoing && this.showIfInPhonebook == nameSuggestion.showIfInPhonebook && this.showIfNotInPhonebook == nameSuggestion.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("NameSuggestion(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public NameSuggestion(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        @androidx.annotation.Keep
        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$PositiveResponseNameSuggestion;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$PositiveResponseNameSuggestion;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$DetailsView$PositiveResponseNameSuggestion;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/f1", "com/truecaller/surveys/data/dto/g1", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @ug3.d
        /* loaded from: /home/user/tc_decoded/classes7.dex */
        public static final /* data */ class PositiveResponseNameSuggestion extends com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView {
            public static final int $stable = 0;

            @org.jetbrains.annotations.NotNull
            public static final com.truecaller.surveys.data.dto.g1 Companion = new java.lang.Object();
            private final boolean showIfInPhonebook;
            private final boolean showIfMissed;
            private final boolean showIfNotInPhonebook;
            private final boolean showIfOutgoing;
            private final boolean showIfPickedUp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ PositiveResponseNameSuggestion(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
                super(i, g1Var);
                if (31 != (i & 31)) {
                    yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.f1.a.getDescriptor());
                    throw null;
                }
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }

            public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.PositiveResponseNameSuggestion copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.PositiveResponseNameSuggestion positiveResponseNameSuggestion, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = positiveResponseNameSuggestion.showIfPickedUp;
                }
                if ((i & 2) != 0) {
                    z2 = positiveResponseNameSuggestion.showIfMissed;
                }
                if ((i & 4) != 0) {
                    z3 = positiveResponseNameSuggestion.showIfOutgoing;
                }
                if ((i & 8) != 0) {
                    z4 = positiveResponseNameSuggestion.showIfInPhonebook;
                }
                if ((i & 16) != 0) {
                    z5 = positiveResponseNameSuggestion.showIfNotInPhonebook;
                }
                boolean z6 = z5;
                boolean z7 = z3;
                return positiveResponseNameSuggestion.copy(z, z2, z7, z4, z6);
            }

            public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.PositiveResponseNameSuggestion self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
                output.n(serialDesc, 0, self.getShowIfPickedUp());
                output.n(serialDesc, 1, self.getShowIfMissed());
                output.n(serialDesc, 2, self.getShowIfOutgoing());
                output.n(serialDesc, 3, self.getShowIfInPhonebook());
                output.n(serialDesc, 4, self.getShowIfNotInPhonebook());
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @org.jetbrains.annotations.NotNull
            public final com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.PositiveResponseNameSuggestion copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
                return new com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.PositiveResponseNameSuggestion(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
            }

            public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.PositiveResponseNameSuggestion)) {
                    return false;
                }
                com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.PositiveResponseNameSuggestion positiveResponseNameSuggestion = (com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.PositiveResponseNameSuggestion) other;
                return this.showIfPickedUp == positiveResponseNameSuggestion.showIfPickedUp && this.showIfMissed == positiveResponseNameSuggestion.showIfMissed && this.showIfOutgoing == positiveResponseNameSuggestion.showIfOutgoing && this.showIfInPhonebook == positiveResponseNameSuggestion.showIfInPhonebook && this.showIfNotInPhonebook == positiveResponseNameSuggestion.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfInPhonebook() {
                return this.showIfInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfMissed() {
                return this.showIfMissed;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfNotInPhonebook() {
                return this.showIfNotInPhonebook;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfOutgoing() {
                return this.showIfOutgoing;
            }

            @Override // com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView
            public boolean getShowIfPickedUp() {
                return this.showIfPickedUp;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 1237;
                if (this.showIfPickedUp) {
                    i = 1231;
                } else {
                    i = 1237;
                }
                int i6 = i * 31;
                if (this.showIfMissed) {
                    i2 = 1231;
                } else {
                    i2 = 1237;
                }
                int i7 = (i6 + i2) * 31;
                if (this.showIfOutgoing) {
                    i3 = 1231;
                } else {
                    i3 = 1237;
                }
                int i8 = (i7 + i3) * 31;
                if (this.showIfInPhonebook) {
                    i4 = 1231;
                } else {
                    i4 = 1237;
                }
                int i9 = (i8 + i4) * 31;
                if (this.showIfNotInPhonebook) {
                    i5 = 1231;
                }
                return i9 + i5;
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                boolean z = this.showIfPickedUp;
                boolean z2 = this.showIfMissed;
                boolean z3 = this.showIfOutgoing;
                boolean z4 = this.showIfInPhonebook;
                boolean z5 = this.showIfNotInPhonebook;
                java.lang.StringBuilder v = bx.e1.v("PositiveResponseNameSuggestion(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
                nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
                return h8.s0.s(v, z5, ")");
            }

            public PositiveResponseNameSuggestion(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                super(null);
                this.showIfPickedUp = z;
                this.showIfMissed = z2;
                this.showIfOutgoing = z3;
                this.showIfInPhonebook = z4;
                this.showIfNotInPhonebook = z5;
            }
        }

        public /* synthetic */ DetailsView(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlinx.serialization.KSerializer _init_$_anonymous_() {
            kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
            return new ug3.c("com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView", l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.class), new kotlin.reflect.KClass[]{l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.Generic.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameQualityFeedback.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameSuggestion.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.PositiveResponseNameSuggestion.class)}, new kotlinx.serialization.KSerializer[]{com.truecaller.surveys.data.dto.z0.a, com.truecaller.surveys.data.dto.b1.a, com.truecaller.surveys.data.dto.d1.a, com.truecaller.surveys.data.dto.f1.a}, new java.lang.annotation.Annotation[0]);
        }

        public abstract boolean getShowIfInPhonebook();

        public abstract boolean getShowIfMissed();

        public abstract boolean getShowIfNotInPhonebook();

        public abstract boolean getShowIfOutgoing();

        public abstract boolean getShowIfPickedUp();

        private DetailsView() {
            super(null);
        }

        public /* synthetic */ DetailsView(int i, yg3.g1 g1Var) {
            super(i, g1Var);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019¨\u00062"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$RatingsAndReviews;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto;", "", "showIfPickedUp", "showIfMissed", "showIfOutgoing", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZZZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZZZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$RatingsAndReviews;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$RatingsAndReviews;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfPickedUp", "getShowIfMissed", "getShowIfOutgoing", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/h1", "com/truecaller/surveys/data/dto/i1", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class RatingsAndReviews extends com.truecaller.surveys.data.dto.SurveyFlowDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.i1 Companion = new java.lang.Object();
        private final boolean showIfInPhonebook;
        private final boolean showIfMissed;
        private final boolean showIfNotInPhonebook;
        private final boolean showIfOutgoing;
        private final boolean showIfPickedUp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RatingsAndReviews(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, yg3.g1 g1Var) {
            super(i, g1Var);
            if (31 != (i & 31)) {
                yg3.w0.l(i, 31, com.truecaller.surveys.data.dto.h1.a.getDescriptor());
                throw null;
            }
            this.showIfPickedUp = z;
            this.showIfMissed = z2;
            this.showIfOutgoing = z3;
            this.showIfInPhonebook = z4;
            this.showIfNotInPhonebook = z5;
        }

        public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.RatingsAndReviews copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.RatingsAndReviews ratingsAndReviews, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = ratingsAndReviews.showIfPickedUp;
            }
            if ((i & 2) != 0) {
                z2 = ratingsAndReviews.showIfMissed;
            }
            if ((i & 4) != 0) {
                z3 = ratingsAndReviews.showIfOutgoing;
            }
            if ((i & 8) != 0) {
                z4 = ratingsAndReviews.showIfInPhonebook;
            }
            if ((i & 16) != 0) {
                z5 = ratingsAndReviews.showIfNotInPhonebook;
            }
            boolean z6 = z5;
            boolean z7 = z3;
            return ratingsAndReviews.copy(z, z2, z7, z4, z6);
        }

        public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.RatingsAndReviews self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
            output.n(serialDesc, 0, self.showIfPickedUp);
            output.n(serialDesc, 1, self.showIfMissed);
            output.n(serialDesc, 2, self.showIfOutgoing);
            output.n(serialDesc, 3, self.showIfInPhonebook);
            output.n(serialDesc, 4, self.showIfNotInPhonebook);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowIfPickedUp() {
            return this.showIfPickedUp;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowIfMissed() {
            return this.showIfMissed;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowIfOutgoing() {
            return this.showIfOutgoing;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowIfInPhonebook() {
            return this.showIfInPhonebook;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowIfNotInPhonebook() {
            return this.showIfNotInPhonebook;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.SurveyFlowDto.RatingsAndReviews copy(boolean showIfPickedUp, boolean showIfMissed, boolean showIfOutgoing, boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
            return new com.truecaller.surveys.data.dto.SurveyFlowDto.RatingsAndReviews(showIfPickedUp, showIfMissed, showIfOutgoing, showIfInPhonebook, showIfNotInPhonebook);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.RatingsAndReviews)) {
                return false;
            }
            com.truecaller.surveys.data.dto.SurveyFlowDto.RatingsAndReviews ratingsAndReviews = (com.truecaller.surveys.data.dto.SurveyFlowDto.RatingsAndReviews) other;
            return this.showIfPickedUp == ratingsAndReviews.showIfPickedUp && this.showIfMissed == ratingsAndReviews.showIfMissed && this.showIfOutgoing == ratingsAndReviews.showIfOutgoing && this.showIfInPhonebook == ratingsAndReviews.showIfInPhonebook && this.showIfNotInPhonebook == ratingsAndReviews.showIfNotInPhonebook;
        }

        public final boolean getShowIfInPhonebook() {
            return this.showIfInPhonebook;
        }

        public final boolean getShowIfMissed() {
            return this.showIfMissed;
        }

        public final boolean getShowIfNotInPhonebook() {
            return this.showIfNotInPhonebook;
        }

        public final boolean getShowIfOutgoing() {
            return this.showIfOutgoing;
        }

        public final boolean getShowIfPickedUp() {
            return this.showIfPickedUp;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 1237;
            if (this.showIfPickedUp) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i6 = i * 31;
            if (this.showIfMissed) {
                i2 = 1231;
            } else {
                i2 = 1237;
            }
            int i7 = (i6 + i2) * 31;
            if (this.showIfOutgoing) {
                i3 = 1231;
            } else {
                i3 = 1237;
            }
            int i8 = (i7 + i3) * 31;
            if (this.showIfInPhonebook) {
                i4 = 1231;
            } else {
                i4 = 1237;
            }
            int i9 = (i8 + i4) * 31;
            if (this.showIfNotInPhonebook) {
                i5 = 1231;
            }
            return i9 + i5;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            boolean z = this.showIfPickedUp;
            boolean z2 = this.showIfMissed;
            boolean z3 = this.showIfOutgoing;
            boolean z4 = this.showIfInPhonebook;
            boolean z5 = this.showIfNotInPhonebook;
            java.lang.StringBuilder v = bx.e1.v("RatingsAndReviews(showIfPickedUp=", ", showIfMissed=", ", showIfOutgoing=", z, z2);
            nc0.k1.p(v, z3, ", showIfInPhonebook=", z4, ", showIfNotInPhonebook=");
            return h8.s0.s(v, z5, ")");
        }

        public RatingsAndReviews(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            super(null);
            this.showIfPickedUp = z;
            this.showIfMissed = z2;
            this.showIfOutgoing = z3;
            this.showIfInPhonebook = z4;
            this.showIfNotInPhonebook = z5;
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Lcom/truecaller/surveys/data/dto/SurveyFlowDto$ReportProfile;", "Lcom/truecaller/surveys/data/dto/SurveyFlowDto;", "", "showIfInPhonebook", "showIfNotInPhonebook", "<init>", "(ZZ)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(IZZLyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$surveys_googlePlayRelease", "(Lcom/truecaller/surveys/data/dto/SurveyFlowDto$ReportProfile;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/truecaller/surveys/data/dto/SurveyFlowDto$ReportProfile;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowIfInPhonebook", "getShowIfNotInPhonebook", "Companion", "com/truecaller/surveys/data/dto/j1", "com/truecaller/surveys/data/dto/k1", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final /* data */ class ReportProfile extends com.truecaller.surveys.data.dto.SurveyFlowDto {
        public static final int $stable = 0;

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.surveys.data.dto.k1 Companion = new java.lang.Object();
        private final boolean showIfInPhonebook;
        private final boolean showIfNotInPhonebook;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ReportProfile(int i, boolean z, boolean z2, yg3.g1 g1Var) {
            super(i, g1Var);
            if (3 != (i & 3)) {
                yg3.w0.l(i, 3, com.truecaller.surveys.data.dto.j1.a.getDescriptor());
                throw null;
            }
            this.showIfInPhonebook = z;
            this.showIfNotInPhonebook = z2;
        }

        public static /* synthetic */ com.truecaller.surveys.data.dto.SurveyFlowDto.ReportProfile copy$default(com.truecaller.surveys.data.dto.SurveyFlowDto.ReportProfile reportProfile, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = reportProfile.showIfInPhonebook;
            }
            if ((i & 2) != 0) {
                z2 = reportProfile.showIfNotInPhonebook;
            }
            return reportProfile.copy(z, z2);
        }

        public static final /* synthetic */ void write$Self$surveys_googlePlayRelease(com.truecaller.surveys.data.dto.SurveyFlowDto.ReportProfile self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.surveys.data.dto.SurveyFlowDto.write$Self(self, output, serialDesc);
            output.n(serialDesc, 0, self.showIfInPhonebook);
            output.n(serialDesc, 1, self.showIfNotInPhonebook);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowIfInPhonebook() {
            return this.showIfInPhonebook;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowIfNotInPhonebook() {
            return this.showIfNotInPhonebook;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.surveys.data.dto.SurveyFlowDto.ReportProfile copy(boolean showIfInPhonebook, boolean showIfNotInPhonebook) {
            return new com.truecaller.surveys.data.dto.SurveyFlowDto.ReportProfile(showIfInPhonebook, showIfNotInPhonebook);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.surveys.data.dto.SurveyFlowDto.ReportProfile)) {
                return false;
            }
            com.truecaller.surveys.data.dto.SurveyFlowDto.ReportProfile reportProfile = (com.truecaller.surveys.data.dto.SurveyFlowDto.ReportProfile) other;
            return this.showIfInPhonebook == reportProfile.showIfInPhonebook && this.showIfNotInPhonebook == reportProfile.showIfNotInPhonebook;
        }

        public final boolean getShowIfInPhonebook() {
            return this.showIfInPhonebook;
        }

        public final boolean getShowIfNotInPhonebook() {
            return this.showIfNotInPhonebook;
        }

        public int hashCode() {
            int i;
            int i2 = 1237;
            if (this.showIfInPhonebook) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i3 = i * 31;
            if (this.showIfNotInPhonebook) {
                i2 = 1231;
            }
            return i3 + i2;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return ax1.bar.n("ReportProfile(showIfInPhonebook=", ", showIfNotInPhonebook=", ")", this.showIfInPhonebook, this.showIfNotInPhonebook);
        }

        public ReportProfile(boolean z, boolean z2) {
            super(null);
            this.showIfInPhonebook = z;
            this.showIfNotInPhonebook = z2;
        }
    }

    public /* synthetic */ SurveyFlowDto(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.KSerializer _init_$_anonymous_() {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        return new ug3.c("com.truecaller.surveys.data.dto.SurveyFlowDto", l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.class), new kotlin.reflect.KClass[]{l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Bizmon.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.Generic.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameQualityFeedback.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.NameSuggestion.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Acs.PositiveResponseNameSuggestion.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.Comments.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicComment.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.DynamicNameSurvey.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameQualityFeedback.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.NameSuggestion.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.SpamCategories.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.Block.TopComment.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.Generic.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameQualityFeedback.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.NameSuggestion.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.DetailsView.PositiveResponseNameSuggestion.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.RatingsAndReviews.class), l0Var.getOrCreateKotlinClass(com.truecaller.surveys.data.dto.SurveyFlowDto.ReportProfile.class)}, new kotlinx.serialization.KSerializer[]{com.truecaller.surveys.data.dto.y.a, com.truecaller.surveys.data.dto.b0.a, com.truecaller.surveys.data.dto.d0.a, com.truecaller.surveys.data.dto.f0.a, com.truecaller.surveys.data.dto.h0.a, com.truecaller.surveys.data.dto.j0.a, com.truecaller.surveys.data.dto.m0.a, com.truecaller.surveys.data.dto.o0.a, com.truecaller.surveys.data.dto.q0.a, com.truecaller.surveys.data.dto.s0.a, com.truecaller.surveys.data.dto.u0.a, com.truecaller.surveys.data.dto.w0.a, com.truecaller.surveys.data.dto.z0.a, com.truecaller.surveys.data.dto.b1.a, com.truecaller.surveys.data.dto.d1.a, com.truecaller.surveys.data.dto.f1.a, com.truecaller.surveys.data.dto.h1.a, com.truecaller.surveys.data.dto.j1.a}, new java.lang.annotation.Annotation[0]);
    }

    private SurveyFlowDto() {
    }

    public /* synthetic */ SurveyFlowDto(int i, yg3.g1 g1Var) {
    }

    public static final /* synthetic */ void write$Self(com.truecaller.surveys.data.dto.SurveyFlowDto self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
}
