package ec.edu.epn.examenmovilesagenda;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import ec.edu.epn.examenmovilesagenda.sqlite.AlarmaAppContract;
import ec.edu.epn.examenmovilesagenda.sqlite.AlarmaAppOpenHelper;

public class CrearCitas extends AppCompatActivity {
    private EditText editTextTitulo;
    private EditText editTextFecha;
    private EditText editTextHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_citas);
        editTextTitulo = (EditText) findViewById(R.id.editTextTitulo);
        editTextFecha = (EditText) findViewById(R.id.editTextFecha);
        editTextHora = (EditText) findViewById(R.id.editTextHora);
    }

    public void crearCitas(View view) {
        AlarmaAppOpenHelper alarmaAppOpenHelper = new AlarmaAppOpenHelper(getApplicationContext());
        SQLiteDatabase db = alarmaAppOpenHelper.getWritableDatabase();


        ContentValues contentValues = new ContentValues();
        contentValues.put(AlarmaAppContract.TablaCita.COLUMNA_TITULO_CITA, editTextTitulo.getText().toString());
        contentValues.put(AlarmaAppContract.TablaCita.COLUMNA_FECHA_CITA, editTextFecha.getText().toString());
        contentValues.put(AlarmaAppContract.TablaCita.COLUMNA_HORA_CITA, editTextHora.getText().toString());

        db.insert(AlarmaAppContract.TablaCita.NOMBRE_TABLA, null, contentValues);
        db.close();
        Toast.makeText(this, "datos almacenados", Toast.LENGTH_SHORT).show();
    }
}
