package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class v extends com.truecaller.ui.bar implements android.view.View.OnClickListener {
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d o;
    public qo1.k p;

    @Override // com.truecaller.ui.bar
    public final boolean c(int i) {
        return i == 2131367495;
    }

    public final int getItemCount() {
        int itemCount = ((androidx.recyclerview.widget.h1) this.n).getItemCount();
        if (this.p.e()) {
            if (itemCount <= 1) {
                return 0;
            }
            return itemCount + 1;
        }
        if (itemCount == 0) {
            return 0;
        }
        return itemCount + 1;
    }

    @Override // com.truecaller.ui.bar
    public final long getItemId(int i) {
        if (i == ((androidx.recyclerview.widget.h1) this.n).getItemCount()) {
            return -1L;
        }
        return super.getItemId(i);
    }

    @Override // com.truecaller.ui.bar
    public final int getItemViewType(int i) {
        if (i == ((androidx.recyclerview.widget.h1) this.n).getItemCount()) {
            return 2131367495;
        }
        return super.getItemViewType(i);
    }

    @Override // com.truecaller.ui.bar
    public final void onBindViewHolder(androidx.recyclerview.widget.k2 k2Var, int i) {
        if (k2Var.getItemViewType() == 2131367495) {
            k2Var.itemView.setOnClickListener(this);
        } else {
            ((androidx.recyclerview.widget.h1) this.n).onBindViewHolder(k2Var, i);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        this.o.onClick(view);
    }

    @Override // com.truecaller.ui.bar
    public final androidx.recyclerview.widget.k2 onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        android.view.LayoutInflater from = android.view.LayoutInflater.from(viewGroup.getContext());
        if (i == 2131367495) {
            return new androidx.recyclerview.widget.k2(from.inflate(2131560977, viewGroup, false));
        }
        return ((androidx.recyclerview.widget.h1) this.n).onCreateViewHolder(viewGroup, i);
    }

    @Override // com.truecaller.ui.bar
    public final void onBindViewHolder(androidx.recyclerview.widget.k2 k2Var, int i, java.util.List list) {
        if (k2Var.getItemViewType() == 2131367495) {
            k2Var.itemView.setOnClickListener(this);
        } else {
            super.onBindViewHolder(k2Var, i, list);
        }
    }
}
