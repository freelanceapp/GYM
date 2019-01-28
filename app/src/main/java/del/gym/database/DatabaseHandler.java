package del.gym.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import del.gym.modal.MyRoutineModal;


public class DatabaseHandler extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "routine.db";
    // Url table name
    private static final String TABLE_URL = "url_table";
    // Url Table Columns names

    private static final String KEY_ID = "id";
    private static final String KEY_EXERCISE_NAME = "exercise_name";
    private static final String KEY_REPETITIONS = "repetitions";
    private static final String KEY_SET = "set_a";
    private static final String KEY_WEIGHT = "weight";
    private static final String KEY_DAYS = "days";

    public DatabaseHandler(Context context, String databaseName) {
        super(context, databaseName, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_URL_TABLE = "CREATE TABLE " + TABLE_URL + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_EXERCISE_NAME + " TEXT," + KEY_REPETITIONS + " TEXT," + KEY_SET + " TEXT,"
                + KEY_WEIGHT + " TEXT, " + KEY_DAYS + " TEXT " + ")";
        db.execSQL(CREATE_URL_TABLE);
        Log.e("Table", CREATE_URL_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_URL);
        onCreate(db);
    }

    //Adding new Url
    public void addItemCart(MyRoutineModal urlModal) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_EXERCISE_NAME, urlModal.getExercise());
        values.put(KEY_REPETITIONS, urlModal.getRepetition());
        values.put(KEY_SET, urlModal.getCountSet());
        values.put(KEY_WEIGHT, urlModal.getWeight());
        values.put(KEY_DAYS, urlModal.getDays());

        // Inserting InstructionsRow
        db.insert(TABLE_URL, null, values);
        db.close(); // Closing database connection
    }

    // Getting single url
    public MyRoutineModal getSingleItem(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_URL, new String[]{KEY_ID, KEY_EXERCISE_NAME, KEY_REPETITIONS, KEY_SET, KEY_WEIGHT, KEY_DAYS},
                KEY_ID + "=?",
                new String[]{String.valueOf(id)}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        return new MyRoutineModal(Integer.parseInt(cursor.getString(0)), cursor.getString(1),
                cursor.getString(2), cursor.getString(3), cursor.getString(4),
                cursor.getString(5));
    }

    //Getting all Url list
    public List<MyRoutineModal> getAllUrlList() {
        List<MyRoutineModal> urlModalList = new ArrayList<>();
        String selectQuery = "SELECT * FROM " + TABLE_URL;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                MyRoutineModal urlModal = new MyRoutineModal();
                urlModal.set_id(Integer.parseInt(cursor.getString(0)));
                urlModal.setExercise(cursor.getString(1));
                urlModal.setRepetition(cursor.getString(2));
                urlModal.setCountSet(cursor.getString(3));
                urlModal.setWeight(cursor.getString(4));
                urlModal.setDays(cursor.getString(5));
                urlModalList.add(urlModal);
            } while (cursor.moveToNext());
        }

        return urlModalList;
    }

    // Updating single urlModal
    public int updateUrl(MyRoutineModal urlModal) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_ID, urlModal.get_id());
        values.put(KEY_EXERCISE_NAME, urlModal.getExercise());
        values.put(KEY_REPETITIONS, urlModal.getRepetition());
        values.put(KEY_SET, urlModal.getCountSet());
        values.put(KEY_WEIGHT, urlModal.getWeight());
        values.put(KEY_DAYS, urlModal.getDays());

        int updateValue = db.update(TABLE_URL, values, KEY_ID + " = ?", new String[]{String.valueOf(urlModal.get_id())});
        db.close();
        return updateValue;
    }

    // Deleting single url
    public void deleteContact(MyRoutineModal urlModal) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_URL, KEY_ID + " = ?",
                new String[]{String.valueOf(urlModal.get_id())});
        db.close();
    }

    // Getting url Count
    public boolean getContactsCount() {
        String countQuery = "SELECT  * FROM " + TABLE_URL;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int i = cursor.getCount();
        cursor.close();
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    //check exist data
    public boolean verification(String _username) {
        SQLiteDatabase db = this.getReadableDatabase();
        int count = -1;
        Cursor c = null;
        try {
            String query = "SELECT COUNT(*) FROM " + TABLE_URL + " WHERE " + KEY_EXERCISE_NAME + " = ?";
            c = db.rawQuery(query, new String[]{_username});
            if (c.moveToFirst()) {
                count = c.getInt(0);
            }
            return count > 0;
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }
}