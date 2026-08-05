package com.truecaller;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TruecallerBackupAgent extends android.app.backup.BackupAgent {
    public q11.bar a;

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(java.lang.String str) {
        boolean z;
        boolean z2;
        f13.b bVar;
        try {
            java.io.File fileStreamPath = getFileStreamPath("account.v2.bak");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileStreamPath, "getFileStreamPath(...)");
            z = fileStreamPath.exists();
        } catch (java.lang.SecurityException unused) {
            z = false;
        }
        java.lang.Object systemService = getSystemService("account");
        kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.accounts.AccountManager");
        android.accounts.AccountManager accountManager = (android.accounts.AccountManager) systemService;
        android.accounts.Account[] accountsByType = accountManager.getAccountsByType(getString(2132019488));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(accountsByType, "getAccountsByType(...)");
        android.accounts.Account account = (android.accounts.Account) kotlin.collections.v.F(accountsByType);
        if (account != null) {
            java.lang.String peekAuthToken = accountManager.peekAuthToken(account, "installation_id_backup");
            java.lang.String userData = accountManager.getUserData(account, "normalized_number_backup");
            java.lang.String userData2 = accountManager.getUserData(account, "country_code_backup");
            if (peekAuthToken != null && peekAuthToken.length() != 0 && userData != null && userData.length() != 0 && userData2 != null && userData2.length() != 0) {
                z2 = true;
                bVar = this.a;
                if (bVar == null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "settings");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "backupAction");
                    java.util.Map i = kotlin.collections.r0.i(new kotlin.Pair[]{new kotlin.Pair("backup_action_key", str), new kotlin.Pair("backup_file_exists_key", java.lang.String.valueOf(z)), new kotlin.Pair("account_state_valid", java.lang.String.valueOf(z2))});
                    java.util.ArrayList arrayList = new java.util.ArrayList(i.size());
                    for (java.util.Map.Entry entry : i.entrySet()) {
                        arrayList.add(entry.getKey() + "=" + entry.getValue());
                    }
                    java.lang.String b0 = kotlin.collections.CollectionsKt.b0(arrayList, ",", (java.lang.String) null, (java.lang.String) null, (kotlin.jvm.functions.Function1) null, 62);
                    f13.b bVar2 = bVar;
                    java.lang.String i2 = bVar2.i("accountAutobackupLogInfo", "");
                    kotlin.jvm.internal.Intrinsics.d(i2);
                    if (i2.length() > 0) {
                        i2 = i2.concat(";");
                    }
                    bVar2.n("accountAutobackupLogInfo", i2 + b0);
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("settings");
                throw null;
            }
        }
        z2 = false;
        bVar = this.a;
        if (bVar == null) {
        }
    }

    @Override // android.app.backup.BackupAgent
    public final void onBackup(android.os.ParcelFileDescriptor parcelFileDescriptor, android.app.backup.BackupDataOutput backupDataOutput, android.os.ParcelFileDescriptor parcelFileDescriptor2) {
        f13.b bVar = this.a;
        if (bVar != null) {
            bVar.k("accountFileWasBackedUpByAutobackup", true);
            a("onBackup");
        } else {
            kotlin.jvm.internal.Intrinsics.n("settings");
            throw null;
        }
    }

    @Override // android.app.backup.BackupAgent
    public final void onCreate() {
        super.onCreate();
        android.content.Context applicationContext = getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        applicationContext.getClass();
        this.a = (q11.bar) ((cd3.b) new le2.v(applicationContext).c).get();
        a("onCreate");
    }

    @Override // android.app.backup.BackupAgent
    public final void onFullBackup(android.app.backup.FullBackupDataOutput fullBackupDataOutput) {
        super.onFullBackup(fullBackupDataOutput);
        f13.b bVar = this.a;
        if (bVar != null) {
            bVar.k("accountFileWasBackedUpByAutobackup", true);
            a("onFullBackup");
        } else {
            kotlin.jvm.internal.Intrinsics.n("settings");
            throw null;
        }
    }

    @Override // android.app.backup.BackupAgent
    public final void onQuotaExceeded(long j, long j2) {
        super.onQuotaExceeded(j, j2);
        a("onQuotaExceeded");
    }

    @Override // android.app.backup.BackupAgent
    public final void onRestore(android.app.backup.BackupDataInput backupDataInput, int i, android.os.ParcelFileDescriptor parcelFileDescriptor) {
    }

    @Override // android.app.backup.BackupAgent
    public final void onRestoreFinished() {
        super.onRestoreFinished();
        f13.b bVar = this.a;
        if (bVar != null) {
            bVar.k("accountFileWasRestoredByAutobackup", true);
            a("onRestore");
        } else {
            kotlin.jvm.internal.Intrinsics.n("settings");
            throw null;
        }
    }
}
