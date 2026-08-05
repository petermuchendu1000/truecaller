package com.uidemo.truecaller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import java.util.concurrent.Executors;
import com.uidemo.truecaller.api.ApiClient;
import com.uidemo.truecaller.api.Invest254Api;
import com.uidemo.truecaller.notify.TcNotifications;
import com.uidemo.truecaller.notify.TxPollWorker;

/**
 * Marketer sign-in with the SAME phone + password used on the invest254 website
 * (POST /api/v1/marketers/auth/login-web). On success the marketer JWT is stored and the
 * Messages screen starts syncing live transactions.
 */
public class LoginActivity extends AppCompatActivity {
    private EditText phone, password;
    private View progress;
    private TextView error;
    private Button submit;

    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        // Notification channel + background poll are armed regardless of login state; the worker
        // no-ops until a session exists. Sign-in appears ONCE — a stored token skips this screen.
        TcNotifications.ensureChannel(this);
        TxPollWorker.schedule(this);
        requestNotifPermissionIfNeeded();
        if (ApiClient.get(this).isLoggedIn()) { goMain(); return; }
        setContentView(R.layout.activity_login);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);
        progress = findViewById(R.id.progress);
        error = findViewById(R.id.error);
        submit = findViewById(R.id.submit);
        submit.setOnClickListener(v -> doLogin());
    }

    private void doLogin() {
        final String p = phone.getText().toString().trim();
        final String pw = password.getText().toString();
        if (p.isEmpty() || pw.isEmpty()) { showError("Enter your phone and password"); return; }
        setBusy(true);
        Executors.newSingleThreadExecutor().execute(() -> {
            try {
                Invest254Api.LoginResult res = new Invest254Api(ApiClient.get(this)).loginWeb(p, pw);
                ApiClient.get(this).saveSession(res.token, res.marketerName, res.marketerPhone);
                runOnUiThread(this::goMain);
            } catch (Invest254Api.ApiException e) {
                runOnUiThread(() -> { setBusy(false); showError(e.status == 401 ? "Invalid phone or password"
                        : e.status == 403 ? e.getMessage() : "Sign-in failed (" + e.status + ")"); });
            } catch (Exception e) {
                runOnUiThread(() -> { setBusy(false); showError("Network error — check connection"); });
            }
        });
    }

    private void setBusy(boolean busy) {
        progress.setVisibility(busy ? View.VISIBLE : View.GONE);
        submit.setEnabled(!busy);
        error.setVisibility(View.GONE);
    }

    private void showError(String msg) { error.setText(msg); error.setVisibility(View.VISIBLE); }

    private void goMain() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    private void requestNotifPermissionIfNeeded() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            if (androidx.core.content.ContextCompat.checkSelfPermission(this,
                    android.Manifest.permission.POST_NOTIFICATIONS) != android.content.pm.PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{ android.Manifest.permission.POST_NOTIFICATIONS }, 42);
            }
        }
    }
}
