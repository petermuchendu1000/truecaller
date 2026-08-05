package com.truecaller.pretext;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/pretext/Pretext;", "", "<init>", "()V", "", "text", "Lcom/truecaller/pretext/RedactConfig;", "config", "redact", "(Ljava/lang/String;Lcom/truecaller/pretext/RedactConfig;)Ljava/lang/String;", "Lcom/truecaller/pretext/CtaConfig;", "", "hasCta", "(Ljava/lang/String;Lcom/truecaller/pretext/CtaConfig;)Z", "Ljg2/qux;", "redactor", "Ljg2/qux;", "Ljg2/bar;", "ctaDetector", "Ljg2/bar;", "lib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class Pretext {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.pretext.Pretext INSTANCE = new com.truecaller.pretext.Pretext();

    @org.jetbrains.annotations.NotNull
    private static final jg2.qux redactor = new jg2.qux();

    @org.jetbrains.annotations.NotNull
    private static final jg2.bar ctaDetector = new jg2.bar();

    private Pretext() {
    }

    public static final boolean hasCta(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        return hasCta$default(str, null, 2, null);
    }

    public static /* synthetic */ boolean hasCta$default(java.lang.String str, com.truecaller.pretext.CtaConfig ctaConfig, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            ctaConfig = new com.truecaller.pretext.CtaConfig(false, false, false, null, 15, null);
        }
        return hasCta(str, ctaConfig);
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String redact(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        return redact$default(str, null, 2, null);
    }

    public static /* synthetic */ java.lang.String redact$default(java.lang.String str, com.truecaller.pretext.RedactConfig redactConfig, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            redactConfig = new com.truecaller.pretext.RedactConfig(false, false, false, false, false, false, null, 127, null);
        }
        return redact(str, redactConfig);
    }

    public static final boolean hasCta(@org.jetbrains.annotations.NotNull java.lang.String text, @org.jetbrains.annotations.NotNull com.truecaller.pretext.CtaConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        jg2.bar barVar = ctaDetector;
        barVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        try {
            if (config.getEmails() && barVar.a(text)) {
                return true;
            }
            if (config.getUrls()) {
                h82.baz bazVar = barVar.a;
                bazVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
                vf3.g gVar = new vf3.g(kotlin.text.Regex.c((kotlin.text.Regex) bazVar.d, text));
                while (gVar.hasNext()) {
                    if (bazVar.B((kotlin.text.MatchResult) gVar.next(), text)) {
                        return true;
                    }
                }
            }
            if (config.getPhoneNumbers()) {
                return barVar.b.findNumbers(text, config.getRegion()).iterator().hasNext();
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:3:0x0015, B:5:0x001b, B:9:0x0032, B:11:0x0038, B:12:0x0040, B:14:0x0046, B:15:0x004a, B:17:0x0050, B:18:0x0054, B:20:0x005a, B:25:0x0024), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:3:0x0015, B:5:0x001b, B:9:0x0032, B:11:0x0038, B:12:0x0040, B:14:0x0046, B:15:0x004a, B:17:0x0050, B:18:0x0054, B:20:0x005a, B:25:0x0024), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:3:0x0015, B:5:0x001b, B:9:0x0032, B:11:0x0038, B:12:0x0040, B:14:0x0046, B:15:0x004a, B:17:0x0050, B:18:0x0054, B:20:0x005a, B:25:0x0024), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[Catch: Exception -> 0x0060, TRY_LEAVE, TryCatch #0 {Exception -> 0x0060, blocks: (B:3:0x0015, B:5:0x001b, B:9:0x0032, B:11:0x0038, B:12:0x0040, B:14:0x0046, B:15:0x004a, B:17:0x0050, B:18:0x0054, B:20:0x005a, B:25:0x0024), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f A[RETURN] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String redact(@org.jetbrains.annotations.NotNull java.lang.String text, @org.jetbrains.annotations.NotNull com.truecaller.pretext.RedactConfig config) {
        java.lang.String D;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        jg2.qux quxVar = redactor;
        quxVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        try {
            if (!config.getUrls() && !config.getEmails()) {
                D = text;
                if (config.getPhoneNumbers()) {
                    D = quxVar.d(D, config.getRegion());
                }
                if (config.getNumbers()) {
                    D = quxVar.c(D);
                }
                if (config.getCarrierSpamPrefix()) {
                    D = quxVar.b(D);
                }
                return !config.getWhitespace() ? quxVar.a(D) : D;
            }
            D = quxVar.a.D(text, config.getUrls(), config.getEmails());
            if (config.getPhoneNumbers()) {
            }
            if (config.getNumbers()) {
            }
            if (config.getCarrierSpamPrefix()) {
            }
            if (!config.getWhitespace()) {
            }
        } catch (java.lang.Exception unused) {
            return text;
        }
    }
}
