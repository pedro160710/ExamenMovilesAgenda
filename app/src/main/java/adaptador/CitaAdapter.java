package adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import ec.edu.epn.examenmovilesagenda.R;

import java.util.List;

import vo.CitaVO;

/**
 * Created by Christian on 7/6/2016.
 */
public class CitaAdapter extends ArrayAdapter {
    private List<CitaVO> listadoCita;

    public CitaAdapter(Context context, List<CitaVO> objects ) {

        super(context,0, objects);
        listadoCita=objects;
    }
@Override
    public View getView (int posicion, View view , ViewGroup padre){
    if(view == null)
    {
        LayoutInflater inflador = LayoutInflater.from(getContext());
        view = inflador.inflate(R.layout.activity_consultadas_citas,null);

    }
    TextView titulo =(TextView)view.findViewById(R.id.lblTitulo);
    TextView fecha =(TextView)view.findViewById(R.id.lblFecha);
    TextView hora =(TextView)view.findViewById(R.id.lblHora);
    CitaVO cita = listadoCita.get(posicion);
    titulo.setText(cita.getTituloCita());
    fecha.setText(cita.getFechaCIta());
    hora.setText(cita.getHoraCita());


    return view;
}

}
