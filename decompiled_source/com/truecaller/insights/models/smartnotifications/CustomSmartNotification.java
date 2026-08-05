package com.truecaller.insights.models.smartnotifications;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/insights/models/smartnotifications/CustomSmartNotification;", "", "<init>", "()V", "meta", "Lcom/truecaller/insights/models/smartnotifications/SmartNotificationMetadata;", "getMeta", "()Lcom/truecaller/insights/models/smartnotifications/SmartNotificationMetadata;", "senderText", "", "getSenderText", "()Ljava/lang/String;", "Parser", "Llm", "Lcom/truecaller/insights/models/smartnotifications/CustomSmartNotification$Llm;", "Lcom/truecaller/insights/models/smartnotifications/CustomSmartNotification$Parser;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class CustomSmartNotification {
    public /* synthetic */ CustomSmartNotification(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @org.jetbrains.annotations.NotNull
    public abstract com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata getMeta();

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getSenderText();

    private CustomSmartNotification() {
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0010\u0010&\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u0019J\u0092\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u0019J\u0010\u0010.\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b:\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b=\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010$R\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\bB\u0010\u0019R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010'R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bF\u0010)R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\bG\u0010\u0019¨\u0006H"}, d2 = {"Lcom/truecaller/insights/models/smartnotifications/CustomSmartNotification$Parser;", "Lcom/truecaller/insights/models/smartnotifications/CustomSmartNotification;", "", "contentTitle", "contentText", "", "decorationContentTitle", "decorationContentText", "Llw1/a;", "primaryIcon", "infoRightTitle", "", "infoRightTitleColor", "Llw1/i;", "infoRightText", "senderText", "Lcom/truecaller/insights/models/smartnotifications/SmartNotificationMetadata;", "meta", "", "Llw1/h;", "contentTitleColor", "statusTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Llw1/a;Ljava/lang/String;Ljava/lang/Integer;Llw1/i;Ljava/lang/String;Lcom/truecaller/insights/models/smartnotifications/SmartNotificationMetadata;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/CharSequence;", "component4", "component5", "()Llw1/a;", "component6", "component7", "()Ljava/lang/Integer;", "component8", "()Llw1/i;", "component9", "component10", "()Lcom/truecaller/insights/models/smartnotifications/SmartNotificationMetadata;", "component11", "()Ljava/util/List;", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Llw1/a;Ljava/lang/String;Ljava/lang/Integer;Llw1/i;Ljava/lang/String;Lcom/truecaller/insights/models/smartnotifications/SmartNotificationMetadata;Ljava/util/List;Ljava/lang/String;)Lcom/truecaller/insights/models/smartnotifications/CustomSmartNotification$Parser;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContentTitle", "getContentText", "Ljava/lang/CharSequence;", "getDecorationContentTitle", "getDecorationContentText", "Llw1/a;", "getPrimaryIcon", "getInfoRightTitle", "Ljava/lang/Integer;", "getInfoRightTitleColor", "Llw1/i;", "getInfoRightText", "getSenderText", "Lcom/truecaller/insights/models/smartnotifications/SmartNotificationMetadata;", "getMeta", "Ljava/util/List;", "getContentTitleColor", "getStatusTitle", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class Parser extends com.truecaller.insights.models.smartnotifications.CustomSmartNotification {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String contentText;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String contentTitle;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<lw1.h> contentTitleColor;

        @org.jetbrains.annotations.NotNull
        private final java.lang.CharSequence decorationContentText;

        @org.jetbrains.annotations.NotNull
        private final java.lang.CharSequence decorationContentTitle;

        @org.jetbrains.annotations.Nullable
        private final lw1.i infoRightText;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String infoRightTitle;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer infoRightTitleColor;

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata meta;

        @org.jetbrains.annotations.NotNull
        private final lw1.a primaryIcon;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String senderText;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String statusTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Parser(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.CharSequence charSequence, @org.jetbrains.annotations.NotNull java.lang.CharSequence charSequence2, @org.jetbrains.annotations.NotNull lw1.a aVar, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.Nullable lw1.i iVar, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.NotNull com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata smartNotificationMetadata, @org.jetbrains.annotations.NotNull java.util.List<lw1.h> list, @org.jetbrains.annotations.NotNull java.lang.String str5) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "contentTitle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "contentText");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "decorationContentTitle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "decorationContentText");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "primaryIcon");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "infoRightTitle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "senderText");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartNotificationMetadata, "meta");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "contentTitleColor");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "statusTitle");
            this.contentTitle = str;
            this.contentText = str2;
            this.decorationContentTitle = charSequence;
            this.decorationContentText = charSequence2;
            this.primaryIcon = aVar;
            this.infoRightTitle = str3;
            this.infoRightTitleColor = num;
            this.infoRightText = iVar;
            this.senderText = str4;
            this.meta = smartNotificationMetadata;
            this.contentTitleColor = list;
            this.statusTitle = str5;
        }

        public static /* synthetic */ com.truecaller.insights.models.smartnotifications.CustomSmartNotification.Parser copy$default(com.truecaller.insights.models.smartnotifications.CustomSmartNotification.Parser parser, java.lang.String str, java.lang.String str2, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, lw1.a aVar, java.lang.String str3, java.lang.Integer num, lw1.i iVar, java.lang.String str4, com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata smartNotificationMetadata, java.util.List list, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = parser.contentTitle;
            }
            if ((i & 2) != 0) {
                str2 = parser.contentText;
            }
            if ((i & 4) != 0) {
                charSequence = parser.decorationContentTitle;
            }
            if ((i & 8) != 0) {
                charSequence2 = parser.decorationContentText;
            }
            if ((i & 16) != 0) {
                aVar = parser.primaryIcon;
            }
            if ((i & 32) != 0) {
                str3 = parser.infoRightTitle;
            }
            if ((i & 64) != 0) {
                num = parser.infoRightTitleColor;
            }
            if ((i & 128) != 0) {
                iVar = parser.infoRightText;
            }
            if ((i & 256) != 0) {
                str4 = parser.senderText;
            }
            if ((i & 512) != 0) {
                smartNotificationMetadata = parser.meta;
            }
            if ((i & 1024) != 0) {
                list = parser.contentTitleColor;
            }
            if ((i & 2048) != 0) {
                str5 = parser.statusTitle;
            }
            java.util.List list2 = list;
            java.lang.String str6 = str5;
            java.lang.String str7 = str4;
            com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata smartNotificationMetadata2 = smartNotificationMetadata;
            java.lang.Integer num2 = num;
            lw1.i iVar2 = iVar;
            lw1.a aVar2 = aVar;
            java.lang.String str8 = str3;
            return parser.copy(str, str2, charSequence, charSequence2, aVar2, str8, num2, iVar2, str7, smartNotificationMetadata2, list2, str6);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContentTitle() {
            return this.contentTitle;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component10, reason: from getter */
        public final com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata getMeta() {
            return this.meta;
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<lw1.h> component11() {
            return this.contentTitleColor;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component12, reason: from getter */
        public final java.lang.String getStatusTitle() {
            return this.statusTitle;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getContentText() {
            return this.contentText;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component3, reason: from getter */
        public final java.lang.CharSequence getDecorationContentTitle() {
            return this.decorationContentTitle;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component4, reason: from getter */
        public final java.lang.CharSequence getDecorationContentText() {
            return this.decorationContentText;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component5, reason: from getter */
        public final lw1.a getPrimaryIcon() {
            return this.primaryIcon;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component6, reason: from getter */
        public final java.lang.String getInfoRightTitle() {
            return this.infoRightTitle;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component7, reason: from getter */
        public final java.lang.Integer getInfoRightTitleColor() {
            return this.infoRightTitleColor;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component8, reason: from getter */
        public final lw1.i getInfoRightText() {
            return this.infoRightText;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component9, reason: from getter */
        public final java.lang.String getSenderText() {
            return this.senderText;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.insights.models.smartnotifications.CustomSmartNotification.Parser copy(@org.jetbrains.annotations.NotNull java.lang.String contentTitle, @org.jetbrains.annotations.NotNull java.lang.String contentText, @org.jetbrains.annotations.NotNull java.lang.CharSequence decorationContentTitle, @org.jetbrains.annotations.NotNull java.lang.CharSequence decorationContentText, @org.jetbrains.annotations.NotNull lw1.a primaryIcon, @org.jetbrains.annotations.NotNull java.lang.String infoRightTitle, @org.jetbrains.annotations.Nullable java.lang.Integer infoRightTitleColor, @org.jetbrains.annotations.Nullable lw1.i infoRightText, @org.jetbrains.annotations.NotNull java.lang.String senderText, @org.jetbrains.annotations.NotNull com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata meta, @org.jetbrains.annotations.NotNull java.util.List<lw1.h> contentTitleColor, @org.jetbrains.annotations.NotNull java.lang.String statusTitle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentTitle, "contentTitle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentText, "contentText");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decorationContentTitle, "decorationContentTitle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decorationContentText, "decorationContentText");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryIcon, "primaryIcon");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoRightTitle, "infoRightTitle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderText, "senderText");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meta, "meta");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentTitleColor, "contentTitleColor");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusTitle, "statusTitle");
            return new com.truecaller.insights.models.smartnotifications.CustomSmartNotification.Parser(contentTitle, contentText, decorationContentTitle, decorationContentText, primaryIcon, infoRightTitle, infoRightTitleColor, infoRightText, senderText, meta, contentTitleColor, statusTitle);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.insights.models.smartnotifications.CustomSmartNotification.Parser)) {
                return false;
            }
            com.truecaller.insights.models.smartnotifications.CustomSmartNotification.Parser parser = (com.truecaller.insights.models.smartnotifications.CustomSmartNotification.Parser) other;
            return kotlin.jvm.internal.Intrinsics.b(this.contentTitle, parser.contentTitle) && kotlin.jvm.internal.Intrinsics.b(this.contentText, parser.contentText) && kotlin.jvm.internal.Intrinsics.b(this.decorationContentTitle, parser.decorationContentTitle) && kotlin.jvm.internal.Intrinsics.b(this.decorationContentText, parser.decorationContentText) && kotlin.jvm.internal.Intrinsics.b(this.primaryIcon, parser.primaryIcon) && kotlin.jvm.internal.Intrinsics.b(this.infoRightTitle, parser.infoRightTitle) && kotlin.jvm.internal.Intrinsics.b(this.infoRightTitleColor, parser.infoRightTitleColor) && kotlin.jvm.internal.Intrinsics.b(this.infoRightText, parser.infoRightText) && kotlin.jvm.internal.Intrinsics.b(this.senderText, parser.senderText) && kotlin.jvm.internal.Intrinsics.b(this.meta, parser.meta) && kotlin.jvm.internal.Intrinsics.b(this.contentTitleColor, parser.contentTitleColor) && kotlin.jvm.internal.Intrinsics.b(this.statusTitle, parser.statusTitle);
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getContentText() {
            return this.contentText;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getContentTitle() {
            return this.contentTitle;
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<lw1.h> getContentTitleColor() {
            return this.contentTitleColor;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.CharSequence getDecorationContentText() {
            return this.decorationContentText;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.CharSequence getDecorationContentTitle() {
            return this.decorationContentTitle;
        }

        @org.jetbrains.annotations.Nullable
        public final lw1.i getInfoRightText() {
            return this.infoRightText;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getInfoRightTitle() {
            return this.infoRightTitle;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getInfoRightTitleColor() {
            return this.infoRightTitleColor;
        }

        @Override // com.truecaller.insights.models.smartnotifications.CustomSmartNotification
        @org.jetbrains.annotations.NotNull
        public com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata getMeta() {
            return this.meta;
        }

        @org.jetbrains.annotations.NotNull
        public final lw1.a getPrimaryIcon() {
            return this.primaryIcon;
        }

        @Override // com.truecaller.insights.models.smartnotifications.CustomSmartNotification
        @org.jetbrains.annotations.NotNull
        public java.lang.String getSenderText() {
            return this.senderText;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getStatusTitle() {
            return this.statusTitle;
        }

        public int hashCode() {
            int hashCode;
            int e = ax1.bar.e((this.primaryIcon.hashCode() + ((this.decorationContentText.hashCode() + ((this.decorationContentTitle.hashCode() + ax1.bar.e(this.contentTitle.hashCode() * 31, 31, this.contentText)) * 31)) * 31)) * 31, 31, this.infoRightTitle);
            java.lang.Integer num = this.infoRightTitleColor;
            int i = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i2 = (e + hashCode) * 31;
            lw1.i iVar = this.infoRightText;
            if (iVar != null) {
                i = iVar.hashCode();
            }
            return this.statusTitle.hashCode() + uf.qux.g((this.meta.hashCode() + ax1.bar.e((i2 + i) * 31, 31, this.senderText)) * 31, 31, this.contentTitleColor);
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            java.lang.String str = this.contentTitle;
            java.lang.String str2 = this.contentText;
            java.lang.CharSequence charSequence = this.decorationContentTitle;
            java.lang.CharSequence charSequence2 = this.decorationContentText;
            lw1.a aVar = this.primaryIcon;
            java.lang.String str3 = this.infoRightTitle;
            java.lang.Integer num = this.infoRightTitleColor;
            lw1.i iVar = this.infoRightText;
            java.lang.String str4 = this.senderText;
            com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata smartNotificationMetadata = this.meta;
            java.util.List<lw1.h> list = this.contentTitleColor;
            java.lang.String str5 = this.statusTitle;
            java.lang.StringBuilder E = ro0.f.E("Parser(contentTitle=", str, ", contentText=", str2, ", decorationContentTitle=");
            E.append((java.lang.Object) charSequence);
            E.append(", decorationContentText=");
            E.append((java.lang.Object) charSequence2);
            E.append(", primaryIcon=");
            E.append(aVar);
            E.append(", infoRightTitle=");
            E.append(str3);
            E.append(", infoRightTitleColor=");
            E.append(num);
            E.append(", infoRightText=");
            E.append(iVar);
            E.append(", senderText=");
            E.append(str4);
            E.append(", meta=");
            E.append(smartNotificationMetadata);
            E.append(", contentTitleColor=");
            E.append(list);
            E.append(", statusTitle=");
            E.append(str5);
            E.append(")");
            return E.toString();
        }

        public Parser(java.lang.String str, java.lang.String str2, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, lw1.a aVar, java.lang.String str3, java.lang.Integer num, lw1.i iVar, java.lang.String str4, com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata smartNotificationMetadata, java.util.List list, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, charSequence, charSequence2, aVar, str3, num, (i & 128) != 0 ? null : iVar, str4, smartNotificationMetadata, (i & 1024) != 0 ? kotlin.collections.h0.a : list, (i & 2048) != 0 ? "" : str5);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\u0015\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013HÆ\u0003Jª\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u000e2\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0005HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001d\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b \u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\"R\u0014\u0010\u000f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006<"}, d2 = {"Lcom/truecaller/insights/models/smartnotifications/CustomSmartNotification$Llm;", "Lcom/truecaller/insights/models/smartnotifications/CustomSmartNotification;", "title", "", "titleFontSize", "", "titleColor", "subtitle", "subtitleFontSize", "subtitleColor", "status", "statusColor", "senderId", "isAISummarySubtitleVisible", "", "senderText", "meta", "Lcom/truecaller/insights/models/smartnotifications/SmartNotificationMetadata;", "valueMap", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Lcom/truecaller/insights/models/smartnotifications/SmartNotificationMetadata;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getTitleFontSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitleColor", "getSubtitle", "getSubtitleFontSize", "getSubtitleColor", "getStatus", "getStatusColor", "getSenderId", "()Z", "getSenderText", "getMeta", "()Lcom/truecaller/insights/models/smartnotifications/SmartNotificationMetadata;", "getValueMap", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Lcom/truecaller/insights/models/smartnotifications/SmartNotificationMetadata;Ljava/util/Map;)Lcom/truecaller/insights/models/smartnotifications/CustomSmartNotification$Llm;", "equals", "other", "", "hashCode", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class Llm extends com.truecaller.insights.models.smartnotifications.CustomSmartNotification {
        private final boolean isAISummarySubtitleVisible;

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata meta;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String senderId;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String senderText;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String status;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer statusColor;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String subtitle;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer subtitleColor;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer subtitleFontSize;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String title;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer titleColor;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer titleFontSize;

        @org.jetbrains.annotations.NotNull
        private final java.util.Map<java.lang.String, java.lang.String> valueMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Llm(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.Nullable java.lang.Integer num2, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.Integer num3, @org.jetbrains.annotations.Nullable java.lang.Integer num4, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.Integer num5, @org.jetbrains.annotations.NotNull java.lang.String str4, boolean z, @org.jetbrains.annotations.NotNull java.lang.String str5, @org.jetbrains.annotations.NotNull com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata smartNotificationMetadata, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "senderId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "senderText");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartNotificationMetadata, "meta");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "valueMap");
            this.title = str;
            this.titleFontSize = num;
            this.titleColor = num2;
            this.subtitle = str2;
            this.subtitleFontSize = num3;
            this.subtitleColor = num4;
            this.status = str3;
            this.statusColor = num5;
            this.senderId = str4;
            this.isAISummarySubtitleVisible = z;
            this.senderText = str5;
            this.meta = smartNotificationMetadata;
            this.valueMap = map;
        }

        public static /* synthetic */ com.truecaller.insights.models.smartnotifications.CustomSmartNotification.Llm copy$default(com.truecaller.insights.models.smartnotifications.CustomSmartNotification.Llm llm, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, java.lang.Integer num3, java.lang.Integer num4, java.lang.String str3, java.lang.Integer num5, java.lang.String str4, boolean z, java.lang.String str5, com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata smartNotificationMetadata, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = llm.title;
            }
            return llm.copy(str, (i & 2) != 0 ? llm.titleFontSize : num, (i & 4) != 0 ? llm.titleColor : num2, (i & 8) != 0 ? llm.subtitle : str2, (i & 16) != 0 ? llm.subtitleFontSize : num3, (i & 32) != 0 ? llm.subtitleColor : num4, (i & 64) != 0 ? llm.status : str3, (i & 128) != 0 ? llm.statusColor : num5, (i & 256) != 0 ? llm.senderId : str4, (i & 512) != 0 ? llm.isAISummarySubtitleVisible : z, (i & 1024) != 0 ? llm.senderText : str5, (i & 2048) != 0 ? llm.meta : smartNotificationMetadata, (i & 4096) != 0 ? llm.valueMap : map);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsAISummarySubtitleVisible() {
            return this.isAISummarySubtitleVisible;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component11, reason: from getter */
        public final java.lang.String getSenderText() {
            return this.senderText;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component12, reason: from getter */
        public final com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata getMeta() {
            return this.meta;
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> component13() {
            return this.valueMap;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getTitleFontSize() {
            return this.titleFontSize;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getTitleColor() {
            return this.titleColor;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component4, reason: from getter */
        public final java.lang.String getSubtitle() {
            return this.subtitle;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component5, reason: from getter */
        public final java.lang.Integer getSubtitleFontSize() {
            return this.subtitleFontSize;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component6, reason: from getter */
        public final java.lang.Integer getSubtitleColor() {
            return this.subtitleColor;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component7, reason: from getter */
        public final java.lang.String getStatus() {
            return this.status;
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: component8, reason: from getter */
        public final java.lang.Integer getStatusColor() {
            return this.statusColor;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component9, reason: from getter */
        public final java.lang.String getSenderId() {
            return this.senderId;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.insights.models.smartnotifications.CustomSmartNotification.Llm copy(@org.jetbrains.annotations.NotNull java.lang.String title, @org.jetbrains.annotations.Nullable java.lang.Integer titleFontSize, @org.jetbrains.annotations.Nullable java.lang.Integer titleColor, @org.jetbrains.annotations.Nullable java.lang.String subtitle, @org.jetbrains.annotations.Nullable java.lang.Integer subtitleFontSize, @org.jetbrains.annotations.Nullable java.lang.Integer subtitleColor, @org.jetbrains.annotations.Nullable java.lang.String status, @org.jetbrains.annotations.Nullable java.lang.Integer statusColor, @org.jetbrains.annotations.NotNull java.lang.String senderId, boolean isAISummarySubtitleVisible, @org.jetbrains.annotations.NotNull java.lang.String senderText, @org.jetbrains.annotations.NotNull com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata meta, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> valueMap) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderId, "senderId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderText, "senderText");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meta, "meta");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueMap, "valueMap");
            return new com.truecaller.insights.models.smartnotifications.CustomSmartNotification.Llm(title, titleFontSize, titleColor, subtitle, subtitleFontSize, subtitleColor, status, statusColor, senderId, isAISummarySubtitleVisible, senderText, meta, valueMap);
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.insights.models.smartnotifications.CustomSmartNotification.Llm)) {
                return false;
            }
            com.truecaller.insights.models.smartnotifications.CustomSmartNotification.Llm llm = (com.truecaller.insights.models.smartnotifications.CustomSmartNotification.Llm) other;
            return kotlin.jvm.internal.Intrinsics.b(this.title, llm.title) && kotlin.jvm.internal.Intrinsics.b(this.titleFontSize, llm.titleFontSize) && kotlin.jvm.internal.Intrinsics.b(this.titleColor, llm.titleColor) && kotlin.jvm.internal.Intrinsics.b(this.subtitle, llm.subtitle) && kotlin.jvm.internal.Intrinsics.b(this.subtitleFontSize, llm.subtitleFontSize) && kotlin.jvm.internal.Intrinsics.b(this.subtitleColor, llm.subtitleColor) && kotlin.jvm.internal.Intrinsics.b(this.status, llm.status) && kotlin.jvm.internal.Intrinsics.b(this.statusColor, llm.statusColor) && kotlin.jvm.internal.Intrinsics.b(this.senderId, llm.senderId) && this.isAISummarySubtitleVisible == llm.isAISummarySubtitleVisible && kotlin.jvm.internal.Intrinsics.b(this.senderText, llm.senderText) && kotlin.jvm.internal.Intrinsics.b(this.meta, llm.meta) && kotlin.jvm.internal.Intrinsics.b(this.valueMap, llm.valueMap);
        }

        @Override // com.truecaller.insights.models.smartnotifications.CustomSmartNotification
        @org.jetbrains.annotations.NotNull
        public com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata getMeta() {
            return this.meta;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSenderId() {
            return this.senderId;
        }

        @Override // com.truecaller.insights.models.smartnotifications.CustomSmartNotification
        @org.jetbrains.annotations.NotNull
        public java.lang.String getSenderText() {
            return this.senderText;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getStatus() {
            return this.status;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getStatusColor() {
            return this.statusColor;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSubtitle() {
            return this.subtitle;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getSubtitleColor() {
            return this.subtitleColor;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getSubtitleFontSize() {
            return this.subtitleFontSize;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return this.title;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getTitleColor() {
            return this.titleColor;
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getTitleFontSize() {
            return this.titleFontSize;
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getValueMap() {
            return this.valueMap;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int i;
            int hashCode7 = this.title.hashCode() * 31;
            java.lang.Integer num = this.titleFontSize;
            int i2 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i3 = (hashCode7 + hashCode) * 31;
            java.lang.Integer num2 = this.titleColor;
            if (num2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num2.hashCode();
            }
            int i4 = (i3 + hashCode2) * 31;
            java.lang.String str = this.subtitle;
            if (str == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str.hashCode();
            }
            int i5 = (i4 + hashCode3) * 31;
            java.lang.Integer num3 = this.subtitleFontSize;
            if (num3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = num3.hashCode();
            }
            int i6 = (i5 + hashCode4) * 31;
            java.lang.Integer num4 = this.subtitleColor;
            if (num4 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = num4.hashCode();
            }
            int i7 = (i6 + hashCode5) * 31;
            java.lang.String str2 = this.status;
            if (str2 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str2.hashCode();
            }
            int i8 = (i7 + hashCode6) * 31;
            java.lang.Integer num5 = this.statusColor;
            if (num5 != null) {
                i2 = num5.hashCode();
            }
            int e = ax1.bar.e((i8 + i2) * 31, 31, this.senderId);
            if (this.isAISummarySubtitleVisible) {
                i = 1231;
            } else {
                i = 1237;
            }
            return this.valueMap.hashCode() + ((this.meta.hashCode() + ax1.bar.e((e + i) * 31, 31, this.senderText)) * 31);
        }

        public final boolean isAISummarySubtitleVisible() {
            return this.isAISummarySubtitleVisible;
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            java.lang.String str = this.title;
            java.lang.Integer num = this.titleFontSize;
            java.lang.Integer num2 = this.titleColor;
            java.lang.String str2 = this.subtitle;
            java.lang.Integer num3 = this.subtitleFontSize;
            java.lang.Integer num4 = this.subtitleColor;
            java.lang.String str3 = this.status;
            java.lang.Integer num5 = this.statusColor;
            java.lang.String str4 = this.senderId;
            boolean z = this.isAISummarySubtitleVisible;
            java.lang.String str5 = this.senderText;
            com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata smartNotificationMetadata = this.meta;
            java.util.Map<java.lang.String, java.lang.String> map = this.valueMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Llm(title=");
            sb.append(str);
            sb.append(", titleFontSize=");
            sb.append(num);
            sb.append(", titleColor=");
            bar.D(num2, ", subtitle=", str2, ", subtitleFontSize=", sb);
            k9.d.z(sb, num3, ", subtitleColor=", num4, ", status=");
            wi0.bar.x(num5, str3, ", statusColor=", ", senderId=", sb);
            com.google.android.gms.internal.ads.yj.l(str4, ", isAISummarySubtitleVisible=", ", senderText=", sb, z);
            sb.append(str5);
            sb.append(", meta=");
            sb.append(smartNotificationMetadata);
            sb.append(", valueMap=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ Llm(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, java.lang.Integer num3, java.lang.Integer num4, java.lang.String str3, java.lang.Integer num5, java.lang.String str4, boolean z, java.lang.String str5, com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata smartNotificationMetadata, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : num5, str4, (i & 512) != 0 ? true : z, str5, smartNotificationMetadata, (i & 4096) != 0 ? kotlin.collections.r0.f() : map);
        }
    }
}
