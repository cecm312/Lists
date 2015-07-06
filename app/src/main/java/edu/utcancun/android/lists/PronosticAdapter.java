package edu.utcancun.android.lists;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by carloschan on 05/07/15.
 */
public class PronosticAdapter extends ArrayAdapter<Pronostic> {


    public PronosticAdapter(Context context,  List<Pronostic> pronostics) {
        super(context, 0, pronostics);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Pronostic pronostic=getItem(position);
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_item_forecast,parent,false);
        }
        TextView pronosticDay=(TextView) convertView.findViewById(R.id.textView_day);
        TextView pronosticStatus=(TextView)convertView.findViewById(R.id.textView_status);
        TextView pronosticTemperatures=(TextView) convertView.findViewById(R.id.textView_temperatures);
        ImageView pronosticIcon=(ImageView) convertView.findViewById(R.id.imageView_icon);
        pronosticDay.setText(pronostic.getDay());
        pronosticStatus.setText(pronostic.getStatus());
        pronosticTemperatures.setText(pronostic.getTemperatures());
        pronosticIcon.setImageResource(pronostic.getIcon());
        return convertView;
    }
}
