package com.android.medicare.ui.blood;

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

public class BloodFragment extends Fragment {

    private BloodViewModel bloodViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bloodViewModel =
                ViewModelProviders.of(this).get(BloodViewModel.class);
        View root = inflater.inflate(R.layout.fragment_blood, container, false);
        final TextView textView = root.findViewById(R.id.text_blood);
        bloodViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}