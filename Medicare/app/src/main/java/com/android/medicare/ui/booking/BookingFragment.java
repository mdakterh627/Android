package com.android.medicare.ui.booking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.android.medicare.R;
import com.android.medicare.model.Booking;
import com.android.medicare.rest.APIClient;
import com.android.medicare.rest.APIInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookingFragment extends Fragment {
    EditText name, age, phone, date;
    Button reset;
    Button save;
    APIInterface apiInterface;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_booking, container, false);

        insertBooking(root);
        return root;
    }

    private void insertBooking(View root) {
        name = root.findViewById(R.id.Name);
        age = root.findViewById(R.id.Age);
        phone = root.findViewById(R.id.phone);
        date = root.findViewById(R.id.date);
        reset = root.findViewById(R.id.btnReset);
        save = root.findViewById(R.id.btnSave);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // set text ""
                name.setText("");
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apiInterface = APIClient.getClient().create(APIInterface.class);
                Booking booking=new Booking();
                booking.setName(name.getText().toString());
                booking.setAge(age.getText().toString());
                booking.setPhone(phone.getText().toString());
                booking.setDate(date.getText().toString());
                Call<Booking> bookingCall=apiInterface.insertBooking(booking);
                bookingCall.enqueue(new Callback<Booking>() {
                    @Override
                    public void onResponse(Call<Booking> call, Response<Booking> response) {
                        Toast.makeText(getContext(), "Successfully inserted id- "+response.body().getId(), Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onFailure(Call<Booking> call, Throwable t) {

                    }
                });
            }
        });

    }
}