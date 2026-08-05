package com.truecaller.messaging.mediaviewer;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/messaging/mediaviewer/MediaViewerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "androidx/glance/appwidget/protobuf/d1", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MediaViewerActivity extends com.truecaller.messaging.mediaviewer.Hilt_MediaViewerActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.mediaviewer.Hilt_MediaViewerActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.messaging.data.types.Message message;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        android.content.res.Resources.Theme theme = getTheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        yy.qux.n(theme, true);
        super.onCreate(bundle);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
        }
        com.truecaller.messaging.data.types.BinaryEntity binaryEntity = (com.truecaller.messaging.data.types.BinaryEntity) getIntent().getParcelableExtra("entity");
        if (binaryEntity == null || (message = (com.truecaller.messaging.data.types.Message) getIntent().getParcelableExtra("message")) == null) {
            return;
        }
        com.truecaller.messaging.data.types.Conversation conversation = (com.truecaller.messaging.data.types.Conversation) getIntent().getParcelableExtra("conversation");
        boolean booleanExtra = getIntent().getBooleanExtra("is_bubble_intent", false);
        if (bundle == null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            r22.g.n.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryEntity, "entity");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            r22.g gVar = new r22.g();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("entity", binaryEntity);
            bundle2.putParcelable("message", message);
            bundle2.putParcelable("conversation", conversation);
            bundle2.putBoolean("is_bubble_intent", booleanExtra);
            gVar.setArguments(bundle2);
            j.g(android.R.id.content, gVar, (java.lang.String) null);
            j.l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(android.content.Intent intent) {
        com.truecaller.messaging.data.types.BinaryEntity binaryEntity;
        com.truecaller.messaging.data.types.Message message;
        r22.i iVar;
        androidx.fragment.app.FragmentActivity activity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        setIntent(intent);
        androidx.fragment.app.Fragment F = getSupportFragmentManager().F(android.R.id.content);
        if (F != null) {
            if (!(F instanceof r22.g)) {
                F = null;
            }
            if (F != null) {
                r22.g gVar = (r22.g) F;
                if (intent != null && (binaryEntity = (com.truecaller.messaging.data.types.BinaryEntity) intent.getParcelableExtra("entity")) != null && (message = (com.truecaller.messaging.data.types.Message) intent.getParcelableExtra("message")) != null) {
                    com.truecaller.messaging.data.types.Conversation conversation = (com.truecaller.messaging.data.types.Conversation) intent.getParcelableExtra("conversation");
                    boolean booleanExtra = intent.getBooleanExtra("is_bubble_intent", false);
                    r22.l e6 = gVar.e6();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryEntity, "entity");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                    e6.f = binaryEntity;
                    e6.g = message;
                    e6.h = conversation;
                    e6.e = booleanExtra;
                    e6.r2();
                    e6.j2();
                    r22.i iVar2 = (r22.i) ((com.truecaller.sdk.bar) e6).a;
                    if (iVar2 != null && (activity = ((r22.g) iVar2).getActivity()) != null) {
                        activity.invalidateOptionsMenu();
                    }
                    if (e6.I && (iVar = (r22.i) ((com.truecaller.sdk.bar) e6).a) != null) {
                        ((r22.g) iVar).d6().d.setPlayWhenReady(true);
                    }
                }
            }
        }
    }

    public final void onUserLeaveHint() {
        super/*androidx.activity.ComponentActivity*/.onUserLeaveHint();
        androidx.fragment.app.Fragment F = getSupportFragmentManager().F(android.R.id.content);
        if (F != null) {
            if (!(F instanceof r22.g)) {
                F = null;
            }
            if (F != null) {
                ((r22.g) F).e6().f2("homeButton");
            }
        }
    }
}
