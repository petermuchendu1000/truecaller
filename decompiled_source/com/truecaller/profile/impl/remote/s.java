package com.truecaller.profile.impl.remote;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class s implements com.truecaller.profile.impl.remote.q {
    public final com.truecaller.profile.impl.remote.r a = (com.truecaller.profile.impl.remote.r) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.PROFILE, com.truecaller.profile.impl.remote.r.class);

    @Override // com.truecaller.profile.impl.remote.q
    public final java.lang.Object a(com.truecaller.profile.impl.remote.model.CreateProfileRequestDto createProfileRequestDto, df3.bar barVar) {
        return this.a.a(createProfileRequestDto, barVar);
    }

    @Override // com.truecaller.profile.impl.remote.q
    public final java.lang.Object b(com.truecaller.profile.impl.remote.model.UpdateProfileRequestDto updateProfileRequestDto, com.truecaller.profile.impl.remote.d dVar) {
        return this.a.b(updateProfileRequestDto, dVar);
    }

    @Override // com.truecaller.profile.impl.remote.q
    public final java.lang.Object c(com.truecaller.profile.impl.remote.f fVar) {
        return this.a.c(fVar);
    }

    @Override // com.truecaller.profile.impl.remote.q
    public final wj3.a getProfile() {
        return this.a.getProfile();
    }
}
