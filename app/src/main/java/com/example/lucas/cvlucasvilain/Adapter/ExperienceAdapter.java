package com.example.lucas.cvlucasvilain.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.lucas.cvlucasvilain.Entity.Experience;
import com.example.lucas.cvlucasvilain.R;

import java.util.ArrayList;

/**
 * Created by Lucas on 17/04/2018.
 */

public class ExperienceAdapter extends BaseAdapter {

    private Activity context;
    public ArrayList<Experience> experiences = new ArrayList<>();

    public ExperienceAdapter(Activity content, ArrayList<Experience> experiences) {
        this.context = content;
        this.experiences = experiences;
    }

    @Override
    public int getCount() {
        return this.experiences.size();
    }

    @Override
    public Object getItem(int i) {
        return this.experiences.get( i );
    }

    @Override
    public long getItemId(int i) {
        return this.experiences.get( i ).hashCode();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View rowView = inflater.inflate( R.layout.exp_item,null );

        TextView textView = (TextView) rowView.findViewById(R.id.ExpName);
        textView.setText( this.experiences.get( position ).getNom());

        TextView textViewPo = (TextView) rowView.findViewById(R.id.formPost);
        textViewPo.setText( this.experiences.get( position ).getPoste());

        TextView textViewP = (TextView) rowView.findViewById(R.id.ExpAnnee);
        textViewP.setText( this.experiences.get( position ).getPeriode());

        TextView textViewD = (TextView) rowView.findViewById(R.id.ExpDesc);
        textViewD.setText( this.experiences.get( position ).getContenu());


        return rowView;
    }
}
