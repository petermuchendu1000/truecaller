package com.truecaller.cloudtelephony.callrecording.ui.details;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBackFor.values().length];
        try {
            iArr[com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBackFor.RECORDING.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBackFor.SUMMARY.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBackFor.TRANSCRIPTION.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
