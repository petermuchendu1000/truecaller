package com.truecaller.filters.blockedevents;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class BlockDialogActivity extends com.truecaller.filters.blockedevents.Hilt_BlockDialogActivity {

    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public enum DialogType {
        SENDER_NAME,
        NAME,
        ADVANCED,
        NUMBER,
        COUNTRY,
        ALL,
        FAMILY_PROTECT_PHONE,
        FAMILY_PROTECT_NUMBER_SERIES,
        FAMILY_PROTECT_SENDER_ID,
        FAMILY_PROTECT_COUNTRY_CODE,
        FAMILY_PROTECT_NAME,
        FAMILY_PROTECT_ALL
    }

    public static void t0(android.content.Context context, com.truecaller.filters.blockedevents.BlockDialogActivity.DialogType dialogType) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.filters.blockedevents.BlockDialogActivity.class);
        intent.putExtra("type", dialogType);
        context.startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.filters.blockedevents.Hilt_BlockDialogActivity
    public final void onCreate(android.os.Bundle bundle) {
        androidx.fragment.app.Fragment barVar;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        setContentView(2131558446);
        ak.r0.i(findViewById(2131366178), com.truecaller.common.ui.insets.InsetType.SystemBars);
        androidx.appcompat.widget.Toolbar findViewById = findViewById(2131367108);
        findViewById.setNavigationIcon(bi3.a.x(this, 2131232077, 2130971058, android.graphics.PorterDuff.Mode.SRC_IN));
        setSupportActionBar(findViewById);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
        }
        if (bundle == null) {
            com.truecaller.filters.blockedevents.BlockDialogActivity.DialogType dialogType = (com.truecaller.filters.blockedevents.BlockDialogActivity.DialogType) getIntent().getSerializableExtra("type");
            java.util.Objects.requireNonNull(dialogType);
            switch (dialogType.ordinal()) {
                case 0:
                case 8:
                    barVar = new yo1.bar();
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putSerializable("dialog_type", dialogType);
                    barVar.setArguments(bundle2);
                    break;
                case 1:
                case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogType, "dialogType");
                    barVar = new wo1.baz();
                    barVar.setArguments(ue0.i.t(new kotlin.Pair[]{new kotlin.Pair("dialog_type", dialogType)}));
                    break;
                case 2:
                case 7:
                    barVar = new uo1.baz();
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putSerializable("dialog_type", dialogType);
                    barVar.setArguments(bundle3);
                    break;
                case 3:
                case 6:
                    barVar = new xo1.qux();
                    android.os.Bundle bundle4 = new android.os.Bundle();
                    bundle4.putSerializable("dialog_type", dialogType);
                    barVar.setArguments(bundle4);
                    break;
                case 4:
                case 9:
                    barVar = new vo1.baz();
                    barVar.setArguments(ue0.i.t(new kotlin.Pair[]{new kotlin.Pair("dialog_type", dialogType)}));
                    break;
                case 5:
                default:
                    com.truecaller.log.AssertionUtil.OnlyInDebug.fail("No dialog type specified");
                    return;
            }
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.bar barVar2 = new androidx.fragment.app.bar(supportFragmentManager);
            barVar2.g(2131364006, barVar, (java.lang.String) null);
            barVar2.l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }
}
