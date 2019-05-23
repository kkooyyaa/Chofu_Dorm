package kkooyyaa.io;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;


public class Getpush extends AppCompatActivity {

    String message ="why?";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getpush);

        //Intent intentget = getIntent();
        //message =  intentget.getStringExtra("text");
        //Log.d("DEBUGGG", message);
       // Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        Intent intent = this.getIntent();
        String text = intent.getStringExtra("text");
        TextView textView = (TextView)this.findViewById(R.id.textView37);
        textView.setText(text);


    }
}
