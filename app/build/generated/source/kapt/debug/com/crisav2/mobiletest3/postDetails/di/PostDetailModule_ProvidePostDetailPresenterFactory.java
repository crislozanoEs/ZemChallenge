// Generated by Dagger (https://dagger.dev).
package com.crisav2.mobiletest3.postDetails.di;

import com.crisav2.core.useCases.DetailPostUseCase;
import com.crisav2.mobiletest3.postDetails.PostDetail;
import com.crisav2.mobiletest3.repository.CommentsAPI;
import com.crisav2.mobiletest3.repository.UserAPI;
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
public final class PostDetailModule_ProvidePostDetailPresenterFactory implements Factory<PostDetail.Presenter> {
  private final PostDetailModule module;

  private final Provider<Interactors> interactorsProvider;

  private final Provider<UserAPI> userAPIProvider;

  private final Provider<CommentsAPI> commentsAPIProvider;

  private final Provider<DetailPostUseCase> detailPostUseCaseProvider;

  public PostDetailModule_ProvidePostDetailPresenterFactory(PostDetailModule module,
      Provider<Interactors> interactorsProvider, Provider<UserAPI> userAPIProvider,
      Provider<CommentsAPI> commentsAPIProvider,
      Provider<DetailPostUseCase> detailPostUseCaseProvider) {
    this.module = module;
    this.interactorsProvider = interactorsProvider;
    this.userAPIProvider = userAPIProvider;
    this.commentsAPIProvider = commentsAPIProvider;
    this.detailPostUseCaseProvider = detailPostUseCaseProvider;
  }

  @Override
  public PostDetail.Presenter get() {
    return providePostDetailPresenter(module, interactorsProvider.get(), userAPIProvider.get(), commentsAPIProvider.get(), detailPostUseCaseProvider.get());
  }

  public static PostDetailModule_ProvidePostDetailPresenterFactory create(PostDetailModule module,
      Provider<Interactors> interactorsProvider, Provider<UserAPI> userAPIProvider,
      Provider<CommentsAPI> commentsAPIProvider,
      Provider<DetailPostUseCase> detailPostUseCaseProvider) {
    return new PostDetailModule_ProvidePostDetailPresenterFactory(module, interactorsProvider, userAPIProvider, commentsAPIProvider, detailPostUseCaseProvider);
  }

  public static PostDetail.Presenter providePostDetailPresenter(PostDetailModule instance,
      Interactors interactors, UserAPI userAPI, CommentsAPI commentsAPI,
      DetailPostUseCase detailPostUseCase) {
    return Preconditions.checkNotNullFromProvides(instance.providePostDetailPresenter(interactors, userAPI, commentsAPI, detailPostUseCase));
  }
}
