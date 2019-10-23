package com.example.databinding.handlers;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.model.User;

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
