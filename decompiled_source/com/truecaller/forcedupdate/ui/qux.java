package com.truecaller.forcedupdate.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class qux extends com.truecaller.forcedupdate.ui.d {
    @Override // com.truecaller.forcedupdate.ui.d
    public final int R4() {
        return android.R.color.transparent;
    }

    @Override // com.truecaller.forcedupdate.ui.d
    public final int S4() {
        int i = com.truecaller.forcedupdate.ui.baz.a[this.h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            return 2131231959;
        }
        return 2131231962;
    }

    @Override // com.truecaller.forcedupdate.ui.d, android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (view.getId() == 2131366560) {
            getActivity().finish();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.truecaller.forcedupdate.ui.d
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return layoutInflater.inflate(2131559340, viewGroup, false);
    }

    @Override // com.truecaller.forcedupdate.ui.d
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.h == com.truecaller.forcedupdate.UpdateType.DISCONTINUED) {
            this.i.setCardBackgroundColor(getResources().getColor(2131100185));
        }
        view.findViewById(2131366560).setOnClickListener(this);
    }
}
