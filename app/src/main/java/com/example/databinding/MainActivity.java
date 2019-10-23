package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;


import com.example.databinding.databinding.ActivityMainBinding;
import com.example.databinding.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);
        //inflate  layout with databinding class
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //setting data
       // User user = new User("deepshikha", "deeps12@asdf.com");
        User user = new User();
        user.setName("deepshikha");
        user.setEmail("deepshikha6464@gmail.com");
        binding.setUser(user);
    }
}
