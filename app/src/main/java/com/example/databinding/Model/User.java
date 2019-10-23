package com.example.databinding.model;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.library.baseAdapters.BR;

public class User extends BaseObservable {
    private static final String TAG = "User";

    private  String name;
    private String email;

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    private String profileImage;


    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
@Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @BindingAdapter({"android:profileImage"})
    public static  void loadImage(ImageView view , String imageUrl)
    {
        Glide.with(view.getContext())
                .load("https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwiZz4Hs2bLlAhXJXCsKHZG5CA8QjRx6BAgBEAQ&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fbeauty%2F&psig=AOvVaw2WvJPZWqtv4D9IestS8pxB&ust=1571931095635511")
                .into(view);
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
