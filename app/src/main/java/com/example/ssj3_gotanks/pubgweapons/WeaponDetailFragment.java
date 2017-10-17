package com.example.ssj3_gotanks.pubgweapons;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;


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
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Weapon weapon = Weapon.WEAPONs[(int) weaponid];
            title.setText(weapon.getName());
            gun = weapon.toArray();
            TextView desc = (TextView) view.findViewById(R.id.desc);
            TextView dmg = (TextView) view.findViewById(R.id.damage);
            TextView spd = (TextView) view.findViewById(R.id.speed);
            TextView pwr = (TextView) view.findViewById(R.id.power);
            TextView mag = (TextView) view.findViewById(R.id.mag);
            TextView tbs = (TextView) view.findViewById(R.id.TBS);
            TextView mode = (TextView) view.findViewById(R.id.mode);
            TextView ammo = (TextView) view.findViewById(R.id.ammo);

            desc.append(gun[0]);
            dmg.append(gun[1]);
            spd.append(gun[2]);
            pwr.append(gun[3]);
            mag.append(gun[4]);
            tbs.append(gun[5]);
            mode.append(gun[6]);
            ammo.append(gun[7]);
        }
    }

    public void setWorkout(long id) {
        this.weaponid = id;
    }
}
