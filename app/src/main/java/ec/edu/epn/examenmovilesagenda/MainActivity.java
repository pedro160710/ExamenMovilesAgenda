package ec.edu.epn.examenmovilesagenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonCrearCitas;
    private Button buttonConsultadasCitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonConsultadasCitas = (Button) findViewById(R.id.btnConsultar);
        buttonCrearCitas = (Button) findViewById(R.id.btnCrear);
    }


    public void crearCitas() {
        Intent intentCrearCita = new Intent(this, CrearCitas.class);
        startActivity(intentCrearCita);

    }


    public void consultadasCitas() {
        Intent intentConsultar = new Intent(this, ConsultadasCitas.class);
        startActivity(intentConsultar);
    }
//    
}
