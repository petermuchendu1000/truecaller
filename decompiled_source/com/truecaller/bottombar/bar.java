package com.truecaller.bottombar;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class bar {
    public static final android.util.SparseArray a = new android.util.SparseArray();
    public static final java.util.EnumMap b = new java.util.EnumMap(com.truecaller.bottombar.BottomBarButtonType.class);

    static {
        for (com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId bottomBarMenuItemId : com.truecaller.bottombar.BottomBarView.BottomBarMenuItemId.getEntries()) {
            com.truecaller.bottombar.BottomBarButtonType valueOf = com.truecaller.bottombar.BottomBarButtonType.valueOf(bottomBarMenuItemId.name());
            a.put(bottomBarMenuItemId.getId(), valueOf);
            b.put((java.util.EnumMap) valueOf, (com.truecaller.bottombar.BottomBarButtonType) java.lang.Integer.valueOf(bottomBarMenuItemId.getId()));
        }
    }
}
