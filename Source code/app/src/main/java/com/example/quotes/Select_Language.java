package com.example.quotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Select_Language extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_language);
    }

    public void btn_click(View view) {
        Button btn=(Button)findViewById(view.getId());
        if(btn.getText().equals("E N G L I S H"))
        {
            Intent english=new Intent(getApplicationContext(),MainActivity.class);
            english.putExtra("language",btn.getText());
            startActivity(english);
            Toast.makeText(this, "Your Selected Language is : "+btn.getText(), Toast.LENGTH_SHORT).show();
        }
        else if (btn.getText().equals("H I N D I")){
            Intent hindi=new Intent(getApplicationContext(),MainActivity.class);
            hindi.putExtra("language",btn.getText());
            startActivity(hindi);
            Toast.makeText(this, "Your Selected Language is : "+btn.getText(), Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent gujarati=new Intent(getApplicationContext(),MainActivity.class);
            gujarati.putExtra("language",btn.getText());
            startActivity(gujarati);
            Toast.makeText(this, "Your Selected Language is : "+btn.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
