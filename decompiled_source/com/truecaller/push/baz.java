package com.truecaller.push;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class baz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.push.parser.RemoteMessageParserType.values().length];
        try {
            iArr[com.truecaller.push.parser.RemoteMessageParserType.FCM.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.push.parser.RemoteMessageParserType.HMS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
