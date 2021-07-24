package com.crisav2.mobiletest3.repository.database.db;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.crisav2.mobiletest3.repository.model.PostTable;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PostDao_Impl implements PostDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PostTable> __insertionAdapterOfPostTable;

  private final SharedSQLiteStatement __preparedStmtOfClearPosts;

  private final SharedSQLiteStatement __preparedStmtOfClearPost;

  private final SharedSQLiteStatement __preparedStmtOfUpdateHasBeenOpened;

  private final SharedSQLiteStatement __preparedStmtOfUpdateIsFavorite;

  public PostDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPostTable = new EntityInsertionAdapter<PostTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `posts_table` (`id`,`description`,`short_description`,`user_id`,`has_been_opened`,`is_favorite`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PostTable value) {
        stmt.bindLong(1, value.getId());
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        if (value.getShortDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getShortDescription());
        }
        stmt.bindLong(4, value.getUserId());
        final int _tmp;
        _tmp = value.getHasBeenOpened() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isFavorite() ? 1 : 0;
        stmt.bindLong(6, _tmp_1);
      }
    };
    this.__preparedStmtOfClearPosts = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM posts_table";
        return _query;
      }
    };
    this.__preparedStmtOfClearPost = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM posts_table WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateHasBeenOpened = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE posts_table SET has_been_opened = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateIsFavorite = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE posts_table SET is_favorite = ? WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<PostTable> posts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPostTable.insert(posts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clearPosts() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearPosts.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearPosts.release(_stmt);
    }
  }

  @Override
  public void clearPost(final int postId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearPost.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, postId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearPost.release(_stmt);
    }
  }

  @Override
  public void updateHasBeenOpened(final boolean hasBeenOpen, final int postId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateHasBeenOpened.acquire();
    int _argIndex = 1;
    final int _tmp;
    _tmp = hasBeenOpen ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, postId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateHasBeenOpened.release(_stmt);
    }
  }

  @Override
  public void updateIsFavorite(final boolean isFavorite, final int postId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateIsFavorite.acquire();
    int _argIndex = 1;
    final int _tmp;
    _tmp = isFavorite ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, postId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateIsFavorite.release(_stmt);
    }
  }

  @Override
  public PostTable getPost(final int postId) {
    final String _sql = "SELECT * FROM posts_table WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, postId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfShortDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "short_description");
      final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
      final int _cursorIndexOfHasBeenOpened = CursorUtil.getColumnIndexOrThrow(_cursor, "has_been_opened");
      final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favorite");
      final PostTable _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpShortDescription;
        if (_cursor.isNull(_cursorIndexOfShortDescription)) {
          _tmpShortDescription = null;
        } else {
          _tmpShortDescription = _cursor.getString(_cursorIndexOfShortDescription);
        }
        final int _tmpUserId;
        _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
        final boolean _tmpHasBeenOpened;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfHasBeenOpened);
        _tmpHasBeenOpened = _tmp != 0;
        final boolean _tmpIsFavorite;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp_1 != 0;
        _result = new PostTable(_tmpId,_tmpDescription,_tmpShortDescription,_tmpUserId,_tmpHasBeenOpened,_tmpIsFavorite);
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
  public List<PostTable> getPosts() {
    final String _sql = "SELECT * FROM posts_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfShortDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "short_description");
      final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
      final int _cursorIndexOfHasBeenOpened = CursorUtil.getColumnIndexOrThrow(_cursor, "has_been_opened");
      final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favorite");
      final List<PostTable> _result = new ArrayList<PostTable>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final PostTable _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpShortDescription;
        if (_cursor.isNull(_cursorIndexOfShortDescription)) {
          _tmpShortDescription = null;
        } else {
          _tmpShortDescription = _cursor.getString(_cursorIndexOfShortDescription);
        }
        final int _tmpUserId;
        _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
        final boolean _tmpHasBeenOpened;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfHasBeenOpened);
        _tmpHasBeenOpened = _tmp != 0;
        final boolean _tmpIsFavorite;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp_1 != 0;
        _item = new PostTable(_tmpId,_tmpDescription,_tmpShortDescription,_tmpUserId,_tmpHasBeenOpened,_tmpIsFavorite);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
