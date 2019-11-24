package com.android.medicare.ui.blood;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BloodViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BloodViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Blood fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}