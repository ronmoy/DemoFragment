package com.myapplicationdev.android.demofragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FragmentFirst extends Fragment {
    Button b1;
    TextView tv1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        tv1 = view.findViewById(R.id.tvFrag1);
        b1 = view.findViewById(R.id.btnAddTextFrag1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = tv1.getText().toString() + "\nNew Data";
                tv1.setText(data);
            }
        });
        return view;
    }
}
