package com.truecaller.blockingsurvey.impl.ui.screens.comment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/blockingsurvey/impl/ui/screens/comment/CommentPrivacy;", "", "resId", "", "<init>", "(Ljava/lang/String;II)V", "getResId", "()I", "PUBLIC", "ANONYMOUS", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CommentPrivacy {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.blockingsurvey.impl.ui.screens.comment.CommentPrivacy[] $VALUES;
    private final int resId;
    public static final com.truecaller.blockingsurvey.impl.ui.screens.comment.CommentPrivacy PUBLIC = new com.truecaller.blockingsurvey.impl.ui.screens.comment.CommentPrivacy("PUBLIC", 0, 2132019718);
    public static final com.truecaller.blockingsurvey.impl.ui.screens.comment.CommentPrivacy ANONYMOUS = new com.truecaller.blockingsurvey.impl.ui.screens.comment.CommentPrivacy("ANONYMOUS", 1, 2132019716);

    private static final /* synthetic */ com.truecaller.blockingsurvey.impl.ui.screens.comment.CommentPrivacy[] $values() {
        return new com.truecaller.blockingsurvey.impl.ui.screens.comment.CommentPrivacy[]{PUBLIC, ANONYMOUS};
    }

    static {
        com.truecaller.blockingsurvey.impl.ui.screens.comment.CommentPrivacy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CommentPrivacy(java.lang.String str, int i, int i2) {
        this.resId = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.blockingsurvey.impl.ui.screens.comment.CommentPrivacy valueOf(java.lang.String str) {
        return (com.truecaller.blockingsurvey.impl.ui.screens.comment.CommentPrivacy) java.lang.Enum.valueOf(com.truecaller.blockingsurvey.impl.ui.screens.comment.CommentPrivacy.class, str);
    }

    public static com.truecaller.blockingsurvey.impl.ui.screens.comment.CommentPrivacy[] values() {
        return (com.truecaller.blockingsurvey.impl.ui.screens.comment.CommentPrivacy[]) $VALUES.clone();
    }

    public final int getResId() {
        return this.resId;
    }
}
