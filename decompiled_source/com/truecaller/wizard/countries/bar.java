package com.truecaller.wizard.countries;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class bar extends androidx.recyclerview.widget.x0 {
    public final com.truecaller.wizard.countries.WizardCountryData m;
    public final o83.c n;
    public final nr0.qux o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.u, java.lang.Object] */
    public bar(com.truecaller.wizard.countries.WizardCountryData wizardCountryData, o83.c cVar, nr0.qux quxVar) {
        super((androidx.recyclerview.widget.u) new java.lang.Object());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "countryFlagDrawable");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "onCountrySelected");
        this.m = wizardCountryData;
        this.n = cVar;
        this.o = quxVar;
    }

    public final int getItemViewType(int i) {
        o83.g gVar = (o83.g) getItem(i);
        if (gVar instanceof o83.a) {
            return 0;
        }
        if (gVar instanceof o83.o) {
            return 1;
        }
        if (gVar instanceof o83.w) {
            return 2;
        }
        throw new java.lang.RuntimeException();
    }

    public final void onBindViewHolder(androidx.recyclerview.widget.k2 k2Var, int i) {
        android.graphics.drawable.Drawable drawable;
        java.lang.CharSequence charSequence;
        android.graphics.drawable.Drawable drawable2;
        o83.l lVar = (o83.l) k2Var;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "holder");
        boolean z = lVar instanceof o83.qux;
        boolean z2 = false;
        com.truecaller.wizard.countries.WizardCountryData wizardCountryData = this.m;
        if (z) {
            java.lang.Object item = getItem(i);
            kotlin.jvm.internal.Intrinsics.e(item, "null cannot be cast to non-null type com.truecaller.wizard.countries.CountryItemModel");
            com.truecaller.data.country.CountryListDto.bar barVar = ((o83.a) item).a;
            o83.qux quxVar = (o83.qux) lVar;
            if ((wizardCountryData instanceof com.truecaller.wizard.countries.WizardCountryData.Country) && kotlin.jvm.internal.Intrinsics.b(((com.truecaller.wizard.countries.WizardCountryData.Country) wizardCountryData).a, barVar.a)) {
                z2 = true;
            }
            l81.bar barVar2 = (l81.bar) this.n.invoke(barVar);
            if (barVar2 != null) {
                charSequence = barVar2.a;
            } else {
                charSequence = null;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, com.unity3d.mediation.impression.LevelPlayImpressionData.IMPRESSION_DATA_KEY_COUNTRY);
            quxVar.n().setText(t41.i.a(barVar.b + " (+" + barVar.d + ")"));
            if (charSequence != null) {
                quxVar.n().setText(((java.lang.Object) charSequence) + " " + ((java.lang.Object) quxVar.n().getText()));
            }
            com.truecaller.android.truemoji.widget.EmojiTextView n = quxVar.n();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n, "<this>");
            if (z2) {
                drawable2 = (android.graphics.drawable.Drawable) quxVar.c.getValue();
            } else {
                drawable2 = null;
            }
            ge0.i.S(n, (android.graphics.drawable.Drawable) null, drawable2, 11);
            return;
        }
        if (lVar instanceof o83.q) {
            o83.q qVar = (o83.q) lVar;
            kotlin.Lazy lazy = qVar.d;
            boolean z3 = wizardCountryData instanceof com.truecaller.wizard.countries.WizardCountryData.NoCountry;
            java.lang.Object value = lazy.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((com.truecaller.android.truemoji.widget.EmojiTextView) value).setText(((androidx.recyclerview.widget.k2) qVar).itemView.getResources().getString(2132017955));
            java.lang.Object value2 = lazy.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ge0.i.S((com.truecaller.android.truemoji.widget.EmojiTextView) value2, (android.graphics.drawable.Drawable) qVar.e.getValue(), (android.graphics.drawable.Drawable) null, 14);
            java.lang.Object value3 = lazy.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            com.truecaller.android.truemoji.widget.EmojiTextView emojiTextView = (com.truecaller.android.truemoji.widget.EmojiTextView) value3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emojiTextView, "<this>");
            if (z3) {
                drawable = (android.graphics.drawable.Drawable) qVar.c.getValue();
            } else {
                drawable = null;
            }
            ge0.i.S(emojiTextView, (android.graphics.drawable.Drawable) null, drawable, 11);
            return;
        }
        if (lVar instanceof o83.k) {
            java.lang.Object item2 = getItem(i);
            kotlin.jvm.internal.Intrinsics.e(item2, "null cannot be cast to non-null type com.truecaller.wizard.countries.SectionItemModel");
            o83.w wVar = (o83.w) item2;
            java.lang.String str = wVar.a;
            int i2 = wVar.b;
            kotlin.Lazy lazy2 = ((o83.k) lVar).d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "sectionName");
            java.lang.Object value4 = lazy2.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((android.widget.TextView) value4).setText(str);
            java.lang.Object value5 = lazy2.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            java.lang.Object value6 = lazy2.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            ((android.widget.TextView) value5).setTextSize(0, ((android.widget.TextView) value6).getResources().getDimension(i2));
            return;
        }
        throw new java.lang.RuntimeException();
    }

    public final androidx.recyclerview.widget.k2 onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(viewGroup.getContext());
        nr0.qux quxVar = this.o;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    android.view.View inflate = from.inflate(2131561158, viewGroup, false);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                    return new o83.k(inflate);
                }
                throw new java.lang.IllegalArgumentException(bar.k(i, "Unknown viewType "));
            }
            android.view.View inflate2 = from.inflate(2131561157, viewGroup, false);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            return new o83.q(inflate2, quxVar);
        }
        android.view.View inflate3 = from.inflate(2131561157, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
        return new o83.qux(inflate3, quxVar);
    }
}
