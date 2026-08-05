package com.truecaller.messaging.conversation.atttachmentPicker;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AttachmentPicker extends android.widget.FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final kotlin.Lazy a;
    public final kotlin.Lazy b;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;
    public final kotlin.Lazy g;
    public final kotlin.Lazy h;
    public p02.b1 i;
    public p02.c3 j;
    public final int k;
    public final int l;
    public u0.a m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentPicker(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = gj.m.I(2131362639, this);
        this.b = gj.m.I(2131362645, this);
        this.c = gj.m.I(2131362651, this);
        this.d = gj.m.I(2131362657, this);
        this.e = gj.m.I(2131362680, this);
        this.f = gj.m.I(2131363519, this);
        this.g = gj.m.I(2131365731, this);
        this.h = gj.m.I(2131365808, this);
        this.k = (int) getResources().getDimension(2131165416);
        this.l = bd.bar.q(12);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        final int i = 1;
        yy.qux.F(from, true).inflate(2131560944, this);
        android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.MULTIPLY;
        int s = bi3.a.s(getContext(), 2130971039);
        android.graphics.drawable.Drawable background = getBackground();
        if (background != null) {
            android.graphics.drawable.Drawable mutate = background.mutate();
            setBackgroundDrawable(mutate);
            mutate.setTint(s);
            mutate.setTintMode(mode);
            mutate.invalidateSelf();
        }
        final int i2 = 0;
        getButtonGallery().setOnClickListener(new android.view.View.OnClickListener(this) { // from class: w02.bar
            public final /* synthetic */ com.truecaller.messaging.conversation.atttachmentPicker.AttachmentPicker b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [g.g, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                g.baz bazVar;
                int i3 = i2;
                com.truecaller.messaging.conversation.atttachmentPicker.AttachmentPicker attachmentPicker = this.b;
                switch (i3) {
                    case 0:
                        p02.b1 b1Var = attachmentPicker.i;
                        if (b1Var != null) {
                            p02.i1 i1Var = (p02.i1) b1Var;
                            p02.j1 j1Var = (p02.j1) ((com.truecaller.sdk.bar) i1Var).a;
                            if (j1Var != null) {
                                ((p02.s0) j1Var).j6();
                            }
                            p02.j1 j1Var2 = (p02.j1) ((com.truecaller.sdk.bar) i1Var).a;
                            if (j1Var2 != null) {
                                p02.s0 s0Var = (p02.s0) j1Var2;
                                ((p02.p2) s0Var.i).N0 = gj.m.E(s0Var.getView());
                                if (android.os.Build.VERSION.SDK_INT > 29) {
                                    if (((p02.i1) s0Var.j).u2()) {
                                        bazVar = s0Var.s1;
                                    } else {
                                        bazVar = s0Var.r1;
                                    }
                                    h.qux quxVar = h.qux.a;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "mediaType");
                                    ?? obj = new java.lang.Object();
                                    ((g.g) obj).a = quxVar;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "<set-?>");
                                    ((g.g) obj).a = quxVar;
                                    bazVar.a((java.lang.Object) obj, (ea.c) null);
                                } else {
                                    android.content.Intent intent = new android.content.Intent("android.intent.action.GET_CONTENT");
                                    intent.setType("*/*");
                                    intent.putExtra("android.intent.extra.MIME_TYPES", new java.lang.String[]{"image/*", "video/*"});
                                    if (((p02.i1) s0Var.j).u2()) {
                                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                    }
                                    s0Var.t1.a(intent, (ea.c) null);
                                }
                            }
                            i1Var.I.a("gallery");
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("fileCallback");
                        throw null;
                    case 1:
                        p02.b1 b1Var2 = attachmentPicker.i;
                        if (b1Var2 != null) {
                            p02.i1 i1Var2 = (p02.i1) b1Var2;
                            p02.j1 j1Var3 = (p02.j1) ((com.truecaller.sdk.bar) i1Var2).a;
                            if (j1Var3 != null) {
                                ((p02.s0) j1Var3).j6();
                            }
                            p02.j1 j1Var4 = (p02.j1) ((com.truecaller.sdk.bar) i1Var2).a;
                            if (j1Var4 != null) {
                                java.lang.String[] strArr = (java.lang.String[]) new kotlin.text.Regex("\\|").h(0, ((xz1.r) i1Var2.p).H("fileMimeTypes", "application/vnd.ms-powerpoint|application/vnd.openxmlformats-officedocument.presentationml.presentation|application/vnd.ms-excel|application/vnd.openxmlformats-officedocument.spreadsheetml.sheet|application/msword|application/vnd.openxmlformats-officedocument.wordprocessingml.document|application/pdf|text/plain")).toArray(new java.lang.String[0]);
                                p02.s0 s0Var2 = (p02.s0) j1Var4;
                                ((p02.p2) s0Var2.i).N0 = gj.m.E(s0Var2.getView());
                                s0Var2.u1.a(strArr, (ea.c) null);
                            }
                            i1Var2.I.a("file");
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("fileCallback");
                        throw null;
                    case 2:
                        p02.c3 c3Var = attachmentPicker.j;
                        if (c3Var != null) {
                            c3Var.c2(true);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("cameraCallback");
                            throw null;
                        }
                    case 3:
                        p02.b1 b1Var3 = attachmentPicker.i;
                        if (b1Var3 != null) {
                            p02.i1 i1Var3 = (p02.i1) b1Var3;
                            p02.j1 j1Var5 = (p02.j1) ((com.truecaller.sdk.bar) i1Var3).a;
                            if (j1Var5 != null) {
                                p02.s0 s0Var3 = (p02.s0) j1Var5;
                                s0Var3.j6();
                                if (new android.content.Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/phone_v2").resolveActivity(s0Var3.requireContext().getPackageManager()) != null) {
                                    ((p02.p2) s0Var3.i).N0 = gj.m.E(s0Var3.getView());
                                    android.content.Intent intent2 = new android.content.Intent("android.intent.action.PICK");
                                    intent2.setType("vnd.android.cursor.dir/phone_v2");
                                    s0Var3.startActivityForResult(intent2, 201);
                                    i1Var3.I.a("contact");
                                    return;
                                }
                                s0Var3.l(2132017819);
                                return;
                            }
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("fileCallback");
                        throw null;
                    default:
                        p02.c3 c3Var2 = attachmentPicker.j;
                        if (c3Var2 != null) {
                            c3Var2.c2(false);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("cameraCallback");
                            throw null;
                        }
                }
            }
        });
        getButtonDocument().setOnClickListener(new android.view.View.OnClickListener(this) { // from class: w02.bar
            public final /* synthetic */ com.truecaller.messaging.conversation.atttachmentPicker.AttachmentPicker b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [g.g, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                g.baz bazVar;
                int i3 = i;
                com.truecaller.messaging.conversation.atttachmentPicker.AttachmentPicker attachmentPicker = this.b;
                switch (i3) {
                    case 0:
                        p02.b1 b1Var = attachmentPicker.i;
                        if (b1Var != null) {
                            p02.i1 i1Var = (p02.i1) b1Var;
                            p02.j1 j1Var = (p02.j1) ((com.truecaller.sdk.bar) i1Var).a;
                            if (j1Var != null) {
                                ((p02.s0) j1Var).j6();
                            }
                            p02.j1 j1Var2 = (p02.j1) ((com.truecaller.sdk.bar) i1Var).a;
                            if (j1Var2 != null) {
                                p02.s0 s0Var = (p02.s0) j1Var2;
                                ((p02.p2) s0Var.i).N0 = gj.m.E(s0Var.getView());
                                if (android.os.Build.VERSION.SDK_INT > 29) {
                                    if (((p02.i1) s0Var.j).u2()) {
                                        bazVar = s0Var.s1;
                                    } else {
                                        bazVar = s0Var.r1;
                                    }
                                    h.qux quxVar = h.qux.a;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "mediaType");
                                    ?? obj = new java.lang.Object();
                                    ((g.g) obj).a = quxVar;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "<set-?>");
                                    ((g.g) obj).a = quxVar;
                                    bazVar.a((java.lang.Object) obj, (ea.c) null);
                                } else {
                                    android.content.Intent intent = new android.content.Intent("android.intent.action.GET_CONTENT");
                                    intent.setType("*/*");
                                    intent.putExtra("android.intent.extra.MIME_TYPES", new java.lang.String[]{"image/*", "video/*"});
                                    if (((p02.i1) s0Var.j).u2()) {
                                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                    }
                                    s0Var.t1.a(intent, (ea.c) null);
                                }
                            }
                            i1Var.I.a("gallery");
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("fileCallback");
                        throw null;
                    case 1:
                        p02.b1 b1Var2 = attachmentPicker.i;
                        if (b1Var2 != null) {
                            p02.i1 i1Var2 = (p02.i1) b1Var2;
                            p02.j1 j1Var3 = (p02.j1) ((com.truecaller.sdk.bar) i1Var2).a;
                            if (j1Var3 != null) {
                                ((p02.s0) j1Var3).j6();
                            }
                            p02.j1 j1Var4 = (p02.j1) ((com.truecaller.sdk.bar) i1Var2).a;
                            if (j1Var4 != null) {
                                java.lang.String[] strArr = (java.lang.String[]) new kotlin.text.Regex("\\|").h(0, ((xz1.r) i1Var2.p).H("fileMimeTypes", "application/vnd.ms-powerpoint|application/vnd.openxmlformats-officedocument.presentationml.presentation|application/vnd.ms-excel|application/vnd.openxmlformats-officedocument.spreadsheetml.sheet|application/msword|application/vnd.openxmlformats-officedocument.wordprocessingml.document|application/pdf|text/plain")).toArray(new java.lang.String[0]);
                                p02.s0 s0Var2 = (p02.s0) j1Var4;
                                ((p02.p2) s0Var2.i).N0 = gj.m.E(s0Var2.getView());
                                s0Var2.u1.a(strArr, (ea.c) null);
                            }
                            i1Var2.I.a("file");
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("fileCallback");
                        throw null;
                    case 2:
                        p02.c3 c3Var = attachmentPicker.j;
                        if (c3Var != null) {
                            c3Var.c2(true);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("cameraCallback");
                            throw null;
                        }
                    case 3:
                        p02.b1 b1Var3 = attachmentPicker.i;
                        if (b1Var3 != null) {
                            p02.i1 i1Var3 = (p02.i1) b1Var3;
                            p02.j1 j1Var5 = (p02.j1) ((com.truecaller.sdk.bar) i1Var3).a;
                            if (j1Var5 != null) {
                                p02.s0 s0Var3 = (p02.s0) j1Var5;
                                s0Var3.j6();
                                if (new android.content.Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/phone_v2").resolveActivity(s0Var3.requireContext().getPackageManager()) != null) {
                                    ((p02.p2) s0Var3.i).N0 = gj.m.E(s0Var3.getView());
                                    android.content.Intent intent2 = new android.content.Intent("android.intent.action.PICK");
                                    intent2.setType("vnd.android.cursor.dir/phone_v2");
                                    s0Var3.startActivityForResult(intent2, 201);
                                    i1Var3.I.a("contact");
                                    return;
                                }
                                s0Var3.l(2132017819);
                                return;
                            }
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("fileCallback");
                        throw null;
                    default:
                        p02.c3 c3Var2 = attachmentPicker.j;
                        if (c3Var2 != null) {
                            c3Var2.c2(false);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("cameraCallback");
                            throw null;
                        }
                }
            }
        });
        final int i3 = 2;
        getButtonVideo().setOnClickListener(new android.view.View.OnClickListener(this) { // from class: w02.bar
            public final /* synthetic */ com.truecaller.messaging.conversation.atttachmentPicker.AttachmentPicker b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [g.g, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                g.baz bazVar;
                int i33 = i3;
                com.truecaller.messaging.conversation.atttachmentPicker.AttachmentPicker attachmentPicker = this.b;
                switch (i33) {
                    case 0:
                        p02.b1 b1Var = attachmentPicker.i;
                        if (b1Var != null) {
                            p02.i1 i1Var = (p02.i1) b1Var;
                            p02.j1 j1Var = (p02.j1) ((com.truecaller.sdk.bar) i1Var).a;
                            if (j1Var != null) {
                                ((p02.s0) j1Var).j6();
                            }
                            p02.j1 j1Var2 = (p02.j1) ((com.truecaller.sdk.bar) i1Var).a;
                            if (j1Var2 != null) {
                                p02.s0 s0Var = (p02.s0) j1Var2;
                                ((p02.p2) s0Var.i).N0 = gj.m.E(s0Var.getView());
                                if (android.os.Build.VERSION.SDK_INT > 29) {
                                    if (((p02.i1) s0Var.j).u2()) {
                                        bazVar = s0Var.s1;
                                    } else {
                                        bazVar = s0Var.r1;
                                    }
                                    h.qux quxVar = h.qux.a;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "mediaType");
                                    ?? obj = new java.lang.Object();
                                    ((g.g) obj).a = quxVar;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "<set-?>");
                                    ((g.g) obj).a = quxVar;
                                    bazVar.a((java.lang.Object) obj, (ea.c) null);
                                } else {
                                    android.content.Intent intent = new android.content.Intent("android.intent.action.GET_CONTENT");
                                    intent.setType("*/*");
                                    intent.putExtra("android.intent.extra.MIME_TYPES", new java.lang.String[]{"image/*", "video/*"});
                                    if (((p02.i1) s0Var.j).u2()) {
                                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                    }
                                    s0Var.t1.a(intent, (ea.c) null);
                                }
                            }
                            i1Var.I.a("gallery");
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("fileCallback");
                        throw null;
                    case 1:
                        p02.b1 b1Var2 = attachmentPicker.i;
                        if (b1Var2 != null) {
                            p02.i1 i1Var2 = (p02.i1) b1Var2;
                            p02.j1 j1Var3 = (p02.j1) ((com.truecaller.sdk.bar) i1Var2).a;
                            if (j1Var3 != null) {
                                ((p02.s0) j1Var3).j6();
                            }
                            p02.j1 j1Var4 = (p02.j1) ((com.truecaller.sdk.bar) i1Var2).a;
                            if (j1Var4 != null) {
                                java.lang.String[] strArr = (java.lang.String[]) new kotlin.text.Regex("\\|").h(0, ((xz1.r) i1Var2.p).H("fileMimeTypes", "application/vnd.ms-powerpoint|application/vnd.openxmlformats-officedocument.presentationml.presentation|application/vnd.ms-excel|application/vnd.openxmlformats-officedocument.spreadsheetml.sheet|application/msword|application/vnd.openxmlformats-officedocument.wordprocessingml.document|application/pdf|text/plain")).toArray(new java.lang.String[0]);
                                p02.s0 s0Var2 = (p02.s0) j1Var4;
                                ((p02.p2) s0Var2.i).N0 = gj.m.E(s0Var2.getView());
                                s0Var2.u1.a(strArr, (ea.c) null);
                            }
                            i1Var2.I.a("file");
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("fileCallback");
                        throw null;
                    case 2:
                        p02.c3 c3Var = attachmentPicker.j;
                        if (c3Var != null) {
                            c3Var.c2(true);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("cameraCallback");
                            throw null;
                        }
                    case 3:
                        p02.b1 b1Var3 = attachmentPicker.i;
                        if (b1Var3 != null) {
                            p02.i1 i1Var3 = (p02.i1) b1Var3;
                            p02.j1 j1Var5 = (p02.j1) ((com.truecaller.sdk.bar) i1Var3).a;
                            if (j1Var5 != null) {
                                p02.s0 s0Var3 = (p02.s0) j1Var5;
                                s0Var3.j6();
                                if (new android.content.Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/phone_v2").resolveActivity(s0Var3.requireContext().getPackageManager()) != null) {
                                    ((p02.p2) s0Var3.i).N0 = gj.m.E(s0Var3.getView());
                                    android.content.Intent intent2 = new android.content.Intent("android.intent.action.PICK");
                                    intent2.setType("vnd.android.cursor.dir/phone_v2");
                                    s0Var3.startActivityForResult(intent2, 201);
                                    i1Var3.I.a("contact");
                                    return;
                                }
                                s0Var3.l(2132017819);
                                return;
                            }
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("fileCallback");
                        throw null;
                    default:
                        p02.c3 c3Var2 = attachmentPicker.j;
                        if (c3Var2 != null) {
                            c3Var2.c2(false);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("cameraCallback");
                            throw null;
                        }
                }
            }
        });
        final int i4 = 3;
        getButtonContact().setOnClickListener(new android.view.View.OnClickListener(this) { // from class: w02.bar
            public final /* synthetic */ com.truecaller.messaging.conversation.atttachmentPicker.AttachmentPicker b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [g.g, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                g.baz bazVar;
                int i33 = i4;
                com.truecaller.messaging.conversation.atttachmentPicker.AttachmentPicker attachmentPicker = this.b;
                switch (i33) {
                    case 0:
                        p02.b1 b1Var = attachmentPicker.i;
                        if (b1Var != null) {
                            p02.i1 i1Var = (p02.i1) b1Var;
                            p02.j1 j1Var = (p02.j1) ((com.truecaller.sdk.bar) i1Var).a;
                            if (j1Var != null) {
                                ((p02.s0) j1Var).j6();
                            }
                            p02.j1 j1Var2 = (p02.j1) ((com.truecaller.sdk.bar) i1Var).a;
                            if (j1Var2 != null) {
                                p02.s0 s0Var = (p02.s0) j1Var2;
                                ((p02.p2) s0Var.i).N0 = gj.m.E(s0Var.getView());
                                if (android.os.Build.VERSION.SDK_INT > 29) {
                                    if (((p02.i1) s0Var.j).u2()) {
                                        bazVar = s0Var.s1;
                                    } else {
                                        bazVar = s0Var.r1;
                                    }
                                    h.qux quxVar = h.qux.a;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "mediaType");
                                    ?? obj = new java.lang.Object();
                                    ((g.g) obj).a = quxVar;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "<set-?>");
                                    ((g.g) obj).a = quxVar;
                                    bazVar.a((java.lang.Object) obj, (ea.c) null);
                                } else {
                                    android.content.Intent intent = new android.content.Intent("android.intent.action.GET_CONTENT");
                                    intent.setType("*/*");
                                    intent.putExtra("android.intent.extra.MIME_TYPES", new java.lang.String[]{"image/*", "video/*"});
                                    if (((p02.i1) s0Var.j).u2()) {
                                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                    }
                                    s0Var.t1.a(intent, (ea.c) null);
                                }
                            }
                            i1Var.I.a("gallery");
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("fileCallback");
                        throw null;
                    case 1:
                        p02.b1 b1Var2 = attachmentPicker.i;
                        if (b1Var2 != null) {
                            p02.i1 i1Var2 = (p02.i1) b1Var2;
                            p02.j1 j1Var3 = (p02.j1) ((com.truecaller.sdk.bar) i1Var2).a;
                            if (j1Var3 != null) {
                                ((p02.s0) j1Var3).j6();
                            }
                            p02.j1 j1Var4 = (p02.j1) ((com.truecaller.sdk.bar) i1Var2).a;
                            if (j1Var4 != null) {
                                java.lang.String[] strArr = (java.lang.String[]) new kotlin.text.Regex("\\|").h(0, ((xz1.r) i1Var2.p).H("fileMimeTypes", "application/vnd.ms-powerpoint|application/vnd.openxmlformats-officedocument.presentationml.presentation|application/vnd.ms-excel|application/vnd.openxmlformats-officedocument.spreadsheetml.sheet|application/msword|application/vnd.openxmlformats-officedocument.wordprocessingml.document|application/pdf|text/plain")).toArray(new java.lang.String[0]);
                                p02.s0 s0Var2 = (p02.s0) j1Var4;
                                ((p02.p2) s0Var2.i).N0 = gj.m.E(s0Var2.getView());
                                s0Var2.u1.a(strArr, (ea.c) null);
                            }
                            i1Var2.I.a("file");
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("fileCallback");
                        throw null;
                    case 2:
                        p02.c3 c3Var = attachmentPicker.j;
                        if (c3Var != null) {
                            c3Var.c2(true);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("cameraCallback");
                            throw null;
                        }
                    case 3:
                        p02.b1 b1Var3 = attachmentPicker.i;
                        if (b1Var3 != null) {
                            p02.i1 i1Var3 = (p02.i1) b1Var3;
                            p02.j1 j1Var5 = (p02.j1) ((com.truecaller.sdk.bar) i1Var3).a;
                            if (j1Var5 != null) {
                                p02.s0 s0Var3 = (p02.s0) j1Var5;
                                s0Var3.j6();
                                if (new android.content.Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/phone_v2").resolveActivity(s0Var3.requireContext().getPackageManager()) != null) {
                                    ((p02.p2) s0Var3.i).N0 = gj.m.E(s0Var3.getView());
                                    android.content.Intent intent2 = new android.content.Intent("android.intent.action.PICK");
                                    intent2.setType("vnd.android.cursor.dir/phone_v2");
                                    s0Var3.startActivityForResult(intent2, 201);
                                    i1Var3.I.a("contact");
                                    return;
                                }
                                s0Var3.l(2132017819);
                                return;
                            }
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("fileCallback");
                        throw null;
                    default:
                        p02.c3 c3Var2 = attachmentPicker.j;
                        if (c3Var2 != null) {
                            c3Var2.c2(false);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("cameraCallback");
                            throw null;
                        }
                }
            }
        });
        final int i5 = 4;
        getButtonCamera().setOnClickListener(new android.view.View.OnClickListener(this) { // from class: w02.bar
            public final /* synthetic */ com.truecaller.messaging.conversation.atttachmentPicker.AttachmentPicker b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [g.g, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                g.baz bazVar;
                int i33 = i5;
                com.truecaller.messaging.conversation.atttachmentPicker.AttachmentPicker attachmentPicker = this.b;
                switch (i33) {
                    case 0:
                        p02.b1 b1Var = attachmentPicker.i;
                        if (b1Var != null) {
                            p02.i1 i1Var = (p02.i1) b1Var;
                            p02.j1 j1Var = (p02.j1) ((com.truecaller.sdk.bar) i1Var).a;
                            if (j1Var != null) {
                                ((p02.s0) j1Var).j6();
                            }
                            p02.j1 j1Var2 = (p02.j1) ((com.truecaller.sdk.bar) i1Var).a;
                            if (j1Var2 != null) {
                                p02.s0 s0Var = (p02.s0) j1Var2;
                                ((p02.p2) s0Var.i).N0 = gj.m.E(s0Var.getView());
                                if (android.os.Build.VERSION.SDK_INT > 29) {
                                    if (((p02.i1) s0Var.j).u2()) {
                                        bazVar = s0Var.s1;
                                    } else {
                                        bazVar = s0Var.r1;
                                    }
                                    h.qux quxVar = h.qux.a;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "mediaType");
                                    ?? obj = new java.lang.Object();
                                    ((g.g) obj).a = quxVar;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "<set-?>");
                                    ((g.g) obj).a = quxVar;
                                    bazVar.a((java.lang.Object) obj, (ea.c) null);
                                } else {
                                    android.content.Intent intent = new android.content.Intent("android.intent.action.GET_CONTENT");
                                    intent.setType("*/*");
                                    intent.putExtra("android.intent.extra.MIME_TYPES", new java.lang.String[]{"image/*", "video/*"});
                                    if (((p02.i1) s0Var.j).u2()) {
                                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                    }
                                    s0Var.t1.a(intent, (ea.c) null);
                                }
                            }
                            i1Var.I.a("gallery");
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("fileCallback");
                        throw null;
                    case 1:
                        p02.b1 b1Var2 = attachmentPicker.i;
                        if (b1Var2 != null) {
                            p02.i1 i1Var2 = (p02.i1) b1Var2;
                            p02.j1 j1Var3 = (p02.j1) ((com.truecaller.sdk.bar) i1Var2).a;
                            if (j1Var3 != null) {
                                ((p02.s0) j1Var3).j6();
                            }
                            p02.j1 j1Var4 = (p02.j1) ((com.truecaller.sdk.bar) i1Var2).a;
                            if (j1Var4 != null) {
                                java.lang.String[] strArr = (java.lang.String[]) new kotlin.text.Regex("\\|").h(0, ((xz1.r) i1Var2.p).H("fileMimeTypes", "application/vnd.ms-powerpoint|application/vnd.openxmlformats-officedocument.presentationml.presentation|application/vnd.ms-excel|application/vnd.openxmlformats-officedocument.spreadsheetml.sheet|application/msword|application/vnd.openxmlformats-officedocument.wordprocessingml.document|application/pdf|text/plain")).toArray(new java.lang.String[0]);
                                p02.s0 s0Var2 = (p02.s0) j1Var4;
                                ((p02.p2) s0Var2.i).N0 = gj.m.E(s0Var2.getView());
                                s0Var2.u1.a(strArr, (ea.c) null);
                            }
                            i1Var2.I.a("file");
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("fileCallback");
                        throw null;
                    case 2:
                        p02.c3 c3Var = attachmentPicker.j;
                        if (c3Var != null) {
                            c3Var.c2(true);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("cameraCallback");
                            throw null;
                        }
                    case 3:
                        p02.b1 b1Var3 = attachmentPicker.i;
                        if (b1Var3 != null) {
                            p02.i1 i1Var3 = (p02.i1) b1Var3;
                            p02.j1 j1Var5 = (p02.j1) ((com.truecaller.sdk.bar) i1Var3).a;
                            if (j1Var5 != null) {
                                p02.s0 s0Var3 = (p02.s0) j1Var5;
                                s0Var3.j6();
                                if (new android.content.Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/phone_v2").resolveActivity(s0Var3.requireContext().getPackageManager()) != null) {
                                    ((p02.p2) s0Var3.i).N0 = gj.m.E(s0Var3.getView());
                                    android.content.Intent intent2 = new android.content.Intent("android.intent.action.PICK");
                                    intent2.setType("vnd.android.cursor.dir/phone_v2");
                                    s0Var3.startActivityForResult(intent2, 201);
                                    i1Var3.I.a("contact");
                                    return;
                                }
                                s0Var3.l(2132017819);
                                return;
                            }
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("fileCallback");
                        throw null;
                    default:
                        p02.c3 c3Var2 = attachmentPicker.j;
                        if (c3Var2 != null) {
                            c3Var2.c2(false);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("cameraCallback");
                            throw null;
                        }
                }
            }
        });
    }

    private final android.view.View getButtonCamera() {
        return (android.view.View) this.a.getValue();
    }

    private final android.view.View getButtonContact() {
        return (android.view.View) this.b.getValue();
    }

    private final android.view.View getButtonDocument() {
        return (android.view.View) this.c.getValue();
    }

    private final android.view.View getButtonGallery() {
        return (android.view.View) this.d.getValue();
    }

    private final android.view.View getButtonVideo() {
        return (android.view.View) this.e.getValue();
    }

    private final android.view.View getDisableViewlayout() {
        return (android.view.View) this.f.getValue();
    }

    private final android.widget.LinearLayout getPickerButtons() {
        return (android.widget.LinearLayout) this.g.getValue();
    }

    private final androidx.camera.view.PreviewView getPreviewView() {
        return (androidx.camera.view.PreviewView) this.h.getValue();
    }

    private final int getVisibleChildrenCount() {
        int childCount = getPickerButtons().getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getPickerButtons().getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public final void a(boolean z) {
        if (z) {
            getDisableViewlayout().setVisibility(4);
        } else {
            getDisableViewlayout().setVisibility(0);
        }
    }

    public final boolean b() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        android.view.View buttonCamera = getButtonCamera();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buttonCamera, "<get-buttonCamera>(...)");
        gj.m.k0(buttonCamera, z);
        android.view.View buttonGallery = getButtonGallery();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buttonGallery, "<get-buttonGallery>(...)");
        gj.m.k0(buttonGallery, z);
        android.view.View buttonVideo = getButtonVideo();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buttonVideo, "<get-buttonVideo>(...)");
        gj.m.k0(buttonVideo, z2);
        android.view.View buttonDocument = getButtonDocument();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buttonDocument, "<get-buttonDocument>(...)");
        gj.m.k0(buttonDocument, z3);
    }

    public final void d() {
        int i;
        com.google.common.util.concurrent.ListenableFuture listenableFuture;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        if (getVisibleChildrenCount() <= 4) {
            i = 17;
        } else {
            i = 16;
        }
        layoutParams.gravity = i;
        getPickerButtons().setLayoutParams(layoutParams);
        if (getVisibleChildrenCount() == getPickerButtons().getChildCount()) {
            android.view.View buttonCamera = getButtonCamera();
            int i2 = this.k;
            int i3 = this.l;
            buttonCamera.setPaddingRelative(i2, i3, i2, i3);
            android.view.View buttonContact = getButtonContact();
            int i4 = this.k;
            int i5 = this.l;
            buttonContact.setPaddingRelative(i4, i5, i4, i5);
            android.view.View buttonGallery = getButtonGallery();
            int i6 = this.k;
            int i7 = this.l;
            buttonGallery.setPaddingRelative(i6, i7, i6, i7);
            android.view.View buttonVideo = getButtonVideo();
            int i8 = this.k;
            int i9 = this.l;
            buttonVideo.setPaddingRelative(i8, i9, i8, i9);
            android.view.View buttonDocument = getButtonDocument();
            int i10 = this.k;
            int i11 = this.l;
            buttonDocument.setPaddingRelative(i10, i11, i10, i11);
        } else {
            android.view.View buttonCamera2 = getButtonCamera();
            int i13 = this.l;
            buttonCamera2.setPaddingRelative(0, i13, 0, i13);
            android.view.View buttonContact2 = getButtonContact();
            int i14 = this.l;
            buttonContact2.setPaddingRelative(0, i14, 0, i14);
            android.view.View buttonGallery2 = getButtonGallery();
            int i15 = this.l;
            buttonGallery2.setPaddingRelative(0, i15, 0, i15);
            android.view.View buttonVideo2 = getButtonVideo();
            int i16 = this.l;
            buttonVideo2.setPaddingRelative(0, i16, 0, i16);
            android.view.View buttonDocument2 = getButtonDocument();
            int i17 = this.l;
            buttonDocument2.setPaddingRelative(0, i17, 0, i17);
        }
        gj.m.j0(this);
        p02.c3 c3Var = this.j;
        f0.j0 j0Var = null;
        if (c3Var != null) {
            if (c3Var.f.g(new java.lang.String[]{"android.permission.CAMERA"})) {
                h0.c1 c1Var = new h0.c1(h0.b1.h((h0.x0) new dj.qux(16).b));
                h0.p0.a(c1Var);
                f0.c1 c1Var2 = new f0.c1(c1Var);
                ((f0.k0) c1Var2).p = f0.k0.w;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c1Var2, "build(...)");
                u0.a aVar = u0.a.h;
                android.content.Context context = getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                context.getClass();
                u0.a aVar2 = u0.a.h;
                synchronized (aVar2.a) {
                    listenableFuture = aVar2.b;
                    if (listenableFuture == null) {
                        listenableFuture = es.baz.q(new p52.d(13, aVar2, new f0.o(context)));
                        aVar2.b = listenableFuture;
                    }
                }
                k0.baz f = k0.e.f(listenableFuture, new i.d0(new q9.x(new dc.baz(context, 4), 14), 10), ye0.k.q());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "context: Context): Liste…tExecutor()\n            )");
                f.addListener(new p0.baz(f, this, c1Var2, 20), g6.b.f(getContext()));
                androidx.camera.view.PreviewView previewView = getPreviewView();
                if (previewView != null) {
                    j0Var = previewView.getSurfaceProvider();
                }
                c1Var2.B(j0Var);
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("cameraCallback");
        throw null;
    }

    public void setContactVisible(boolean z) {
        android.view.View buttonContact = getButtonContact();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buttonContact, "<get-buttonContact>(...)");
        gj.m.k0(buttonContact, z);
    }

    public void setUiThread(@org.jetbrains.annotations.NotNull xd0.f fVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "uiThread");
    }

    public /* synthetic */ AttachmentPicker(android.content.Context context, android.util.AttributeSet attributeSet, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
