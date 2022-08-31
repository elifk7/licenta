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
import com.axiel7.mydrobe.models.Outfit;
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
public final class OutfitDao_Impl implements OutfitDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Outfit> __insertionAdapterOfOutfit;

  private final TypeConverters __typeConverters = new TypeConverters();

  private final EntityDeletionOrUpdateAdapter<Outfit> __deletionAdapterOfOutfit;

  private final EntityDeletionOrUpdateAdapter<Outfit> __updateAdapterOfOutfit;

  public OutfitDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOutfit = new EntityInsertionAdapter<Outfit>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Outfit` (`id`,`name`,`top`,`topPhotoUri`,`bottom`,`bottomPhotoUri`,`shoes`,`shoesPhotoUri`,`season`,`data`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Outfit value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getTop() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTop());
        }
        if (value.getTopPhotoUri() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTopPhotoUri());
        }
        if (value.getBottom() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBottom());
        }
        if (value.getBottomPhotoUri() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBottomPhotoUri());
        }
        if (value.getShoes() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getShoes());
        }
        if (value.getShoesPhotoUri() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getShoesPhotoUri());
        }
        final String _tmp;
        _tmp = __typeConverters.listSeasonToString(value.getSeason());
        if (_tmp == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp);
        }
        if (value.getData() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getData());
        }
      }
    };
    this.__deletionAdapterOfOutfit = new EntityDeletionOrUpdateAdapter<Outfit>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Outfit` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Outfit value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfOutfit = new EntityDeletionOrUpdateAdapter<Outfit>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Outfit` SET `id` = ?,`name` = ?,`top` = ?,`topPhotoUri` = ?,`bottom` = ?,`bottomPhotoUri` = ?,`shoes` = ?,`shoesPhotoUri` = ?,`season` = ?,`data` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Outfit value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getTop() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTop());
        }
        if (value.getTopPhotoUri() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTopPhotoUri());
        }
        if (value.getBottom() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBottom());
        }
        if (value.getBottomPhotoUri() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBottomPhotoUri());
        }
        if (value.getShoes() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getShoes());
        }
        if (value.getShoesPhotoUri() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getShoesPhotoUri());
        }
        final String _tmp;
        _tmp = __typeConverters.listSeasonToString(value.getSeason());
        if (_tmp == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp);
        }
        if (value.getData() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getData());
        }
        stmt.bindLong(11, value.getId());
      }
    };
  }

  @Override
  public Object addOutfit(final Outfit outfit, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfOutfit.insert(outfit);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object removeOutfit(final Outfit outfit, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfOutfit.handle(outfit);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateOutfit(final Outfit outfit, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfOutfit.handle(outfit);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Flow<List<Outfit>> getOutfits() {
    final String _sql = "SELECT * FROM outfit";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"outfit"}, new Callable<List<Outfit>>() {
      @Override
      public List<Outfit> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTop = CursorUtil.getColumnIndexOrThrow(_cursor, "top");
          final int _cursorIndexOfTopPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "topPhotoUri");
          final int _cursorIndexOfBottom = CursorUtil.getColumnIndexOrThrow(_cursor, "bottom");
          final int _cursorIndexOfBottomPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "bottomPhotoUri");
          final int _cursorIndexOfShoes = CursorUtil.getColumnIndexOrThrow(_cursor, "shoes");
          final int _cursorIndexOfShoesPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "shoesPhotoUri");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final List<Outfit> _result = new ArrayList<Outfit>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Outfit _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpTop;
            if (_cursor.isNull(_cursorIndexOfTop)) {
              _tmpTop = null;
            } else {
              _tmpTop = _cursor.getString(_cursorIndexOfTop);
            }
            final String _tmpTopPhotoUri;
            if (_cursor.isNull(_cursorIndexOfTopPhotoUri)) {
              _tmpTopPhotoUri = null;
            } else {
              _tmpTopPhotoUri = _cursor.getString(_cursorIndexOfTopPhotoUri);
            }
            final String _tmpBottom;
            if (_cursor.isNull(_cursorIndexOfBottom)) {
              _tmpBottom = null;
            } else {
              _tmpBottom = _cursor.getString(_cursorIndexOfBottom);
            }
            final String _tmpBottomPhotoUri;
            if (_cursor.isNull(_cursorIndexOfBottomPhotoUri)) {
              _tmpBottomPhotoUri = null;
            } else {
              _tmpBottomPhotoUri = _cursor.getString(_cursorIndexOfBottomPhotoUri);
            }
            final String _tmpShoes;
            if (_cursor.isNull(_cursorIndexOfShoes)) {
              _tmpShoes = null;
            } else {
              _tmpShoes = _cursor.getString(_cursorIndexOfShoes);
            }
            final String _tmpShoesPhotoUri;
            if (_cursor.isNull(_cursorIndexOfShoesPhotoUri)) {
              _tmpShoesPhotoUri = null;
            } else {
              _tmpShoesPhotoUri = _cursor.getString(_cursorIndexOfShoesPhotoUri);
            }
            final List<Season> _tmpSeason;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSeason)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSeason);
            }
            _tmpSeason = __typeConverters.stringToListSeason(_tmp);
            final String _tmpData;
            if (_cursor.isNull(_cursorIndexOfData)) {
              _tmpData = null;
            } else {
              _tmpData = _cursor.getString(_cursorIndexOfData);
            }
            _item = new Outfit(_tmpId,_tmpName,_tmpTop,_tmpTopPhotoUri,_tmpBottom,_tmpBottomPhotoUri,_tmpShoes,_tmpShoesPhotoUri,_tmpSeason,_tmpData);
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
  public Flow<List<Outfit>> getOutfits(final String order) {
    final String _sql = "SELECT * FROM outfit ORDER BY CASE WHEN ? = 'id' THEN id END DESC, CASE WHEN ? = 'name' THEN name END";
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
    return CoroutinesRoom.createFlow(__db, false, new String[]{"outfit"}, new Callable<List<Outfit>>() {
      @Override
      public List<Outfit> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTop = CursorUtil.getColumnIndexOrThrow(_cursor, "top");
          final int _cursorIndexOfTopPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "topPhotoUri");
          final int _cursorIndexOfBottom = CursorUtil.getColumnIndexOrThrow(_cursor, "bottom");
          final int _cursorIndexOfBottomPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "bottomPhotoUri");
          final int _cursorIndexOfShoes = CursorUtil.getColumnIndexOrThrow(_cursor, "shoes");
          final int _cursorIndexOfShoesPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "shoesPhotoUri");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final List<Outfit> _result = new ArrayList<Outfit>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Outfit _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpTop;
            if (_cursor.isNull(_cursorIndexOfTop)) {
              _tmpTop = null;
            } else {
              _tmpTop = _cursor.getString(_cursorIndexOfTop);
            }
            final String _tmpTopPhotoUri;
            if (_cursor.isNull(_cursorIndexOfTopPhotoUri)) {
              _tmpTopPhotoUri = null;
            } else {
              _tmpTopPhotoUri = _cursor.getString(_cursorIndexOfTopPhotoUri);
            }
            final String _tmpBottom;
            if (_cursor.isNull(_cursorIndexOfBottom)) {
              _tmpBottom = null;
            } else {
              _tmpBottom = _cursor.getString(_cursorIndexOfBottom);
            }
            final String _tmpBottomPhotoUri;
            if (_cursor.isNull(_cursorIndexOfBottomPhotoUri)) {
              _tmpBottomPhotoUri = null;
            } else {
              _tmpBottomPhotoUri = _cursor.getString(_cursorIndexOfBottomPhotoUri);
            }
            final String _tmpShoes;
            if (_cursor.isNull(_cursorIndexOfShoes)) {
              _tmpShoes = null;
            } else {
              _tmpShoes = _cursor.getString(_cursorIndexOfShoes);
            }
            final String _tmpShoesPhotoUri;
            if (_cursor.isNull(_cursorIndexOfShoesPhotoUri)) {
              _tmpShoesPhotoUri = null;
            } else {
              _tmpShoesPhotoUri = _cursor.getString(_cursorIndexOfShoesPhotoUri);
            }
            final List<Season> _tmpSeason;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSeason)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSeason);
            }
            _tmpSeason = __typeConverters.stringToListSeason(_tmp);
            final String _tmpData;
            if (_cursor.isNull(_cursorIndexOfData)) {
              _tmpData = null;
            } else {
              _tmpData = _cursor.getString(_cursorIndexOfData);
            }
            _item = new Outfit(_tmpId,_tmpName,_tmpTop,_tmpTopPhotoUri,_tmpBottom,_tmpBottomPhotoUri,_tmpShoes,_tmpShoesPhotoUri,_tmpSeason,_tmpData);
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
  public Flow<Outfit> getItemById(final int id) {
    final String _sql = "SELECT * FROM outfit WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"outfit"}, new Callable<Outfit>() {
      @Override
      public Outfit call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTop = CursorUtil.getColumnIndexOrThrow(_cursor, "top");
          final int _cursorIndexOfTopPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "topPhotoUri");
          final int _cursorIndexOfBottom = CursorUtil.getColumnIndexOrThrow(_cursor, "bottom");
          final int _cursorIndexOfBottomPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "bottomPhotoUri");
          final int _cursorIndexOfShoes = CursorUtil.getColumnIndexOrThrow(_cursor, "shoes");
          final int _cursorIndexOfShoesPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "shoesPhotoUri");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final Outfit _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpTop;
            if (_cursor.isNull(_cursorIndexOfTop)) {
              _tmpTop = null;
            } else {
              _tmpTop = _cursor.getString(_cursorIndexOfTop);
            }
            final String _tmpTopPhotoUri;
            if (_cursor.isNull(_cursorIndexOfTopPhotoUri)) {
              _tmpTopPhotoUri = null;
            } else {
              _tmpTopPhotoUri = _cursor.getString(_cursorIndexOfTopPhotoUri);
            }
            final String _tmpBottom;
            if (_cursor.isNull(_cursorIndexOfBottom)) {
              _tmpBottom = null;
            } else {
              _tmpBottom = _cursor.getString(_cursorIndexOfBottom);
            }
            final String _tmpBottomPhotoUri;
            if (_cursor.isNull(_cursorIndexOfBottomPhotoUri)) {
              _tmpBottomPhotoUri = null;
            } else {
              _tmpBottomPhotoUri = _cursor.getString(_cursorIndexOfBottomPhotoUri);
            }
            final String _tmpShoes;
            if (_cursor.isNull(_cursorIndexOfShoes)) {
              _tmpShoes = null;
            } else {
              _tmpShoes = _cursor.getString(_cursorIndexOfShoes);
            }
            final String _tmpShoesPhotoUri;
            if (_cursor.isNull(_cursorIndexOfShoesPhotoUri)) {
              _tmpShoesPhotoUri = null;
            } else {
              _tmpShoesPhotoUri = _cursor.getString(_cursorIndexOfShoesPhotoUri);
            }
            final List<Season> _tmpSeason;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSeason)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSeason);
            }
            _tmpSeason = __typeConverters.stringToListSeason(_tmp);
            final String _tmpData;
            if (_cursor.isNull(_cursorIndexOfData)) {
              _tmpData = null;
            } else {
              _tmpData = _cursor.getString(_cursorIndexOfData);
            }
            _result = new Outfit(_tmpId,_tmpName,_tmpTop,_tmpTopPhotoUri,_tmpBottom,_tmpBottomPhotoUri,_tmpShoes,_tmpShoesPhotoUri,_tmpSeason,_tmpData);
          } else {
            _result = null;
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
  public Flow<List<Outfit>> searchTop(final String top) {
    final String _sql = "SELECT * FROM outfit WHERE LOWER(top) LIKE LOWER(?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (top == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, top);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"outfit"}, new Callable<List<Outfit>>() {
      @Override
      public List<Outfit> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTop = CursorUtil.getColumnIndexOrThrow(_cursor, "top");
          final int _cursorIndexOfTopPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "topPhotoUri");
          final int _cursorIndexOfBottom = CursorUtil.getColumnIndexOrThrow(_cursor, "bottom");
          final int _cursorIndexOfBottomPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "bottomPhotoUri");
          final int _cursorIndexOfShoes = CursorUtil.getColumnIndexOrThrow(_cursor, "shoes");
          final int _cursorIndexOfShoesPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "shoesPhotoUri");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final List<Outfit> _result = new ArrayList<Outfit>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Outfit _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpTop;
            if (_cursor.isNull(_cursorIndexOfTop)) {
              _tmpTop = null;
            } else {
              _tmpTop = _cursor.getString(_cursorIndexOfTop);
            }
            final String _tmpTopPhotoUri;
            if (_cursor.isNull(_cursorIndexOfTopPhotoUri)) {
              _tmpTopPhotoUri = null;
            } else {
              _tmpTopPhotoUri = _cursor.getString(_cursorIndexOfTopPhotoUri);
            }
            final String _tmpBottom;
            if (_cursor.isNull(_cursorIndexOfBottom)) {
              _tmpBottom = null;
            } else {
              _tmpBottom = _cursor.getString(_cursorIndexOfBottom);
            }
            final String _tmpBottomPhotoUri;
            if (_cursor.isNull(_cursorIndexOfBottomPhotoUri)) {
              _tmpBottomPhotoUri = null;
            } else {
              _tmpBottomPhotoUri = _cursor.getString(_cursorIndexOfBottomPhotoUri);
            }
            final String _tmpShoes;
            if (_cursor.isNull(_cursorIndexOfShoes)) {
              _tmpShoes = null;
            } else {
              _tmpShoes = _cursor.getString(_cursorIndexOfShoes);
            }
            final String _tmpShoesPhotoUri;
            if (_cursor.isNull(_cursorIndexOfShoesPhotoUri)) {
              _tmpShoesPhotoUri = null;
            } else {
              _tmpShoesPhotoUri = _cursor.getString(_cursorIndexOfShoesPhotoUri);
            }
            final List<Season> _tmpSeason;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSeason)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSeason);
            }
            _tmpSeason = __typeConverters.stringToListSeason(_tmp);
            final String _tmpData;
            if (_cursor.isNull(_cursorIndexOfData)) {
              _tmpData = null;
            } else {
              _tmpData = _cursor.getString(_cursorIndexOfData);
            }
            _item = new Outfit(_tmpId,_tmpName,_tmpTop,_tmpTopPhotoUri,_tmpBottom,_tmpBottomPhotoUri,_tmpShoes,_tmpShoesPhotoUri,_tmpSeason,_tmpData);
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
  public Flow<List<Outfit>> searchBottom(final String bottom) {
    final String _sql = "SELECT * FROM outfit WHERE LOWER(bottom) LIKE LOWER(?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (bottom == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, bottom);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"outfit"}, new Callable<List<Outfit>>() {
      @Override
      public List<Outfit> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTop = CursorUtil.getColumnIndexOrThrow(_cursor, "top");
          final int _cursorIndexOfTopPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "topPhotoUri");
          final int _cursorIndexOfBottom = CursorUtil.getColumnIndexOrThrow(_cursor, "bottom");
          final int _cursorIndexOfBottomPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "bottomPhotoUri");
          final int _cursorIndexOfShoes = CursorUtil.getColumnIndexOrThrow(_cursor, "shoes");
          final int _cursorIndexOfShoesPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "shoesPhotoUri");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final List<Outfit> _result = new ArrayList<Outfit>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Outfit _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpTop;
            if (_cursor.isNull(_cursorIndexOfTop)) {
              _tmpTop = null;
            } else {
              _tmpTop = _cursor.getString(_cursorIndexOfTop);
            }
            final String _tmpTopPhotoUri;
            if (_cursor.isNull(_cursorIndexOfTopPhotoUri)) {
              _tmpTopPhotoUri = null;
            } else {
              _tmpTopPhotoUri = _cursor.getString(_cursorIndexOfTopPhotoUri);
            }
            final String _tmpBottom;
            if (_cursor.isNull(_cursorIndexOfBottom)) {
              _tmpBottom = null;
            } else {
              _tmpBottom = _cursor.getString(_cursorIndexOfBottom);
            }
            final String _tmpBottomPhotoUri;
            if (_cursor.isNull(_cursorIndexOfBottomPhotoUri)) {
              _tmpBottomPhotoUri = null;
            } else {
              _tmpBottomPhotoUri = _cursor.getString(_cursorIndexOfBottomPhotoUri);
            }
            final String _tmpShoes;
            if (_cursor.isNull(_cursorIndexOfShoes)) {
              _tmpShoes = null;
            } else {
              _tmpShoes = _cursor.getString(_cursorIndexOfShoes);
            }
            final String _tmpShoesPhotoUri;
            if (_cursor.isNull(_cursorIndexOfShoesPhotoUri)) {
              _tmpShoesPhotoUri = null;
            } else {
              _tmpShoesPhotoUri = _cursor.getString(_cursorIndexOfShoesPhotoUri);
            }
            final List<Season> _tmpSeason;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSeason)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSeason);
            }
            _tmpSeason = __typeConverters.stringToListSeason(_tmp);
            final String _tmpData;
            if (_cursor.isNull(_cursorIndexOfData)) {
              _tmpData = null;
            } else {
              _tmpData = _cursor.getString(_cursorIndexOfData);
            }
            _item = new Outfit(_tmpId,_tmpName,_tmpTop,_tmpTopPhotoUri,_tmpBottom,_tmpBottomPhotoUri,_tmpShoes,_tmpShoesPhotoUri,_tmpSeason,_tmpData);
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
  public Flow<List<Outfit>> searchShoes(final String shoes) {
    final String _sql = "SELECT * FROM outfit WHERE LOWER(shoes) LIKE LOWER(?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (shoes == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, shoes);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"outfit"}, new Callable<List<Outfit>>() {
      @Override
      public List<Outfit> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTop = CursorUtil.getColumnIndexOrThrow(_cursor, "top");
          final int _cursorIndexOfTopPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "topPhotoUri");
          final int _cursorIndexOfBottom = CursorUtil.getColumnIndexOrThrow(_cursor, "bottom");
          final int _cursorIndexOfBottomPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "bottomPhotoUri");
          final int _cursorIndexOfShoes = CursorUtil.getColumnIndexOrThrow(_cursor, "shoes");
          final int _cursorIndexOfShoesPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "shoesPhotoUri");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final List<Outfit> _result = new ArrayList<Outfit>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Outfit _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpTop;
            if (_cursor.isNull(_cursorIndexOfTop)) {
              _tmpTop = null;
            } else {
              _tmpTop = _cursor.getString(_cursorIndexOfTop);
            }
            final String _tmpTopPhotoUri;
            if (_cursor.isNull(_cursorIndexOfTopPhotoUri)) {
              _tmpTopPhotoUri = null;
            } else {
              _tmpTopPhotoUri = _cursor.getString(_cursorIndexOfTopPhotoUri);
            }
            final String _tmpBottom;
            if (_cursor.isNull(_cursorIndexOfBottom)) {
              _tmpBottom = null;
            } else {
              _tmpBottom = _cursor.getString(_cursorIndexOfBottom);
            }
            final String _tmpBottomPhotoUri;
            if (_cursor.isNull(_cursorIndexOfBottomPhotoUri)) {
              _tmpBottomPhotoUri = null;
            } else {
              _tmpBottomPhotoUri = _cursor.getString(_cursorIndexOfBottomPhotoUri);
            }
            final String _tmpShoes;
            if (_cursor.isNull(_cursorIndexOfShoes)) {
              _tmpShoes = null;
            } else {
              _tmpShoes = _cursor.getString(_cursorIndexOfShoes);
            }
            final String _tmpShoesPhotoUri;
            if (_cursor.isNull(_cursorIndexOfShoesPhotoUri)) {
              _tmpShoesPhotoUri = null;
            } else {
              _tmpShoesPhotoUri = _cursor.getString(_cursorIndexOfShoesPhotoUri);
            }
            final List<Season> _tmpSeason;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSeason)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSeason);
            }
            _tmpSeason = __typeConverters.stringToListSeason(_tmp);
            final String _tmpData;
            if (_cursor.isNull(_cursorIndexOfData)) {
              _tmpData = null;
            } else {
              _tmpData = _cursor.getString(_cursorIndexOfData);
            }
            _item = new Outfit(_tmpId,_tmpName,_tmpTop,_tmpTopPhotoUri,_tmpBottom,_tmpBottomPhotoUri,_tmpShoes,_tmpShoesPhotoUri,_tmpSeason,_tmpData);
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
  public Flow<List<Outfit>> getOutfitsBySeason(final String season) {
    final String _sql = "SELECT * FROM outfit WHERE season LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (season == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, season);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"outfit"}, new Callable<List<Outfit>>() {
      @Override
      public List<Outfit> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTop = CursorUtil.getColumnIndexOrThrow(_cursor, "top");
          final int _cursorIndexOfTopPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "topPhotoUri");
          final int _cursorIndexOfBottom = CursorUtil.getColumnIndexOrThrow(_cursor, "bottom");
          final int _cursorIndexOfBottomPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "bottomPhotoUri");
          final int _cursorIndexOfShoes = CursorUtil.getColumnIndexOrThrow(_cursor, "shoes");
          final int _cursorIndexOfShoesPhotoUri = CursorUtil.getColumnIndexOrThrow(_cursor, "shoesPhotoUri");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final List<Outfit> _result = new ArrayList<Outfit>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Outfit _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpTop;
            if (_cursor.isNull(_cursorIndexOfTop)) {
              _tmpTop = null;
            } else {
              _tmpTop = _cursor.getString(_cursorIndexOfTop);
            }
            final String _tmpTopPhotoUri;
            if (_cursor.isNull(_cursorIndexOfTopPhotoUri)) {
              _tmpTopPhotoUri = null;
            } else {
              _tmpTopPhotoUri = _cursor.getString(_cursorIndexOfTopPhotoUri);
            }
            final String _tmpBottom;
            if (_cursor.isNull(_cursorIndexOfBottom)) {
              _tmpBottom = null;
            } else {
              _tmpBottom = _cursor.getString(_cursorIndexOfBottom);
            }
            final String _tmpBottomPhotoUri;
            if (_cursor.isNull(_cursorIndexOfBottomPhotoUri)) {
              _tmpBottomPhotoUri = null;
            } else {
              _tmpBottomPhotoUri = _cursor.getString(_cursorIndexOfBottomPhotoUri);
            }
            final String _tmpShoes;
            if (_cursor.isNull(_cursorIndexOfShoes)) {
              _tmpShoes = null;
            } else {
              _tmpShoes = _cursor.getString(_cursorIndexOfShoes);
            }
            final String _tmpShoesPhotoUri;
            if (_cursor.isNull(_cursorIndexOfShoesPhotoUri)) {
              _tmpShoesPhotoUri = null;
            } else {
              _tmpShoesPhotoUri = _cursor.getString(_cursorIndexOfShoesPhotoUri);
            }
            final List<Season> _tmpSeason;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfSeason)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfSeason);
            }
            _tmpSeason = __typeConverters.stringToListSeason(_tmp);
            final String _tmpData;
            if (_cursor.isNull(_cursorIndexOfData)) {
              _tmpData = null;
            } else {
              _tmpData = _cursor.getString(_cursorIndexOfData);
            }
            _item = new Outfit(_tmpId,_tmpName,_tmpTop,_tmpTopPhotoUri,_tmpBottom,_tmpBottomPhotoUri,_tmpShoes,_tmpShoesPhotoUri,_tmpSeason,_tmpData);
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
