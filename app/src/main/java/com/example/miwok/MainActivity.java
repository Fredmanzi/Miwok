package com.example.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//finding view that show numbers category
        TextView  numbers = (TextView) findViewById(R.id.numbers);
        //set clickListener on view
        numbers.setOnClickListener(new View.OnClickListener(){
        @Override
            public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,NumbersActivity.class);
            startActivity(intent);
        }
        });
        // find view that show family category
        TextView  family = (TextView) findViewById(R.id.family);
        //set onclick listener on this View
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(intent);
            }
        });
        //find view that show colors category
        TextView colors = (TextView) findViewById(R.id.colors);
        //set onClick Listener on this view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(intent);
            }
        });
        //find view that show phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);
        //set onclick listener on this view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(intent);
            }
        });
    }
}
