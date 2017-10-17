package com.example.ssj3_gotanks.pubgweapons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WeaponDetailActivity extends AppCompatActivity {
    public static final String EXTRA_WEAPON_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon_details);
        WeaponDetailFragment frag = (WeaponDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int weaponid = (int) getIntent().getExtras().get(EXTRA_WEAPON_ID);
        frag.setWorkout(weaponid);
    }
}
