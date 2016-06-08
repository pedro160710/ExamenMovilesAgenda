package ec.edu.epn.examenmovilesagenda.sqlite;

import android.provider.BaseColumns;

/**
 * Created by Christian on 7/6/2016.
 */
/*tabla cita*/
public class AlarmaAppContract {
    public static abstract class TablaCita implements BaseColumns {
        public static final String NOMBRE_TABLA="CITA";
        public static final String COLUMNA_TITULO_CITA="\tTITULO_CITA";
        public static final String COLUMNA_FECHA_CITA="\tFECHA_CITA";
        public static final String COLUMNA_HORA_CITA="\tHORA_CITA";

    }
//parametros para ingreso
    public static final String TEXT_TYPE="\tTEXT";
    private static final String COMA_SEPARADOR=",";

    public static final String CREAR_TABLA_CITA ="CREATE TABLE\t"+TablaCita.NOMBRE_TABLA
            +"("+TablaCita._ID+" "+"INTEGER PRIMARY KEY AUTOINCREMENT,"+
            TablaCita.COLUMNA_TITULO_CITA+TEXT_TYPE+COMA_SEPARADOR+
            TablaCita.COLUMNA_FECHA_CITA+TEXT_TYPE+COMA_SEPARADOR+
            TablaCita.COLUMNA_HORA_CITA+TEXT_TYPE+")";
    public static final String ELIMINA_TABLA_CITA = "DROP TABLE IF EXISTS " + TablaCita.NOMBRE_TABLA;
}
