package com.example.michael.palindromchecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //Projekt ist fertig implementiert und funktioniert -> Bitte Danke ich haben fertig XD.


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
                //Bedingungen fuer die Eingaben
                if(palindrom.length()< 5){
                    String tooShort = "Wort muss mindestens 5 Buchstaben haben";
                    output.setText(tooShort);
                }else if(palindrom == null){
                    String noinput = "Sie haben nichts eingeben, bitte geben sie eine Wort ein";
                    output.setText(noinput);
                }else if(is_Palindrom(palindrom) == true){
                    String ispali = "Word is a palindrom";
                    output.setText(ispali);
                }else if(is_Palindrom(palindrom) == false){
                    String isnot = "Word is not a palindrom";
                    output.setText(isnot);
                }
            }
        });

    }

    //Checkt ob die Eingabe ein Palindrom ist
    public boolean is_Palindrom(String palindrom){

        boolean checker = true;
        String formated = palindrom.toLowerCase();
        char[] arr = new char[palindrom.length()];
        arr = formated.toCharArray();

        for(int i = 0;i<arr.length/2;i++){
            if(arr[i] != arr[arr.length-1-i]){
                checker = false;
            }
        }
        return checker;
    }
}
