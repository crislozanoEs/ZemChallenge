// Generated by Dagger (https://dagger.dev).
package com.crisav2.mobiletest3.di.module;

import com.crisav2.mobiletest3.repository.UserAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvidesUsersAPIFactory implements Factory<UserAPI> {
  private final ApplicationModule module;

  public ApplicationModule_ProvidesUsersAPIFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public UserAPI get() {
    return providesUsersAPI(module);
  }

  public static ApplicationModule_ProvidesUsersAPIFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvidesUsersAPIFactory(module);
  }

  public static UserAPI providesUsersAPI(ApplicationModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesUsersAPI());
  }
}
