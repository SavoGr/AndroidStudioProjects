package com.example.savoo.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Pocetna extends AppCompatActivity {
    Button btnBaciKocku ;
    ImageView iwKocka ;
    int ranBroj;
    final int[] nizKocki = {R.drawable.kocka1,R.drawable.kocka2,R.drawable.kocka3,R.drawable.kocka4,
            R.drawable.kocka5,R.drawable.kocka6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocetna);
        btnBaciKocku = (Button)findViewById(R.id.Dugme);
        iwKocka = (ImageView)findViewById(R.id.iwKocka);
        btnBaciKocku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                baciKocku();
            }
        });
    }






    private  void baciKocku(){
        Random r = new Random();
        ranBroj = r.nextInt(6);
        iwKocka.setImageResource(nizKocki[ranBroj]);

    }
}
