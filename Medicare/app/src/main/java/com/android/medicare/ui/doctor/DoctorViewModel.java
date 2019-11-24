package com.android.medicare.ui.doctor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DoctorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DoctorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Doctor fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}