// Generated by Dagger (https://dagger.dev).
package com.crisav2.mobiletest3.di.module;

import com.crisav2.mobiletest3.repository.CommentsAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvidesCommentsAPIFactory implements Factory<CommentsAPI> {
  private final ApplicationModule module;

  public ApplicationModule_ProvidesCommentsAPIFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public CommentsAPI get() {
    return providesCommentsAPI(module);
  }

  public static ApplicationModule_ProvidesCommentsAPIFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvidesCommentsAPIFactory(module);
  }

  public static CommentsAPI providesCommentsAPI(ApplicationModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesCommentsAPI());
  }
}
