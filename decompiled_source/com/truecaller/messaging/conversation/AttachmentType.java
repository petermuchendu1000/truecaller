package com.truecaller.messaging.conversation;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public enum AttachmentType {
    IMAGE(true, 0, 0),
    GIF(true, 0, 0),
    AUDIO(true, 2131232184, 2132017725),
    VIDEO(true, 2131232192, 2132017731),
    VCARD(true, 2131232190, 2132017726),
    PENDING_MMS(true, 2131232189, 2132017928),
    DOCUMENT(true, 2131232185, 2132017727),
    LOCATION(true, 2131232804, 2132017728),
    RCS(false, 2131232189, 2132017730),
    UNKNOWN(false, 2131232189, 2132017730);

    public final int icon;
    public final boolean supported;
    public final int title;

    AttachmentType(boolean z, int i, int i2) {
        this.supported = z;
        this.icon = i;
        this.title = i2;
    }
}
