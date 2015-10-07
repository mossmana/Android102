package net.killerandroid.android102.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by davidpos on 10/6/15.
 */
public class TaskHelper extends SQLiteOpenHelper {
    public static final String TABLE_TASK = "TASK";

    public static final String COLUMN_ID = "_ID";
    public static final String COLUMN_CHORE = "CHORES";

    private static final String DB_NAME = "task.db";
    private static final int DB_VERSION = 1;
    private static final String CREATE_TABLE_TASK =
            "CREATE TABLE " + TABLE_TASK + " ("+
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_CHORE + " TEXT)";




    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_TASK);




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
