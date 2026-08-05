package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class o extends android.widget.Filter {
    public final java.util.ArrayList a;
    public final java.util.ArrayList b;
    public final com.google.common.collect.LinkedListMultimap c = com.google.common.collect.LinkedListMultimap.create();
    public final java.util.HashMap d = new java.util.HashMap();

    public o(android.view.ViewGroup viewGroup) {
        java.lang.String text;
        this.a = new java.util.ArrayList(viewGroup.getChildCount());
        this.b = new java.util.ArrayList(viewGroup.getChildCount());
        java.lang.String str = null;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            com.google.android.material.textfield.TextInputLayout childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof com.google.android.material.textfield.TextInputLayout) {
                    text = childAt.getHint().toString();
                } else if (childAt instanceof android.widget.TextView) {
                    text = ((android.widget.TextView) childAt).getText().toString();
                } else if (childAt instanceof gi2.h) {
                    text = ((gi2.h) ((gi2.qux) childAt)).getText();
                }
                this.a.add(childAt);
                this.b.add(text);
                com.google.common.collect.LinkedListMultimap linkedListMultimap = this.c;
                java.lang.String str2 = (java.lang.String) childAt.getTag();
                if (!jj3.bar.i(str2)) {
                    if (str2.startsWith("Group")) {
                        if (!jj3.bar.i(str2) && !jj3.bar.i("Group") && str2.startsWith("Group")) {
                            str = str2.substring(5);
                        } else {
                            str = str2;
                        }
                        linkedListMultimap.put(str, childAt);
                        this.d.put(text, str);
                    } else if (str2.startsWith("Child")) {
                        if (str2.equals("Child" + str)) {
                            linkedListMultimap.put(str, childAt);
                        }
                    }
                }
            }
        }
    }

    @Override // android.widget.Filter
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.util.Map.Entry entry : this.d.entrySet()) {
            if (jj3.bar.d((java.lang.CharSequence) entry.getKey(), charSequence)) {
                linkedHashSet.addAll(this.c.get((java.lang.String) entry.getValue()));
            }
        }
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                if (jj3.bar.d((java.lang.CharSequence) arrayList.get(i), charSequence)) {
                    linkedHashSet.add((android.view.View) this.a.get(i));
                }
                i++;
            } else {
                android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
                filterResults.count = linkedHashSet.size();
                filterResults.values = linkedHashSet;
                return filterResults;
            }
        }
    }

    @Override // android.widget.Filter
    public final void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.a);
        java.util.Set set = (java.util.Set) filterResults.values;
        arrayList.removeAll(set);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).setVisibility(8);
        }
        java.util.Iterator it3 = set.iterator();
        while (it3.hasNext()) {
            ((android.view.View) it3.next()).setVisibility(0);
        }
    }
}
