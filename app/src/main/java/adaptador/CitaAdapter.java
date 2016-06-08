package adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

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
        view=inflador.inflate(android.R.layout.)
    }

        return view;
}

}
