package com.truecaller.insights.core.llm.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0082\u0001\u0003\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/truecaller/insights/core/llm/model/UseCaseField;", "", "<init>", "()V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/truecaller/insights/core/llm/model/UseCaseField;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getColor", "()Ljava/lang/String;", "color", "getValue", "value", "Companion", "UseCaseTitle", "UseCaseSubTitle", "UseCaseStatus", "tt1/e0", "Lcom/truecaller/insights/core/llm/model/UseCaseField$UseCaseStatus;", "Lcom/truecaller/insights/core/llm/model/UseCaseField$UseCaseSubTitle;", "Lcom/truecaller/insights/core/llm/model/UseCaseField$UseCaseTitle;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ug3.d
/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class UseCaseField {

    @org.jetbrains.annotations.NotNull
    public static final tt1.e0 Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.k.b, new tt1.a(13));

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u0016¨\u0006+"}, d2 = {"Lcom/truecaller/insights/core/llm/model/UseCaseField$UseCaseStatus;", "Lcom/truecaller/insights/core/llm/model/UseCaseField;", "", "color", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$core_googlePlayRelease", "(Lcom/truecaller/insights/core/llm/model/UseCaseField$UseCaseStatus;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/truecaller/insights/core/llm/model/UseCaseField$UseCaseStatus;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColor", "getColor$annotations", "()V", "getValue", "getValue$annotations", "Companion", "com/truecaller/insights/core/llm/model/o", "com/truecaller/insights/core/llm/model/p", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class UseCaseStatus extends com.truecaller.insights.core.llm.model.UseCaseField {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.insights.core.llm.model.p Companion = new java.lang.Object();

        @org.jetbrains.annotations.Nullable
        private final java.lang.String color;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UseCaseStatus(int i, java.lang.String str, java.lang.String str2, yg3.g1 g1Var) {
            super(i, g1Var);
            if (2 != (i & 2)) {
                yg3.w0.l(i, 2, com.truecaller.insights.core.llm.model.o.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.color = null;
            } else {
                this.color = str;
            }
            this.value = str2;
        }

        public static /* synthetic */ com.truecaller.insights.core.llm.model.UseCaseField.UseCaseStatus copy$default(com.truecaller.insights.core.llm.model.UseCaseField.UseCaseStatus useCaseStatus, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = useCaseStatus.color;
            }
            if ((i & 2) != 0) {
                str2 = useCaseStatus.value;
            }
            return useCaseStatus.copy(str, str2);
        }

        public static /* synthetic */ void getColor$annotations() {
        }

        public static /* synthetic */ void getValue$annotations() {
        }

        public static final /* synthetic */ void write$Self$core_googlePlayRelease(com.truecaller.insights.core.llm.model.UseCaseField.UseCaseStatus self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.insights.core.llm.model.UseCaseField.write$Self(self, output, serialDesc);
            if (output.q(serialDesc, 0) || self.getColor() != null) {
                output.g(serialDesc, 0, yg3.l1.a, self.getColor());
            }
            output.o(serialDesc, 1, self.getValue());
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component1, reason: from getter */
        public final java.lang.String getColor() {
            return this.color;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.insights.core.llm.model.UseCaseField.UseCaseStatus copy(@org.jetbrains.annotations.Nullable java.lang.String color, @org.jetbrains.annotations.NotNull java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.truecaller.insights.core.llm.model.UseCaseField.UseCaseStatus(color, value);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.insights.core.llm.model.UseCaseField.UseCaseStatus)) {
                return false;
            }
            com.truecaller.insights.core.llm.model.UseCaseField.UseCaseStatus useCaseStatus = (com.truecaller.insights.core.llm.model.UseCaseField.UseCaseStatus) other;
            return kotlin.jvm.internal.Intrinsics.b(this.color, useCaseStatus.color) && kotlin.jvm.internal.Intrinsics.b(this.value, useCaseStatus.value);
        }

        @Override // com.truecaller.insights.core.llm.model.UseCaseField
        @org.jetbrains.annotations.Nullable
        public java.lang.String getColor() {
            return this.color;
        }

        @Override // com.truecaller.insights.core.llm.model.UseCaseField
        @org.jetbrains.annotations.NotNull
        public java.lang.String getValue() {
            return this.value;
        }

        public int hashCode() {
            java.lang.String str = this.color;
            return this.value.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return y.o.e("UseCaseStatus(color=", this.color, ", value=", this.value, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UseCaseStatus(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "value");
            this.color = str;
            this.value = str2;
        }

        public /* synthetic */ UseCaseStatus(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J2\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\u0017¨\u0006/"}, d2 = {"Lcom/truecaller/insights/core/llm/model/UseCaseField$UseCaseSubTitle;", "Lcom/truecaller/insights/core/llm/model/UseCaseField;", "", "color", "size", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$core_googlePlayRelease", "(Lcom/truecaller/insights/core/llm/model/UseCaseField$UseCaseSubTitle;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/truecaller/insights/core/llm/model/UseCaseField$UseCaseSubTitle;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColor", "getColor$annotations", "()V", "getSize", "getSize$annotations", "getValue", "getValue$annotations", "Companion", "com/truecaller/insights/core/llm/model/q", "com/truecaller/insights/core/llm/model/r", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class UseCaseSubTitle extends com.truecaller.insights.core.llm.model.UseCaseField {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.insights.core.llm.model.r Companion = new java.lang.Object();

        @org.jetbrains.annotations.Nullable
        private final java.lang.String color;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String size;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UseCaseSubTitle(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, yg3.g1 g1Var) {
            super(i, g1Var);
            if (4 != (i & 4)) {
                yg3.w0.l(i, 4, com.truecaller.insights.core.llm.model.q.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.color = null;
            } else {
                this.color = str;
            }
            if ((i & 2) == 0) {
                this.size = null;
            } else {
                this.size = str2;
            }
            this.value = str3;
        }

        public static /* synthetic */ com.truecaller.insights.core.llm.model.UseCaseField.UseCaseSubTitle copy$default(com.truecaller.insights.core.llm.model.UseCaseField.UseCaseSubTitle useCaseSubTitle, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = useCaseSubTitle.color;
            }
            if ((i & 2) != 0) {
                str2 = useCaseSubTitle.size;
            }
            if ((i & 4) != 0) {
                str3 = useCaseSubTitle.value;
            }
            return useCaseSubTitle.copy(str, str2, str3);
        }

        public static /* synthetic */ void getColor$annotations() {
        }

        public static /* synthetic */ void getSize$annotations() {
        }

        public static /* synthetic */ void getValue$annotations() {
        }

        public static final /* synthetic */ void write$Self$core_googlePlayRelease(com.truecaller.insights.core.llm.model.UseCaseField.UseCaseSubTitle self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.insights.core.llm.model.UseCaseField.write$Self(self, output, serialDesc);
            if (output.q(serialDesc, 0) || self.getColor() != null) {
                output.g(serialDesc, 0, yg3.l1.a, self.getColor());
            }
            if (output.q(serialDesc, 1) || self.size != null) {
                output.g(serialDesc, 1, yg3.l1.a, self.size);
            }
            output.o(serialDesc, 2, self.getValue());
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component1, reason: from getter */
        public final java.lang.String getColor() {
            return this.color;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSize() {
            return this.size;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component3, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.insights.core.llm.model.UseCaseField.UseCaseSubTitle copy(@org.jetbrains.annotations.Nullable java.lang.String color, @org.jetbrains.annotations.Nullable java.lang.String size, @org.jetbrains.annotations.NotNull java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.truecaller.insights.core.llm.model.UseCaseField.UseCaseSubTitle(color, size, value);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.insights.core.llm.model.UseCaseField.UseCaseSubTitle)) {
                return false;
            }
            com.truecaller.insights.core.llm.model.UseCaseField.UseCaseSubTitle useCaseSubTitle = (com.truecaller.insights.core.llm.model.UseCaseField.UseCaseSubTitle) other;
            return kotlin.jvm.internal.Intrinsics.b(this.color, useCaseSubTitle.color) && kotlin.jvm.internal.Intrinsics.b(this.size, useCaseSubTitle.size) && kotlin.jvm.internal.Intrinsics.b(this.value, useCaseSubTitle.value);
        }

        @Override // com.truecaller.insights.core.llm.model.UseCaseField
        @org.jetbrains.annotations.Nullable
        public java.lang.String getColor() {
            return this.color;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSize() {
            return this.size;
        }

        @Override // com.truecaller.insights.core.llm.model.UseCaseField
        @org.jetbrains.annotations.NotNull
        public java.lang.String getValue() {
            return this.value;
        }

        public int hashCode() {
            java.lang.String str = this.color;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.size;
            return this.value.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return bar.v(this.value, ")", ro0.f.E("UseCaseSubTitle(color=", this.color, ", size=", this.size, ", value="));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UseCaseSubTitle(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "value");
            this.color = str;
            this.size = str2;
            this.value = str3;
        }

        public /* synthetic */ UseCaseSubTitle(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J2\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\u0017¨\u0006/"}, d2 = {"Lcom/truecaller/insights/core/llm/model/UseCaseField$UseCaseTitle;", "Lcom/truecaller/insights/core/llm/model/UseCaseField;", "", "color", "size", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lyg3/g1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyg3/g1;)V", "self", "Lxg3/baz;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$core_googlePlayRelease", "(Lcom/truecaller/insights/core/llm/model/UseCaseField$UseCaseTitle;Lxg3/baz;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/truecaller/insights/core/llm/model/UseCaseField$UseCaseTitle;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColor", "getColor$annotations", "()V", "getSize", "getSize$annotations", "getValue", "getValue$annotations", "Companion", "com/truecaller/insights/core/llm/model/s", "com/truecaller/insights/core/llm/model/t", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @ug3.d
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class UseCaseTitle extends com.truecaller.insights.core.llm.model.UseCaseField {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.insights.core.llm.model.t Companion = new java.lang.Object();

        @org.jetbrains.annotations.Nullable
        private final java.lang.String color;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String size;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UseCaseTitle(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, yg3.g1 g1Var) {
            super(i, g1Var);
            if (4 != (i & 4)) {
                yg3.w0.l(i, 4, com.truecaller.insights.core.llm.model.s.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.color = null;
            } else {
                this.color = str;
            }
            if ((i & 2) == 0) {
                this.size = null;
            } else {
                this.size = str2;
            }
            this.value = str3;
        }

        public static /* synthetic */ com.truecaller.insights.core.llm.model.UseCaseField.UseCaseTitle copy$default(com.truecaller.insights.core.llm.model.UseCaseField.UseCaseTitle useCaseTitle, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = useCaseTitle.color;
            }
            if ((i & 2) != 0) {
                str2 = useCaseTitle.size;
            }
            if ((i & 4) != 0) {
                str3 = useCaseTitle.value;
            }
            return useCaseTitle.copy(str, str2, str3);
        }

        public static /* synthetic */ void getColor$annotations() {
        }

        public static /* synthetic */ void getSize$annotations() {
        }

        public static /* synthetic */ void getValue$annotations() {
        }

        public static final /* synthetic */ void write$Self$core_googlePlayRelease(com.truecaller.insights.core.llm.model.UseCaseField.UseCaseTitle self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.truecaller.insights.core.llm.model.UseCaseField.write$Self(self, output, serialDesc);
            if (output.q(serialDesc, 0) || self.getColor() != null) {
                output.g(serialDesc, 0, yg3.l1.a, self.getColor());
            }
            if (output.q(serialDesc, 1) || self.size != null) {
                output.g(serialDesc, 1, yg3.l1.a, self.size);
            }
            output.o(serialDesc, 2, self.getValue());
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component1, reason: from getter */
        public final java.lang.String getColor() {
            return this.color;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSize() {
            return this.size;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component3, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.insights.core.llm.model.UseCaseField.UseCaseTitle copy(@org.jetbrains.annotations.Nullable java.lang.String color, @org.jetbrains.annotations.Nullable java.lang.String size, @org.jetbrains.annotations.NotNull java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return new com.truecaller.insights.core.llm.model.UseCaseField.UseCaseTitle(color, size, value);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.insights.core.llm.model.UseCaseField.UseCaseTitle)) {
                return false;
            }
            com.truecaller.insights.core.llm.model.UseCaseField.UseCaseTitle useCaseTitle = (com.truecaller.insights.core.llm.model.UseCaseField.UseCaseTitle) other;
            return kotlin.jvm.internal.Intrinsics.b(this.color, useCaseTitle.color) && kotlin.jvm.internal.Intrinsics.b(this.size, useCaseTitle.size) && kotlin.jvm.internal.Intrinsics.b(this.value, useCaseTitle.value);
        }

        @Override // com.truecaller.insights.core.llm.model.UseCaseField
        @org.jetbrains.annotations.Nullable
        public java.lang.String getColor() {
            return this.color;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSize() {
            return this.size;
        }

        @Override // com.truecaller.insights.core.llm.model.UseCaseField
        @org.jetbrains.annotations.NotNull
        public java.lang.String getValue() {
            return this.value;
        }

        public int hashCode() {
            java.lang.String str = this.color;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.size;
            return this.value.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return bar.v(this.value, ")", ro0.f.E("UseCaseTitle(color=", this.color, ", size=", this.size, ", value="));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UseCaseTitle(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "value");
            this.color = str;
            this.size = str2;
            this.value = str3;
        }

        public /* synthetic */ UseCaseTitle(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3);
        }
    }

    public /* synthetic */ UseCaseField(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.KSerializer _init_$_anonymous_() {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        return new ug3.c("com.truecaller.insights.core.llm.model.UseCaseField", l0Var.getOrCreateKotlinClass(com.truecaller.insights.core.llm.model.UseCaseField.class), new kotlin.reflect.KClass[]{l0Var.getOrCreateKotlinClass(com.truecaller.insights.core.llm.model.UseCaseField.UseCaseStatus.class), l0Var.getOrCreateKotlinClass(com.truecaller.insights.core.llm.model.UseCaseField.UseCaseSubTitle.class), l0Var.getOrCreateKotlinClass(com.truecaller.insights.core.llm.model.UseCaseField.UseCaseTitle.class)}, new kotlinx.serialization.KSerializer[]{com.truecaller.insights.core.llm.model.o.a, com.truecaller.insights.core.llm.model.q.a, com.truecaller.insights.core.llm.model.s.a}, new java.lang.annotation.Annotation[0]);
    }

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getColor();

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getValue();

    private UseCaseField() {
    }

    public /* synthetic */ UseCaseField(int i, yg3.g1 g1Var) {
    }

    public static final /* synthetic */ void write$Self(com.truecaller.insights.core.llm.model.UseCaseField self, xg3.baz output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
}
