// Generated by Dagger (https://dagger.dev).
package com.crisav2.mobiletest3.repository.useCases;

import com.crisav2.mobiletest3.repository.database.db.Interactors;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ImplPostUseCases_MembersInjector implements MembersInjector<ImplPostUseCases> {
  private final Provider<Interactors> interactorsProvider;

  public ImplPostUseCases_MembersInjector(Provider<Interactors> interactorsProvider) {
    this.interactorsProvider = interactorsProvider;
  }

  public static MembersInjector<ImplPostUseCases> create(
      Provider<Interactors> interactorsProvider) {
    return new ImplPostUseCases_MembersInjector(interactorsProvider);
  }

  @Override
  public void injectMembers(ImplPostUseCases instance) {
    injectInteractors(instance, interactorsProvider.get());
  }

  @InjectedFieldSignature("com.crisav2.mobiletest3.repository.useCases.ImplPostUseCases.interactors")
  public static void injectInteractors(ImplPostUseCases instance, Interactors interactors) {
    instance.interactors = interactors;
  }
}
