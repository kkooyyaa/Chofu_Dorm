package kkooyyaa.io;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FirebaseInstanceId.getInstance().getInstanceId();
    }
    
    public void how(View v){
        Intent intentHo = new Intent(this, RuleActivity.class);
        startActivity(intentHo);
    }

    public void emergency(View v){
        Intent intentEm = new Intent(this, emergency.class);
        startActivity(intentEm);
    }

    public void wifi(View v){
        Intent intentEm = new Intent(this, emergency.class);
        startActivity(intentEm);
    }
}
