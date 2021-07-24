// Generated by Dagger (https://dagger.dev).
package com.crisav2.mobiletest3.postDetails.view;

import com.crisav2.mobiletest3.postDetails.PostDetail;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PostDetailFragment_MembersInjector implements MembersInjector<PostDetailFragment> {
  private final Provider<PostDetail.Presenter> presenterProvider;

  public PostDetailFragment_MembersInjector(Provider<PostDetail.Presenter> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<PostDetailFragment> create(
      Provider<PostDetail.Presenter> presenterProvider) {
    return new PostDetailFragment_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(PostDetailFragment instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  @InjectedFieldSignature("com.crisav2.mobiletest3.postDetails.view.PostDetailFragment.presenter")
  public static void injectPresenter(PostDetailFragment instance, PostDetail.Presenter presenter) {
    instance.presenter = presenter;
  }
}
