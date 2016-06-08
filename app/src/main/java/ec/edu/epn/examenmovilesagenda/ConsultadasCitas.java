package ec.edu.epn.examenmovilesagenda;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import ec.edu.epn.examenmovilesagenda.sqlite.AlarmaAppContract;
import ec.edu.epn.examenmovilesagenda.sqlite.AlarmaAppOpenHelper;

public class ConsultadasCitas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultadas_citas);

        mostrarCitas();
    }

    public void mostrarCitas() {
        AlarmaAppOpenHelper alarmaAppOpenHelper = new AlarmaAppOpenHelper(getApplicationContext());
        SQLiteDatabase db = alarmaAppOpenHelper.getReadableDatabase();
        String[] nombreCampos = new String[]{
                AlarmaAppContract.TablaCita.COLUMNA_TITULO_CITA,
                AlarmaAppContract.TablaCita.COLUMNA_FECHA_CITA,
                AlarmaAppContract.TablaCita.COLUMNA_HORA_CITA,
        };

        Cursor cur = db.query(AlarmaAppContract.TablaCita.NOMBRE_TABLA, nombreCampos, null, null, null, null, null);

        while (cur.moveToNext()) {
            CitaVO citasVO = new CitaVO();
            citasVO.setTitulo(cur.getColumnIndex(0));
            citasVO.setFecha(cur.getColumnIndex(1));
            citasVO.setHora(cur.getColumnIndex(2));


        }

    }


}
