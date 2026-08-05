package com.uidemo.truecaller;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.concurrent.Executors;
import com.uidemo.truecaller.api.ApiClient;
import com.uidemo.truecaller.api.Invest254Api;

public class MainActivity extends AppCompatActivity {
    static { AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES); }

    @Override protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.activity_main);
        enforceSession();
        BottomNavigationView nav = findViewById(R.id.bottom_nav);
        nav.getOrCreateBadge(R.id.nav_messages).setNumber(2);
        nav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_calls) { show(new CallsFragment()); return true; }
            if (id == R.id.nav_messages) { show(new MessagesFragment()); return true; }
            // Blocking / Premium / Invite: keep current screen (UI-only demo)
            return true;
        });
        show(new MessagesFragment());
        nav.setSelectedItemId(R.id.nav_messages);
    }

    /**
     * Enforce the admin "disable app" action on every launch: verify the marketer session with
     * GET /marketers/me. If the admin has disabled/suspended this marketer the API returns 403 —
     * we clear the session and bounce to the sign-in screen (mirrors the mpesa app's gate).
     */
    private void enforceSession() {
        final ApiClient client = ApiClient.get(this);
        if (!client.isLoggedIn()) return;
        Executors.newSingleThreadExecutor().execute(() -> {
            try {
                new Invest254Api(client).me();
            } catch (Invest254Api.ApiException e) {
                if (e.status == 401 || e.status == 403) {
                    client.clearSession();
                    runOnUiThread(() -> {
                        startActivity(new Intent(this, LoginActivity.class)
                                .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK));
                        finish();
                    });
                }
            } catch (Exception ignored) { /* transient network error: keep the session */ }
        });
    }

    private void show(Fragment f) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, f).commit();
    }
}
