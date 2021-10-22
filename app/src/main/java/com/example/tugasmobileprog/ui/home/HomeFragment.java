package com.example.tugasmobileprog.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tugasmobileprog.R;
import com.maltaisn.calcdialog.CalcDialog;

import java.math.BigDecimal;

public class HomeFragment extends Fragment implements CalcDialog.CalcDialogCallback{
//    private FragmentHomeBinding
    private BigDecimal value = null;

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

        final CalcDialog calcDialog = new CalcDialog();

//         Open dialog button
        Button btn = getView().findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcDialog.getSettings().setInitialValue(value);
                calcDialog.show(getChildFragmentManager(), "calc_dialog");
            }
        });
    }

    @Override
    public void onValueEntered(int requestCode, @Nullable BigDecimal value) {

    }
}