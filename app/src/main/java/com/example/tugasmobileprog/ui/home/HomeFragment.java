package com.example.tugasmobileprog.ui.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.tugasmobileprog.R;
import com.example.tugasmobileprog.ui.calculator.CalculatorActivity;
import com.example.tugasmobileprog.ui.sms.SmsActivity;

import java.math.BigDecimal;

public class HomeFragment extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btnTugas2 = getView().findViewById(R.id.btnTugas2);
        btnTugas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), CalculatorActivity.class));
            }
        });

        Button btnTugas3 = getView().findViewById(R.id.btnTugas3);
        btnTugas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SmsActivity.class));
            }
        });
    }
}