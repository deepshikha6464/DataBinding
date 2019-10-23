package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import com.example.databinding.databinding.ActivityMainBinding;
import com.example.databinding.handlers.ClickListener;
import com.example.databinding.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);
        //inflate  layout with databinding class
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(binding.toolbar);
        //setting data

        User user = new User();
        user.setName("deepshikha");
        user.setEmail("deepshikha6464@gmail.com");
        binding.setUser(user);

       ClickListener handle = new ClickListener(this);
       binding.content.setHandle(handle);   // for all buttons i content_main
       binding.setHandle(handle);       //for FAB
    }
}
