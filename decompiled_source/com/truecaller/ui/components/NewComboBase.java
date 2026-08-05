package com.truecaller.ui.components;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class NewComboBase extends android.widget.LinearLayout implements android.view.View.OnClickListener {
    public java.lang.String a;
    public ey2.o b;
    public java.util.List c;
    public ey2.p d;

    public NewComboBase(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        android.content.Context context2 = getContext();
        int i = m03.v.b;
        addView(android.view.LayoutInflater.from(context2).inflate(2131558947, (android.view.ViewGroup) null), layoutParams);
        setOnClickListener(this);
        setClickable(true);
        setEnabled(isEnabled());
        ((android.widget.ImageView) findViewById(2131363576)).setImageDrawable(bi3.a.x(getContext(), 2131232454, 2130970935, android.graphics.PorterDuff.Mode.SRC_IN));
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.R.styleable.f);
        if (obtainStyledAttributes != null) {
            for (int i2 = 0; i2 < obtainStyledAttributes.getIndexCount(); i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    java.lang.String string = obtainStyledAttributes.getString(index);
                    if (string != null) {
                        r6.baz c = r6.baz.c();
                        c.getClass();
                        string = c.d(string, r6.c.c).toString();
                    }
                    setTitle(string);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public ey2.o getSelection() {
        return this.b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        new i.d(getContext()).setTitle(this.a).a(new ey2.c(this.c), new a42.a(this, 10)).m();
    }

    public void setData(java.util.List<? extends ey2.o> list) {
        this.c = list;
        if (list != null && list.size() > 0) {
            setSelection((ey2.o) this.c.get(0));
        }
    }

    public void setObserver(ey2.p pVar) {
        this.d = pVar;
    }

    public void setSelection(ey2.o oVar) {
        java.lang.String d;
        this.b = oVar;
        if (oVar == null) {
            d = "";
        } else {
            d = oVar.d(getContext());
        }
        int i = m03.v.b;
        m03.v.i((android.widget.TextView) findViewById(2131364974), d);
    }

    public void setTitle(java.lang.String str) {
        if (str != null) {
            r6.baz c = r6.baz.c();
            c.getClass();
            str = c.d(str, r6.c.c).toString();
        }
        this.a = str;
    }
}
