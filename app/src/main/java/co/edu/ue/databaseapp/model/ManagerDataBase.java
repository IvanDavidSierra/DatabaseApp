package co.edu.ue.databaseapp.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ManagerDataBase extends SQLiteOpenHelper {

    private static final String DATA_BASE = "db_users";
    private static final int VERSION = 1;
    private static final String TABLE_USERS = "users";

    //Constructor - @Nullable = no puede ser nulo el contexto
    public ManagerDataBase(@Nullable Context context) {
        super(context,DATA_BASE,null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database){
       // database.execSQL("");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
