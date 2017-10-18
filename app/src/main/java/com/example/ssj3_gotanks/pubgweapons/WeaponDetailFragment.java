package com.example.ssj3_gotanks.pubgweapons;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.

 */
public class WeaponDetailFragment extends Fragment {
    private long weaponid;
    static String [] gun;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_weapon_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();

        if (view != null) {
            Weapon weapon = Weapon.WEAPONs[(int) weaponid];
            Resources resource = getResources();
            TextView testSwitch = (TextView) view.findViewById(R.id.testSwitch);

            switch (weapon.getName()){
                case "M16A4":{

                }
                case "AKM":{

                }


            }

        }
    }

    public void setWeapon(long id) {
        this.weaponid = id;
    }

}
