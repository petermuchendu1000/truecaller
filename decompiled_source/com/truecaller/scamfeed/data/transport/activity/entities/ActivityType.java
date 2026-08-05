package com.truecaller.scamfeed.data.transport.activity.entities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/scamfeed/data/transport/activity/entities/ActivityType;", "", "", "id", "<init>", "(Ljava/lang/String;II)V", "I", "getId", "()I", "Companion", "cm2/qux", "Comment", "PostRemoved", "Unknown", "scam-feed_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ActivityType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.scamfeed.data.transport.activity.entities.ActivityType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final cm2.qux Companion;
    private final int id;
    public static final com.truecaller.scamfeed.data.transport.activity.entities.ActivityType Comment = new com.truecaller.scamfeed.data.transport.activity.entities.ActivityType("Comment", 0, 0);
    public static final com.truecaller.scamfeed.data.transport.activity.entities.ActivityType PostRemoved = new com.truecaller.scamfeed.data.transport.activity.entities.ActivityType("PostRemoved", 1, 1);
    public static final com.truecaller.scamfeed.data.transport.activity.entities.ActivityType Unknown = new com.truecaller.scamfeed.data.transport.activity.entities.ActivityType("Unknown", 2, -1);

    private static final /* synthetic */ com.truecaller.scamfeed.data.transport.activity.entities.ActivityType[] $values() {
        return new com.truecaller.scamfeed.data.transport.activity.entities.ActivityType[]{Comment, PostRemoved, Unknown};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, cm2.qux] */
    static {
        com.truecaller.scamfeed.data.transport.activity.entities.ActivityType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ActivityType(java.lang.String str, int i, int i2) {
        this.id = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.scamfeed.data.transport.activity.entities.ActivityType valueOf(java.lang.String str) {
        return (com.truecaller.scamfeed.data.transport.activity.entities.ActivityType) java.lang.Enum.valueOf(com.truecaller.scamfeed.data.transport.activity.entities.ActivityType.class, str);
    }

    public static com.truecaller.scamfeed.data.transport.activity.entities.ActivityType[] values() {
        return (com.truecaller.scamfeed.data.transport.activity.entities.ActivityType[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }
}
