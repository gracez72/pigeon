package com.mark1.mark1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Homepage extends AppCompatActivity {
    private CardView directions;
    private CardView webcrawler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        directions = (CardView) findViewById(R.id.card_directions);
        webcrawler = (CardView) findViewById(R.id.card_webcrawler);

        webcrawler.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCrawler();
            }
        });

        directions.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openDirections();
            }
        });


    }

    private void openDirections(){
        Intent intent = new Intent(this,Directions.class);
        startActivity(intent);
    }

    private void openCrawler(){
        Intent intent = new Intent(this, WebCrawler_nav.class);
        startActivity(intent);
    }
}
