package com.crisav2.mobiletest3.postDetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/crisav2/mobiletest3/postDetails/PostDetail;", "", "Presenter", "View", "app_debug"})
public abstract interface PostDetail {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u0010"}, d2 = {"Lcom/crisav2/mobiletest3/postDetails/PostDetail$View;", "", "setUpComments", "", "currentComments", "", "Lcom/crisav2/core/data/Comment;", "setUpPost", "post", "Lcom/crisav2/core/data/Post;", "user", "", "showCommentsLoading", "isShowing", "", "showPostLoading", "app_debug"})
    public static abstract interface View {
        
        public abstract void setUpPost(@org.jetbrains.annotations.NotNull()
        com.crisav2.core.data.Post post, @org.jetbrains.annotations.NotNull()
        java.lang.String user);
        
        public abstract void showPostLoading(boolean isShowing);
        
        public abstract void showCommentsLoading(boolean isShowing);
        
        public abstract void setUpComments(@org.jetbrains.annotations.NotNull()
        java.util.List<com.crisav2.core.data.Comment> currentComments);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/crisav2/mobiletest3/postDetails/PostDetail$Presenter;", "", "destroy", "", "init", "postSelected", "Lcom/crisav2/core/data/Post;", "setAsFavorite", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void init(@org.jetbrains.annotations.Nullable()
        com.crisav2.core.data.Post postSelected);
        
        public abstract void destroy();
        
        public abstract void setAsFavorite();
    }
}