package com.example.ssj3_gotanks.pubgweapons;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    public static final String EXTRA_CLASS = "com.example.ssj3_gotanks.pubgweapons";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void arClick(View view){
        Intent intent = new Intent(this, WeaponListActivity.class);
        Button button = (Button) findViewById(R.id.button);
        String weaponsClass = button.getText().toString();
        intent.putExtra(EXTRA_CLASS, weaponsClass);
        startActivity(intent);
    }
    
}
