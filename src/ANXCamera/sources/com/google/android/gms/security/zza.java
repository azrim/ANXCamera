package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;

final class zza extends AsyncTask<Void, Void, Integer> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ ProviderInstaller.ProviderInstallListener zzix;

    zza(Context context, ProviderInstaller.ProviderInstallListener providerInstallListener) {
        this.val$context = context;
        this.zzix = providerInstallListener;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final Integer doInBackground(Void... voidArr) {
        try {
            ProviderInstaller.installIfNeeded(this.val$context);
            return 0;
        } catch (GooglePlayServicesRepairableException e2) {
            return Integer.valueOf(e2.getConnectionStatusCode());
        } catch (GooglePlayServicesNotAvailableException e3) {
            return Integer.valueOf(e3.errorCode);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.zzix.onProviderInstalled();
            return;
        }
        this.zzix.onProviderInstallFailed(num.intValue(), ProviderInstaller.zziv.getErrorResolutionIntent(this.val$context, num.intValue(), "pi"));
    }
}
