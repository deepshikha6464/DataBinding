package com.example.databinding.handlers;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.MainActivity;
import com.example.databinding.R;
import com.example.databinding.databinding.ActivityMainBinding;
import com.example.databinding.model.User;

import androidx.databinding.DataBindingUtil;

public class ClickListener {

    private static final String TAG = "ClickListener";
    Context context;

    public ClickListener(Context context) {
        this.context = context;
    }

    public ClickListener() {
    }

    public void onFABClick(View view)
    {
        Log.d(TAG, "onFABClick: ");
        ActivityMainBinding binding = DataBindingUtil.setContentView((Activity) view.getContext(), R.layout.activity_main);
        User user = new User("observable", "qwert@123.com");
        binding.setUser(user);

        Toast.makeText(view.getContext(),"FAB clicked", Toast.LENGTH_SHORT).show();
    }

    public void onButtonClick(View view)
    {
        Toast.makeText(view.getContext(),"button clicked", Toast.LENGTH_SHORT).show();
    }

    public void buttonClickWithParam(View view,User user)
    {
        Toast.makeText(view.getContext(),"Button with parameter clicked "+user.getName(), Toast.LENGTH_SHORT).show();
    }
    public boolean buttonLongPress(View view)
    {
        Toast.makeText(view.getContext(),"button long pressed", Toast.LENGTH_SHORT).show();
        return false;
    }

}
