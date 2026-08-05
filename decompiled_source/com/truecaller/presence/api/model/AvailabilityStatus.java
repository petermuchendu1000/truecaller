package com.truecaller.presence.api.model;

@androidx.annotation.Keep
/* loaded from: /home/user/tc_decoded/classes.dex */
public enum AvailabilityStatus {
    AVAILABLE(pk3.b.c),
    BUSY(pk3.b.d),
    UNKNOWN(pk3.b.b);


    @androidx.annotation.NonNull
    private final pk3.b mGrpcStatus;

    AvailabilityStatus(@androidx.annotation.NonNull pk3.b bVar) {
        this.mGrpcStatus = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        if (r1 != 4) goto L20;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.truecaller.presence.api.model.AvailabilityStatus fromGrpsStatus(@androidx.annotation.Nullable pk3.b bVar) {
        if (bVar != null) {
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                        }
                    } else {
                        return BUSY;
                    }
                } else {
                    return AVAILABLE;
                }
            }
            return UNKNOWN;
        }
        return UNKNOWN;
    }

    @androidx.annotation.Nullable
    @org.jetbrains.annotations.Contract("_, !null -> !null")
    public static com.truecaller.presence.api.model.AvailabilityStatus fromString(@androidx.annotation.Nullable java.lang.String str, @androidx.annotation.Nullable com.truecaller.presence.api.model.AvailabilityStatus availabilityStatus) {
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case 2050553:
                    if (str.equals("BUSY")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 433141802:
                    if (str.equals("UNKNOWN")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 2052692649:
                    if (str.equals("AVAILABLE")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return BUSY;
                case 1:
                    return UNKNOWN;
                case 2:
                    return AVAILABLE;
            }
        }
        return availabilityStatus;
    }

    @androidx.annotation.NonNull
    public pk3.b toGrpcStatus() {
        return this.mGrpcStatus;
    }
}
