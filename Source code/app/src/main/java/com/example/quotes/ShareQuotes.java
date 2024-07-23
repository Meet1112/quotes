package com.example.quotes;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ShareQuotes extends AppCompatActivity {

    TextView t1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_quotes);
        t1 = (TextView) findViewById(R.id.txt_share_qut);
        Intent i = getIntent();
        t1.setText(i.getStringExtra("qut"));

    }

    public void btn_click(View view) {
        btn = (Button) findViewById(view.getId());
        ClipData clipData = ClipData.newPlainText("source text", t1.getText().toString());
        ClipboardManager cm = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        cm.setPrimaryClip(clipData);
        Toast.makeText(this, "Text Copied...", Toast.LENGTH_SHORT).show();
    }

    public void btn_share(View view) {
        btn = (Button) findViewById(view.getId());
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, t1.getText().toString());
        intent.setType("text/plain");
        startActivity(intent);
    }
}
