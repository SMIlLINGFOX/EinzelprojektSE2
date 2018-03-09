package com.example.michael.palindromchecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //Das Projekt ist noch leer und bis auf das Layout wurde boch nichts gemacht.
    //Ich kann nicht mehr als Hundert Files hochladen , deshalb werden hier nur die wichtigsten files Hochgeladen


    TextView output;
    EditText eingabefeld;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Setzen der Variablen und Testen ob String dargestellt wird
        output = (TextView)findViewById(R.id.output);
        eingabefeld = (EditText)findViewById(R.id.eingabefeld);

        Button checkButton = (Button)findViewById(R.id.check);
        checkButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String palindrom = eingabefeld.getText().toString();
                output.setText(palindrom);
            }
        });

    }
}
