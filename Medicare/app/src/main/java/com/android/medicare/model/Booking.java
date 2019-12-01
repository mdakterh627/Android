package com.android.medicare.model;

import com.google.gson.annotations.SerializedName;

public class Booking {
    @SerializedName("id")
    private  int id;


    @SerializedName("name")
    private String name;
    @SerializedName("age")
    private String age;
    @SerializedName("phone")
    private String phone;
    @SerializedName("date")
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
