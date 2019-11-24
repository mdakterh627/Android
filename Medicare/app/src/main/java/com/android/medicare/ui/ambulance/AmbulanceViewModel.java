package com.android.medicare.ui.ambulance;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AmbulanceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AmbulanceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Ambulance fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}