package ec.edu.epn.examenmovilesagenda;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adaptador.CitaAdapter;
import ec.edu.epn.examenmovilesagenda.sqlite.AlarmaAppContract;
import ec.edu.epn.examenmovilesagenda.sqlite.AlarmaAppOpenHelper;
import vo.CitaVO;

public class ConsultadasCitas extends AppCompatActivity {
    public List<CitaVO> listaCitas;
    private ListView listViewListaCitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultadas_citas);
        listaCitas = new ArrayList<CitaVO>();
        listViewListaCitas = (ListView) findViewById(R.id.lvCitas);
        
    }

    public void mostrarCitas(View view) {
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
            citasVO.setTituloCita(cur.getString(0));
            citasVO.setFechaCIta(cur.getString(1));
            citasVO.setHoraCita(cur.getString(2));
            listaCitas.add(citasVO);

        }

        CitaAdapter citaAdapter  = new CitaAdapter(this,listaCitas);
        listViewListaCitas.setAdapter(citaAdapter);
    }

}
