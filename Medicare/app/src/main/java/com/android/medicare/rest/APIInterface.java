package com.android.medicare.rest;

import com.android.medicare.model.Booking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterface {

    @GET("/MyProject/booking")
    Call<List<Booking>> getBookings();
    @POST("/MyProject/saveBooking/")
    Call<Booking> insertBooking(@Body Booking b);

}
