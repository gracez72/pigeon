package com.mark1.mark1;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Directions extends AppCompatActivity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions);
        myDialog = new Dialog(this);
    }

    public void ShowPopup(View v) {
        TextView txtclose;
        Button seeMore;
        myDialog.setContentView(R.layout.custompopup);
        txtclose = (TextView) myDialog.findViewById(R.id.exit);
        txtclose.setText("X");
        seeMore = (Button) myDialog.findViewById(R.id.seemore);
        seeMore.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openInfo();
            }
        });
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();


    }

    private void openInfo(){
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
}
