package com.example.lucas.cvlucasvilain.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.lucas.cvlucasvilain.Entity.Experience;
import com.example.lucas.cvlucasvilain.Adapter.ExperienceAdapter;
import com.example.lucas.cvlucasvilain.R;

import java.util.ArrayList;

public class ExperienceActivity extends AppCompatActivity {

    ArrayList<Experience> experiences = new ArrayList<Experience>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_experience );

        //(String periode, String nom, String poste, String contenu)

        experiences.add( new Experience( "2017-2018  |","Enedis","Développeur","Technologies: Java, Android, Php, Sql,Visual basic" ) );
        experiences.add( new Experience( "2017       |","AIG europe","Développeur","Technologies: Access, sql, visual basic" ) );
        experiences.add( new Experience( "2017       |","Woxup","Développeur","Technologies: Php, Html,Css" ) );


        ListView listView = (ListView) findViewById( R.id.List_View_exp );
        ExperienceAdapter expAdapter = new ExperienceAdapter(this,this.experiences);
        listView.setAdapter( expAdapter );

    }

}
