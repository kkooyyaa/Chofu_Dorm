package kkooyyaa.io;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class emergency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
    }

    public void callManagement (View v) {
        Uri uri = Uri.parse("tel:07014459818");
        Intent intentCaMa = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intentCaMa);
    }

    public void callOfiice (View v) {
        Uri uri = Uri.parse("tel:0426772060");
        Intent intentCaOf = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intentCaOf);
    }

    public void callPolice (View v) {
        Uri uri = Uri.parse("tel:110");
        Intent intentCaPo = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intentCaPo);
    }
    public void callAmbulance (View v) {
        Uri uri = Uri.parse("tel:119");
        Intent intentCaAm = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intentCaAm);
    }

}


