package com.example.savoo.pianodoremi;

import android.media.SoundPool;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.media.AudioManager;

public class Pocetna extends AppCompatActivity {

    private int idDo,idRe,idMi,idFa,idSol,idLa,idSi,idDo2;
    private SoundPool melodije;
    //konstantne vrednost
    private  final int BROJ_MELODIJA = 7;
    private final float leftVol = 1.0f;
    private final float rightVol = 1.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocetna);
        //pravljenje konstruktora za soundPool


        melodije = new SoundPool(BROJ_MELODIJA,AudioManager.STREAM_MUSIC,0);
        idDo2 =melodije.load(getApplicationContext(),R.raw.do2,1);
        idDo = melodije.load(getApplicationContext(),R.raw.do1,1);
        idRe =  melodije.load(getApplicationContext(),R.raw.re,1);
        idMi = melodije.load(getApplicationContext(),R.raw.mi,1);
        idFa = melodije.load(getApplicationContext(),R.raw.fa,1);
        idSol = melodije.load(getApplicationContext(),R.raw.sol,1);
        idLa = melodije.load(getApplicationContext(),R.raw.la,1);
        idSi = melodije.load(getApplicationContext(),R.raw.si,1);


    }


    public void playDo(View v){
        melodije.play(idDo,leftVol,rightVol,0,0,1.0f);
    }
    public void playRe(View v){
        melodije.play(idRe,leftVol,rightVol,0,0,1.0f);
    }
    public void playMi(View v){
        melodije.play(idMi,leftVol,rightVol,0,0,1.0f);
    }
    public void playFa(View v){
        melodije.play(idFa,leftVol,rightVol,0,0,1.0f);
    }
    public void playSol(View v){
        melodije.play(idSol,leftVol,rightVol,0,0,1.0f);
    }
    public void playLa(View v){
        melodije.play(idLa,leftVol,rightVol,0,0,1.0f);
    }
    public void playSi(View v){
        melodije.play(idSi,leftVol,rightVol,0,0,1.0f);
    }
    public void playDo2(View v){
        melodije.play(idDo2,leftVol,rightVol,0,0,1.0f);
    }

}
