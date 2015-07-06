package edu.utcancun.android.lists;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<Pronostic> pronostics=new ArrayList<Pronostic>();
        pronostics.add(new Pronostic("Lunes","Soleado","30º/25",R.drawable.soleado));
        pronostics.add(new Pronostic("Martes","Nevando","30º/25",R.drawable.nevando));
        pronostics.add(new Pronostic("Miercoles","Nublado","30º/25",R.drawable.nublado));
        pronostics.add(new Pronostic("Jueves","Soleado","30º/25",R.drawable.soleado));
        pronostics.add(new Pronostic("Viernes","Nevando","30º/25",R.drawable.nevando));
        pronostics.add(new Pronostic("Sabado","Nublado","30º/25",R.drawable.nublado));
        pronostics.add(new Pronostic("Domingo","Soleado","30º/25",R.drawable.soleado));

        PronosticAdapter adapter=new PronosticAdapter(getActivity(),pronostics);


        ListView listView= (ListView) rootView.findViewById(R.id.list_item_forecast);
        listView.setAdapter(adapter);
        return rootView;
    }
}
