/* Webapp updater: polls version.json; when the server version is newer than the
 * running build, shows a banner that reloads the page (fresh assets via SW update). */
(function () {
  'use strict';

  // Bump this on every deploy; must match the served version.json.
  const CURRENT_VERSION = window.HARNESS_VERSION || '1.0.0';
  const MANIFEST_URL = 'version.json';
  const POLL_MS = 5 * 60 * 1000; // 5 minutes

  function parseSemver(v) {
    return String(v).split('.').map((n) => parseInt(n, 10) || 0);
  }

  /** Returns 1 if a>b, -1 if a<b, 0 if equal. Exported for tests. */
  function compareVersions(a, b) {
    const pa = parseSemver(a), pb = parseSemver(b);
    for (let i = 0; i < 3; i++) {
      if (pa[i] > pb[i]) return 1;
      if (pa[i] < pb[i]) return -1;
    }
    return 0;
  }

  function showUpdateBanner(newVersion, notes) {
    if (document.getElementById('update-banner')) return;
    const bar = document.createElement('div');
    bar.id = 'update-banner';
    bar.style.cssText =
      'position:fixed;left:0;right:0;bottom:0;z-index:9999;display:flex;gap:12px;' +
      'align-items:center;justify-content:center;padding:10px 16px;background:#0A6CFF;' +
      'color:#fff;font:14px/1.4 system-ui,sans-serif;box-shadow:0 -2px 12px rgba(0,0,0,.25)';
    const text = document.createElement('span');
    text.textContent = 'Update available — v' + newVersion + (notes ? ': ' + notes : '');
    const btn = document.createElement('button');
    btn.id = 'update-reload-btn';
    btn.textContent = 'Reload to update';
    btn.style.cssText =
      'padding:6px 14px;border:0;border-radius:6px;background:#fff;color:#0A6CFF;' +
      'font-weight:600;cursor:pointer';
    btn.addEventListener('click', async () => {
      // Ask the SW to pick up new assets, then hard-reload.
      if ('serviceWorker' in navigator) {
        const reg = await navigator.serviceWorker.getRegistration();
        if (reg) await reg.update();
      }
      location.reload(true);
    });
    bar.appendChild(text);
    bar.appendChild(btn);
    document.body.appendChild(bar);
  }

  async function checkForUpdate() {
    try {
      const res = await fetch(MANIFEST_URL + '?t=' + Date.now(), { cache: 'no-store' });
      if (!res.ok) return null;
      const m = await res.json();
      if (m && m.version && compareVersions(m.version, CURRENT_VERSION) > 0) {
        showUpdateBanner(m.version, m.notes || '');
        return m;
      }
    } catch (e) {
      /* offline or no manifest: stay silent */
    }
    return null;
  }

  // Register the service worker (best-effort; file:// contexts skip it).
  if ('serviceWorker' in navigator && location.protocol.startsWith('http')) {
    navigator.serviceWorker.register('sw.js').catch(() => {});
  }

  document.addEventListener('DOMContentLoaded', () => {
    checkForUpdate();
    setInterval(checkForUpdate, POLL_MS);
  });

  // Exposed for automated tests.
  window.HarnessUpdater = { compareVersions, checkForUpdate, CURRENT_VERSION };
})();
