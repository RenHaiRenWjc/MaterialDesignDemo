package com.zero.materialdesign.nestedscroll.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.materialdesigndemo.R;
import com.example.materialdesigndemo.databinding.ActivityNestScrollBinding;
import com.example.materialdesigndemo.databinding.ActivityTabBinding;

public class NestScrollActivity extends AppCompatActivity {

    private ActivityNestScrollBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNestScrollBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}