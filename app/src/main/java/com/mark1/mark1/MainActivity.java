package com.mark1.mark1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;


public class MainActivity extends AppCompatActivity {
    private CardView homepageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homepageButton = (CardView) findViewById(R.id.card);
        homepageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openHomepage();
            }
        });
    }

    public void openHomepage(){
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }

}
