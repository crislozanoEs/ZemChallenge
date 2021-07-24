package com.crisav2.mobiletest3.posts.view.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B(\u0012!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0005J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016R)\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/crisav2/mobiletest3/posts/view/list/PostsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crisav2/mobiletest3/posts/view/list/PostViewHolder;", "onPostClicked", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "id", "", "(Lkotlin/jvm/functions/Function1;)V", "postsList", "", "Lcom/crisav2/core/data/Post;", "getPostsList", "()Ljava/util/List;", "setPostsList", "(Ljava/util/List;)V", "deleteItem", "adapterPosition", "deleteItems", "getItem", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class PostsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.crisav2.mobiletest3.posts.view.list.PostViewHolder> {
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onPostClicked = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.crisav2.core.data.Post> postsList;
    
    public PostsAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onPostClicked) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.crisav2.core.data.Post> getPostsList() {
        return null;
    }
    
    public final void setPostsList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.crisav2.core.data.Post> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.crisav2.mobiletest3.posts.view.list.PostViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.posts.view.list.PostViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void deleteItem(int adapterPosition) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.core.data.Post getItem(int adapterPosition) {
        return null;
    }
    
    public final void deleteItems() {
    }
}