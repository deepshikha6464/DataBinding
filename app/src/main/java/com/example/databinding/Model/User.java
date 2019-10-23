package com.example.databinding.Model;

public class User {
    String mName,mEmail;

    @Override
    public String toString() {
        return "User{" +
                "mName='" + mName + '\'' +
                ", mEmail='" + mEmail + '\'' +
                '}';
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public User() {
    }

    public User(String mName, String mEmail) {
        this.mName = mName;
        this.mEmail = mEmail;
    }
}
