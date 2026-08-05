package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class bar extends androidx.recyclerview.widget.h1 {
    public final /* synthetic */ int m = 1;
    public java.lang.Object n;

    public /* synthetic */ bar() {
    }

    public int a(int i) {
        return i;
    }

    public int b(int i) {
        return i;
    }

    public abstract boolean c(int i);

    public abstract void e(ey2.a aVar, int i);

    public abstract ey2.a g(android.view.ViewGroup viewGroup, int i);

    public long getItemId(int i) {
        switch (this.m) {
            case 0:
                return ((androidx.recyclerview.widget.h1) this.n).getItemId(a(i));
            default:
                return super.getItemId(i);
        }
    }

    public int getItemViewType(int i) {
        switch (this.m) {
            case 0:
                return ((androidx.recyclerview.widget.h1) this.n).getItemViewType(a(i));
            default:
                return super.getItemViewType(i);
        }
    }

    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        switch (this.m) {
            case 0:
                ((androidx.recyclerview.widget.h1) this.n).onAttachedToRecyclerView(recyclerView);
                return;
            default:
                super.onAttachedToRecyclerView(recyclerView);
                return;
        }
    }

    public void onBindViewHolder(androidx.recyclerview.widget.k2 k2Var, int i) {
        ey2.a aVar = (ey2.a) k2Var;
        aVar.b = i;
        e(aVar, i);
    }

    public androidx.recyclerview.widget.k2 onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        ey2.a g = g(viewGroup, i);
        com.truecaller.log.AssertionUtil.isTrue(!((androidx.recyclerview.widget.k2) g).itemView.hasOnClickListeners(), new java.lang.String[]{"This item view can not have an OnClickListener, it will interfere with any OnItemClickListener"});
        ((androidx.recyclerview.widget.k2) g).itemView.setOnClickListener(new ey2.bar(this, g));
        ((androidx.recyclerview.widget.k2) g).itemView.setOnLongClickListener(new ey2.baz(this, g));
        return g;
    }

    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        switch (this.m) {
            case 0:
                ((androidx.recyclerview.widget.h1) this.n).onDetachedFromRecyclerView(recyclerView);
                return;
            default:
                super.onDetachedFromRecyclerView(recyclerView);
                return;
        }
    }

    public boolean onFailedToRecycleView(androidx.recyclerview.widget.k2 k2Var) {
        switch (this.m) {
            case 0:
                if (!c(k2Var.getItemViewType()) && ((androidx.recyclerview.widget.h1) this.n).onFailedToRecycleView(k2Var)) {
                    return true;
                }
                return false;
            default:
                return super.onFailedToRecycleView(k2Var);
        }
    }

    public void onViewAttachedToWindow(androidx.recyclerview.widget.k2 k2Var) {
        switch (this.m) {
            case 0:
                if (!c(k2Var.getItemViewType())) {
                    ((androidx.recyclerview.widget.h1) this.n).onViewAttachedToWindow(k2Var);
                    return;
                }
                return;
            default:
                super.onViewAttachedToWindow(k2Var);
                return;
        }
    }

    public void onViewDetachedFromWindow(androidx.recyclerview.widget.k2 k2Var) {
        switch (this.m) {
            case 0:
                if (!c(k2Var.getItemViewType())) {
                    ((androidx.recyclerview.widget.h1) this.n).onViewDetachedFromWindow(k2Var);
                    return;
                }
                return;
            default:
                super.onViewDetachedFromWindow(k2Var);
                return;
        }
    }

    public void onViewRecycled(androidx.recyclerview.widget.k2 k2Var) {
        switch (this.m) {
            case 0:
                if (!c(k2Var.getItemViewType())) {
                    ((androidx.recyclerview.widget.h1) this.n).onViewRecycled(k2Var);
                    return;
                }
                return;
            default:
                super.onViewRecycled(k2Var);
                return;
        }
    }

    public void setHasStableIds(boolean z) {
        switch (this.m) {
            case 0:
                super.setHasStableIds(z);
                ((androidx.recyclerview.widget.h1) this.n).setHasStableIds(z);
                return;
            default:
                super.setHasStableIds(z);
                return;
        }
    }

    public bar(androidx.recyclerview.widget.h1 h1Var) {
        this.n = h1Var;
        h1Var.registerAdapterDataObserver(new androidx.recyclerview.widget.z0(this, 2));
        super.setHasStableIds(h1Var.hasStableIds());
    }

    public void onBindViewHolder(androidx.recyclerview.widget.k2 k2Var, int i, java.util.List list) {
        switch (this.m) {
            case 0:
                ((androidx.recyclerview.widget.h1) this.n).onBindViewHolder(k2Var, a(i), list);
                return;
            default:
                super.onBindViewHolder(k2Var, i, list);
                return;
        }
    }
}
