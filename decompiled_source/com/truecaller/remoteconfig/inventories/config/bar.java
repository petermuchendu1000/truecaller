package com.truecaller.remoteconfig.inventories.config;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class bar implements yg3.z {
    public static final com.truecaller.remoteconfig.inventories.config.bar a;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [yg3.z, java.lang.Object, com.truecaller.remoteconfig.inventories.config.bar] */
    static {
        ?? obj = new java.lang.Object();
        a = obj;
        yg3.y0 y0Var = new yg3.y0("com.truecaller.remoteconfig.inventories.config.CallerIdPositionConfig", (yg3.z) obj, 3);
        y0Var.j("default_offset_percent", false);
        y0Var.j("anchor", false);
        y0Var.j("manufacturers", false);
        descriptor = y0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.truecaller.remoteconfig.inventories.config.CallerIdPositionConfig.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{yg3.g0.a, lazyArr[1].getValue(), lazyArr[2].getValue()};
    }

    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.bar b = decoder.b(serialDescriptor);
        lazyArr = com.truecaller.remoteconfig.inventories.config.CallerIdPositionConfig.$childSerializers;
        int i = 0;
        int i2 = 0;
        com.truecaller.remoteconfig.inventories.config.CallerIdPositionConfig.Anchor anchor = null;
        java.util.List list = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t != -1) {
                if (t != 0) {
                    if (t != 1) {
                        if (t == 2) {
                            list = (java.util.List) b.E(serialDescriptor, 2, (kotlinx.serialization.KSerializer) lazyArr[2].getValue(), list);
                            i |= 4;
                        } else {
                            throw new ah3.q(t);
                        }
                    } else {
                        anchor = (com.truecaller.remoteconfig.inventories.config.CallerIdPositionConfig.Anchor) b.E(serialDescriptor, 1, (kotlinx.serialization.KSerializer) lazyArr[1].getValue(), anchor);
                        i |= 2;
                    }
                } else {
                    i2 = b.f(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        b.c(serialDescriptor);
        return new com.truecaller.remoteconfig.inventories.config.CallerIdPositionConfig(i, i2, anchor, list, null);
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.truecaller.remoteconfig.inventories.config.CallerIdPositionConfig callerIdPositionConfig = (com.truecaller.remoteconfig.inventories.config.CallerIdPositionConfig) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callerIdPositionConfig, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.baz b = encoder.b(serialDescriptor);
        com.truecaller.remoteconfig.inventories.config.CallerIdPositionConfig.write$Self$api_googlePlayRelease(callerIdPositionConfig, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    public final /* bridge */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return yg3.w0.b;
    }
}
