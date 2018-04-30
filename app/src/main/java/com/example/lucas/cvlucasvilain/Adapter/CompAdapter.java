package com.example.lucas.cvlucasvilain.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lucas.cvlucasvilain.Entity.Competence;
import com.example.lucas.cvlucasvilain.R;

import java.util.ArrayList;

/**
 * Created by Lucas on 17/04/2018.
 */

public class CompAdapter extends BaseAdapter {

    private Activity context;
    public ArrayList<Competence> competences = new ArrayList<Competence> ();

    public CompAdapter(Activity context, ArrayList<Competence> competences) {
        this.context = context;
        this.competences = competences;
    }

    @Override
    public int getCount() {
        return this.competences.size();
    }

    @Override
    public Object getItem(int position) {
        return this.competences.get( position );
    }

    @Override
    public long getItemId(int position) {
        return this.competences.get( position ).hashCode();
    }



    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {


        LayoutInflater inflater = (LayoutInflater)context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View rowView = inflater.inflate( R.layout.comp_item,null );
        TextView textView = (TextView) rowView.findViewById(R.id.CompName);
        textView.setText( this.competences.get( position ).toString());





        ImageView imageViewComp = (ImageView) rowView.findViewById( R.id.ImageComp);

         imageViewComp.setImageResource(context.getResources().getIdentifier( this.competences.get( position ).getImageComp(), "drawable", context.getPackageName() ));


             for (int e =  1 ;e<=this.competences.get(position).getNiv(); e++){

                 ImageView imageViewStar= (ImageView) rowView.findViewById( context.getResources().getIdentifier("compStar"+e,"id",context.getPackageName()) );
                 imageViewStar.setImageResource(context.getResources().getIdentifier( "@android:drawable/btn_star_big_on", "drawable", context.getPackageName() ));

             }





        return rowView;
    }
}
