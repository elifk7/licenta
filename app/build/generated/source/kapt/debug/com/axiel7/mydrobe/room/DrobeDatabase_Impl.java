package com.axiel7.mydrobe.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DrobeDatabase_Impl extends DrobeDatabase {
  private volatile ClothesDao _clothesDao;

  private volatile OutfitDao _outfitDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(6) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Clothing` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `photoUri` TEXT, `colors` TEXT NOT NULL, `type` TEXT NOT NULL, `material` TEXT NOT NULL, `price` INTEGER NOT NULL, `isFavorite` INTEGER NOT NULL, `seasons` TEXT NOT NULL, `lastUsed` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Outfit` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `top` TEXT NOT NULL, `topPhotoUri` TEXT, `bottom` TEXT NOT NULL, `bottomPhotoUri` TEXT, `shoes` TEXT NOT NULL, `shoesPhotoUri` TEXT, `season` TEXT NOT NULL, `data` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '06e55fc84a6be632c2d61aed2650e6e8')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Clothing`");
        _db.execSQL("DROP TABLE IF EXISTS `Outfit`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsClothing = new HashMap<String, TableInfo.Column>(10);
        _columnsClothing.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothing.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothing.put("photoUri", new TableInfo.Column("photoUri", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothing.put("colors", new TableInfo.Column("colors", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothing.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothing.put("material", new TableInfo.Column("material", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothing.put("price", new TableInfo.Column("price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothing.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothing.put("seasons", new TableInfo.Column("seasons", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsClothing.put("lastUsed", new TableInfo.Column("lastUsed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysClothing = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesClothing = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoClothing = new TableInfo("Clothing", _columnsClothing, _foreignKeysClothing, _indicesClothing);
        final TableInfo _existingClothing = TableInfo.read(_db, "Clothing");
        if (! _infoClothing.equals(_existingClothing)) {
          return new RoomOpenHelper.ValidationResult(false, "Clothing(com.axiel7.mydrobe.models.Clothing).\n"
                  + " Expected:\n" + _infoClothing + "\n"
                  + " Found:\n" + _existingClothing);
        }
        final HashMap<String, TableInfo.Column> _columnsOutfit = new HashMap<String, TableInfo.Column>(10);
        _columnsOutfit.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfit.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfit.put("top", new TableInfo.Column("top", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfit.put("topPhotoUri", new TableInfo.Column("topPhotoUri", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfit.put("bottom", new TableInfo.Column("bottom", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfit.put("bottomPhotoUri", new TableInfo.Column("bottomPhotoUri", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfit.put("shoes", new TableInfo.Column("shoes", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfit.put("shoesPhotoUri", new TableInfo.Column("shoesPhotoUri", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfit.put("season", new TableInfo.Column("season", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutfit.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOutfit = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOutfit = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOutfit = new TableInfo("Outfit", _columnsOutfit, _foreignKeysOutfit, _indicesOutfit);
        final TableInfo _existingOutfit = TableInfo.read(_db, "Outfit");
        if (! _infoOutfit.equals(_existingOutfit)) {
          return new RoomOpenHelper.ValidationResult(false, "Outfit(com.axiel7.mydrobe.models.Outfit).\n"
                  + " Expected:\n" + _infoOutfit + "\n"
                  + " Found:\n" + _existingOutfit);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "06e55fc84a6be632c2d61aed2650e6e8", "d6d165996e203569478d6212b54005be");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Clothing","Outfit");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Clothing`");
      _db.execSQL("DELETE FROM `Outfit`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ClothesDao.class, ClothesDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(OutfitDao.class, OutfitDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public ClothesDao clothesDao() {
    if (_clothesDao != null) {
      return _clothesDao;
    } else {
      synchronized(this) {
        if(_clothesDao == null) {
          _clothesDao = new ClothesDao_Impl(this);
        }
        return _clothesDao;
      }
    }
  }

  @Override
  public OutfitDao outfitDao() {
    if (_outfitDao != null) {
      return _outfitDao;
    } else {
      synchronized(this) {
        if(_outfitDao == null) {
          _outfitDao = new OutfitDao_Impl(this);
        }
        return _outfitDao;
      }
    }
  }
}
