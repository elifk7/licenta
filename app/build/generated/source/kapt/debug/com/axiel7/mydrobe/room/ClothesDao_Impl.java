package com.axiel7.mydrobe.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.axiel7.mydrobe.models.Category;
import com.axiel7.mydrobe.models.Clothing;
import com.axiel7.mydrobe.models.Materials;
import com.axiel7.mydrobe.models.Season;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ClothesDao_Impl implements ClothesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Clothing> __insertionAdapterOfClothing;

  private final TypeConverters __typeConverters = new TypeConverters();

  private final EntityDeletionOrUpdateAdapter<Clothing> __deletionAdapterOfClothing;

  private final EntityDeletionOrUpdateAdapter<Clothing> __updateAdapterOfClothing;

  public ClothesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfClothing = new EntityInsertionAdapter<Clothing>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Clothing` (`id`,`name`,`photoUri`,`colors`,`type`,`material`,`price`,`isFavorite`,`seasons`,`lastUsed`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Clothing value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhotoUri() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhotoUri());
        }
        final String _tmp;
        _tmp = __typeConverters.listStringToString(value.getColors());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __typeConverters.listCategoryToString(value.getType());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __typeConverters.listMaterialToString(value.getMaterial());
        if (_tmp_2 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_2);
        }
        stmt.bindLong(7, value.getPrice());
        final int _tmp_3;
        _tmp_3 = value.isFavorite() ? 1 : 0;
        stmt.bindLong(8, _tmp_3);
        final String _tmp_4;
        _tmp_4 = __typeConverters.listSeasonToString(value.getSeasons());
        if (_tmp_4 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_4);
        }
        stmt.bindLong(10, value.getLastUsed());
      }
    };
    this.__deletionAdapterOfClothing = new EntityDeletionOrUpdateAdapter<Clothing>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Clothing` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Clothing value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfClothing = new EntityDeletionOrUpdateAdapter<Clothing>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Clothing` SET `id` = ?,`name` = ?,`photoUri` = ?,`colors` = ?,`type` = ?,`material` = ?,`price` = ?,`isFavorite` = ?,`seasons` = ?,`lastUsed` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Clothing value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhotoUri() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhotoUri());
        }
        final String _tmp;
        _tmp = __typeConverters.listStringToString(value.getColors());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __typeConverters.listCategoryToString(value.getType());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __typeConverters.listMaterialToString(value.getMaterial());
        if (_tmp_2 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_2);
        }
        stmt.bindLong(7, value.getPrice());
        final int _tmp_3;
        _tmp_3 = value.isFavorite() ? 1 : 0;
        stmt.bindLong(8, _tmp_3);
        final String _tmp_4;
        _tmp_4 = __typeConverters.listSeasonToString(value.getSeasons());
        if (_tmp_4 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_4);
        }
        stmt.bindLong(10, value.getLastUsed());
        stmt.bindLong(11, value.getId());
      }
    };
  }

  @Override
  public Object addClothing(final Clothing clothing, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfClothing.insert(clothing);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object removeClothing(final Clothing clothing, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfClothing.handle(clothing);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateClothing(final Clothing clothing, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfClothing.handle(clothing);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Flow<List<Clothing>> getClothes() {
    final String _sql = "SELECT * FROM clothing";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"clothing"}, new Callable<List<Clothing>>() {
      @Override
      public List<Clothing> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "photoUri");
          final int _cursorIndexOfColors = CursorUtil.getColumnIndexOrThrow(_cursor, "colors");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfMaterial = CursorUtil.getColumnIndexOrThrow(_cursor, "material");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "seasons");
          final int _cursorIndexOfLastUsed = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUsed");
          final List<Clothing> _result = new ArrayList<Clothing>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Clothing _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpPhotoUri;
            if (_cursor.isNull(_cursorIndexOfPhotoUri)) {
              _tmpPhotoUri = null;
            } else {
              _tmpPhotoUri = _cursor.getString(_cursorIndexOfPhotoUri);
            }
            final List<String> _tmpColors;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfColors)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfColors);
            }
            _tmpColors = __typeConverters.stringToListString(_tmp);
            final List<Category> _tmpType;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfType);
            }
            _tmpType = __typeConverters.stringToListCatgory(_tmp_1);
            final List<Materials> _tmpMaterial;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfMaterial)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfMaterial);
            }
            _tmpMaterial = __typeConverters.stringToListMaterial(_tmp_2);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final boolean _tmpIsFavorite;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_3 != 0;
            final List<Season> _tmpSeasons;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfSeasons)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfSeasons);
            }
            _tmpSeasons = __typeConverters.stringToListSeason(_tmp_4);
            final long _tmpLastUsed;
            _tmpLastUsed = _cursor.getLong(_cursorIndexOfLastUsed);
            _item = new Clothing(_tmpId,_tmpName,_tmpPhotoUri,_tmpColors,_tmpType,_tmpMaterial,_tmpPrice,_tmpIsFavorite,_tmpSeasons,_tmpLastUsed);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Clothing>> getClothes(final String order) {
    final String _sql = "SELECT * FROM clothing ORDER BY CASE WHEN ? = 'id' THEN id END DESC, CASE WHEN ? = 'name' THEN name END";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (order == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, order);
    }
    _argIndex = 2;
    if (order == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, order);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"clothing"}, new Callable<List<Clothing>>() {
      @Override
      public List<Clothing> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "photoUri");
          final int _cursorIndexOfColors = CursorUtil.getColumnIndexOrThrow(_cursor, "colors");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfMaterial = CursorUtil.getColumnIndexOrThrow(_cursor, "material");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "seasons");
          final int _cursorIndexOfLastUsed = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUsed");
          final List<Clothing> _result = new ArrayList<Clothing>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Clothing _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpPhotoUri;
            if (_cursor.isNull(_cursorIndexOfPhotoUri)) {
              _tmpPhotoUri = null;
            } else {
              _tmpPhotoUri = _cursor.getString(_cursorIndexOfPhotoUri);
            }
            final List<String> _tmpColors;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfColors)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfColors);
            }
            _tmpColors = __typeConverters.stringToListString(_tmp);
            final List<Category> _tmpType;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfType);
            }
            _tmpType = __typeConverters.stringToListCatgory(_tmp_1);
            final List<Materials> _tmpMaterial;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfMaterial)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfMaterial);
            }
            _tmpMaterial = __typeConverters.stringToListMaterial(_tmp_2);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final boolean _tmpIsFavorite;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_3 != 0;
            final List<Season> _tmpSeasons;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfSeasons)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfSeasons);
            }
            _tmpSeasons = __typeConverters.stringToListSeason(_tmp_4);
            final long _tmpLastUsed;
            _tmpLastUsed = _cursor.getLong(_cursorIndexOfLastUsed);
            _item = new Clothing(_tmpId,_tmpName,_tmpPhotoUri,_tmpColors,_tmpType,_tmpMaterial,_tmpPrice,_tmpIsFavorite,_tmpSeasons,_tmpLastUsed);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<String> getClothesByType(final String type) {
    final String _sql = "SELECT photoUri FROM clothing WHERE LOWER(type) LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getString(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Clothing getItemById(final int id) {
    final String _sql = "SELECT * FROM clothing WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "photoUri");
      final int _cursorIndexOfColors = CursorUtil.getColumnIndexOrThrow(_cursor, "colors");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfMaterial = CursorUtil.getColumnIndexOrThrow(_cursor, "material");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
      final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
      final int _cursorIndexOfSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "seasons");
      final int _cursorIndexOfLastUsed = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUsed");
      final Clothing _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpPhotoUri;
        if (_cursor.isNull(_cursorIndexOfPhotoUri)) {
          _tmpPhotoUri = null;
        } else {
          _tmpPhotoUri = _cursor.getString(_cursorIndexOfPhotoUri);
        }
        final List<String> _tmpColors;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfColors)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfColors);
        }
        _tmpColors = __typeConverters.stringToListString(_tmp);
        final List<Category> _tmpType;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfType)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfType);
        }
        _tmpType = __typeConverters.stringToListCatgory(_tmp_1);
        final List<Materials> _tmpMaterial;
        final String _tmp_2;
        if (_cursor.isNull(_cursorIndexOfMaterial)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getString(_cursorIndexOfMaterial);
        }
        _tmpMaterial = __typeConverters.stringToListMaterial(_tmp_2);
        final int _tmpPrice;
        _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
        final boolean _tmpIsFavorite;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp_3 != 0;
        final List<Season> _tmpSeasons;
        final String _tmp_4;
        if (_cursor.isNull(_cursorIndexOfSeasons)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getString(_cursorIndexOfSeasons);
        }
        _tmpSeasons = __typeConverters.stringToListSeason(_tmp_4);
        final long _tmpLastUsed;
        _tmpLastUsed = _cursor.getLong(_cursorIndexOfLastUsed);
        _result = new Clothing(_tmpId,_tmpName,_tmpPhotoUri,_tmpColors,_tmpType,_tmpMaterial,_tmpPrice,_tmpIsFavorite,_tmpSeasons,_tmpLastUsed);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Flow<List<Clothing>> searchClothes(final String query) {
    final String _sql = "SELECT * FROM clothing WHERE LOWER(name) LIKE LOWER(?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"clothing"}, new Callable<List<Clothing>>() {
      @Override
      public List<Clothing> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "photoUri");
          final int _cursorIndexOfColors = CursorUtil.getColumnIndexOrThrow(_cursor, "colors");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfMaterial = CursorUtil.getColumnIndexOrThrow(_cursor, "material");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "seasons");
          final int _cursorIndexOfLastUsed = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUsed");
          final List<Clothing> _result = new ArrayList<Clothing>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Clothing _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpPhotoUri;
            if (_cursor.isNull(_cursorIndexOfPhotoUri)) {
              _tmpPhotoUri = null;
            } else {
              _tmpPhotoUri = _cursor.getString(_cursorIndexOfPhotoUri);
            }
            final List<String> _tmpColors;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfColors)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfColors);
            }
            _tmpColors = __typeConverters.stringToListString(_tmp);
            final List<Category> _tmpType;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfType);
            }
            _tmpType = __typeConverters.stringToListCatgory(_tmp_1);
            final List<Materials> _tmpMaterial;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfMaterial)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfMaterial);
            }
            _tmpMaterial = __typeConverters.stringToListMaterial(_tmp_2);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final boolean _tmpIsFavorite;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_3 != 0;
            final List<Season> _tmpSeasons;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfSeasons)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfSeasons);
            }
            _tmpSeasons = __typeConverters.stringToListSeason(_tmp_4);
            final long _tmpLastUsed;
            _tmpLastUsed = _cursor.getLong(_cursorIndexOfLastUsed);
            _item = new Clothing(_tmpId,_tmpName,_tmpPhotoUri,_tmpColors,_tmpType,_tmpMaterial,_tmpPrice,_tmpIsFavorite,_tmpSeasons,_tmpLastUsed);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Clothing>> getClothesBySeason(final String season) {
    final String _sql = "SELECT * FROM clothing WHERE seasons LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (season == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, season);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"clothing"}, new Callable<List<Clothing>>() {
      @Override
      public List<Clothing> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "photoUri");
          final int _cursorIndexOfColors = CursorUtil.getColumnIndexOrThrow(_cursor, "colors");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfMaterial = CursorUtil.getColumnIndexOrThrow(_cursor, "material");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "seasons");
          final int _cursorIndexOfLastUsed = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUsed");
          final List<Clothing> _result = new ArrayList<Clothing>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Clothing _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpPhotoUri;
            if (_cursor.isNull(_cursorIndexOfPhotoUri)) {
              _tmpPhotoUri = null;
            } else {
              _tmpPhotoUri = _cursor.getString(_cursorIndexOfPhotoUri);
            }
            final List<String> _tmpColors;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfColors)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfColors);
            }
            _tmpColors = __typeConverters.stringToListString(_tmp);
            final List<Category> _tmpType;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfType);
            }
            _tmpType = __typeConverters.stringToListCatgory(_tmp_1);
            final List<Materials> _tmpMaterial;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfMaterial)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfMaterial);
            }
            _tmpMaterial = __typeConverters.stringToListMaterial(_tmp_2);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final boolean _tmpIsFavorite;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_3 != 0;
            final List<Season> _tmpSeasons;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfSeasons)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfSeasons);
            }
            _tmpSeasons = __typeConverters.stringToListSeason(_tmp_4);
            final long _tmpLastUsed;
            _tmpLastUsed = _cursor.getLong(_cursorIndexOfLastUsed);
            _item = new Clothing(_tmpId,_tmpName,_tmpPhotoUri,_tmpColors,_tmpType,_tmpMaterial,_tmpPrice,_tmpIsFavorite,_tmpSeasons,_tmpLastUsed);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Clothing>> getClothesBySeason(final String season, final String order) {
    final String _sql = "SELECT * FROM clothing WHERE seasons LIKE ? ORDER BY CASE WHEN ? = 'id' THEN id END DESC, CASE WHEN ? = 'name' THEN name END";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (season == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, season);
    }
    _argIndex = 2;
    if (order == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, order);
    }
    _argIndex = 3;
    if (order == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, order);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"clothing"}, new Callable<List<Clothing>>() {
      @Override
      public List<Clothing> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "photoUri");
          final int _cursorIndexOfColors = CursorUtil.getColumnIndexOrThrow(_cursor, "colors");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfMaterial = CursorUtil.getColumnIndexOrThrow(_cursor, "material");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "seasons");
          final int _cursorIndexOfLastUsed = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUsed");
          final List<Clothing> _result = new ArrayList<Clothing>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Clothing _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpPhotoUri;
            if (_cursor.isNull(_cursorIndexOfPhotoUri)) {
              _tmpPhotoUri = null;
            } else {
              _tmpPhotoUri = _cursor.getString(_cursorIndexOfPhotoUri);
            }
            final List<String> _tmpColors;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfColors)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfColors);
            }
            _tmpColors = __typeConverters.stringToListString(_tmp);
            final List<Category> _tmpType;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfType);
            }
            _tmpType = __typeConverters.stringToListCatgory(_tmp_1);
            final List<Materials> _tmpMaterial;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfMaterial)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfMaterial);
            }
            _tmpMaterial = __typeConverters.stringToListMaterial(_tmp_2);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final boolean _tmpIsFavorite;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp_3 != 0;
            final List<Season> _tmpSeasons;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfSeasons)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfSeasons);
            }
            _tmpSeasons = __typeConverters.stringToListSeason(_tmp_4);
            final long _tmpLastUsed;
            _tmpLastUsed = _cursor.getLong(_cursorIndexOfLastUsed);
            _item = new Clothing(_tmpId,_tmpName,_tmpPhotoUri,_tmpColors,_tmpType,_tmpMaterial,_tmpPrice,_tmpIsFavorite,_tmpSeasons,_tmpLastUsed);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
