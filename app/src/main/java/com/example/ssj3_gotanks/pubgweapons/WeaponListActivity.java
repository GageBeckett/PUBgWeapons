package com.example.ssj3_gotanks.pubgweapons;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class WeaponListActivity extends AppCompatActivity implements  WeaponListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon_list);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            WeaponDetailFragment details = new WeaponDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setWeapon(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }else {
            Intent intent = new Intent(this, WeaponDetailActivity.class);
            intent.putExtra(WeaponDetailActivity.EXTRA_WEAPON_ID, (int) id);
            startActivity(intent);
        }
    }

}
