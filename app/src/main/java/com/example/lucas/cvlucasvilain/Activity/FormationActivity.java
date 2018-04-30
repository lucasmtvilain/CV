package com.example.lucas.cvlucasvilain.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.lucas.cvlucasvilain.Entity.Formation;
import com.example.lucas.cvlucasvilain.Adapter.FormAdapter;
import com.example.lucas.cvlucasvilain.R;

import java.util.ArrayList;

public class FormationActivity extends AppCompatActivity {

    ArrayList<Formation> formations = new ArrayList<Formation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_formation );


        formations.add( new Formation( "BAC Scientifique","2012-2015  |","BAC","baccalauréat scientifique option svt","Lycée Talma de Brunoy" ) );

        formations.add( new Formation( "BTS SIO","2015-2017  |","BTS","BTS service aux organizations options développement","CFA INSTA" ) );

        formations.add( new Formation( "Annalyste Logiciel","2017-2018  |","BAC + 3 ","RNCP niv II(BAC+3)"," CFA INSTA " ) );

        ListView listView = (ListView) findViewById( R.id.List_View_formation );
        FormAdapter formAdapter = new FormAdapter(this,this.formations);
        listView.setAdapter( formAdapter );

    }

}
