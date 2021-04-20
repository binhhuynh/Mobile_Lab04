package com.iuh.mobile_lab04;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BelowFragment extends Fragment {
    private TextView tvSubTotal;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_below, container, false);

        tvSubTotal = v.findViewById(R.id.tvTempTotal);

        return v;
    }

    public void setSubTotal(int quantity, double unitPrice) {

        tvSubTotal.setText(String.valueOf(quantity * unitPrice));
    }
}