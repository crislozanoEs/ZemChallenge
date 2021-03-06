// Generated by Dagger (https://dagger.dev).
package com.crisav2.mobiletest3.posts.di;

import com.crisav2.core.useCases.ListPostsUseCase;
import com.crisav2.mobiletest3.posts.Posts;
import com.crisav2.mobiletest3.repository.PostsAPI;
import com.crisav2.mobiletest3.repository.database.db.Interactors;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PostsModule_ProvidePostsPresenterFactory implements Factory<Posts.Presenter> {
  private final PostsModule module;

  private final Provider<PostsAPI> postsAPIProvider;

  private final Provider<ListPostsUseCase> listPostsUseCaseProvider;

  private final Provider<Interactors> interactorsProvider;

  public PostsModule_ProvidePostsPresenterFactory(PostsModule module,
      Provider<PostsAPI> postsAPIProvider, Provider<ListPostsUseCase> listPostsUseCaseProvider,
      Provider<Interactors> interactorsProvider) {
    this.module = module;
    this.postsAPIProvider = postsAPIProvider;
    this.listPostsUseCaseProvider = listPostsUseCaseProvider;
    this.interactorsProvider = interactorsProvider;
  }

  @Override
  public Posts.Presenter get() {
    return providePostsPresenter(module, postsAPIProvider.get(), listPostsUseCaseProvider.get(), interactorsProvider.get());
  }

  public static PostsModule_ProvidePostsPresenterFactory create(PostsModule module,
      Provider<PostsAPI> postsAPIProvider, Provider<ListPostsUseCase> listPostsUseCaseProvider,
      Provider<Interactors> interactorsProvider) {
    return new PostsModule_ProvidePostsPresenterFactory(module, postsAPIProvider, listPostsUseCaseProvider, interactorsProvider);
  }

  public static Posts.Presenter providePostsPresenter(PostsModule instance, PostsAPI postsAPI,
      ListPostsUseCase listPostsUseCase, Interactors interactors) {
    return Preconditions.checkNotNullFromProvides(instance.providePostsPresenter(postsAPI, listPostsUseCase, interactors));
  }
}
