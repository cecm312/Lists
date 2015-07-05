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

        String [] values={
                "Lunes - Soleado 30/25",
                "Martes - Soleado 30/25",
                "Miercoles - Soleado 30/25",
                "Jueves - Soleado 30/25",
                "Viernes - Soleado 30/25",
                "Sabado - Soleado 30/25",
                "Domingo - Soleado 30/25",
        };
        List<String> list=new ArrayList<String>(Arrays.asList(values));
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textView,
                list
        );
        ListView listView= (ListView) rootView.findViewById(R.id.list_item_forecast);
        listView.setAdapter(adapter);
        return rootView;
    }
}
