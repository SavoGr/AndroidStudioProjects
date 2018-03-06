package com.example.savoo.textmultiplier;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Pocetna extends AppCompatActivity {
    EditText tekst, broj, ispis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocetna);
        tekst = (EditText)findViewById(R.id.etTekst);
        broj = (EditText)findViewById(R.id.etNumber);
        ispis = (EditText)findViewById(R.id.etIspis);
    }



    public void pomnoziIispisi(View v){
        String unos = tekst.getText().toString();
        String izlaz = "";
        int num = Integer.parseInt(broj.getText().toString());
        for (int i = 0;i<num;i++){
            izlaz+=unos;
        }
        ispis.setText(izlaz);



    }
    public void kopirajUklip(View v){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("kopiraniTekst",ispis.getText());
        clipboard.setPrimaryClip(clip);
         Toast.makeText(getApplicationContext(),"Text copied",Toast.LENGTH_SHORT).show();

    }
}
