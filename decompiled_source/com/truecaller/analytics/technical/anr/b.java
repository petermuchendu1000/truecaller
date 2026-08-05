package com.truecaller.analytics.technical.anr;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class b implements java.util.Iterator, of3.bar {
    public final /* synthetic */ int a;
    public final java.util.Iterator b;
    public int c;

    public b(java.util.Iterator it, int i) {
        this.a = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "iterator");
                this.b = it;
                return;
            default:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "delegate");
                this.b = it;
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.util.Iterator it;
        switch (this.a) {
            case 0:
                if (this.c < 500 && this.b.hasNext()) {
                    return true;
                }
                return false;
            case 1:
                return this.b.hasNext();
            case 2:
                break;
            default:
                if (this.c > 0 && this.b.hasNext()) {
                    return true;
                }
                return false;
        }
        while (true) {
            int i = this.c;
            it = this.b;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.util.Iterator it;
        switch (this.a) {
            case 0:
                if (this.c < 500) {
                    java.lang.Object next = this.b.next();
                    this.c++;
                    return next;
                }
                throw new java.util.NoSuchElementException("Limit of 500 reached.");
            case 1:
                int i = this.c;
                this.c = i + 1;
                if (i >= 0) {
                    return new kotlin.collections.IndexedValue(i, this.b.next());
                }
                kotlin.collections.y.p();
                throw null;
            case 2:
                break;
            default:
                int i2 = this.c;
                if (i2 != 0) {
                    this.c = i2 - 1;
                    return this.b.next();
                }
                throw new java.util.NoSuchElementException();
        }
        while (true) {
            int i3 = this.c;
            it = this.b;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(vf3.a aVar, byte b) {
        this.a = 3;
        this.c = aVar.c;
        this.b = aVar.b.iterator();
    }

    public b(vf3.a aVar) {
        this.a = 2;
        this.b = aVar.b.iterator();
        this.c = aVar.c;
    }
}
