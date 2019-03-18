package com.example.pratikum.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.pratikum.R;

public class MenuFragment extends Fragment {

    Fragment frag;
    FragmentTransaction fragTransaction;

    public MenuFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_fragment, container, false);

        frag = new KoalaFragment();
        fragTransaction = getFragmentManager().beginTransaction().add(R.id.container, frag);
        fragTransaction.commit();
        Button btnkoala = view.findViewById(R.id.btnkoala);
        Button btnpenguin = view.findViewById(R.id.btnpenguin);
        Button btntulip = view.findViewById(R.id.btntulip);

        btnkoala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new KoalaFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTransaction.commit();

            }
        });

        btnpenguin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new PenguinFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTransaction.commit();


            }
        });
        btntulip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new TulipFragment();
                fragTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragTransaction.commit();
            }
        });
        return view;
    }


}




