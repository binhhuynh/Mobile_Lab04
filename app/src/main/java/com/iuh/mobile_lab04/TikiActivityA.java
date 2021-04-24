package com.iuh.mobile_lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TikiActivityA extends AppCompatActivity implements AboveFragment.Listener{
    private BelowFragment belowFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiki_a);

        belowFragment = (BelowFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_below);
    }

    @Override
    public void onSendData(int quantity, double price) {
        TextView tvOrderTotal = findViewById(R.id.tvOrderTotal);
        tvOrderTotal.setText(String.valueOf(quantity * price));
        belowFragment.setSubTotal(quantity, price);
    }
}