package com.crisav2.mobiletest3.posts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/crisav2/mobiletest3/posts/Posts;", "", "Presenter", "View", "app_debug"})
public abstract interface Posts {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H&\u00a8\u0006\u0013"}, d2 = {"Lcom/crisav2/mobiletest3/posts/Posts$View;", "", "deleteItem", "", "adapterPosition", "", "goToDetails", "selectedPost", "Lcom/crisav2/core/data/Post;", "showError", "isShowing", "", "errorMessage", "", "showLoading", "showNoPosts", "showPosts", "post", "", "app_debug"})
    public static abstract interface View {
        
        public abstract void showPosts(@org.jetbrains.annotations.NotNull()
        java.util.List<com.crisav2.core.data.Post> post);
        
        public abstract void showLoading(boolean isShowing);
        
        public abstract void showError(boolean isShowing, @org.jetbrains.annotations.Nullable()
        java.lang.String errorMessage);
        
        public abstract void goToDetails(@org.jetbrains.annotations.NotNull()
        com.crisav2.core.data.Post selectedPost);
        
        public abstract void showNoPosts();
        
        public abstract void deleteItem(int adapterPosition);
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class DefaultImpls {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&\u00a8\u0006\u0012"}, d2 = {"Lcom/crisav2/mobiletest3/posts/Posts$Presenter;", "", "deleteCachedPost", "", "reload", "", "deletePost", "item", "Lcom/crisav2/core/data/Post;", "destroy", "init", "reloadPost", "requestPosts", "showAllPost", "showFavoritePost", "validateIdAndNavigate", "id", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void init();
        
        public abstract void destroy();
        
        public abstract void validateIdAndNavigate(int id);
        
        public abstract void requestPosts();
        
        public abstract void reloadPost();
        
        public abstract void deleteCachedPost(boolean reload);
        
        public abstract void showAllPost();
        
        public abstract void showFavoritePost();
        
        public abstract void deletePost(@org.jetbrains.annotations.NotNull()
        com.crisav2.core.data.Post item);
    }
}