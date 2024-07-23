package com.example.quotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    String[] item={"Birthday","Inspiration","Cute","Funny","Friendship","GoodMorning","Smile","Success","Angry","Sad"};
    int[] img={R.drawable.birthday,R.drawable.inspiration,R.drawable.cute,R.drawable.funny,R.drawable.friendship1,R.drawable.sunrise,R.drawable.smile,R.drawable.success,R.drawable.angry,R.drawable.sad};
    RecyclerView r1;
    String lang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent lng=getIntent();
        lang=lng.getStringExtra("language");


        //recycler view
        r1=(RecyclerView)findViewById(R.id.cat_rec_view);
        r1.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
        r1.setAdapter(new CustomAdapter(getApplicationContext(),item,img,lang));
    }
}
