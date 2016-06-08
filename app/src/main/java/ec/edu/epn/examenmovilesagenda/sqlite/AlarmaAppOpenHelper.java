package ec.edu.epn.examenmovilesagenda.sqlite;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Christian on 7/6/2016.
 */
public class AlarmaAppOpenHelper extends SQLiteOpenHelper {
    private static final int version=1;
    private static final String base_datos="examen_alarma.db";
    public AlarmaAppOpenHelper(Context context) {
        super(context, base_datos, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(AlarmaAppContract.CREAR_TABLA_CITA);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        if(newVersion>oldVersion) {
            db.execSQL(AlarmaAppContract.ELIMINA_TABLA_CITA);
            db.execSQL(AlarmaAppContract.CREAR_TABLA_CITA);
        }
        }
}
