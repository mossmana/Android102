package net.killerandroid.android102.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import net.killerandroid.android102.db.model.Chore;

import java.sql.SQLException;

/**
 * Created by davidpos on 10/6/15.
 */
public class TaskDataSource {
    private Context mContext;
    private TaskHelper mTaskHelper;
    private SQLiteDatabase mDatabase;

    public TaskDataSource(Context context) {
        mContext = context;
        mTaskHelper = new TaskHelper(mContext);
    }

    //open
    public void open() throws SQLException {
        mDatabase = mTaskHelper.getWritableDatabase();

    }

    //close
    public void close() {
        mDatabase.close();
    }

    //insert
    public void insertChore(Chore chore) {
        mDatabase.beginTransaction();
        try {
            ContentValues values = new ContentValues();
            values.put(TaskHelper.COLUMN_CHORE, chore.getChore());

        } finally {
            mDatabase.endTransaction();
        }
    }

    //update
    public Cursor selectChore() {
        Cursor cursor = mDatabase.query(
                TaskHelper.TABLE_TASK,//table
                new String[]{TaskHelper.COLUMN_ID, TaskHelper.COLUMN_CHORE},//column names
                null,//where clause
                null,//where params
                null,//groupby
                null,//having
                null//orderby
        );
        return cursor;
        //delete


    }
}


