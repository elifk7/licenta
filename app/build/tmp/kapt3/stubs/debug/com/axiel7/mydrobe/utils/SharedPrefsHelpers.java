package com.axiel7.mydrobe.utils;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0010J+\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u0002H\u0012\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0015J,\u0010\u0016\u001a\n\u0012\u0004\u0012\u0002H\u0012\u0018\u00010\u0017\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u0002H\u0012\u0018\u00010\u0014J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\u001a\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u0006J\u0018\u0010\u001c\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\fJ\u0018\u0010\u001d\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u000eJ\u0018\u0010\u001e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u0010J#\u0010\u001f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u0002H\u0012\u00a2\u0006\u0002\u0010!J&\u0010\"\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u0002H\u0012\u0018\u00010\u0017J\u001a\u0010$\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u00a8\u0006&"}, d2 = {"Lcom/axiel7/mydrobe/utils/SharedPrefsHelpers;", "", "()V", "clearSession", "", "deleteValue", "", "key", "", "getBoolean", "defaultValue", "getFloat", "", "getInt", "", "getLong", "", "getObject", "T", "classType", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getObjectsList", "", "getString", "isKeyExists", "saveBoolean", "value", "saveFloat", "saveInt", "saveLong", "saveObject", "object", "(Ljava/lang/String;Ljava/lang/Object;)V", "saveObjectsList", "objectList", "saveString", "Companion", "app_debug"})
public final class SharedPrefsHelpers {
    @org.jetbrains.annotations.NotNull()
    public static final com.axiel7.mydrobe.utils.SharedPrefsHelpers.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static com.axiel7.mydrobe.utils.SharedPrefsHelpers instance;
    private static android.content.SharedPreferences mSharedPreferences;
    
    public SharedPrefsHelpers() {
        super();
    }
    
    public final void saveInt(@org.jetbrains.annotations.Nullable()
    java.lang.String key, int value) {
    }
    
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defaultValue) {
        return 0;
    }
    
    public final void saveBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String key, boolean value) {
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defaultValue) {
        return false;
    }
    
    public final void saveFloat(@org.jetbrains.annotations.Nullable()
    java.lang.String key, float value) {
    }
    
    public final float getFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float defaultValue) {
        return 0.0F;
    }
    
    public final void saveLong(@org.jetbrains.annotations.Nullable()
    java.lang.String key, long value) {
    }
    
    public final long getLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long defaultValue) {
        return 0L;
    }
    
    public final void saveString(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String defaultValue) {
        return null;
    }
    
    public final <T extends java.lang.Object>void saveObject(@org.jetbrains.annotations.Nullable()
    java.lang.String key, T object) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T getObject(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Class<T> classType) {
        return null;
    }
    
    public final <T extends java.lang.Object>void saveObjectsList(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> objectList) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>java.util.List<T> getObjectsList(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Class<T> classType) {
        return null;
    }
    
    public final void clearSession() {
    }
    
    public final boolean deleteValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    private final boolean isKeyExists(java.lang.String key) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0002R*\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/axiel7/mydrobe/utils/SharedPrefsHelpers$Companion;", "", "()V", "<set-?>", "Lcom/axiel7/mydrobe/utils/SharedPrefsHelpers;", "instance", "getInstance", "()Lcom/axiel7/mydrobe/utils/SharedPrefsHelpers;", "setInstance", "(Lcom/axiel7/mydrobe/utils/SharedPrefsHelpers;)V", "mSharedPreferences", "Landroid/content/SharedPreferences;", "init", "", "context", "Landroid/content/Context;", "validateInitialization", "SharedPrefsExceptions", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.axiel7.mydrobe.utils.SharedPrefsHelpers getInstance() {
            return null;
        }
        
        private final void setInstance(com.axiel7.mydrobe.utils.SharedPrefsHelpers p0) {
        }
        
        public final void init(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
        }
        
        private final void validateInitialization() {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/axiel7/mydrobe/utils/SharedPrefsHelpers$Companion$SharedPrefsExceptions;", "", "s", "", "(Ljava/lang/String;)V", "app_debug"})
        public static final class SharedPrefsExceptions extends java.lang.Throwable {
            
            public SharedPrefsExceptions(@org.jetbrains.annotations.NotNull()
            java.lang.String s) {
                super(null);
            }
        }
    }
}