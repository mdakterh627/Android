package com.android.medicare.ui.ambulance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.android.medicare.R;

public class AmbulanceFragment extends Fragment {

    private AmbulanceViewModel ambulanceViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ambulanceViewModel =
                ViewModelProviders.of(this).get(AmbulanceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ambulance, container, false);
        final TextView textView = root.findViewById(R.id.text_ambulance);
        ambulanceViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}