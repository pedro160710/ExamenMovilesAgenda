package ec.edu.epn.examenmovilesagenda;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ec.edu.epn.examenmovilesagenda.sqlite.AlarmaAppOpenHelper;

public class ConsultadasCitas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultadas_citas);

        mostrarCitas();
    }

    public void mostrarCitas(){
        AlarmaAppOpenHelper alarmaAppOpenHelper = new AlarmaAppOpenHelper(getApplicationContext());
        SQLiteDatabase db = alarmaAppOpenHelper.getWritableDatabase();
String [] nombreCampos = new String[]{

        };
        Cursor cur = db.query("NOmbre tabla", new String[]{}, null, null, null, null, null);



    }


}
