package com.rujira.androiddatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.rujira.androiddatabinding.model.User;
import com.rujira.androiddatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User defaultUser = new User();
        defaultUser.setFirstName("Rujira");
        defaultUser.setLastName("Kongsomran");
        binding.setUser(defaultUser);
    }
}
