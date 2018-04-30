package com.example.lucas.cvlucasvilain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lucas.cvlucasvilain.Activity.CompetenceActivity;
import com.example.lucas.cvlucasvilain.Activity.ExperienceActivity;
import com.example.lucas.cvlucasvilain.Activity.FormationActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button comp,form,exp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//test
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        //on declare les buttons
        comp = (Button) findViewById( R.id.idCompetence );
        //on ajout au onClick
        comp.setOnClickListener( this );
        form = (Button) findViewById( R.id.idFormation );
        form.setOnClickListener( this );
        exp = (Button) findViewById( R.id.idExperiences );
        exp.setOnClickListener( this );


    }

    @Override
    public void onClick(View v) {
        if (v.equals( comp )){
            Intent intent = new Intent( getApplicationContext(),CompetenceActivity.class );
            startActivity(intent);
        }
        if (v.equals( form )){
            Intent intent = new Intent( getApplicationContext(),FormationActivity.class );
            startActivity(intent);
        }

        if (v.equals( exp )){
            Intent intent = new Intent( getApplicationContext(),ExperienceActivity.class );
            startActivity(intent);
        }
    }
}
