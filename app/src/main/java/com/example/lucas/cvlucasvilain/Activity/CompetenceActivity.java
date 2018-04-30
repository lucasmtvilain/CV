package com.example.lucas.cvlucasvilain.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.lucas.cvlucasvilain.Adapter.CompAdapter;
import com.example.lucas.cvlucasvilain.Entity.Competence;
import com.example.lucas.cvlucasvilain.R;

import java.util.ArrayList;

public class CompetenceActivity extends AppCompatActivity implements  AdapterView.OnItemClickListener {

    ArrayList<Competence> competences = new ArrayList<Competence>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_competence );

        competences.add( new Competence( "PHP","php",4 ) );
        competences.add( new Competence( "HTML","html",4 ) );
        competences.add( new Competence( "Android","android",4 ) );
        competences.add( new Competence( "C","c",3 ) );
        competences.add( new Competence( "Python","python",2 ) );
        competences.add( new Competence( "Symfony 4","symfony",1 ) );
        competences.add( new Competence( "MySQL","mysql",4 ) );
        competences.add( new Competence( "Java","java",3 ) );
        competences.add( new Competence( "C#","csharp",3 ) );

        ListView listView = (ListView) findViewById( R.id.List_View_comp );
        CompAdapter compAdapter = new CompAdapter(this,this.competences);
        listView.setAdapter( compAdapter );
        listView.setOnItemClickListener(this );


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
