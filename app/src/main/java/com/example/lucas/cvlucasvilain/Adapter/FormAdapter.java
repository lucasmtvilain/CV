package com.example.lucas.cvlucasvilain.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.lucas.cvlucasvilain.Entity.Formation;
import com.example.lucas.cvlucasvilain.R;

import java.util.ArrayList;

/**
 * Created by Lucas on 17/04/2018.
 */

public class FormAdapter extends BaseAdapter {

    private Activity context;
    public ArrayList<Formation> formations = new ArrayList<Formation>(  );

    public FormAdapter(Activity context, ArrayList<Formation> formations) {
        this.context = context;
        this.formations = formations;
    }

    @Override
    public int getCount() {
        return this.formations.size();
    }

    @Override
    public Object getItem(int position) {
        return this.formations.get( position );
    }

    @Override
    public long getItemId(int position) {
        return this.formations.get( position ).hashCode();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View rowView = inflater.inflate( R.layout.form_item,null );

        TextView textView = (TextView) rowView.findViewById(R.id.FormName);
        textView.setText( this.formations.get( position ).getNom());

        TextView textViewFormAnnee = (TextView) rowView.findViewById(R.id.FormAnnee);
        textViewFormAnnee.setText( this.formations.get( position ).getAnnee());

        TextView textViewformDesc = (TextView) rowView.findViewById(R.id.formDesc);
        textViewformDesc.setText( this.formations.get( position ).getDescription());


        TextView textViewformTech = (TextView) rowView.findViewById(R.id.formLieux);
        textViewformTech.setText( this.formations.get( position ).getLieux());

        return rowView;
    }
}
