// Generated by Dagger (https://dagger.dev).
package com.crisav2.mobiletest3.di.component;

import com.crisav2.core.useCases.DetailPostUseCase;
import com.crisav2.core.useCases.ListPostsUseCase;
import com.crisav2.mobiletest3.di.module.ApplicationModule;
import com.crisav2.mobiletest3.di.module.ApplicationModule_ProvidesCommentsAPIFactory;
import com.crisav2.mobiletest3.di.module.ApplicationModule_ProvidesInteractorsFactory;
import com.crisav2.mobiletest3.di.module.ApplicationModule_ProvidesListPostsUseCaseFactory;
import com.crisav2.mobiletest3.di.module.ApplicationModule_ProvidesPostDetailUseCaseFactory;
import com.crisav2.mobiletest3.di.module.ApplicationModule_ProvidesPostsAPIFactory;
import com.crisav2.mobiletest3.di.module.ApplicationModule_ProvidesUsersAPIFactory;
import com.crisav2.mobiletest3.postDetails.PostDetail;
import com.crisav2.mobiletest3.postDetails.di.PostDetailComponent;
import com.crisav2.mobiletest3.postDetails.di.PostDetailModule;
import com.crisav2.mobiletest3.postDetails.di.PostDetailModule_ProvidePostDetailPresenterFactory;
import com.crisav2.mobiletest3.postDetails.view.PostDetailFragment;
import com.crisav2.mobiletest3.postDetails.view.PostDetailFragment_MembersInjector;
import com.crisav2.mobiletest3.posts.Posts;
import com.crisav2.mobiletest3.posts.di.PostsComponent;
import com.crisav2.mobiletest3.posts.di.PostsModule;
import com.crisav2.mobiletest3.posts.di.PostsModule_ProvidePostsPresenterFactory;
import com.crisav2.mobiletest3.posts.view.PostsFragment;
import com.crisav2.mobiletest3.posts.view.PostsFragment_MembersInjector;
import com.crisav2.mobiletest3.repository.CommentsAPI;
import com.crisav2.mobiletest3.repository.PostsAPI;
import com.crisav2.mobiletest3.repository.UserAPI;
import com.crisav2.mobiletest3.repository.database.db.Interactors;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<PostsAPI> providesPostsAPIProvider;

  private Provider<ListPostsUseCase> providesListPostsUseCaseProvider;

  private Provider<Interactors> providesInteractorsProvider;

  private Provider<UserAPI> providesUsersAPIProvider;

  private Provider<CommentsAPI> providesCommentsAPIProvider;

  private Provider<DetailPostUseCase> providesPostDetailUseCaseProvider;

  private DaggerApplicationComponent(ApplicationModule applicationModuleParam) {

    initialize(applicationModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationModule applicationModuleParam) {
    this.providesPostsAPIProvider = DoubleCheck.provider(ApplicationModule_ProvidesPostsAPIFactory.create(applicationModuleParam));
    this.providesListPostsUseCaseProvider = DoubleCheck.provider(ApplicationModule_ProvidesListPostsUseCaseFactory.create(applicationModuleParam));
    this.providesInteractorsProvider = ApplicationModule_ProvidesInteractorsFactory.create(applicationModuleParam);
    this.providesUsersAPIProvider = DoubleCheck.provider(ApplicationModule_ProvidesUsersAPIFactory.create(applicationModuleParam));
    this.providesCommentsAPIProvider = DoubleCheck.provider(ApplicationModule_ProvidesCommentsAPIFactory.create(applicationModuleParam));
    this.providesPostDetailUseCaseProvider = DoubleCheck.provider(ApplicationModule_ProvidesPostDetailUseCaseFactory.create(applicationModuleParam));
  }

  @Override
  public PostsComponent plus(PostsModule postsModule) {
    Preconditions.checkNotNull(postsModule);
    return new PostsComponentImpl(postsModule);
  }

  @Override
  public PostDetailComponent plus(PostDetailModule postDetailModule) {
    Preconditions.checkNotNull(postDetailModule);
    return new PostDetailComponentImpl(postDetailModule);
  }

  public static final class Builder {
    private ApplicationModule applicationModule;

    private Builder() {
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }

    public ApplicationComponent build() {
      Preconditions.checkBuilderRequirement(applicationModule, ApplicationModule.class);
      return new DaggerApplicationComponent(applicationModule);
    }
  }

  private final class PostsComponentImpl implements PostsComponent {
    private Provider<Posts.Presenter> providePostsPresenterProvider;

    private PostsComponentImpl(PostsModule postsModuleParam) {

      initialize(postsModuleParam);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final PostsModule postsModuleParam) {
      this.providePostsPresenterProvider = DoubleCheck.provider(PostsModule_ProvidePostsPresenterFactory.create(postsModuleParam, DaggerApplicationComponent.this.providesPostsAPIProvider, DaggerApplicationComponent.this.providesListPostsUseCaseProvider, DaggerApplicationComponent.this.providesInteractorsProvider));
    }

    @Override
    public void inject(PostsFragment fragment) {
      injectPostsFragment(fragment);
    }

    private PostsFragment injectPostsFragment(PostsFragment instance) {
      PostsFragment_MembersInjector.injectPresenter(instance, providePostsPresenterProvider.get());
      return instance;
    }
  }

  private final class PostDetailComponentImpl implements PostDetailComponent {
    private Provider<PostDetail.Presenter> providePostDetailPresenterProvider;

    private PostDetailComponentImpl(PostDetailModule postDetailModuleParam) {

      initialize(postDetailModuleParam);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final PostDetailModule postDetailModuleParam) {
      this.providePostDetailPresenterProvider = DoubleCheck.provider(PostDetailModule_ProvidePostDetailPresenterFactory.create(postDetailModuleParam, DaggerApplicationComponent.this.providesInteractorsProvider, DaggerApplicationComponent.this.providesUsersAPIProvider, DaggerApplicationComponent.this.providesCommentsAPIProvider, DaggerApplicationComponent.this.providesPostDetailUseCaseProvider));
    }

    @Override
    public void inject(PostDetailFragment arg0) {
      injectPostDetailFragment(arg0);
    }

    private PostDetailFragment injectPostDetailFragment(PostDetailFragment instance) {
      PostDetailFragment_MembersInjector.injectPresenter(instance, providePostDetailPresenterProvider.get());
      return instance;
    }
  }
}