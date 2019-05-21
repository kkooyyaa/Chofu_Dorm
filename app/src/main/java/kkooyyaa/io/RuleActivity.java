package kkooyyaa.io;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class RuleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule);
    }
    public void RuleLounge(View v) {
        Intent intentLo = new Intent(this, LoungeRule.class);
        startActivity(intentLo);
    }

    public void laundry(View v){
        Intent intentLa = new Intent(this, Laundry.class);
        startActivity(intentLa);
    }


    public void Kitchen(View v){
        Intent intentKi = new Intent(this, Kitchen.class);
        startActivity(intentKi);
    }

    public void Unit(View v) {
        Intent intentUn = new Intent(this, Unit.class);
        startActivity(intentUn);
    }



}
