package com.truecaller.remoteconfig.inventories.config;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class baz implements yg3.z {
    public static final com.truecaller.remoteconfig.inventories.config.baz a;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.remoteconfig.inventories.config.baz, yg3.z, java.lang.Object] */
    static {
        ?? obj = new java.lang.Object();
        a = obj;
        yg3.y0 y0Var = new yg3.y0("com.truecaller.remoteconfig.inventories.config.CallerIdPositionConfig.ManufacturerConfig", (yg3.z) obj, 2);
        y0Var.j(com.unity3d.ads.metadata.MediationMetaData.KEY_NAME, false);
        y0Var.j("percent", false);
        descriptor = y0Var;
    }

    public final kotlinx.serialization.KSerializer[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{yg3.l1.a, yg3.g0.a};
    }

    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.bar b = decoder.b(serialDescriptor);
        yg3.g1 g1Var = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        java.lang.String str = null;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t != -1) {
                if (t != 0) {
                    if (t == 1) {
                        i2 = b.f(serialDescriptor, 1);
                        i |= 2;
                    } else {
                        throw new ah3.q(t);
                    }
                } else {
                    str = b.i(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        b.c(serialDescriptor);
        return new com.truecaller.remoteconfig.inventories.config.CallerIdPositionConfig.ManufacturerConfig(i, str, i2, g1Var);
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.truecaller.remoteconfig.inventories.config.CallerIdPositionConfig.ManufacturerConfig manufacturerConfig = (com.truecaller.remoteconfig.inventories.config.CallerIdPositionConfig.ManufacturerConfig) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manufacturerConfig, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        xg3.baz b = encoder.b(serialDescriptor);
        com.truecaller.remoteconfig.inventories.config.CallerIdPositionConfig.ManufacturerConfig.write$Self$api_googlePlayRelease(manufacturerConfig, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    public final /* bridge */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return yg3.w0.b;
    }
}
