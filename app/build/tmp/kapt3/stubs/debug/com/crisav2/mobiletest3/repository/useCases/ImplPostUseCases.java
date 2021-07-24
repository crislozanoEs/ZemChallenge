package com.crisav2.mobiletest3.repository.useCases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/crisav2/mobiletest3/repository/useCases/ImplPostUseCases;", "", "()V", "interactors", "Lcom/crisav2/mobiletest3/repository/database/db/Interactors;", "getInteractors", "()Lcom/crisav2/mobiletest3/repository/database/db/Interactors;", "setInteractors", "(Lcom/crisav2/mobiletest3/repository/database/db/Interactors;)V", "job", "Lkotlinx/coroutines/CompletableJob;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "doSavePosts", "", "post", "", "Lcom/crisav2/core/data/Post;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeSavePosts", "app_debug"})
public final class ImplPostUseCases {
    @javax.inject.Inject()
    public com.crisav2.mobiletest3.repository.database.db.Interactors interactors;
    private kotlinx.coroutines.CompletableJob job;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    
    public ImplPostUseCases() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.mobiletest3.repository.database.db.Interactors getInteractors() {
        return null;
    }
    
    public final void setInteractors(@org.jetbrains.annotations.NotNull()
    com.crisav2.mobiletest3.repository.database.db.Interactors p0) {
    }
    
    public final void executeSavePosts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.crisav2.core.data.Post> post) {
    }
    
    private final java.lang.Object doSavePosts(java.util.List<com.crisav2.core.data.Post> post, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}