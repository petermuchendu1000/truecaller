package com.truecaller.presence.api.model;

@androidx.annotation.Keep
/* loaded from: /home/user/tc_decoded/classes.dex */
public enum AvailabilityContext {
    CALL(pk3.a.c),
    MEETING(pk3.a.d),
    SLEEP(pk3.a.e),
    UNKNOWN(pk3.a.b);


    @androidx.annotation.NonNull
    private final pk3.a mGrpcContext;

    AvailabilityContext(@androidx.annotation.NonNull pk3.a aVar) {
        this.mGrpcContext = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        if (r1 != 4) goto L22;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.truecaller.presence.api.model.AvailabilityContext fromGrpcContext(@androidx.annotation.Nullable pk3.a aVar) {
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            return SLEEP;
                        }
                    } else {
                        return MEETING;
                    }
                } else {
                    return CALL;
                }
            }
            return UNKNOWN;
        }
        return UNKNOWN;
    }

    @androidx.annotation.Nullable
    @org.jetbrains.annotations.Contract("_, !null -> !null")
    public static com.truecaller.presence.api.model.AvailabilityContext fromString(@androidx.annotation.Nullable java.lang.String str, @androidx.annotation.Nullable com.truecaller.presence.api.model.AvailabilityContext availabilityContext) {
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case 2060894:
                    if (str.equals("CALL")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 78984887:
                    if (str.equals("SLEEP")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 433141802:
                    if (str.equals("UNKNOWN")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1660016155:
                    if (str.equals("MEETING")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return CALL;
                case 1:
                    return SLEEP;
                case 2:
                    return UNKNOWN;
                case 3:
                    return MEETING;
            }
        }
        return availabilityContext;
    }

    @androidx.annotation.NonNull
    public pk3.a toGrpcContext() {
        return this.mGrpcContext;
    }
}
