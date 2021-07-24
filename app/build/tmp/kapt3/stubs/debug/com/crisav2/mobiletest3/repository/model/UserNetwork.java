package com.crisav2.mobiletest3.repository.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/crisav2/mobiletest3/repository/model/UserNetwork;", "", "userID", "", "userName", "", "userEmail", "userPhone", "userWebsite", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserEmail", "()Ljava/lang/String;", "getUserID", "()I", "getUserName", "getUserPhone", "getUserWebsite", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class UserNetwork {
    private final int userID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userEmail = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userPhone = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userWebsite = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.crisav2.mobiletest3.repository.model.UserNetwork copy(@com.squareup.moshi.Json(name = "id")
    int userID, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "email")
    java.lang.String userEmail, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "Phone")
    java.lang.String userPhone, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "website")
    java.lang.String userWebsite) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public UserNetwork(@com.squareup.moshi.Json(name = "id")
    int userID, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "email")
    java.lang.String userEmail, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "Phone")
    java.lang.String userPhone, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "website")
    java.lang.String userWebsite) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getUserID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserWebsite() {
        return null;
    }
}