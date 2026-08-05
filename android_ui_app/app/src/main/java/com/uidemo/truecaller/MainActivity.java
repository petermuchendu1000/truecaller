package com.uidemo.truecaller;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    static { AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES); }

    @Override protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.activity_main);
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
    private void show(Fragment f) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, f).commit();
    }
}
